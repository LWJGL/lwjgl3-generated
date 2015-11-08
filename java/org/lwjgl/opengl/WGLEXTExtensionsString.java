/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/wgl_extensions_string.txt">WGL_EXT_extensions_string</a> extension. */
public class WGLEXTExtensionsString {

	/** Function address. */
	@JavadocExclude
	public final long GetExtensionsStringEXT;

	@JavadocExclude
	protected WGLEXTExtensionsString() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public WGLEXTExtensionsString(FunctionProvider provider) {
		GetExtensionsStringEXT = provider.getFunctionAddress("wglGetExtensionsStringEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLEXTExtensionsString} instance of the current context. */
	public static WGLEXTExtensionsString getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link WGLEXTExtensionsString} instance of the specified {@link GLCapabilities}. */
	public static WGLEXTExtensionsString getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__WGLEXTExtensionsString);
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

	/** Unsafe version of {@link #wglGetExtensionsStringEXT GetExtensionsStringEXT} */
	@JavadocExclude
	public static long nwglGetExtensionsStringEXT() {
		long __functionAddress = getInstance().GetExtensionsStringEXT;
		return callP(__functionAddress);
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