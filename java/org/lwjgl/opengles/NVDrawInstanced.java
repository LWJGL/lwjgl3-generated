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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_draw_instanced.txt">NV_draw_instanced</a> extension.
 * 
 * <p>A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
 * count and type, multiple times. This extension provides a means of accelerating such use cases while limiting the number of required API calls, and
 * keeping the amount of duplicate data to a minimum.</p>
 * 
 * <p>This extension introduces two draw calls which are conceptually equivalent to a series of draw calls. Each conceptual call in this series is considered
 * an "instance" of the actual draw call.</p>
 * 
 * <p>This extension also introduces a read-only built-in variable to GLSL which contains the "instance ID." This variable initially contains 0, but
 * increases by one after each conceptual draw call.</p>
 * 
 * <p>By using the instance ID or multiples thereof as an index into a uniform array containing transform data, vertex shaders can draw multiple instances of
 * an object with a single draw call.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class NVDrawInstanced {

	/** Function address. */
	@JavadocExclude
	public final long
		DrawArraysInstancedNV,
		DrawElementsInstancedNV;

	@JavadocExclude
	public NVDrawInstanced(FunctionProvider provider) {
		DrawArraysInstancedNV = provider.getFunctionAddress("glDrawArraysInstancedNV");
		DrawElementsInstancedNV = provider.getFunctionAddress("glDrawElementsInstancedNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVDrawInstanced} instance for the current context. */
	public static NVDrawInstanced getInstance() {
		return checkFunctionality(GLES.getCapabilities().__NVDrawInstanced);
	}

	static NVDrawInstanced create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_draw_instanced") ) return null;

		NVDrawInstanced funcs = new NVDrawInstanced(provider);
		boolean supported = checkFunctions(
			funcs.DrawArraysInstancedNV, funcs.DrawElementsInstancedNV
		);

		return GLES.checkExtension("GL_NV_draw_instanced", funcs, supported);
	}

	// --- [ glDrawArraysInstancedNV ] ---

	public static void glDrawArraysInstancedNV(int mode, int first, int count, int primcount) {
		long __functionAddress = getInstance().DrawArraysInstancedNV;
		callIIIIV(__functionAddress, mode, first, count, primcount);
	}

	// --- [ glDrawElementsInstancedNV ] ---

	/** Unsafe version of {@link #glDrawElementsInstancedNV DrawElementsInstancedNV} */
	@JavadocExclude
	public static void nglDrawElementsInstancedNV(int mode, int count, int type, long indices, int primcount) {
		long __functionAddress = getInstance().DrawElementsInstancedNV;
		callIIIPIV(__functionAddress, mode, count, type, indices, primcount);
	}

	/**
	 * 
	 *
	 * @param mode      
	 * @param count     
	 * @param type      {@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE} {@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT} {@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices   
	 * @param primcount 
	 */
	public static void glDrawElementsInstancedNV(int mode, int count, int type, ByteBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indices, count << GLESChecks.typeToByteShift(type));
		nglDrawElementsInstancedNV(mode, count, type, memAddress(indices), primcount);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstancedNV DrawElementsInstancedNV} */
	public static void glDrawElementsInstancedNV(int mode, int count, int type, long indicesOffset, int primcount) {
		nglDrawElementsInstancedNV(mode, count, type, indicesOffset, primcount);
	}

	/** Alternative version of: {@link #glDrawElementsInstancedNV DrawElementsInstancedNV} */
	public static void glDrawElementsInstancedNV(int mode, int type, ByteBuffer indices, int primcount) {
		nglDrawElementsInstancedNV(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstancedNV DrawElementsInstancedNV} */
	public static void glDrawElementsInstancedNV(int mode, ByteBuffer indices, int primcount) {
		nglDrawElementsInstancedNV(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstancedNV DrawElementsInstancedNV} */
	public static void glDrawElementsInstancedNV(int mode, ShortBuffer indices, int primcount) {
		nglDrawElementsInstancedNV(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstancedNV DrawElementsInstancedNV} */
	public static void glDrawElementsInstancedNV(int mode, IntBuffer indices, int primcount) {
		nglDrawElementsInstancedNV(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), primcount);
	}

}