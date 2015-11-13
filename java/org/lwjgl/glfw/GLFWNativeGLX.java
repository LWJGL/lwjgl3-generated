/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the GLFW library's GLX native access functions. */
public class GLFWNativeGLX {

	/** Function address. */
	@JavadocExclude
	public final long
		GetGLXContext,
		GetGLXWindow;

	@JavadocExclude
	protected GLFWNativeGLX() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLFWNativeGLX(FunctionProvider provider) {
		GetGLXContext = checkFunctionAddress(provider.getFunctionAddress("glfwGetGLXContext"));
		GetGLXWindow = checkFunctionAddress(provider.getFunctionAddress("glfwGetGLXWindow"));
	}

	// --- [ Function Addresses ] ---

	private static final GLFWNativeGLX instance = new GLFWNativeGLX(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return GLFW.getLibrary();
	}

	/** Returns the {@link GLFWNativeGLX} instance. */
	public static GLFWNativeGLX getInstance() {
		return instance;
	}

	// --- [ glfwGetGLXContext ] ---

	/**
	 * Returns the {@code GLXContext} of the specified window.
	 * 
	 * <p>This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window a GLFW window
	 *
	 * @return the {@code GLXContext} of the specified window, or {@code NULL} if an error occurred.
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetGLXContext(long window) {
		long __functionAddress = getInstance().GetGLXContext;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

	// --- [ glfwGetGLXWindow ] ---

	/**
	 * Returns the {@code GLXWindow} of the specified window.
	 * 
	 * <p>This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window a GLFW window
	 *
	 * @return the {@code GLXWindow} of the specified window, or {@code None} if an error occurred.
	 *
	 * @since GLFW 3.2
	 */
	public static long glfwGetGLXWindow(long window) {
		long __functionAddress = getInstance().GetGLXWindow;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}