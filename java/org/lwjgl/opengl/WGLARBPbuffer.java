/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/wgl_pbuffer.txt">WGL_ARB_pbuffer</a> extension.
 * 
 * <p>This extension defines pixel buffers (pbuffer for short). Pbuffers are additional non-visible rendering buffers for an OpenGL renderer. Pbuffers are
 * equivalent to a window that has the same pixel format descriptor with the following exceptions:
 * <ol>
 * <li>There is no rendering to a pbuffer by GDI.</li>
 * <li>The pixel format descriptors used for a pbuffer can only be those that are supported by the ICD.  Generic formats are not valid.</li>
 * <li>The allocation of a pbuffer can fail if there are insufficient resources (i.e., all the pbuffer memory has been allocated).</li>
 * <li>The pixel buffer might be lost if a display mode change occurs. A query is provided that can be called after a display mode change to determine the
 * state of the pixel buffer.</li>
 * </ol>
 * The intent of the pbuffer semantics is to enable implementations to allocate pbuffers in non-visible frame buffer memory. These pbuffers are intended to
 * be "static" resources in that a program will typically allocate them only once rather than as a part of its rendering loop.  (Pbuffers should be
 * deallocated when the program is no longer using them -- for example, if the program is iconified.)</p>
 * 
 * <p>The frame buffer resources that are associated with a pbuffer are also static and are deallocated when the pbuffer is destroyed or possibly when a
 * display mode change occurs.</p>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string} and {@link WGLARBPixelFormat WGL_ARB_pixel_format}.</p>
 */
public final class WGLARBPbuffer {

	/**
	 * Accepted by the {@code attribIList} parameter of {@link WGLARBPixelFormat#wglChoosePixelFormatARB ChoosePixelFormatARB} and the {@code attributes} parameter of
	 * {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB GetPixelFormatAttribiARB}.
	 */
	public static final int WGL_DRAW_TO_PBUFFER_ARB = 0x202D;

	/** Accepted by the {@code attributes} parameter of {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB GetPixelFormatAttribiARB}. */
	public static final int
		WGL_MAX_PBUFFER_PIXELS_ARB = 0x202E,
		WGL_MAX_PBUFFER_WIDTH_ARB  = 0x202F,
		WGL_MAX_PBUFFER_HEIGHT_ARB = 0x2030;

	/** Accepted by the {@code attribList} parameter of {@link #wglCreatePbufferARB CreatePbufferARB}. */
	public static final int WGL_PBUFFER_LARGEST_ARB = 0x2033;

	/** Accepted by the {@code attribute} parameter of {@link #wglQueryPbufferARB QueryPbufferARB}. */
	public static final int
		WGL_PBUFFER_WIDTH_ARB  = 0x2034,
		WGL_PBUFFER_HEIGHT_ARB = 0x2035,
		WGL_PBUFFER_LOST_ARB   = 0x2036;

	/** Function address. */
	@JavadocExclude
	public final long
		CreatePbufferARB,
		GetPbufferDCARB,
		ReleasePbufferDCARB,
		DestroyPbufferARB,
		QueryPbufferARB;

	@JavadocExclude
	public WGLARBPbuffer(FunctionProvider provider) {
		CreatePbufferARB = provider.getFunctionAddress("wglCreatePbufferARB");
		GetPbufferDCARB = provider.getFunctionAddress("wglGetPbufferDCARB");
		ReleasePbufferDCARB = provider.getFunctionAddress("wglReleasePbufferDCARB");
		DestroyPbufferARB = provider.getFunctionAddress("wglDestroyPbufferARB");
		QueryPbufferARB = provider.getFunctionAddress("wglQueryPbufferARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLARBPbuffer} instance for the current context. */
	public static WGLARBPbuffer getInstance() {
		return checkFunctionality(GL.getCapabilities().__WGLARBPbuffer);
	}

	static WGLARBPbuffer create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_ARB_pbuffer") ) return null;

		WGLARBPbuffer funcs = new WGLARBPbuffer(provider);

		boolean supported = checkFunctions(
			funcs.CreatePbufferARB, funcs.GetPbufferDCARB, funcs.ReleasePbufferDCARB, funcs.DestroyPbufferARB, funcs.QueryPbufferARB
		);

		return GL.checkExtension("WGL_ARB_pbuffer", funcs, supported);
	}

	// --- [ wglCreatePbufferARB ] ---

	/** JNI method for {@link #wglCreatePbufferARB CreatePbufferARB} */
	@JavadocExclude
	public static native long nwglCreatePbufferARB(long hdc, int pixelFormat, int width, int height, long attribList, long __functionAddress);

	/** Unsafe version of {@link #wglCreatePbufferARB CreatePbufferARB} */
	@JavadocExclude
	public static long nwglCreatePbufferARB(long hdc, int pixelFormat, int width, int height, long attribList) {
		long __functionAddress = getInstance().CreatePbufferARB;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nwglCreatePbufferARB(hdc, pixelFormat, width, height, attribList, __functionAddress);
	}

	/**
	 * Creates a pixel buffer (pbuffer) and returns a handle to it.
	 * 
	 * <p>Support for pbuffers may be restricted to specific pixel formats. Use {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB GetPixelFormatAttribiARB} to query the {@link #WGL_DRAW_TO_PBUFFER_ARB DRAW_TO_PBUFFER_ARB}
	 * attribute to determine which pixel formats support the creation of pbuffers.</p>
	 *
	 * @param hdc         a device context for the device on which the pbuffer is created
	 * @param pixelFormat a non-generic pixel format descriptor index
	 * @param width       the pixel width of the rectangular pbuffer
	 * @param height      the pixel height of the rectangular pbuffer
	 * @param attribList  a 0-terminated list of attributes {type, value} pairs containing integer attribute values
	 */
	public static long wglCreatePbufferARB(long hdc, int pixelFormat, int width, int height, ByteBuffer attribList) {
		if ( LWJGLUtil.CHECKS )
			if ( attribList != null ) checkNT4(attribList);
		return nwglCreatePbufferARB(hdc, pixelFormat, width, height, memAddressSafe(attribList));
	}

	/** Alternative version of: {@link #wglCreatePbufferARB CreatePbufferARB} */
	public static long wglCreatePbufferARB(long hdc, int pixelFormat, int width, int height, IntBuffer attribList) {
		if ( LWJGLUtil.CHECKS )
			if ( attribList != null ) checkNT(attribList);
		return nwglCreatePbufferARB(hdc, pixelFormat, width, height, memAddressSafe(attribList));
	}

	// --- [ wglGetPbufferDCARB ] ---

	/** JNI method for {@link #wglGetPbufferDCARB GetPbufferDCARB} */
	@JavadocExclude
	public static native long nwglGetPbufferDCARB(long pbuffer, long __functionAddress);

	/**
	 * Creates a device context for the pbuffer.
	 *
	 * @param pbuffer a pbuffer handle returned from a previous call to {@link #wglCreatePbufferARB CreatePbufferARB}
	 */
	public static long wglGetPbufferDCARB(long pbuffer) {
		long __functionAddress = getInstance().GetPbufferDCARB;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pbuffer);
		return nwglGetPbufferDCARB(pbuffer, __functionAddress);
	}

