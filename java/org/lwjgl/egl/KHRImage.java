/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_image.txt">KHR_image</a> extension.
 * 
 * <p>This extension defines a new EGL resource type that is suitable for sharing 2D arrays of image data between client APIs, the EGLImage, and allows
 * creating EGLImages from EGL native pixmaps.</p>
 * 
 * <p>Requires {@link EGL12 EGL L.1}.</p>
 */
public class KHRImage {

	/**  */
	public static final int EGL_NATIVE_PIXMAP_KHR = 0x30B0;

	/**  */
	public static final long EGL_NO_IMAGE_KHR = 0x0L;

	protected KHRImage() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglCreateImageKHR, caps.eglDestroyImageKHR
		);
	}

	// --- [ eglCreateImageKHR ] ---

	public static long neglCreateImageKHR(long dpy, long ctx, int target, long buffer, long attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateImageKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(ctx);
			checkPointer(buffer);
		}
		return callPPIPPP(__functionAddress, dpy, ctx, target, buffer, attrib_list);
	}

	public static long eglCreateImageKHR(long dpy, long ctx, int target, long buffer, IntBuffer attrib_list) {
		if ( CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateImageKHR(dpy, ctx, target, buffer, memAddressSafe(attrib_list));
	}

	// --- [ eglDestroyImageKHR ] ---

	public static int eglDestroyImageKHR(long dpy, long image) {
		long __functionAddress = EGL.getCapabilities().eglDestroyImageKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(image);
		}
		return callPPI(__functionAddress, dpy, image);
	}

}