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

/** Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/wgl_extensions_string.txt">WGL_EXT_extensions_string</a> extension. */
public class WGLEXTExtensionsString {

	protected WGLEXTExtensionsString() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(WGLCapabilities caps) {
		return checkFunctions(
			caps.wglGetExtensionsStringEXT
		);
	}

	// --- [ wglGetExtensionsStringEXT ] ---

	/**
	 * Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be {@code NULL} terminated and
	 * will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
	 * empty string is returned.
	 */
	public static long nwglGetExtensionsStringEXT() {
		long __functionAddress = GL.getCapabilitiesWGL().wglGetExtensionsStringEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress);
	}

	/**
	 * Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be {@code NULL} terminated and
	 * will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
	 * empty string is returned.
	 */
	public static String wglGetExtensionsStringEXT() {
		long __result = nwglGetExtensionsStringEXT();
		return memASCII(__result);
	}

}