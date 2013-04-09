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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGIX/pbuffer.txt">GLX_SGIX_pbuffer</a> extension.
 * <p/>
 * This extension defines pixel buffers (GLXPbuffers, or pbuffer for short). GLXPbuffers are additional non-visible rendering buffers for an OpenGL
 * renderer.
 */
public final class GLXSGIXPBuffer {

	/** Accepted by the {@code attribute} parameter of {@link GLXSGIXFBConfig#glXGetFBConfigAttribSGIX}: */
	public static final int
		GLX_MAX_PBUFFER_WIDTH_SGIX      = 0x8016,
		GLX_MAX_PBUFFER_HEIGHT_SGIX     = 0x8017,
		GLX_MAX_PBUFFER_PIXELS_SGIX     = 0x8018,
		GLX_OPTIMAL_PBUFFER_WIDTH_SGIX  = 0x8019,
		GLX_OPTIMAL_PBUFFER_HEIGHT_SGIX = 0x801A;

	/**
	 * Returned by {@link GLXSGIXFBConfig#glXGetFBConfigAttribSGIX} (when {@code attribute} is set to {@link GLXSGIXFBConfig#GLX_DRAWABLE_TYPE_SGIX}) and
	 * accepted by the {@code attrib_list} parameter of {@link GLXSGIXFBConfig#glXChooseFBConfigSGIX} (following the
	 * {@link GLXSGIXFBConfig#GLX_DRAWABLE_TYPE_SGIX} token):
	 */
	public static final int
		GLX_PBUFFER_BIT_SGIX = 0x4;

	/** Accepted by the {@code attrib_list} parameter of {@link #glXCreateGLXPbufferSGIX} and by the {@code attribute} parameter of {@link #glXQueryGLXPbufferSGIX}: */
	public static final int
		GLX_PRESERVED_CONTENTS_SGIX = 0x801B,
		GLX_LARGEST_PBUFFER_SGIX    = 0x801C;

	/** Accepted by the {@code attribute} parameter of {@link #glXQueryGLXPbufferSGIX}: */
	public static final int
		GLX_WIDTH_SGIX      = 0x801D,
		GLX_HEIGHT_SGIX     = 0x801E,
		GLX_EVENT_MASK_SGIX = 0x801F;

	/** Accepted by the {@code mask} parameter of {@link #glXSelectEventSGIX} and returned in the {@code mask} parameter of #glXGetSelectedEventSGIX}: */
	public static final int
		GLX_BUFFER_CLOBBER_MASK_SGIX = 0x8000000;

	/** Returned in the {@code event_type} field of a "buffer clobber" event: */
	public static final int
		GLX_DAMAGED_SGIX = 0x8020,
		GLX_SAVED_SGIX   = 0x8021;

	/** Returned in the {@code draw_type} field of a "buffer clobber" event: */
	public static final int
		GLX_WINDOW_SGIX  = 0x8022,
		GLX_PBUFFER_SGIX = 0x8023;

	/** Returned in the {@code mask} field of a "buffer clobber" event: */
	public static final int
		GLX_FRONT_LEFT_BUFFER_BIT_SGIX  = 0x1,
		GLX_FRONT_RIGHT_BUFFER_BIT_SGIX = 0x2,
		GLX_BACK_LEFT_BUFFER_BIT_SGIX   = 0x4,
		GLX_BACK_RIGHT_BUFFER_BIT_SGIX  = 0x8,
		GLX_AUX_BUFFERS_BIT_SGIX        = 0x10,
		GLX_DEPTH_BUFFER_BIT_SGIX       = 0x20,
		GLX_STENCIL_BUFFER_BIT_SGIX     = 0x40,
		GLX_ACCUM_BUFFER_BIT_SGIX       = 0x80,
		GLX_SAMPLE_BUFFERS_BIT_SGIX     = 0x100;

	private GLXSGIXPBuffer() {}

	// --- [ glXCreateGLXPbufferSGIX ] ---

	/** JNI method for {@link #glXCreateGLXPbufferSGIX} */
	public static native long nglXCreateGLXPbufferSGIX(long display, long config, int width, int height, long attrib_list, long __functionAddress);

