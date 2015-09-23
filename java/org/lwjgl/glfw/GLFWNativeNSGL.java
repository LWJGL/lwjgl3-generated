/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the GLFW library's NSGL native access functions. */
public final class GLFWNativeNSGL {

	/** Function address. */
	@JavadocExclude
	public final long GetNSGLContext;

	@JavadocExclude
	public GLFWNativeNSGL(FunctionProvider provider) {
		GetNSGLContext = checkFunctionAddress(provider.getFunctionAddress("glfwGetNSGLContext"));
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLFWNativeNSGL} instance. */
	public static GLFWNativeNSGL getInstance() {
		return checkFunctionality(LibGLFW.__GLFWNativeNSGL);
	}

	// --- [ glfwGetNSGLContext ] ---

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
		long __functionAddress = getInstance().GetNSGLContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}