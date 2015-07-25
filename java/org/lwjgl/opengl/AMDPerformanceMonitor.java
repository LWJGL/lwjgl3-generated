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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/performance_monitor.txt">AMD_performance_monitor</a> extension.
 * 
 * <p>This extension enables the capture and reporting of performance monitors. Performance monitors contain groups of counters which hold arbitrary counted
 * data. Typically, the counters hold information on performance-related counters in the underlying hardware. The extension is general enough to allow the
 * implementation to choose which counters to expose and pick the data type and range of the counters. The extension also allows counting to start and end
 * on arbitrary boundaries during rendering.</p>
 */
public final class AMDPerformanceMonitor {

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

	/** Function address. */
	@JavadocExclude
	public final long
		GetPerfMonitorGroupsAMD,
		GetPerfMonitorCountersAMD,
		GetPerfMonitorGroupStringAMD,
		GetPerfMonitorCounterStringAMD,
		GetPerfMonitorCounterInfoAMD,
		GenPerfMonitorsAMD,
		DeletePerfMonitorsAMD,
		SelectPerfMonitorCountersAMD,
		BeginPerfMonitorAMD,
		EndPerfMonitorAMD,
		GetPerfMonitorCounterDataAMD;

	@JavadocExclude
	public AMDPerformanceMonitor(FunctionProvider provider) {
		GetPerfMonitorGroupsAMD = provider.getFunctionAddress("glGetPerfMonitorGroupsAMD");
		GetPerfMonitorCountersAMD = provider.getFunctionAddress("glGetPerfMonitorCountersAMD");
		GetPerfMonitorGroupStringAMD = provider.getFunctionAddress("glGetPerfMonitorGroupStringAMD");
		GetPerfMonitorCounterStringAMD = provider.getFunctionAddress("glGetPerfMonitorCounterStringAMD");
		GetPerfMonitorCounterInfoAMD = provider.getFunctionAddress("glGetPerfMonitorCounterInfoAMD");
		GenPerfMonitorsAMD = provider.getFunctionAddress("glGenPerfMonitorsAMD");
		DeletePerfMonitorsAMD = provider.getFunctionAddress("glDeletePerfMonitorsAMD");
		SelectPerfMonitorCountersAMD = provider.getFunctionAddress("glSelectPerfMonitorCountersAMD");
		BeginPerfMonitorAMD = provider.getFunctionAddress("glBeginPerfMonitorAMD");
		EndPerfMonitorAMD = provider.getFunctionAddress("glEndPerfMonitorAMD");
		GetPerfMonitorCounterDataAMD = provider.getFunctionAddress("glGetPerfMonitorCounterDataAMD");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link AMDPerformanceMonitor} instance for the current context. */
	public static AMDPerformanceMonitor getInstance() {
		return checkFunctionality(GL.getCapabilities().__AMDPerformanceMonitor);
	}

	static AMDPerformanceMonitor create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_AMD_performance_monitor") ) return null;

		AMDPerformanceMonitor funcs = new AMDPerformanceMonitor(provider);

		boolean supported = checkFunctions(
			funcs.GetPerfMonitorGroupsAMD, funcs.GetPerfMonitorCountersAMD, funcs.GetPerfMonitorGroupStringAMD, funcs.GetPerfMonitorCounterStringAMD, 
			funcs.GetPerfMonitorCounterInfoAMD, funcs.GenPerfMonitorsAMD, funcs.DeletePerfMonitorsAMD, funcs.SelectPerfMonitorCountersAMD, 
			funcs.BeginPerfMonitorAMD, funcs.EndPerfMonitorAMD, funcs.GetPerfMonitorCounterDataAMD
		);