	/**
	 * Creates a single GLXPbuffer and returns its XID.
	 *
	 * @param display     the connection to the X server
	 * @param config      the {@code GLXFBConfig}
	 * @param width       the pbuffer width
	 * @param height      the pbuffer height
	 * @param attrib_list an optional null-terminated list of attributes
	 */
	public static long glXCreateGLXPbufferSGIX(long display, long config, int width, int height, ByteBuffer attrib_list) {
		long __functionAddress = getInstance().glXCreateGLXPbufferSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
			if ( attrib_list != null ) checkNT4(attrib_list);
		}
		return nglXCreateGLXPbufferSGIX(display, config, width, height, memAddressSafe(attrib_list), __functionAddress);
	}

	/** Alternative version of: {@link #glXCreateGLXPbufferSGIX} */
	public static long glXCreateGLXPbufferSGIX(long display, long config, int width, int height, IntBuffer attrib_list) {
		long __functionAddress = getInstance().glXCreateGLXPbufferSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
			if ( attrib_list != null ) checkNT(attrib_list);
		}
		return nglXCreateGLXPbufferSGIX(display, config, width, height, memAddressSafe(attrib_list), __functionAddress);
	}

	// --- [ glXDestroyGLXPbufferSGIX ] ---

	/** JNI method for {@link #glXDestroyGLXPbufferSGIX} */
	public static native void nglXDestroyGLXPbufferSGIX(long display, long pbuf, long __functionAddress);

	/**
	 * Destroys a GLXPbuffer.
	 *
	 * @param display the connection to the X server
	 * @param pbuf    the pbuffer to destroy
	 */
	public static void glXDestroyGLXPbufferSGIX(long display, long pbuf) {
		long __functionAddress = getInstance().glXDestroyGLXPbufferSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(pbuf);
		}
		nglXDestroyGLXPbufferSGIX(display, pbuf, __functionAddress);
	}

	// --- [ glXQueryGLXPbufferSGIX ] ---

	/** JNI method for {@link #glXQueryGLXPbufferSGIX} */
	public static native void nglXQueryGLXPbufferSGIX(long display, long pbuf, int attribute, long value, long __functionAddress);

	/**
	 * Queries an attribute associated with a GLXPbuffer.
	 *
	 * @param display   the connection to the X server
	 * @param pbuf      the pbuffer being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static void glXQueryGLXPbufferSGIX(long display, long pbuf, int attribute, ByteBuffer value) {
		long __functionAddress = getInstance().glXQueryGLXPbufferSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(pbuf);
			checkBuffer(value, 1 << 2);
		}
		nglXQueryGLXPbufferSGIX(display, pbuf, attribute, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glXQueryGLXPbufferSGIX} */
	public static void glXQueryGLXPbufferSGIX(long display, long pbuf, int attribute, IntBuffer value) {
		long __functionAddress = getInstance().glXQueryGLXPbufferSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(pbuf);
			checkBuffer(value, 1);
		}
		nglXQueryGLXPbufferSGIX(display, pbuf, attribute, memAddress(value), __functionAddress);
	}

	// --- [ glXSelectEventSGIX ] ---

	/** JNI method for {@link #glXSelectEventSGIX} */
	public static native void nglXSelectEventSGIX(long display, long drawable, long mask, long __functionAddress);

	/**
	 * Selects which GLX events should be received on a GLXdrawable.
	 *
	 * @param display  the connection to the X server
	 * @param drawable the GLXDrawable
	 * @param mask     the selection mask
	 */
	public static void glXSelectEventSGIX(long display, long drawable, long mask) {
		long __functionAddress = getInstance().glXSelectEventSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
		}
		nglXSelectEventSGIX(display, drawable, mask, __functionAddress);
	}

	// --- [ glXGetSelectedEventSGIX ] ---

	/** JNI method for {@link #glXGetSelectedEventSGIX} */
	public static native void nglXGetSelectedEventSGIX(long display, long drawable, long mask, long __functionAddress);

	/**
	 * Returns which GLX events are selected for a GLXdrawable.
	 *
	 * @param display  the connection to the X server
	 * @param drawable the GLXDrawable
	 * @param mask     returns the selection mask
	 */
	public static void glXGetSelectedEventSGIX(long display, long drawable, ByteBuffer mask) {
		long __functionAddress = getInstance().glXGetSelectedEventSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
			checkBuffer(mask, 1 << POINTER_SHIFT);
		}
		nglXGetSelectedEventSGIX(display, drawable, memAddress(mask), __functionAddress);
	}

	/** Alternative version of: {@link #glXGetSelectedEventSGIX} */
	public static void glXGetSelectedEventSGIX(long display, long drawable, PointerBuffer mask) {
		long __functionAddress = getInstance().glXGetSelectedEventSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
			checkBuffer(mask, 1);
		}
		nglXGetSelectedEventSGIX(display, drawable, memAddress(mask), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GLXSGIXPBuffer;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGIX_pbuffer") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glXCreateGLXPbufferSGIX) &&
			GL.isFunctionSupported(funcs.glXDestroyGLXPbufferSGIX) &&
			GL.isFunctionSupported(funcs.glXQueryGLXPbufferSGIX) &&
			GL.isFunctionSupported(funcs.glXSelectEventSGIX) &&
			GL.isFunctionSupported(funcs.glXGetSelectedEventSGIX);

		return GL.checkExtension("GLX_SGIX_pbuffer", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLXSGIXPBuffer}. */
	public static final class Functions implements FunctionMap {

		public final long
			glXCreateGLXPbufferSGIX,
			glXDestroyGLXPbufferSGIX,
			glXQueryGLXPbufferSGIX,
			glXSelectEventSGIX,
			glXGetSelectedEventSGIX;

		public Functions(FunctionProvider provider) {
			glXCreateGLXPbufferSGIX = provider.getFunctionAddress("glXCreateGLXPbufferSGIX");
			glXDestroyGLXPbufferSGIX = provider.getFunctionAddress("glXDestroyGLXPbufferSGIX");
			glXQueryGLXPbufferSGIX = provider.getFunctionAddress("glXQueryGLXPbufferSGIX");
			glXSelectEventSGIX = provider.getFunctionAddress("glXSelectEventSGIX");
			glXGetSelectedEventSGIX = provider.getFunctionAddress("glXGetSelectedEventSGIX");
		}

	}

}