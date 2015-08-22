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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core EGL 1.5 functionality. */
public final class EGL15 {

	/**  */
	public static final int
		EGL_CONTEXT_MAJOR_VERSION                      = 0x3098,
		EGL_CONTEXT_MINOR_VERSION                      = 0x30FB,
		EGL_CONTEXT_OPENGL_PROFILE_MASK                = 0x30FD,
		EGL_CONTEXT_OPENGL_RESET_NOTIFICATION_STRATEGY = 0x31BD,
		EGL_NO_RESET_NOTIFICATION                      = 0x31BE,
		EGL_LOSE_CONTEXT_ON_RESET                      = 0x31BF,
		EGL_CONTEXT_OPENGL_CORE_PROFILE_BIT            = 0x1,
		EGL_CONTEXT_OPENGL_COMPATIBILITY_PROFILE_BIT   = 0x2,
		EGL_CONTEXT_OPENGL_DEBUG                       = 0x31B0,
		EGL_CONTEXT_OPENGL_FORWARD_COMPATIBLE          = 0x31B1,
		EGL_CONTEXT_OPENGL_ROBUST_ACCESS               = 0x31B2,
		EGL_OPENGL_ES3_BIT                             = 0x40,
		EGL_CL_EVENT_HANDLE                            = 0x309C,
		EGL_SYNC_CL_EVENT                              = 0x30FE,
		EGL_SYNC_CL_EVENT_COMPLETE                     = 0x30FF,
		EGL_SYNC_PRIOR_COMMANDS_COMPLETE               = 0x30F0,
		EGL_SYNC_TYPE                                  = 0x30F7,
		EGL_SYNC_STATUS                                = 0x30F1,
		EGL_SYNC_CONDITION                             = 0x30F8,
		EGL_SIGNALED                                   = 0x30F2,
		EGL_UNSIGNALED                                 = 0x30F3,
		EGL_SYNC_FLUSH_COMMANDS_BIT                    = 0x1,
		EGL_TIMEOUT_EXPIRED                            = 0x30F5,
		EGL_CONDITION_SATISFIED                        = 0x30F6,
		EGL_SYNC_FENCE                                 = 0x30F9,
		EGL_GL_COLORSPACE                              = 0x309D,
		EGL_GL_COLORSPACE_SRGB                         = 0x3089,
		EGL_GL_COLORSPACE_LINEAR                       = 0x308A,
		EGL_GL_RENDERBUFFER                            = 0x30B9,
		EGL_GL_TEXTURE_2D                              = 0x30B1,
		EGL_GL_TEXTURE_LEVEL                           = 0x30BC,
		EGL_GL_TEXTURE_3D                              = 0x30B2,
		EGL_GL_TEXTURE_ZOFFSET                         = 0x30BD,
		EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_X             = 0x30B3,
		EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_X             = 0x30B4,
		EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_Y             = 0x30B5,
		EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_Y             = 0x30B6,
		EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_Z             = 0x30B7,
		EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_Z             = 0x30B8,
		EGL_IMAGE_PRESERVED                            = 0x30D2;

	/**  */
	public static final long
		EGL_FOREVER  = 0xFFFFFFFFFFFFFFFFL,
		EGL_NO_SYNC  = 0x0L,
		EGL_NO_IMAGE = 0x0L;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateSync,
		DestroySync,
		ClientWaitSync,
		GetSyncAttrib,
		CreateImage,
		DestroyImage,
		GetPlatformDisplay,
		CreatePlatformWindowSurface,
		CreatePlatformPixmapSurface,
		WaitSync;

	@JavadocExclude
	public EGL15(FunctionProvider provider) {
		CreateSync = provider.getFunctionAddress("eglCreateSync");
		DestroySync = provider.getFunctionAddress("eglDestroySync");
		ClientWaitSync = provider.getFunctionAddress("eglClientWaitSync");
		GetSyncAttrib = provider.getFunctionAddress("eglGetSyncAttrib");
		CreateImage = provider.getFunctionAddress("eglCreateImage");
		DestroyImage = provider.getFunctionAddress("eglDestroyImage");
		GetPlatformDisplay = provider.getFunctionAddress("eglGetPlatformDisplay");
		CreatePlatformWindowSurface = provider.getFunctionAddress("eglCreatePlatformWindowSurface");
		CreatePlatformPixmapSurface = provider.getFunctionAddress("eglCreatePlatformPixmapSurface");
		WaitSync = provider.getFunctionAddress("eglWaitSync");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EGL15} instance. */
	public static EGL15 getInstance() {
		return checkFunctionality(EGL.getCapabilities().__EGL15);
	}

	// --- [ eglCreateSync ] ---

	/** Unsafe version of {@link #eglCreateSync CreateSync} */
	@JavadocExclude
	public static long neglCreateSync(long dpy, int type, long attrib_list) {
		long __functionAddress = getInstance().CreateSync;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return callPIPP(__functionAddress, dpy, type, attrib_list);
	}

	public static long eglCreateSync(long dpy, int type, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			checkNTP(attrib_list, EGL10.EGL_NONE);
		return neglCreateSync(dpy, type, memAddress(attrib_list));
	}

	/** Alternative version of: {@link #eglCreateSync CreateSync} */
	public static long eglCreateSync(long dpy, int type, PointerBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateSync(dpy, type, memAddress(attrib_list));
	}

	// --- [ eglDestroySync ] ---

	public static boolean eglDestroySync(long dpy, long sync) {
		long __functionAddress = getInstance().DestroySync;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPZ(__functionAddress, dpy, sync);
	}

