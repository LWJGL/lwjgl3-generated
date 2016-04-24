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
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class EXTDisjointTimerQuery {

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

	protected EXTDisjointTimerQuery() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glGenQueriesEXT, caps.glDeleteQueriesEXT, caps.glIsQueryEXT, caps.glBeginQueryEXT, caps.glEndQueryEXT, caps.glQueryCounterEXT, 
			caps.glGetQueryivEXT, caps.glGetQueryObjectuivEXT, caps.glGetQueryObjecti64vEXT, caps.glGetQueryObjectui64vEXT
		);
	}

	// --- [ glGenQueriesEXT ] ---

	public static void nglGenQueriesEXT(int n, long ids) {
		long __functionAddress = GLES.getCapabilities().glGenQueriesEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, ids);
	}

	public static void glGenQueriesEXT(IntBuffer ids) {
		nglGenQueriesEXT(ids.remaining(), memAddress(ids));
	}

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

	public static void nglDeleteQueriesEXT(int n, long ids) {
		long __functionAddress = GLES.getCapabilities().glDeleteQueriesEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, ids);
	}

	public static void glDeleteQueriesEXT(IntBuffer ids) {
		nglDeleteQueriesEXT(ids.remaining(), memAddress(ids));
	}

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
		return callZ(__functionAddress, id);
	}

	// --- [ glBeginQueryEXT ] ---

	public static void glBeginQueryEXT(int target, int id) {
		long __functionAddress = GLES.getCapabilities().glBeginQueryEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, id);
	}

	// --- [ glEndQueryEXT ] ---

	public static void glEndQueryEXT(int target) {
		long __functionAddress = GLES.getCapabilities().glEndQueryEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target);
	}

	// --- [ glQueryCounterEXT ] ---

	public static void glQueryCounterEXT(int id, int target) {
		long __functionAddress = GLES.getCapabilities().glQueryCounterEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, id, target);
	}

	// --- [ glGetQueryivEXT ] ---

	public static void nglGetQueryivEXT(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glGetQueryivEXT(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryivEXT(target, pname, memAddress(params));
	}

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

	// --- [ glGetQueryObjectivEXT ] ---

	public static void nglGetQueryObjectivEXT(int id, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryObjectivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjectivEXT(int id, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectivEXT(id, pname, memAddress(params));
	}

	public static int glGetQueryObjectiEXT(int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetQueryObjectivEXT(id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetQueryObjectuivEXT ] ---

	public static void nglGetQueryObjectuivEXT(int id, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryObjectuivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjectuivEXT(int id, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectuivEXT(id, pname, memAddress(params));
	}

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

	// --- [ glGetQueryObjecti64vEXT ] ---

	public static void nglGetQueryObjecti64vEXT(int id, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryObjecti64vEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjecti64vEXT(int id, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
	}

	public static long glGetQueryObjecti64EXT(int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetQueryObjectui64vEXT ] ---

	public static void nglGetQueryObjectui64vEXT(int id, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryObjectui64vEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, pname, params);
	}

	public static void glGetQueryObjectui64vEXT(int id, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
	}

	public static long glGetQueryObjectui64EXT(int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGenQueriesEXT GenQueriesEXT} */
	public static void glGenQueriesEXT(int[] ids) {
		long __functionAddress = GLES.getCapabilities().glGenQueriesEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/** Array version of: {@link #glDeleteQueriesEXT DeleteQueriesEXT} */
	public static void glDeleteQueriesEXT(int[] ids) {
		long __functionAddress = GLES.getCapabilities().glDeleteQueriesEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/** Array version of: {@link #glGetQueryivEXT GetQueryivEXT} */
	public static void glGetQueryivEXT(int target, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetQueryObjectivEXT GetQueryObjectivEXT} */
	public static void glGetQueryObjectivEXT(int id, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryObjectivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, id, pname, params);
	}

	/** Array version of: {@link #glGetQueryObjectuivEXT GetQueryObjectuivEXT} */
	public static void glGetQueryObjectuivEXT(int id, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryObjectuivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, id, pname, params);
	}

	/** Array version of: {@link #glGetQueryObjecti64vEXT GetQueryObjecti64vEXT} */
	public static void glGetQueryObjecti64vEXT(int id, int pname, long[] params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryObjecti64vEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, id, pname, params);
	}

	/** Array version of: {@link #glGetQueryObjectui64vEXT GetQueryObjectui64vEXT} */
	public static void glGetQueryObjectui64vEXT(int id, int pname, long[] params) {
		long __functionAddress = GLES.getCapabilities().glGetQueryObjectui64vEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, id, pname, params);
	}

}