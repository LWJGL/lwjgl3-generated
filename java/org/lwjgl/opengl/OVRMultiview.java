/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.opengl.org/registry/specs/OVR/multiview.txt">OVR_multiview</a> extension.
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
public class OVRMultiview {

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR       = 0x9630,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR = 0x9632;

    /** Accepted by the {@code pname} parameter of GetIntegerv. */
    public static final int GL_MAX_VIEWS_OVR = 0x9631;

    /** Returned by CheckFramebufferStatus. */
    public static final int GL_FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR = 0x9633;

    static { GL.initialize(); }

    protected OVRMultiview() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps) {
        return checkFunctions(
            caps.glFramebufferTextureMultiviewOVR
        );
    }

    // --- [ glFramebufferTextureMultiviewOVR ] ---

    /**
     * Operates similarly to {@link GL30#glFramebufferTextureLayer FramebufferTextureLayer}, except that {@code baseViewIndex} and {@code numViews} selects a range of texture array elements
     * that will be targeted when rendering.
     * 
     * <p>The command</p>
     * 
     * <pre><code>View( uint id );</code></pre>
     * 
     * <p>does not exist in the GL, but is used here to describe the multi-view functionality in this section. The effect of this hypothetical function is to set
     * the value of the shader built-in input uint {@code gl_ViewID_OVR}.</p>
     * 
     * <p>When multi-view rendering is enabled, drawing commands have the same effect as:</p>
     * 
     * <pre><code>for( int i = 0; i < numViews; i++ ) {
    FramebufferTextureLayer( target, attachment, texture, level, baseViewIndex + i );
    View( i );
    &lt;drawing-command&gt;
}</code></pre>
     * 
     * <p>The result is that every drawing command is broadcast into every active view. The shader uses {@code gl_ViewID_OVR} to compute view dependent outputs.</p>
     * 
     * <p>The number of views, as specified by {@code numViews}, must be the same for all framebuffer attachments points where the value of
     * {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE} is not {@link GL11#GL_NONE NONE} or the framebuffer is incomplete.</p>
     * 
     * <p>In this mode there are several restrictions:</p>
     * 
     * <ul>
     * <li>in vertex shader {@code gl_Position} is the only output that can depend on {@code ViewID}</li>
     * <li>no transform feedback</li>
     * <li>no tessellation control or evaluation shaders</li>
     * <li>no geometry shader</li>
     * <li>no timer query</li>
     * <li>occlusion query results must be between max and sum of per-view queries, inclusive</li>
     * </ul>
     * 
     * <h5>Errors</h5>
     * 
     * <p>{@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by FramebufferTextureMultiviewOVR if target is {@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}.</p>
     * 
     * <p>{@link GL11#GL_INVALID_VALUE INVALID_VALUE} is generated by FramebufferTextureMultiviewOVR if {@code numViews} is less than 1, if {@code numViews} is more than {@link #GL_MAX_VIEWS_OVR MAX_VIEWS_OVR} or if
     * <code>(baseViewIndex + numViews)</code> exceeds {@link GL30#GL_MAX_ARRAY_TEXTURE_LAYERS MAX_ARRAY_TEXTURE_LAYERS}.</p>
     * 
     * <p>{@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if a rendering command is issued and the number of views in the current draw framebuffer is not equal to the number
     * of views declared in the currently bound program.</p>
     *
     * @param target        the framebuffer target. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment    the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param texture       the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level         the mipmap level of {@code texture} to attach
     * @param baseViewIndex the base framebuffer texture layer index
     * @param numViews      the number of views to target when rendering
     */
    public static native void glFramebufferTextureMultiviewOVR(int target, int attachment, int texture, int level, int baseViewIndex, int numViews);

}