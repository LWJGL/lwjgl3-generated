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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/wgl_make_current_read.txt">WGL_ARB_make_current_read</a> extension.
 * <p/>
 * The association of a separate "read" and "draw" DC with the current context allows for preprocessing of image data in an "off screen" DC which is then read
 * into a visible DC for final display.
 */
public final class WGLARBMakeCurrentRead {

	/** New errors returned by {@link org.lwjgl.system.windows.WinBase#GetLastError}. */
	public static final int
		ERROR_INVALID_PIXEL_TYPE_ARB           = 0x2043,
		ERROR_INCOMPATIBLE_DEVICE_CONTEXTS_ARB = 0x2054;

	private WGLARBMakeCurrentRead() {}

	// --- [ wglMakeContextCurrentARB ] ---

	/** JNI method for {@link #wglMakeContextCurrentARB} */
	public static native int nwglMakeContextCurrentARB(long drawDC, long readDC, long hglrc, long __functionAddress);

	/**
	 * Associates the context {@code hglrc} with the device {@code drawDC} for draws and the device {@code readDC} for reads. All subsequent OpenGL calls made
	 * by the calling thread are drawn on the device identified by {@code drawDC} and read on the device identified by {@code readDC}.
	 * <p/>
	 * The {@code drawDC} and {@code readDC} parameters must refer to drawing surfaces supported by OpenGL. These parameters need not be the same {@code hdc}
	 * that was passed to {@link org.lwjgl.system.windows.WGL#wglCreateContext} when {@code hglrc} was created. {@code drawDC} must have the same pixel format
	 * and be created on the same physical device as the {@code hdc} that was passed into wglCreateContext. {@code readDC} must be created on the same device
	 * as the {@code hdc} that was passed to wglCreateContext and it must support the same pixel type as the pixel format of the {@code hdc} that was passed to
	 * wglCreateContext.
	 * <p/>
	 * If {@code wglMakeContextCurrentARB} is used to associate a different device for reads than for draws, the "read" device will be used for the following
	 * OpenGL operations:
	 * <ol>
	 * <li>Any pixel data that are sourced based on the value of {@link GL11#GL_READ_BUFFER}. Note, that accumulation operations use the value of READ_BUFFER, but
	 * are not allowed when a different device context is used for reads.  In this case, the accumulation operation will generate
	 * {@link GL11#GL_INVALID_OPERATION}.</li>
	 * <li>Any depth values that are retrieved by {@link GL11#glReadPixels}, {@link GL11#glCopyPixels}, or any OpenGL extension that sources depth images from the
	 * frame buffer in the manner of ReadPixels and CopyPixels.</li>
	 * <li>Any stencil values that are retrieved by ReadPixels, CopyPixels, or any OpenGL extension that sources stencil images from the framebuffer in the manner
	 * of ReadPixels and CopyPixels.</li>
	 * </ol>
	 * <p/>
	 * These frame buffer values are taken from the surface associated with the device context specified by {@code readDC}.
	 *
	 * @param drawDC the "draw" device context
	 * @param readDC the "read" device context
	 * @param hglrc  the OpenGL context
	 */
	public static int wglMakeContextCurrentARB(long drawDC, long readDC, long hglrc) {
		long __functionAddress = getInstance().wglMakeContextCurrentARB;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(drawDC);
			checkPointer(readDC);
			checkPointer(hglrc);
		}
		return nwglMakeContextCurrentARB(drawDC, readDC, hglrc, __functionAddress);
	}

	// --- [ wglGetCurrentReadDCARB ] ---

	/** JNI method for {@link #wglGetCurrentReadDCARB} */
	public static native long nwglGetCurrentReadDCARB(long __functionAddress);

	/** Returns the "read" device context for the current OpenGL context. */
	public static long wglGetCurrentReadDCARB() {
		long __functionAddress = getInstance().wglGetCurrentReadDCARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nwglGetCurrentReadDCARB(__functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__WGLARBMakeCurrentRead;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_ARB_make_current_read") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.wglMakeContextCurrentARB) &&
			GL.isFunctionSupported(funcs.wglGetCurrentReadDCARB);

		return GL.checkExtension("WGL_ARB_make_current_read", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code WGLARBMakeCurrentRead}. */
	public static final class Functions implements FunctionMap {

		public final long
			wglMakeContextCurrentARB,
			wglGetCurrentReadDCARB;

		public Functions(FunctionProvider provider) {
			wglMakeContextCurrentARB = provider.getFunctionAddress("wglMakeContextCurrentARB");
			wglGetCurrentReadDCARB = provider.getFunctionAddress("wglGetCurrentReadDCARB");
		}

	}

}