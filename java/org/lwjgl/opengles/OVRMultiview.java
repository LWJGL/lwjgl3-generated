/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OVR/multiview.txt">OVR_multiview</a> extension.
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
 */
public class OVRMultiview {

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
	protected OVRMultiview() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public OVRMultiview(FunctionProvider provider) {
		FramebufferTextureMultiviewOVR = provider.getFunctionAddress("glFramebufferTextureMultiviewOVR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OVRMultiview} instance for the current context. */
	public static OVRMultiview getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OVRMultiview);
	}

	static OVRMultiview create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OVR_multiview") ) return null;

		OVRMultiview funcs = new OVRMultiview(provider);
		boolean supported = checkFunctions(
			funcs.FramebufferTextureMultiviewOVR
		);

		return GLES.checkExtension("GL_OVR_multiview", funcs, supported);
	}

	// --- [ glFramebufferTextureMultiviewOVR ] ---

	public static void glFramebufferTextureMultiviewOVR(int target, int attachment, int texture, int level, int baseViewIndex, int numViews) {
		long __functionAddress = getInstance().FramebufferTextureMultiviewOVR;
		callIIIIIIV(__functionAddress, target, attachment, texture, level, baseViewIndex, numViews);
	}

}