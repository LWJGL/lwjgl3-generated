/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/wgl_extensions_string.txt">WGL_EXT_extensions_string</a> extension. */
public final class WGLEXTExtensionsString {

	/** Function address. */
	@JavadocExclude
	public final long GetExtensionsStringEXT;

	@JavadocExclude
	public WGLEXTExtensionsString(FunctionProvider provider) {
		GetExtensionsStringEXT = provider.getFunctionAddress("wglGetExtensionsStringEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLEXTExtensionsString} instance for the current context. */
	public static WGLEXTExtensionsString getInstance() {
		return checkFunctionality(GL.getCapabilities().__WGLEXTExtensionsString);
	}

	static WGLEXTExtensionsString create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_EXT_extensions_string") ) return null;

		WGLEXTExtensionsString funcs = new WGLEXTExtensionsString(provider);

		boolean supported = checkFunctions(
			funcs.GetExtensionsStringEXT
		);

		return GL.checkExtension("WGL_EXT_extensions_string", funcs, supported);
	}

	// --- [ wglGetExtensionsStringEXT ] ---

	/** JNI method for {@link #wglGetExtensionsStringEXT GetExtensionsStringEXT} */
	@JavadocExclude
	public static native long nwglGetExtensionsStringEXT(long __functionAddress);

	/** Unsafe version of {@link #wglGetExtensionsStringEXT GetExtensionsStringEXT} */
	@JavadocExclude
	public static long nwglGetExtensionsStringEXT() {
		long __functionAddress = getInstance().GetExtensionsStringEXT;
		return nwglGetExtensionsStringEXT(__functionAddress);
	}

	/**
	 * Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be NULL terminated and
	 * will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
	 * empty string is returned.
	 */
	public static String wglGetExtensionsStringEXT() {
		long __result = nwglGetExtensionsStringEXT();
		return memDecodeASCII(__result);
	}

}