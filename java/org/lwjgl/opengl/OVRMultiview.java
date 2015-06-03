/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/OVR/multiview.txt">OVR_multiview</a> extension.
 * 
 * <p>The method of stereo rendering supported in OpenGL is currently achieved by rendering to the two eye buffers sequentially. This typically incurs double
 * the application and driver overhead, despite the fact that the command streams and render states are almost identical.</p>
 * 
 * <p>This extension seeks to address the inefficiency of sequential multiview rendering by adding a means to render to multiple elements of a 2D texture
 * array simultaneously. In multiview rendering, draw calls are instanced into each corresponding element of the texture array. The vertex program uses a
 * new ViewID variable to compute per-view values, typically the vertex position and view-dependent variables like reflection.</p>
 * 
 * <p>The formulation of this extension is high level in order to allow implementation freedom. On existing hardware, applications and drivers can realize
 * the benefits of a single scene traversal, even if all GPU work is fully duplicated per-view. But future support could enable simultaneous rendering via
 * multi-GPU, tile-based architectures could sort geometry into tiles for multiple views in a single pass, and the implementation could even choose to
 * interleave at the fragment level for better texture cache utilization and more coherent fragment shader branching.</p>
 * 
 * <p>The most obvious use case in this model is to support two simultaneous views: one view for each eye. However, we also anticipate a usage where two
 * views are rendered per eye, where one has a wide field of view and the other has a narrow one. The nature of wide field of view planar projection is
 * that the sample density can become unacceptably low in the view direction. By rendering two inset eye views per eye, we can get the required sample
 * density in the center of projection without wasting samples, memory, and time by oversampling in the periphery.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public final class OVRMultiview {

	/** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
	public static final int
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR       = 0x9630,
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR = 0x9632;

	/** Accepted by the {@code pname} parameter of GetIntegerv. */
	public static final int GL_MAX_VIEWS_OVR = 0x9631;

	/** Returned by CheckFramebufferStatus. */
	public static final int GL_FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR = 0x9633;

	/** Function address. */
	@JavadocExclude
	public final long FramebufferTextureMultiviewOVR;

	@JavadocExclude
	public OVRMultiview(FunctionProvider provider) {
		FramebufferTextureMultiviewOVR = provider.getFunctionAddress("glFramebufferTextureMultiviewOVR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OVRMultiview} instance for the current context. */
	public static OVRMultiview getInstance() {
		return checkFunctionality(GL.getCapabilities().__OVRMultiview);
	}

	static OVRMultiview create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OVR_multiview") ) return null;

		OVRMultiview funcs = new OVRMultiview(provider);

		boolean supported = checkFunctions(
			funcs.FramebufferTextureMultiviewOVR
		);

		return GL.checkExtension("GL_OVR_multiview", funcs, supported);
	}

	// --- [ glFramebufferTextureMultiviewOVR ] ---

	/** JNI method for {@link #glFramebufferTextureMultiviewOVR FramebufferTextureMultiviewOVR} */
	@JavadocExclude
	public static native void nglFramebufferTextureMultiviewOVR(int target, int attachment, int texture, int level, int baseViewIndex, int numViews, long __functionAddress);

	/**
	 * Operates similarly to {@link GL30#glFramebufferTextureLayer FramebufferTextureLayer}, except that {@code baseViewIndex} and {@code numViews} selects a range of texture array elements
	 * that will be targeted when rendering.
	 * 
	 * <p>The command
	 * <pre><code style="font-family: monospace">
	 * View( uint id );</code></pre>
	 * does not exist in the GL, but is used here to describe the multi-view functionality in this section. The effect of this hypothetical function is to set
	 * the value of the shader built-in input uint {@code gl_ViewID_OVR}.</p>
	 * 
	 * <p>When multi-view rendering is enabled, drawing commands have the same effect as:
	 * <pre><code style="font-family: monospace">
	 * for( int i = 0; i < numViews; i++ ) {
	 * 	FramebufferTextureLayer( target, attachment, texture, level, baseViewIndex + i );
	 * 	View( i );
	 * 	&lt;drawing-command&gt;
	 * }</code></pre>
	 * The result is that every drawing command is broadcast into every active view. The shader uses {@code gl_ViewID_OVR} to compute view dependent outputs.</p>
	 * 
	 * <p>The number of views, as specified by {@code numViews}, must be the same for all framebuffer attachments points where the value of
	 * {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE} is not {@link GL11#GL_NONE NONE} or the framebuffer is incomplete.</p>
	 * 
	 * <p>In this mode there are several restrictions:
	 * <ul>
	 * <li>in vertex shader {@code gl_Position} is the only output that can depend on {@code ViewID}</li>
	 * <li>no transform feedback</li>
	 * <li>no tessellation control or evaluation shaders</li>
	 * <li>no geometry shader</li>
	 * <li>no timer query</li>
	 * <li>occlusion query results must be between max and sum of per-view queries, inclusive</li>
	 * </ul></p>
	 * 
	 * <h3>Errors</h3>
	 * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by FramebufferTextureMultiviewOVR if target is {@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}.
	 * 
	 * <p>{@link GL11#GL_INVALID_VALUE INVALID_VALUE} is generated by FramebufferTextureMultiviewOVR if {@code numViews} is less than 1, if {@code numViews} is more than {@link #GL_MAX_VIEWS_OVR MAX_VIEWS_OVR} or if
	 * <code style="font-family: monospace">(baseViewIndex + numViews)</code> exceeds {@link GL30#GL_MAX_ARRAY_TEXTURE_LAYERS MAX_ARRAY_TEXTURE_LAYERS}.</p>
	 * 
	 * <p>{@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if a rendering command is issued and the the number of views in the current draw framebuffer is not equal to the number
	 * of views declared in the currently bound program.</p>
	 *
	 * @param target        the framebuffer target. One of:<br>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}
	 * @param attachment    the attachment point of the framebuffer. One of:<br>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, {@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}, {@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}, {@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}, {@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}, {@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}, {@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}, {@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}, {@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}, {@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}, {@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}, {@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}, {@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}, {@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}, {@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}, {@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}, {@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}, {@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}, {@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}
	 * @param texture       the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level         the mipmap level of {@code texture} to attach
	 * @param baseViewIndex the base framebuffer texture layer index
	 * @param numViews      the number of views to target when rendering
	 */
	public static void glFramebufferTextureMultiviewOVR(int target, int attachment, int texture, int level, int baseViewIndex, int numViews) {
		long __functionAddress = getInstance().FramebufferTextureMultiviewOVR;
		nglFramebufferTextureMultiviewOVR(target, attachment, texture, level, baseViewIndex, numViews, __functionAddress);
	}

}