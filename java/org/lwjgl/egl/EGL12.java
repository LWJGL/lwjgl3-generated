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

/** The core EGL 1.2 functionality. */
public final class EGL12 {

	/**  */
	public static final int
		EGL_ALPHA_FORMAT          = 0x3088,
		EGL_ALPHA_FORMAT_NONPRE   = 0x308B,
		EGL_ALPHA_FORMAT_PRE      = 0x308C,
		EGL_ALPHA_MASK_SIZE       = 0x303E,
		EGL_BUFFER_PRESERVED      = 0x3094,
		EGL_BUFFER_DESTROYED      = 0x3095,
		EGL_CLIENT_APIS           = 0x308D,
		EGL_COLORSPACE            = 0x3087,
		EGL_COLORSPACE_sRGB       = 0x3089,
		EGL_COLORSPACE_LINEAR     = 0x308A,
		EGL_COLOR_BUFFER_TYPE     = 0x303F,
		EGL_CONTEXT_CLIENT_TYPE   = 0x3097,
		EGL_DISPLAY_SCALING       = 0x2710,
		EGL_HORIZONTAL_RESOLUTION = 0x3090,
		EGL_LUMINANCE_BUFFER      = 0x308F,
		EGL_LUMINANCE_SIZE        = 0x303D,
		EGL_OPENGL_ES_BIT         = 0x1,
		EGL_OPENVG_BIT            = 0x2,
		EGL_OPENGL_ES_API         = 0x30A0,
		EGL_OPENVG_API            = 0x30A1,
		EGL_OPENVG_IMAGE          = 0x3096,
		EGL_PIXEL_ASPECT_RATIO    = 0x3092,
		EGL_RENDERABLE_TYPE       = 0x3040,
		EGL_RENDER_BUFFER         = 0x3086,
		EGL_RGB_BUFFER            = 0x308E,
		EGL_SINGLE_BUFFER         = 0x3085,
		EGL_SWAP_BEHAVIOR         = 0x3093,
		EGL_UNKNOWN               = -1,
		EGL_VERTICAL_RESOLUTION   = 0x3091;

	/** Function address. */
	@JavadocExclude
	public final long
		BindAPI,
		QueryAPI,
		CreatePbufferFromClientBuffer,
		ReleaseThread,
		WaitClient;

	@JavadocExclude
	public EGL12(FunctionProvider provider) {
		BindAPI = provider.getFunctionAddress("eglBindAPI");
		QueryAPI = provider.getFunctionAddress("eglQueryAPI");
		CreatePbufferFromClientBuffer = provider.getFunctionAddress("eglCreatePbufferFromClientBuffer");
		ReleaseThread = provider.getFunctionAddress("eglReleaseThread");
		WaitClient = provider.getFunctionAddress("eglWaitClient");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EGL12} instance. */
	public static EGL12 getInstance() {
		return checkFunctionality(EGL.getCapabilities().__EGL12);
	}

	// --- [ eglBindAPI ] ---

	public static boolean eglBindAPI(int api) {
		long __functionAddress = getInstance().BindAPI;
		return callIZ(__functionAddress, api);
	}

	// --- [ eglQueryAPI ] ---

	public static int eglQueryAPI() {
		long __functionAddress = getInstance().QueryAPI;
		return callI(__functionAddress);
	}

	// --- [ eglCreatePbufferFromClientBuffer ] ---

	/** Unsafe version of {@link #eglCreatePbufferFromClientBuffer CreatePbufferFromClientBuffer} */
	@JavadocExclude
	public static long neglCreatePbufferFromClientBuffer(long dpy, int buftype, long buffer, long config, long attrib_list) {
		long __functionAddress = getInstance().CreatePbufferFromClientBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(buffer);
			checkPointer(config);
		}
		return callPIPPPP(__functionAddress, dpy, buftype, buffer, config, attrib_list);
	}

	public static long eglCreatePbufferFromClientBuffer(long dpy, int buftype, long buffer, long config, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreatePbufferFromClientBuffer(dpy, buftype, buffer, config, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreatePbufferFromClientBuffer CreatePbufferFromClientBuffer} */
	public static long eglCreatePbufferFromClientBuffer(long dpy, int buftype, long buffer, long config, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreatePbufferFromClientBuffer(dpy, buftype, buffer, config, memAddressSafe(attrib_list));
	}

	// --- [ eglReleaseThread ] ---

	public static boolean eglReleaseThread() {
		long __functionAddress = getInstance().ReleaseThread;
		return callZ(__functionAddress);
	}

	// --- [ eglWaitClient ] ---

	public static boolean eglWaitClient() {
		long __functionAddress = getInstance().WaitClient;
		return callZ(__functionAddress);
	}

}