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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_EGL_image.txt">OES_EGL_image</a> extension.
 * 
 * <p>This extension provides a mechanism for creating texture and renderbuffer objects sharing storage with specified EGLImage objects (such objects are
 * referred to as "EGLImage targets").</p>
 * 
 * <p>The companion EGL_KHR_image_base and EGL_KHR_image extensions provide the definition and rationale for EGLImage objects.</p>
 * 
 * <p>Other EGL extensions, such as EGL_KHR_gl_texture_2D_image, EGL_KHR_gl_texture_cubemap_image, EGL_KHR_gl_texture_3D_image,
 * EGL_KHR_gl_renderbuffer_image, and EGL_KHR_vg_parent_image, define the related functionality of creating EGLImage objects from "EGLImage sources" such
 * as OpenGL ES texture or renderbuffers or OpenVG VGImage objects.</p>
 */
public final class OESEGLImage {

	/** Function address. */
	@JavadocExclude
	public final long
		EGLImageTargetTexture2DOES,
		EGLImageTargetRenderbufferStorageOES;

	@JavadocExclude
	public OESEGLImage(FunctionProvider provider) {
		EGLImageTargetTexture2DOES = provider.getFunctionAddress("glEGLImageTargetTexture2DOES");
		EGLImageTargetRenderbufferStorageOES = provider.getFunctionAddress("glEGLImageTargetRenderbufferStorageOES");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OESEGLImage} instance for the current context. */
	public static OESEGLImage getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OESEGLImage);
	}

	static OESEGLImage create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OES_EGL_image") ) return null;

		OESEGLImage funcs = new OESEGLImage(provider);
		boolean supported = checkFunctions(
			funcs.EGLImageTargetTexture2DOES, funcs.EGLImageTargetRenderbufferStorageOES
		);

		return GLES.checkExtension("GL_OES_EGL_image", funcs, supported);
	}

	// --- [ glEGLImageTargetTexture2DOES ] ---

	public static void glEGLImageTargetTexture2DOES(int target, long image) {
		long __functionAddress = getInstance().EGLImageTargetTexture2DOES;
		if ( LWJGLUtil.CHECKS )
			checkPointer(image);
		callIPV(__functionAddress, target, image);
	}

	// --- [ glEGLImageTargetRenderbufferStorageOES ] ---

	public static void glEGLImageTargetRenderbufferStorageOES(int target, long image) {
		long __functionAddress = getInstance().EGLImageTargetRenderbufferStorageOES;
		if ( LWJGLUtil.CHECKS )
			checkPointer(image);
		callIPV(__functionAddress, target, image);
	}

}