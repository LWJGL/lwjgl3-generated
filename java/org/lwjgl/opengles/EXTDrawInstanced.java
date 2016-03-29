/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_draw_instanced.txt">EXT_draw_instanced</a> extension.
 * 
 * <p>This extension provides the means to render multiple instances of an object with a single draw call, and an "instance ID" variable which can be used by
 * the vertex program to compute per-instance values, typically an object's transform.</p>
 */
public class EXTDrawInstanced {

	protected EXTDrawInstanced() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glDrawArraysInstancedEXT, caps.glDrawElementsInstancedEXT
		);
	}

	// --- [ glDrawArraysInstancedEXT ] ---

	public static void glDrawArraysInstancedEXT(int mode, int start, int count, int primcount) {
		long __functionAddress = GLES.getCapabilities().glDrawArraysInstancedEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, mode, start, count, primcount);
	}

	// --- [ glDrawElementsInstancedEXT ] ---

	/** Unsafe version of {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	public static void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount) {
		long __functionAddress = GLES.getCapabilities().glDrawElementsInstancedEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPIV(__functionAddress, mode, count, type, indices, primcount);
	}

	public static void glDrawElementsInstancedEXT(int mode, int count, int type, ByteBuffer indices, int primcount) {
		if ( CHECKS ) {
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstancedEXT(mode, count, type, memAddress(indices), primcount);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	public static void glDrawElementsInstancedEXT(int mode, int count, int type, long indicesOffset, int primcount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstancedEXT(mode, count, type, indicesOffset, primcount);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	public static void glDrawElementsInstancedEXT(int mode, int type, ByteBuffer indices, int primcount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	public static void glDrawElementsInstancedEXT(int mode, ByteBuffer indices, int primcount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	public static void glDrawElementsInstancedEXT(int mode, ShortBuffer indices, int primcount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	public static void glDrawElementsInstancedEXT(int mode, IntBuffer indices, int primcount) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), primcount);
	}

}