/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the GLFW library's WGL native access functions. */
public class GLFWNativeWGL {

	protected GLFWNativeWGL() {
		throw new UnsupportedOperationException();
	}

	/** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			GetWGLContext = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWGLContext");

	}

	// --- [ glfwGetWGLContext ] ---

	/**
	 * Returns the <code>HGLRC</code> of the specified window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the GLFW window
	 *
	 * @return The <code>HGLRC</code> of the specified window, or {@code NULL} if an error occurred.
	 *
	 * @since version 3.0
	 */
	public static long glfwGetWGLContext(long window) {
		long __functionAddress = Functions.GetWGLContext;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}