/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to the GLFW library's Win32 native access functions. */
public final class GLFWWin32 {

	private GLFWWin32() {}

	// --- [ glfwGetWin32Window ] ---

	/** JNI method for {@link #glfwGetWin32Window glfwGetWin32Window} */
	public static native long nglfwGetWin32Window(long window);

	/**
	 * Returns the <code>HWND</code> of the given GLFW window.
	 *
	 * @param window the GLFW window
	 */
	public static long glfwGetWin32Window(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWin32Window(window);
	}

	// --- [ glfwGetWGLContext ] ---

	/** JNI method for {@link #glfwGetWGLContext glfwGetWGLContext} */
	public static native long nglfwGetWGLContext(long window);

	/**
	 * Returns the <code>HGLRC</code> of the given GLFW window.
	 *
	 * @param window the GLFW window
	 */
	public static long glfwGetWGLContext(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWGLContext(window);
	}

}