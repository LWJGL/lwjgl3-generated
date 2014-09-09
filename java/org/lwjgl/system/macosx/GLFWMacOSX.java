/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to the GLFW library's MacOS X native access functions. */
public final class GLFWMacOSX {

	private GLFWMacOSX() {}

	// --- [ glfwGetCocoaMonitor ] ---

	/** JNI method for {@link #glfwGetCocoaMonitor GetCocoaMonitor} */
	@JavadocExclude
	public static native long nglfwGetCocoaMonitor(long monitor);

	/**
	 * Returns the {@code CGDirectDisplayID} of the specified monitor.
	 *
	 * @param monitor the GLFW monitor
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
	 * Returns the <code style="font-family: monospace">NSWindow</code> of the given GLFW window.
	 *
	 * @param window the GLFW window
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
	 * Returns the <code style="font-family: monospace">NSOpenGLContext</code> of the given GLFW window.
	 *
	 * @param window the GLFW window
	 */
	public static long glfwGetNSGLContext(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetNSGLContext(window);
	}

}