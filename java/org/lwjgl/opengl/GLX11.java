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

/** Native bindings to GLX 1.1. */
public final class GLX11 {

	/** Names for attributes to {@link #glXGetClientString GetClientString}. */
	public static final int
		GLX_VENDOR     = 0x1,
		GLX_VERSION    = 0x2,
		GLX_EXTENSIONS = 0x3;

	/** Function address. */
	@JavadocExclude
	public final long
		glXQueryExtensionsString,
		glXGetClientString,
		glXQueryServerString;

	@JavadocExclude
	public GLX11(FunctionProvider provider) {
		glXQueryExtensionsString = provider.getFunctionAddress("glXQueryExtensionsString");
		glXGetClientString = provider.getFunctionAddress("glXGetClientString");
		glXQueryServerString = provider.getFunctionAddress("glXQueryServerString");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLX11} instance for the current context. */
	public static GLX11 getInstance() {
		return GL.getCapabilities().__GLX11;
	}

	static GLX11 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_11") ) return null;

		GLX11 funcs = new GLX11(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glXQueryExtensionsString) &&
			GL.isFunctionSupported(funcs.glXGetClientString) &&
			GL.isFunctionSupported(funcs.glXQueryServerString);

		return GL.checkExtension("GLX_11", funcs, supported);
	}

	// --- [ glXQueryExtensionsString ] ---

	/** JNI method for {@link #glXQueryExtensionsString glXQueryExtensionsString} */
	@JavadocExclude
	public static native long nglXQueryExtensionsString(long display, int screen, long __functionAddress);

	/**
	 * Returns a string describing which GLX extensions are supported on the connection.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen number
	 */
	public static String glXQueryExtensionsString(long display, int screen) {
		long __functionAddress = getInstance().glXQueryExtensionsString;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		long __result = nglXQueryExtensionsString(display, screen, __functionAddress);
		return memDecodeASCII(memByteBufferNT1(__result));
	}

	// --- [ glXGetClientString ] ---

	/** JNI method for {@link #glXGetClientString glXGetClientString} */
	@JavadocExclude
	public static native long nglXGetClientString(long display, int name, long __functionAddress);

	/**
	 * Returns a pointer to a string describing some aspect of the client library.
	 *
	 * @param display the connection to the X server
	 * @param name    the string to query
	 */
	public static String glXGetClientString(long display, int name) {
		long __functionAddress = getInstance().glXGetClientString;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		long __result = nglXGetClientString(display, name, __functionAddress);
		return memDecodeASCII(memByteBufferNT1(__result));
	}

	// --- [ glXQueryServerString ] ---

	/** JNI method for {@link #glXQueryServerString glXQueryServerString} */
	@JavadocExclude
	public static native long nglXQueryServerString(long display, int screen, int name, long __functionAddress);

	/**
	 * Returns a pointer to a string describing some aspect of the server's GLX extension.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen number
	 * @param name    the string to query
	 */
	public static String glXQueryServerString(long display, int screen, int name) {
		long __functionAddress = getInstance().glXQueryServerString;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		long __result = nglXQueryServerString(display, screen, name, __functionAddress);
		return memDecodeASCII(memByteBufferNT1(__result));
	}

}