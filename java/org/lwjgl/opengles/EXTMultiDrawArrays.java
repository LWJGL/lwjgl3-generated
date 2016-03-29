/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/multi_draw_arrays.txt">EXT_multi_draw_arrays</a> extension.
 * 
 * <p>These functions behave identically to the standard OpenGL 1.1 functions glDrawArrays() and glDrawElements() except they handle multiple lists of
 * vertices in one call. Their main purpose is to allow one function call to render more than one primitive such as triangle strip, triangle fan, etc.</p>
 */
public class EXTMultiDrawArrays {

	protected EXTMultiDrawArrays() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glMultiDrawArraysEXT, caps.glMultiDrawElementsEXT
		);
	}

	// --- [ glMultiDrawArraysEXT ] ---

	/** Unsafe version of {@link #glMultiDrawArraysEXT MultiDrawArraysEXT} */
	public static void nglMultiDrawArraysEXT(int mode, long first, long count, int primcount) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawArraysEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPPIV(__functionAddress, mode, first, count, primcount);
	}

	public static void glMultiDrawArraysEXT(int mode, ByteBuffer first, ByteBuffer count, int primcount) {
		if ( CHECKS ) {
			checkBuffer(first, primcount << 2);
			checkBuffer(count, primcount << 2);
		}
		nglMultiDrawArraysEXT(mode, memAddress(first), memAddress(count), primcount);
	}

	/** Alternative version of: {@link #glMultiDrawArraysEXT MultiDrawArraysEXT} */
	public static void glMultiDrawArraysEXT(int mode, IntBuffer first, IntBuffer count) {
		if ( CHECKS )
			checkBuffer(count, first.remaining());
		nglMultiDrawArraysEXT(mode, memAddress(first), memAddress(count), first.remaining());
	}

	// --- [ glMultiDrawElementsEXT ] ---

	/** Unsafe version of {@link #glMultiDrawElementsEXT MultiDrawElementsEXT} */
	public static void nglMultiDrawElementsEXT(int mode, long count, int type, long indices, int primcount) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawElementsEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPIPIV(__functionAddress, mode, count, type, indices, primcount);
	}

	public static void glMultiDrawElementsEXT(int mode, ByteBuffer count, int type, ByteBuffer indices, int primcount) {
		if ( CHECKS ) {
			checkBuffer(count, primcount << 2);
			checkBuffer(indices, primcount << POINTER_SHIFT);
		}
		nglMultiDrawElementsEXT(mode, memAddress(count), type, memAddress(indices), primcount);
	}

	/** Alternative version of: {@link #glMultiDrawElementsEXT MultiDrawElementsEXT} */
	public static void glMultiDrawElementsEXT(int mode, IntBuffer count, int type, PointerBuffer indices) {
		if ( CHECKS )
			checkBuffer(indices, count.remaining());
		nglMultiDrawElementsEXT(mode, memAddress(count), type, memAddress(indices), count.remaining());
	}

}