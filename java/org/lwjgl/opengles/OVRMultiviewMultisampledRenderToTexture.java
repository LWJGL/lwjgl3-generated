/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/gles/extensions/OVR/multiview_multisampled_render_to_texture.txt">OVR_multiview_multisampled_render_to_texture</a> extension.
 * 
 * <p>This extension brings to multiview rendering the functionality originally introduced in {@link EXTMultisampledRenderToTexture EXT_multisampled_render_to_texture}. Essentially this
 * just means adding one new function for multisample multiview array attachments in the framebuffer object.</p>
 */
public class OVRMultiviewMultisampledRenderToTexture {

	static { GLES.initialize(); }

	protected OVRMultiviewMultisampledRenderToTexture() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glFramebufferTextureMultisampleMultiviewOVR
		);
	}

	// --- [ glFramebufferTextureMultisampleMultiviewOVR ] ---

	/**
	 * Operates similarly to {@link OVRMultiview#glFramebufferTextureMultiviewOVR FramebufferTextureMultiviewOVR}, except that it also enables multisampled rendering into the images of a
	 * non-multisampled texture object similarly to {@link EXTMultisampledRenderToTexture#glFramebufferTexture2DMultisampleEXT FramebufferTexture2DMultisampleEXT}.
	 *
	 * @param target        
	 * @param attachment    
	 * @param texture       
	 * @param level         
	 * @param samples       
	 * @param baseViewIndex 
	 * @param numViews      
	 */
	public static native void glFramebufferTextureMultisampleMultiviewOVR(int target, int attachment, int texture, int level, int samples, int baseViewIndex, int numViews);

}