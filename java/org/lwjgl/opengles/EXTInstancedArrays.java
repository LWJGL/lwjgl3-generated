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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_instanced_arrays.txt">EXT_instanced_arrays</a> extension.
 * 
 * <p>A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
 * count and type, multiple times. This extension provides a means of accelerating such use cases while reducing the number of API calls, and keeping the
 * amount of duplicate data to a minimum.</p>
 * 
 * <p>This extension introduces an array "divisor" for generic vertex array attributes, which when non-zero specifies that the attribute is "instanced." An
 * instanced attribute does not advance per-vertex as usual, but rather after every {@code</p><divisor>} conceptual draw calls.
 * 
 * <p>(Attributes which aren't instanced are repeated in their entirety for every conceptual draw call.)</p>
 * 
 * <p>By specifying transform data in an instanced attribute or series of instanced attributes, vertex shaders can, in concert with the instancing draw
 * calls, draw multiple instances of an object with one draw call.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class EXTInstancedArrays {

	/** Accepted by the {@code pname} parameters of GetVertexAttribfv and GetVertexAttribiv. */
	public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_EXT = 0x88FE;

	protected EXTInstancedArrays() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glDrawArraysInstancedEXT, caps.glDrawElementsInstancedEXT, caps.glVertexAttribDivisorEXT
		);
	}

	// --- [ glDrawArraysInstancedEXT ] ---

	public static void glDrawArraysInstancedEXT(int mode, int start, int count, int primcount) {
		long __functionAddress = GLES.getCapabilities().glDrawArraysInstancedEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, mode, start, count, primcount);
	}

	// --- [ glDrawElementsInstancedEXT ] ---

	public static void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount) {
		long __functionAddress = GLES.getCapabilities().glDrawElementsInstancedEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, count, type, indices, primcount);
	}

	public static void glDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedEXT(mode, count, type, indices, primcount);
	}

	public static void glDrawElementsInstancedEXT(int mode, int type, ByteBuffer indices, int primcount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), primcount);
	}

	public static void glDrawElementsInstancedEXT(int mode, ByteBuffer indices, int primcount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
	}

	public static void glDrawElementsInstancedEXT(int mode, ShortBuffer indices, int primcount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
	}

	public static void glDrawElementsInstancedEXT(int mode, IntBuffer indices, int primcount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), primcount);
	}

	// --- [ glVertexAttribDivisorEXT ] ---

	public static void glVertexAttribDivisorEXT(int index, int divisor) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribDivisorEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, divisor);
	}

}