	// --- [ eglClientWaitSync ] ---

	public static int eglClientWaitSync(long dpy, long sync, int flags, long timeout) {
		long __functionAddress = getInstance().ClientWaitSync;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPIJI(__functionAddress, dpy, sync, flags, timeout);
	}

	// --- [ eglGetSyncAttrib ] ---

	/** Unsafe version of {@link #eglGetSyncAttrib GetSyncAttrib} */
	@JavadocExclude
	public static boolean neglGetSyncAttrib(long dpy, long sync, int attribute, long value) {
		long __functionAddress = getInstance().GetSyncAttrib;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPIPZ(__functionAddress, dpy, sync, attribute, value);
	}

	public static boolean eglGetSyncAttrib(long dpy, long sync, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << POINTER_SHIFT);
		return neglGetSyncAttrib(dpy, sync, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglGetSyncAttrib GetSyncAttrib} */
	public static boolean eglGetSyncAttrib(long dpy, long sync, int attribute, PointerBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return neglGetSyncAttrib(dpy, sync, attribute, memAddress(value));
	}

	// --- [ eglCreateImage ] ---

	/** Unsafe version of {@link #eglCreateImage CreateImage} */
	@JavadocExclude
	public static long neglCreateImage(long dpy, long ctx, int target, long buffer, long attrib_list) {
		long __functionAddress = getInstance().CreateImage;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(ctx);
			checkPointer(buffer);
		}
		return callPPIPPP(__functionAddress, dpy, ctx, target, buffer, attrib_list);
	}

	public static long eglCreateImage(long dpy, long ctx, int target, long buffer, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNTP(attrib_list, EGL10.EGL_NONE);
		return neglCreateImage(dpy, ctx, target, buffer, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreateImage CreateImage} */
	public static long eglCreateImage(long dpy, long ctx, int target, long buffer, PointerBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateImage(dpy, ctx, target, buffer, memAddressSafe(attrib_list));
	}

	// --- [ eglDestroyImage ] ---

	public static boolean eglDestroyImage(long dpy, long image) {
		long __functionAddress = getInstance().DestroyImage;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(image);
		}
		return callPPZ(__functionAddress, dpy, image);
	}

	// --- [ eglGetPlatformDisplay ] ---

	/** Unsafe version of {@link #eglGetPlatformDisplay GetPlatformDisplay} */
	@JavadocExclude
	public static long neglGetPlatformDisplay(int platform, long native_display, long attrib_list) {
		long __functionAddress = getInstance().GetPlatformDisplay;
		if ( LWJGLUtil.CHECKS )
			checkPointer(native_display);
		return callIPPP(__functionAddress, platform, native_display, attrib_list);
	}

	public static long eglGetPlatformDisplay(int platform, long native_display, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNTP(attrib_list, EGL10.EGL_NONE);
		return neglGetPlatformDisplay(platform, native_display, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglGetPlatformDisplay GetPlatformDisplay} */
	public static long eglGetPlatformDisplay(int platform, long native_display, PointerBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglGetPlatformDisplay(platform, native_display, memAddressSafe(attrib_list));
	}

	// --- [ eglCreatePlatformWindowSurface ] ---

	/** Unsafe version of {@link #eglCreatePlatformWindowSurface CreatePlatformWindowSurface} */
	@JavadocExclude
	public static long neglCreatePlatformWindowSurface(long dpy, long config, long native_window, long attrib_list) {
		long __functionAddress = getInstance().CreatePlatformWindowSurface;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(config);
			checkPointer(native_window);
		}
		return callPPPPP(__functionAddress, dpy, config, native_window, attrib_list);
	}

	public static long eglCreatePlatformWindowSurface(long dpy, long config, long native_window, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNTP(attrib_list, EGL10.EGL_NONE);
		return neglCreatePlatformWindowSurface(dpy, config, native_window, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreatePlatformWindowSurface CreatePlatformWindowSurface} */
	public static long eglCreatePlatformWindowSurface(long dpy, long config, long native_window, PointerBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreatePlatformWindowSurface(dpy, config, native_window, memAddressSafe(attrib_list));
	}

	// --- [ eglCreatePlatformPixmapSurface ] ---

	/** Unsafe version of {@link #eglCreatePlatformPixmapSurface CreatePlatformPixmapSurface} */
	@JavadocExclude
	public static long neglCreatePlatformPixmapSurface(long dpy, long config, long native_pixmap, long attrib_list) {
		long __functionAddress = getInstance().CreatePlatformPixmapSurface;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(config);
			checkPointer(native_pixmap);
		}
		return callPPPPP(__functionAddress, dpy, config, native_pixmap, attrib_list);
	}

	public static long eglCreatePlatformPixmapSurface(long dpy, long config, long native_pixmap, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNTP(attrib_list, EGL10.EGL_NONE);
		return neglCreatePlatformPixmapSurface(dpy, config, native_pixmap, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreatePlatformPixmapSurface CreatePlatformPixmapSurface} */
	public static long eglCreatePlatformPixmapSurface(long dpy, long config, long native_pixmap, PointerBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreatePlatformPixmapSurface(dpy, config, native_pixmap, memAddressSafe(attrib_list));
	}

	// --- [ eglWaitSync ] ---

	public static boolean eglWaitSync(long dpy, long sync, int flags) {
		long __functionAddress = getInstance().WaitSync;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPIZ(__functionAddress, dpy, sync, flags);
	}

}