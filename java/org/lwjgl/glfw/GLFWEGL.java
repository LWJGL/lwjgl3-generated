/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

import org.lwjgl.egl.EGL10;

/** Native bindings to the GLFW library's EGL native access functions. */
public final class GLFWEGL {

	static { LWJGLUtil.initialize(); }

	private GLFWEGL() {}

	// --- [ glfwGetEGLDisplay ] ---

	/**
	 * Returns the {@code EGLDisplay} used by GLFW.
	 * 
	 * <p>This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @return the {@code EGLDisplay} used by GLFW, or {@link EGL10#EGL_NO_DISPLAY} if an error occured
	 */
	public static native long glfwGetEGLDisplay();

	// --- [ glfwGetEGLContext ] ---

	/** JNI method for {@link #glfwGetEGLContext GetEGLContext} */
	@JavadocExclude
	public static native long nglfwGetEGLContext(long window);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetEGLContext(window);
	}

	// --- [ glfwGetEGLSurface ] ---

	/** JNI method for {@link #glfwGetEGLSurface GetEGLSurface} */
	@JavadocExclude
	public static native long nglfwGetEGLSurface(long window);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetEGLSurface(window);
	}

}