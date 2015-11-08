/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the GLFW library's WGL native access functions. */
public class GLFWNativeWGL {

	/** Function address. */
	@JavadocExclude
	public final long GetWGLContext;

	@JavadocExclude
	protected GLFWNativeWGL() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLFWNativeWGL(FunctionProvider provider) {
		GetWGLContext = checkFunctionAddress(provider.getFunctionAddress("glfwGetWGLContext"));
	}

	// --- [ Function Addresses ] ---

	private static final GLFWNativeWGL instance = new GLFWNativeWGL(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return GLFW.getLibrary();
	}

	/** Returns the {@link GLFWNativeWGL} instance. */
	public static GLFWNativeWGL getInstance() {
		return instance;
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
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}