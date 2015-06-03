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
 * 
 * <p>This extension provides a way for applications to determine which WGL extensions are supported by a device. This is the foundation upon which other WGL
 * extensions are built.</p>
 */
public final class WGLARBExtensionsString {

	/** Function address. */
	@JavadocExclude
	public final long GetExtensionsStringARB;

	@JavadocExclude
	public WGLARBExtensionsString(FunctionProvider provider) {
		GetExtensionsStringARB = provider.getFunctionAddress("wglGetExtensionsStringARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLARBExtensionsString} instance for the current context. */
	public static WGLARBExtensionsString getInstance() {
		return checkFunctionality(GL.getCapabilities().__WGLARBExtensionsString);
	}

	static WGLARBExtensionsString create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_ARB_extensions_string") ) return null;

		WGLARBExtensionsString funcs = new WGLARBExtensionsString(provider);

		boolean supported = checkFunctions(
			funcs.GetExtensionsStringARB
		);

		return GL.checkExtension("WGL_ARB_extensions_string", funcs, supported);
	}

	// --- [ wglGetExtensionsStringARB ] ---

	/** JNI method for {@link #wglGetExtensionsStringARB GetExtensionsStringARB} */
	@JavadocExclude
	public static native long nwglGetExtensionsStringARB(long hdc, long __functionAddress);

	/** Unsafe version of {@link #wglGetExtensionsStringARB GetExtensionsStringARB} */
	@JavadocExclude
	public static long nwglGetExtensionsStringARB(long hdc) {
		long __functionAddress = getInstance().GetExtensionsStringARB;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nwglGetExtensionsStringARB(hdc, __functionAddress);
	}

	/**
	 * Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be NULL terminated and
	 * will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
	 * empty string is returned.
	 *
	 * @param hdc the device context to query extensions for
	 */
	public static String wglGetExtensionsStringARB(long hdc) {
		long __result = nwglGetExtensionsStringARB(hdc);
		return memDecodeASCII(__result);
	}

}