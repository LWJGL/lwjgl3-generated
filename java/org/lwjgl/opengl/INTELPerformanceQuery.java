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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/INTEL/performance_query.txt">INTEL_performance_query</a> extension.
 * 
 * <p>The purpose of this extension is to expose Intel proprietary hardware performance counters to the OpenGL applications. Performance counters may count:</p>
 * 
 * <ul>
 * <li>number of hardware events such as number of spawned vertex shaders. In this case the results represent the number of events.</li>
 * <li>duration of certain activity, like time took by all fragment shader invocations. In that case the result usually represents the number of clocks in
 * which the particular HW unit was busy. In order to use such counter efficiently, it should be normalized to the range of <0,1> by dividing its
 * value by the number of render clocks.</li>
 * <li>used throughput of certain memory types such as texture memory. In that case the result of performance counter usually represents the number of
 * bytes transferred between GPU and memory.</li>
 * </ul>
 * 
 * <p>This extension specifies universal API to manage performance counters on different Intel hardware platforms. Performance counters are grouped together
 * into proprietary, hardware-specific, fixed sets of counters that are measured together by the GPU.</p>
 * 
 * <p>It is assumed that performance counters are started and ended on any arbitrary boundaries during rendering.</p>
 * 
 * <p>A set of performance counters is represented by a unique query type. Each query type is identified by assigned name and ID. Multiple query types (sets
 * of performance counters) are supported by the Intel hardware. However each Intel hardware generation supports different sets of performance counters.
 * Therefore the query types between hardware generations can be different. The definition of query types and their results structures can be learned
 * through the API. It is also documented in a separate document of Intel OGL Performance Counters Specification issued per each new hardware generation.</p>
 * 
 * <p>The API allows to create multiple instances of any query type and to sample different fragments of 3D rendering with such instances. Query instances
 * are identified with handles.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public class INTELPerformanceQuery {

	/** Returned by the capsMask parameter of GetPerfQueryInfoINTEL. */
	public static final int
		GL_PERFQUERY_SINGLE_CONTEXT_INTEL = 0x0,
		GL_PERFQUERY_GLOBAL_CONTEXT_INTEL = 0x1;

	/** Accepted by the flags parameter of GetPerfQueryDataINTEL. */
	public static final int
		GL_PERFQUERY_WAIT_INTEL        = 0x83FB,
		GL_PERFQUERY_FLUSH_INTEL       = 0x83FA,
		GL_PERFQUERY_DONOT_FLUSH_INTEL = 0x83F9;

	/** Returned by GetPerfCounterInfoINTEL function as counter type enumeration in location pointed by counterTypeEnum. */
	public static final int
		GL_PERFQUERY_COUNTER_EVENT_INTEL         = 0x94F0,
		GL_PERFQUERY_COUNTER_DURATION_NORM_INTEL = 0x94F1,
		GL_PERFQUERY_COUNTER_DURATION_RAW_INTEL  = 0x94F2,
		GL_PERFQUERY_COUNTER_THROUGHPUT_INTEL    = 0x94F3,
		GL_PERFQUERY_COUNTER_RAW_INTEL           = 0x94F4,
		GL_PERFQUERY_COUNTER_TIMESTAMP_INTEL     = 0x94F5;

	/** Returned by glGetPerfCounterInfoINTEL function as counter data type enumeration in location pointed by counterDataTypeEnum. */
	public static final int
		GL_PERFQUERY_COUNTER_DATA_UINT32_INTEL = 0x94F8,
		GL_PERFQUERY_COUNTER_DATA_UINT64_INTEL = 0x94F9,
		GL_PERFQUERY_COUNTER_DATA_FLOAT_INTEL  = 0x94FA,
		GL_PERFQUERY_COUNTER_DATA_DOUBLE_INTEL = 0x94FB,
		GL_PERFQUERY_COUNTER_DATA_BOOL32_INTEL = 0x94FC;

	/** Accepted by the {@code pname} parameter of GetIntegerv. */
	public static final int
		GL_PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL   = 0x94FD,
		GL_PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL = 0x94FE,
		GL_PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL = 0x94FF;

	/** Accepted by the {@code pname} parameter of GetBooleanv. */
	public static final int GL_PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL = 0x9500;

	protected INTELPerformanceQuery() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glBeginPerfQueryINTEL, caps.glCreatePerfQueryINTEL, caps.glDeletePerfQueryINTEL, caps.glEndPerfQueryINTEL, caps.glGetFirstPerfQueryIdINTEL, 
			caps.glGetNextPerfQueryIdINTEL, caps.glGetPerfCounterInfoINTEL, caps.glGetPerfQueryDataINTEL, caps.glGetPerfQueryIdByNameINTEL, 
			caps.glGetPerfQueryInfoINTEL
		);
	}

	// --- [ glBeginPerfQueryINTEL ] ---

	public static void glBeginPerfQueryINTEL(int queryHandle) {
		long __functionAddress = GL.getCapabilities().glBeginPerfQueryINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, queryHandle);
	}

	// --- [ glCreatePerfQueryINTEL ] ---

	public static void nglCreatePerfQueryINTEL(int queryId, long queryHandle) {
		long __functionAddress = GL.getCapabilities().glCreatePerfQueryINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, queryId, queryHandle);
	}

	public static void glCreatePerfQueryINTEL(int queryId, IntBuffer queryHandle) {
		if ( CHECKS )
			checkBuffer(queryHandle, 1);
		nglCreatePerfQueryINTEL(queryId, memAddress(queryHandle));
	}

	public static int glCreatePerfQueryINTEL(int queryId) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer queryHandle = stack.callocInt(1);
			nglCreatePerfQueryINTEL(queryId, memAddress(queryHandle));
			return queryHandle.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeletePerfQueryINTEL ] ---

	public static void glDeletePerfQueryINTEL(int queryHandle) {
		long __functionAddress = GL.getCapabilities().glDeletePerfQueryINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, queryHandle);
	}

	// --- [ glEndPerfQueryINTEL ] ---

	public static void glEndPerfQueryINTEL(int queryHandle) {
		long __functionAddress = GL.getCapabilities().glEndPerfQueryINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, queryHandle);
	}

	// --- [ glGetFirstPerfQueryIdINTEL ] ---

	public static void nglGetFirstPerfQueryIdINTEL(long queryId) {
		long __functionAddress = GL.getCapabilities().glGetFirstPerfQueryIdINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, queryId);
	}

	public static void glGetFirstPerfQueryIdINTEL(IntBuffer queryId) {
		if ( CHECKS )
			checkBuffer(queryId, 1);
		nglGetFirstPerfQueryIdINTEL(memAddress(queryId));
	}

	public static int glGetFirstPerfQueryIdINTEL() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer queryId = stack.callocInt(1);
			nglGetFirstPerfQueryIdINTEL(memAddress(queryId));
			return queryId.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetNextPerfQueryIdINTEL ] ---

	public static void nglGetNextPerfQueryIdINTEL(int queryId, long nextQueryId) {
		long __functionAddress = GL.getCapabilities().glGetNextPerfQueryIdINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, queryId, nextQueryId);
	}

	public static void glGetNextPerfQueryIdINTEL(int queryId, IntBuffer nextQueryId) {
		if ( CHECKS )
			checkBuffer(nextQueryId, 1);
		nglGetNextPerfQueryIdINTEL(queryId, memAddress(nextQueryId));
	}

	public static int glGetNextPerfQueryIdINTEL(int queryId) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer nextQueryId = stack.callocInt(1);
			nglGetNextPerfQueryIdINTEL(queryId, memAddress(nextQueryId));
			return nextQueryId.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetPerfCounterInfoINTEL ] ---

	public static void nglGetPerfCounterInfoINTEL(int queryId, int counterId, int counterNameLength, long counterName, int counterDescLength, long counterDesc, long counterOffset, long counterDataSize, long counterTypeEnum, long counterDataTypeEnum, long rawCounterMaxValue) {
		long __functionAddress = GL.getCapabilities().glGetPerfCounterInfoINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPPPPPV(__functionAddress, queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue);
	}

	public static void glGetPerfCounterInfoINTEL(int queryId, int counterId, ByteBuffer counterName, ByteBuffer counterDesc, IntBuffer counterOffset, IntBuffer counterDataSize, IntBuffer counterTypeEnum, IntBuffer counterDataTypeEnum, LongBuffer rawCounterMaxValue) {
		if ( CHECKS ) {
			checkBuffer(counterOffset, 1);
			checkBuffer(counterDataSize, 1);
			checkBuffer(counterTypeEnum, 1);
			checkBuffer(counterDataTypeEnum, 1);
			checkBuffer(rawCounterMaxValue, 1);
		}
		nglGetPerfCounterInfoINTEL(queryId, counterId, counterName.remaining(), memAddress(counterName), counterDesc.remaining(), memAddress(counterDesc), memAddress(counterOffset), memAddress(counterDataSize), memAddress(counterTypeEnum), memAddress(counterDataTypeEnum), memAddress(rawCounterMaxValue));
	}

	// --- [ glGetPerfQueryDataINTEL ] ---

	public static void nglGetPerfQueryDataINTEL(int queryHandle, int flags, int dataSize, long data, long bytesWritten) {
		long __functionAddress = GL.getCapabilities().glGetPerfQueryDataINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, queryHandle, flags, dataSize, data, bytesWritten);
	}

	public static void glGetPerfQueryDataINTEL(int queryHandle, int flags, ByteBuffer data, IntBuffer bytesWritten) {
		if ( CHECKS )
			checkBuffer(bytesWritten, 1);
		nglGetPerfQueryDataINTEL(queryHandle, flags, data.remaining(), memAddress(data), memAddress(bytesWritten));
	}

	// --- [ glGetPerfQueryIdByNameINTEL ] ---

	public static void nglGetPerfQueryIdByNameINTEL(long queryName, long queryId) {
		long __functionAddress = GL.getCapabilities().glGetPerfQueryIdByNameINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, queryName, queryId);
	}

	public static void glGetPerfQueryIdByNameINTEL(ByteBuffer queryName, IntBuffer queryId) {
		if ( CHECKS ) {
			checkNT1(queryName);
			checkBuffer(queryId, 1);
		}
		nglGetPerfQueryIdByNameINTEL(memAddress(queryName), memAddress(queryId));
	}

	public static void glGetPerfQueryIdByNameINTEL(CharSequence queryName, IntBuffer queryId) {
		if ( CHECKS )
			checkBuffer(queryId, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer queryNameEncoded = stack.ASCII(queryName);
			nglGetPerfQueryIdByNameINTEL(memAddress(queryNameEncoded), memAddress(queryId));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static int glGetPerfQueryIdByNameINTEL(CharSequence queryName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer queryNameEncoded = stack.ASCII(queryName);
			IntBuffer queryId = stack.callocInt(1);
			nglGetPerfQueryIdByNameINTEL(memAddress(queryNameEncoded), memAddress(queryId));
			return queryId.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetPerfQueryInfoINTEL ] ---

	public static void nglGetPerfQueryInfoINTEL(int queryId, int queryNameLength, long queryName, long dataSize, long noCounters, long noInstances, long capsMask) {
		long __functionAddress = GL.getCapabilities().glGetPerfQueryInfoINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPPPV(__functionAddress, queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask);
	}

	public static void glGetPerfQueryInfoINTEL(int queryId, ByteBuffer queryName, IntBuffer dataSize, IntBuffer noCounters, IntBuffer noInstances, IntBuffer capsMask) {
		if ( CHECKS ) {
			checkBuffer(dataSize, 1);
			checkBuffer(noCounters, 1);
			checkBuffer(noInstances, 1);
			checkBuffer(capsMask, 1);
		}
		nglGetPerfQueryInfoINTEL(queryId, queryName.remaining(), memAddress(queryName), memAddress(dataSize), memAddress(noCounters), memAddress(noInstances), memAddress(capsMask));
	}

	/** Array version of: {@link #glCreatePerfQueryINTEL CreatePerfQueryINTEL} */
	public static void glCreatePerfQueryINTEL(int queryId, int[] queryHandle) {
		long __functionAddress = GL.getCapabilities().glCreatePerfQueryINTEL;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(queryHandle, 1);
		}
		callPV(__functionAddress, queryId, queryHandle);
	}

	/** Array version of: {@link #glGetFirstPerfQueryIdINTEL GetFirstPerfQueryIdINTEL} */
	public static void glGetFirstPerfQueryIdINTEL(int[] queryId) {
		long __functionAddress = GL.getCapabilities().glGetFirstPerfQueryIdINTEL;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(queryId, 1);
		}
		callPV(__functionAddress, queryId);
	}

	/** Array version of: {@link #glGetNextPerfQueryIdINTEL GetNextPerfQueryIdINTEL} */
	public static void glGetNextPerfQueryIdINTEL(int queryId, int[] nextQueryId) {
		long __functionAddress = GL.getCapabilities().glGetNextPerfQueryIdINTEL;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(nextQueryId, 1);
		}
		callPV(__functionAddress, queryId, nextQueryId);
	}

	/** Array version of: {@link #glGetPerfCounterInfoINTEL GetPerfCounterInfoINTEL} */
	public static void glGetPerfCounterInfoINTEL(int queryId, int counterId, ByteBuffer counterName, ByteBuffer counterDesc, int[] counterOffset, int[] counterDataSize, int[] counterTypeEnum, int[] counterDataTypeEnum, long[] rawCounterMaxValue) {
		long __functionAddress = GL.getCapabilities().glGetPerfCounterInfoINTEL;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(counterOffset, 1);
			checkBuffer(counterDataSize, 1);
			checkBuffer(counterTypeEnum, 1);
			checkBuffer(counterDataTypeEnum, 1);
			checkBuffer(rawCounterMaxValue, 1);
		}
		callPPPPPPPV(__functionAddress, queryId, counterId, counterName.remaining(), memAddress(counterName), counterDesc.remaining(), memAddress(counterDesc), counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue);
	}

	/** Array version of: {@link #glGetPerfQueryDataINTEL GetPerfQueryDataINTEL} */
	public static void glGetPerfQueryDataINTEL(int queryHandle, int flags, ByteBuffer data, int[] bytesWritten) {
		long __functionAddress = GL.getCapabilities().glGetPerfQueryDataINTEL;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(bytesWritten, 1);
		}
		callPPV(__functionAddress, queryHandle, flags, data.remaining(), memAddress(data), bytesWritten);
	}

	/** Array version of: {@link #glGetPerfQueryIdByNameINTEL GetPerfQueryIdByNameINTEL} */
	public static void glGetPerfQueryIdByNameINTEL(ByteBuffer queryName, int[] queryId) {
		long __functionAddress = GL.getCapabilities().glGetPerfQueryIdByNameINTEL;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(queryName);
			checkBuffer(queryId, 1);
		}
		callPPV(__functionAddress, memAddress(queryName), queryId);
	}

	/** Array version of: {@link #glGetPerfQueryIdByNameINTEL GetPerfQueryIdByNameINTEL} */
	public static void glGetPerfQueryIdByNameINTEL(CharSequence queryName, int[] queryId) {
		long __functionAddress = GL.getCapabilities().glGetPerfQueryIdByNameINTEL;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(queryId, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer queryNameEncoded = stack.ASCII(queryName);
			callPPV(__functionAddress, memAddress(queryNameEncoded), queryId);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGetPerfQueryInfoINTEL GetPerfQueryInfoINTEL} */
	public static void glGetPerfQueryInfoINTEL(int queryId, ByteBuffer queryName, int[] dataSize, int[] noCounters, int[] noInstances, int[] capsMask) {
		long __functionAddress = GL.getCapabilities().glGetPerfQueryInfoINTEL;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dataSize, 1);
			checkBuffer(noCounters, 1);
			checkBuffer(noInstances, 1);
			checkBuffer(capsMask, 1);
		}
		callPPPPPV(__functionAddress, queryId, queryName.remaining(), memAddress(queryName), dataSize, noCounters, noInstances, capsMask);
	}

}