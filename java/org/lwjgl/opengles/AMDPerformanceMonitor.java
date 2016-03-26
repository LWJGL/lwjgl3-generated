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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/AMD/performance_monitor.txt">AMD_performance_monitor</a> extension.
 * 
 * <p>This extension enables the capture and reporting of performance monitors. Performance monitors contain groups of counters which hold arbitrary counted
 * data. Typically, the counters hold information on performance-related counters in the underlying hardware. The extension is general enough to allow the
 * implementation to choose which counters to expose and pick the data type and range of the counters. The extension also allows counting to start and end
 * on arbitrary boundaries during rendering.</p>
 */
public class AMDPerformanceMonitor {

	/** Accepted by the {@code pame} parameter of GetPerfMonitorCounterInfoAMD. */
	public static final int
		GL_COUNTER_TYPE_AMD  = 0x8BC0,
		GL_COUNTER_RANGE_AMD = 0x8BC1;

	/** Returned as a valid value in {@code data} parameter of GetPerfMonitorCounterInfoAMD if {@code pname} = COUNTER_TYPE_AMD. */
	public static final int
		GL_UNSIGNED_INT64_AMD = 0x8BC2,
		GL_PERCENTAGE_AMD     = 0x8BC3;

	/** Accepted by the {@code pname} parameter of GetPerfMonitorCounterDataAMD. */
	public static final int
		GL_PERFMON_RESULT_AVAILABLE_AMD = 0x8BC4,
		GL_PERFMON_RESULT_SIZE_AMD      = 0x8BC5,
		GL_PERFMON_RESULT_AMD           = 0x8BC6;

