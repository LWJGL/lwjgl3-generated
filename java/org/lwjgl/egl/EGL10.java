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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** The core EGL 1.0 functionality. */
public final class EGL10 {

	/**  */
	public static final int
		EGL_ALPHA_SIZE              = 0x3021,
		EGL_BAD_ACCESS              = 0x3002,
		EGL_BAD_ALLOC               = 0x3003,
		EGL_BAD_ATTRIBUTE           = 0x3004,
		EGL_BAD_CONFIG              = 0x3005,
		EGL_BAD_CONTEXT             = 0x3006,
		EGL_BAD_CURRENT_SURFACE     = 0x3007,
		EGL_BAD_DISPLAY             = 0x3008,
		EGL_BAD_MATCH               = 0x3009,
		EGL_BAD_NATIVE_PIXMAP       = 0x300A,
		EGL_BAD_NATIVE_WINDOW       = 0x300B,
		EGL_BAD_PARAMETER           = 0x300C,
		EGL_BAD_SURFACE             = 0x300D,
		EGL_BLUE_SIZE               = 0x3022,
		EGL_BUFFER_SIZE             = 0x3020,
		EGL_CONFIG_CAVEAT           = 0x3027,
		EGL_CONFIG_ID               = 0x3028,
		EGL_CORE_NATIVE_ENGINE      = 0x305B,
		EGL_DEPTH_SIZE              = 0x3025,
		EGL_DONT_CARE               = -1,
		EGL_DRAW                    = 0x3059,
		EGL_EXTENSIONS              = 0x3055,
		EGL_FALSE                   = 0x0,
		EGL_GREEN_SIZE              = 0x3023,
		EGL_HEIGHT                  = 0x3056,
		EGL_LARGEST_PBUFFER         = 0x3058,
		EGL_LEVEL                   = 0x3029,
		EGL_MAX_PBUFFER_HEIGHT      = 0x302A,
		EGL_MAX_PBUFFER_PIXELS      = 0x302B,
		EGL_MAX_PBUFFER_WIDTH       = 0x302C,
		EGL_NATIVE_RENDERABLE       = 0x302D,
		EGL_NATIVE_VISUAL_ID        = 0x302E,
		EGL_NATIVE_VISUAL_TYPE      = 0x302F,
		EGL_NONE                    = 0x3038,
		EGL_NON_CONFORMANT_CONFIG   = 0x3051,
		EGL_NOT_INITIALIZED         = 0x3001,
		EGL_PBUFFER_BIT             = 0x1,
		EGL_PIXMAP_BIT              = 0x2,
		EGL_READ                    = 0x305A,
		EGL_RED_SIZE                = 0x3024,
		EGL_SAMPLES                 = 0x3031,
		EGL_SAMPLE_BUFFERS          = 0x3032,
		EGL_SLOW_CONFIG             = 0x3050,
		EGL_STENCIL_SIZE            = 0x3026,
		EGL_SUCCESS                 = 0x3000,
		EGL_SURFACE_TYPE            = 0x3033,
		EGL_TRANSPARENT_BLUE_VALUE  = 0x3035,
		EGL_TRANSPARENT_GREEN_VALUE = 0x3036,
		EGL_TRANSPARENT_RED_VALUE   = 0x3037,
		EGL_TRANSPARENT_RGB         = 0x3052,
		EGL_TRANSPARENT_TYPE        = 0x3034,
		EGL_TRUE                    = 0x1,
		EGL_VENDOR                  = 0x3053,
		EGL_VERSION                 = 0x3054,
		EGL_WIDTH                   = 0x3057,
		EGL_WINDOW_BIT              = 0x4;

	/** Null values. */
	public static final long
		EGL_NO_CONTEXT = 0x0L,
		EGL_NO_DISPLAY = 0x0L,
		EGL_NO_SURFACE = 0x0L;

	/** Function address. */
	@JavadocExclude
	public final long
		ChooseConfig,
		CopyBuffers,
		CreateContext,
		CreatePbufferSurface,
		CreatePixmapSurface,
		CreateWindowSurface,
		DestroyContext,
		DestroySurface,
		GetConfigAttrib,
		GetConfigs,
		GetCurrentDisplay,
		GetCurrentSurface,
		GetDisplay,
		GetError,
		GetProcAddress,
		Initialize,
		MakeCurrent,
		QueryContext,
		QueryString,
		QuerySurface,
		SwapBuffers,
		Terminate,
		WaitGL,
		WaitNative;

