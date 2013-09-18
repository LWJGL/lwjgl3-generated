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

import org.lwjgl.system.linux.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/glx_create_context.txt">GLX_ARB_create_context</a> extension.
 * <p/>
 * With the advent of new versions of OpenGL which deprecate features and/or break backward compatibility with older versions, there is a need and desire
 * to indicate at context creation which interface will be used. These extensions add a new context creation routine with attributes specifying the GL
 * version and context properties requested for the context, and additionally add an attribute specifying the GL profile requested for a context of OpenGL
 * 3.2 or later. It also allows making an OpenGL 3.0 or later context current without providing a default framebuffer.
 */
public final class GLXARBCreateContext {

	/** Accepted as an attribute name in {@code attrib_list}: */
	public static final int
		GLX_CONTEXT_MAJOR_VERSION_ARB = 0x2091,
		GLX_CONTEXT_MINOR_VERSION_ARB = 0x2092,
		GLX_CONTEXT_FLAGS_ARB         = 0x2094,
		GLX_CONTEXT_PROFILE_MASK_ARB  = 0x9126;

	/** Accepted as bits in the attribute value for {@link #GLX_CONTEXT_FLAGS_ARB CONTEXT_FLAGS_ARB} in {@code attrib_list}: */
	public static final int
		GLX_CONTEXT_DEBUG_BIT_ARB              = 0x1,
		GLX_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB = 0x2;

	/** Accepted as bits in the attribute value for {@link #GLX_CONTEXT_PROFILE_MASK_ARB CONTEXT_PROFILE_MASK_ARB} in {@code attrib_list}: */
	public static final int
		GLX_CONTEXT_CORE_PROFILE_BIT_ARB          = 0x1,
		GLX_CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB = 0x2;

	private GLXARBCreateContext() {}

	// --- [ glXCreateContextAttribsARB ] ---

	/** JNI method for {@link #glXCreateContextAttribsARB glXCreateContextAttribsARB} */
	public static native long nglXCreateContextAttribsARB(long display, long config, long share_context, int direct, long attrib_list, long __functionAddress);

	/**
	 * Creates an OpenGL rendering context.
	 * <p/>
	 * If {@code glXCreateContextAttribsARB} succeeds, it initializes the context to the initial state defined by the OpenGL specification, and returns a
	 * handle to it. This handle can be used to render to any GLX surface (window, pixmap, or pbuffer) compatible with {@code config}, subject to constraints
	 * imposed by the OpenGL API version of the context.
	 * <p/>
	 * If {@code share_context} is not {@code NULL}, then all shareable data (excluding OpenGL texture objects named 0) will be shared by {@code share_context}, all
	 * other contexts {@code share_context} already shares with, and the newly created context. An arbitrary number of {@code GLXContexts} can share data in
	 * this fashion. The server context state for all sharing contexts must exist in a single address space.
	 *
	 * @param display       the connection to the X server
	 * @param config        the {@code GLXFBConfig}
	 * @param share_context if not {@code NULL}, then all shareable data (excluding OpenGL texture objects named 0) will be shared by {@code share_context}, all other contexts
	 *                      {@code share_context} already shares with, and the newly created context. An arbitrary number of GLXContexts can share data in this fashion. The
	 *                      server context state for all sharing contexts must exist in a single address space.
	 * @param direct        direct rendering is requested if {@code direct} is {@link Xlib#True}, and indirect rendering if {@code direct} is {@link Xlib#False}. If
	 *                      {@code direct} is {@link Xlib#True}, the implementation may nonetheless create an indirect rendering context if any of the following conditions hold:
	 *                      <ul>
	 *                      <li>The implementation does not support direct rendering.</li>
	 *                      <li>{@code display} is not a local X server.</li>
	 *                      <li>Implementation-dependent limits on the number of direct rendering contexts that can be supported simultaneously are exceeded.</li>
	 *                      </ul>
	 *                      Use {@link GLX#glXIsDirect IsDirect} to determine whether or not a request for a direct rendering context succeeded.
	 * @param attrib_list   an optional list of attributes for the context, terminated with {@link X#None}
	 */
	public static long glXCreateContextAttribsARB(long display, long config, long share_context, int direct, ByteBuffer attrib_list) {
		long __functionAddress = getInstance().glXCreateContextAttribsARB;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
			if ( attrib_list != null ) checkNT4(attrib_list);
		}
		return nglXCreateContextAttribsARB(display, config, share_context, direct, memAddressSafe(attrib_list), __functionAddress);
	}

	/** Alternative version of: {@link #glXCreateContextAttribsARB glXCreateContextAttribsARB} */
	public static long glXCreateContextAttribsARB(long display, long config, long share_context, int direct, IntBuffer attrib_list) {
		long __functionAddress = getInstance().glXCreateContextAttribsARB;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
			if ( attrib_list != null ) checkNT(attrib_list);
		}
		return nglXCreateContextAttribsARB(display, config, share_context, direct, memAddressSafe(attrib_list), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GLXARBCreateContext;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_ARB_create_context") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  GL.isFunctionSupported(funcs.glXCreateContextAttribsARB);

		return GL.checkExtension("GLX_ARB_create_context", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLXARBCreateContext}. */
	public static final class Functions implements FunctionMap {

		public final long glXCreateContextAttribsARB;

		public Functions(FunctionProvider provider) {
			glXCreateContextAttribsARB = provider.getFunctionAddress("glXCreateContextAttribsARB");
		}

	}

}