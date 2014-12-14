/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;
import java.util.Set;

/**
 * Defines the capabilities of an OpenCL platform or device.
 *
 * <p>The instance returned by {@link CLPlatform#createCapabilities} )} exposes the functionality present on either the platform or any of its devices. This is
 * unlike the {@link CL10#CL_PLATFORM_EXTENSIONS} string, which returns only platform functionality, supported across all platform devices.</p>
 *
 * <p>The instance returned by {@link CLDevice#createCapabilities} exposes only the functionality available on that particular device.</p>
 */
public class CLCapabilities {

	final CL10                                __CL10;
	final CL10GL                              __CL10GL;
	final CL11                                __CL11;
	final CL12                                __CL12;
	final CL12GL                              __CL12GL;
	final CL20                                __CL20;
	final AMDBusAddressableMemory             __AMDBusAddressableMemory;
	final APPLECommandQueuePriority           __APPLECommandQueuePriority;
	final APPLECommandQueueSelectComputeUnits __APPLECommandQueueSelectComputeUnits;
	final APPLEContextLoggingFunctions        __APPLEContextLoggingFunctions;
	final APPLEGLSharing                      __APPLEGLSharing;
	final EXTMigrateMemobject                 __EXTMigrateMemobject;
	final INTELAccelerator                    __INTELAccelerator;
	final KHRGLEvent                          __KHRGLEvent;
	final KHRGLSharing                        __KHRGLSharing;
	final KHRTerminateContext                 __KHRTerminateContext;

	/** The OpenCL major version. */
	public final int majorVersion;

	/** The OpenCL minor version. */
	public final int minorVersion;

