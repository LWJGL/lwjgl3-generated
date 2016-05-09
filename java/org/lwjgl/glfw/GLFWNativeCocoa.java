/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the GLFW library's Cocoa native access functions. */
public class GLFWNativeCocoa {

	protected GLFWNativeCocoa() {
		throw new UnsupportedOperationException();
	}

	/** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			GetCocoaMonitor = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetCocoaMonitor"),
			GetCocoaWindow  = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetCocoaWindow");

	}

	// --- [ glfwGetCocoaMonitor ] ---

	/**
	 * Returns the <code>CGDirectDisplayID</code> of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The <code>CGDirectDisplayID</code> of the specified monitor, or {@code kCGNullDirectDisplay} if an error occurred.
	 *
	 * @since version 3.1
	 */
	public static int glfwGetCocoaMonitor(long monitor) {
		long __functionAddress = Functions.GetCocoaMonitor;
		if ( CHECKS )
			checkPointer(monitor);
		return invokePI(__functionAddress, monitor);
	}

	// --- [ glfwGetCocoaWindow ] ---

	/**
	 * Returns the <code>NSWindow</code> of the specified GLFW window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the GLFW window
	 *
	 * @return The <code>NSWindow</code> of the specified window, or nil if an error occurred.
	 *
	 * @since version 3.0
	 */
	public static long glfwGetCocoaWindow(long window) {
		long __functionAddress = Functions.GetCocoaWindow;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}