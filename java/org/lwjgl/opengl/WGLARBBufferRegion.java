/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/wgl_buffer_region.txt">WGL_ARB_buffer_region</a> extension.
 * 
 * <p>The buffer region extension is a mechanism that allows an area of an OpenGL window to be saved in off-screen memory for quick restores. The off-screen
 * memory can either be frame buffer memory or system memory, although frame buffer memory might offer optimal performance.</p>
 * 
 * <p>A buffer region can be created for the front color, back color, depth, and/or stencil buffer.  Multiple buffer regions for the same buffer type can
 * exist.</p>
 */
public final class WGLARBBufferRegion {

	/** Accepted by the {@code type} parameter of {@link #wglCreateBufferRegionARB CreateBufferRegionARB}. */
	public static final int
		WGL_FRONT_COLOR_BUFFER_BIT_ARB = 0x1,
		WGL_BACK_COLOR_BUFFER_BIT_ARB  = 0x2,
		WGL_DEPTH_BUFFER_BIT_ARB       = 0x4,
		WGL_STENCIL_BUFFER_BIT_ARB     = 0x8;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateBufferRegionARB,
		DeleteBufferRegionARB,
		SaveBufferRegionARB,
		RestoreBufferRegionARB;

	@JavadocExclude
	public WGLARBBufferRegion(FunctionProvider provider) {
		CreateBufferRegionARB = provider.getFunctionAddress("wglCreateBufferRegionARB");
		DeleteBufferRegionARB = provider.getFunctionAddress("wglDeleteBufferRegionARB");
		SaveBufferRegionARB = provider.getFunctionAddress("wglSaveBufferRegionARB");
		RestoreBufferRegionARB = provider.getFunctionAddress("wglRestoreBufferRegionARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLARBBufferRegion} instance for the current context. */
	public static WGLARBBufferRegion getInstance() {
		return checkFunctionality(GL.getCapabilities().__WGLARBBufferRegion);
	}

	static WGLARBBufferRegion create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_ARB_buffer_region") ) return null;

		WGLARBBufferRegion funcs = new WGLARBBufferRegion(provider);

		boolean supported = checkFunctions(
			funcs.CreateBufferRegionARB, funcs.DeleteBufferRegionARB, funcs.SaveBufferRegionARB, funcs.RestoreBufferRegionARB
		);

		return GL.checkExtension("WGL_ARB_buffer_region", funcs, supported);
	}

	// --- [ wglCreateBufferRegionARB ] ---

	/** JNI method for {@link #wglCreateBufferRegionARB CreateBufferRegionARB} */
	@JavadocExclude
	public static native long nwglCreateBufferRegionARB(long hdc, int layerPlane, int type, long __functionAddress);

	/**
	 * Creates a buffer region and returns a handle associated with it.
	 *
	 * @param hdc        the device context for the device on which the buffer region is created
	 * @param layerPlane the layer plane. Positive values identify overlay planes, negative values identify underlay planes. A value of 0 identifies the main plane.
	 * @param type       a bitwise OR of any of the following values indicating which buffers can be saved or restored.  Multiple bits can be set and may result in better
	 *                   performance if multiple buffers are saved or restored. One of:<br>{@link #WGL_FRONT_COLOR_BUFFER_BIT_ARB FRONT_COLOR_BUFFER_BIT_ARB}, {@link #WGL_BACK_COLOR_BUFFER_BIT_ARB BACK_COLOR_BUFFER_BIT_ARB}, {@link #WGL_DEPTH_BUFFER_BIT_ARB DEPTH_BUFFER_BIT_ARB}, {@link #WGL_STENCIL_BUFFER_BIT_ARB STENCIL_BUFFER_BIT_ARB}
	 */
	public static long wglCreateBufferRegionARB(long hdc, int layerPlane, int type) {
		long __functionAddress = getInstance().CreateBufferRegionARB;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nwglCreateBufferRegionARB(hdc, layerPlane, type, __functionAddress);
	}

	// --- [ wglDeleteBufferRegionARB ] ---

	/** JNI method for {@link #wglDeleteBufferRegionARB DeleteBufferRegionARB} */
	@JavadocExclude
	public static native void nwglDeleteBufferRegionARB(long region, long __functionAddress);

	/**
	 * Deletes a buffer region.
	 *
	 * @param region a handle to a buffer region previously created with {@link #wglCreateBufferRegionARB CreateBufferRegionARB}.
	 */
	public static void wglDeleteBufferRegionARB(long region) {
		long __functionAddress = getInstance().DeleteBufferRegionARB;
		if ( LWJGLUtil.CHECKS )
			checkPointer(region);
		nwglDeleteBufferRegionARB(region, __functionAddress);
	}

	// --- [ wglSaveBufferRegionARB ] ---

	/** JNI method for {@link #wglSaveBufferRegionARB SaveBufferRegionARB} */
	@JavadocExclude
	public static native int nwglSaveBufferRegionARB(long region, int x, int y, int width, int height, long __functionAddress);

	/**
	 * Saves image, depth, and stencil data into the buffer region.
	 * 
	 * <p>Data outside the window for the specified rectangle is undefined. The OpenGL coordinate system is used for specifying the rectangle ({@code x} and
	 * {@code y} specify the lower-left corner of the rectangle).</p>
	 * 
	 * <p>If an RC is current to the calling thread, a flush will occur before the save operation.</p>
	 * 
	 * <p>The saved buffer region area can be freed by calling {@code wglSaveBufferRegionARB} with {@code width} or {@code height} set to a value of 0.</p>
	 *
	 * @param region a handle to a buffer region previously created with {@link #wglCreateBufferRegionARB CreateBufferRegionARB}.
	 * @param x      the window x-coordinate for the source rectangle
	 * @param y      the window y-coordinate for the source rectangle
	 * @param width  the source rectangle width
	 * @param height the source rectangle height
	 */
	public static int wglSaveBufferRegionARB(long region, int x, int y, int width, int height) {
		long __functionAddress = getInstance().SaveBufferRegionARB;
		if ( LWJGLUtil.CHECKS )
			checkPointer(region);
		return nwglSaveBufferRegionARB(region, x, y, width, height, __functionAddress);
	}

	// --- [ wglRestoreBufferRegionARB ] ---

	/** JNI method for {@link #wglRestoreBufferRegionARB RestoreBufferRegionARB} */
	@JavadocExclude
	public static native int nwglRestoreBufferRegionARB(long region, int x, int y, int width, int height, int xSrc, int ySrc, long __functionAddress);

	/**
	 * Restores a previously saved buffer region.
	 *
	 * @param region a handle to a buffer region previously created with {@link #wglCreateBufferRegionARB CreateBufferRegionARB}.
	 * @param x      the window x-coordinate for the destination rectangle
	 * @param y      the window y-coordinate for the destination rectangle
	 * @param width  the destination rectangle width
	 * @param height the destination rectangle height
	 * @param xSrc   the buffer region x-coordinate for the source of the data
	 * @param ySrc   the buffer region y-coordinate for the source of the data
	 */
	public static int wglRestoreBufferRegionARB(long region, int x, int y, int width, int height, int xSrc, int ySrc) {
		long __functionAddress = getInstance().RestoreBufferRegionARB;
		if ( LWJGLUtil.CHECKS )
			checkPointer(region);
		return nwglRestoreBufferRegionARB(region, x, y, width, height, xSrc, ySrc, __functionAddress);
	}

}