	/** When true, {@link CL10} is supported. */
	public final boolean OpenCL10;
	/** When true, {@link CL10GL} is supported. */
	public final boolean OpenCL10GL;
	/** When true, {@link CL11} is supported. */
	public final boolean OpenCL11;
	/** When true, {@link CL12} is supported. */
	public final boolean OpenCL12;
	/** When true, {@link CL12GL} is supported. */
	public final boolean OpenCL12GL;
	/** When true, {@link CL20} is supported. */
	public final boolean OpenCL20;
	/** When true, {@link AMDBusAddressableMemory} is supported. */
	public final boolean cl_amd_bus_addressable_memory;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/amd/cl_amd_compile_options.txt">amd_compile_options</a> extension is supported.
	 * 
	 * <p>This extension adds the following options, which are not part of the OpenCL specification:
	 * <ul>
	 * <li>-g &ndash; This is an experimental feature that lets you use the GNU project debugger, GDB, to debug kernels on x86 CPUs running Linux or
	 * cygwin/minGW under Windows. This option does not affect the default optimization of the OpenCL code.</li>
	 * <li>-O0 &ndash; Specifies to the compiler not to optimize. This is equivalent to the OpenCL standard option -cl-opt-disable.</li>
	 * <li>-f[no-]bin-source &ndash; Does [not] generate OpenCL source in the .source section. By default, the source is NOT generated.</li>
	 * <li>-f[no-]bin-llvmir &ndash; Does [not] generate LLVM IR in the .llvmir section. By default, LLVM IR IS generated.</li>
	 * <li>-f[no-]bin-amdil &ndash; Does [not] generate AMD IL in the .amdil section. By Default, AMD IL is NOT generated.</li>
	 * <li>-f[no-]bin-exe &ndash; Does [not] generate the executable (ISA) in .text section. By default, the executable IS generated.</li>
	 * <li>-f[no-]bin-hsail &ndash; Does [not] generate HSAIL/BRIG in the binary. By default, HSA IL/BRIG is NOT generated.</li>
	 * </ul>
	 * To avoid source changes, there are two environment variables that can be used to change CL options during the runtime:
	 * <ul>
	 * <li>AMD_OCL_BUILD_OPTIONS &ndash; Overrides the CL options specified in CL10#BuildProgram().</li>
	 * <li>AMD_OCL_BUILD_OPTIONS_APPEND &ndash; Appends options to the options specified in CL10#BuildProgram().</li>
	 * </ul></p>
	 */
	public final boolean cl_amd_compile_options;
	/** When true, {@link AMDDeviceAttributeQuery} is supported. */
	public final boolean cl_amd_device_attribute_query;
	/** When true, {@link AMDDeviceBoardName} is supported. */
	public final boolean cl_amd_device_board_name;
	/** When true, {@link AMDDevicePersistentMemory} is supported. */
	public final boolean cl_amd_device_persistent_memory;
	/** When true, {@link AMDDeviceProfilingTimerOffset} is supported. */
	public final boolean cl_amd_device_profiling_timer_offset;
	/** When true, {@link AMDDeviceTopology} is supported. */
	public final boolean cl_amd_device_topology;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/amd/cl_amd_event_callback.txt">amd_event_callback</a> extension is supported.
	 * 
	 * <p>This extension provides the ability to register event callbacks for states other than CL10#COMPLETE. The full set of event states are allowed:
	 * CL10#QUEUED, CL10#SUBMITTED, and CL10#RUNNING.</p>
	 */
	public final boolean cl_amd_event_callback;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/amd/cl_amd_fp64.txt">amd_fp64</a> extension is supported.
	 * 
	 * <p>This extension provides a subset of the functionality of that provided by the cl_khr_fp64 extension. When enabled, the compiler recognizes the double
	 * scalar and vector types, compiles expressions involving those types, and accepts calls to all builtin functions enabled by the cl_khr_fp64 extension.
	 * However, this extension does not guarantee that all cl_khr_fp64 built in functions are implemented and does not guarantee that the built in functions
	 * that have been implemented would be considered conformant to the cl_khr_fp64 extension.</p>
	 */
	public final boolean cl_amd_fp64;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/amd/cl_amd_media_ops.txt">amd_media_ops</a> extension is supported.
	 * 
	 * <p>The directive when enabled adds the following built-in functions to the OpenCL language.
	 * <pre><code style="font-family: monospace">
	 * Note: typen denote opencl scalar type {n = 1} and vector types {n = 4, 8, 16}.
	 * 
	 * Build-in Function
	 *   uint  amd_pack(float4 src)
	 * Description
	 *   dst =   ((((uint)src.s0) & 0xff)      )
	 *         + ((((uint)src.s1) & 0xff) <<  8)
	 *         + ((((uint)src.s2) & 0xff) << 16)
	 *         + ((((uint)src.s3) & 0xff) << 24)
	 * 
	 * Build-in Function
	 *   floatn  amd_unpack3(unitn src)
	 * Description
	 *   dst.s0 = (float)((src.s0 >> 24) & 0xff)
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   floatn   amd_unpack2 (unitn src)
	 * Description
	 *   dst.s0 = (float)((src.s0 >> 16) & 0xff)
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   floatn   amd_unpack1 (unitn src)
	 * Description
	 *   dst.s0 = (float)((src.s0 >> 8) & 0xff)
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   floatn   amd_unpack0 (unitn src)
	 * Description
	 *   dst.s0 = (float)(src.s0 & 0xff)
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   uintn  amd_bitalign (uintn src0, uintn src1, uintn src2)
	 * Description
	 *   dst.s0 =  (uint) (((((long)src0.s0) << 32) | (long)src1.s0) >> (src2.s0 & 31))
	 *   similar operation applied to other components of the vectors.
	 * 
	 * 
	 * Build-in Function
	 *   uintn  amd_bytealign (uintn src0, uintn src1, uintn src2)
	 * Description
	 *   dst.s0 =  (uint) (((((long)src0.s0) << 32) | (long)src1.s0) >> ((src2.s0 & 3)*8))
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   uintn  amd_lerp (uintn src0, uintn src1, uintn src2)
	 * Description
	 *   dst.s0 = (((((src0.s0 >>  0) & 0xff) + ((src1.s0 >>  0) & 0xff) + ((src2.s0 >>  0) & 1)) >> 1) <<  0) +
	 *            (((((src0.s0 >>  8) & 0xff) + ((src1.s0 >>  8) & 0xff) + ((src2.s0 >>  8) & 1)) >> 1) <<  8) +
	 *            (((((src0.s0 >> 16) & 0xff) + ((src1.s0 >> 16) & 0xff) + ((src2.s0 >> 16) & 1)) >> 1) << 16) +
	 *            (((((src0.s0 >> 24) & 0xff) + ((src1.s0 >> 24) & 0xff) + ((src2.s0 >> 24) & 1)) >> 1) << 24);
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   uintn  amd_sad (uintn src0, uintn src1, uintn src2)
	 * Description
	 *   dst.s0 = src2.s0 +
	 *            abs(((src0.s0 >>  0) & 0xff) - ((src1.s0 >>  0) & 0xff)) +
	 *            abs(((src0.s0 >>  8) & 0xff) - ((src1.s0 >>  8) & 0xff)) +
	 *            abs(((src0.s0 >> 16) & 0xff) - ((src1.s0 >> 16) & 0xff)) +
	 *            abs(((src0.s0 >> 24) & 0xff) - ((src1.s0 >> 24) & 0xff));
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   uintn  amd_sadhi (uintn src0, uintn src1n, uintn src2)
	 * Description
	 *   dst.s0 = src2.s0 +
	 *            (abs(((src0.s0 >>  0) & 0xff) - ((src1.s0 >>  0) & 0xff)) << 16) +
	 *            (abs(((src0.s0 >>  8) & 0xff) - ((src1.s0 >>  8) & 0xff)) << 16) +
	 *            (abs(((src0.s0 >> 16) & 0xff) - ((src1.s0 >> 16) & 0xff)) << 16) +
	 *            (abs(((src0.s0 >> 24) & 0xff) - ((src1.s0 >> 24) & 0xff)) << 16);
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   uint  amd_sad4(uint4 src0, uint4 src1, uint src2)
	 * Description
	 *   dst   = src2   +
	 *            abs(((src0.s0 >>  0) & 0xff) - ((src1.s0 >>  0) & 0xff)) +
	 *            abs(((src0.s0 >>  8) & 0xff) - ((src1.s0 >>  8) & 0xff)) +
	 *            abs(((src0.s0 >> 16) & 0xff) - ((src1.s0 >> 16) & 0xff)) +
	 *            abs(((src0.s0 >> 24) & 0xff) - ((src1.s0 >> 24) & 0xff)) +
	 *            abs(((src0.s1 >>  0) & 0xff) - ((src1.s0 >>  0) & 0xff)) +
	 *            abs(((src0.s1 >>  8) & 0xff) - ((src1.s1 >>  8) & 0xff)) +
	 *            abs(((src0.s1 >> 16) & 0xff) - ((src1.s1 >> 16) & 0xff)) +
	 *            abs(((src0.s1 >> 24) & 0xff) - ((src1.s1 >> 24) & 0xff)) +
	 *            abs(((src0.s2 >>  0) & 0xff) - ((src1.s2 >>  0) & 0xff)) +
	 *            abs(((src0.s2 >>  8) & 0xff) - ((src1.s2 >>  8) & 0xff)) +
	 *            abs(((src0.s2 >> 16) & 0xff) - ((src1.s2 >> 16) & 0xff)) +
	 *            abs(((src0.s2 >> 24) & 0xff) - ((src1.s2 >> 24) & 0xff)) +
	 *            abs(((src0.s3 >>  0) & 0xff) - ((src1.s3 >>  0) & 0xff)) +
	 *            abs(((src0.s3 >>  8) & 0xff) - ((src1.s3 >>  8) & 0xff)) +
	 *            abs(((src0.s3 >> 16) & 0xff) - ((src1.s3 >> 16) & 0xff)) +
	 *            abs(((src0.s3 >> 24) & 0xff) - ((src1.s3 >> 24) & 0xff));</code></pre></p>
	 */
	public final boolean cl_amd_media_ops;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/amd/cl_amd_media_ops2.txt">amd_media_ops2</a> extension is supported.
	 * 
	 * <p>The directive when enabled adds the following built-in functions to the OpenCL language.
	 * <pre><code style="font-family: monospace">
	 * Note: typen denote open scalar type { n = 1 } and vector types { n = 2, 4, 8, 16 }.
	 * 
	 * Build-in Function
	 *   uintn  amd_msad (uintn src0, uintn src1, uintn src2)
	 * Description
	 *   uchar4 src0u8 = as_uchar4(src0.s0);
	 *   uchar4 src1u8 = as_uchar4(src1.s0);
	 *   dst.s0 = src2.s0 +
	 *            ((src1u8.s0 == 0) ? 0 : abs(src0u8.s0 - src1u8.s0)) +
	 *            ((src1u8.s1 == 0) ? 0 : abs(src0u8.s1 - src1u8.s1)) +
	 *            ((src1u8.s2 == 0) ? 0 : abs(src0u8.s2 - src1u8.s2)) +
	 *            ((src1u8.s3 == 0) ? 0 : abs(src0u8.s3 - src1u8.s3));
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   ulongn amd_qsad (ulongn src0, uintn src1, ulongn src2)
	 * Description
	 *   uchar8 src0u8 = as_uchar8(src0.s0);
	 *   ushort4 src2u16 = as_ushort4(src2.s0);
	 *   ushort4 dstu16;
	 *   dstu16.s0 = amd_sad(as_uint(src0u8.s0123), src1.s0, src2u16.s0);
	 *   dstu16.s1 = amd_sad(as_uint(src0u8.s1234), src1.s0, src2u16.s1);
	 *   dstu16.s2 = amd_sad(as_uint(src0u8.s2345), src1.s0, src2u16.s2);
	 *   dstu16.s3 = amd_sad(as_uint(src0u8.s3456), src1.s0, src2u16.s3);
	 *   dst.s0 = as_uint2(dstu16);
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   ulongn amd_mqsad (ulongn src0, uintn src1, ulongn src2)
	 * Description
	 *   uchar8 src0u8 = as_uchar8(src0.s0);
	 *   ushort4 src2u16 = as_ushort4(src2.s0);
	 *   ushort4 dstu16;
	 *   dstu16.s0 = amd_msad(as_uint(src0u8.s0123), src1.s0, src2u16.s0);
	 *   dstu16.s1 = amd_msad(as_uint(src0u8.s1234), src1.s0, src2u16.s1);
	 *   dstu16.s2 = amd_msad(as_uint(src0u8.s2345), src1.s0, src2u16.s2);
	 *   dstu16.s3 = amd_msad(as_uint(src0u8.s3456), src1.s0, src2u16.s3);
	 *   dst.s0 = as_uint2(dstu16);
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   uintn  amd_sadw (uintn src0, uintn src1, uintn src2)
	 * Description
	 *   ushort2 src0u16 = as_ushort2(src0.s0);
	 *   ushort2 src1u16 = as_ushort2(src1.s0);
	 *   dst.s0 = src2.s0 +
	 *            abs(src0u16.s0 - src1u16.s0) +
	 *            abs(src0u16.s1 - src1u16.s1);
	 *   similar operation applied to other components of the vectors
	 * 
	 * Build-in Function
	 *   uintn  amd_sadd (uintn src0, uintn src1, uintn src2)
	 * Description
	 *   dst.s0 = src2.s0 +  abs(src0.s0 - src1.s0);
	 *   similar operation applied to other components of the vectors
	 * 
	 * Built-in Function:
	 *   uintn amd_bfm (uintn src0, uintn src1)
	 * Description
	 *   dst.s0 = ((1 << (src0.s0 & 0x1f)) - 1) << (src1.s0 & 0x1f);
	 *   similar operation applied to other components of the vectors
	 * 
	 * Built-in Function:
	 *   uintn amd_bfe (uintn src0, uintn src1, uintn src2)
	 * Description
	 *   NOTE: operator >> below represent logical right shift
	 *   offset = src1.s0 & 31;
	 *   width = src2.s0 & 31;
	 *   if width = 0
	 *       dst.s0 = 0;
	 *   else if (offset + width) < 32
	 *       dst.s0 = (src0.s0 << (32 - offset - width)) >> (32 - width);
	 *   else
	 *       dst.s0 = src0.s0 >> offset;
	 *   similar operation applied to other components of the vectors
	 * 
	 * Built-in Function:
	 *    intn amd_bfe (intn src0, uintn src1, uintn src2)
	 * Description
	 *   NOTE: operator >> below represent arithmetic right shift
	 *   offset = src1.s0 & 31;
	 *   width = src2.s0 & 31;
	 *   if width = 0
	 *       dst.s0 = 0;
	 *   else if (offset + width) < 32
	 *       dst.s0 = src0.s0 << (32-offset-width) >> 32-width;
	 *   else
	 *       dst.s0 = src0.s0 >> offset;
	 *   similar operation applied to other components of the vectors
	 * 
	 * Built-in Function:
	 *    intn amd_median3 (intn src0, intn src1, intn src2)
	 *    uintn amd_median3 (uintn src0, uintn src1, uintn src2)
	 *    floatn amd_median3 (floatn src0, floatn src1, floattn src2)
	 * Description
	 *    returns median of src0, src1, and src2
	 * 
	 * Built-in Function:
	 *    intn amd_min3 (intn src0, intn src1, intn src2)
	 *    uintn amd_min3 (uintn src0, uintn src1, uintn src2)
	 *    floatn amd_min3 (floatn src0, floatn src1, floattn src2)
	 * Description
	 *    returns min of src0, src1, and src2
	 * 
	 * Built-in Function:
	 *    intn amd_max3 (intn src0, intn src1, intn src2)
	 *    uintn amd_max3 (uintn src0, uintn src1, uintn src2)
	 *    floatn amd_max3 (floatn src0, floatn src1, floattn src2)
	 * Description
	 *    returns max of src0, src1, and src2</code></pre></p>
	 */
	public final boolean cl_amd_media_ops2;
	/** When true, {@link AMDOfflineDevices} is supported. */
	public final boolean cl_amd_offline_devices;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/amd/cl_amd_popcnt.txt">amd_popcnt</a> extension is supported.
	 * 
	 * <p>This extension introduces a “population count” function called popcnt. This extension was taken into core OpenCL 1.2, and the function was renamed
	 * popcount. The core 1.2 popcount function is identical to the AMD extension popcnt function.</p>
	 */
	public final boolean cl_amd_popcnt;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/amd/cl_amd_predefined_macros.txt">amd_predefined_macros</a> extension is supported.
	 * 
	 * <p>The following macros are predefined when compiling OpenCL™ C kernels. These macros are defined automatically based on the device for which the code is
	 * being compiled.</p>
	 * 
	 * <h3>GPU devices</h3>
	 * <ul>
	 * <li>__Barts__</li>
	 * <li>__BeaverCreek__</li>
	 * <li>__Bheem__</li>
	 * <li>__Bonaire__</li>
	 * <li>__Caicos__</li>
	 * <li>__Capeverde__</li>
	 * <li>__Carrizo__</li>
	 * <li>__Cayman__</li>
	 * <li>__Cedar__</li>
	 * <li>__Cypress__</li>
	 * <li>__Devastator__</li>
	 * <li>__Hainan__</li>
	 * <li>__Iceland__</li>
	 * <li>__Juniper__</li>
	 * <li>__Kalindi__</li>
	 * <li>__Kauai__</li>
	 * <li>__Lombok__</li>
	 * <li>__Loveland__</li>
	 * <li>__Mullins__</li>
	 * <li>__Oland__</li>
	 * <li>__Pitcairn__</li>
	 * <li>__RV710__</li>
	 * <li>__RV730__</li>
	 * <li>__RV740__</li>
	 * <li>__RV770__</li>
	 * <li>__RV790__</li>
	 * <li>__Redwood__</li>
	 * <li>__Scrapper__</li>
	 * <li>__Spectre__</li>
	 * <li>__Spooky__</li>
	 * <li>__Tahiti__</li>
	 * <li>__Tonga__</li>
	 * <li>__Turks__</li>
	 * <li>__WinterPark__</li>
	 * <li>__GPU__</li>
	 * </ul>
	 * 
	 * <h3>CPU devices<h3>
	 * <ul>
	 * <li>__CPU__</li>
	 * <li>__X86__</li>
	 * <li>__X86_64__</li>
	 * </ul>
	 * Note that __GPU__ or __CPU__ are predefined whenever a GPU or CPU device is the compilation target.
	 */
	public final boolean cl_amd_predefined_macros;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/amd/cl_amd_printf.txt">amd_printf</a> extension is supported.
	 * 
	 * <p>This extension adds the built-in function <code style="font-family: monospace">printf(__constant char * restrict format, …);</code></p>
	 * 
	 * <p>This function writes output to the stdout stream associated with the host application. The format string is a character sequence that:
	 * <ul>
	 * <li>is null-terminated and composed of zero and more directives,</li>
	 * <li>ordinary characters (i.e. not %), which are copied directly to the output stream unchanged, and</li>
	 * <li>conversion specifications, each of which can result in fetching zero or more arguments, converting them, and then writing the final result to the
	 * output stream.</li>
	 * </ul>
	 * The format string must be resolvable at compile time; thus, it cannot be dynamically created by the executing program. (Note that the use of variadic
	 * arguments in the built-in printf does not imply its use in other builtins; more importantly, it is not valid to use printf in user-defined functions or
	 * kernels.)</p>
	 * 
	 * <p>The OpenCL C printf closely matches the definition found as part of the C99 standard. Note that conversions introduced in the format string with % are
	 * supported with the following guidelines:
	 * <ul>
	 * <li>A 32-bit floating point argument is not converted to a 64-bit double, unless the extension cl_khr_fp64 is supported and enabled. This includes the
	 * double variants if cl_khr_fp64 is supported and defined in the corresponding compilation unit.</li>
	 * <li>64-bit integer types can be printed using %ld / %lx / %lu.</li>
	 * <li>%lld / %llx / %llu are not supported and reserved for 128-bit integer types (long long).</li>
	 * <li>All OpenCL vector types can be explicitly passed and printed using the modifier vn, where n can be 2, 3, 4, 8, or 16. This modifier appears before
	 * the original conversion specifier for the vector’s component type (for example, to print a float4 %v4f). Since vn is a conversion specifier, it is
	 * valid to apply optional flags, such as field width and precision, just as it is when printing the component types. Since a vector is an aggregate
	 * type, the comma separator is used between the components: 0:1, … , n-2:n-1.</li>
	 * </ul></p>
	 */
	public final boolean cl_amd_printf;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/amd/cl_amd_vec3.txt">amd_vec3</a> extension is supported.
	 * 
	 * <p>This extension adds support for vectors with three elements: float3, short3, char3, etc. This data type was added to OpenCL 1.1 as a core feature.</p>
	 */
	public final boolean cl_amd_vec3;
	/** When true, {@link APPLEBiasedFixedPointImageFormats} is supported. */
	public final boolean cl_APPLE_biased_fixed_point_image_formats;
	/** When true, {@link APPLECommandQueuePriority} is supported. */
	public final boolean cl_APPLE_command_queue_priority;
	/** When true, {@link APPLECommandQueueSelectComputeUnits} is supported. */
	public final boolean cl_APPLE_command_queue_select_compute_units;
	/** When true, {@link APPLEContextLoggingFunctions} is supported. */
	public final boolean cl_APPLE_ContextLoggingFunctions;
	/** When true, {@link APPLEFixedAlphaChannelOrders} is supported. */
	public final boolean cl_APPLE_fixed_alpha_channel_orders;
	public final boolean cl_APPLE_fp64_basic_ops;
	/** When true, {@link APPLEGLSharing} is supported. */
	public final boolean cl_APPLE_gl_sharing;
	/** When true, {@link APPLEQueryKernelNames} is supported. */
	public final boolean cl_APPLE_query_kernel_names;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/arm/cl_arm_get_core_id.txt">arm_get_core_id</a> extension is supported.
	 * 
	 * <p>This extension provides a built-in function which returns the physical core id (OpenCL Compute Unit) that a work-group is running on. This value is
	 * uniform for a work-group.</p>
	 * 
	 * <p>This value can be used for a core-specific cache or atomic pool where the storage is required to be in global memory and persistent (but not ordered)
	 * between work-groups. This does not provide any additional ordering on top of the existing guarantees between workgroups, nor does it provide any
	 * guarantee of concurrent execution.</p>
	 */
	public final boolean cl_arm_get_core_id;
	/** When true, {@link ARMPrintf} is supported. */
	public final boolean cl_arm_printf;
	/** When true, {@link EXTAtomicCounters32} is supported. */
	public final boolean cl_ext_atomic_counters_32;
	/** When true, {@link EXTAtomicCounters64} is supported. */
	public final boolean cl_ext_atomic_counters_64;
	/** When true, {@link EXTMigrateMemobject} is supported. */
	public final boolean cl_ext_migrate_memobject;
	/** When true, {@link INTELAccelerator} is supported. */
	public final boolean cl_intel_accelerator;
	/** When true, {@link INTELAdvancedMotionEstimation} is supported. */
	public final boolean cl_intel_advanced_motion_estimation;
	/** When true, {@link INTELDevicePartitionByNames} is supported. */
	public final boolean cl_intel_device_partition_by_names;
	/** When true, {@link INTELMotionEstimation} is supported. */
	public final boolean cl_intel_motion_estimation;
	public final boolean cl_intel_printf;
	/** When true, {@link INTELSimultaneousSharing} is supported. */
	public final boolean cl_intel_simultaneous_sharing;
	/** When true, {@link INTELThreadLocalExec} is supported. */
	public final boolean cl_intel_thread_local_exec;
	/**
	 * When true, the <strong>khr_3d_image_writes</strong> extension is supported.
	 * 
	 * <p>This extension adds support for kernel writes to 3D images.</p>
	 */
	public final boolean cl_khr_3d_image_writes;
	/**
	 * When true, the <strong>khr_byte_addressable_store</strong> extension is supported.
	 * 
	 * <p>This extension eliminates the restriction of not allowing writes to a pointer (or array elements) of types less than 32-bit wide in kernel program.</p>
	 */
	public final boolean cl_khr_byte_addressable_store;
	/** When true, {@link KHRDepthImages} is supported. */
	public final boolean cl_khr_depth_images;
	/**
	 * When true, the <strong>khr_device_enqueue_local_arg_types</strong> extension is supported.
	 * 
	 * <p>This extension allows arguments to blocks passed to enqueue_kernel functions to be declared as a pointer to any type (built-in or user-defined) in
	 * local memory instead of just <code style="font-family: monospace">local void *</code>.</p>
	 */
	public final boolean cl_khr_device_enqueue_local_arg_types;
	/** When true, {@link KHRFP16} is supported. */
	public final boolean cl_khr_fp16;
	/** When true, {@link KHRFP64} is supported. */
	public final boolean cl_khr_fp64;
	/** When true, {@link KHRGLDepthImages} is supported. */
	public final boolean cl_khr_gl_depth_images;
	/** When true, {@link KHRGLEvent} is supported. */
	public final boolean cl_khr_gl_event;
	/** When true, {@link KHRGLMSAASharing} is supported. */
	public final boolean cl_khr_gl_msaa_sharing;
	/** When true, {@link KHRGLSharing} is supported. */
	public final boolean cl_khr_gl_sharing;
	/**
	 * When true, the <strong>khr_global_int32_base_atomics</strong> extension is supported.
	 * 
	 * <p>This extension adds basic atomic operations on 32-bit integers in global memory.</p>
	 */
	public final boolean cl_khr_global_int32_base_atomics;
	/**
	 * When true, the <strong>khr_global_int32_extended_atomics</strong> extension is supported.
	 * 
	 * <p>This extension adds extended atomic operations on 32-bit integers in global memory.</p>
	 */
	public final boolean cl_khr_global_int32_extended_atomics;
	/** When true, {@link KHRICD} is supported. */
	public final boolean cl_khr_icd;
	/** When true, {@link KHRImage2DFromBuffer} is supported. */
	public final boolean cl_khr_image2d_from_buffer;
	/** When true, {@link KHRInitializeMemory} is supported. */
	public final boolean cl_khr_initialize_memory;
	/**
	 * When true, the <strong>khr_int64_base_atomics</strong> extension is supported.
	 * 
	 * <p>This extension adds basic atomic operations on 64-bit integers in both global and local memory.</p>
	 */
	public final boolean cl_khr_int64_base_atomics;
	/**
	 * When true, the <strong>khr_int64_extended_atomics</strong> extension is supported.
	 * 
	 * <p>This extension adds extended atomic operations on 64-bit integers in both global and local memory.</p>
	 */
	public final boolean cl_khr_int64_extended_atomics;
	/**
	 * When true, the <strong>khr_local_int32_base_atomics</strong> extension is supported.
	 * 
	 * <p>This extension adds basic atomic operations on 32-bit integers in local memory.</p>
	 */
	public final boolean cl_khr_local_int32_base_atomics;
	/**
	 * When true, the <strong>khr_local_int32_extended_atomics</strong> extension is supported.
	 * 
	 * <p>This extension adds extended atomic operations on 32-bit integers in local memory.</p>
	 */
	public final boolean cl_khr_local_int32_extended_atomics;
	/**
	 * When true, the <strong>khr_select_fprounding_mode</strong> extension is supported.
	 * 
	 * <p>This extension adds support for specifying the rounding mode for an instruction or group of instructions in the program source.</p>
	 * 
	 * <p>The appropriate rounding mode can be specified using <code style="font-family: monospace">#pragma OPENCL SELECT_ROUNDING_MODE</code> rounding-mode in the program source.</p>
	 * 
	 * <p>The <code style="font-family: monospace">#pragma OPENCL SELECT_ROUNDING_MODE</code> sets the rounding mode for all instructions that operate on floating-point types (scalar or vector
	 * types) or produce floating-point values that follow this pragma in the program source until the next <code style="font-family: monospace">#pragma OPENCL SELECT_ROUNDING_MODE</code> is
	 * encountered. Note that the rounding mode specified for a block of code is known at compile time. Except where otherwise documented, the callee
	 * functions do not inherit the rounding mode of the caller function.</p>
	 * 
	 * <p>If this extension is enabled, the {@code __ROUNDING_MODE__} preprocessor symbol shall be defined to be one of the following according to the current
	 * rounding mode:
	 * <pre><code style="font-family: monospace">
	 * #define __ROUNDING_MODE__ rte
	 * #define __ROUNDING_MODE__ rtz
	 * #define __ROUNDING_MODE__ rtp
	 * #define __ROUNDING_MODE__ rtz</code></pre>
	 * The default rounding mode is round to nearest even. The built-in math functions, the common functions, and the geometric functions are implemented with
	 * the round to nearest even rounding mode.</p>
	 * 
	 * <p>Various built-in conversions and the vstore_half and vstorea_halfn built-in functions that do not specify a rounding mode inherit the current rounding
	 * mode. Conversions from floating-point to integer type always use rtz mode, except where the user specifically asks for another rounding mode.</p>
	 * 
	 * <p>Notes The above four rounding modes are defined by IEEE 754. Floating-point calculations may be carried out internally with extra precision and then
	 * rounded to fit into the destination type. Round to nearest even is currently the only rounding mode required by the OpenCL specification and is
	 * therefore the default rounding mode. In addition, only static selection of rounding mode is supported. Dynamically reconfiguring the rounding modes as
	 * specified by the IEEE 754 spec is not a requirement.</p>
	 */
	public final boolean cl_khr_select_fprounding_mode;
	/** When true, {@link KHRSPIR} is supported. */
	public final boolean cl_khr_spir;
	/** When true, {@link KHRTerminateContext} is supported. */
	public final boolean cl_khr_terminate_context;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/nv/cl_nv_compiler_options.txt">nv_compiler_options</a> extension is supported.
	 * 
	 * <p>This extension allows the programmer to pass options to the PTX assembler allowing greater control over code generation.
	 * <pre><code style="font-family: monospace">
	 * -cl-nv-maxrregcount <N>
	 *     Passed on to ptxas as --maxrregcount <N>
	 *         N is a positive integer.
	 *     Specify the maximum number of registers that GPU functions can use.
	 *     Until a function-specific limit, a higher value will generally increase
	 *     the performance of individual GPU threads that execute this function.
	 *     However, because thread registers are allocated from a global register
	 *     pool on each GPU, a higher value of this option will also reduce the
	 *     maximum thread block size, thereby reducing the amount of thread
	 *     parallelism. Hence, a good maxrregcount value is the result of a
	 *     trade-off.
	 *     If this option is not specified, then no maximum is assumed. Otherwise
	 *     the specified value will be rounded to the next multiple of 4 registers
	 *     until the GPU specific maximum of 128 registers.
	 * 
	 * -cl-nv-opt-level <N>
	 *     Passed on to ptxas as --opt-level <N>
	 *         N is a positive integer, or 0 (no optimization).
	 *     Specify optimization level.
	 *     Default value:  3.
	 * 
	 * -cl-nv-verbose
	 *     Passed on to ptxas as --verbose
	 *     Enable verbose mode.
	 *     Output will be reported in the build log (accessible through the
	 *     callback parameter to clBuildProgram).</code></pre></p>
	 */
	public final boolean cl_nv_compiler_options;
	/** When true, {@link NVDeviceAttributeQuery} is supported. */
	public final boolean cl_nv_device_attribute_query;
	/**
	 * When true, the <a href="http://www.khronos.org/registry/cl/extensions/nv/cl_nv_pragma_unroll.txt">nv_pragma_unroll</a> extension is supported.
	 * 
	 * <h3>Overview</h3>
	 * This extension extends the OpenCL C language with a hint that allows loops to be unrolled. This pragma must be used for a loop and can be used to
	 * specify full unrolling or partial unrolling by a certain amount. This is a hint and the compiler may ignore this pragma for any reason.
	 * 
	 * <h3>Goals</h3>
	 * The principal goal of the pragma unroll is to improve the performance of loops via unrolling. Typically this enables other optimizations or improves
	 * instruction level parallelism of a thread.
	 * 
	 * <h3>Details</h3>
	 * A user may specify that a loop in the source program be unrolled. This is done via a pragma. The syntax of this pragma is as follows
	 * 
	 * <p><code style="font-family: monospace">#pragma unroll [unroll-factor]</code></p>
	 * 
	 * <p>The pragma unroll may optionally specify an unroll factor. The pragma must be placed immediately before the loop and only applies to that loop.</p>
	 * 
	 * <p>If unroll factor is not specified then the compiler will try to do complete or full unrolling of the loop. If a loop unroll factor is specified the
	 * compiler will perform partial loop unrolling. The loop factor, if specified, must be a compile time non negative integer constant.</p>
	 * 
	 * <p>A loop unroll factor of 1 means that the compiler should not unroll the loop.</p>
	 * 
	 * <p>A complete unroll specification has no effect if the trip count of the loop is not compile-time computable.</p>
	 */
	public final boolean cl_nv_pragma_unroll;

