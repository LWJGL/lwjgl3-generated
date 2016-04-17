/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the GLFW library's X11 native access functions. */
public class GLFWNativeX11 {

	protected GLFWNativeX11() {
		throw new UnsupportedOperationException();
	}

	/** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			GetX11Display = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Display"),
			GetX11Adapter = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Adapter"),
			GetX11Monitor = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Monitor"),
			GetX11Window  = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Window");

	}

	// --- [ glfwGetX11Display ] ---

	/**
	 * Returns the <code>Display</code> used by GLFW.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @return The <code>Display</code> used by GLFW, or {@code NULL} if an error occurred.
	 *
	 * @since version 3.0
	 */
	public static long glfwGetX11Display() {
		long __functionAddress = Functions.GetX11Display;
		return invokeP(__functionAddress);
	}

	// --- [ glfwGetX11Adapter ] ---

	/**
	 * Returns the <code>RRCrtc</code> of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The <code>RRCrtc</code> of the specified monitor, or {@code None} if an error occurred.
	 *
	 * @since version 3.1
	 */
	public static long glfwGetX11Adapter(long monitor) {
		long __functionAddress = Functions.GetX11Adapter;
		if ( CHECKS )
			checkPointer(monitor);
		return invokePP(__functionAddress, monitor);
	}

	// --- [ glfwGetX11Monitor ] ---

	/**
	 * Returns the <code>RROutput</code> of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The <code>RROutput</code> of the specified monitor, or {@code None} if an error occurred.
	 *
	 * @since version 3.1
	 */
	public static long glfwGetX11Monitor(long monitor) {
		long __functionAddress = Functions.GetX11Monitor;
		if ( CHECKS )
			checkPointer(monitor);
		return invokePP(__functionAddress, monitor);
	}

	// --- [ glfwGetX11Window ] ---

	/**
	 * Returns the <code>Window</code> of the specified window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window a GLFW window
	 *
	 * @return The <code>Window</code> of the specified window, or {@code None} if an error occurred.
	 *
	 * @since version 3.0
	 */
	public static long glfwGetX11Window(long window) {
		long __functionAddress = Functions.GetX11Window;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}