/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OVR/multiview_multisampled_render_to_texture.txt">OVR_multiview_multisampled_render_to_texture</a> extension.
 * 
 * <p>This extension brings to multiview rendering the functionality originally introduced in {@link EXTMultisampledRenderToTexture EXT_multisampled_render_to_texture}. Essentially this
 * just means adding one new function for multisample multiview array attachments in the framebuffer object.</p>
 */
public class OVRMultiviewMultisampledRenderToTexture {

	/** Function address. */
	@JavadocExclude
	public final long FramebufferTextureMultisampleMultiviewOVR;

	@JavadocExclude
	protected OVRMultiviewMultisampledRenderToTexture() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public OVRMultiviewMultisampledRenderToTexture(FunctionProvider provider) {
		FramebufferTextureMultisampleMultiviewOVR = provider.getFunctionAddress("glFramebufferTextureMultisampleMultiviewOVR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OVRMultiviewMultisampledRenderToTexture} instance of the current context. */
	public static OVRMultiviewMultisampledRenderToTexture getInstance() {
		return getInstance(GLES.getCapabilities());
	}

	/** Returns the {@link OVRMultiviewMultisampledRenderToTexture} instance of the specified {@link GLESCapabilities}. */
	public static OVRMultiviewMultisampledRenderToTexture getInstance(GLESCapabilities caps) {
		return checkFunctionality(caps.__OVRMultiviewMultisampledRenderToTexture);
	}

	static OVRMultiviewMultisampledRenderToTexture create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OVR_multiview_multisampled_render_to_texture") ) return null;

		OVRMultiviewMultisampledRenderToTexture funcs = new OVRMultiviewMultisampledRenderToTexture(provider);
		boolean supported = checkFunctions(
			funcs.FramebufferTextureMultisampleMultiviewOVR
		);

		return GLES.checkExtension("GL_OVR_multiview_multisampled_render_to_texture", funcs, supported);
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
	public static void glFramebufferTextureMultisampleMultiviewOVR(int target, int attachment, int texture, int level, int samples, int baseViewIndex, int numViews) {
		long __functionAddress = getInstance().FramebufferTextureMultisampleMultiviewOVR;
		callIIIIIIIV(__functionAddress, target, attachment, texture, level, samples, baseViewIndex, numViews);
	}

}