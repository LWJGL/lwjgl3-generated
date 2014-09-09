/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the GLFW library's Win32 native access functions. */
public final class GLFWWin32 {

	private GLFWWin32() {}

	// --- [ glfwGetWin32Monitor ] ---

	/** JNI method for {@link #glfwGetWin32Monitor GetWin32Monitor} */
	@JavadocExclude
	public static native long nglfwGetWin32Monitor(long monitor);

	/**
	 * Returns the device name of the specified monitor.
	 *
	 * @param monitor the GLFW monitor
	 */
	public static String glfwGetWin32Monitor(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		long __result = nglfwGetWin32Monitor(monitor);
		return memDecodeUTF16(memByteBufferNT2(__result));
	}

	// --- [ glfwGetWin32Window ] ---

	/** JNI method for {@link #glfwGetWin32Window GetWin32Window} */
	@JavadocExclude
	public static native long nglfwGetWin32Window(long window);

	/**
	 * Returns the <code style="font-family: monospace">HWND</code> of the given GLFW window.
	 *
	 * @param window the GLFW window
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
	 * Returns the <code style="font-family: monospace">HGLRC</code> of the given GLFW window.
	 *
	 * @param window the GLFW window
	 */
	public static long glfwGetWGLContext(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWGLContext(window);
	}

}