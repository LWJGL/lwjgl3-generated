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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/wgl_create_context.txt">WGL_ARB_create_context</a> extension.
 * 
 * <p>With the advent of new versions of OpenGL which deprecate features and/or break backward compatibility with older versions, there is a need and desire
 * to indicate at context creation which interface will be used. This extension add a new context creation routine with attributes specifying the GL
 * version and context properties requested for the context.</p>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string}.</p>
 */
public final class WGLARBCreateContext {

	/** Accepted as an attribute name in {@code attribList}. */
	public static final int
		WGL_CONTEXT_MAJOR_VERSION_ARB = 0x2091,
		WGL_CONTEXT_MINOR_VERSION_ARB = 0x2092,
		WGL_CONTEXT_LAYER_PLANE_ARB   = 0x2093,
		WGL_CONTEXT_FLAGS_ARB         = 0x2094;

	/** Accepted as bits in the attribute value for {@link #WGL_CONTEXT_FLAGS_ARB CONTEXT_FLAGS_ARB} in {@code attribList}. */
	public static final int
		WGL_CONTEXT_DEBUG_BIT_ARB              = 0x1,
		WGL_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB = 0x2;

	/** New errors returned by {@link org.lwjgl.system.windows.WinBase#GetLastError}. */
	public static final int ERROR_INVALID_VERSION_ARB = 0x2095;

	/** Function address. */
	@JavadocExclude
	public final long CreateContextAttribsARB;

	@JavadocExclude
	public WGLARBCreateContext(FunctionProvider provider) {
		CreateContextAttribsARB = provider.getFunctionAddress("wglCreateContextAttribsARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLARBCreateContext} instance for the current context. */
	public static WGLARBCreateContext getInstance() {
		return checkFunctionality(GL.getCapabilities().__WGLARBCreateContext);
	}

	static WGLARBCreateContext create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_ARB_create_context") ) return null;

		WGLARBCreateContext funcs = new WGLARBCreateContext(provider);

		boolean supported = checkFunctions(
			funcs.CreateContextAttribsARB
		);

		return GL.checkExtension("WGL_ARB_create_context", funcs, supported);
	}

	// --- [ wglCreateContextAttribsARB ] ---

	/** JNI method for {@link #wglCreateContextAttribsARB CreateContextAttribsARB} */
	@JavadocExclude
	public static native long nwglCreateContextAttribsARB(long hdc, long shareContext, long attribList, long __functionAddress);

	/** Unsafe version of {@link #wglCreateContextAttribsARB CreateContextAttribsARB} */
	@JavadocExclude
	public static long nwglCreateContextAttribsARB(long hdc, long shareContext, long attribList) {
		long __functionAddress = getInstance().CreateContextAttribsARB;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nwglCreateContextAttribsARB(hdc, shareContext, attribList, __functionAddress);
	}

	/**
	 * Creates an OpenGL context.
	 * 
	 * <p>If {@code shareContext} is not {@code NULL}, then all shareable data (excluding OpenGL texture objects named 0) will be shared by {@code shareContext}, all
	 * other contexts {@code shareContext} already shares with, and the newly created context. An arbitrary number of contexts can share data in this fashion.</p>
	 *
	 * @param hdc          
	 * @param shareContext 
	 * @param attribList   a list of attributes for the context. The list consists of a sequence of &lt;name, value&gt; pairs terminated by the value 0. If an attribute is not
	 *                     specified in {@code attribList}, then the default value is used instead. If an attribute is specified more than once, then the last value specified
	 *                     is used.
	 */
	public static long wglCreateContextAttribsARB(long hdc, long shareContext, ByteBuffer attribList) {
		if ( LWJGLUtil.CHECKS )
			if ( attribList != null ) checkNT4(attribList);
		return nwglCreateContextAttribsARB(hdc, shareContext, memAddressSafe(attribList));
	}

	/** Alternative version of: {@link #wglCreateContextAttribsARB CreateContextAttribsARB} */
	public static long wglCreateContextAttribsARB(long hdc, long shareContext, IntBuffer attribList) {
		if ( LWJGLUtil.CHECKS )
			if ( attribList != null ) checkNT(attribList);
		return nwglCreateContextAttribsARB(hdc, shareContext, memAddressSafe(attribList));
	}

}