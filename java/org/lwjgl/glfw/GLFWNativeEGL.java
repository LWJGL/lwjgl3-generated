/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

import org.lwjgl.egl.EGL10;

/** Native bindings to the GLFW library's EGL native access functions. */
public class GLFWNativeEGL {

	/** Function address. */
	@JavadocExclude
	public final long
		GetEGLDisplay,
		GetEGLContext,
		GetEGLSurface;

	@JavadocExclude
	protected GLFWNativeEGL() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLFWNativeEGL(FunctionProvider provider) {
		GetEGLDisplay = checkFunctionAddress(provider.getFunctionAddress("glfwGetEGLDisplay"));
		GetEGLContext = checkFunctionAddress(provider.getFunctionAddress("glfwGetEGLContext"));
		GetEGLSurface = checkFunctionAddress(provider.getFunctionAddress("glfwGetEGLSurface"));
	}

	// --- [ Function Addresses ] ---

	private static final GLFWNativeEGL instance = new GLFWNativeEGL(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return GLFW.getLibrary();
	}

	/** Returns the {@link GLFWNativeEGL} instance. */
	public static GLFWNativeEGL getInstance() {
		return instance;
	}

	// --- [ glfwGetEGLDisplay ] ---

	/**
	 * Returns the {@code EGLDisplay} used by GLFW.
	 * 
	 * <p>This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @return the {@code EGLDisplay} used by GLFW, or {@link EGL10#EGL_NO_DISPLAY} if an error occured
	 */
	public static long glfwGetEGLDisplay() {
		long __functionAddress = getInstance().GetEGLDisplay;
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
	 */
	public static long glfwGetEGLContext(long window) {
		long __functionAddress = getInstance().GetEGLContext;
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
	 */
	public static long glfwGetEGLSurface(long window) {
		long __functionAddress = getInstance().GetEGLSurface;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}