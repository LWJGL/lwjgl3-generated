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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_disjoint_timer_query.txt">EXT_disjoint_timer_query</a> extension.
 * 
 * <p>Applications can benefit from accurate timing information in a number of different ways. During application development, timing information can help
 * identify application or driver bottlenecks. At run time, applications can use timing information to dynamically adjust the amount of detail in a scene
 * to achieve constant frame rates. OpenGL implementations have historically provided little to no useful timing information. Applications can get some
 * idea of timing by reading timers on the CPU, but these timers are not synchronized with the graphics rendering pipeline. Reading a CPU timer does not
 * guarantee the completion of a potentially large amount of graphics work accumulated before the timer is read, and will thus produce wildly inaccurate
 * results. glFinish() can be used to determine when previous rendering commands have been completed, but will idle the graphics pipeline and adversely
 * affect application performance.</p>
 * 
 * <p>This extension provides a query mechanism that can be used to determine the amount of time it takes to fully complete a set of GL commands, and without
 * stalling the rendering pipeline. It uses the query object mechanisms first introduced in the occlusion query extension, which allow time intervals to
 * be polled asynchronously by the application.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class EXTDisjointTimerQuery {

	/** Accepted by the {@code pname} parameter of GetQueryivEXT. */
	public static final int
		GL_QUERY_COUNTER_BITS_EXT = 0x8864,
		GL_CURRENT_QUERY_EXT      = 0x8865;

	/** Accepted by the {@code pname} parameter of GetQueryObjectivEXT, GetQueryObjectuivEXT, GetQueryObjecti64vEXT, and GetQueryObjectui64vEXT. */
	public static final int
		GL_QUERY_RESULT_EXT           = 0x8866,
		GL_QUERY_RESULT_AVAILABLE_EXT = 0x8867;

	/** Accepted by the {@code target} parameter of BeginQueryEXT, EndQueryEXT, and GetQueryivEXT. */
	public static final int GL_TIME_ELAPSED_EXT = 0x88BF;

	/**
	 * Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
	 * GetInteger64v, GetFloatv, and GetDoublev.
	 */
	public static final int GL_TIMESTAMP_EXT = 0x8E28;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int GL_GPU_DISJOINT_EXT = 0x8FBB;

	/** Function address. */
	@JavadocExclude
	public final long
		GenQueriesEXT,
		DeleteQueriesEXT,
		IsQueryEXT,
		BeginQueryEXT,
		EndQueryEXT,
		QueryCounterEXT,
		GetQueryivEXT,
		GetQueryObjectivEXT,
		GetQueryObjectuivEXT,
		GetQueryObjecti64vEXT,
		GetQueryObjectui64vEXT;

	@JavadocExclude
	public EXTDisjointTimerQuery(FunctionProvider provider) {
		GenQueriesEXT = provider.getFunctionAddress("glGenQueriesEXT");
		DeleteQueriesEXT = provider.getFunctionAddress("glDeleteQueriesEXT");
		IsQueryEXT = provider.getFunctionAddress("glIsQueryEXT");
		BeginQueryEXT = provider.getFunctionAddress("glBeginQueryEXT");
		EndQueryEXT = provider.getFunctionAddress("glEndQueryEXT");
		QueryCounterEXT = provider.getFunctionAddress("glQueryCounterEXT");
		GetQueryivEXT = provider.getFunctionAddress("glGetQueryivEXT");
		GetQueryObjectivEXT = provider.getFunctionAddress("glGetQueryObjectivEXT");
		GetQueryObjectuivEXT = provider.getFunctionAddress("glGetQueryObjectuivEXT");
		GetQueryObjecti64vEXT = provider.getFunctionAddress("glGetQueryObjecti64vEXT");
		GetQueryObjectui64vEXT = provider.getFunctionAddress("glGetQueryObjectui64vEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDisjointTimerQuery} instance for the current context. */
	public static EXTDisjointTimerQuery getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTDisjointTimerQuery);
	}

	static EXTDisjointTimerQuery create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_disjoint_timer_query") ) return null;

		EXTDisjointTimerQuery funcs = new EXTDisjointTimerQuery(provider);
		boolean supported = checkFunctions(
			funcs.GenQueriesEXT, funcs.DeleteQueriesEXT, funcs.IsQueryEXT, funcs.BeginQueryEXT, funcs.EndQueryEXT, funcs.QueryCounterEXT, funcs.GetQueryivEXT, 
			funcs.GetQueryObjectivEXT, funcs.GetQueryObjectuivEXT, funcs.GetQueryObjecti64vEXT, funcs.GetQueryObjectui64vEXT
		);

		return GLES.checkExtension("GL_EXT_disjoint_timer_query", funcs, supported);
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

	// --- [ glQueryCounterEXT ] ---

	public static void glQueryCounterEXT(int id, int target) {
		long __functionAddress = getInstance().QueryCounterEXT;
		callIIV(__functionAddress, id, target);
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

	// --- [ glGetQueryObjectivEXT ] ---

	/** Unsafe version of {@link #glGetQueryObjectivEXT GetQueryObjectivEXT} */
	@JavadocExclude
	public static void nglGetQueryObjectivEXT(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjectivEXT;
		callIIPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjectivEXT(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryObjectivEXT(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjectivEXT GetQueryObjectivEXT} */
	public static void glGetQueryObjectivEXT(int id, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectivEXT(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjectivEXT GetQueryObjectivEXT} */
	public static int glGetQueryObjectiEXT(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryObjectivEXT(id, pname, __buffer.address(params));
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

	// --- [ glGetQueryObjecti64vEXT ] ---

	/** Unsafe version of {@link #glGetQueryObjecti64vEXT GetQueryObjecti64vEXT} */
	@JavadocExclude
	public static void nglGetQueryObjecti64vEXT(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjecti64vEXT;
		callIIPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjecti64vEXT(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjecti64vEXT GetQueryObjecti64vEXT} */
	public static void glGetQueryObjecti64vEXT(int id, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjecti64vEXT GetQueryObjecti64vEXT} */
	public static long glGetQueryObjecti64EXT(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetQueryObjecti64vEXT(id, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetQueryObjectui64vEXT ] ---

	/** Unsafe version of {@link #glGetQueryObjectui64vEXT GetQueryObjectui64vEXT} */
	@JavadocExclude
	public static void nglGetQueryObjectui64vEXT(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjectui64vEXT;
		callIIPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjectui64vEXT(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjectui64vEXT GetQueryObjectui64vEXT} */
	public static void glGetQueryObjectui64vEXT(int id, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjectui64vEXT GetQueryObjectui64vEXT} */
	public static long glGetQueryObjectui64EXT(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetQueryObjectui64vEXT(id, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

}