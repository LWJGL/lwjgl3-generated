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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_occlusion_query_boolean.txt">EXT_occlusion_query_boolean</a> extension.
 * 
 * <p>This extension defines a mechanism whereby an application can query whether any pixels (or, more precisely, samples) are drawn by a primitive or group
 * of primitives.</p>
 * 
 * <p>The primary purpose of such a query (hereafter referred to as an "occlusion query") is to determine the visibility of an object. Typically, the
 * application will render the major occluders in the scene, then perform an occlusion query for each detail object in the scene. On subsequent frames,
 * the previous results of the occlusion queries can be used to decide whether to draw an object or not.</p>
 */
public class EXTOcclusionQueryBoolean {

	/** Accepted by the {@code target} parameter of BeginQueryEXT, EndQueryEXT, and GetQueryivEXT. */
	public static final int
		GL_ANY_SAMPLES_PASSED_EXT              = 0x8C2F,
		GL_ANY_SAMPLES_PASSED_CONSERVATIVE_EXT = 0x8D6A;

	/** Accepted by the {@code pname} parameter of GetQueryivEXT. */
	public static final int GL_CURRENT_QUERY_EXT = 0x8865;

	/** Accepted by the {@code pname} parameter of GetQueryObjectivEXT and GetQueryObjectuivEXT. */
	public static final int
		GL_QUERY_RESULT_EXT           = 0x8866,
		GL_QUERY_RESULT_AVAILABLE_EXT = 0x8867;

	protected EXTOcclusionQueryBoolean() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glGenQueriesEXT, caps.glDeleteQueriesEXT, caps.glIsQueryEXT, caps.glBeginQueryEXT, caps.glEndQueryEXT, caps.glGetQueryivEXT, 
			caps.glGetQueryObjectuivEXT
		);
	}

	// --- [ glGenQueriesEXT ] ---

	/** Unsafe version of {@link #glGenQueriesEXT GenQueriesEXT} */
	public static void nglGenQueriesEXT(int n, long ids) {
		long __functionAddress = GLES.getCapabilities().glGenQueriesEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, n, ids);
	}

	public static void glGenQueriesEXT(int n, ByteBuffer ids) {
		if ( CHECKS )
			checkBuffer(ids, n << 2);
		nglGenQueriesEXT(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glGenQueriesEXT GenQueriesEXT} */
	public static void glGenQueriesEXT(IntBuffer ids) {
		nglGenQueriesEXT(ids.remaining(), memAddress(ids));
	}

	/** Single return value version of: {@link #glGenQueriesEXT GenQueriesEXT} */
	public static int glGenQueriesEXT() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.callocInt(1);
			nglGenQueriesEXT(1, memAddress(ids));
			return ids.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeleteQueriesEXT ] ---

	/** Unsafe version of {@link #glDeleteQueriesEXT DeleteQueriesEXT} */
	public static void nglDeleteQueriesEXT(int n, long ids) {
		long __functionAddress = GLES.getCapabilities().glDeleteQueriesEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, n, ids);
	}

	public static void glDeleteQueriesEXT(int n, ByteBuffer ids) {
		if ( CHECKS )
			checkBuffer(ids, n << 2);
		nglDeleteQueriesEXT(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glDeleteQueriesEXT DeleteQueriesEXT} */
	public static void glDeleteQueriesEXT(IntBuffer ids) {
		nglDeleteQueriesEXT(ids.remaining(), memAddress(ids));
	}

	/** Single value version of: {@link #glDeleteQueriesEXT DeleteQueriesEXT} */
	public static void glDeleteQueriesEXT(int id) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.ints(id);
			nglDeleteQueriesEXT(1, memAddress(ids));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsQueryEXT ] ---

	public static boolean glIsQueryEXT(int id) {
		long __functionAddress = GLES.getCapabilities().glIsQueryEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callIZ(__functionAddress, id);
	}

	// --- [ glBeginQueryEXT ] ---

	public static void glBeginQueryEXT(int target, int id) {
		long __functionAddress = GLES.getCapabilities().glBeginQueryEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIV(__functionAddress, target, id);
	}

	// --- [ glEndQueryEXT ] ---

	public static void glEndQueryEXT(int target) {
		long __functionAddress = GLES.getCapabilities().glEndQueryEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIV(__functionAddress, target);
	}

	// --- [ glGetQueryivEXT ] ---

	/** Unsafe version of {@link #glGetQueryivEXT GetQueryivEXT} */
	public static void nglGetQueryivEXT(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetQueryivEXT(int target, int pname, ByteBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryivEXT(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryivEXT GetQueryivEXT} */
	public static void glGetQueryivEXT(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryivEXT(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryivEXT GetQueryivEXT} */
	public static int glGetQueryiEXT(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetQueryivEXT(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetQueryObjectuivEXT ] ---

	/** Unsafe version of {@link #glGetQueryObjectuivEXT GetQueryObjectuivEXT} */
	public static void nglGetQueryObjectuivEXT(int id, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryObjectuivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjectuivEXT(int id, int pname, ByteBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryObjectuivEXT(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjectuivEXT GetQueryObjectuivEXT} */
	public static void glGetQueryObjectuivEXT(int id, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectuivEXT(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjectuivEXT GetQueryObjectuivEXT} */
	public static int glGetQueryObjectuiEXT(int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetQueryObjectuivEXT(id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

}