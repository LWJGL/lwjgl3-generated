/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the GLFW library's Cocoa native access functions. */
public class GLFWNativeCocoa {

	/** Function address. */
	@JavadocExclude
	public final long
		GetCocoaMonitor,
		GetCocoaWindow;

	@JavadocExclude
	protected GLFWNativeCocoa() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLFWNativeCocoa(FunctionProvider provider) {
		GetCocoaMonitor = checkFunctionAddress(provider.getFunctionAddress("glfwGetCocoaMonitor"));
		GetCocoaWindow = checkFunctionAddress(provider.getFunctionAddress("glfwGetCocoaWindow"));
	}

	// --- [ Function Addresses ] ---

	private static final GLFWNativeCocoa instance = new GLFWNativeCocoa(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return GLFW.getLibrary();
	}

	/** Returns the {@link GLFWNativeCocoa} instance. */
	public static GLFWNativeCocoa getInstance() {
		return instance;
	}

	// --- [ glfwGetCocoaMonitor ] ---

	/**
	 * Returns the <code style="font-family: monospace">CGDirectDisplayID</code> of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The <code style="font-family: monospace">CGDirectDisplayID</code> of the specified monitor, or kCGNullDirectDisplay` if an error occurred.
	 *
	 * @since GLFW 3.1
	 */
	public static long glfwGetCocoaMonitor(long monitor) {
		long __functionAddress = getInstance().GetCocoaMonitor;
		if ( CHECKS )
			checkPointer(monitor);
		return invokePP(__functionAddress, monitor);
	}

	// --- [ glfwGetCocoaWindow ] ---

	/**
	 * Returns the <code style="font-family: monospace">NSWindow</code> of the specified GLFW window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the GLFW window
	 *
	 * @return The <code style="font-family: monospace">NSWindow</code> of the specified window, or nil if an error occurred.
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetCocoaWindow(long window) {
		long __functionAddress = getInstance().GetCocoaWindow;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}