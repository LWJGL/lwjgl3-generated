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

/** Native bindings to the GLFW library's GLX native access functions. */
public final class GLFWNativeGLX {

	/** Function address. */
	@JavadocExclude
	public final long GetGLXContext;

	@JavadocExclude
	public GLFWNativeGLX(FunctionProvider provider) {
		GetGLXContext = checkFunctionAddress(provider.getFunctionAddress("glfwGetGLXContext"));
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLFWNativeGLX} instance. */
	public static GLFWNativeGLX getInstance() {
		return checkFunctionality(LibGLFW.__GLFWNativeGLX);
	}

	// --- [ glfwGetGLXContext ] ---

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
		long __functionAddress = getInstance().GetGLXContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}