	@JavadocExclude
	public EGL10(FunctionProvider provider) {
		ChooseConfig = provider.getFunctionAddress("eglChooseConfig");
		CopyBuffers = provider.getFunctionAddress("eglCopyBuffers");
		CreateContext = provider.getFunctionAddress("eglCreateContext");
		CreatePbufferSurface = provider.getFunctionAddress("eglCreatePbufferSurface");
		CreatePixmapSurface = provider.getFunctionAddress("eglCreatePixmapSurface");
		CreateWindowSurface = provider.getFunctionAddress("eglCreateWindowSurface");
		DestroyContext = provider.getFunctionAddress("eglDestroyContext");
		DestroySurface = provider.getFunctionAddress("eglDestroySurface");
		GetConfigAttrib = provider.getFunctionAddress("eglGetConfigAttrib");
		GetConfigs = provider.getFunctionAddress("eglGetConfigs");
		GetCurrentDisplay = provider.getFunctionAddress("eglGetCurrentDisplay");
		GetCurrentSurface = provider.getFunctionAddress("eglGetCurrentSurface");
		GetDisplay = provider.getFunctionAddress("eglGetDisplay");
		GetError = provider.getFunctionAddress("eglGetError");
		GetProcAddress = provider.getFunctionAddress("eglGetProcAddress");
		Initialize = provider.getFunctionAddress("eglInitialize");
		MakeCurrent = provider.getFunctionAddress("eglMakeCurrent");
		QueryContext = provider.getFunctionAddress("eglQueryContext");
		QueryString = provider.getFunctionAddress("eglQueryString");
		QuerySurface = provider.getFunctionAddress("eglQuerySurface");
		SwapBuffers = provider.getFunctionAddress("eglSwapBuffers");
		Terminate = provider.getFunctionAddress("eglTerminate");
		WaitGL = provider.getFunctionAddress("eglWaitGL");
		WaitNative = provider.getFunctionAddress("eglWaitNative");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EGL10} instance. */
	public static EGL10 getInstance() {
		return checkFunctionality(EGL.getCapabilities().__EGL10);
	}

	static EGL10 create(FunctionProvider provider) {
		EGL10 funcs = new EGL10(provider);

		boolean supported = checkFunctions(
			funcs.ChooseConfig, funcs.CopyBuffers, funcs.CreateContext, funcs.CreatePbufferSurface, funcs.CreatePixmapSurface, funcs.CreateWindowSurface, 
			funcs.DestroyContext, funcs.DestroySurface, funcs.GetConfigAttrib, funcs.GetConfigs, funcs.GetCurrentDisplay, funcs.GetCurrentSurface, 
			funcs.GetDisplay, funcs.GetError, funcs.GetProcAddress, funcs.Initialize, funcs.MakeCurrent, funcs.QueryContext, funcs.QueryString, 
			funcs.QuerySurface, funcs.SwapBuffers, funcs.Terminate, funcs.WaitGL, funcs.WaitNative
		);

		return supported ? funcs : null;
	}

	// --- [ eglChooseConfig ] ---

	/** JNI method for {@link #eglChooseConfig ChooseConfig} */
	@JavadocExclude
	public static native boolean neglChooseConfig(long dpy, long attrib_list, long configs, int config_size, long num_config, long __functionAddress);

	/** Unsafe version of {@link #eglChooseConfig ChooseConfig} */
	@JavadocExclude
	public static boolean neglChooseConfig(long dpy, long attrib_list, long configs, int config_size, long num_config) {
		long __functionAddress = getInstance().ChooseConfig;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return neglChooseConfig(dpy, attrib_list, configs, config_size, num_config, __functionAddress);
	}

