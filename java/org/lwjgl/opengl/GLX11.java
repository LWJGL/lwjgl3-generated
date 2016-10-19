/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

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

	protected GLX11() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLXCapabilities caps) {
		return checkFunctions(
			caps.glXQueryExtensionsString, caps.glXGetClientString, caps.glXQueryServerString
		);
	}

	// --- [ glXQueryExtensionsString ] ---

	/** Unsafe version of: {@link #glXQueryExtensionsString QueryExtensionsString} */
	public static long nglXQueryExtensionsString(long display, int screen) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryExtensionsString;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPP(__functionAddress, display, screen);
	}

	/**
	 * Returns a string describing which GLX extensions are supported on the connection.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen number
	 */
	public static String glXQueryExtensionsString(long display, int screen) {
		long __result = nglXQueryExtensionsString(display, screen);
		return memASCII(__result);
	}

	// --- [ glXGetClientString ] ---

	/** Unsafe version of: {@link #glXGetClientString GetClientString} */
	public static long nglXGetClientString(long display, int name) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetClientString;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPP(__functionAddress, display, name);
	}

	/**
	 * Returns a pointer to a string describing some aspect of the client library.
	 *
	 * @param display the connection to the X server
	 * @param name    the string to query
	 */
	public static String glXGetClientString(long display, int name) {
		long __result = nglXGetClientString(display, name);
		return memASCII(__result);
	}

	// --- [ glXQueryServerString ] ---

	/** Unsafe version of: {@link #glXQueryServerString QueryServerString} */
	public static long nglXQueryServerString(long display, int screen, int name) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryServerString;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPP(__functionAddress, display, screen, name);
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
		return memASCII(__result);
	}

}