		return GL.checkExtension("GL_AMD_performance_monitor", funcs, supported);
	}

	// --- [ glGetPerfMonitorGroupsAMD ] ---

	/** JNI method for {@link #glGetPerfMonitorGroupsAMD GetPerfMonitorGroupsAMD} */
	@JavadocExclude
	public static native void nglGetPerfMonitorGroupsAMD(long numGroups, int groupsSize, long groups, long __functionAddress);

	/** Unsafe version of {@link #glGetPerfMonitorGroupsAMD GetPerfMonitorGroupsAMD} */
	@JavadocExclude
	public static void nglGetPerfMonitorGroupsAMD(long numGroups, int groupsSize, long groups) {
		long __functionAddress = getInstance().GetPerfMonitorGroupsAMD;
		nglGetPerfMonitorGroupsAMD(numGroups, groupsSize, groups, __functionAddress);
	}

	public static void glGetPerfMonitorGroupsAMD(ByteBuffer numGroups, int groupsSize, ByteBuffer groups) {
		if ( LWJGLUtil.CHECKS ) {
			if ( numGroups != null ) checkBuffer(numGroups, 1 << 2);
			if ( groups != null ) checkBuffer(groups, groupsSize << 2);
		}
		nglGetPerfMonitorGroupsAMD(memAddressSafe(numGroups), groupsSize, memAddressSafe(groups));
	}

	/** Alternative version of: {@link #glGetPerfMonitorGroupsAMD GetPerfMonitorGroupsAMD} */
	public static void glGetPerfMonitorGroupsAMD(IntBuffer numGroups, IntBuffer groups) {
		if ( LWJGLUtil.CHECKS )
			if ( numGroups != null ) checkBuffer(numGroups, 1);
		nglGetPerfMonitorGroupsAMD(memAddressSafe(numGroups), groups == null ? 0 : groups.remaining(), memAddressSafe(groups));
	}

	// --- [ glGetPerfMonitorCountersAMD ] ---

	/** JNI method for {@link #glGetPerfMonitorCountersAMD GetPerfMonitorCountersAMD} */
	@JavadocExclude
	public static native void nglGetPerfMonitorCountersAMD(int group, long numCounters, long maxActiveCounters, int counterSize, long counters, long __functionAddress);

	/** Unsafe version of {@link #glGetPerfMonitorCountersAMD GetPerfMonitorCountersAMD} */
	@JavadocExclude
	public static void nglGetPerfMonitorCountersAMD(int group, long numCounters, long maxActiveCounters, int counterSize, long counters) {
		long __functionAddress = getInstance().GetPerfMonitorCountersAMD;
		nglGetPerfMonitorCountersAMD(group, numCounters, maxActiveCounters, counterSize, counters, __functionAddress);
	}

	public static void glGetPerfMonitorCountersAMD(int group, ByteBuffer numCounters, ByteBuffer maxActiveCounters, int counterSize, ByteBuffer counters) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(numCounters, 1 << 2);
			checkBuffer(maxActiveCounters, 1 << 2);
			checkBuffer(counters, counterSize << 2);
		}
		nglGetPerfMonitorCountersAMD(group, memAddress(numCounters), memAddress(maxActiveCounters), counterSize, memAddress(counters));
	}

	/** Alternative version of: {@link #glGetPerfMonitorCountersAMD GetPerfMonitorCountersAMD} */
	public static void glGetPerfMonitorCountersAMD(int group, IntBuffer numCounters, IntBuffer maxActiveCounters, IntBuffer counters) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(numCounters, 1);
			checkBuffer(maxActiveCounters, 1);
		}
		nglGetPerfMonitorCountersAMD(group, memAddress(numCounters), memAddress(maxActiveCounters), counters.remaining(), memAddress(counters));
	}

	// --- [ glGetPerfMonitorGroupStringAMD ] ---

	/** JNI method for {@link #glGetPerfMonitorGroupStringAMD GetPerfMonitorGroupStringAMD} */
	@JavadocExclude
	public static native void nglGetPerfMonitorGroupStringAMD(int group, int bufSize, long length, long groupString, long __functionAddress);

	/** Unsafe version of {@link #glGetPerfMonitorGroupStringAMD GetPerfMonitorGroupStringAMD} */
	@JavadocExclude
	public static void nglGetPerfMonitorGroupStringAMD(int group, int bufSize, long length, long groupString) {
		long __functionAddress = getInstance().GetPerfMonitorGroupStringAMD;
		nglGetPerfMonitorGroupStringAMD(group, bufSize, length, groupString, __functionAddress);
	}

	public static void glGetPerfMonitorGroupStringAMD(int group, int bufSize, ByteBuffer length, ByteBuffer groupString) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(groupString, bufSize);
			checkBuffer(length, 1 << 2);
		}
		nglGetPerfMonitorGroupStringAMD(group, bufSize, memAddress(length), memAddress(groupString));
	}

	/** Alternative version of: {@link #glGetPerfMonitorGroupStringAMD GetPerfMonitorGroupStringAMD} */
	public static void glGetPerfMonitorGroupStringAMD(int group, IntBuffer length, ByteBuffer groupString) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(length, 1);
		nglGetPerfMonitorGroupStringAMD(group, groupString.remaining(), memAddress(length), memAddress(groupString));
	}

	// --- [ glGetPerfMonitorCounterStringAMD ] ---

	/** JNI method for {@link #glGetPerfMonitorCounterStringAMD GetPerfMonitorCounterStringAMD} */
	@JavadocExclude
	public static native void nglGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, long length, long counterString, long __functionAddress);

	/** Unsafe version of {@link #glGetPerfMonitorCounterStringAMD GetPerfMonitorCounterStringAMD} */
	@JavadocExclude
	public static void nglGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, long length, long counterString) {
		long __functionAddress = getInstance().GetPerfMonitorCounterStringAMD;
		nglGetPerfMonitorCounterStringAMD(group, counter, bufSize, length, counterString, __functionAddress);
	}

	public static void glGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, ByteBuffer length, ByteBuffer counterString) {
		if ( LWJGLUtil.CHECKS ) {
			if ( counterString != null ) checkBuffer(counterString, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetPerfMonitorCounterStringAMD(group, counter, bufSize, memAddressSafe(length), memAddressSafe(counterString));
	}

	/** Alternative version of: {@link #glGetPerfMonitorCounterStringAMD GetPerfMonitorCounterStringAMD} */
	public static void glGetPerfMonitorCounterStringAMD(int group, int counter, IntBuffer length, ByteBuffer counterString) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetPerfMonitorCounterStringAMD(group, counter, counterString == null ? 0 : counterString.remaining(), memAddressSafe(length), memAddressSafe(counterString));
	}

	// --- [ glGetPerfMonitorCounterInfoAMD ] ---

	/** JNI method for {@link #glGetPerfMonitorCounterInfoAMD GetPerfMonitorCounterInfoAMD} */
	@JavadocExclude
	public static native void nglGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetPerfMonitorCounterInfoAMD GetPerfMonitorCounterInfoAMD} */
	@JavadocExclude
	public static void nglGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, long data) {
		long __functionAddress = getInstance().GetPerfMonitorCounterInfoAMD;
		nglGetPerfMonitorCounterInfoAMD(group, counter, pname, data, __functionAddress);
	}

	public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, ByteBuffer data) {
		nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
	}

	// --- [ glGenPerfMonitorsAMD ] ---

	/** JNI method for {@link #glGenPerfMonitorsAMD GenPerfMonitorsAMD} */
	@JavadocExclude
	public static native void nglGenPerfMonitorsAMD(int n, long monitors, long __functionAddress);

	/** Unsafe version of {@link #glGenPerfMonitorsAMD GenPerfMonitorsAMD} */
	@JavadocExclude
	public static void nglGenPerfMonitorsAMD(int n, long monitors) {
		long __functionAddress = getInstance().GenPerfMonitorsAMD;
		nglGenPerfMonitorsAMD(n, monitors, __functionAddress);
	}

	public static void glGenPerfMonitorsAMD(int n, ByteBuffer monitors) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(monitors, n << 2);
		nglGenPerfMonitorsAMD(n, memAddress(monitors));
	}

	/** Alternative version of: {@link #glGenPerfMonitorsAMD GenPerfMonitorsAMD} */
	public static void glGenPerfMonitorsAMD(IntBuffer monitors) {
		nglGenPerfMonitorsAMD(monitors.remaining(), memAddress(monitors));
	}

	/** Single return value version of: {@link #glGenPerfMonitorsAMD GenPerfMonitorsAMD} */
	public static int glGenPerfMonitorsAMD() {
		APIBuffer __buffer = apiBuffer();
		int monitors = __buffer.intParam();
		nglGenPerfMonitorsAMD(1, __buffer.address(monitors));
		return __buffer.intValue(monitors);
	}

	// --- [ glDeletePerfMonitorsAMD ] ---

	/** JNI method for {@link #glDeletePerfMonitorsAMD DeletePerfMonitorsAMD} */
	@JavadocExclude
	public static native void nglDeletePerfMonitorsAMD(int n, long monitors, long __functionAddress);

	/** Unsafe version of {@link #glDeletePerfMonitorsAMD DeletePerfMonitorsAMD} */
	@JavadocExclude
	public static void nglDeletePerfMonitorsAMD(int n, long monitors) {
		long __functionAddress = getInstance().DeletePerfMonitorsAMD;
		nglDeletePerfMonitorsAMD(n, monitors, __functionAddress);
	}

	public static void glDeletePerfMonitorsAMD(int n, ByteBuffer monitors) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(monitors, n << 2);
		nglDeletePerfMonitorsAMD(n, memAddress(monitors));
	}

	/** Alternative version of: {@link #glDeletePerfMonitorsAMD DeletePerfMonitorsAMD} */
	public static void glDeletePerfMonitorsAMD(IntBuffer monitors) {
		nglDeletePerfMonitorsAMD(monitors.remaining(), memAddress(monitors));
	}

	/** Single value version of: {@link #glDeletePerfMonitorsAMD DeletePerfMonitorsAMD} */
	public static void glDeletePerfMonitorsAMD(int monitor) {
		APIBuffer __buffer = apiBuffer();
		int monitors = __buffer.intParam(monitor);
		nglDeletePerfMonitorsAMD(1, __buffer.address(monitors));
	}

	// --- [ glSelectPerfMonitorCountersAMD ] ---

	/** JNI method for {@link #glSelectPerfMonitorCountersAMD SelectPerfMonitorCountersAMD} */
	@JavadocExclude
	public static native void nglSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, long counterList, long __functionAddress);

	/** Unsafe version of {@link #glSelectPerfMonitorCountersAMD SelectPerfMonitorCountersAMD} */
	@JavadocExclude
	public static void nglSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, long counterList) {
		long __functionAddress = getInstance().SelectPerfMonitorCountersAMD;
		nglSelectPerfMonitorCountersAMD(monitor, enable, group, numCounters, counterList, __functionAddress);
	}

	public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, ByteBuffer counterList) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(counterList, numCounters << 2);
		nglSelectPerfMonitorCountersAMD(monitor, enable, group, numCounters, memAddress(counterList));
	}

	/** Alternative version of: {@link #glSelectPerfMonitorCountersAMD SelectPerfMonitorCountersAMD} */
	public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, IntBuffer counterList) {
		nglSelectPerfMonitorCountersAMD(monitor, enable, group, counterList.remaining(), memAddress(counterList));
	}

	// --- [ glBeginPerfMonitorAMD ] ---

	/** JNI method for {@link #glBeginPerfMonitorAMD BeginPerfMonitorAMD} */
	@JavadocExclude
	public static native void nglBeginPerfMonitorAMD(int monitor, long __functionAddress);

	public static void glBeginPerfMonitorAMD(int monitor) {
		long __functionAddress = getInstance().BeginPerfMonitorAMD;
		nglBeginPerfMonitorAMD(monitor, __functionAddress);
	}

	// --- [ glEndPerfMonitorAMD ] ---

	/** JNI method for {@link #glEndPerfMonitorAMD EndPerfMonitorAMD} */
	@JavadocExclude
	public static native void nglEndPerfMonitorAMD(int monitor, long __functionAddress);

	public static void glEndPerfMonitorAMD(int monitor) {
		long __functionAddress = getInstance().EndPerfMonitorAMD;
		nglEndPerfMonitorAMD(monitor, __functionAddress);
	}

	// --- [ glGetPerfMonitorCounterDataAMD ] ---

	/** JNI method for {@link #glGetPerfMonitorCounterDataAMD GetPerfMonitorCounterDataAMD} */
	@JavadocExclude
	public static native void nglGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, long data, long bytesWritten, long __functionAddress);

	/** Unsafe version of {@link #glGetPerfMonitorCounterDataAMD GetPerfMonitorCounterDataAMD} */
	@JavadocExclude
	public static void nglGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, long data, long bytesWritten) {
		long __functionAddress = getInstance().GetPerfMonitorCounterDataAMD;
		nglGetPerfMonitorCounterDataAMD(monitor, pname, dataSize, data, bytesWritten, __functionAddress);
	}

	public static void glGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, ByteBuffer data, ByteBuffer bytesWritten) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, dataSize << 2);
			checkBuffer(bytesWritten, 1 << 2);
		}
		nglGetPerfMonitorCounterDataAMD(monitor, pname, dataSize, memAddress(data), memAddress(bytesWritten));
	}

	/** Alternative version of: {@link #glGetPerfMonitorCounterDataAMD GetPerfMonitorCounterDataAMD} */
	public static void glGetPerfMonitorCounterDataAMD(int monitor, int pname, IntBuffer data, IntBuffer bytesWritten) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(bytesWritten, 1);
		nglGetPerfMonitorCounterDataAMD(monitor, pname, data.remaining(), memAddress(data), memAddress(bytesWritten));
	}

}