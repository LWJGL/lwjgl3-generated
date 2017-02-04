/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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

	static { GL.initialize(); }

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
	public static native void glBindVertexArray(int array);

	// --- [ glDeleteVertexArrays ] ---

	/**
	 * Unsafe version of: {@link #glDeleteVertexArrays DeleteVertexArrays}
	 *
	 * @param n the number of vertex array objects to be deleted
	 */
	public static native void nglDeleteVertexArrays(int n, long arrays);

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
	 * Unsafe version of: {@link #glGenVertexArrays GenVertexArrays}
	 *
	 * @param n the number of vertex array object names to generate
	 */
	public static native void nglGenVertexArrays(int n, long arrays);

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
	public static native boolean glIsVertexArray(int array);

	/** Array version of: {@link #glDeleteVertexArrays DeleteVertexArrays} */
	public static void glDeleteVertexArrays(int[] arrays) {
		long __functionAddress = GL.getICD().glDeleteVertexArrays;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, arrays.length, arrays);
	}

	/** Array version of: {@link #glGenVertexArrays GenVertexArrays} */
	public static void glGenVertexArrays(int[] arrays) {
		long __functionAddress = GL.getICD().glGenVertexArrays;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, arrays.length, arrays);
	}

}