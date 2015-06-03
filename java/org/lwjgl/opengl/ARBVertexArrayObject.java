/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

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
public final class ARBVertexArrayObject {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;

	/** Function address. */
	@JavadocExclude
	public final long
		BindVertexArray,
		DeleteVertexArrays,
		GenVertexArrays,
		IsVertexArray;

	@JavadocExclude
	public ARBVertexArrayObject(FunctionProvider provider) {
		BindVertexArray = provider.getFunctionAddress("glBindVertexArray");
		DeleteVertexArrays = provider.getFunctionAddress("glDeleteVertexArrays");
		GenVertexArrays = provider.getFunctionAddress("glGenVertexArrays");
		IsVertexArray = provider.getFunctionAddress("glIsVertexArray");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBVertexArrayObject} instance for the current context. */
	public static ARBVertexArrayObject getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBVertexArrayObject);
	}

	static ARBVertexArrayObject create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_vertex_array_object") ) return null;

		ARBVertexArrayObject funcs = new ARBVertexArrayObject(provider);

		boolean supported = checkFunctions(
			funcs.BindVertexArray, funcs.DeleteVertexArrays, funcs.GenVertexArrays, funcs.IsVertexArray
		);

		return GL.checkExtension("GL_ARB_vertex_array_object", funcs, supported);
	}

	// --- [ glBindVertexArray ] ---

	/**
	 * Binds a vertex array object
	 *
	 * @param array the name of the vertex array to bind
	 */
	public static void glBindVertexArray(int array) {
		long __functionAddress = getInstance().BindVertexArray;
		GL30.nglBindVertexArray(array, __functionAddress);
	}

	// --- [ glDeleteVertexArrays ] ---

	/** Unsafe version of {@link #glDeleteVertexArrays DeleteVertexArrays} */
	@JavadocExclude
	public static void nglDeleteVertexArrays(int n, long arrays) {
		long __functionAddress = getInstance().DeleteVertexArrays;
		GL30.nglDeleteVertexArrays(n, arrays, __functionAddress);
	}

	/**
	 * Deletes vertex array objects.
	 *
	 * @param n      the number of vertex array objects to be deleted
	 * @param arrays an array containing the n names of the objects to be deleted
	 */
	public static void glDeleteVertexArrays(int n, ByteBuffer arrays) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(arrays, n << 2);
		nglDeleteVertexArrays(n, memAddress(arrays));
	}

	/** Alternative version of: {@link #glDeleteVertexArrays DeleteVertexArrays} */
	public static void glDeleteVertexArrays(IntBuffer arrays) {
		nglDeleteVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	/** Single value version of: {@link #glDeleteVertexArrays DeleteVertexArrays} */
	public static void glDeleteVertexArrays(int array) {
		APIBuffer __buffer = apiBuffer();
		int arrays = __buffer.intParam(array);
		nglDeleteVertexArrays(1, __buffer.address(arrays));
	}

	// --- [ glGenVertexArrays ] ---

	/** Unsafe version of {@link #glGenVertexArrays GenVertexArrays} */
	@JavadocExclude
	public static void nglGenVertexArrays(int n, long arrays) {
		long __functionAddress = getInstance().GenVertexArrays;
		GL30.nglGenVertexArrays(n, arrays, __functionAddress);
	}

	/**
	 * Generates vertex array object names.
	 *
	 * @param n      the number of vertex array object names to generate
	 * @param arrays a buffer in which the generated vertex array object names are stored
	 */
	public static void glGenVertexArrays(int n, ByteBuffer arrays) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(arrays, n << 2);
		nglGenVertexArrays(n, memAddress(arrays));
	}

	/** Alternative version of: {@link #glGenVertexArrays GenVertexArrays} */
	public static void glGenVertexArrays(IntBuffer arrays) {
		nglGenVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	/** Single return value version of: {@link #glGenVertexArrays GenVertexArrays} */
	public static int glGenVertexArrays() {
		APIBuffer __buffer = apiBuffer();
		int arrays = __buffer.intParam();
		nglGenVertexArrays(1, __buffer.address(arrays));
		return __buffer.intValue(arrays);
	}

	// --- [ glIsVertexArray ] ---

	/**
	 * Determines if a name corresponds to a vertex array object.
	 *
	 * @param array a value that may be the name of a vertex array object
	 */
	public static boolean glIsVertexArray(int array) {
		long __functionAddress = getInstance().IsVertexArray;
		return GL30.nglIsVertexArray(array, __functionAddress);
	}

}