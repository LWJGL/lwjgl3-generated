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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_draw_instanced.txt">EXT_draw_instanced</a> extension.
 * 
 * <p>This extension provides the means to render multiple instances of an object with a single draw call, and an "instance ID" variable which can be used by
 * the vertex program to compute per-instance values, typically an object's transform.</p>
 */
public final class EXTDrawInstanced {

	/** Function address. */
	@JavadocExclude
	public final long
		DrawArraysInstancedEXT,
		DrawElementsInstancedEXT;

	@JavadocExclude
	public EXTDrawInstanced(FunctionProvider provider) {
		DrawArraysInstancedEXT = provider.getFunctionAddress("glDrawArraysInstancedEXT");
		DrawElementsInstancedEXT = provider.getFunctionAddress("glDrawElementsInstancedEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDrawInstanced} instance for the current context. */
	public static EXTDrawInstanced getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTDrawInstanced);
	}

	static EXTDrawInstanced create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_draw_instanced") ) return null;

		EXTDrawInstanced funcs = new EXTDrawInstanced(provider);
		boolean supported = checkFunctions(
			funcs.DrawArraysInstancedEXT, funcs.DrawElementsInstancedEXT
		);

		return GLES.checkExtension("GL_EXT_draw_instanced", funcs, supported);
	}

	// --- [ glDrawArraysInstancedEXT ] ---

	/** JNI method for {@link #glDrawArraysInstancedEXT DrawArraysInstancedEXT} */
	@JavadocExclude
	public static native void nglDrawArraysInstancedEXT(int mode, int start, int count, int primcount, long __functionAddress);

	public static void glDrawArraysInstancedEXT(int mode, int start, int count, int primcount) {
		long __functionAddress = getInstance().DrawArraysInstancedEXT;
		nglDrawArraysInstancedEXT(mode, start, count, primcount, __functionAddress);
	}

	// --- [ glDrawElementsInstancedEXT ] ---

	/** JNI method for {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	@JavadocExclude
	public static native void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount, long __functionAddress);

	/** Unsafe version of {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	@JavadocExclude
	public static void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount) {
		long __functionAddress = getInstance().DrawElementsInstancedEXT;
		nglDrawElementsInstancedEXT(mode, count, type, indices, primcount, __functionAddress);
	}

	public static void glDrawElementsInstancedEXT(int mode, int count, int type, ByteBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
		nglDrawElementsInstancedEXT(mode, count, type, memAddress(indices), primcount);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	public static void glDrawElementsInstancedEXT(int mode, int count, int type, long indicesOffset, int primcount) {
		nglDrawElementsInstancedEXT(mode, count, type, indicesOffset, primcount);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	public static void glDrawElementsInstancedEXT(int mode, int type, ByteBuffer indices, int primcount) {
		nglDrawElementsInstancedEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	public static void glDrawElementsInstancedEXT(int mode, ByteBuffer indices, int primcount) {
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	public static void glDrawElementsInstancedEXT(int mode, ShortBuffer indices, int primcount) {
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	public static void glDrawElementsInstancedEXT(int mode, IntBuffer indices, int primcount) {
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), primcount);
	}

}