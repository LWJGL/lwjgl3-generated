/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/vertex_array_object.txt">ARB_vertex_array_object</a> extension.
 * 
 * <p>This extension introduces named vertex array objects which encapsulate vertex array state on the client side. These objects allow applications to
 * rapidly switch between large sets of array state. In addition, layered libraries can return to the default array state by simply creating and binding a
 * new vertex array object.</p>
 * 
 * <p>This extension differs from GL_APPLE_vertex_array_object in that client memory cannot be accessed through a non-zero vertex array object. It also
 * differs in that vertex array objects are explicitly not sharable between contexts.</p>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public class ARBVertexArrayObject {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;

	protected ARBVertexArrayObject() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glBindVertexArray, caps.glDeleteVertexArrays, caps.glGenVertexArrays, caps.glIsVertexArray
		);
	}

	// --- [ glBindVertexArray ] ---

	/**
	 * Binds a vertex array object
	 *
	 * @param array the name of the vertex array to bind
	 */
	public static void glBindVertexArray(int array) {
		long __functionAddress = GL.getCapabilities().glBindVertexArray;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, array);
	}

	// --- [ glDeleteVertexArrays ] ---

	/**
	 * Deletes vertex array objects.
	 *
	 * @param n      the number of vertex array objects to be deleted
	 * @param arrays an array containing the n names of the objects to be deleted
	 */
	public static void nglDeleteVertexArrays(int n, long arrays) {
		long __functionAddress = GL.getCapabilities().glDeleteVertexArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, arrays);
	}

	/**
	 * Deletes vertex array objects.
	 *
	 * @param arrays an array containing the n names of the objects to be deleted
	 */
	public static void glDeleteVertexArrays(IntBuffer arrays) {
		nglDeleteVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	/** Deletes vertex array objects. */
	public static void glDeleteVertexArrays(int array) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer arrays = stack.ints(array);
			nglDeleteVertexArrays(1, memAddress(arrays));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenVertexArrays ] ---

	/**
	 * Generates vertex array object names.
	 *
	 * @param n      the number of vertex array object names to generate
	 * @param arrays a buffer in which the generated vertex array object names are stored
	 */
	public static void nglGenVertexArrays(int n, long arrays) {
		long __functionAddress = GL.getCapabilities().glGenVertexArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, arrays);
	}

	/**
	 * Generates vertex array object names.
	 *
	 * @param arrays a buffer in which the generated vertex array object names are stored
	 */
	public static void glGenVertexArrays(IntBuffer arrays) {
		nglGenVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	/** Generates vertex array object names. */
	public static int glGenVertexArrays() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer arrays = stack.callocInt(1);
			nglGenVertexArrays(1, memAddress(arrays));
			return arrays.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsVertexArray ] ---

	/**
	 * Determines if a name corresponds to a vertex array object.
	 *
	 * @param array a value that may be the name of a vertex array object
	 */
	public static boolean glIsVertexArray(int array) {
		long __functionAddress = GL.getCapabilities().glIsVertexArray;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, array);
	}

	/** Array version of: {@link #glDeleteVertexArrays DeleteVertexArrays} */
	public static void glDeleteVertexArrays(int[] arrays) {
		long __functionAddress = GL.getCapabilities().glDeleteVertexArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, arrays.length, arrays);
	}

	/** Array version of: {@link #glGenVertexArrays GenVertexArrays} */
	public static void glGenVertexArrays(int[] arrays) {
		long __functionAddress = GL.getCapabilities().glGenVertexArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, arrays.length, arrays);
	}

}