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

	// --- [ glfwGetCocoaWindow ] ---

	/** JNI method for {@link #glfwGetCocoaWindow glfwGetCocoaWindow} */
	@JavadocExclude
	public static native long nglfwGetCocoaWindow(long window);

	/**
	 * Returns the <code>NSWindow</code> of the given GLFW window.
	 *
	 * @param window the GLFW window
	 */
	public static long glfwGetCocoaWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetCocoaWindow(window);
	}

	// --- [ glfwGetNSGLContext ] ---

	/** JNI method for {@link #glfwGetNSGLContext glfwGetNSGLContext} */
	@JavadocExclude
	public static native long nglfwGetNSGLContext(long window);

	/**
	 * Returns the <code>NSOpenGLContext</code> of the given GLFW window.
	 *
	 * @param window the GLFW window
	 */
	public static long glfwGetNSGLContext(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetNSGLContext(window);
	}

}