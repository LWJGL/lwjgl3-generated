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

/** Native bindings to the GLFW library's WGL native access functions. */
public final class GLFWNativeWGL {

	/** Function address. */
	@JavadocExclude
	public final long GetWGLContext;

	@JavadocExclude
	public GLFWNativeWGL(FunctionProvider provider) {
		GetWGLContext = checkFunctionAddress(provider.getFunctionAddress("glfwGetWGLContext"));
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLFWNativeWGL} instance. */
	public static GLFWNativeWGL getInstance() {
		return checkFunctionality(LibGLFW.__GLFWNativeWGL);
	}

	// --- [ glfwGetWGLContext ] ---

	/**
	 * Returns the <code style="font-family: monospace">HGLRC</code> of the specified window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the GLFW window
	 *
	 * @return The <code style="font-family: monospace">HGLRC</code> of the specified window, or {@code NULL} if an error occurred.
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetWGLContext(long window) {
		long __functionAddress = getInstance().GetWGLContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}