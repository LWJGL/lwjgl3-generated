/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

import org.lwjgl.egl.EGL10;

/** Native bindings to the GLFW library's EGL native access functions. */
public class GLFWNativeEGL {

	protected GLFWNativeEGL() {
		throw new UnsupportedOperationException();
	}

	/** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			GetEGLDisplay = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetEGLDisplay"),
			GetEGLContext = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetEGLContext"),
			GetEGLSurface = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetEGLSurface");

	}

	// --- [ glfwGetEGLDisplay ] ---

	/**
	 * Returns the {@code EGLDisplay} used by GLFW.
	 * 
	 * <p>This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @return the {@code EGLDisplay} used by GLFW, or {@link EGL10#EGL_NO_DISPLAY} if an error occured
	 *
	 * @since version 3.0
	 */
	public static long glfwGetEGLDisplay() {
		long __functionAddress = Functions.GetEGLDisplay;
		return invokeP(__functionAddress);
	}

	// --- [ glfwGetEGLContext ] ---

	/**
	 * Returns the {@code EGLContext} of the specified window.
	 * 
	 * <p>This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window a GLFW window
	 *
	 * @return the {@code EGLContext} of the specified window, or {@link EGL10#EGL_NO_CONTEXT} if an error occurred
	 *
	 * @since version 3.0
	 */
	public static long glfwGetEGLContext(long window) {
		long __functionAddress = Functions.GetEGLContext;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

	// --- [ glfwGetEGLSurface ] ---

	/**
	 * Returns the {@code EGLSurface} of the specified window.
	 * 
	 * <p>This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window 
	 *
	 * @return the {@code EGLSurface} of the specified window, or {@link EGL10#EGL_NO_SURFACE} if an error occurred
	 *
	 * @since version 3.0
	 */
	public static long glfwGetEGLSurface(long window) {
		long __functionAddress = Functions.GetEGLSurface;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}