	CLCapabilities(FunctionProvider provider) {
		this.majorVersion = 0;
		this.minorVersion = 0;

		OpenCL10 = (__CL10 = CL10.create(provider)) != null;
		OpenCL10GL = (__CL10GL = CL10GL.create(provider)) != null;
		OpenCL11 = (__CL11 = CL11.create(provider)) != null;
		OpenCL12 = (__CL12 = CL12.create(provider)) != null;
		OpenCL12GL = (__CL12GL = CL12GL.create(provider)) != null;
		OpenCL20 = (__CL20 = CL20.create(provider)) != null;
		cl_amd_bus_addressable_memory = (__AMDBusAddressableMemory = AMDBusAddressableMemory.create(provider)) != null;
		cl_amd_compile_options = false;
		cl_amd_device_attribute_query = false;
		cl_amd_device_board_name = false;
		cl_amd_device_persistent_memory = false;
		cl_amd_device_profiling_timer_offset = false;
		cl_amd_device_topology = false;
		cl_amd_event_callback = false;
		cl_amd_fp64 = false;
		cl_amd_media_ops = false;
		cl_amd_media_ops2 = false;
		cl_amd_offline_devices = false;
		cl_amd_popcnt = false;
		cl_amd_predefined_macros = false;
		cl_amd_printf = false;
		cl_amd_vec3 = false;
		cl_APPLE_biased_fixed_point_image_formats = false;
		cl_APPLE_command_queue_priority = (__APPLECommandQueuePriority = APPLECommandQueuePriority.create(provider)) != null;
		cl_APPLE_command_queue_select_compute_units = (__APPLECommandQueueSelectComputeUnits = APPLECommandQueueSelectComputeUnits.create(provider)) != null;
		cl_APPLE_ContextLoggingFunctions = (__APPLEContextLoggingFunctions = APPLEContextLoggingFunctions.create(provider)) != null;
		cl_APPLE_fixed_alpha_channel_orders = false;
		cl_APPLE_fp64_basic_ops = false;
		cl_APPLE_gl_sharing = (__APPLEGLSharing = APPLEGLSharing.create(provider)) != null;
		cl_APPLE_query_kernel_names = false;
		cl_arm_get_core_id = false;
		cl_arm_printf = false;
		cl_ext_atomic_counters_32 = false;
		cl_ext_atomic_counters_64 = false;
		cl_ext_migrate_memobject = (__EXTMigrateMemobject = EXTMigrateMemobject.create(provider)) != null;
		cl_intel_accelerator = (__INTELAccelerator = INTELAccelerator.create(provider)) != null;
		cl_intel_advanced_motion_estimation = false;
		cl_intel_device_partition_by_names = false;
		cl_intel_motion_estimation = false;
		cl_intel_printf = false;
		cl_intel_simultaneous_sharing = false;
		cl_intel_thread_local_exec = false;
		cl_khr_3d_image_writes = false;
		cl_khr_byte_addressable_store = false;
		cl_khr_depth_images = false;
		cl_khr_device_enqueue_local_arg_types = false;
		cl_khr_fp16 = false;
		cl_khr_fp64 = false;
		cl_khr_gl_depth_images = false;
		cl_khr_gl_event = (__KHRGLEvent = KHRGLEvent.create(provider)) != null;
		cl_khr_gl_msaa_sharing = false;
		cl_khr_gl_sharing = (__KHRGLSharing = KHRGLSharing.create(provider)) != null;
		cl_khr_global_int32_base_atomics = false;
		cl_khr_global_int32_extended_atomics = false;
		cl_khr_icd = false;
		cl_khr_image2d_from_buffer = false;
		cl_khr_initialize_memory = false;
		cl_khr_int64_base_atomics = false;
		cl_khr_int64_extended_atomics = false;
		cl_khr_local_int32_base_atomics = false;
		cl_khr_local_int32_extended_atomics = false;
		cl_khr_select_fprounding_mode = false;
		cl_khr_spir = false;
		cl_khr_terminate_context = (__KHRTerminateContext = KHRTerminateContext.create(provider)) != null;
		cl_nv_compiler_options = false;
		cl_nv_device_attribute_query = false;
		cl_nv_pragma_unroll = false;
	}

