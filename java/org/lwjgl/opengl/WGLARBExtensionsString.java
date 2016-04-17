/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/wgl_extensions_string.txt">WGL_ARB_extensions_string</a> extension.
 * 
 * <p>This extension provides a way for applications to determine which WGL extensions are supported by a device. This is the foundation upon which other WGL
 * extensions are built.</p>
 */
public class WGLARBExtensionsString {

	protected WGLARBExtensionsString() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(WGLCapabilities caps) {
		return checkFunctions(
			caps.wglGetExtensionsStringARB
		);
	}

	// --- [ wglGetExtensionsStringARB ] ---

	/**
	 * Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be {@code NULL} terminated and
	 * will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
	 * empty string is returned.
	 *
	 * @param hdc the device context to query extensions for
	 */
	public static long nwglGetExtensionsStringARB(long hdc) {
		long __functionAddress = GL.getCapabilitiesWGL().wglGetExtensionsStringARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
		}
		return callPP(__functionAddress, hdc);
	}

	/**
	 * Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be {@code NULL} terminated and
	 * will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
	 * empty string is returned.
	 *
	 * @param hdc the device context to query extensions for
	 */
	public static String wglGetExtensionsStringARB(long hdc) {
		long __result = nwglGetExtensionsStringARB(hdc);
		return memASCII(__result);
	}

}