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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/wgl_swap_control.txt">WGL_EXT_swap_control</a> extension.
 * <p/>
 * This extension allows an application to specify a minimum periodicity of color buffer swaps, measured in video frame periods.
 */
public final class WGLEXTSwapControl {

	private WGLEXTSwapControl() {}

	// --- [ wglSwapIntervalEXT ] ---

	/** JNI method for {@link #wglSwapIntervalEXT wglSwapIntervalEXT} */
	public static native int nwglSwapIntervalEXT(int interval, long __functionAddress);

	/**
	 * Specifies the minimum number of video frame periods per buffer swap for the window associated with the current context. The interval takes effect when
	 * {@link org.lwjgl.system.windows.WinGDI#SwapBuffers} or wglSwapLayerBuffer is first called subsequent to the {@code wglSwapIntervalEXT} call.
	 * <p/>
	 * A video frame period is the time required by the monitor to display a full frame of video data.  In the case of an interlaced monitor, this is typically
	 * the time required to display both the even and odd fields of a frame of video data.  An interval set to a value of 2 means that the color buffers will
	 * be swapped at most every other video frame.
	 * <p/>
	 * If {@code interval} is set to a value of 0, buffer swaps are not synchronized to a video frame.  The {@code interval} value is silently clamped to the
	 * maximum implementation-dependent value supported before being stored.
	 * <p/>
	 * The swap interval is not part of the render context state. It cannot be pushed or popped. The default swap interval is 1.
	 *
	 * @param interval the minimum number of video frames that are displayed before a buffer swap will occur
	 */
	public static int wglSwapIntervalEXT(int interval) {
		long __functionAddress = getInstance().wglSwapIntervalEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nwglSwapIntervalEXT(interval, __functionAddress);
	}

	// --- [ wglGetSwapIntervalEXT ] ---

	/** JNI method for {@link #wglGetSwapIntervalEXT wglGetSwapIntervalEXT} */
	public static native int nwglGetSwapIntervalEXT(long __functionAddress);

	/** Returns the current swap interval for the window associated with the current context. */
	public static int wglGetSwapIntervalEXT() {
		long __functionAddress = getInstance().wglGetSwapIntervalEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nwglGetSwapIntervalEXT(__functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__WGLEXTSwapControl;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_EXT_swap_control") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.wglSwapIntervalEXT) &&
			GL.isFunctionSupported(funcs.wglGetSwapIntervalEXT);

		return GL.checkExtension("WGL_EXT_swap_control", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code WGLEXTSwapControl}. */
	public static final class Functions implements FunctionMap {

		public final long
			wglSwapIntervalEXT,
			wglGetSwapIntervalEXT;

		public Functions(FunctionProvider provider) {
			wglSwapIntervalEXT = provider.getFunctionAddress("wglSwapIntervalEXT");
			wglGetSwapIntervalEXT = provider.getFunctionAddress("wglGetSwapIntervalEXT");
		}

	}

}