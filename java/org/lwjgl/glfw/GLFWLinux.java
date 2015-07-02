/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

import org.lwjgl.system.linux.X;

/** Native bindings to the GLFW library's Linux native access functions. */
public final class GLFWLinux {

	static { LWJGLUtil.initialize(); }

	private GLFWLinux() {}

	// --- [ glfwGetX11Display ] ---

	/**
	 * Returns the <code style="font-family: monospace">Display</code> used by GLFW.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @return The <code style="font-family: monospace">Display</code> used by GLFW, or {@code NULL} if an error occurred.
	 *
	 * @since GLFW 3.0
	 */
	public static native long glfwGetX11Display();

	// --- [ glfwGetX11Adapter ] ---

	/** JNI method for {@link #glfwGetX11Adapter GetX11Adapter} */
	@JavadocExclude
	public static native long nglfwGetX11Adapter(long monitor);

	/**
	 * Returns the <code style="font-family: monospace">RRCrtc</code> of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The <code style="font-family: monospace">RRCrtc</code> of the specified monitor, or {@link X#None} if an error occurred.
	 *
	 * @since GLFW 3.1
	 */
	public static long glfwGetX11Adapter(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		return nglfwGetX11Adapter(monitor);
	}

	// --- [ glfwGetX11Monitor ] ---

	/** JNI method for {@link #glfwGetX11Monitor GetX11Monitor} */
	@JavadocExclude
	public static native long nglfwGetX11Monitor(long monitor);

	/**
	 * Returns the <code style="font-family: monospace">RROutput</code> of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The <code style="font-family: monospace">RROutput</code> of the specified monitor, or {@link X#None} if an error occurred.
	 *
	 * @since GLFW 3.1
	 */
	public static long glfwGetX11Monitor(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		return nglfwGetX11Monitor(monitor);
	}

	// --- [ glfwGetX11Window ] ---

	/** JNI method for {@link #glfwGetX11Window GetX11Window} */
	@JavadocExclude
	public static native long nglfwGetX11Window(long window);

	/**
	 * Returns the <code style="font-family: monospace">Window</code> of the specified window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window a GLFW window
	 *
	 * @return The <code style="font-family: monospace">Window</code> of the specified window, or {@link X#None} if an error occurred.
	 *
	 * @since GLFW 3.0
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
	 * Returns the <code style="font-family: monospace">GLXContext</code> of the specified window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window a GLFW window
	 *
	 * @return The <code style="font-family: monospace">GLXContext</code> of the specified window, or {@code NULL} if an error occurred.
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetGLXContext(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetGLXContext(window);
	}

}