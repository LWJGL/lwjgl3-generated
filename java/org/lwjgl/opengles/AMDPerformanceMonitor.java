/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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

	static { GLES.initialize(); }

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

	public static native void nglGetPerfMonitorGroupsAMD(long numGroups, int groupsSize, long groups);

	public static void glGetPerfMonitorGroupsAMD(IntBuffer numGroups, IntBuffer groups) {
		if ( CHECKS )
			checkSafe(numGroups, 1);
		nglGetPerfMonitorGroupsAMD(memAddressSafe(numGroups), remainingSafe(groups), memAddressSafe(groups));
	}

	// --- [ glGetPerfMonitorCountersAMD ] ---

	public static native void nglGetPerfMonitorCountersAMD(int group, long numCounters, long maxActiveCounters, int counterSize, long counters);

	public static void glGetPerfMonitorCountersAMD(int group, IntBuffer numCounters, IntBuffer maxActiveCounters, IntBuffer counters) {
		if ( CHECKS ) {
			check(numCounters, 1);
			check(maxActiveCounters, 1);
		}
		nglGetPerfMonitorCountersAMD(group, memAddress(numCounters), memAddress(maxActiveCounters), counters.remaining(), memAddress(counters));
	}

	// --- [ glGetPerfMonitorGroupStringAMD ] ---

	public static native void nglGetPerfMonitorGroupStringAMD(int group, int bufSize, long length, long groupString);

	public static void glGetPerfMonitorGroupStringAMD(int group, IntBuffer length, ByteBuffer groupString) {
		if ( CHECKS )
			check(length, 1);
		nglGetPerfMonitorGroupStringAMD(group, groupString.remaining(), memAddress(length), memAddress(groupString));
	}

	// --- [ glGetPerfMonitorCounterStringAMD ] ---

	public static native void nglGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, long length, long counterString);

	public static void glGetPerfMonitorCounterStringAMD(int group, int counter, IntBuffer length, ByteBuffer counterString) {
		if ( CHECKS )
			checkSafe(length, 1);
		nglGetPerfMonitorCounterStringAMD(group, counter, remainingSafe(counterString), memAddressSafe(length), memAddressSafe(counterString));
	}

	// --- [ glGetPerfMonitorCounterInfoAMD ] ---

	public static native void nglGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, long data);

	public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, ByteBuffer data) {
		if ( CHECKS )
			check(data, 4);
		nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
	}

	public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, IntBuffer data) {
		if ( CHECKS )
			check(data, 4 >> 2);
		nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
	}

	public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, FloatBuffer data) {
		if ( CHECKS )
			check(data, 4 >> 2);
		nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
	}

	// --- [ glGenPerfMonitorsAMD ] ---

	public static native void nglGenPerfMonitorsAMD(int n, long monitors);

	public static void glGenPerfMonitorsAMD(IntBuffer monitors) {
		nglGenPerfMonitorsAMD(monitors.remaining(), memAddress(monitors));
	}

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

	public static native void nglDeletePerfMonitorsAMD(int n, long monitors);

	public static void glDeletePerfMonitorsAMD(IntBuffer monitors) {
		nglDeletePerfMonitorsAMD(monitors.remaining(), memAddress(monitors));
	}

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

	public static native void nglSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, long counterList);

	public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, IntBuffer counterList) {
		nglSelectPerfMonitorCountersAMD(monitor, enable, group, counterList.remaining(), memAddress(counterList));
	}

	// --- [ glBeginPerfMonitorAMD ] ---

	public static native void nglBeginPerfMonitorAMD(int monitor);

	public static void glBeginPerfMonitorAMD(int monitor) {
		nglBeginPerfMonitorAMD(monitor);
	}

	// --- [ glEndPerfMonitorAMD ] ---

	public static native void nglEndPerfMonitorAMD(int monitor);

	public static void glEndPerfMonitorAMD(int monitor) {
		nglEndPerfMonitorAMD(monitor);
	}

	// --- [ glGetPerfMonitorCounterDataAMD ] ---

	public static native void nglGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, long data, long bytesWritten);

	public static void glGetPerfMonitorCounterDataAMD(int monitor, int pname, IntBuffer data, IntBuffer bytesWritten) {
		if ( CHECKS )
			checkSafe(bytesWritten, 1);
		nglGetPerfMonitorCounterDataAMD(monitor, pname, data.remaining(), memAddress(data), memAddressSafe(bytesWritten));
	}

	/** Array version of: {@link #glGetPerfMonitorGroupsAMD GetPerfMonitorGroupsAMD} */
	public static void glGetPerfMonitorGroupsAMD(int[] numGroups, int[] groups) {
		long __functionAddress = GLES.getICD().glGetPerfMonitorGroupsAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(numGroups, 1);
		}
		callPPV(__functionAddress, numGroups, lengthSafe(groups), groups);
	}

	/** Array version of: {@link #glGetPerfMonitorCountersAMD GetPerfMonitorCountersAMD} */
	public static void glGetPerfMonitorCountersAMD(int group, int[] numCounters, int[] maxActiveCounters, int[] counters) {
		long __functionAddress = GLES.getICD().glGetPerfMonitorCountersAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			check(numCounters, 1);
			check(maxActiveCounters, 1);
		}
		callPPPV(__functionAddress, group, numCounters, maxActiveCounters, counters.length, counters);
	}

	/** Array version of: {@link #glGetPerfMonitorGroupStringAMD GetPerfMonitorGroupStringAMD} */
	public static void glGetPerfMonitorGroupStringAMD(int group, int[] length, ByteBuffer groupString) {
		long __functionAddress = GLES.getICD().glGetPerfMonitorGroupStringAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			check(length, 1);
		}
		callPPV(__functionAddress, group, groupString.remaining(), length, memAddress(groupString));
	}

	/** Array version of: {@link #glGetPerfMonitorCounterStringAMD GetPerfMonitorCounterStringAMD} */
	public static void glGetPerfMonitorCounterStringAMD(int group, int counter, int[] length, ByteBuffer counterString) {
		long __functionAddress = GLES.getICD().glGetPerfMonitorCounterStringAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(length, 1);
		}
		callPPV(__functionAddress, group, counter, remainingSafe(counterString), length, memAddressSafe(counterString));
	}

	/** Array version of: {@link #glGetPerfMonitorCounterInfoAMD GetPerfMonitorCounterInfoAMD} */
	public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, int[] data) {
		long __functionAddress = GLES.getICD().glGetPerfMonitorCounterInfoAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 4 >> 2);
		}
		callPV(__functionAddress, group, counter, pname, data);
	}

	/** Array version of: {@link #glGetPerfMonitorCounterInfoAMD GetPerfMonitorCounterInfoAMD} */
	public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, float[] data) {
		long __functionAddress = GLES.getICD().glGetPerfMonitorCounterInfoAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 4 >> 2);
		}
		callPV(__functionAddress, group, counter, pname, data);
	}

	/** Array version of: {@link #glGenPerfMonitorsAMD GenPerfMonitorsAMD} */
	public static void glGenPerfMonitorsAMD(int[] monitors) {
		long __functionAddress = GLES.getICD().glGenPerfMonitorsAMD;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, monitors.length, monitors);
	}

	/** Array version of: {@link #glDeletePerfMonitorsAMD DeletePerfMonitorsAMD} */
	public static void glDeletePerfMonitorsAMD(int[] monitors) {
		long __functionAddress = GLES.getICD().glDeletePerfMonitorsAMD;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, monitors.length, monitors);
	}

	/** Array version of: {@link #glSelectPerfMonitorCountersAMD SelectPerfMonitorCountersAMD} */
	public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int[] counterList) {
		long __functionAddress = GLES.getICD().glSelectPerfMonitorCountersAMD;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, monitor, enable, group, counterList.length, counterList);
	}

	/** Array version of: {@link #glGetPerfMonitorCounterDataAMD GetPerfMonitorCounterDataAMD} */
	public static void glGetPerfMonitorCounterDataAMD(int monitor, int pname, int[] data, int[] bytesWritten) {
		long __functionAddress = GLES.getICD().glGetPerfMonitorCounterDataAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(bytesWritten, 1);
		}
		callPPV(__functionAddress, monitor, pname, data.length, data, bytesWritten);
	}

}