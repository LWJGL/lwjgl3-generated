/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the GLFW library's NSGL native access functions. */
public class GLFWNativeNSGL {

	/** Function address. */
	@JavadocExclude
	public final long GetNSGLContext;

	@JavadocExclude
	protected GLFWNativeNSGL() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLFWNativeNSGL(FunctionProvider provider) {
		GetNSGLContext = checkFunctionAddress(provider.getFunctionAddress("glfwGetNSGLContext"));
	}

	// --- [ Function Addresses ] ---

	private static final GLFWNativeNSGL instance = new GLFWNativeNSGL(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return GLFW.getLibrary();
	}

	/** Returns the {@link GLFWNativeNSGL} instance. */
	public static GLFWNativeNSGL getInstance() {
		return instance;
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
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}