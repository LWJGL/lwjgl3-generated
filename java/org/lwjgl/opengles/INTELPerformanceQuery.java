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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/INTEL/performance_query.txt">INTEL_performance_query</a> extension.
 * 
 * <p>The purpose of this extension is to expose Intel proprietary hardware performance counters to the OpenGL applications. Performance counters may count:
 * <ul>
 * <li>number of hardware events such as number of spawned vertex shaders. In this case the results represent the number of events.</li>
 * <li>duration of certain activity, like time took by all fragment shader invocations. In that case the result usually represents the number of clocks in
 * which the particular HW unit was busy. In order to use such counter efficiently, it should be normalized to the range of <0,1> by dividing its
 * value by the number of render clocks.</li>
 * <li>used throughput of certain memory types such as texture memory. In that case the result of performance counter usually represents the number of
 * bytes transferred between GPU and memory.</li>
 * </ul>
 * This extension specifies universal API to manage performance counters on different Intel hardware platforms. Performance counters are grouped together
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
 */
public final class INTELPerformanceQuery {

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

	/** Function address. */
	@JavadocExclude
	public final long
		BeginPerfQueryINTEL,
		CreatePerfQueryINTEL,
		DeletePerfQueryINTEL,
		EndPerfQueryINTEL,
		GetFirstPerfQueryIdINTEL,
		GetNextPerfQueryIdINTEL,
		GetPerfCounterInfoINTEL,
		GetPerfQueryDataINTEL,
		GetPerfQueryIdByNameINTEL,
		GetPerfQueryInfoINTEL;

	@JavadocExclude
	public INTELPerformanceQuery(FunctionProvider provider) {
		BeginPerfQueryINTEL = provider.getFunctionAddress("glBeginPerfQueryINTEL");
		CreatePerfQueryINTEL = provider.getFunctionAddress("glCreatePerfQueryINTEL");
		DeletePerfQueryINTEL = provider.getFunctionAddress("glDeletePerfQueryINTEL");
		EndPerfQueryINTEL = provider.getFunctionAddress("glEndPerfQueryINTEL");
		GetFirstPerfQueryIdINTEL = provider.getFunctionAddress("glGetFirstPerfQueryIdINTEL");
		GetNextPerfQueryIdINTEL = provider.getFunctionAddress("glGetNextPerfQueryIdINTEL");
		GetPerfCounterInfoINTEL = provider.getFunctionAddress("glGetPerfCounterInfoINTEL");
		GetPerfQueryDataINTEL = provider.getFunctionAddress("glGetPerfQueryDataINTEL");
		GetPerfQueryIdByNameINTEL = provider.getFunctionAddress("glGetPerfQueryIdByNameINTEL");
		GetPerfQueryInfoINTEL = provider.getFunctionAddress("glGetPerfQueryInfoINTEL");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link INTELPerformanceQuery} instance for the current context. */
	public static INTELPerformanceQuery getInstance() {
		return checkFunctionality(GLES.getCapabilities().__INTELPerformanceQuery);
	}

	static INTELPerformanceQuery create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_INTEL_performance_query") ) return null;

		INTELPerformanceQuery funcs = new INTELPerformanceQuery(provider);
		boolean supported = checkFunctions(
			funcs.BeginPerfQueryINTEL, funcs.CreatePerfQueryINTEL, funcs.DeletePerfQueryINTEL, funcs.EndPerfQueryINTEL, funcs.GetFirstPerfQueryIdINTEL, 
			funcs.GetNextPerfQueryIdINTEL, funcs.GetPerfCounterInfoINTEL, funcs.GetPerfQueryDataINTEL, funcs.GetPerfQueryIdByNameINTEL, 
			funcs.GetPerfQueryInfoINTEL
		);

