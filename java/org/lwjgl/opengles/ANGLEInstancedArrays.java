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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/ANGLE/ANGLE_instanced_arrays.txt">ANGLE_instanced_arrays</a> extension.
 * 
 * <p>A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
 * count and type, multiple times. This extension provides a means of accelerating such use cases while restricting the number of API calls, and keeping
 * the amount of duplicate data to a minimum.</p>
 * 
 * <p>This extension introduces an array "divisor" for generic vertex array attributes, which when non-zero specifies that the attribute is "instanced." An
 * instanced attribute does not advance per-vertex as usual, but rather after every &lt;divisor&gt; conceptual draw calls.</p>
 * 
 * <p>(Attributes which aren't instanced are repeated in their entirety for every conceptual draw call.)</p>
 * 
 * <p>By specifying transform data in an instanced attribute or series of instanced attributes, vertex shaders can, in concert with the instancing draw
 * calls, draw multiple instances of an object with one draw call.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class ANGLEInstancedArrays {

	/** Accepted by the {@code pname} parameters of GetVertexAttribfv and GetVertexAttribiv. */
	public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = 0x88FE;

	/** Function address. */
	@JavadocExclude
	public final long
		DrawArraysInstancedANGLE,
		DrawElementsInstancedANGLE,
		VertexAttribDivisorANGLE;

	@JavadocExclude
	public ANGLEInstancedArrays(FunctionProvider provider) {
		DrawArraysInstancedANGLE = provider.getFunctionAddress("glDrawArraysInstancedANGLE");
		DrawElementsInstancedANGLE = provider.getFunctionAddress("glDrawElementsInstancedANGLE");
		VertexAttribDivisorANGLE = provider.getFunctionAddress("glVertexAttribDivisorANGLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ANGLEInstancedArrays} instance for the current context. */
	public static ANGLEInstancedArrays getInstance() {
		return checkFunctionality(GLES.getCapabilities().__ANGLEInstancedArrays);
	}

	static ANGLEInstancedArrays create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ANGLE_instanced_arrays") ) return null;

		ANGLEInstancedArrays funcs = new ANGLEInstancedArrays(provider);
		boolean supported = checkFunctions(
			funcs.DrawArraysInstancedANGLE, funcs.DrawElementsInstancedANGLE, funcs.VertexAttribDivisorANGLE
		);

		return GLES.checkExtension("GL_ANGLE_instanced_arrays", funcs, supported);
	}

	// --- [ glDrawArraysInstancedANGLE ] ---

	public static void glDrawArraysInstancedANGLE(int mode, int first, int count, int primcount) {
		long __functionAddress = getInstance().DrawArraysInstancedANGLE;
		callIIIIV(__functionAddress, mode, first, count, primcount);
	}

	// --- [ glDrawElementsInstancedANGLE ] ---

	/** Unsafe version of {@link #glDrawElementsInstancedANGLE DrawElementsInstancedANGLE} */
	@JavadocExclude
	public static void nglDrawElementsInstancedANGLE(int mode, int count, int type, long indices, int primcount) {
		long __functionAddress = getInstance().DrawElementsInstancedANGLE;
		callIIIPIV(__functionAddress, mode, count, type, indices, primcount);
	}

	public static void glDrawElementsInstancedANGLE(int mode, int count, int type, ByteBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
		nglDrawElementsInstancedANGLE(mode, count, type, memAddress(indices), primcount);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedANGLE DrawElementsInstancedANGLE} */
	public static void glDrawElementsInstancedANGLE(int mode, int count, int type, long indicesOffset, int primcount) {
		nglDrawElementsInstancedANGLE(mode, count, type, indicesOffset, primcount);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedANGLE DrawElementsInstancedANGLE} */
	public static void glDrawElementsInstancedANGLE(int mode, int type, ByteBuffer indices, int primcount) {
		nglDrawElementsInstancedANGLE(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedANGLE DrawElementsInstancedANGLE} */
	public static void glDrawElementsInstancedANGLE(int mode, ByteBuffer indices, int primcount) {
		nglDrawElementsInstancedANGLE(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedANGLE DrawElementsInstancedANGLE} */
	public static void glDrawElementsInstancedANGLE(int mode, ShortBuffer indices, int primcount) {
		nglDrawElementsInstancedANGLE(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedANGLE DrawElementsInstancedANGLE} */
	public static void glDrawElementsInstancedANGLE(int mode, IntBuffer indices, int primcount) {
		nglDrawElementsInstancedANGLE(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), primcount);
	}

	// --- [ glVertexAttribDivisorANGLE ] ---

	public static void glVertexAttribDivisorANGLE(int index, int divisor) {
		long __functionAddress = getInstance().VertexAttribDivisorANGLE;
		callIIV(__functionAddress, index, divisor);
	}

}