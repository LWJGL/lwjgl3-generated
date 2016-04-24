/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

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

	public static void nglMultiDrawArraysEXT(int mode, long first, long count, int primcount) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawArraysEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, mode, first, count, primcount);
	}

	public static void glMultiDrawArraysEXT(int mode, IntBuffer first, IntBuffer count) {
		if ( CHECKS )
			checkBuffer(count, first.remaining());
		nglMultiDrawArraysEXT(mode, memAddress(first), memAddress(count), first.remaining());
	}

	// --- [ glMultiDrawElementsEXT ] ---

	public static void nglMultiDrawElementsEXT(int mode, long count, int type, long indices, int primcount) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawElementsEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, mode, count, type, indices, primcount);
	}

	public static void glMultiDrawElementsEXT(int mode, IntBuffer count, int type, PointerBuffer indices) {
		if ( CHECKS )
			checkBuffer(indices, count.remaining());
		nglMultiDrawElementsEXT(mode, memAddress(count), type, memAddress(indices), count.remaining());
	}

	/** Array version of: {@link #glMultiDrawArraysEXT MultiDrawArraysEXT} */
	public static void glMultiDrawArraysEXT(int mode, int[] first, int[] count) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawArraysEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(count, first.length);
		}
		callPPV(__functionAddress, mode, first, count, first.length);
	}

	/** Array version of: {@link #glMultiDrawElementsEXT MultiDrawElementsEXT} */
	public static void glMultiDrawElementsEXT(int mode, int[] count, int type, PointerBuffer indices) {
		long __functionAddress = GLES.getCapabilities().glMultiDrawElementsEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count.length);
		}
		callPPV(__functionAddress, mode, count, type, memAddress(indices), count.length);
	}

}