	// --- [ wglReleasePbufferDCARB ] ---

	/** JNI method for {@link #wglReleasePbufferDCARB ReleasePbufferDCARB} */
	@JavadocExclude
	public static native int nwglReleasePbufferDCARB(long pbuffer, long hdc, long __functionAddress);

	/**
	 * Releases a device context obtained from a previous call to {@link #wglGetPbufferDCARB GetPbufferDCARB}.
	 *
	 * @param pbuffer a pbuffer handle
	 * @param hdc     a device context handle
	 */
	public static int wglReleasePbufferDCARB(long pbuffer, long hdc) {
		long __functionAddress = getInstance().ReleasePbufferDCARB;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(pbuffer);
			checkPointer(hdc);
		}
		return nwglReleasePbufferDCARB(pbuffer, hdc, __functionAddress);
	}

	// --- [ wglDestroyPbufferARB ] ---

	/** JNI method for {@link #wglDestroyPbufferARB DestroyPbufferARB} */
	@JavadocExclude
	public static native int nwglDestroyPbufferARB(long pbuffer, long __functionAddress);

	/**
	 * Destroys a pbuffer.
	 * 
	 * <p>The pbuffer is destroyed once it is no longer current to any rendering context.  When a pbuffer is destroyed, any memory resources that are attached to
	 * it are freed and its handle is no longer valid.</p>
	 *
	 * @param pbuffer a pbuffer handle
	 */
	public static int wglDestroyPbufferARB(long pbuffer) {
		long __functionAddress = getInstance().DestroyPbufferARB;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pbuffer);
		return nwglDestroyPbufferARB(pbuffer, __functionAddress);
	}

	// --- [ wglQueryPbufferARB ] ---

	/** JNI method for {@link #wglQueryPbufferARB QueryPbufferARB} */
	@JavadocExclude
	public static native int nwglQueryPbufferARB(long pbuffer, int attribute, long value, long __functionAddress);

	/** Unsafe version of {@link #wglQueryPbufferARB QueryPbufferARB} */
	@JavadocExclude
	public static int nwglQueryPbufferARB(long pbuffer, int attribute, long value) {
		long __functionAddress = getInstance().QueryPbufferARB;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pbuffer);
		return nwglQueryPbufferARB(pbuffer, attribute, value, __functionAddress);
	}

	/**
	 * Queries an attribute associated with a specific pbuffer.
	 *
	 * @param pbuffer   a pbuffer handle
	 * @param attribute the attribute to query. One of:<br>{@link #WGL_PBUFFER_WIDTH_ARB PBUFFER_WIDTH_ARB}, {@link #WGL_PBUFFER_HEIGHT_ARB PBUFFER_HEIGHT_ARB}, {@link #WGL_PBUFFER_LOST_ARB PBUFFER_LOST_ARB}
	 * @param value     the attribute value
	 */
	public static int wglQueryPbufferARB(long pbuffer, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		return nwglQueryPbufferARB(pbuffer, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #wglQueryPbufferARB QueryPbufferARB} */
	public static int wglQueryPbufferARB(long pbuffer, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return nwglQueryPbufferARB(pbuffer, attribute, memAddress(value));
	}

}