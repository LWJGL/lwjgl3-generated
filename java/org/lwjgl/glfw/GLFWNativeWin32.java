/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the GLFW library's Win32 native access functions. */
public class GLFWNativeWin32 {

	/** Function address. */
	public final long
		GetWin32Adapter,
		GetWin32Monitor,
		GetWin32Window;

	protected GLFWNativeWin32() {
		throw new UnsupportedOperationException();
	}

	public GLFWNativeWin32(FunctionProvider provider) {
		GetWin32Adapter = checkFunctionAddress(provider.getFunctionAddress("glfwGetWin32Adapter"));
		GetWin32Monitor = checkFunctionAddress(provider.getFunctionAddress("glfwGetWin32Monitor"));
		GetWin32Window = checkFunctionAddress(provider.getFunctionAddress("glfwGetWin32Window"));
	}

	// --- [ Function Addresses ] ---

	private static final GLFWNativeWin32 instance = new GLFWNativeWin32(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return GLFW.getLibrary();
	}

	/** Returns the {@link GLFWNativeWin32} instance. */
	public static GLFWNativeWin32 getInstance() {
		return instance;
	}

	// --- [ glfwGetWin32Adapter ] ---

	/** Unsafe version of {@link #glfwGetWin32Adapter GetWin32Adapter} */
	public static long nglfwGetWin32Adapter(long monitor) {
		long __functionAddress = getInstance().GetWin32Adapter;
		if ( CHECKS )
			checkPointer(monitor);
		return invokePP(__functionAddress, monitor);
	}

	/**
	 * Returns the adapter device name of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The UTF-8 encoded adapter device name (for example `\\.\DISPLAY1`) of the specified monitor, or {@code NULL} if an error occurred.
	 *
	 * @since version 3.1
	 */
	public static String glfwGetWin32Adapter(long monitor) {
		long __result = nglfwGetWin32Adapter(monitor);
		return memDecodeUTF8(__result);
	}

	// --- [ glfwGetWin32Monitor ] ---

	/** Unsafe version of {@link #glfwGetWin32Monitor GetWin32Monitor} */
	public static long nglfwGetWin32Monitor(long monitor) {
		long __functionAddress = getInstance().GetWin32Monitor;
		if ( CHECKS )
			checkPointer(monitor);
		return invokePP(__functionAddress, monitor);
	}

	/**
	 * Returns the display device name of the specified monitor.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param monitor the GLFW monitor
	 *
	 * @return The UTF-8 encoded display device name (for example `\\.\DISPLAY1\Monitor0`) of the specified monitor, or {@code NULL} if an error occurred.
	 *
	 * @since version 3.1
	 */
	public static String glfwGetWin32Monitor(long monitor) {
		long __result = nglfwGetWin32Monitor(monitor);
		return memDecodeUTF8(__result);
	}

	// --- [ glfwGetWin32Window ] ---

	/**
	 * Returns the <code>HWND</code> of the specified window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the GLFW window
	 *
	 * @return The <code>HWND</code> of the specified window, or {@code NULL} if an error occurred.
	 *
	 * @since version 3.0
	 */
	public static long glfwGetWin32Window(long window) {
		long __functionAddress = getInstance().GetWin32Window;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}