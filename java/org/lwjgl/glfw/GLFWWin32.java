/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the GLFW library's Win32 native access functions. */
public final class GLFWWin32 {

	static { LWJGLUtil.initialize(); }

	private GLFWWin32() {}

	// --- [ glfwGetWin32Adapter ] ---

	/** JNI method for {@link #glfwGetWin32Adapter GetWin32Adapter} */
	@JavadocExclude
	public static native long nglfwGetWin32Adapter(long monitor);

	/**
	 * Returns the adapter device name of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The UTF-8 encoded adapter device name (for example `\\.\DISPLAY1`) of the specified monitor, or {@code NULL} if an error occurred.
	 *
	 * @since GLFW 3.1
	 */
	public static String glfwGetWin32Adapter(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		long __result = nglfwGetWin32Adapter(monitor);
		return memDecodeUTF8(__result);
	}

	// --- [ glfwGetWin32Monitor ] ---

	/** JNI method for {@link #glfwGetWin32Monitor GetWin32Monitor} */
	@JavadocExclude
	public static native long nglfwGetWin32Monitor(long monitor);

	/**
	 * Returns the display device name of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The UTF-8 encoded display device name (for example `\\.\DISPLAY1\Monitor0`) of the specified monitor, or {@code NULL} if an error occurred.
	 *
	 * @since GLFW 3.1
	 */
	public static String glfwGetWin32Monitor(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		long __result = nglfwGetWin32Monitor(monitor);
		return memDecodeUTF8(__result);
	}

	// --- [ glfwGetWin32Window ] ---

	/** JNI method for {@link #glfwGetWin32Window GetWin32Window} */
	@JavadocExclude
	public static native long nglfwGetWin32Window(long window);

	/**
	 * Returns the <code style="font-family: monospace">HWND</code> of the specified window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the GLFW window
	 *
	 * @return The <code style="font-family: monospace">HWND</code> of the specified window, or {@code NULL} if an error occurred.
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetWin32Window(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWin32Window(window);
	}

	// --- [ glfwGetWGLContext ] ---

	/** JNI method for {@link #glfwGetWGLContext GetWGLContext} */
	@JavadocExclude
	public static native long nglfwGetWGLContext(long window);

	/**
	 * Returns the <code style="font-family: monospace">HGLRC</code> of the specified window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the GLFW window
	 *
	 * @return The <code style="font-family: monospace">HGLRC</code> of the specified window, or {@code NULL} if an error occurred.
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetWGLContext(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWGLContext(window);
	}

}