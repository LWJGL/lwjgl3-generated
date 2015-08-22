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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/import_context.txt">GLX_EXT_import_context</a> extension.
 * 
 * <p>This extension allows multiple X clients to share an indirect rendering context.</p>
 * 
 * <p>Additional convenience procedures to get the current Display* bound to a context as well as other context information are also added.</p>
 */
public final class GLXEXTImportContext {

	/** Accepted by the {@code attribute} parameter of {@link #glXQueryContextInfoEXT QueryContextInfoEXT}. */
	public static final int
		GLX_SHARE_CONTEXT_EXT = 0x800A,
		GLX_VISUAL_ID_EXT     = 0x800B,
		GLX_SCREEN_EXT        = 0x800C;

	/** Function address. */
	@JavadocExclude
	public final long
		GetCurrentDisplayEXT,
		QueryContextInfoEXT,
		GetContextIDEXT,
		ImportContextEXT,
		FreeContextEXT;

	@JavadocExclude
	public GLXEXTImportContext(FunctionProvider provider) {
		GetCurrentDisplayEXT = provider.getFunctionAddress("glXGetCurrentDisplayEXT");
		QueryContextInfoEXT = provider.getFunctionAddress("glXQueryContextInfoEXT");
		GetContextIDEXT = provider.getFunctionAddress("glXGetContextIDEXT");
		ImportContextEXT = provider.getFunctionAddress("glXImportContextEXT");
		FreeContextEXT = provider.getFunctionAddress("glXFreeContextEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXEXTImportContext} instance for the current context. */
	public static GLXEXTImportContext getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLXEXTImportContext);
	}

	static GLXEXTImportContext create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_EXT_import_context") ) return null;

		GLXEXTImportContext funcs = new GLXEXTImportContext(provider);

		boolean supported = checkFunctions(
			funcs.GetCurrentDisplayEXT, funcs.QueryContextInfoEXT, funcs.GetContextIDEXT, funcs.ImportContextEXT, funcs.FreeContextEXT
		);

		return GL.checkExtension("GLX_EXT_import_context", funcs, supported);
	}

	// --- [ glXGetCurrentDisplayEXT ] ---

	/** Returns the display associated with the current context. */
	public static long glXGetCurrentDisplayEXT() {
		long __functionAddress = getInstance().GetCurrentDisplayEXT;
		return callP(__functionAddress);
	}

	// --- [ glXQueryContextInfoEXT ] ---

	/** Unsafe version of {@link #glXQueryContextInfoEXT QueryContextInfoEXT} */
	@JavadocExclude
	public static int nglXQueryContextInfoEXT(long display, long context, int attribute, long value) {
		long __functionAddress = getInstance().QueryContextInfoEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(context);
		}
		return callPPIPI(__functionAddress, display, context, attribute, value);
	}

	/**
	 * Obtains the value of a context's attribute.
	 *
	 * @param display   the connection to the X server
	 * @param context   the context being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static int glXQueryContextInfoEXT(long display, long context, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		return nglXQueryContextInfoEXT(display, context, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #glXQueryContextInfoEXT QueryContextInfoEXT} */
	public static int glXQueryContextInfoEXT(long display, long context, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
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
		long __functionAddress = getInstance().GetContextIDEXT;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
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
		long __functionAddress = getInstance().ImportContextEXT;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
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
		long __functionAddress = getInstance().FreeContextEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(context);
		}
		callPPV(__functionAddress, display, context);
	}

}