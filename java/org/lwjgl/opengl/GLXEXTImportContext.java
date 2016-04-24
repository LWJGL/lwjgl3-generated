/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/import_context.txt">GLX_EXT_import_context</a> extension.
 * 
 * <p>This extension allows multiple X clients to share an indirect rendering context.</p>
 * 
 * <p>Additional convenience procedures to get the current Display* bound to a context as well as other context information are also added.</p>
 */
public class GLXEXTImportContext {

	/** Accepted by the {@code attribute} parameter of {@link #glXQueryContextInfoEXT QueryContextInfoEXT}. */
	public static final int
		GLX_SHARE_CONTEXT_EXT = 0x800A,
		GLX_VISUAL_ID_EXT     = 0x800B,
		GLX_SCREEN_EXT        = 0x800C;

	protected GLXEXTImportContext() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLXCapabilities caps) {
		return checkFunctions(
			caps.glXGetCurrentDisplayEXT, caps.glXQueryContextInfoEXT, caps.glXGetContextIDEXT, caps.glXImportContextEXT, caps.glXFreeContextEXT
		);
	}

	// --- [ glXGetCurrentDisplayEXT ] ---

	/** Returns the display associated with the current context. */
	public static long glXGetCurrentDisplayEXT() {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentDisplayEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress);
	}

	// --- [ glXQueryContextInfoEXT ] ---

	/**
	 * Obtains the value of a context's attribute.
	 *
	 * @param display   the connection to the X server
	 * @param context   the context being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static int nglXQueryContextInfoEXT(long display, long context, int attribute, long value) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryContextInfoEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(context);
		}
		return callPPPI(__functionAddress, display, context, attribute, value);
	}

	/**
	 * Obtains the value of a context's attribute.
	 *
	 * @param display   the connection to the X server
	 * @param context   the context being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static int glXQueryContextInfoEXT(long display, long context, int attribute, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return nglXQueryContextInfoEXT(display, context, attribute, memAddress(value));
	}

	// --- [ glXGetContextIDEXT ] ---

	/**
	 * Returns the XID of a GLXContext.
	 *
	 * @param context the context
	 */
	public static long glXGetContextIDEXT(long context) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetContextIDEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
		}
		return callPP(__functionAddress, context);
	}

	// --- [ glXImportContextEXT ] ---

	/**
	 * May be used in place of glXCreateContext to share another process's indirect rendering context.
	 *
	 * @param display   the connection to the X server
	 * @param contextID the context XID
	 */
	public static long glXImportContextEXT(long display, long contextID) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXImportContextEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPPP(__functionAddress, display, contextID);
	}

	// --- [ glXFreeContextEXT ] ---

	/**
	 * Frees the client-side part of a GLXContext that was created  with {@link #glXImportContextEXT ImportContextEXT}.
	 *
	 * @param display the connection to the X server
	 * @param context the context to free
	 */
	public static void glXFreeContextEXT(long display, long context) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXFreeContextEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(context);
		}
		callPPV(__functionAddress, display, context);
	}

	/** Array version of: {@link #glXQueryContextInfoEXT QueryContextInfoEXT} */
	public static int glXQueryContextInfoEXT(long display, long context, int attribute, int[] value) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryContextInfoEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(context);
			checkBuffer(value, 1);
		}
		return callPPPI(__functionAddress, display, context, attribute, value);
	}

}