	protected AMDPerformanceMonitor() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glGetPerfMonitorGroupsAMD, caps.glGetPerfMonitorCountersAMD, caps.glGetPerfMonitorGroupStringAMD, caps.glGetPerfMonitorCounterStringAMD, 
			caps.glGetPerfMonitorCounterInfoAMD, caps.glGenPerfMonitorsAMD, caps.glDeletePerfMonitorsAMD, caps.glSelectPerfMonitorCountersAMD, 
			caps.glBeginPerfMonitorAMD, caps.glEndPerfMonitorAMD, caps.glGetPerfMonitorCounterDataAMD
		);
	}

	// --- [ glGetPerfMonitorGroupsAMD ] ---

	/** Unsafe version of {@link #glGetPerfMonitorGroupsAMD GetPerfMonitorGroupsAMD} */
	public static void nglGetPerfMonitorGroupsAMD(long numGroups, int groupsSize, long groups) {
		long __functionAddress = GLES.getCapabilities().glGetPerfMonitorGroupsAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIPV(__functionAddress, numGroups, groupsSize, groups);
	}

	public static void glGetPerfMonitorGroupsAMD(ByteBuffer numGroups, int groupsSize, ByteBuffer groups) {
		if ( CHECKS ) {
			if ( numGroups != null ) checkBuffer(numGroups, 1 << 2);
			if ( groups != null ) checkBuffer(groups, groupsSize << 2);
		}
		nglGetPerfMonitorGroupsAMD(memAddressSafe(numGroups), groupsSize, memAddressSafe(groups));
	}

	/** Alternative version of: {@link #glGetPerfMonitorGroupsAMD GetPerfMonitorGroupsAMD} */
	public static void glGetPerfMonitorGroupsAMD(IntBuffer numGroups, IntBuffer groups) {
		if ( CHECKS )
			if ( numGroups != null ) checkBuffer(numGroups, 1);
		nglGetPerfMonitorGroupsAMD(memAddressSafe(numGroups), groups == null ? 0 : groups.remaining(), memAddressSafe(groups));
	}

	// --- [ glGetPerfMonitorCountersAMD ] ---

	/** Unsafe version of {@link #glGetPerfMonitorCountersAMD GetPerfMonitorCountersAMD} */
	public static void nglGetPerfMonitorCountersAMD(int group, long numCounters, long maxActiveCounters, int counterSize, long counters) {
		long __functionAddress = GLES.getCapabilities().glGetPerfMonitorCountersAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPPIPV(__functionAddress, group, numCounters, maxActiveCounters, counterSize, counters);
	}

	public static void glGetPerfMonitorCountersAMD(int group, ByteBuffer numCounters, ByteBuffer maxActiveCounters, int counterSize, ByteBuffer counters) {
		if ( CHECKS ) {
			checkBuffer(numCounters, 1 << 2);
			checkBuffer(maxActiveCounters, 1 << 2);
			checkBuffer(counters, counterSize << 2);
		}
		nglGetPerfMonitorCountersAMD(group, memAddress(numCounters), memAddress(maxActiveCounters), counterSize, memAddress(counters));
	}

	/** Alternative version of: {@link #glGetPerfMonitorCountersAMD GetPerfMonitorCountersAMD} */
	public static void glGetPerfMonitorCountersAMD(int group, IntBuffer numCounters, IntBuffer maxActiveCounters, IntBuffer counters) {
		if ( CHECKS ) {
			checkBuffer(numCounters, 1);
			checkBuffer(maxActiveCounters, 1);
		}
		nglGetPerfMonitorCountersAMD(group, memAddress(numCounters), memAddress(maxActiveCounters), counters.remaining(), memAddress(counters));
	}

	// --- [ glGetPerfMonitorGroupStringAMD ] ---

	/** Unsafe version of {@link #glGetPerfMonitorGroupStringAMD GetPerfMonitorGroupStringAMD} */
	public static void nglGetPerfMonitorGroupStringAMD(int group, int bufSize, long length, long groupString) {
		long __functionAddress = GLES.getCapabilities().glGetPerfMonitorGroupStringAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPPV(__functionAddress, group, bufSize, length, groupString);
	}

	public static void glGetPerfMonitorGroupStringAMD(int group, int bufSize, ByteBuffer length, ByteBuffer groupString) {
		if ( CHECKS ) {
			checkBuffer(groupString, bufSize);
			checkBuffer(length, 1 << 2);
		}
		nglGetPerfMonitorGroupStringAMD(group, bufSize, memAddress(length), memAddress(groupString));
	}

	/** Alternative version of: {@link #glGetPerfMonitorGroupStringAMD GetPerfMonitorGroupStringAMD} */
	public static void glGetPerfMonitorGroupStringAMD(int group, IntBuffer length, ByteBuffer groupString) {
		if ( CHECKS )
			checkBuffer(length, 1);
		nglGetPerfMonitorGroupStringAMD(group, groupString.remaining(), memAddress(length), memAddress(groupString));
	}

	// --- [ glGetPerfMonitorCounterStringAMD ] ---

	/** Unsafe version of {@link #glGetPerfMonitorCounterStringAMD GetPerfMonitorCounterStringAMD} */
	public static void nglGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, long length, long counterString) {
		long __functionAddress = GLES.getCapabilities().glGetPerfMonitorCounterStringAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPPV(__functionAddress, group, counter, bufSize, length, counterString);
	}

	public static void glGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, ByteBuffer length, ByteBuffer counterString) {
		if ( CHECKS ) {
			if ( counterString != null ) checkBuffer(counterString, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetPerfMonitorCounterStringAMD(group, counter, bufSize, memAddressSafe(length), memAddressSafe(counterString));
	}

	/** Alternative version of: {@link #glGetPerfMonitorCounterStringAMD GetPerfMonitorCounterStringAMD} */
	public static void glGetPerfMonitorCounterStringAMD(int group, int counter, IntBuffer length, ByteBuffer counterString) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetPerfMonitorCounterStringAMD(group, counter, counterString == null ? 0 : counterString.remaining(), memAddressSafe(length), memAddressSafe(counterString));
	}

	// --- [ glGetPerfMonitorCounterInfoAMD ] ---

	/** Unsafe version of {@link #glGetPerfMonitorCounterInfoAMD GetPerfMonitorCounterInfoAMD} */
	public static void nglGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, long data) {
		long __functionAddress = GLES.getCapabilities().glGetPerfMonitorCounterInfoAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, group, counter, pname, data);
	}

	public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, ByteBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 4);
		nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
	}

	/** IntBuffer version of: {@link #glGetPerfMonitorCounterInfoAMD GetPerfMonitorCounterInfoAMD} */
	public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, IntBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 4 >> 2);
		nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glGetPerfMonitorCounterInfoAMD GetPerfMonitorCounterInfoAMD} */
	public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, FloatBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 4 >> 2);
		nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
	}

	// --- [ glGenPerfMonitorsAMD ] ---

	/** Unsafe version of {@link #glGenPerfMonitorsAMD GenPerfMonitorsAMD} */
	public static void nglGenPerfMonitorsAMD(int n, long monitors) {
		long __functionAddress = GLES.getCapabilities().glGenPerfMonitorsAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, n, monitors);
	}

	public static void glGenPerfMonitorsAMD(int n, ByteBuffer monitors) {
		if ( CHECKS )
			checkBuffer(monitors, n << 2);
		nglGenPerfMonitorsAMD(n, memAddress(monitors));
	}

	/** Alternative version of: {@link #glGenPerfMonitorsAMD GenPerfMonitorsAMD} */
	public static void glGenPerfMonitorsAMD(IntBuffer monitors) {
		nglGenPerfMonitorsAMD(monitors.remaining(), memAddress(monitors));
	}

	/** Single return value version of: {@link #glGenPerfMonitorsAMD GenPerfMonitorsAMD} */
	public static int glGenPerfMonitorsAMD() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer monitors = stack.callocInt(1);
			nglGenPerfMonitorsAMD(1, memAddress(monitors));
			return monitors.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeletePerfMonitorsAMD ] ---

	/** Unsafe version of {@link #glDeletePerfMonitorsAMD DeletePerfMonitorsAMD} */
	public static void nglDeletePerfMonitorsAMD(int n, long monitors) {
		long __functionAddress = GLES.getCapabilities().glDeletePerfMonitorsAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, n, monitors);
	}

	public static void glDeletePerfMonitorsAMD(int n, ByteBuffer monitors) {
		if ( CHECKS )
			checkBuffer(monitors, n << 2);
		nglDeletePerfMonitorsAMD(n, memAddress(monitors));
	}

	/** Alternative version of: {@link #glDeletePerfMonitorsAMD DeletePerfMonitorsAMD} */
	public static void glDeletePerfMonitorsAMD(IntBuffer monitors) {
		nglDeletePerfMonitorsAMD(monitors.remaining(), memAddress(monitors));
	}

	/** Single value version of: {@link #glDeletePerfMonitorsAMD DeletePerfMonitorsAMD} */
	public static void glDeletePerfMonitorsAMD(int monitor) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer monitors = stack.ints(monitor);
			nglDeletePerfMonitorsAMD(1, memAddress(monitors));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glSelectPerfMonitorCountersAMD ] ---

	/** Unsafe version of {@link #glSelectPerfMonitorCountersAMD SelectPerfMonitorCountersAMD} */
	public static void nglSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, long counterList) {
		long __functionAddress = GLES.getCapabilities().glSelectPerfMonitorCountersAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIZIIPV(__functionAddress, monitor, enable, group, numCounters, counterList);
	}

	public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, ByteBuffer counterList) {
		if ( CHECKS )
			checkBuffer(counterList, numCounters << 2);
		nglSelectPerfMonitorCountersAMD(monitor, enable, group, numCounters, memAddress(counterList));
	}

	/** Alternative version of: {@link #glSelectPerfMonitorCountersAMD SelectPerfMonitorCountersAMD} */
	public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, IntBuffer counterList) {
		nglSelectPerfMonitorCountersAMD(monitor, enable, group, counterList.remaining(), memAddress(counterList));
	}

	// --- [ glBeginPerfMonitorAMD ] ---

	public static void glBeginPerfMonitorAMD(int monitor) {
		long __functionAddress = GLES.getCapabilities().glBeginPerfMonitorAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIV(__functionAddress, monitor);
	}

	// --- [ glEndPerfMonitorAMD ] ---

	public static void glEndPerfMonitorAMD(int monitor) {
		long __functionAddress = GLES.getCapabilities().glEndPerfMonitorAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIV(__functionAddress, monitor);
	}

	// --- [ glGetPerfMonitorCounterDataAMD ] ---

	/** Unsafe version of {@link #glGetPerfMonitorCounterDataAMD GetPerfMonitorCounterDataAMD} */
	public static void nglGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, long data, long bytesWritten) {
		long __functionAddress = GLES.getCapabilities().glGetPerfMonitorCounterDataAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPPV(__functionAddress, monitor, pname, dataSize, data, bytesWritten);
	}

	public static void glGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, ByteBuffer data, ByteBuffer bytesWritten) {
		if ( CHECKS ) {
			checkBuffer(data, dataSize << 2);
			if ( bytesWritten != null ) checkBuffer(bytesWritten, 1 << 2);
		}
		nglGetPerfMonitorCounterDataAMD(monitor, pname, dataSize, memAddress(data), memAddressSafe(bytesWritten));
	}

	/** Alternative version of: {@link #glGetPerfMonitorCounterDataAMD GetPerfMonitorCounterDataAMD} */
	public static void glGetPerfMonitorCounterDataAMD(int monitor, int pname, IntBuffer data, IntBuffer bytesWritten) {
		if ( CHECKS )
			if ( bytesWritten != null ) checkBuffer(bytesWritten, 1);
		nglGetPerfMonitorCounterDataAMD(monitor, pname, data.remaining(), memAddress(data), memAddressSafe(bytesWritten));
	}

}