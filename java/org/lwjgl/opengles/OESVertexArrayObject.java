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
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_vertex_array_object.txt">OES_vertex_array_object</a> extension.
 * 
 * <p>This extension introduces vertex array objects which encapsulate vertex array states on the server side (vertex buffer objects). These objects aim to
 * keep pointers to vertex data and to provide names for different sets of vertex data. Therefore applications are allowed to rapidly switch between
 * different sets of vertex array state, and to easily return to the default vertex array state.</p>
 */
public final class OESVertexArrayObject {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv. */
	public static final int GL_VERTEX_ARRAY_BINDING_OES = 0x85B5;

	/** Function address. */
	@JavadocExclude
	public final long
		BindVertexArrayOES,
		DeleteVertexArraysOES,
		GenVertexArraysOES,
		IsVertexArrayOES;

	@JavadocExclude
	public OESVertexArrayObject(FunctionProvider provider) {
		BindVertexArrayOES = provider.getFunctionAddress("glBindVertexArrayOES");
		DeleteVertexArraysOES = provider.getFunctionAddress("glDeleteVertexArraysOES");
		GenVertexArraysOES = provider.getFunctionAddress("glGenVertexArraysOES");
		IsVertexArrayOES = provider.getFunctionAddress("glIsVertexArrayOES");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OESVertexArrayObject} instance for the current context. */
	public static OESVertexArrayObject getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OESVertexArrayObject);
	}

	static OESVertexArrayObject create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OES_vertex_array_object") ) return null;

		OESVertexArrayObject funcs = new OESVertexArrayObject(provider);
		boolean supported = checkFunctions(
			funcs.BindVertexArrayOES, funcs.DeleteVertexArraysOES, funcs.GenVertexArraysOES, funcs.IsVertexArrayOES
		);

		return GLES.checkExtension("GL_OES_vertex_array_object", funcs, supported);
	}

	// --- [ glBindVertexArrayOES ] ---

	public static void glBindVertexArrayOES(int array) {
		long __functionAddress = getInstance().BindVertexArrayOES;
		callIV(__functionAddress, array);
	}

	// --- [ glDeleteVertexArraysOES ] ---

	/** Unsafe version of {@link #glDeleteVertexArraysOES DeleteVertexArraysOES} */
	@JavadocExclude
	public static void nglDeleteVertexArraysOES(int n, long arrays) {
		long __functionAddress = getInstance().DeleteVertexArraysOES;
		callIPV(__functionAddress, n, arrays);
	}

	public static void glDeleteVertexArraysOES(int n, ByteBuffer arrays) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(arrays, n << 2);
		nglDeleteVertexArraysOES(n, memAddress(arrays));
	}

	/** Alternative version of: {@link #glDeleteVertexArraysOES DeleteVertexArraysOES} */
	public static void glDeleteVertexArraysOES(IntBuffer arrays) {
		nglDeleteVertexArraysOES(arrays.remaining(), memAddress(arrays));
	}

	/** Single value version of: {@link #glDeleteVertexArraysOES DeleteVertexArraysOES} */
	public static void glDeleteVertexArraysOES(int array) {
		APIBuffer __buffer = apiBuffer();
		int arrays = __buffer.intParam(array);
		nglDeleteVertexArraysOES(1, __buffer.address(arrays));
	}

	// --- [ glGenVertexArraysOES ] ---

	/** Unsafe version of {@link #glGenVertexArraysOES GenVertexArraysOES} */
	@JavadocExclude
	public static void nglGenVertexArraysOES(int n, long arrays) {
		long __functionAddress = getInstance().GenVertexArraysOES;
		callIPV(__functionAddress, n, arrays);
	}

	public static void glGenVertexArraysOES(int n, ByteBuffer arrays) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(arrays, n << 2);
			checkBuffer(arrays, 1 << 2);
		}
		nglGenVertexArraysOES(n, memAddress(arrays));
	}

	/** Alternative version of: {@link #glGenVertexArraysOES GenVertexArraysOES} */
	public static void glGenVertexArraysOES(IntBuffer arrays) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(arrays, 1);
		nglGenVertexArraysOES(arrays.remaining(), memAddress(arrays));
	}

	/** Single return value version of: {@link #glGenVertexArraysOES GenVertexArraysOES} */
	public static int glGenVertexArraysOES() {
		APIBuffer __buffer = apiBuffer();
		int arrays = __buffer.intParam();
		nglGenVertexArraysOES(1, __buffer.address(arrays));
		return __buffer.intValue(arrays);
	}

	// --- [ glIsVertexArrayOES ] ---

	public static boolean glIsVertexArrayOES(int array) {
		long __functionAddress = getInstance().IsVertexArrayOES;
		return callIZ(__functionAddress, array);
	}

}