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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_occlusion_query_boolean.txt">EXT_occlusion_query_boolean</a> extension.
 * 
 * <p>This extension defines a mechanism whereby an application can query whether any pixels (or, more precisely, samples) are drawn by a primitive or group
 * of primitives.</p>
 * 
 * <p>The primary purpose of such a query (hereafter referred to as an "occlusion query") is to determine the visibility of an object. Typically, the
 * application will render the major occluders in the scene, then perform an occlusion query for each detail object in the scene. On subsequent frames,
 * the previous results of the occlusion queries can be used to decide whether to draw an object or not.</p>
 */
public final class EXTOcclusionQueryBoolean {

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

	/** Function address. */
	@JavadocExclude
	public final long
		GenQueriesEXT,
		DeleteQueriesEXT,
		IsQueryEXT,
		BeginQueryEXT,
		EndQueryEXT,
		GetQueryivEXT,
		GetQueryObjectuivEXT;

	@JavadocExclude
	public EXTOcclusionQueryBoolean(FunctionProvider provider) {
		GenQueriesEXT = provider.getFunctionAddress("glGenQueriesEXT");
		DeleteQueriesEXT = provider.getFunctionAddress("glDeleteQueriesEXT");
		IsQueryEXT = provider.getFunctionAddress("glIsQueryEXT");
		BeginQueryEXT = provider.getFunctionAddress("glBeginQueryEXT");
		EndQueryEXT = provider.getFunctionAddress("glEndQueryEXT");
		GetQueryivEXT = provider.getFunctionAddress("glGetQueryivEXT");
		GetQueryObjectuivEXT = provider.getFunctionAddress("glGetQueryObjectuivEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTOcclusionQueryBoolean} instance for the current context. */
	public static EXTOcclusionQueryBoolean getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTOcclusionQueryBoolean);
	}

	static EXTOcclusionQueryBoolean create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_occlusion_query_boolean") ) return null;

		EXTOcclusionQueryBoolean funcs = new EXTOcclusionQueryBoolean(provider);
		boolean supported = checkFunctions(
			funcs.GenQueriesEXT, funcs.DeleteQueriesEXT, funcs.IsQueryEXT, funcs.BeginQueryEXT, funcs.EndQueryEXT, funcs.GetQueryivEXT, 
			funcs.GetQueryObjectuivEXT
		);

		return GLES.checkExtension("GL_EXT_occlusion_query_boolean", funcs, supported);
	}

	// --- [ glGenQueriesEXT ] ---

	/** Unsafe version of {@link #glGenQueriesEXT GenQueriesEXT} */
	@JavadocExclude
	public static void nglGenQueriesEXT(int n, long ids) {
		long __functionAddress = getInstance().GenQueriesEXT;
		callIPV(__functionAddress, n, ids);
	}

	public static void glGenQueriesEXT(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglGenQueriesEXT(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glGenQueriesEXT GenQueriesEXT} */
	public static void glGenQueriesEXT(IntBuffer ids) {
		nglGenQueriesEXT(ids.remaining(), memAddress(ids));
	}

	/** Single return value version of: {@link #glGenQueriesEXT GenQueriesEXT} */
	public static int glGenQueriesEXT() {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam();
		nglGenQueriesEXT(1, __buffer.address(ids));
		return __buffer.intValue(ids);
	}

	// --- [ glDeleteQueriesEXT ] ---

	/** Unsafe version of {@link #glDeleteQueriesEXT DeleteQueriesEXT} */
	@JavadocExclude
	public static void nglDeleteQueriesEXT(int n, long ids) {
		long __functionAddress = getInstance().DeleteQueriesEXT;
		callIPV(__functionAddress, n, ids);
	}

	public static void glDeleteQueriesEXT(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglDeleteQueriesEXT(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glDeleteQueriesEXT DeleteQueriesEXT} */
	public static void glDeleteQueriesEXT(IntBuffer ids) {
		nglDeleteQueriesEXT(ids.remaining(), memAddress(ids));
	}

	/** Single value version of: {@link #glDeleteQueriesEXT DeleteQueriesEXT} */
	public static void glDeleteQueriesEXT(int id) {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam(id);
		nglDeleteQueriesEXT(1, __buffer.address(ids));
	}

	// --- [ glIsQueryEXT ] ---

	public static boolean glIsQueryEXT(int id) {
		long __functionAddress = getInstance().IsQueryEXT;
		return callIZ(__functionAddress, id);
	}

	// --- [ glBeginQueryEXT ] ---

	public static void glBeginQueryEXT(int target, int id) {
		long __functionAddress = getInstance().BeginQueryEXT;
		callIIV(__functionAddress, target, id);
	}

	// --- [ glEndQueryEXT ] ---

	public static void glEndQueryEXT(int target) {
		long __functionAddress = getInstance().EndQueryEXT;
		callIV(__functionAddress, target);
	}

	// --- [ glGetQueryivEXT ] ---

	/** Unsafe version of {@link #glGetQueryivEXT GetQueryivEXT} */
	@JavadocExclude
	public static void nglGetQueryivEXT(int target, int pname, long params) {
		long __functionAddress = getInstance().GetQueryivEXT;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetQueryivEXT(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryivEXT(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryivEXT GetQueryivEXT} */
	public static void glGetQueryivEXT(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryivEXT(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryivEXT GetQueryivEXT} */
	public static int glGetQueryiEXT(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryivEXT(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetQueryObjectuivEXT ] ---

	/** Unsafe version of {@link #glGetQueryObjectuivEXT GetQueryObjectuivEXT} */
	@JavadocExclude
	public static void nglGetQueryObjectuivEXT(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjectuivEXT;
		callIIPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjectuivEXT(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryObjectuivEXT(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjectuivEXT GetQueryObjectuivEXT} */
	public static void glGetQueryObjectuivEXT(int id, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectuivEXT(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjectuivEXT GetQueryObjectuivEXT} */
	public static int glGetQueryObjectuiEXT(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryObjectuivEXT(id, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

}