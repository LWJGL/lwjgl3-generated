/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_multi_draw_indirect.txt">EXT_multi_draw_indirect</a> extension.
 * 
 * <p>The ARB_draw_indirect extension (included in OpenGL 4.0 and OpenGL ES 3.1) introduced mechanisms whereby the parameters for a draw function may be
 * provided in a structure contained in a buffer object rather than as parameters to the drawing procedure. This is known as an indirect draw and is
 * exposed as two new functions, glDrawArraysIndirect and glDrawElementsIndirect. Each of these functions generates a single batch of primitives.</p>
 * 
 * <p>This extension builds on this functionality by providing procedures to invoke multiple draws from a single procedure call. This allows large batches of
 * drawing commands to be assembled in server memory (via a buffer object) which may then be dispatched through a single function call.</p>
 * 
 * <p>Requires {@link GLES31 GLES E.S}.</p>
 */
public final class EXTMultiDrawIndirect {

	/** Function address. */
	@JavadocExclude
	public final long
		MultiDrawArraysIndirectEXT,
		MultiDrawElementsIndirectEXT;

	@JavadocExclude
	public EXTMultiDrawIndirect(FunctionProvider provider) {
		MultiDrawArraysIndirectEXT = provider.getFunctionAddress("glMultiDrawArraysIndirectEXT");
		MultiDrawElementsIndirectEXT = provider.getFunctionAddress("glMultiDrawElementsIndirectEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTMultiDrawIndirect} instance for the current context. */
	public static EXTMultiDrawIndirect getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTMultiDrawIndirect);
	}

	static EXTMultiDrawIndirect create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_multi_draw_indirect") ) return null;

		EXTMultiDrawIndirect funcs = new EXTMultiDrawIndirect(provider);
		boolean supported = checkFunctions(
			funcs.MultiDrawArraysIndirectEXT, funcs.MultiDrawElementsIndirectEXT
		);

		return GLES.checkExtension("GL_EXT_multi_draw_indirect", funcs, supported);
	}

	// --- [ glMultiDrawArraysIndirectEXT ] ---

	/** Unsafe version of {@link #glMultiDrawArraysIndirectEXT MultiDrawArraysIndirectEXT} */
	@JavadocExclude
	public static void nglMultiDrawArraysIndirectEXT(int mode, long indirect, int drawcount, int stride) {
		long __functionAddress = getInstance().MultiDrawArraysIndirectEXT;
		callIPIIV(__functionAddress, mode, indirect, drawcount, stride);
	}

	public static void glMultiDrawArraysIndirectEXT(int mode, ByteBuffer indirect, int drawcount, int stride) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indirect, drawcount * (stride == 0 ? (4 * 4) : stride));
		nglMultiDrawArraysIndirectEXT(mode, memAddress(indirect), drawcount, stride);
	}

	/** Buffer object offset version of: {@link #glMultiDrawArraysIndirectEXT MultiDrawArraysIndirectEXT} */
	public static void glMultiDrawArraysIndirectEXT(int mode, long indirectOffset, int drawcount, int stride) {
		nglMultiDrawArraysIndirectEXT(mode, indirectOffset, drawcount, stride);
	}

	/** IntBuffer version of: {@link #glMultiDrawArraysIndirectEXT MultiDrawArraysIndirectEXT} */
	public static void glMultiDrawArraysIndirectEXT(int mode, IntBuffer indirect, int drawcount, int stride) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indirect, (drawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
		nglMultiDrawArraysIndirectEXT(mode, memAddress(indirect), drawcount, stride);
	}

	// --- [ glMultiDrawElementsIndirectEXT ] ---

	/** Unsafe version of {@link #glMultiDrawElementsIndirectEXT MultiDrawElementsIndirectEXT} */
	@JavadocExclude
	public static void nglMultiDrawElementsIndirectEXT(int mode, int type, long indirect, int drawcount, int stride) {
		long __functionAddress = getInstance().MultiDrawElementsIndirectEXT;
		callIIPIIV(__functionAddress, mode, type, indirect, drawcount, stride);
	}

	public static void glMultiDrawElementsIndirectEXT(int mode, int type, ByteBuffer indirect, int drawcount, int stride) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indirect, drawcount * (stride == 0 ? (5 * 4) : stride));
		nglMultiDrawElementsIndirectEXT(mode, type, memAddress(indirect), drawcount, stride);
	}

	/** Buffer object offset version of: {@link #glMultiDrawElementsIndirectEXT MultiDrawElementsIndirectEXT} */
	public static void glMultiDrawElementsIndirectEXT(int mode, int type, long indirectOffset, int drawcount, int stride) {
		nglMultiDrawElementsIndirectEXT(mode, type, indirectOffset, drawcount, stride);
	}

	/** IntBuffer version of: {@link #glMultiDrawElementsIndirectEXT MultiDrawElementsIndirectEXT} */
	public static void glMultiDrawElementsIndirectEXT(int mode, int type, IntBuffer indirect, int drawcount, int stride) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indirect, (drawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
		nglMultiDrawElementsIndirectEXT(mode, type, memAddress(indirect), drawcount, stride);
	}

}