/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to the GLFW library's MacOS X native access functions. */
public final class GLFWMacOSX {

	static { LWJGLUtil.initialize(); }

	private GLFWMacOSX() {}

	// --- [ glfwGetCocoaMonitor ] ---

	/** JNI method for {@link #glfwGetCocoaMonitor GetCocoaMonitor} */
	@JavadocExclude
	public static native long nglfwGetCocoaMonitor(long monitor);

	/**
	 * Returns the <code style="font-family: monospace">CGDirectDisplayID</code> of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The <code style="font-family: monospace">CGDirectDisplayID</code> of the specified monitor, or kCGNullDirectDisplay` if an error occurred.
	 *
	 * @since GLFW 3.1
	 */
	public static long glfwGetCocoaMonitor(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		return nglfwGetCocoaMonitor(monitor);
	}

	// --- [ glfwGetCocoaWindow ] ---

	/** JNI method for {@link #glfwGetCocoaWindow GetCocoaWindow} */
	@JavadocExclude
	public static native long nglfwGetCocoaWindow(long window);

	/**
	 * Returns the <code style="font-family: monospace">NSWindow</code> of the specified GLFW window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the GLFW window
	 *
	 * @return The <code style="font-family: monospace">NSWindow</code> of the specified window, or nil if an error occurred.
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetCocoaWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetCocoaWindow(window);
	}

	// --- [ glfwGetNSGLContext ] ---

	/** JNI method for {@link #glfwGetNSGLContext GetNSGLContext} */
	@JavadocExclude
	public static native long nglfwGetNSGLContext(long window);

	/**
	 * Returns the <code style="font-family: monospace">NSOpenGLContext</code> of the specified GLFW window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the GLFW window
	 *
	 * @return The <code style="font-family: monospace">NSOpenGLContext</code> of the specified window, or nil if an error occurred.
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetNSGLContext(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetNSGLContext(window);
	}

}