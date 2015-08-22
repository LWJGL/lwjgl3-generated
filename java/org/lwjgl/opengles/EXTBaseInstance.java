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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_base_instance.txt">EXT_base_instance</a> extension.
 * 
 * <p>This extension allows the offset within buffer objects used for instanced rendering to be specified. This is congruent with the <first> parameter in
 * glDrawArrays and the <basevertex> parameter in glDrawElements. When instanced rendering is performed (for example, through glDrawArraysInstanced),
 * instanced vertex attributes whose vertex attribute divisors are non-zero are fetched from enabled vertex arrays per-instance rather than per-vertex.
 * However, in unextended OpenGL ES, there is no way to define the offset into those arrays from which the attributes are fetched. This extension adds
 * that offset in the form of a <baseinstance> parameter to several new procedures.</p>
 * 
 * <p>The <baseinstance> parameter is added to the index of the array element, after division by the vertex attribute divisor. This allows several sets of
 * instanced vertex attribute data to be stored in a single vertex array, and the base offset of that data to be specified for each draw. Further, this
 * extension exposes the <baseinstance> parameter as the final and previously undefined structure member of the draw-indirect data structure.</p>
 * 
 * <p>Requires {@link GLES30 GLES E.S}.</p>
 */
public final class EXTBaseInstance {

	/** Function address. */
	@JavadocExclude
	public final long
		DrawArraysInstancedBaseInstanceEXT,
		DrawElementsInstancedBaseInstanceEXT,
		DrawElementsInstancedBaseVertexBaseInstanceEXT;

	@JavadocExclude
	public EXTBaseInstance(FunctionProvider provider) {
		DrawArraysInstancedBaseInstanceEXT = provider.getFunctionAddress("glDrawArraysInstancedBaseInstanceEXT");
		DrawElementsInstancedBaseInstanceEXT = provider.getFunctionAddress("glDrawElementsInstancedBaseInstanceEXT");
		DrawElementsInstancedBaseVertexBaseInstanceEXT = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexBaseInstanceEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTBaseInstance} instance for the current context. */
	public static EXTBaseInstance getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTBaseInstance);
	}

	static EXTBaseInstance create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_base_instance") ) return null;

		EXTBaseInstance funcs = new EXTBaseInstance(provider);
		boolean supported = checkFunctions(
			funcs.DrawArraysInstancedBaseInstanceEXT, funcs.DrawElementsInstancedBaseInstanceEXT, funcs.DrawElementsInstancedBaseVertexBaseInstanceEXT
		);

		return GLES.checkExtension("GL_EXT_base_instance", funcs, supported);
	}

	// --- [ glDrawArraysInstancedBaseInstanceEXT ] ---

	public static void glDrawArraysInstancedBaseInstanceEXT(int mode, int first, int count, int instancecount, int baseinstance) {
		long __functionAddress = getInstance().DrawArraysInstancedBaseInstanceEXT;
		callIIIIIV(__functionAddress, mode, first, count, instancecount, baseinstance);
	}

	// --- [ glDrawElementsInstancedBaseInstanceEXT ] ---

	/** Unsafe version of {@link #glDrawElementsInstancedBaseInstanceEXT DrawElementsInstancedBaseInstanceEXT} */
	@JavadocExclude
	public static void nglDrawElementsInstancedBaseInstanceEXT(int mode, int count, int type, long indices, int instancecount, int baseinstance) {
		long __functionAddress = getInstance().DrawElementsInstancedBaseInstanceEXT;
		callIIIPIIV(__functionAddress, mode, count, type, indices, instancecount, baseinstance);
	}

	public static void glDrawElementsInstancedBaseInstanceEXT(int mode, int count, int type, ByteBuffer indices, int instancecount, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
		nglDrawElementsInstancedBaseInstanceEXT(mode, count, type, memAddress(indices), instancecount, baseinstance);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedBaseInstanceEXT DrawElementsInstancedBaseInstanceEXT} */
	public static void glDrawElementsInstancedBaseInstanceEXT(int mode, int count, int type, long indicesOffset, int instancecount, int baseinstance) {
		nglDrawElementsInstancedBaseInstanceEXT(mode, count, type, indicesOffset, instancecount, baseinstance);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedBaseInstanceEXT DrawElementsInstancedBaseInstanceEXT} */
	public static void glDrawElementsInstancedBaseInstanceEXT(int mode, int type, ByteBuffer indices, int instancecount, int baseinstance) {
		nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, baseinstance);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedBaseInstanceEXT DrawElementsInstancedBaseInstanceEXT} */
	public static void glDrawElementsInstancedBaseInstanceEXT(int mode, ByteBuffer indices, int instancecount, int baseinstance) {
		nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, baseinstance);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedBaseInstanceEXT DrawElementsInstancedBaseInstanceEXT} */
	public static void glDrawElementsInstancedBaseInstanceEXT(int mode, ShortBuffer indices, int instancecount, int baseinstance) {
		nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, baseinstance);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedBaseInstanceEXT DrawElementsInstancedBaseInstanceEXT} */
	public static void glDrawElementsInstancedBaseInstanceEXT(int mode, IntBuffer indices, int instancecount, int baseinstance) {
		nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, baseinstance);
	}

	// --- [ glDrawElementsInstancedBaseVertexBaseInstanceEXT ] ---

	/** Unsafe version of {@link #glDrawElementsInstancedBaseVertexBaseInstanceEXT DrawElementsInstancedBaseVertexBaseInstanceEXT} */
	@JavadocExclude
	public static void nglDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, int count, int type, long indices, int instancecount, int basevertex, int baseinstance) {
		long __functionAddress = getInstance().DrawElementsInstancedBaseVertexBaseInstanceEXT;
		callIIIPIIIV(__functionAddress, mode, count, type, indices, instancecount, basevertex, baseinstance);
	}

	public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, int count, int type, ByteBuffer indices, int instancecount, int basevertex, int baseinstance) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
		nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, count, type, memAddress(indices), instancecount, basevertex, baseinstance);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedBaseVertexBaseInstanceEXT DrawElementsInstancedBaseVertexBaseInstanceEXT} */
	public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, int count, int type, long indicesOffset, int instancecount, int basevertex, int baseinstance) {
		nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, count, type, indicesOffset, instancecount, basevertex, baseinstance);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedBaseVertexBaseInstanceEXT DrawElementsInstancedBaseVertexBaseInstanceEXT} */
	public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, int type, ByteBuffer indices, int instancecount, int basevertex, int baseinstance) {
		nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, basevertex, baseinstance);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedBaseVertexBaseInstanceEXT DrawElementsInstancedBaseVertexBaseInstanceEXT} */
	public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, ByteBuffer indices, int instancecount, int basevertex, int baseinstance) {
		nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, basevertex, baseinstance);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedBaseVertexBaseInstanceEXT DrawElementsInstancedBaseVertexBaseInstanceEXT} */
	public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, ShortBuffer indices, int instancecount, int basevertex, int baseinstance) {
		nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, basevertex, baseinstance);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedBaseVertexBaseInstanceEXT DrawElementsInstancedBaseVertexBaseInstanceEXT} */
	public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, IntBuffer indices, int instancecount, int basevertex, int baseinstance) {
		nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, basevertex, baseinstance);
	}

}