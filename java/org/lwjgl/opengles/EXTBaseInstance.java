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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_base_instance.txt">EXT_base_instance</a> extension.
 * 
 * <p>This extension allows the offset within buffer objects used for instanced rendering to be specified. This is congruent with the {@code first} parameter
 * in glDrawArrays and the {@code basevertex} parameter in glDrawElements. When instanced rendering is performed (for example, through
 * glDrawArraysInstanced), instanced vertex attributes whose vertex attribute divisors are non-zero are fetched from enabled vertex arrays per-instance
 * rather than per-vertex. However, in unextended OpenGL ES, there is no way to define the offset into those arrays from which the attributes are fetched.
 * This extension adds that offset in the form of a {@code baseinstance} parameter to several new procedures.</p>
 * 
 * <p>The {@code baseinstance} parameter is added to the index of the array element, after division by the vertex attribute divisor. This allows several sets of
 * instanced vertex attribute data to be stored in a single vertex array, and the base offset of that data to be specified for each draw. Further, this
 * extension exposes the {@code baseinstance} parameter as the final and previously undefined structure member of the draw-indirect data structure.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public class EXTBaseInstance {

	protected EXTBaseInstance() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glDrawArraysInstancedBaseInstanceEXT, caps.glDrawElementsInstancedBaseInstanceEXT, caps.glDrawElementsInstancedBaseVertexBaseInstanceEXT
		);
	}

	// --- [ glDrawArraysInstancedBaseInstanceEXT ] ---

	public static void glDrawArraysInstancedBaseInstanceEXT(int mode, int first, int count, int instancecount, int baseinstance) {
		long __functionAddress = GLES.getCapabilities().glDrawArraysInstancedBaseInstanceEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, mode, first, count, instancecount, baseinstance);
	}

	// --- [ glDrawElementsInstancedBaseInstanceEXT ] ---

	public static void nglDrawElementsInstancedBaseInstanceEXT(int mode, int count, int type, long indices, int instancecount, int baseinstance) {
		long __functionAddress = GLES.getCapabilities().glDrawElementsInstancedBaseInstanceEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, count, type, indices, instancecount, baseinstance);
	}

	public static void glDrawElementsInstancedBaseInstanceEXT(int mode, int count, int type, long indices, int instancecount, int baseinstance) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedBaseInstanceEXT(mode, count, type, indices, instancecount, baseinstance);
	}

	public static void glDrawElementsInstancedBaseInstanceEXT(int mode, int type, ByteBuffer indices, int instancecount, int baseinstance) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, baseinstance);
	}

	public static void glDrawElementsInstancedBaseInstanceEXT(int mode, ByteBuffer indices, int instancecount, int baseinstance) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, baseinstance);
	}

	public static void glDrawElementsInstancedBaseInstanceEXT(int mode, ShortBuffer indices, int instancecount, int baseinstance) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, baseinstance);
	}

	public static void glDrawElementsInstancedBaseInstanceEXT(int mode, IntBuffer indices, int instancecount, int baseinstance) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, baseinstance);
	}

	// --- [ glDrawElementsInstancedBaseVertexBaseInstanceEXT ] ---

	public static void nglDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, int count, int type, long indices, int instancecount, int basevertex, int baseinstance) {
		long __functionAddress = GLES.getCapabilities().glDrawElementsInstancedBaseVertexBaseInstanceEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, count, type, indices, instancecount, basevertex, baseinstance);
	}

	public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, int count, int type, long indices, int instancecount, int basevertex, int baseinstance) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, count, type, indices, instancecount, basevertex, baseinstance);
	}

	public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, int type, ByteBuffer indices, int instancecount, int basevertex, int baseinstance) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, basevertex, baseinstance);
	}

	public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, ByteBuffer indices, int instancecount, int basevertex, int baseinstance) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, basevertex, baseinstance);
	}

	public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, ShortBuffer indices, int instancecount, int basevertex, int baseinstance) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, basevertex, baseinstance);
	}

	public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, IntBuffer indices, int instancecount, int basevertex, int baseinstance) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, basevertex, baseinstance);
	}

}