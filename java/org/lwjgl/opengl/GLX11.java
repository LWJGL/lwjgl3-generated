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

/** Native bindings to GLX 1.1. */
public class GLX11 {

	/** Names for attributes to {@link #glXGetClientString GetClientString}. */
	public static final int
		GLX_VENDOR     = 0x1,
		GLX_VERSION    = 0x2,
		GLX_EXTENSIONS = 0x3;

	/** Function address. */
	@JavadocExclude
	public final long
		QueryExtensionsString,
		GetClientString,
		QueryServerString;

	@JavadocExclude
	protected GLX11() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLX11(FunctionProvider provider) {
		QueryExtensionsString = provider.getFunctionAddress("glXQueryExtensionsString");
		GetClientString = provider.getFunctionAddress("glXGetClientString");
		QueryServerString = provider.getFunctionAddress("glXQueryServerString");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLX11} instance of the current context. */
	public static GLX11 getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link GLX11} instance of the specified {@link GLCapabilities}. */
	public static GLX11 getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__GLX11);
	}

	static GLX11 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX11") ) return null;

		GLX11 funcs = new GLX11(provider);

		boolean supported = checkFunctions(
			funcs.QueryExtensionsString, funcs.GetClientString, funcs.QueryServerString
		);

		return GL.checkExtension("GLX11", funcs, supported);
	}

	// --- [ glXQueryExtensionsString ] ---

	/** Unsafe version of {@link #glXQueryExtensionsString QueryExtensionsString} */
	@JavadocExclude
	public static long nglXQueryExtensionsString(long display, int screen) {
		long __functionAddress = getInstance().QueryExtensionsString;
		if ( CHECKS )
			checkPointer(display);
		return callPIP(__functionAddress, display, screen);
	}

	/**
	 * Returns a string describing which GLX extensions are supported on the connection.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen number
	 */
	public static String glXQueryExtensionsString(long display, int screen) {
		long __result = nglXQueryExtensionsString(display, screen);
		return memDecodeASCII(__result);
	}

	// --- [ glXGetClientString ] ---

	/** Unsafe version of {@link #glXGetClientString GetClientString} */
	@JavadocExclude
	public static long nglXGetClientString(long display, int name) {
		long __functionAddress = getInstance().GetClientString;
		if ( CHECKS )
			checkPointer(display);
		return callPIP(__functionAddress, display, name);
	}

	/**
	 * Returns a pointer to a string describing some aspect of the client library.
	 *
	 * @param display the connection to the X server
	 * @param name    the string to query
	 */
	public static String glXGetClientString(long display, int name) {
		long __result = nglXGetClientString(display, name);
		return memDecodeASCII(__result);
	}

	// --- [ glXQueryServerString ] ---

	/** Unsafe version of {@link #glXQueryServerString QueryServerString} */
	@JavadocExclude
	public static long nglXQueryServerString(long display, int screen, int name) {
		long __functionAddress = getInstance().QueryServerString;
		if ( CHECKS )
			checkPointer(display);
		return callPIIP(__functionAddress, display, screen, name);
	}

	/**
	 * Returns a pointer to a string describing some aspect of the server's GLX extension.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen number
	 * @param name    the string to query
	 */
	public static String glXQueryServerString(long display, int screen, int name) {
		long __result = nglXQueryServerString(display, screen, name);
		return memDecodeASCII(__result);
	}

}