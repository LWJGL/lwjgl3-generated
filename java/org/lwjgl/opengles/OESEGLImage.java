/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

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
public class OESEGLImage {

	protected OESEGLImage() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glEGLImageTargetTexture2DOES, caps.glEGLImageTargetRenderbufferStorageOES
		);
	}

	// --- [ glEGLImageTargetTexture2DOES ] ---

	public static void glEGLImageTargetTexture2DOES(int target, long image) {
		long __functionAddress = GLES.getCapabilities().glEGLImageTargetTexture2DOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(image);
		}
		callPV(__functionAddress, target, image);
	}

	// --- [ glEGLImageTargetRenderbufferStorageOES ] ---

	public static void glEGLImageTargetRenderbufferStorageOES(int target, long image) {
		long __functionAddress = GLES.getCapabilities().glEGLImageTargetRenderbufferStorageOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(image);
		}
		callPV(__functionAddress, target, image);
	}

}