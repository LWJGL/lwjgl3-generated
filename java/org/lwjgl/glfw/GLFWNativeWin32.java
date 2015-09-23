/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the GLFW library's Win32 native access functions. */
public final class GLFWNativeWin32 {

	/** Function address. */
	@JavadocExclude
	public final long
		GetWin32Adapter,
		GetWin32Monitor,
		GetWin32Window;

	@JavadocExclude
	public GLFWNativeWin32(FunctionProvider provider) {
		GetWin32Adapter = checkFunctionAddress(provider.getFunctionAddress("glfwGetWin32Adapter"));
		GetWin32Monitor = checkFunctionAddress(provider.getFunctionAddress("glfwGetWin32Monitor"));
		GetWin32Window = checkFunctionAddress(provider.getFunctionAddress("glfwGetWin32Window"));
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLFWNativeWin32} instance. */
	public static GLFWNativeWin32 getInstance() {
		return checkFunctionality(LibGLFW.__GLFWNativeWin32);
	}

	// --- [ glfwGetWin32Adapter ] ---

	/** Unsafe version of {@link #glfwGetWin32Adapter GetWin32Adapter} */
	@JavadocExclude
	public static long nglfwGetWin32Adapter(long monitor) {
		long __functionAddress = getInstance().GetWin32Adapter;
		if ( LWJGLUtil.CHECKS )
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
	 * @since GLFW 3.1
	 */
	public static String glfwGetWin32Adapter(long monitor) {
		long __result = nglfwGetWin32Adapter(monitor);
		return memDecodeUTF8(__result);
	}

	// --- [ glfwGetWin32Monitor ] ---

	/** Unsafe version of {@link #glfwGetWin32Monitor GetWin32Monitor} */
	@JavadocExclude
	public static long nglfwGetWin32Monitor(long monitor) {
		long __functionAddress = getInstance().GetWin32Monitor;
		if ( LWJGLUtil.CHECKS )
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
	 * @since GLFW 3.1
	 */
	public static String glfwGetWin32Monitor(long monitor) {
		long __result = nglfwGetWin32Monitor(monitor);
		return memDecodeUTF8(__result);
	}

	// --- [ glfwGetWin32Window ] ---

	/**
	 * Returns the <code style="font-family: monospace">HWND</code> of the specified window.
	 * 
	 * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the GLFW window
	 *
	 * @return The <code style="font-family: monospace">HWND</code> of the specified window, or {@code NULL} if an error occurred.
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetWin32Window(long window) {
		long __functionAddress = getInstance().GetWin32Window;
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

}