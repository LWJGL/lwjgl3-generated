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

	/** Function address. */
	public final long
		MultiDrawArraysEXT,
		MultiDrawElementsEXT;

	protected EXTMultiDrawArrays() {
		throw new UnsupportedOperationException();
	}

	public EXTMultiDrawArrays(FunctionProvider provider) {
		MultiDrawArraysEXT = provider.getFunctionAddress("glMultiDrawArraysEXT");
		MultiDrawElementsEXT = provider.getFunctionAddress("glMultiDrawElementsEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTMultiDrawArrays} instance of the current context. */
	public static EXTMultiDrawArrays getInstance() {
		return getInstance(GLES.getCapabilities());
	}

	/** Returns the {@link EXTMultiDrawArrays} instance of the specified {@link GLESCapabilities}. */
	public static EXTMultiDrawArrays getInstance(GLESCapabilities caps) {
		return checkFunctionality(caps.__EXTMultiDrawArrays);
	}

	static EXTMultiDrawArrays create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_multi_draw_arrays") ) return null;

		EXTMultiDrawArrays funcs = new EXTMultiDrawArrays(provider);
		boolean supported = checkFunctions(
			funcs.MultiDrawArraysEXT, funcs.MultiDrawElementsEXT
		);

		return GLES.checkExtension("GL_EXT_multi_draw_arrays", funcs, supported);
	}

	// --- [ glMultiDrawArraysEXT ] ---

	/** Unsafe version of {@link #glMultiDrawArraysEXT MultiDrawArraysEXT} */
	public static void nglMultiDrawArraysEXT(int mode, long first, long count, int primcount) {
		long __functionAddress = getInstance().MultiDrawArraysEXT;
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
		long __functionAddress = getInstance().MultiDrawElementsEXT;
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