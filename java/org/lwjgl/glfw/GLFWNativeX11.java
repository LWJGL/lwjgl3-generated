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

/** Native bindings to the GLFW library's X11 native access functions. */
public final class GLFWNativeX11 {

	/** Function address. */
	@JavadocExclude
	public final long
		GetX11Display,
		GetX11Adapter,
		GetX11Monitor,
		GetX11Window;

	@JavadocExclude
	public GLFWNativeX11(FunctionProvider provider) {
		GetX11Display = checkFunctionAddress(provider.getFunctionAddress("glfwGetX11Display"));
		GetX11Adapter = checkFunctionAddress(provider.getFunctionAddress("glfwGetX11Adapter"));
		GetX11Monitor = checkFunctionAddress(provider.getFunctionAddress("glfwGetX11Monitor"));
		GetX11Window = checkFunctionAddress(provider.getFunctionAddress("glfwGetX11Window"));
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLFWNativeX11} instance. */
	public static GLFWNativeX11 getInstance() {
		return checkFunctionality(LibGLFW.__GLFWNativeX11);
	}

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
	public static long glfwGetX11Display() {
		long __functionAddress = getInstance().GetX11Display;
		return invokeP(__functionAddress);
	}

	// --- [ glfwGetX11Adapter ] ---

	/**
	 * Returns the <code style="font-family: monospace">RRCrtc</code> of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The <code style="font-family: monospace">RRCrtc</code> of the specified monitor, or {@code None} if an error occurred.
	 *
	 * @since GLFW 3.1
	 */
	public static long glfwGetX11Adapter(long monitor) {
		long __functionAddress = getInstance().GetX11Adapter;
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		return invokePP(__functionAddress, monitor);
	}

	// --- [ glfwGetX11Monitor ] ---

	/**
	 * Returns the <code style="font-family: monospace">RROutput</code> of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The <code style="font-family: monospace">RROutput</code> of the specified monitor, or {@code None} if an error occurred.
	 *
	 * @since GLFW 3.1
	 */
	public static long glfwGetX11Monitor(long monitor) {
		long __functionAddress = getInstance().GetX11Monitor;
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		return invokePP(__functionAddress, monitor);
	}

	// --- [ glfwGetX11Window ] ---

	/**
	 * Returns the <code style="font-family: monospace">Window</code> of the specified window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window a GLFW window
	 *
	 * @return The <code style="font-family: monospace">Window</code> of the specified window, or {@code None} if an error occurred.
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetX11Window(long window) {
		long __functionAddress = getInstance().GetX11Window;
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}