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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_vertex_array_object.txt">OES_vertex_array_object</a> extension.
 * 
 * <p>This extension introduces vertex array objects which encapsulate vertex array states on the server side (vertex buffer objects). These objects aim to
 * keep pointers to vertex data and to provide names for different sets of vertex data. Therefore applications are allowed to rapidly switch between
 * different sets of vertex array state, and to easily return to the default vertex array state.</p>
 */
public class OESVertexArrayObject {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv. */
	public static final int GL_VERTEX_ARRAY_BINDING_OES = 0x85B5;

	protected OESVertexArrayObject() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glBindVertexArrayOES, caps.glDeleteVertexArraysOES, caps.glGenVertexArraysOES, caps.glIsVertexArrayOES
		);
	}

	// --- [ glBindVertexArrayOES ] ---

	public static void glBindVertexArrayOES(int array) {
		long __functionAddress = GLES.getCapabilities().glBindVertexArrayOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, array);
	}

	// --- [ glDeleteVertexArraysOES ] ---

	public static void nglDeleteVertexArraysOES(int n, long arrays) {
		long __functionAddress = GLES.getCapabilities().glDeleteVertexArraysOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, arrays);
	}

	public static void glDeleteVertexArraysOES(IntBuffer arrays) {
		nglDeleteVertexArraysOES(arrays.remaining(), memAddress(arrays));
	}

	public static void glDeleteVertexArraysOES(int array) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer arrays = stack.ints(array);
			nglDeleteVertexArraysOES(1, memAddress(arrays));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenVertexArraysOES ] ---

	public static void nglGenVertexArraysOES(int n, long arrays) {
		long __functionAddress = GLES.getCapabilities().glGenVertexArraysOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, arrays);
	}

	public static void glGenVertexArraysOES(IntBuffer arrays) {
		if ( CHECKS )
			checkBuffer(arrays, 1);
		nglGenVertexArraysOES(arrays.remaining(), memAddress(arrays));
	}

	public static int glGenVertexArraysOES() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer arrays = stack.callocInt(1);
			nglGenVertexArraysOES(1, memAddress(arrays));
			return arrays.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsVertexArrayOES ] ---

	public static boolean glIsVertexArrayOES(int array) {
		long __functionAddress = GLES.getCapabilities().glIsVertexArrayOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, array);
	}

	/** Array version of: {@link #glDeleteVertexArraysOES DeleteVertexArraysOES} */
	public static void glDeleteVertexArraysOES(int[] arrays) {
		long __functionAddress = GLES.getCapabilities().glDeleteVertexArraysOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, arrays.length, arrays);
	}

	/** Array version of: {@link #glGenVertexArraysOES GenVertexArraysOES} */
	public static void glGenVertexArraysOES(int[] arrays) {
		long __functionAddress = GLES.getCapabilities().glGenVertexArraysOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(arrays, 1);
		}
		callPV(__functionAddress, arrays.length, arrays);
	}

}