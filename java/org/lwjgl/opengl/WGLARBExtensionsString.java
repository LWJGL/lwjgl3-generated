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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/wgl_extensions_string.txt">WGL_ARB_extensions_string</a> extension.
 * <p/>
 * This extension provides a way for applications to determine which WGL extensions are supported by a device. This is the foundation upon which other WGL
 * extensions are built.
 */
public final class WGLARBExtensionsString {

	private WGLARBExtensionsString() {}

	// --- [ wglGetExtensionsStringARB ] ---

	/** JNI method for {@link #wglGetExtensionsStringARB(long)} */
	public static native long nwglGetExtensionsStringARB(long hdc, long __functionAddress);

	/**
	 * Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be NULL terminated and
	 * will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
	 * empty string is returned.
	 *
	 * @param hdc the device context to query extensions for
	 */
	public static String wglGetExtensionsStringARB(long hdc) {
		long __functionAddress = getInstance().wglGetExtensionsStringARB;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
		}
		long __result = nwglGetExtensionsStringARB(hdc, __functionAddress);
		return memDecodeASCII(memByteBufferNT1(__result));
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__WGLARBExtensionsString;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_ARB_extensions_string") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  GL.isFunctionSupported(funcs.wglGetExtensionsStringARB);

		return GL.checkExtension("WGL_ARB_extensions_string", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code WGLARBExtensionsString}. */
	public static final class Functions implements FunctionMap {

		public final long wglGetExtensionsStringARB;

		public Functions(FunctionProvider provider) {
			wglGetExtensionsStringARB = provider.getFunctionAddress("wglGetExtensionsStringARB");
		}

	}

}