	CLCapabilities(int majorVersion, int minorVersion, Set<String> ext, CLCapabilities caps) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;

		OpenCL10 = (__CL10 = CL.checkExtension(ext, "OpenCL10", caps.__CL10)) != null;
		OpenCL10GL = (__CL10GL = CL.checkExtension(ext, "OpenCL10GL", caps.__CL10GL)) != null;
		OpenCL11 = (__CL11 = CL.checkExtension(ext, "OpenCL11", caps.__CL11)) != null;
		OpenCL12 = (__CL12 = CL.checkExtension(ext, "OpenCL12", caps.__CL12)) != null;
		OpenCL12GL = (__CL12GL = CL.checkExtension(ext, "OpenCL12GL", caps.__CL12GL)) != null;
		OpenCL20 = (__CL20 = CL.checkExtension(ext, "OpenCL20", caps.__CL20)) != null;
		cl_amd_bus_addressable_memory = (__AMDBusAddressableMemory = CL.checkExtension(ext, "cl_amd_bus_addressable_memory", caps.__AMDBusAddressableMemory)) != null;
		cl_amd_compile_options = ext.contains("cl_amd_compile_options");
		cl_amd_device_attribute_query = ext.contains("cl_amd_device_attribute_query");
		cl_amd_device_board_name = ext.contains("cl_amd_device_board_name");
		cl_amd_device_persistent_memory = ext.contains("cl_amd_device_persistent_memory");
		cl_amd_device_profiling_timer_offset = ext.contains("cl_amd_device_profiling_timer_offset");
		cl_amd_device_topology = ext.contains("cl_amd_device_topology");
		cl_amd_event_callback = ext.contains("cl_amd_event_callback");
		cl_amd_fp64 = ext.contains("cl_amd_fp64");
		cl_amd_media_ops = ext.contains("cl_amd_media_ops");
		cl_amd_media_ops2 = ext.contains("cl_amd_media_ops2");
		cl_amd_offline_devices = ext.contains("cl_amd_offline_devices");
		cl_amd_popcnt = ext.contains("cl_amd_popcnt");
		cl_amd_predefined_macros = ext.contains("cl_amd_predefined_macros");
		cl_amd_printf = ext.contains("cl_amd_printf");
		cl_amd_vec3 = ext.contains("cl_amd_vec3");
		cl_APPLE_biased_fixed_point_image_formats = ext.contains("cl_APPLE_biased_fixed_point_image_formats");
		cl_APPLE_command_queue_priority = (__APPLECommandQueuePriority = CL.checkExtension(ext, "cl_APPLE_command_queue_priority", caps.__APPLECommandQueuePriority)) != null;
		cl_APPLE_command_queue_select_compute_units = (__APPLECommandQueueSelectComputeUnits = CL.checkExtension(ext, "cl_APPLE_command_queue_select_compute_units", caps.__APPLECommandQueueSelectComputeUnits)) != null;
		cl_APPLE_ContextLoggingFunctions = (__APPLEContextLoggingFunctions = CL.checkExtension(ext, "cl_APPLE_ContextLoggingFunctions", caps.__APPLEContextLoggingFunctions)) != null;
		cl_APPLE_fixed_alpha_channel_orders = ext.contains("cl_APPLE_fixed_alpha_channel_orders");
		cl_APPLE_fp64_basic_ops = ext.contains("cl_APPLE_fp64_basic_ops");
		cl_APPLE_gl_sharing = (__APPLEGLSharing = CL.checkExtension(ext, "cl_APPLE_gl_sharing", caps.__APPLEGLSharing)) != null;
		cl_APPLE_query_kernel_names = ext.contains("cl_APPLE_query_kernel_names");
		cl_arm_get_core_id = ext.contains("cl_arm_get_core_id");
		cl_arm_printf = ext.contains("cl_arm_printf");
		cl_ext_atomic_counters_32 = ext.contains("cl_ext_atomic_counters_32");
		cl_ext_atomic_counters_64 = ext.contains("cl_ext_atomic_counters_64");
		cl_ext_migrate_memobject = (__EXTMigrateMemobject = CL.checkExtension(ext, "cl_ext_migrate_memobject", caps.__EXTMigrateMemobject)) != null;
		cl_intel_accelerator = (__INTELAccelerator = CL.checkExtension(ext, "cl_intel_accelerator", caps.__INTELAccelerator)) != null;
		cl_intel_advanced_motion_estimation = ext.contains("cl_intel_advanced_motion_estimation");
		cl_intel_device_partition_by_names = ext.contains("cl_intel_device_partition_by_names");
		cl_intel_motion_estimation = ext.contains("cl_intel_motion_estimation");
		cl_intel_printf = ext.contains("cl_intel_printf");
		cl_intel_simultaneous_sharing = ext.contains("cl_intel_simultaneous_sharing");
		cl_intel_thread_local_exec = ext.contains("cl_intel_thread_local_exec");
		cl_khr_3d_image_writes = ext.contains("cl_khr_3d_image_writes");
		cl_khr_byte_addressable_store = ext.contains("cl_khr_byte_addressable_store");
		cl_khr_depth_images = ext.contains("cl_khr_depth_images");
		cl_khr_device_enqueue_local_arg_types = ext.contains("cl_khr_device_enqueue_local_arg_types");
		cl_khr_fp16 = ext.contains("cl_khr_fp16");
		cl_khr_fp64 = ext.contains("cl_khr_fp64");
		cl_khr_gl_depth_images = ext.contains("cl_khr_gl_depth_images");
		cl_khr_gl_event = (__KHRGLEvent = CL.checkExtension(ext, "cl_khr_gl_event", caps.__KHRGLEvent)) != null;
		cl_khr_gl_msaa_sharing = ext.contains("cl_khr_gl_msaa_sharing");
		cl_khr_gl_sharing = (__KHRGLSharing = CL.checkExtension(ext, "cl_khr_gl_sharing", caps.__KHRGLSharing)) != null;
		cl_khr_global_int32_base_atomics = ext.contains("cl_khr_global_int32_base_atomics");
		cl_khr_global_int32_extended_atomics = ext.contains("cl_khr_global_int32_extended_atomics");
		cl_khr_icd = ext.contains("cl_khr_icd");
		cl_khr_image2d_from_buffer = ext.contains("cl_khr_image2d_from_buffer");
		cl_khr_initialize_memory = ext.contains("cl_khr_initialize_memory");
		cl_khr_int64_base_atomics = ext.contains("cl_khr_int64_base_atomics");
		cl_khr_int64_extended_atomics = ext.contains("cl_khr_int64_extended_atomics");
		cl_khr_local_int32_base_atomics = ext.contains("cl_khr_local_int32_base_atomics");
		cl_khr_local_int32_extended_atomics = ext.contains("cl_khr_local_int32_extended_atomics");
		cl_khr_select_fprounding_mode = ext.contains("cl_khr_select_fprounding_mode");
		cl_khr_spir = ext.contains("cl_khr_spir");
		cl_khr_terminate_context = (__KHRTerminateContext = CL.checkExtension(ext, "cl_khr_terminate_context", caps.__KHRTerminateContext)) != null;
		cl_nv_compiler_options = ext.contains("cl_nv_compiler_options");
		cl_nv_device_attribute_query = ext.contains("cl_nv_device_attribute_query");
		cl_nv_pragma_unroll = ext.contains("cl_nv_pragma_unroll");
	}

	public String toString() {
		StringBuilder buf = new StringBuilder(512);

		buf.append("OpenCL ").append(majorVersion).append('.').append(minorVersion);
		buf.append(" - Extensions: ");

		if ( cl_amd_bus_addressable_memory ) buf.append("cl_amd_bus_addressable_memory ");
		if ( cl_amd_compile_options ) buf.append("cl_amd_compile_options ");
		if ( cl_amd_device_attribute_query ) buf.append("cl_amd_device_attribute_query ");
		if ( cl_amd_device_board_name ) buf.append("cl_amd_device_board_name ");
		if ( cl_amd_device_persistent_memory ) buf.append("cl_amd_device_persistent_memory ");
		if ( cl_amd_device_profiling_timer_offset ) buf.append("cl_amd_device_profiling_timer_offset ");
		if ( cl_amd_device_topology ) buf.append("cl_amd_device_topology ");
		if ( cl_amd_event_callback ) buf.append("cl_amd_event_callback ");
		if ( cl_amd_fp64 ) buf.append("cl_amd_fp64 ");
		if ( cl_amd_media_ops ) buf.append("cl_amd_media_ops ");
		if ( cl_amd_media_ops2 ) buf.append("cl_amd_media_ops2 ");
		if ( cl_amd_offline_devices ) buf.append("cl_amd_offline_devices ");
		if ( cl_amd_popcnt ) buf.append("cl_amd_popcnt ");
		if ( cl_amd_predefined_macros ) buf.append("cl_amd_predefined_macros ");
		if ( cl_amd_printf ) buf.append("cl_amd_printf ");
		if ( cl_amd_vec3 ) buf.append("cl_amd_vec3 ");
		if ( cl_APPLE_biased_fixed_point_image_formats ) buf.append("cl_APPLE_biased_fixed_point_image_formats ");
		if ( cl_APPLE_command_queue_priority ) buf.append("cl_APPLE_command_queue_priority ");
		if ( cl_APPLE_command_queue_select_compute_units ) buf.append("cl_APPLE_command_queue_select_compute_units ");
		if ( cl_APPLE_ContextLoggingFunctions ) buf.append("cl_APPLE_ContextLoggingFunctions ");
		if ( cl_APPLE_fixed_alpha_channel_orders ) buf.append("cl_APPLE_fixed_alpha_channel_orders ");
		if ( cl_APPLE_fp64_basic_ops ) buf.append("cl_APPLE_fp64_basic_ops ");
		if ( cl_APPLE_gl_sharing ) buf.append("cl_APPLE_gl_sharing ");
		if ( cl_APPLE_query_kernel_names ) buf.append("cl_APPLE_query_kernel_names ");
		if ( cl_arm_get_core_id ) buf.append("cl_arm_get_core_id ");
		if ( cl_arm_printf ) buf.append("cl_arm_printf ");
		if ( cl_ext_atomic_counters_32 ) buf.append("cl_ext_atomic_counters_32 ");
		if ( cl_ext_atomic_counters_64 ) buf.append("cl_ext_atomic_counters_64 ");
		if ( cl_ext_migrate_memobject ) buf.append("cl_ext_migrate_memobject ");
		if ( cl_intel_accelerator ) buf.append("cl_intel_accelerator ");
		if ( cl_intel_advanced_motion_estimation ) buf.append("cl_intel_advanced_motion_estimation ");
		if ( cl_intel_device_partition_by_names ) buf.append("cl_intel_device_partition_by_names ");
		if ( cl_intel_motion_estimation ) buf.append("cl_intel_motion_estimation ");
		if ( cl_intel_printf ) buf.append("cl_intel_printf ");
		if ( cl_intel_simultaneous_sharing ) buf.append("cl_intel_simultaneous_sharing ");
		if ( cl_intel_thread_local_exec ) buf.append("cl_intel_thread_local_exec ");
		if ( cl_khr_3d_image_writes ) buf.append("cl_khr_3d_image_writes ");
		if ( cl_khr_byte_addressable_store ) buf.append("cl_khr_byte_addressable_store ");
		if ( cl_khr_depth_images ) buf.append("cl_khr_depth_images ");
		if ( cl_khr_device_enqueue_local_arg_types ) buf.append("cl_khr_device_enqueue_local_arg_types ");
		if ( cl_khr_fp16 ) buf.append("cl_khr_fp16 ");
		if ( cl_khr_fp64 ) buf.append("cl_khr_fp64 ");
		if ( cl_khr_gl_depth_images ) buf.append("cl_khr_gl_depth_images ");
		if ( cl_khr_gl_event ) buf.append("cl_khr_gl_event ");
		if ( cl_khr_gl_msaa_sharing ) buf.append("cl_khr_gl_msaa_sharing ");
		if ( cl_khr_gl_sharing ) buf.append("cl_khr_gl_sharing ");
		if ( cl_khr_global_int32_base_atomics ) buf.append("cl_khr_global_int32_base_atomics ");
		if ( cl_khr_global_int32_extended_atomics ) buf.append("cl_khr_global_int32_extended_atomics ");
		if ( cl_khr_icd ) buf.append("cl_khr_icd ");
		if ( cl_khr_image2d_from_buffer ) buf.append("cl_khr_image2d_from_buffer ");
		if ( cl_khr_initialize_memory ) buf.append("cl_khr_initialize_memory ");
		if ( cl_khr_int64_base_atomics ) buf.append("cl_khr_int64_base_atomics ");
		if ( cl_khr_int64_extended_atomics ) buf.append("cl_khr_int64_extended_atomics ");
		if ( cl_khr_local_int32_base_atomics ) buf.append("cl_khr_local_int32_base_atomics ");
		if ( cl_khr_local_int32_extended_atomics ) buf.append("cl_khr_local_int32_extended_atomics ");
		if ( cl_khr_select_fprounding_mode ) buf.append("cl_khr_select_fprounding_mode ");
		if ( cl_khr_spir ) buf.append("cl_khr_spir ");
		if ( cl_khr_terminate_context ) buf.append("cl_khr_terminate_context ");
		if ( cl_nv_compiler_options ) buf.append("cl_nv_compiler_options ");
		if ( cl_nv_device_attribute_query ) buf.append("cl_nv_device_attribute_query ");
		if ( cl_nv_pragma_unroll ) buf.append("cl_nv_pragma_unroll ");

		return buf.toString();
	}

}