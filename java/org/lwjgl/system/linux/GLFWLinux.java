/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to the GLFW library's Linux native access functions. */
public final class GLFWLinux {

	private GLFWLinux() {}

	// --- [ glfwGetX11Monitor ] ---

	/** JNI method for {@link #glfwGetX11Monitor GetX11Monitor} */
	@JavadocExclude
	public static native long nglfwGetX11Monitor(long monitor);

	/**
	 * Returns the {@code RRCrtc} of the specified monitor.
	 *
	 * @param monitor the GLFW monitor
	 */
	public static long glfwGetX11Monitor(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		return nglfwGetX11Monitor(monitor);
	}

	// --- [ glfwGetX11Display ] ---

	/** Returns the {@code Display} used by GLFW. */
	public static native long glfwGetX11Display();

	// --- [ glfwGetX11Window ] ---

	/** JNI method for {@link #glfwGetX11Window GetX11Window} */
	@JavadocExclude
	public static native long nglfwGetX11Window(long window);

	/**
	 * Returns the {@code Window} of the specified window.
	 *
	 * @param window a GLFW window
	 */
	public static long glfwGetX11Window(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetX11Window(window);
	}

	// --- [ glfwGetGLXContext ] ---

	/** JNI method for {@link #glfwGetGLXContext GetGLXContext} */
	@JavadocExclude
	public static native long nglfwGetGLXContext(long window);

	/**
	 * Returns the {@code GLXContext} of the specified window.
	 *
	 * @param window a GLFW window
	 */
	public static long glfwGetGLXContext(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetGLXContext(window);
	}

}