	public static boolean eglChooseConfig(long dpy, ByteBuffer attrib_list, ByteBuffer configs, int config_size, ByteBuffer num_config) {
		if ( LWJGLUtil.CHECKS ) {
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
			if ( configs != null ) checkBuffer(configs, config_size << POINTER_SHIFT);
			checkBuffer(num_config, 1 << 2);
		}
		return neglChooseConfig(dpy, memAddressSafe(attrib_list), memAddressSafe(configs), config_size, memAddress(num_config));
	}

	/** Alternative version of: {@link #eglChooseConfig ChooseConfig} */
	public static boolean eglChooseConfig(long dpy, IntBuffer attrib_list, PointerBuffer configs, IntBuffer num_config) {
		if ( LWJGLUtil.CHECKS ) {
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
			checkBuffer(num_config, 1);
		}
		return neglChooseConfig(dpy, memAddressSafe(attrib_list), memAddressSafe(configs), configs == null ? 0 : configs.remaining(), memAddress(num_config));
	}

	// --- [ eglCopyBuffers ] ---

	/** JNI method for {@link #eglCopyBuffers CopyBuffers} */
	@JavadocExclude
	public static native boolean neglCopyBuffers(long dpy, long surface, long target, long __functionAddress);

	public static boolean eglCopyBuffers(long dpy, long surface, long target) {
		long __functionAddress = getInstance().CopyBuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
			checkPointer(target);
		}
		return neglCopyBuffers(dpy, surface, target, __functionAddress);
	}

	// --- [ eglCreateContext ] ---

	/** JNI method for {@link #eglCreateContext CreateContext} */
	@JavadocExclude
	public static native long neglCreateContext(long dpy, long config, long share_context, long attrib_list, long __functionAddress);

	/** Unsafe version of {@link #eglCreateContext CreateContext} */
	@JavadocExclude
	public static long neglCreateContext(long dpy, long config, long share_context, long attrib_list) {
		long __functionAddress = getInstance().CreateContext;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(config);
		}
		return neglCreateContext(dpy, config, share_context, attrib_list, __functionAddress);
	}

	public static long eglCreateContext(long dpy, long config, long share_context, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreateContext(dpy, config, share_context, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreateContext CreateContext} */
	public static long eglCreateContext(long dpy, long config, long share_context, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateContext(dpy, config, share_context, memAddressSafe(attrib_list));
	}

	// --- [ eglCreatePbufferSurface ] ---

	/** JNI method for {@link #eglCreatePbufferSurface CreatePbufferSurface} */
	@JavadocExclude
	public static native long neglCreatePbufferSurface(long dpy, long config, long attrib_list, long __functionAddress);

	/** Unsafe version of {@link #eglCreatePbufferSurface CreatePbufferSurface} */
	@JavadocExclude
	public static long neglCreatePbufferSurface(long dpy, long config, long attrib_list) {
		long __functionAddress = getInstance().CreatePbufferSurface;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(config);
		}
		return neglCreatePbufferSurface(dpy, config, attrib_list, __functionAddress);
	}

	public static long eglCreatePbufferSurface(long dpy, long config, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreatePbufferSurface(dpy, config, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreatePbufferSurface CreatePbufferSurface} */
	public static long eglCreatePbufferSurface(long dpy, long config, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreatePbufferSurface(dpy, config, memAddressSafe(attrib_list));
	}

	// --- [ eglCreatePixmapSurface ] ---

	/** JNI method for {@link #eglCreatePixmapSurface CreatePixmapSurface} */
	@JavadocExclude
	public static native long neglCreatePixmapSurface(long dpy, long config, long pixmap, long attrib_list, long __functionAddress);

	/** Unsafe version of {@link #eglCreatePixmapSurface CreatePixmapSurface} */
	@JavadocExclude
	public static long neglCreatePixmapSurface(long dpy, long config, long pixmap, long attrib_list) {
		long __functionAddress = getInstance().CreatePixmapSurface;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(config);
			checkPointer(pixmap);
		}
		return neglCreatePixmapSurface(dpy, config, pixmap, attrib_list, __functionAddress);
	}

	public static long eglCreatePixmapSurface(long dpy, long config, long pixmap, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreatePixmapSurface(dpy, config, pixmap, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreatePixmapSurface CreatePixmapSurface} */
	public static long eglCreatePixmapSurface(long dpy, long config, long pixmap, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreatePixmapSurface(dpy, config, pixmap, memAddressSafe(attrib_list));
	}

	// --- [ eglCreateWindowSurface ] ---

	/** JNI method for {@link #eglCreateWindowSurface CreateWindowSurface} */
	@JavadocExclude
	public static native long neglCreateWindowSurface(long dpy, long config, long win, long attrib_list, long __functionAddress);

	/** Unsafe version of {@link #eglCreateWindowSurface CreateWindowSurface} */
	@JavadocExclude
	public static long neglCreateWindowSurface(long dpy, long config, long win, long attrib_list) {
		long __functionAddress = getInstance().CreateWindowSurface;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(config);
			checkPointer(win);
		}
		return neglCreateWindowSurface(dpy, config, win, attrib_list, __functionAddress);
	}

	public static long eglCreateWindowSurface(long dpy, long config, long win, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreateWindowSurface(dpy, config, win, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreateWindowSurface CreateWindowSurface} */
	public static long eglCreateWindowSurface(long dpy, long config, long win, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateWindowSurface(dpy, config, win, memAddressSafe(attrib_list));
	}

	// --- [ eglDestroyContext ] ---

	/** JNI method for {@link #eglDestroyContext DestroyContext} */
	@JavadocExclude
	public static native boolean neglDestroyContext(long dpy, long ctx, long __functionAddress);

	public static boolean eglDestroyContext(long dpy, long ctx) {
		long __functionAddress = getInstance().DestroyContext;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(ctx);
		}
		return neglDestroyContext(dpy, ctx, __functionAddress);
	}

	// --- [ eglDestroySurface ] ---

	/** JNI method for {@link #eglDestroySurface DestroySurface} */
	@JavadocExclude
	public static native boolean neglDestroySurface(long dpy, long surface, long __functionAddress);

	public static boolean eglDestroySurface(long dpy, long surface) {
		long __functionAddress = getInstance().DestroySurface;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return neglDestroySurface(dpy, surface, __functionAddress);
	}

	// --- [ eglGetConfigAttrib ] ---

	/** JNI method for {@link #eglGetConfigAttrib GetConfigAttrib} */
	@JavadocExclude
	public static native boolean neglGetConfigAttrib(long dpy, long config, int attribute, long value, long __functionAddress);

	/** Unsafe version of {@link #eglGetConfigAttrib GetConfigAttrib} */
	@JavadocExclude
	public static boolean neglGetConfigAttrib(long dpy, long config, int attribute, long value) {
		long __functionAddress = getInstance().GetConfigAttrib;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(config);
		}
		return neglGetConfigAttrib(dpy, config, attribute, value, __functionAddress);
	}

	public static boolean eglGetConfigAttrib(long dpy, long config, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		return neglGetConfigAttrib(dpy, config, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglGetConfigAttrib GetConfigAttrib} */
	public static boolean eglGetConfigAttrib(long dpy, long config, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return neglGetConfigAttrib(dpy, config, attribute, memAddress(value));
	}

	// --- [ eglGetConfigs ] ---

	/** JNI method for {@link #eglGetConfigs GetConfigs} */
	@JavadocExclude
	public static native boolean neglGetConfigs(long dpy, long configs, int config_size, long num_config, long __functionAddress);

	/** Unsafe version of {@link #eglGetConfigs GetConfigs} */
	@JavadocExclude
	public static boolean neglGetConfigs(long dpy, long configs, int config_size, long num_config) {
		long __functionAddress = getInstance().GetConfigs;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return neglGetConfigs(dpy, configs, config_size, num_config, __functionAddress);
	}

	public static boolean eglGetConfigs(long dpy, ByteBuffer configs, int config_size, ByteBuffer num_config) {
		if ( LWJGLUtil.CHECKS ) {
			if ( configs != null ) checkBuffer(configs, config_size << POINTER_SHIFT);
			checkBuffer(num_config, 1 << 2);
		}
		return neglGetConfigs(dpy, memAddressSafe(configs), config_size, memAddress(num_config));
	}

	/** Alternative version of: {@link #eglGetConfigs GetConfigs} */
	public static boolean eglGetConfigs(long dpy, PointerBuffer configs, IntBuffer num_config) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(num_config, 1);
		return neglGetConfigs(dpy, memAddressSafe(configs), configs == null ? 0 : configs.remaining(), memAddress(num_config));
	}

	// --- [ eglGetCurrentDisplay ] ---

	/** JNI method for {@link #eglGetCurrentDisplay GetCurrentDisplay} */
	@JavadocExclude
	public static native long neglGetCurrentDisplay(long __functionAddress);

	public static long eglGetCurrentDisplay() {
		long __functionAddress = getInstance().GetCurrentDisplay;
		return neglGetCurrentDisplay(__functionAddress);
	}

	// --- [ eglGetCurrentSurface ] ---

	/** JNI method for {@link #eglGetCurrentSurface GetCurrentSurface} */
	@JavadocExclude
	public static native long neglGetCurrentSurface(int readdraw, long __functionAddress);

	public static long eglGetCurrentSurface(int readdraw) {
		long __functionAddress = getInstance().GetCurrentSurface;
		return neglGetCurrentSurface(readdraw, __functionAddress);
	}

	// --- [ eglGetDisplay ] ---

	/** JNI method for {@link #eglGetDisplay GetDisplay} */
	@JavadocExclude
	public static native long neglGetDisplay(long display_id, long __functionAddress);

	public static long eglGetDisplay(long display_id) {
		long __functionAddress = getInstance().GetDisplay;
		return neglGetDisplay(display_id, __functionAddress);
	}

	// --- [ eglGetError ] ---

	/** JNI method for {@link #eglGetError GetError} */
	@JavadocExclude
	public static native int neglGetError(long __functionAddress);

	public static int eglGetError() {
		long __functionAddress = getInstance().GetError;
		return neglGetError(__functionAddress);
	}

	// --- [ eglGetProcAddress ] ---

	/** JNI method for {@link #eglGetProcAddress GetProcAddress} */
	@JavadocExclude
	public static native long neglGetProcAddress(long procname, long __functionAddress);

	/** Unsafe version of {@link #eglGetProcAddress GetProcAddress} */
	@JavadocExclude
	public static long neglGetProcAddress(long procname) {
		long __functionAddress = getInstance().GetProcAddress;
		return neglGetProcAddress(procname, __functionAddress);
	}

	public static long eglGetProcAddress(ByteBuffer procname) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(procname);
		return neglGetProcAddress(memAddress(procname));
	}

	/** CharSequence version of: {@link #eglGetProcAddress GetProcAddress} */
	public static long eglGetProcAddress(CharSequence procname) {
		APIBuffer __buffer = apiBuffer();
		int procnameEncoded = __buffer.stringParamASCII(procname, true);
		return neglGetProcAddress(__buffer.address(procnameEncoded));
	}

	// --- [ eglInitialize ] ---

	/** JNI method for {@link #eglInitialize Initialize} */
	@JavadocExclude
	public static native boolean neglInitialize(long dpy, long major, long minor, long __functionAddress);

	/** Unsafe version of {@link #eglInitialize Initialize} */
	@JavadocExclude
	public static boolean neglInitialize(long dpy, long major, long minor) {
		long __functionAddress = getInstance().Initialize;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return neglInitialize(dpy, major, minor, __functionAddress);
	}

	public static boolean eglInitialize(long dpy, ByteBuffer major, ByteBuffer minor) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(major, 1 << 2);
			checkBuffer(minor, 1 << 2);
		}
		return neglInitialize(dpy, memAddress(major), memAddress(minor));
	}

	/** Alternative version of: {@link #eglInitialize Initialize} */
	public static boolean eglInitialize(long dpy, IntBuffer major, IntBuffer minor) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(major, 1);
			checkBuffer(minor, 1);
		}
		return neglInitialize(dpy, memAddress(major), memAddress(minor));
	}

	// --- [ eglMakeCurrent ] ---

	/** JNI method for {@link #eglMakeCurrent MakeCurrent} */
	@JavadocExclude
	public static native boolean neglMakeCurrent(long dpy, long draw, long read, long ctx, long __functionAddress);

	public static boolean eglMakeCurrent(long dpy, long draw, long read, long ctx) {
		long __functionAddress = getInstance().MakeCurrent;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(draw);
			checkPointer(read);
			checkPointer(ctx);
		}
		return neglMakeCurrent(dpy, draw, read, ctx, __functionAddress);
	}

	// --- [ eglQueryContext ] ---

	/** JNI method for {@link #eglQueryContext QueryContext} */
	@JavadocExclude
	public static native boolean neglQueryContext(long dpy, long ctx, int attribute, long value, long __functionAddress);

	/** Unsafe version of {@link #eglQueryContext QueryContext} */
	@JavadocExclude
	public static boolean neglQueryContext(long dpy, long ctx, int attribute, long value) {
		long __functionAddress = getInstance().QueryContext;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(ctx);
		}
		return neglQueryContext(dpy, ctx, attribute, value, __functionAddress);
	}

	public static boolean eglQueryContext(long dpy, long ctx, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		return neglQueryContext(dpy, ctx, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglQueryContext QueryContext} */
	public static boolean eglQueryContext(long dpy, long ctx, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return neglQueryContext(dpy, ctx, attribute, memAddress(value));
	}

	// --- [ eglQueryString ] ---

	/** JNI method for {@link #eglQueryString QueryString} */
	@JavadocExclude
	public static native long neglQueryString(long dpy, int name, long __functionAddress);

	/** Unsafe version of {@link #eglQueryString QueryString} */
	@JavadocExclude
	public static long neglQueryString(long dpy, int name) {
		long __functionAddress = getInstance().QueryString;
		return neglQueryString(dpy, name, __functionAddress);
	}

	public static String eglQueryString(long dpy, int name) {
		long __result = neglQueryString(dpy, name);
		return memDecodeASCII(__result);
	}

	// --- [ eglQuerySurface ] ---

	/** JNI method for {@link #eglQuerySurface QuerySurface} */
	@JavadocExclude
	public static native boolean neglQuerySurface(long dpy, long surface, int attribute, long value, long __functionAddress);

	/** Unsafe version of {@link #eglQuerySurface QuerySurface} */
	@JavadocExclude
	public static boolean neglQuerySurface(long dpy, long surface, int attribute, long value) {
		long __functionAddress = getInstance().QuerySurface;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return neglQuerySurface(dpy, surface, attribute, value, __functionAddress);
	}

	public static boolean eglQuerySurface(long dpy, long surface, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		return neglQuerySurface(dpy, surface, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglQuerySurface QuerySurface} */
	public static boolean eglQuerySurface(long dpy, long surface, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return neglQuerySurface(dpy, surface, attribute, memAddress(value));
	}

	// --- [ eglSwapBuffers ] ---

	/** JNI method for {@link #eglSwapBuffers SwapBuffers} */
	@JavadocExclude
	public static native boolean neglSwapBuffers(long dpy, long surface, long __functionAddress);

	public static boolean eglSwapBuffers(long dpy, long surface) {
		long __functionAddress = getInstance().SwapBuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return neglSwapBuffers(dpy, surface, __functionAddress);
	}

	// --- [ eglTerminate ] ---

	/** JNI method for {@link #eglTerminate Terminate} */
	@JavadocExclude
	public static native boolean neglTerminate(long dpy, long __functionAddress);

	public static boolean eglTerminate(long dpy) {
		long __functionAddress = getInstance().Terminate;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return neglTerminate(dpy, __functionAddress);
	}

	// --- [ eglWaitGL ] ---

	/** JNI method for {@link #eglWaitGL WaitGL} */
	@JavadocExclude
	public static native boolean neglWaitGL(long __functionAddress);

	public static boolean eglWaitGL() {
		long __functionAddress = getInstance().WaitGL;
		return neglWaitGL(__functionAddress);
	}

	// --- [ eglWaitNative ] ---

	/** JNI method for {@link #eglWaitNative WaitNative} */
	@JavadocExclude
	public static native boolean neglWaitNative(int engine, long __functionAddress);

	public static boolean eglWaitNative(int engine) {
		long __functionAddress = getInstance().WaitNative;
		return neglWaitNative(engine, __functionAddress);
	}

}