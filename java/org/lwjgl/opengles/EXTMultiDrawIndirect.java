/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

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
 * <p>Requires {@link GLES31 GLES 3.1}.</p>
 */
public class EXTMultiDrawIndirect {

	protected EXTMultiDrawIndirect() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glMultiDrawArraysIndirectEXT, caps.glMultiDrawElementsIndirectEXT
		);
	}

	// --- [ glMultiDrawArraysIndirectEXT ] ---

	public static void nglMultiDrawArraysIndirectEXT(int mode, long indirect, int drawcount, int stride) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawArraysIndirectEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, indirect, drawcount, stride);
	}

	public static void glMultiDrawArraysIndirectEXT(int mode, ByteBuffer indirect, int drawcount, int stride) {
		if ( CHECKS ) {
			checkBuffer(indirect, drawcount * (stride == 0 ? (4 * 4) : stride));
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglMultiDrawArraysIndirectEXT(mode, memAddress(indirect), drawcount, stride);
	}

	public static void glMultiDrawArraysIndirectEXT(int mode, long indirect, int drawcount, int stride) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		nglMultiDrawArraysIndirectEXT(mode, indirect, drawcount, stride);
	}

	/** IntBuffer version of: {@link #glMultiDrawArraysIndirectEXT MultiDrawArraysIndirectEXT} */
	public static void glMultiDrawArraysIndirectEXT(int mode, IntBuffer indirect, int drawcount, int stride) {
		if ( CHECKS ) {
			checkBuffer(indirect, (drawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglMultiDrawArraysIndirectEXT(mode, memAddress(indirect), drawcount, stride);
	}

	// --- [ glMultiDrawElementsIndirectEXT ] ---

	public static void nglMultiDrawElementsIndirectEXT(int mode, int type, long indirect, int drawcount, int stride) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawElementsIndirectEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, type, indirect, drawcount, stride);
	}

	public static void glMultiDrawElementsIndirectEXT(int mode, int type, ByteBuffer indirect, int drawcount, int stride) {
		if ( CHECKS ) {
			checkBuffer(indirect, drawcount * (stride == 0 ? (5 * 4) : stride));
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglMultiDrawElementsIndirectEXT(mode, type, memAddress(indirect), drawcount, stride);
	}

	public static void glMultiDrawElementsIndirectEXT(int mode, int type, long indirect, int drawcount, int stride) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		nglMultiDrawElementsIndirectEXT(mode, type, indirect, drawcount, stride);
	}

	/** IntBuffer version of: {@link #glMultiDrawElementsIndirectEXT MultiDrawElementsIndirectEXT} */
	public static void glMultiDrawElementsIndirectEXT(int mode, int type, IntBuffer indirect, int drawcount, int stride) {
		if ( CHECKS ) {
			checkBuffer(indirect, (drawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglMultiDrawElementsIndirectEXT(mode, type, memAddress(indirect), drawcount, stride);
	}

	/** int[] version of: {@link #glMultiDrawArraysIndirectEXT MultiDrawArraysIndirectEXT} */
	public static void glMultiDrawArraysIndirectEXT(int mode, int[] indirect, int drawcount, int stride) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawArraysIndirectEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indirect, drawcount * (stride == 0 ? (4 * 4) : stride));
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, mode, indirect, drawcount, stride);
	}

	/** int[] version of: {@link #glMultiDrawElementsIndirectEXT MultiDrawElementsIndirectEXT} */
	public static void glMultiDrawElementsIndirectEXT(int mode, int type, int[] indirect, int drawcount, int stride) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawElementsIndirectEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indirect, drawcount * (stride == 0 ? (5 * 4) : stride));
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, mode, type, indirect, drawcount, stride);
	}

}