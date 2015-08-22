/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_image_base.txt">KHR_image_base</a> extension.
 * 
 * <p>This extension defines a new EGL resource type that is suitable for sharing 2D arrays of image data between client APIs, the EGLImage. Although the
 * intended purpose is sharing 2D image data, the underlying interface makes no assumptions about the format or purpose of the resource being shared,
 * leaving those decisions to the application and associated client APIs.</p>
 * 
 * <p>Requires {@link EGL12 EGL L.1}.</p>
 */
public final class KHRImageBase {

	/**  */
	public static final int EGL_IMAGE_PRESERVED_KHR = 0x30D2;

	/**  */
	public static final long EGL_NO_IMAGE_KHR = 0x0L;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateImageKHR,
		DestroyImageKHR;

	@JavadocExclude
	public KHRImageBase(FunctionProvider provider) {
		CreateImageKHR = provider.getFunctionAddress("eglCreateImageKHR");
		DestroyImageKHR = provider.getFunctionAddress("eglDestroyImageKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRImageBase} instance. */
	public static KHRImageBase getInstance() {
		return checkFunctionality(EGL.getCapabilities().__KHRImageBase);
	}

	// --- [ eglCreateImageKHR ] ---

	/** Unsafe version of {@link #eglCreateImageKHR CreateImageKHR} */
	@JavadocExclude
	public static long neglCreateImageKHR(long dpy, long ctx, int target, long buffer, long attrib_list) {
		long __functionAddress = getInstance().CreateImageKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(ctx);
			checkPointer(buffer);
		}
		return callPPIPPP(__functionAddress, dpy, ctx, target, buffer, attrib_list);
	}

	public static long eglCreateImageKHR(long dpy, long ctx, int target, long buffer, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreateImageKHR(dpy, ctx, target, buffer, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreateImageKHR CreateImageKHR} */
	public static long eglCreateImageKHR(long dpy, long ctx, int target, long buffer, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateImageKHR(dpy, ctx, target, buffer, memAddressSafe(attrib_list));
	}

	// --- [ eglDestroyImageKHR ] ---

	public static boolean eglDestroyImageKHR(long dpy, long image) {
		long __functionAddress = getInstance().DestroyImageKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(image);
		}
		return callPPZ(__functionAddress, dpy, image);
	}

}