		return GLES.checkExtension("GL_INTEL_performance_query", funcs, supported);
	}

	// --- [ glBeginPerfQueryINTEL ] ---

	public static void glBeginPerfQueryINTEL(int queryHandle) {
		long __functionAddress = getInstance().BeginPerfQueryINTEL;
		callIV(__functionAddress, queryHandle);
	}

	// --- [ glCreatePerfQueryINTEL ] ---

	/** Unsafe version of {@link #glCreatePerfQueryINTEL CreatePerfQueryINTEL} */
	@JavadocExclude
	public static void nglCreatePerfQueryINTEL(int queryId, long queryHandle) {
		long __functionAddress = getInstance().CreatePerfQueryINTEL;
		callIPV(__functionAddress, queryId, queryHandle);
	}

	public static void glCreatePerfQueryINTEL(int queryId, ByteBuffer queryHandle) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(queryHandle, 1 << 2);
		nglCreatePerfQueryINTEL(queryId, memAddress(queryHandle));
	}

	/** Alternative version of: {@link #glCreatePerfQueryINTEL CreatePerfQueryINTEL} */
	public static void glCreatePerfQueryINTEL(int queryId, IntBuffer queryHandle) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(queryHandle, 1);
		nglCreatePerfQueryINTEL(queryId, memAddress(queryHandle));
	}

	/** Single return value version of: {@link #glCreatePerfQueryINTEL CreatePerfQueryINTEL} */
	public static int glCreatePerfQueryINTEL(int queryId) {
		APIBuffer __buffer = apiBuffer();
		int queryHandle = __buffer.intParam();
		nglCreatePerfQueryINTEL(queryId, __buffer.address(queryHandle));
		return __buffer.intValue(queryHandle);
	}

	// --- [ glDeletePerfQueryINTEL ] ---

	public static void glDeletePerfQueryINTEL(int queryHandle) {
		long __functionAddress = getInstance().DeletePerfQueryINTEL;
		callIV(__functionAddress, queryHandle);
	}

	// --- [ glEndPerfQueryINTEL ] ---

	public static void glEndPerfQueryINTEL(int queryHandle) {
		long __functionAddress = getInstance().EndPerfQueryINTEL;
		callIV(__functionAddress, queryHandle);
	}

	// --- [ glGetFirstPerfQueryIdINTEL ] ---

	/** Unsafe version of {@link #glGetFirstPerfQueryIdINTEL GetFirstPerfQueryIdINTEL} */
	@JavadocExclude
	public static void nglGetFirstPerfQueryIdINTEL(long queryId) {
		long __functionAddress = getInstance().GetFirstPerfQueryIdINTEL;
		callPV(__functionAddress, queryId);
	}

	public static void glGetFirstPerfQueryIdINTEL(ByteBuffer queryId) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(queryId, 1 << 2);
		nglGetFirstPerfQueryIdINTEL(memAddress(queryId));
	}

	/** Alternative version of: {@link #glGetFirstPerfQueryIdINTEL GetFirstPerfQueryIdINTEL} */
	public static void glGetFirstPerfQueryIdINTEL(IntBuffer queryId) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(queryId, 1);
		nglGetFirstPerfQueryIdINTEL(memAddress(queryId));
	}

	/** Single return value version of: {@link #glGetFirstPerfQueryIdINTEL GetFirstPerfQueryIdINTEL} */
	public static int glGetFirstPerfQueryIdINTEL() {
		APIBuffer __buffer = apiBuffer();
		int queryId = __buffer.intParam();
		nglGetFirstPerfQueryIdINTEL(__buffer.address(queryId));
		return __buffer.intValue(queryId);
	}

	// --- [ glGetNextPerfQueryIdINTEL ] ---

	/** Unsafe version of {@link #glGetNextPerfQueryIdINTEL GetNextPerfQueryIdINTEL} */
	@JavadocExclude
	public static void nglGetNextPerfQueryIdINTEL(int queryId, long nextQueryId) {
		long __functionAddress = getInstance().GetNextPerfQueryIdINTEL;
		callIPV(__functionAddress, queryId, nextQueryId);
	}

	public static void glGetNextPerfQueryIdINTEL(int queryId, ByteBuffer nextQueryId) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(nextQueryId, 1 << 2);
		nglGetNextPerfQueryIdINTEL(queryId, memAddress(nextQueryId));
	}

	/** Alternative version of: {@link #glGetNextPerfQueryIdINTEL GetNextPerfQueryIdINTEL} */
	public static void glGetNextPerfQueryIdINTEL(int queryId, IntBuffer nextQueryId) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(nextQueryId, 1);
		nglGetNextPerfQueryIdINTEL(queryId, memAddress(nextQueryId));
	}

	/** Single return value version of: {@link #glGetNextPerfQueryIdINTEL GetNextPerfQueryIdINTEL} */
	public static int glGetNextPerfQueryIdINTEL(int queryId) {
		APIBuffer __buffer = apiBuffer();
		int nextQueryId = __buffer.intParam();
		nglGetNextPerfQueryIdINTEL(queryId, __buffer.address(nextQueryId));
		return __buffer.intValue(nextQueryId);
	}

	// --- [ glGetPerfCounterInfoINTEL ] ---

	/** Unsafe version of {@link #glGetPerfCounterInfoINTEL GetPerfCounterInfoINTEL} */
	@JavadocExclude
	public static void nglGetPerfCounterInfoINTEL(int queryId, int counterId, int counterNameLength, long counterName, int counterDescLength, long counterDesc, long counterOffset, long counterDataSize, long counterTypeEnum, long counterDataTypeEnum, long rawCounterMaxValue) {
		long __functionAddress = getInstance().GetPerfCounterInfoINTEL;
		callIIIPIPPPPPPV(__functionAddress, queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue);
	}

	public static void glGetPerfCounterInfoINTEL(int queryId, int counterId, int counterNameLength, ByteBuffer counterName, int counterDescLength, ByteBuffer counterDesc, ByteBuffer counterOffset, ByteBuffer counterDataSize, ByteBuffer counterTypeEnum, ByteBuffer counterDataTypeEnum, ByteBuffer rawCounterMaxValue) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(counterName, counterNameLength);
			checkBuffer(counterDesc, counterDescLength);
			checkBuffer(counterOffset, 1 << 2);
			checkBuffer(counterDataSize, 1 << 2);
			checkBuffer(counterTypeEnum, 1 << 2);
			checkBuffer(counterDataTypeEnum, 1 << 2);
			checkBuffer(rawCounterMaxValue, 1 << 3);
		}
		nglGetPerfCounterInfoINTEL(queryId, counterId, counterNameLength, memAddress(counterName), counterDescLength, memAddress(counterDesc), memAddress(counterOffset), memAddress(counterDataSize), memAddress(counterTypeEnum), memAddress(counterDataTypeEnum), memAddress(rawCounterMaxValue));
	}

	/** Alternative version of: {@link #glGetPerfCounterInfoINTEL GetPerfCounterInfoINTEL} */
	public static void glGetPerfCounterInfoINTEL(int queryId, int counterId, ByteBuffer counterName, ByteBuffer counterDesc, IntBuffer counterOffset, IntBuffer counterDataSize, IntBuffer counterTypeEnum, IntBuffer counterDataTypeEnum, LongBuffer rawCounterMaxValue) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(counterOffset, 1);
			checkBuffer(counterDataSize, 1);
			checkBuffer(counterTypeEnum, 1);
			checkBuffer(counterDataTypeEnum, 1);
			checkBuffer(rawCounterMaxValue, 1);
		}
		nglGetPerfCounterInfoINTEL(queryId, counterId, counterName.remaining(), memAddress(counterName), counterDesc.remaining(), memAddress(counterDesc), memAddress(counterOffset), memAddress(counterDataSize), memAddress(counterTypeEnum), memAddress(counterDataTypeEnum), memAddress(rawCounterMaxValue));
	}

	// --- [ glGetPerfQueryDataINTEL ] ---

	/** Unsafe version of {@link #glGetPerfQueryDataINTEL GetPerfQueryDataINTEL} */
	@JavadocExclude
	public static void nglGetPerfQueryDataINTEL(int queryHandle, int flags, int dataSize, long data, long bytesWritten) {
		long __functionAddress = getInstance().GetPerfQueryDataINTEL;
		callIIIPPV(__functionAddress, queryHandle, flags, dataSize, data, bytesWritten);
	}

	public static void glGetPerfQueryDataINTEL(int queryHandle, int flags, int dataSize, ByteBuffer data, ByteBuffer bytesWritten) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, dataSize);
			checkBuffer(bytesWritten, 1 << 2);
		}
		nglGetPerfQueryDataINTEL(queryHandle, flags, dataSize, memAddress(data), memAddress(bytesWritten));
	}

	/** Alternative version of: {@link #glGetPerfQueryDataINTEL GetPerfQueryDataINTEL} */
	public static void glGetPerfQueryDataINTEL(int queryHandle, int flags, ByteBuffer data, IntBuffer bytesWritten) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(bytesWritten, 1);
		nglGetPerfQueryDataINTEL(queryHandle, flags, data.remaining(), memAddress(data), memAddress(bytesWritten));
	}

	// --- [ glGetPerfQueryIdByNameINTEL ] ---

	/** Unsafe version of {@link #glGetPerfQueryIdByNameINTEL GetPerfQueryIdByNameINTEL} */
	@JavadocExclude
	public static void nglGetPerfQueryIdByNameINTEL(long queryName, long queryId) {
		long __functionAddress = getInstance().GetPerfQueryIdByNameINTEL;
		callPPV(__functionAddress, queryName, queryId);
	}

	public static void glGetPerfQueryIdByNameINTEL(ByteBuffer queryName, ByteBuffer queryId) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(queryName);
			checkBuffer(queryId, 1 << 2);
		}
		nglGetPerfQueryIdByNameINTEL(memAddress(queryName), memAddress(queryId));
	}

	/** Alternative version of: {@link #glGetPerfQueryIdByNameINTEL GetPerfQueryIdByNameINTEL} */
	public static void glGetPerfQueryIdByNameINTEL(ByteBuffer queryName, IntBuffer queryId) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(queryId, 1);
		nglGetPerfQueryIdByNameINTEL(memAddress(queryName), memAddress(queryId));
	}

	/** CharSequence version of: {@link #glGetPerfQueryIdByNameINTEL GetPerfQueryIdByNameINTEL} */
	public static void glGetPerfQueryIdByNameINTEL(CharSequence queryName, IntBuffer queryId) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(queryId, 1);
		APIBuffer __buffer = apiBuffer();
		int queryNameEncoded = __buffer.stringParamASCII(queryName, true);
		nglGetPerfQueryIdByNameINTEL(__buffer.address(queryNameEncoded), memAddress(queryId));
	}

	/** Single return value version of: {@link #glGetPerfQueryIdByNameINTEL GetPerfQueryIdByNameINTEL} */
	public static int glGetPerfQueryIdByNameINTEL(CharSequence queryName) {
		APIBuffer __buffer = apiBuffer();
		int queryNameEncoded = __buffer.stringParamASCII(queryName, true);
		int queryId = __buffer.intParam();
		nglGetPerfQueryIdByNameINTEL(__buffer.address(queryNameEncoded), __buffer.address(queryId));
		return __buffer.intValue(queryId);
	}

	// --- [ glGetPerfQueryInfoINTEL ] ---

	/** Unsafe version of {@link #glGetPerfQueryInfoINTEL GetPerfQueryInfoINTEL} */
	@JavadocExclude
	public static void nglGetPerfQueryInfoINTEL(int queryId, int queryNameLength, long queryName, long dataSize, long noCounters, long noInstances, long capsMask) {
		long __functionAddress = getInstance().GetPerfQueryInfoINTEL;
		callIIPPPPPV(__functionAddress, queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask);
	}

	public static void glGetPerfQueryInfoINTEL(int queryId, int queryNameLength, ByteBuffer queryName, ByteBuffer dataSize, ByteBuffer noCounters, ByteBuffer noInstances, ByteBuffer capsMask) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(queryName, queryNameLength);
			checkBuffer(dataSize, 1 << 2);
			checkBuffer(noCounters, 1 << 2);
			checkBuffer(noInstances, 1 << 2);
			checkBuffer(capsMask, 1 << 2);
		}
		nglGetPerfQueryInfoINTEL(queryId, queryNameLength, memAddress(queryName), memAddress(dataSize), memAddress(noCounters), memAddress(noInstances), memAddress(capsMask));
	}

	/** Alternative version of: {@link #glGetPerfQueryInfoINTEL GetPerfQueryInfoINTEL} */
	public static void glGetPerfQueryInfoINTEL(int queryId, ByteBuffer queryName, IntBuffer dataSize, IntBuffer noCounters, IntBuffer noInstances, IntBuffer capsMask) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(dataSize, 1);
			checkBuffer(noCounters, 1);
			checkBuffer(noInstances, 1);
			checkBuffer(capsMask, 1);
		}
		nglGetPerfQueryInfoINTEL(queryId, queryName.remaining(), memAddress(queryName), memAddress(dataSize), memAddress(noCounters), memAddress(noInstances), memAddress(capsMask));
	}

}