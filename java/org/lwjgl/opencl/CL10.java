/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

import static org.lwjgl.opencl.Info.*;

/** The core OpenCL 1.0 functionality. */
public final class CL10 {

	/** Error Codes */
	public static final int
		CL_SUCCESS                         = 0x0,
		CL_DEVICE_NOT_FOUND                = -1,
		CL_DEVICE_NOT_AVAILABLE            = -2,
		CL_COMPILER_NOT_AVAILABLE          = -3,
		CL_MEM_OBJECT_ALLOCATION_FAILURE   = -4,
		CL_OUT_OF_RESOURCES                = -5,
		CL_OUT_OF_HOST_MEMORY              = -6,
		CL_PROFILING_INFO_NOT_AVAILABLE    = -7,
		CL_MEM_COPY_OVERLAP                = -8,
		CL_IMAGE_FORMAT_MISMATCH           = -9,
		CL_IMAGE_FORMAT_NOT_SUPPORTED      = -10,
		CL_BUILD_PROGRAM_FAILURE           = -11,
		CL_MAP_FAILURE                     = -12,
		CL_INVALID_VALUE                   = -30,
		CL_INVALID_DEVICE_TYPE             = -31,
		CL_INVALID_PLATFORM                = -32,
		CL_INVALID_DEVICE                  = -33,
		CL_INVALID_CONTEXT                 = -34,
		CL_INVALID_QUEUE_PROPERTIES        = -35,
		CL_INVALID_COMMAND_QUEUE           = -36,
		CL_INVALID_HOST_PTR                = -37,
		CL_INVALID_MEM_OBJECT              = -38,
		CL_INVALID_IMAGE_FORMAT_DESCRIPTOR = -39,
		CL_INVALID_IMAGE_SIZE              = -40,
		CL_INVALID_SAMPLER                 = -41,
		CL_INVALID_BINARY                  = -42,
		CL_INVALID_BUILD_OPTIONS           = -43,
		CL_INVALID_PROGRAM                 = -44,
		CL_INVALID_PROGRAM_EXECUTABLE      = -45,
		CL_INVALID_KERNEL_NAME             = -46,
		CL_INVALID_KERNEL_DEFINITION       = -47,
		CL_INVALID_KERNEL                  = -48,
		CL_INVALID_ARG_INDEX               = -49,
		CL_INVALID_ARG_VALUE               = -50,
		CL_INVALID_ARG_SIZE                = -51,
		CL_INVALID_KERNEL_ARGS             = -52,
		CL_INVALID_WORK_DIMENSION          = -53,
		CL_INVALID_WORK_GROUP_SIZE         = -54,
		CL_INVALID_WORK_ITEM_SIZE          = -55,
		CL_INVALID_GLOBAL_OFFSET           = -56,
		CL_INVALID_EVENT_WAIT_LIST         = -57,
		CL_INVALID_EVENT                   = -58,
		CL_INVALID_OPERATION               = -59,
		CL_INVALID_BUFFER_SIZE             = -61,
		CL_INVALID_GLOBAL_WORK_SIZE        = -63;

	/** OpenCL Version */
	public static final int CL_VERSION_1_0 = 0x1;

	/** cl_bool */
	public static final int
		CL_FALSE = 0x0,
		CL_TRUE  = 0x1;

	/** cl_platform_info */
	public static final int
		CL_PLATFORM_PROFILE    = 0x900,
		CL_PLATFORM_VERSION    = 0x901,
		CL_PLATFORM_NAME       = 0x902,
		CL_PLATFORM_VENDOR     = 0x903,
		CL_PLATFORM_EXTENSIONS = 0x904;

	/** cl_device_type - bitfield */
	public static final int
		CL_DEVICE_TYPE_DEFAULT     = 1 << 0,
		CL_DEVICE_TYPE_CPU         = 1 << 1,
		CL_DEVICE_TYPE_GPU         = 1 << 2,
		CL_DEVICE_TYPE_ACCELERATOR = 1 << 3,
		CL_DEVICE_TYPE_ALL         = 0xFFFFFFFF;

	/** cl_device_info */
	public static final int
		CL_DEVICE_TYPE                          = 0x1000,
		CL_DEVICE_VENDOR_ID                     = 0x1001,
		CL_DEVICE_MAX_COMPUTE_UNITS             = 0x1002,
		CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS      = 0x1003,
		CL_DEVICE_MAX_WORK_GROUP_SIZE           = 0x1004,
		CL_DEVICE_MAX_WORK_ITEM_SIZES           = 0x1005,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_CHAR   = 0x1006,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_SHORT  = 0x1007,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_       = 0x1008,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_LONG   = 0x1009,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT  = 0x100A,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE = 0x100B,
		CL_DEVICE_MAX_CLOCK_FREQUENCY           = 0x100C,
		CL_DEVICE_ADDRESS_BITS                  = 0x100D,
		CL_DEVICE_MAX_READ_IMAGE_ARGS           = 0x100E,
		CL_DEVICE_MAX_WRITE_IMAGE_ARGS          = 0x100F,
		CL_DEVICE_MAX_MEM_ALLOC_SIZE            = 0x1010,
		CL_DEVICE_IMAGE2D_MAX_WIDTH             = 0x1011,
		CL_DEVICE_IMAGE2D_MAX_HEIGHT            = 0x1012,
		CL_DEVICE_IMAGE3D_MAX_WIDTH             = 0x1013,
		CL_DEVICE_IMAGE3D_MAX_HEIGHT            = 0x1014,
		CL_DEVICE_IMAGE3D_MAX_DEPTH             = 0x1015,
		CL_DEVICE_IMAGE_SUPPORT                 = 0x1016,
		CL_DEVICE_MAX_PARAMETER_SIZE            = 0x1017,
		CL_DEVICE_MAX_SAMPLERS                  = 0x1018,
		CL_DEVICE_MEM_BASE_ADDR_ALIGN           = 0x1019,
		CL_DEVICE_MIN_DATA_TYPE_ALIGN_SIZE      = 0x101A,
		CL_DEVICE_SINGLE_FP_CONFIG              = 0x101B,
		CL_DEVICE_GLOBAL_MEM_CACHE_TYPE         = 0x101C,
		CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE     = 0x101D,
		CL_DEVICE_GLOBAL_MEM_CACHE_SIZE         = 0x101E,
		CL_DEVICE_GLOBAL_MEM_SIZE               = 0x101F,
		CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE      = 0x1020,
		CL_DEVICE_MAX_CONSTANT_ARGS             = 0x1021,
		CL_DEVICE_LOCAL_MEM_TYPE                = 0x1022,
		CL_DEVICE_LOCAL_MEM_SIZE                = 0x1023,
		CL_DEVICE_ERROR_CORRECTION_SUPPORT      = 0x1024,
		CL_DEVICE_PROFILING_TIMER_RESOLUTION    = 0x1025,
		CL_DEVICE_ENDIAN_LITTLE                 = 0x1026,
		CL_DEVICE_AVAILABLE                     = 0x1027,
		CL_DEVICE_COMPILER_AVAILABLE            = 0x1028,
		CL_DEVICE_EXECUTION_CAPABILITIES        = 0x1029,
		CL_DEVICE_QUEUE_PROPERTIES              = 0x102A,
		CL_DEVICE_NAME                          = 0x102B,
		CL_DEVICE_VENDOR                        = 0x102C,
		CL_DRIVER_VERSION                       = 0x102D,
		CL_DEVICE_PROFILE                       = 0x102E,
		CL_DEVICE_VERSION                       = 0x102F,
		CL_DEVICE_EXTENSIONS                    = 0x1030,
		CL_DEVICE_PLATFORM                      = 0x1031;

	/** cl_device_fp_config - bitfield */
	public static final int
		CL_FP_DENORM           = 1 << 0,
		CL_FP_INF_NAN          = 1 << 1,
		CL_FP_ROUND_TO_NEAREST = 1 << 2,
		CL_FP_ROUND_TO_ZERO    = 1 << 3,
		CL_FP_ROUND_TO_INF     = 1 << 4,
		CL_FP_FMA              = 1 << 5;

	/** cl_device_mem_cache_type */
	public static final int
		CL_NONE             = 0x0,
		CL_READ_ONLY_CACHE  = 0x1,
		CL_READ_WRITE_CACHE = 0x2;

	/** cl_device_local_mem_type */
	public static final int
		CL_LOCAL  = 0x1,
		CL_GLOBAL = 0x2;

	/** cl_device_exec_capabilities - bitfield */
	public static final int
		CL_EXEC_KERNEL        = 1 << 0,
		CL_EXEC_NATIVE_KERNEL = 1 << 1;

	/** cl_command_queue_properties - bitfield */
	public static final int
		CL_QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE = 1 << 0,
		CL_QUEUE_PROFILING_ENABLE              = 1 << 1;

	/** cl_context_info */
	public static final int
		CL_CONTEXT_REFERENCE_COUNT = 0x1080,
		CL_CONTEXT_DEVICES         = 0x1081,
		CL_CONTEXT_PROPERTIES      = 0x1082;

	/** cl_context_info + cl_context_properties */
	public static final int CL_CONTEXT_PLATFORM = 0x1084;

	/** cl_command_queue_info */
	public static final int
		CL_QUEUE_CONTEXT         = 0x1090,
		CL_QUEUE_DEVICE          = 0x1091,
		CL_QUEUE_REFERENCE_COUNT = 0x1092,
		CL_QUEUE_PROPERTIES      = 0x1093;

	/** cl_mem_flags - bitfield */
	public static final int
		CL_MEM_READ_WRITE     = 1 << 0,
		CL_MEM_WRITE_ONLY     = 1 << 1,
		CL_MEM_READ_ONLY      = 1 << 2,
		CL_MEM_USE_HOST_PTR   = 1 << 3,
		CL_MEM_ALLOC_HOST_PTR = 1 << 4,
		CL_MEM_COPY_HOST_PTR  = 1 << 5;

	/** cl_channel_order */
	public static final int
		CL_R         = 0x10B0,
		CL_A         = 0x10B1,
		CL_RG        = 0x10B2,
		CL_RA        = 0x10B3,
		CL_RGB       = 0x10B4,
		CL_RGBA      = 0x10B5,
		CL_BGRA      = 0x10B6,
		CL_ARGB      = 0x10B7,
		CL_INTENSITY = 0x10B8,
		CL_LUMINANCE = 0x10B9;

	/** cl_channel_type */
	public static final int
		CL_SNORM_INT8       = 0x10D0,
		CL_SNORM_INT16      = 0x10D1,
		CL_UNORM_INT8       = 0x10D2,
		CL_UNORM_INT16      = 0x10D3,
		CL_UNORM_SHORT_565  = 0x10D4,
		CL_UNORM_SHORT_555  = 0x10D5,
		CL_UNORM_INT_101010 = 0x10D6,
		CL_SIGNED_INT8      = 0x10D7,
		CL_SIGNED_INT16     = 0x10D8,
		CL_SIGNED_INT32     = 0x10D9,
		CL_UNSIGNED_INT8    = 0x10DA,
		CL_UNSIGNED_INT16   = 0x10DB,
		CL_UNSIGNED_INT32   = 0x10DC,
		CL_HALF_FLOAT       = 0x10DD,
		CL_FLOAT            = 0x10DE;

	/** cl_mem_object_type */
	public static final int
		CL_MEM_OBJECT_BUFFER  = 0x10F0,
		CL_MEM_OBJECT_IMAGE2D = 0x10F1,
		CL_MEM_OBJECT_IMAGE3D = 0x10F2;

	/** cl_mem_info */
	public static final int
		CL_MEM_TYPE            = 0x1100,
		CL_MEM_FLAGS           = 0x1101,
		CL_MEM_SIZE            = 0x1102,
		CL_MEM_HOST_PTR        = 0x1103,
		CL_MEM_MAP_COUNT       = 0x1104,
		CL_MEM_REFERENCE_COUNT = 0x1105,
		CL_MEM_CONTEXT         = 0x1106;

	/** cl_image_info */
	public static final int
		CL_IMAGE_FORMAT       = 0x1110,
		CL_IMAGE_ELEMENT_SIZE = 0x1111,
		CL_IMAGE_ROW_PITCH    = 0x1112,
		CL_IMAGE_SLICE_PITCH  = 0x1113,
		CL_IMAGE_WIDTH        = 0x1114,
		CL_IMAGE_HEIGHT       = 0x1115,
		CL_IMAGE_DEPTH        = 0x1116;

	/** cl_addressing_mode */
	public static final int
		CL_ADDRESS_NONE          = 0x1130,
		CL_ADDRESS_CLAMP_TO_EDGE = 0x1131,
		CL_ADDRESS_CLAMP         = 0x1132,
		CL_ADDRESS_REPEAT        = 0x1133;

	/** cl_filter_mode */
	public static final int
		CL_FILTER_NEAREST = 0x1140,
		CL_FILTER_LINEAR  = 0x1141;

	/** cl_sampler_info */
	public static final int
		CL_SAMPLER_REFERENCE_COUNT   = 0x1150,
		CL_SAMPLER_CONTEXT           = 0x1151,
		CL_SAMPLER_NORMALIZED_COORDS = 0x1152,
		CL_SAMPLER_ADDRESSING_MODE   = 0x1153,
		CL_SAMPLER_FILTER_MODE       = 0x1154;

	/** cl_map_flags - bitfield */
	public static final int
		CL_MAP_READ  = 1 << 0,
		CL_MAP_WRITE = 1 << 1;

	/** cl_program_info */
	public static final int
		CL_PROGRAM_REFERENCE_COUNT = 0x1160,
		CL_PROGRAM_CONTEXT         = 0x1161,
		CL_PROGRAM_NUM_DEVICES     = 0x1162,
		CL_PROGRAM_DEVICES         = 0x1163,
		CL_PROGRAM_SOURCE          = 0x1164,
		CL_PROGRAM_BINARY_SIZES    = 0x1165,
		CL_PROGRAM_BINARIES        = 0x1166;

	/** cl_program_build_info */
	public static final int
		CL_PROGRAM_BUILD_STATUS  = 0x1181,
		CL_PROGRAM_BUILD_OPTIONS = 0x1182,
		CL_PROGRAM_BUILD_LOG     = 0x1183;

	/** cl_build_status */
	public static final int
		CL_BUILD_SUCCESS     = 0x0,
		CL_BUILD_NONE        = 0xFFFFFFFF,
		CL_BUILD_ERROR       = 0xFFFFFFFE,
		CL_BUILD_IN_PROGRESS = 0xFFFFFFFD;

	/** cl_kernel_info */
	public static final int
		CL_KERNEL_FUNCTION_NAME   = 0x1190,
		CL_KERNEL_NUM_ARGS        = 0x1191,
		CL_KERNEL_REFERENCE_COUNT = 0x1192,
		CL_KERNEL_CONTEXT         = 0x1193,
		CL_KERNEL_PROGRAM         = 0x1194;

	/** cl_kernel_work_group_info */
	public static final int
		CL_KERNEL_WORK_GROUP_SIZE         = 0x11B0,
		CL_KERNEL_COMPILE_WORK_GROUP_SIZE = 0x11B1,
		CL_KERNEL_LOCAL_MEM_SIZE          = 0x11B2;

	/** cl_event_info */
	public static final int
		CL_EVENT_COMMAND_QUEUE            = 0x11D0,
		CL_EVENT_COMMAND_TYPE             = 0x11D1,
		CL_EVENT_REFERENCE_COUNT          = 0x11D2,
		CL_EVENT_COMMAND_EXECUTION_STATUS = 0x11D3;

	/** cl_command_type */
	public static final int
		CL_COMMAND_NDRANGE_KERNEL       = 0x11F0,
		CL_COMMAND_TASK                 = 0x11F1,
		CL_COMMAND_NATIVE_KERNEL        = 0x11F2,
		CL_COMMAND_READ_BUFFER          = 0x11F3,
		CL_COMMAND_WRITE_BUFFER         = 0x11F4,
		CL_COMMAND_COPY_BUFFER          = 0x11F5,
		CL_COMMAND_READ_IMAGE           = 0x11F6,
		CL_COMMAND_WRITE_IMAGE          = 0x11F7,
		CL_COMMAND_COPY_IMAGE           = 0x11F8,
		CL_COMMAND_COPY_IMAGE_TO_BUFFER = 0x11F9,
		CL_COMMAND_COPY_BUFFER_TO_IMAGE = 0x11FA,
		CL_COMMAND_MAP_BUFFER           = 0x11FB,
		CL_COMMAND_MAP_IMAGE            = 0x11FC,
		CL_COMMAND_UNMAP_MEM_OBJECT     = 0x11FD,
		CL_COMMAND_MARKER               = 0x11FE,
		CL_COMMAND_ACQUIRE_GL_OBJECTS   = 0x11FF,
		CL_COMMAND_RELEASE_GL_OBJECTS   = 0x1200;

	/** command execution status */
	public static final int
		CL_COMPLETE  = 0x0,
		CL_RUNNING   = 0x1,
		CL_SUBMITTED = 0x2,
		CL_QUEUED    = 0x3;

	/** cl_profiling_info */
	public static final int
		CL_PROFILING_COMMAND_QUEUED = 0x1280,
		CL_PROFILING_COMMAND_SUBMIT = 0x1281,
		CL_PROFILING_COMMAND_START  = 0x1282,
		CL_PROFILING_COMMAND_END    = 0x1283;

	/** Function address. */
	@JavadocExclude
	public final long
		GetPlatformIDs,
		GetPlatformInfo,
		GetDeviceIDs,
		GetDeviceInfo,
		CreateContext,
		CreateContextFromType,
		RetainContext,
		ReleaseContext,
		GetContextInfo,
		CreateCommandQueue,
		RetainCommandQueue,
		ReleaseCommandQueue,
		GetCommandQueueInfo,
		CreateBuffer,
		EnqueueReadBuffer,
		EnqueueWriteBuffer,
		EnqueueCopyBuffer,
		EnqueueMapBuffer,
		CreateImage2D,
		CreateImage3D,
		GetSupportedImageFormats,
		EnqueueReadImage,
		EnqueueWriteImage,
		EnqueueCopyImage,
		EnqueueCopyImageToBuffer,
		EnqueueCopyBufferToImage,
		EnqueueMapImage,
		GetImageInfo,
		RetainMemObject,
		ReleaseMemObject,
		EnqueueUnmapMemObject,
		GetMemObjectInfo,
		CreateSampler,
		RetainSampler,
		ReleaseSampler,
		GetSamplerInfo,
		CreateProgramWithSource,
		CreateProgramWithBinary,
		RetainProgram,
		ReleaseProgram,
		BuildProgram,
		UnloadCompiler,
		GetProgramInfo,
		GetProgramBuildInfo,
		CreateKernel,
		CreateKernelsInProgram,
		RetainKernel,
		ReleaseKernel,
		SetKernelArg,
		GetKernelInfo,
		GetKernelWorkGroupInfo,
		EnqueueNDRangeKernel,
		EnqueueTask,
		EnqueueNativeKernel,
		WaitForEvents,
		GetEventInfo,
		RetainEvent,
		ReleaseEvent,
		EnqueueMarker,
		EnqueueBarrier,
		EnqueueWaitForEvents,
		GetEventProfilingInfo,
		Flush,
		Finish,
		GetExtensionFunctionAddress;

	@JavadocExclude
	public CL10(FunctionProvider provider) {
		GetPlatformIDs = provider.getFunctionAddress("clGetPlatformIDs");
		GetPlatformInfo = provider.getFunctionAddress("clGetPlatformInfo");
		GetDeviceIDs = provider.getFunctionAddress("clGetDeviceIDs");
		GetDeviceInfo = provider.getFunctionAddress("clGetDeviceInfo");
		CreateContext = provider.getFunctionAddress("clCreateContext");
		CreateContextFromType = provider.getFunctionAddress("clCreateContextFromType");
		RetainContext = provider.getFunctionAddress("clRetainContext");
		ReleaseContext = provider.getFunctionAddress("clReleaseContext");
		GetContextInfo = provider.getFunctionAddress("clGetContextInfo");
		CreateCommandQueue = provider.getFunctionAddress("clCreateCommandQueue");
		RetainCommandQueue = provider.getFunctionAddress("clRetainCommandQueue");
		ReleaseCommandQueue = provider.getFunctionAddress("clReleaseCommandQueue");
		GetCommandQueueInfo = provider.getFunctionAddress("clGetCommandQueueInfo");
		CreateBuffer = provider.getFunctionAddress("clCreateBuffer");
		EnqueueReadBuffer = provider.getFunctionAddress("clEnqueueReadBuffer");
		EnqueueWriteBuffer = provider.getFunctionAddress("clEnqueueWriteBuffer");
		EnqueueCopyBuffer = provider.getFunctionAddress("clEnqueueCopyBuffer");
		EnqueueMapBuffer = provider.getFunctionAddress("clEnqueueMapBuffer");
		CreateImage2D = provider.getFunctionAddress("clCreateImage2D");
		CreateImage3D = provider.getFunctionAddress("clCreateImage3D");
		GetSupportedImageFormats = provider.getFunctionAddress("clGetSupportedImageFormats");
		EnqueueReadImage = provider.getFunctionAddress("clEnqueueReadImage");
		EnqueueWriteImage = provider.getFunctionAddress("clEnqueueWriteImage");
		EnqueueCopyImage = provider.getFunctionAddress("clEnqueueCopyImage");
		EnqueueCopyImageToBuffer = provider.getFunctionAddress("clEnqueueCopyImageToBuffer");
		EnqueueCopyBufferToImage = provider.getFunctionAddress("clEnqueueCopyBufferToImage");
		EnqueueMapImage = provider.getFunctionAddress("clEnqueueMapImage");
		GetImageInfo = provider.getFunctionAddress("clGetImageInfo");
		RetainMemObject = provider.getFunctionAddress("clRetainMemObject");
		ReleaseMemObject = provider.getFunctionAddress("clReleaseMemObject");
		EnqueueUnmapMemObject = provider.getFunctionAddress("clEnqueueUnmapMemObject");
		GetMemObjectInfo = provider.getFunctionAddress("clGetMemObjectInfo");
		CreateSampler = provider.getFunctionAddress("clCreateSampler");
		RetainSampler = provider.getFunctionAddress("clRetainSampler");
		ReleaseSampler = provider.getFunctionAddress("clReleaseSampler");
		GetSamplerInfo = provider.getFunctionAddress("clGetSamplerInfo");
		CreateProgramWithSource = provider.getFunctionAddress("clCreateProgramWithSource");
		CreateProgramWithBinary = provider.getFunctionAddress("clCreateProgramWithBinary");
		RetainProgram = provider.getFunctionAddress("clRetainProgram");
		ReleaseProgram = provider.getFunctionAddress("clReleaseProgram");
		BuildProgram = provider.getFunctionAddress("clBuildProgram");
		UnloadCompiler = provider.getFunctionAddress("clUnloadCompiler");
		GetProgramInfo = provider.getFunctionAddress("clGetProgramInfo");
		GetProgramBuildInfo = provider.getFunctionAddress("clGetProgramBuildInfo");
		CreateKernel = provider.getFunctionAddress("clCreateKernel");
		CreateKernelsInProgram = provider.getFunctionAddress("clCreateKernelsInProgram");
		RetainKernel = provider.getFunctionAddress("clRetainKernel");
		ReleaseKernel = provider.getFunctionAddress("clReleaseKernel");
		SetKernelArg = provider.getFunctionAddress("clSetKernelArg");
		GetKernelInfo = provider.getFunctionAddress("clGetKernelInfo");
		GetKernelWorkGroupInfo = provider.getFunctionAddress("clGetKernelWorkGroupInfo");
		EnqueueNDRangeKernel = provider.getFunctionAddress("clEnqueueNDRangeKernel");
		EnqueueTask = provider.getFunctionAddress("clEnqueueTask");
		EnqueueNativeKernel = provider.getFunctionAddress("clEnqueueNativeKernel");
		WaitForEvents = provider.getFunctionAddress("clWaitForEvents");
		GetEventInfo = provider.getFunctionAddress("clGetEventInfo");
		RetainEvent = provider.getFunctionAddress("clRetainEvent");
		ReleaseEvent = provider.getFunctionAddress("clReleaseEvent");
		EnqueueMarker = provider.getFunctionAddress("clEnqueueMarker");
		EnqueueBarrier = provider.getFunctionAddress("clEnqueueBarrier");
		EnqueueWaitForEvents = provider.getFunctionAddress("clEnqueueWaitForEvents");
		GetEventProfilingInfo = provider.getFunctionAddress("clGetEventProfilingInfo");
		Flush = provider.getFunctionAddress("clFlush");
		Finish = provider.getFunctionAddress("clFinish");
		GetExtensionFunctionAddress = provider.getFunctionAddress("clGetExtensionFunctionAddress");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link CL10} instance for the currently loaded ICD. */
	public static CL10 getInstance() {
		return checkFunctionality(CL.getICD().__CL10);
	}

	static CL10 create(FunctionProvider provider) {
		CL10 funcs = new CL10(provider);

		boolean supported = checkFunctions(
			funcs.GetPlatformIDs, funcs.GetPlatformInfo, funcs.GetDeviceIDs, funcs.GetDeviceInfo, funcs.CreateContext, funcs.CreateContextFromType, 
			funcs.RetainContext, funcs.ReleaseContext, funcs.GetContextInfo, funcs.CreateCommandQueue, funcs.RetainCommandQueue, funcs.ReleaseCommandQueue, 
			funcs.GetCommandQueueInfo, funcs.CreateBuffer, funcs.EnqueueReadBuffer, funcs.EnqueueWriteBuffer, funcs.EnqueueCopyBuffer, funcs.EnqueueMapBuffer, 
			funcs.CreateImage2D, funcs.CreateImage3D, funcs.GetSupportedImageFormats, funcs.EnqueueReadImage, funcs.EnqueueWriteImage, funcs.EnqueueCopyImage, 
			funcs.EnqueueCopyImageToBuffer, funcs.EnqueueCopyBufferToImage, funcs.EnqueueMapImage, funcs.GetImageInfo, funcs.RetainMemObject, 
			funcs.ReleaseMemObject, funcs.EnqueueUnmapMemObject, funcs.GetMemObjectInfo, funcs.CreateSampler, funcs.RetainSampler, funcs.ReleaseSampler, 
			funcs.GetSamplerInfo, funcs.CreateProgramWithSource, funcs.CreateProgramWithBinary, funcs.RetainProgram, funcs.ReleaseProgram, funcs.BuildProgram, 
			funcs.UnloadCompiler, funcs.GetProgramInfo, funcs.GetProgramBuildInfo, funcs.CreateKernel, funcs.CreateKernelsInProgram, funcs.RetainKernel, 
			funcs.ReleaseKernel, funcs.SetKernelArg, funcs.GetKernelInfo, funcs.GetKernelWorkGroupInfo, funcs.EnqueueNDRangeKernel, funcs.EnqueueTask, 
			funcs.EnqueueNativeKernel, funcs.WaitForEvents, funcs.GetEventInfo, funcs.RetainEvent, funcs.ReleaseEvent, funcs.EnqueueMarker, 
			funcs.EnqueueBarrier, funcs.EnqueueWaitForEvents, funcs.GetEventProfilingInfo, funcs.Flush, funcs.Finish, funcs.GetExtensionFunctionAddress
		);

		return supported ? funcs : null;
	}

	// --- [ clGetPlatformIDs ] ---

	/** JNI method for {@link #clGetPlatformIDs GetPlatformIDs} */
	@JavadocExclude
	public static native int nclGetPlatformIDs(int num_entries, long platforms, long num_platforms, long __functionAddress);

	/** Unsafe version of {@link #clGetPlatformIDs GetPlatformIDs} */
	@JavadocExclude
	public static int nclGetPlatformIDs(int num_entries, long platforms, long num_platforms) {
		long __functionAddress = getInstance().GetPlatformIDs;
		return nclGetPlatformIDs(num_entries, platforms, num_platforms, __functionAddress);
	}

	/**
	 * Obtains the list of available platforms.
	 *
	 * @param num_entries   the number of {@code cl_platform_id} entries that can be added to {@code platforms}. If {@code platforms} is not {@code NULL}, the {@code num_entries} must
	 *                      be greater than zero.
	 * @param platforms     returns a list of OpenCL platforms found. The {@code cl_platform_id} values returned in {@code platforms} can be used to identify a specific OpenCL
	 *                      platform. If {@code platforms} argument is {@code NULL}, this argument is ignored. The number of OpenCL platforms returned is the minimum of the value
	 *                      specified by {@code num_entries} or the number of OpenCL platforms available.
	 * @param num_platforms returns the number of OpenCL platforms available. If {@code num_platforms} is {@code NULL}, this argument is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_entries} is equal to zero and {@code platforms} is not {@code NULL} or if both {@code num_platforms} and
	 *         {@code platforms} are {@code NULL}.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetPlatformIDs(int num_entries, ByteBuffer platforms, ByteBuffer num_platforms) {
		if ( LWJGLUtil.CHECKS ) {
			if ( platforms != null ) checkBuffer(platforms, num_entries << POINTER_SHIFT);
			if ( num_platforms != null ) checkBuffer(num_platforms, 1 << 2);
		}
		return nclGetPlatformIDs(num_entries, memAddressSafe(platforms), memAddressSafe(num_platforms));
	}

	/** Alternative version of: {@link #clGetPlatformIDs GetPlatformIDs} */
	public static int clGetPlatformIDs(PointerBuffer platforms, IntBuffer num_platforms) {
		if ( LWJGLUtil.CHECKS )
			if ( num_platforms != null ) checkBuffer(num_platforms, 1);
		return nclGetPlatformIDs(platforms == null ? 0 : platforms.remaining(), memAddressSafe(platforms), memAddressSafe(num_platforms));
	}

	// --- [ clGetPlatformInfo ] ---

	/** JNI method for {@link #clGetPlatformInfo GetPlatformInfo} */
	@JavadocExclude
	public static native int nclGetPlatformInfo(long platform, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetPlatformInfo GetPlatformInfo} */
	@JavadocExclude
	public static int nclGetPlatformInfo(long platform, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetPlatformInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(platform);
		return nclGetPlatformInfo(platform, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns information about the specified OpenCL platform.
	 *
	 * @param platform             the platform to query
	 * @param param_name           the parameter to query. One of:<br>{@link #CL_PLATFORM_PROFILE PLATFORM_PROFILE}, {@link #CL_PLATFORM_VERSION PLATFORM_VERSION}, {@link #CL_PLATFORM_NAME PLATFORM_NAME}, {@link #CL_PLATFORM_VENDOR PLATFORM_VENDOR}, {@link #CL_PLATFORM_EXTENSIONS PLATFORM_EXTENSIONS}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          the memory location where appropriate values for a given {@code param_name} will be returned
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_PLATFORM INVALID_PLATFORM} if {@code platform} is not a valid platform.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
	 *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetPlatformInfo(long platform, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetPlatformInfo(platform, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetPlatformInfo GetPlatformInfo} */
	public static int clGetPlatformInfo(long platform, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetPlatformInfo(platform, param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clGetDeviceIDs ] ---

	/** JNI method for {@link #clGetDeviceIDs GetDeviceIDs} */
	@JavadocExclude
	public static native int nclGetDeviceIDs(long platform, long device_type, int num_entries, long devices, long num_devices, long __functionAddress);

	/** Unsafe version of {@link #clGetDeviceIDs GetDeviceIDs} */
	@JavadocExclude
	public static int nclGetDeviceIDs(long platform, long device_type, int num_entries, long devices, long num_devices) {
		long __functionAddress = getInstance().GetDeviceIDs;
		if ( LWJGLUtil.CHECKS )
			checkPointer(platform);
		return nclGetDeviceIDs(platform, device_type, num_entries, devices, num_devices, __functionAddress);
	}

	/**
	 * Obtains the list of devices available on a platform.
	 *
	 * @param platform    the platform to query
	 * @param device_type a bitfield that identifies the type of OpenCL device. The {@code device_type} can be used to query specific OpenCL devices or all OpenCL devices
	 *                    available. One or more of:<br>{@link #CL_DEVICE_TYPE_DEFAULT DEVICE_TYPE_DEFAULT}, {@link #CL_DEVICE_TYPE_CPU DEVICE_TYPE_CPU}, {@link #CL_DEVICE_TYPE_GPU DEVICE_TYPE_GPU}, {@link #CL_DEVICE_TYPE_ACCELERATOR DEVICE_TYPE_ACCELERATOR}, {@link #CL_DEVICE_TYPE_ALL DEVICE_TYPE_ALL}, {@link CL12#CL_DEVICE_TYPE_CUSTOM DEVICE_TYPE_CUSTOM}
	 * @param num_entries the number of {@code cl_device_id} entries that can be added to devices. If {@code devices} is not {@code NULL}, the {@code num_entries} must be greater
	 *                    than zero.
	 * @param devices     returns a list of OpenCL devices found. The {@code cl_device_id} values returned in {@code devices} can be used to identify a specific OpenCL
	 *                    device. If {@code devices} argument is {@code NULL}, this argument is ignored. The number of OpenCL devices returned is the minimum of the value specified
	 *                    by {@code num_entries} or the number of OpenCL devices whose type matches {@code device_type}.
	 * @param num_devices returns the number of OpenCL devices available that match {@code device_type}. If {@code num_devices} is {@code NULL}, this argument is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_PLATFORM INVALID_PLATFORM} if {@code platform} is not a valid platform.</li>
	 *         <li>{@link #CL_INVALID_DEVICE_TYPE INVALID_DEVICE_TYPE} if {@code device_type} is not a valid value.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_entries} is equal to zero and {@code devices} is not {@code NULL} or if both {@code num_devices} and {@code devices} are {@code NULL}.</li>
	 *         <li>{@link #CL_DEVICE_NOT_FOUND DEVICE_NOT_FOUND} if no OpenCL devices that matched {@code device_type} were found.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetDeviceIDs(long platform, long device_type, int num_entries, ByteBuffer devices, ByteBuffer num_devices) {
		if ( LWJGLUtil.CHECKS ) {
			if ( devices != null ) checkBuffer(devices, num_entries << POINTER_SHIFT);
			if ( num_devices != null ) checkBuffer(num_devices, 1 << 2);
		}
		return nclGetDeviceIDs(platform, device_type, num_entries, memAddressSafe(devices), memAddressSafe(num_devices));
	}

	/** Alternative version of: {@link #clGetDeviceIDs GetDeviceIDs} */
	public static int clGetDeviceIDs(long platform, long device_type, PointerBuffer devices, IntBuffer num_devices) {
		if ( LWJGLUtil.CHECKS )
			if ( num_devices != null ) checkBuffer(num_devices, 1);
		return nclGetDeviceIDs(platform, device_type, devices == null ? 0 : devices.remaining(), memAddressSafe(devices), memAddressSafe(num_devices));
	}

	// --- [ clGetDeviceInfo ] ---

	/** JNI method for {@link #clGetDeviceInfo GetDeviceInfo} */
	@JavadocExclude
	public static native int nclGetDeviceInfo(long device, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetDeviceInfo GetDeviceInfo} */
	@JavadocExclude
	public static int nclGetDeviceInfo(long device, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetDeviceInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		return nclGetDeviceInfo(device, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns specific information about an OpenCL device. {@code device} may be a device returned by {@link #clGetDeviceIDs GetDeviceIDs} or a sub-device created by
	 * {@link CL12#clCreateSubDevices CreateSubDevices}. If {@code device} is a sub-device, the specific information for the sub-device will be returned.
	 *
	 * @param device               the device to query
	 * @param param_name           an enumeration constant tha identifies the device information being queried. One of:<br>{@link #CL_DEVICE_TYPE DEVICE_TYPE}, {@link #CL_DEVICE_VENDOR_ID DEVICE_VENDOR_ID}, {@link #CL_DEVICE_MAX_COMPUTE_UNITS DEVICE_MAX_COMPUTE_UNITS}, {@link #CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS DEVICE_MAX_WORK_ITEM_DIMENSIONS}, {@link #CL_DEVICE_MAX_WORK_GROUP_SIZE DEVICE_MAX_WORK_GROUP_SIZE}, {@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_CHAR DEVICE_PREFERRED_VECTOR_WIDTH_CHAR}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_SHORT DEVICE_PREFERRED_VECTOR_WIDTH_SHORT}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_ DEVICE_PREFERRED_VECTOR_WIDTH_}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_LONG DEVICE_PREFERRED_VECTOR_WIDTH_LONG}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE}, {@link #CL_DEVICE_MAX_CLOCK_FREQUENCY DEVICE_MAX_CLOCK_FREQUENCY}, {@link #CL_DEVICE_ADDRESS_BITS DEVICE_ADDRESS_BITS}, {@link #CL_DEVICE_MAX_READ_IMAGE_ARGS DEVICE_MAX_READ_IMAGE_ARGS}, {@link #CL_DEVICE_MAX_WRITE_IMAGE_ARGS DEVICE_MAX_WRITE_IMAGE_ARGS}, {@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE}, {@link #CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH}, {@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT DEVICE_IMAGE2D_MAX_HEIGHT}, {@link #CL_DEVICE_IMAGE3D_MAX_WIDTH DEVICE_IMAGE3D_MAX_WIDTH}, {@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT DEVICE_IMAGE3D_MAX_HEIGHT}, {@link #CL_DEVICE_IMAGE3D_MAX_DEPTH DEVICE_IMAGE3D_MAX_DEPTH}, {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT}, {@link #CL_DEVICE_MAX_PARAMETER_SIZE DEVICE_MAX_PARAMETER_SIZE}, {@link #CL_DEVICE_MAX_SAMPLERS DEVICE_MAX_SAMPLERS}, {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN}, {@link #CL_DEVICE_MIN_DATA_TYPE_ALIGN_SIZE DEVICE_MIN_DATA_TYPE_ALIGN_SIZE}, {@link #CL_DEVICE_SINGLE_FP_CONFIG DEVICE_SINGLE_FP_CONFIG}, {@link #CL_DEVICE_GLOBAL_MEM_CACHE_TYPE DEVICE_GLOBAL_MEM_CACHE_TYPE}, {@link #CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE DEVICE_GLOBAL_MEM_CACHELINE_SIZE}, {@link #CL_DEVICE_GLOBAL_MEM_CACHE_SIZE DEVICE_GLOBAL_MEM_CACHE_SIZE}, {@link #CL_DEVICE_GLOBAL_MEM_SIZE DEVICE_GLOBAL_MEM_SIZE}, {@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE}, {@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}, {@link #CL_DEVICE_LOCAL_MEM_TYPE DEVICE_LOCAL_MEM_TYPE}, {@link #CL_DEVICE_LOCAL_MEM_SIZE DEVICE_LOCAL_MEM_SIZE}, {@link #CL_DEVICE_ERROR_CORRECTION_SUPPORT DEVICE_ERROR_CORRECTION_SUPPORT}, {@link #CL_DEVICE_PROFILING_TIMER_RESOLUTION DEVICE_PROFILING_TIMER_RESOLUTION}, {@link #CL_DEVICE_ENDIAN_LITTLE DEVICE_ENDIAN_LITTLE}, {@link #CL_DEVICE_AVAILABLE DEVICE_AVAILABLE}, {@link #CL_DEVICE_COMPILER_AVAILABLE DEVICE_COMPILER_AVAILABLE}, {@link #CL_DEVICE_EXECUTION_CAPABILITIES DEVICE_EXECUTION_CAPABILITIES}, {@link #CL_DEVICE_QUEUE_PROPERTIES DEVICE_QUEUE_PROPERTIES}, {@link #CL_DEVICE_NAME DEVICE_NAME}, {@link #CL_DEVICE_VENDOR DEVICE_VENDOR}, {@link #CL_DRIVER_VERSION DRIVER_VERSION}, {@link #CL_DEVICE_PROFILE DEVICE_PROFILE}, {@link #CL_DEVICE_VERSION DEVICE_VERSION}, {@link #CL_DEVICE_EXTENSIONS DEVICE_EXTENSIONS}, {@link #CL_DEVICE_PLATFORM DEVICE_PLATFORM}, {@link CL11#CL_DEVICE_PREFERRED_VECTOR_WIDTH_HALF DEVICE_PREFERRED_VECTOR_WIDTH_HALF}, {@link CL11#CL_DEVICE_HOST_UNIFIED_MEMORY DEVICE_HOST_UNIFIED_MEMORY}, {@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_CHAR DEVICE_NATIVE_VECTOR_WIDTH_CHAR}, {@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_SHORT DEVICE_NATIVE_VECTOR_WIDTH_SHORT}, {@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_INT DEVICE_NATIVE_VECTOR_WIDTH_INT}, {@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_LONG DEVICE_NATIVE_VECTOR_WIDTH_LONG}, {@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_FLOAT DEVICE_NATIVE_VECTOR_WIDTH_FLOAT}, {@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE}, {@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF DEVICE_NATIVE_VECTOR_WIDTH_HALF}, {@link CL11#CL_DEVICE_OPENCL_C_VERSION DEVICE_OPENCL_C_VERSION}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not valid.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
	 *         size of return type and {@code param_value} is not a {@code NULL} value or if {@code param_name} is a value that is available as an extension and the
	 *         corresponding extension is not supported by the device.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetDeviceInfo(long device, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetDeviceInfo(device, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetDeviceInfo GetDeviceInfo} */
	public static int clGetDeviceInfo(long device, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetDeviceInfo(device, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetDeviceInfo GetDeviceInfo} */
	public static int clGetDeviceInfo(long device, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetDeviceInfo(device, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** LongBuffer version of: {@link #clGetDeviceInfo GetDeviceInfo} */
	public static int clGetDeviceInfo(long device, int param_name, LongBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetDeviceInfo(device, param_name, (param_value == null ? 0 : param_value.remaining()) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetDeviceInfo GetDeviceInfo} */
	public static int clGetDeviceInfo(long device, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetDeviceInfo(device, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clCreateContext ] ---

	/** JNI method for {@link #clCreateContext CreateContext} */
	@JavadocExclude
	public static native long nclCreateContext(long properties, int num_devices, long devices, long pfn_notify, long user_data, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateContext CreateContext} */
	@JavadocExclude
	public static long nclCreateContext(long properties, int num_devices, long devices, long pfn_notify, long user_data, long errcode_ret) {
		long __functionAddress = getInstance().CreateContext;
		return nclCreateContext(properties, num_devices, devices, pfn_notify, user_data, errcode_ret, __functionAddress);
	}

	/**
	 * Creates an OpenCL context. An OpenCL context is created with one or more devices. Contexts are used by the OpenCL runtime for managing objects such as
	 * command-queues, memory, program and kernel objects and for executing kernels on one or more devices specified in the context.
	 *
	 * @param properties  a list of context property names and their corresponding values. Each property name is immediately followed by the corresponding desired value. The
	 *                    list is terminated with 0. One of:<br>{@link #CL_CONTEXT_PLATFORM CONTEXT_PLATFORM}, {@link CL12#CL_CONTEXT_INTEROP_USER_SYNC CONTEXT_INTEROP_USER_SYNC}, {@link KHRGLSharing#CL_GL_CONTEXT_KHR GL_CONTEXT_KHR}, {@link KHRGLSharing#CL_EGL_DISPLAY_KHR EGL_DISPLAY_KHR}, {@link KHRGLSharing#CL_GLX_DISPLAY_KHR GLX_DISPLAY_KHR}, {@link KHRGLSharing#CL_WGL_HDC_KHR WGL_HDC_KHR}, {@link KHRGLSharing#CL_CGL_SHAREGROUP_KHR CGL_SHAREGROUP_KHR}
	 * @param num_devices the number of devices specified in the {@code devices} argument
	 * @param devices     a list of unique devices returned by {@link #clGetDeviceIDs GetDeviceIDs} or sub-devices created by {@link CL12#clCreateSubDevices CreateSubDevices} for a platform
	 * @param pfn_notify  a callback function that can be registered by the application. This callback function will be used by the OpenCL implementation to report
	 *                    information on errors during context creation as well as errors that occur at runtime in this context. This callback function may be called
	 *                    asynchronously by the OpenCL implementation. It is the application's responsibility to ensure that the callback function is thread-safe.
	 *                    
	 *                    <p>If {@code pfn_notify} is {@code NULL}, no callback function is registered.</p>
	 * @param user_data   will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero context and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the context is created successfully. Otherwise, it returns a {@code NULL} value with the
	 *         following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_PLATFORM INVALID_PLATFORM} if {@code properties} is {@code NULL} and no platform could be selected or if platform value specified in properties is not a
	 *         valid platform.</li>
	 *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if context property name in {@code properties} is not a supported property name, if the value specified for a
	 *         supported property name is not valid, or if the same property name is specified more than once.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code devices} is {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_devices} is equal to zero.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code devices} contains an invalid device.</li>
	 *         <li>{@link #CL_DEVICE_NOT_AVAILABLE DEVICE_NOT_AVAILABLE} if a device in {@code devices} is currently not available even though the device was returned by {@link #clGetDeviceIDs GetDeviceIDs}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateContext(ByteBuffer properties, int num_devices, ByteBuffer devices, CLCreateContextCallback pfn_notify, long user_data, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(properties, 3 << POINTER_SHIFT);
			checkBuffer(devices, num_devices << POINTER_SHIFT);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return nclCreateContext(memAddress(properties), num_devices, memAddress(devices), pfn_notify == null ? NULL : pfn_notify.getPointer(), user_data, memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateContext CreateContext} */
	public static long clCreateContext(PointerBuffer properties, PointerBuffer devices, CLCreateContextCallback pfn_notify, long user_data, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(properties, 3);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateContext(memAddress(properties), devices.remaining(), memAddress(devices), pfn_notify == null ? NULL : pfn_notify.getPointer(), user_data, memAddressSafe(errcode_ret));
	}

	/** Single value version of: {@link #clCreateContext CreateContext} */
	public static long clCreateContext(PointerBuffer properties, long device, CLCreateContextCallback pfn_notify, long user_data, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(properties, 3);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int devices = __buffer.pointerParam(device);
		return nclCreateContext(memAddress(properties), 1, __buffer.address(devices), pfn_notify == null ? NULL : pfn_notify.getPointer(), user_data, memAddressSafe(errcode_ret));
	}

	// --- [ clCreateContextFromType ] ---

	/** JNI method for {@link #clCreateContextFromType CreateContextFromType} */
	@JavadocExclude
	public static native long nclCreateContextFromType(long properties, long device_type, long pfn_notify, long user_data, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateContextFromType CreateContextFromType} */
	@JavadocExclude
	public static long nclCreateContextFromType(long properties, long device_type, long pfn_notify, long user_data, long errcode_ret) {
		long __functionAddress = getInstance().CreateContextFromType;
		return nclCreateContextFromType(properties, device_type, pfn_notify, user_data, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a context using devices of the specified type. See {@link #clCreateContext CreateContext} for details.
	 *
	 * @param properties  a list of context property names and their corresponding values. Each property name is immediately followed by the corresponding desired value. The
	 *                    list is terminated with 0.
	 * @param device_type a bit-field that identifies the type of device. One of:<br>{@link #CL_DEVICE_TYPE_DEFAULT DEVICE_TYPE_DEFAULT}, {@link #CL_DEVICE_TYPE_CPU DEVICE_TYPE_CPU}, {@link #CL_DEVICE_TYPE_GPU DEVICE_TYPE_GPU}, {@link #CL_DEVICE_TYPE_ACCELERATOR DEVICE_TYPE_ACCELERATOR}, {@link #CL_DEVICE_TYPE_ALL DEVICE_TYPE_ALL}, {@link CL12#CL_DEVICE_TYPE_CUSTOM DEVICE_TYPE_CUSTOM}
	 * @param pfn_notify  a callback function that can be registered by the application
	 * @param user_data   will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 */
	public static long clCreateContextFromType(ByteBuffer properties, long device_type, CLCreateContextCallback pfn_notify, long user_data, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(properties, 3 << POINTER_SHIFT);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return nclCreateContextFromType(memAddress(properties), device_type, pfn_notify == null ? NULL : pfn_notify.getPointer(), user_data, memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateContextFromType CreateContextFromType} */
	public static long clCreateContextFromType(PointerBuffer properties, long device_type, CLCreateContextCallback pfn_notify, long user_data, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(properties, 3);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateContextFromType(memAddress(properties), device_type, pfn_notify == null ? NULL : pfn_notify.getPointer(), user_data, memAddressSafe(errcode_ret));
	}

	// --- [ clRetainContext ] ---

	/** JNI method for {@link #clRetainContext RetainContext} */
	@JavadocExclude
	public static native int nclRetainContext(long context, long __functionAddress);

	/**
	 * Increments the context reference count.
	 * 
	 * <p>{@link #clCreateContext CreateContext} and {@link #clCreateContextFromType CreateContextFromType} perform an implicit retain. This is very helpful for 3rd party libraries, which typically get a context passed
	 * to them by the application. However, it is possible that the application may delete the context without informing the library. Allowing functions to
	 * attach to (i.e. retain) and release a context solves the problem of a context being used by a library no longer being valid.</p>
	 *
	 * @param context the context to retain
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainContext(long context) {
		long __functionAddress = getInstance().RetainContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclRetainContext(context, __functionAddress);
	}

	// --- [ clReleaseContext ] ---

	/** JNI method for {@link #clReleaseContext ReleaseContext} */
	@JavadocExclude
	public static native int nclReleaseContext(long context, long __functionAddress);

	/**
	 * Decrements the context reference count.
	 * 
	 * <p>After the context reference count becomes zero and all the objects attached to context (such as memory objects, command-queues) are released, the
	 * context is deleted.</p>
	 *
	 * @param context the context to release
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseContext(long context) {
		long __functionAddress = getInstance().ReleaseContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclReleaseContext(context, __functionAddress);
	}

	// --- [ clGetContextInfo ] ---

	/** JNI method for {@link #clGetContextInfo GetContextInfo} */
	@JavadocExclude
	public static native int nclGetContextInfo(long context, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetContextInfo GetContextInfo} */
	@JavadocExclude
	public static int nclGetContextInfo(long context, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetContextInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclGetContextInfo(context, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Queries information about a context.
	 *
	 * @param context              the OpenCL context being queried
	 * @param param_name           an enumeration constant that specifies the information to query. One of:<br>{@link #CL_CONTEXT_REFERENCE_COUNT CONTEXT_REFERENCE_COUNT}, {@link #CL_CONTEXT_DEVICES CONTEXT_DEVICES}, {@link #CL_CONTEXT_PROPERTIES CONTEXT_PROPERTIES}, {@link CL11#CL_CONTEXT_NUM_DEVICES CONTEXT_NUM_DEVICES}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
	 *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetContextInfo(long context, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetContextInfo(context, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetContextInfo GetContextInfo} */
	public static int clGetContextInfo(long context, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetContextInfo(context, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetContextInfo GetContextInfo} */
	public static int clGetContextInfo(long context, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetContextInfo(context, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetContextInfo GetContextInfo} */
	public static int clGetContextInfo(long context, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetContextInfo(context, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clCreateCommandQueue ] ---

	/** JNI method for {@link #clCreateCommandQueue CreateCommandQueue} */
	@JavadocExclude
	public static native long nclCreateCommandQueue(long context, long device, long properties, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateCommandQueue CreateCommandQueue} */
	@JavadocExclude
	public static long nclCreateCommandQueue(long context, long device, long properties, long errcode_ret) {
		long __functionAddress = getInstance().CreateCommandQueue;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(context);
			checkPointer(device);
		}
		return nclCreateCommandQueue(context, device, properties, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a command-queue on a specific device.
	 * 
	 * <p>OpenCL objects such as memory, program and kernel objects are created using a context. Operations on these objects are performed using a command-queue.
	 * The command-queue can be used to queue a set of operations (referred to as commands) in order. Having multiple command-queues allows applications to
	 * queue multiple independent commands without requiring synchronization. Note that this should work as long as these objects are not being shared. Sharing
	 * of objects across multiple command-queues will require the application to perform appropriate synchronization.</p>
	 *
	 * @param context     a valid OpenCL context
	 * @param device      a device associated with context. It can either be in the list of devices specified when context is created using {@link #clCreateContext CreateContext} or have the same
	 *                    device type as device type specified when context is created using {@link #clCreateContextFromType CreateContextFromType}.
	 * @param properties  a bit-field of properties for the command-queue. One of:<br>{@link #CL_QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE}, {@link #CL_QUEUE_PROFILING_ENABLE QUEUE_PROFILING_ENABLE}
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero command-queue and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the command-queue is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not a valid device or is not associated with {@code context}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code properties} are not valid.</li>
	 *         <li>{@link #CL_INVALID_QUEUE_PROPERTIES INVALID_QUEUE_PROPERTIES} if values specified in {@code properties} are valid but are not supported by the device.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateCommandQueue(long context, long device, long properties, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		return nclCreateCommandQueue(context, device, properties, memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateCommandQueue CreateCommandQueue} */
	public static long clCreateCommandQueue(long context, long device, long properties, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateCommandQueue(context, device, properties, memAddressSafe(errcode_ret));
	}

	// --- [ clRetainCommandQueue ] ---

	/** JNI method for {@link #clRetainCommandQueue RetainCommandQueue} */
	@JavadocExclude
	public static native int nclRetainCommandQueue(long command_queue, long __functionAddress);

	/**
	 * Increments the {@code command_queue} reference count.
	 * 
	 * <p>{@link #clCreateCommandQueue CreateCommandQueue} performs an implicit retain. This is very helpful for 3rd party libraries, which typically get a command-queue passed to them by the
	 * application. However, it is possible that the application may delete the command-queue without informing the library. Allowing functions to attach to
	 * (i.e. retain) and release a command-queue solves the problem of a command-queue being used by a library no longer being valid.</p>
	 *
	 * @param command_queue the command-queue to retain
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainCommandQueue(long command_queue) {
		long __functionAddress = getInstance().RetainCommandQueue;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclRetainCommandQueue(command_queue, __functionAddress);
	}

	// --- [ clReleaseCommandQueue ] ---

	/** JNI method for {@link #clReleaseCommandQueue ReleaseCommandQueue} */
	@JavadocExclude
	public static native int nclReleaseCommandQueue(long command_queue, long __functionAddress);

	/**
	 * Decrements the {@code command_queue} reference count.
	 * 
	 * <p>After the {@code command_queue} reference count becomes zero and all commands queued to {@code command_queue} have finished (eg. kernel executions,
	 * memory object updates etc.), the command-queue is deleted.</p>
	 * 
	 * <p>{@code clReleaseCommandQueue} performs an implicit flush to issue any previously queued OpenCL commands in command_queue.</p>
	 *
	 * @param command_queue the command-queue to release
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseCommandQueue(long command_queue) {
		long __functionAddress = getInstance().ReleaseCommandQueue;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclReleaseCommandQueue(command_queue, __functionAddress);
	}

	// --- [ clGetCommandQueueInfo ] ---

	/** JNI method for {@link #clGetCommandQueueInfo GetCommandQueueInfo} */
	@JavadocExclude
	public static native int nclGetCommandQueueInfo(long command_queue, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetCommandQueueInfo GetCommandQueueInfo} */
	@JavadocExclude
	public static int nclGetCommandQueueInfo(long command_queue, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetCommandQueueInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclGetCommandQueueInfo(command_queue, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Queries information about a command-queue.
	 *
	 * @param command_queue        the command-queue being queried
	 * @param param_name           the information to query. One of:<br>{@link #CL_QUEUE_CONTEXT QUEUE_CONTEXT}, {@link #CL_QUEUE_DEVICE QUEUE_DEVICE}, {@link #CL_QUEUE_REFERENCE_COUNT QUEUE_REFERENCE_COUNT}, {@link #CL_QUEUE_PROPERTIES QUEUE_PROPERTIES}, {@link CL20#CL_QUEUE_SIZE QUEUE_SIZE}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
	 *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetCommandQueueInfo(long command_queue, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetCommandQueueInfo(command_queue, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetCommandQueueInfo GetCommandQueueInfo} */
	public static int clGetCommandQueueInfo(long command_queue, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetCommandQueueInfo(command_queue, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetCommandQueueInfo GetCommandQueueInfo} */
	public static int clGetCommandQueueInfo(long command_queue, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetCommandQueueInfo(command_queue, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** LongBuffer version of: {@link #clGetCommandQueueInfo GetCommandQueueInfo} */
	public static int clGetCommandQueueInfo(long command_queue, int param_name, LongBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetCommandQueueInfo(command_queue, param_name, (param_value == null ? 0 : param_value.remaining()) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetCommandQueueInfo GetCommandQueueInfo} */
	public static int clGetCommandQueueInfo(long command_queue, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetCommandQueueInfo(command_queue, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clCreateBuffer ] ---

	/** JNI method for {@link #clCreateBuffer CreateBuffer} */
	@JavadocExclude
	public static native long nclCreateBuffer(long context, long flags, long size, long host_ptr, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateBuffer CreateBuffer} */
	@JavadocExclude
	public static long nclCreateBuffer(long context, long flags, long size, long host_ptr, long errcode_ret) {
		long __functionAddress = getInstance().CreateBuffer;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclCreateBuffer(context, flags, size, host_ptr, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a buffer object.
	 *
	 * @param context     a valid OpenCL context used to create the buffer object
	 * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
	 *                    how it will be used. If value specified for flags is 0, the default is used which is {@link #CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}, {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}, {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}, {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}, {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}, {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}
	 * @param size        the size in bytes of the buffer memory object to be allocated
	 * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
	 *                    &#x2265; {@code size} bytes.
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in flags are not valid.</li>
	 *         <li>{@link #CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if size is 0. Implementations may return {@link #CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if size is greater than
	 *         {@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} value all devices in context.</li>
	 *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if
	 *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateBuffer(long context, long flags, long size, ByteBuffer host_ptr, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( host_ptr != null ) checkBuffer(host_ptr, size);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return nclCreateBuffer(context, flags, size, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateBuffer CreateBuffer} */
	public static long clCreateBuffer(long context, long flags, long size, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateBuffer(context, flags, size, 0L, memAddressSafe(errcode_ret));
	}

	/** ByteBuffer version of: {@link #clCreateBuffer CreateBuffer} */
	public static long clCreateBuffer(long context, long flags, ByteBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateBuffer(context, flags, host_ptr.remaining(), memAddress(host_ptr), memAddressSafe(errcode_ret));
	}

	/** ShortBuffer version of: {@link #clCreateBuffer CreateBuffer} */
	public static long clCreateBuffer(long context, long flags, ShortBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateBuffer(context, flags, host_ptr.remaining() << 1, memAddress(host_ptr), memAddressSafe(errcode_ret));
	}

	/** IntBuffer version of: {@link #clCreateBuffer CreateBuffer} */
	public static long clCreateBuffer(long context, long flags, IntBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateBuffer(context, flags, host_ptr.remaining() << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
	}

	/** FloatBuffer version of: {@link #clCreateBuffer CreateBuffer} */
	public static long clCreateBuffer(long context, long flags, FloatBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateBuffer(context, flags, host_ptr.remaining() << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
	}

	/** DoubleBuffer version of: {@link #clCreateBuffer CreateBuffer} */
	public static long clCreateBuffer(long context, long flags, DoubleBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateBuffer(context, flags, host_ptr.remaining() << 3, memAddress(host_ptr), memAddressSafe(errcode_ret));
	}

	// --- [ clEnqueueReadBuffer ] ---

	/** JNI method for {@link #clEnqueueReadBuffer EnqueueReadBuffer} */
	@JavadocExclude
	public static native int nclEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueReadBuffer EnqueueReadBuffer} */
	@JavadocExclude
	public static int nclEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueReadBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(buffer);
		}
		return nclEnqueueReadBuffer(command_queue, buffer, blocking_read, offset, size, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to read from a buffer object to host memory.
	 * 
	 * <p>Calling {@code clEnqueueReadBuffer} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr + offset}, where
	 * {@code host_ptr} is a pointer to the memory region specified when the buffer object being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet
	 * the following requirements in order to avoid undefined behavior:
	 * <ul>
	 * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
	 * read command begins execution.</li>
	 * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
	 * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
	 * </ul></p>
	 *
	 * @param command_queue           the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
	 * @param buffer                  a valid buffer object
	 * @param blocking_read           indicates if the read operation is <em>blocking</em> or <em>non-blocking</em>
	 *                                
	 *                                <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadBuffer} does not return until the buffer data has been
	 *                                read and copied into memory pointed to by {@code ptr}.</p>
	 *                                
	 *                                <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBuffer} queues a non-blocking read command and
	 *                                returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
	 *                                returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
	 *                                the buffer that {@code ptr} points to can be used by the application.</p>
	 * @param offset                  the offset in bytes in the buffer object to read from
	 * @param size                    the size in bytes of data being read
	 * @param ptr                     the pointer to buffer in host memory where data is to be read into
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
	 *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
	 *         {@code size} is 0.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, long size, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(ptr, size);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueReadBuffer(command_queue, buffer, blocking_read, offset, size, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueReadBuffer EnqueueReadBuffer} */
	public static int clEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, long size, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueReadBuffer(command_queue, buffer, blocking_read, offset, size, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** ByteBuffer version of: {@link #clEnqueueReadBuffer EnqueueReadBuffer} */
	public static int clEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueReadBuffer(command_queue, buffer, blocking_read, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** ShortBuffer version of: {@link #clEnqueueReadBuffer EnqueueReadBuffer} */
	public static int clEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, ShortBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueReadBuffer(command_queue, buffer, blocking_read, offset, ptr.remaining() << 1, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** IntBuffer version of: {@link #clEnqueueReadBuffer EnqueueReadBuffer} */
	public static int clEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, IntBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueReadBuffer(command_queue, buffer, blocking_read, offset, ptr.remaining() << 2, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** FloatBuffer version of: {@link #clEnqueueReadBuffer EnqueueReadBuffer} */
	public static int clEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, FloatBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueReadBuffer(command_queue, buffer, blocking_read, offset, ptr.remaining() << 2, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** DoubleBuffer version of: {@link #clEnqueueReadBuffer EnqueueReadBuffer} */
	public static int clEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, DoubleBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueReadBuffer(command_queue, buffer, blocking_read, offset, ptr.remaining() << 3, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueWriteBuffer ] ---

	/** JNI method for {@link #clEnqueueWriteBuffer EnqueueWriteBuffer} */
	@JavadocExclude
	public static native int nclEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueWriteBuffer EnqueueWriteBuffer} */
	@JavadocExclude
	public static int nclEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueWriteBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(buffer);
		}
		return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write, offset, size, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to write to a buffer object from host memory.
	 * 
	 * <p>Calling {@code clEnqueueWriteBuffer} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
	 * {@code host_ptr + offset}, where {@code host_ptr} is a pointer to the memory region specified when the buffer object being written is created with
	 * {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:
	 * <ul>
	 * <li>The host memory region given by {@code (host_ptr + offset, cb)} contains the latest bits when the enqueued write command begins execution.</li>
	 * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
	 * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
	 * </ul></p>
	 *
	 * @param command_queue           the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
	 * @param buffer                  a valid buffer object
	 * @param blocking_write          indicates if the write operation is <em>blocking</em> or <em>non-blocking</em>
	 *                                
	 *                                <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
	 *                                command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBuffer} call returns.</p>
	 *                                
	 *                                <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a nonblocking write. As the write is non-blocking
	 *                                the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
	 *                                {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
	 *                                completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
	 * @param offset                  the offset in bytes in the buffer object to write to
	 * @param size                    the size in bytes of data being written
	 * @param ptr                     the pointer to buffer in host memory where data is to be written from
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
	 *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
	 *         {@code size} is 0.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, long size, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(ptr, size);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write, offset, size, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueWriteBuffer EnqueueWriteBuffer} */
	public static int clEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, long size, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write, offset, size, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** ByteBuffer version of: {@link #clEnqueueWriteBuffer EnqueueWriteBuffer} */
	public static int clEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** ShortBuffer version of: {@link #clEnqueueWriteBuffer EnqueueWriteBuffer} */
	public static int clEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, ShortBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write, offset, ptr.remaining() << 1, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** IntBuffer version of: {@link #clEnqueueWriteBuffer EnqueueWriteBuffer} */
	public static int clEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, IntBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write, offset, ptr.remaining() << 2, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** FloatBuffer version of: {@link #clEnqueueWriteBuffer EnqueueWriteBuffer} */
	public static int clEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, FloatBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write, offset, ptr.remaining() << 2, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** DoubleBuffer version of: {@link #clEnqueueWriteBuffer EnqueueWriteBuffer} */
	public static int clEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, DoubleBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write, offset, ptr.remaining() << 3, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueCopyBuffer ] ---

	/** JNI method for {@link #clEnqueueCopyBuffer EnqueueCopyBuffer} */
	@JavadocExclude
	public static native int nclEnqueueCopyBuffer(long command_queue, long src_buffer, long dst_buffer, long src_offset, long dst_offset, long size, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueCopyBuffer EnqueueCopyBuffer} */
	@JavadocExclude
	public static int nclEnqueueCopyBuffer(long command_queue, long src_buffer, long dst_buffer, long src_offset, long dst_offset, long size, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueCopyBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(src_buffer);
			checkPointer(dst_buffer);
		}
		return nclEnqueueCopyBuffer(command_queue, src_buffer, dst_buffer, src_offset, dst_offset, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to copy a buffer object identified by {@code src_buffer} to another buffer object identified by {@code dst_buffer}.
	 *
	 * @param command_queue           the command-queue in which the copy command will be queued. The OpenCL context associated with {@code command_queue}, {@code src_buffer} and
	 *                                {@code dst_buffer} must be the same.
	 * @param src_buffer              the source buffer
	 * @param dst_buffer              the destination buffer
	 * @param src_offset              the offset where to begin copying data from {@code src_buffer}.
	 * @param dst_offset              the offset where to begin copying data into {@code dst_buffer}
	 * @param size                    the size in bytes to copy
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_buffer} and {@code dst_buffer} are not the same or if
	 *         the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code src_buffer} and {@code dst_buffer} are not valid buffer objects.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code src_offset}, {@code dst_offset}, {@code size}, {@code src_offset + size} or {@code dst_offset + size} require
	 *         accessing elements outside the {@code src_buffer} and {@code dst_buffer} buffer objects respectively.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code size} is 0.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code src_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code dst_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link #CL_MEM_COPY_OVERLAP MEM_COPY_OVERLAP} if {@code src_buffer} and {@code dst_buffer} are the same buffer or sub-buffer object and the source and destination
	 *         regions overlap or if {@code src_buffer} and {@code dst_buffer} are different sub-buffers of the same associated buffer object and they overlap. The
	 *         regions overlap if <code style="font-family: monospace">src_offset &#x2264 dst_offset &#x2264 src_offset + size – 1</code> or if
	 *         <code style="font-family: monospace">dst_offset &#x2264 src_offset &#x2264 dst_offset + size – 1</code>.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_buffer} or {@code dst_buffer}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueCopyBuffer(long command_queue, long src_buffer, long dst_buffer, long src_offset, long dst_offset, long size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueCopyBuffer(command_queue, src_buffer, dst_buffer, src_offset, dst_offset, size, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueCopyBuffer EnqueueCopyBuffer} */
	public static int clEnqueueCopyBuffer(long command_queue, long src_buffer, long dst_buffer, long src_offset, long dst_offset, long size, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueCopyBuffer(command_queue, src_buffer, dst_buffer, src_offset, dst_offset, size, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueMapBuffer ] ---

	/** JNI method for {@link #clEnqueueMapBuffer EnqueueMapBuffer} */
	@JavadocExclude
	public static native long nclEnqueueMapBuffer(long command_queue, long buffer, int blocking_map, long map_flags, long offset, long size, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueMapBuffer EnqueueMapBuffer} */
	@JavadocExclude
	public static long nclEnqueueMapBuffer(long command_queue, long buffer, int blocking_map, long map_flags, long offset, long size, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret) {
		long __functionAddress = getInstance().EnqueueMapBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(buffer);
		}
		return nclEnqueueMapBuffer(command_queue, buffer, blocking_map, map_flags, offset, size, num_events_in_wait_list, event_wait_list, event, errcode_ret, __functionAddress);
	}

	/**
	 * Enqueues a command to map a region of the buffer object given by buffer into the host address space and returns a pointer to this mapped region.
	 * 
	 * <p>The pointer returned maps a region starting at {@code offset} and is at least {@code size} bytes in size. The result of a memory access outside this
	 * region is undefined.</p>
	 * 
	 * <p>If the buffer object is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in {@code mem_flags}, the following will be true:
	 * <ul>
	 * <li>The {@code host_ptr} specified in {@link #clCreateBuffer CreateBuffer} is guaranteed to contain the latest bits in the region being mapped when the
	 * {@code clEnqueueMapBuffer} command has completed.</li>
	 * <li>The pointer value returned by {@code clEnqueueMapBuffer} will be derived from the {@code host_ptr} specified when the buffer object is created.</li>
	 * </ul></p>
	 * 
	 * <p>Mapped buffer objects are unmapped using {@link #clEnqueueUnmapMemObject EnqueueUnmapMemObject}.</p>
	 *
	 * @param command_queue           a valid command-queue
	 * @param buffer                  a valid buffer object. The OpenCL context associated with command_queue and buffer must be the same.
	 * @param blocking_map            indicates if the map operation is blocking or non-blocking.
	 *                                
	 *                                <p>If {@code blocking_map} is {@link #CL_TRUE TRUE}, {@code clEnqueueMapBuffer} does not return until the specified region in buffer is mapped into the host address
	 *                                space and the application can access the contents of the mapped region using the pointer returned by {@code clEnqueueMapBuffer}.</p>
	 *                                
	 *                                <p>If {@code blocking_map} is {@link #CL_FALSE FALSE} i.e. map operation is non-blocking, the pointer to the mapped region returned by {@code clEnqueueMapBuffer}
	 *                                cannot be used until the map command has completed. The {@code event} argument returns an event object which can be used to query the execution
	 *                                status of the map command. When the map command is completed, the application can access the contents of the mapped region using the pointer
	 *                                returned by {@code clEnqueueMapBuffer}.</p>
	 * @param map_flags               a bit-field. One of:<br>{@link #CL_MAP_READ MAP_READ}, {@link #CL_MAP_WRITE MAP_WRITE}, {@link CL12#CL_MAP_WRITE_INVALIDATE_REGION MAP_WRITE_INVALIDATE_REGION}
	 * @param offset                  the offset in bytes of the region in the buffer object that is being mapped
	 * @param size                    the size in bytes of the region in the buffer object that is being mapped
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 * @param errcode_ret             will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a pointer to the mapped region. The {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS}. A {@code NULL} pointer is returned otherwise with one of the following error values
	 *         returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated with
	 *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if region being mapped given by {@code (offset, size)} is out of bounds or if {@code size} is 0 or if values specified in
	 *         {@code map_flags} are not valid.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link #CL_MAP_FAILURE MAP_FAILURE} if there is a failure to map the requested region into the host address space. This error cannot occur for buffer objects
	 *         created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}.</li>
	 *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the map operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if buffer has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and
	 *         {@link #CL_MAP_READ MAP_READ} is set in {@code map_flags} or if {@code buffer} has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and {@link #CL_MAP_WRITE MAP_WRITE} or {@link CL12#CL_MAP_WRITE_INVALIDATE_REGION MAP_WRITE_INVALIDATE_REGION} is set in {@code map_flags}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static ByteBuffer clEnqueueMapBuffer(long command_queue, long buffer, int blocking_map, long map_flags, long offset, long size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		long __result = nclEnqueueMapBuffer(command_queue, buffer, blocking_map, map_flags, offset, size, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret));
		return memByteBuffer(__result, (int)size);
	}

	/** Alternative version of: {@link #clEnqueueMapBuffer EnqueueMapBuffer} */
	public static ByteBuffer clEnqueueMapBuffer(long command_queue, long buffer, int blocking_map, long map_flags, long offset, long size, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret, ByteBuffer old_buffer) {
		if ( LWJGLUtil.CHECKS ) {
			if ( event != null ) checkBuffer(event, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long __result = nclEnqueueMapBuffer(command_queue, buffer, blocking_map, map_flags, offset, size, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret));
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == size ? old_buffer : memByteBuffer(__result, (int)size);
	}

	// --- [ clCreateImage2D ] ---

	/** JNI method for {@link #clCreateImage2D CreateImage2D} */
	@JavadocExclude
	public static native long nclCreateImage2D(long context, long flags, long image_format, long image_width, long image_height, long image_row_pitch, long host_ptr, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateImage2D CreateImage2D} */
	@JavadocExclude
	public static long nclCreateImage2D(long context, long flags, long image_format, long image_width, long image_height, long image_row_pitch, long host_ptr, long errcode_ret) {
		long __functionAddress = getInstance().CreateImage2D;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclCreateImage2D(context, flags, image_format, image_width, image_height, image_row_pitch, host_ptr, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a 2D image object.
	 *
	 * @param context         a valid OpenCL context on which the image object is to be created
	 * @param flags           a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}, {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}, {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}, {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}, {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}, {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}
	 * @param image_format    a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
	 * @param image_width     the width of the image in pixels
	 * @param image_height    the height of the image in pixels
	 * @param image_row_pitch the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
	 *                        bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
	 *                        {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
	 * @param host_ptr        a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
	 *                        {@code image_row_pitch * image_height}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
	 *                        stored as a linear sequence of adjacent scanlines. Each scanline is stored as a linear sequence of image elements.
	 * @param errcode_ret     will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
	 *         <li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if {@code image_width} or {@code image_height} are 0 or if they exceed values specified in
	 *         {@link #CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH} or {@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT DEVICE_IMAGE2D_MAX_HEIGHT} respectively for all devices in {@code context} or if values specified
	 *         by {@code image_row_pitch} do not follow rules described in the argument description.</li>
	 *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if
	 *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
	 *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE FALSE}).</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateImage2D(long context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, ByteBuffer host_ptr, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(image_format, CLImageFormat.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return nclCreateImage2D(context, flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateImage2D CreateImage2D} */
	public static long clCreateImage2D(long context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, ByteBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(image_format, CLImageFormat.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateImage2D(context, flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
	}

	/** ShortBuffer version of: {@link #clCreateImage2D CreateImage2D} */
	public static long clCreateImage2D(long context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, ShortBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(image_format, CLImageFormat.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateImage2D(context, flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
	}

	/** IntBuffer version of: {@link #clCreateImage2D CreateImage2D} */
	public static long clCreateImage2D(long context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, IntBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(image_format, CLImageFormat.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateImage2D(context, flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
	}

	/** FloatBuffer version of: {@link #clCreateImage2D CreateImage2D} */
	public static long clCreateImage2D(long context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, FloatBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(image_format, CLImageFormat.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateImage2D(context, flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
	}

	// --- [ clCreateImage3D ] ---

	/** JNI method for {@link #clCreateImage3D CreateImage3D} */
	@JavadocExclude
	public static native long nclCreateImage3D(long context, long flags, long image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, long host_ptr, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateImage3D CreateImage3D} */
	@JavadocExclude
	public static long nclCreateImage3D(long context, long flags, long image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, long host_ptr, long errcode_ret) {
		long __functionAddress = getInstance().CreateImage3D;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclCreateImage3D(context, flags, image_format, image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, host_ptr, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a 3D image object.
	 *
	 * @param context           a valid OpenCL context on which the image object is to be created
	 * @param flags             a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}, {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}, {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}, {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}, {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}, {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}
	 * @param image_format      a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
	 * @param image_width       the width of the image in pixels
	 * @param image_height      the height of the image in pixels
	 * @param image_depth       the depth of the image in pixels. This must be a value &gt; 1.
	 * @param image_row_pitch   the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
	 *                          bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
	 *                          {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
	 * @param image_slice_pitch the size in bytes of each 2D slice in the 3D image. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265;
	 *                          {@code image_row_pitch * image_height} if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_slice_pitch = 0},
	 *                          {@code image_slice_pitch} is calculated as {@code image_row_pitch * image_height}. If {@code image_slice_pitch} is not 0, it must be a multiple of
	 *                          the {@code image_row_pitch}.
	 * @param host_ptr          a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
	 *                          {@code image_slice_pitch * image_depth}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
	 *                          stored as a linear sequence of adjacent 2D slices. Each 2D slice is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
	 *                          image elements.
	 * @param errcode_ret       will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
	 *         <li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if {@code image_width}, {@code image_height} are 0 or if {@code image_depth} &#x2264; 1 or if they exceed values
	 *         specified in {@link #CL_DEVICE_IMAGE3D_MAX_WIDTH DEVICE_IMAGE3D_MAX_WIDTH}, {@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT DEVICE_IMAGE3D_MAX_HEIGHT} or {@link #CL_DEVICE_IMAGE3D_MAX_DEPTH DEVICE_IMAGE3D_MAX_DEPTH} respectively for
	 *         all devices in {@code context} or if values specified by {@code image_row_pitch} and {@code image_slice_pitch} do not follow rules described in the
	 *         argument descriptions.</li>
	 *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if
	 *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
	 *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE FALSE}).</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateImage3D(long context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, ByteBuffer host_ptr, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(image_format, CLImageFormat.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return nclCreateImage3D(context, flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateImage3D CreateImage3D} */
	public static long clCreateImage3D(long context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, ByteBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(image_format, CLImageFormat.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateImage3D(context, flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
	}

	/** ShortBuffer version of: {@link #clCreateImage3D CreateImage3D} */
	public static long clCreateImage3D(long context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, ShortBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(image_format, CLImageFormat.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateImage3D(context, flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
	}

	/** IntBuffer version of: {@link #clCreateImage3D CreateImage3D} */
	public static long clCreateImage3D(long context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, IntBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(image_format, CLImageFormat.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateImage3D(context, flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
	}

	/** FloatBuffer version of: {@link #clCreateImage3D CreateImage3D} */
	public static long clCreateImage3D(long context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, FloatBuffer host_ptr, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(image_format, CLImageFormat.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateImage3D(context, flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
	}

	// --- [ clGetSupportedImageFormats ] ---

	/** JNI method for {@link #clGetSupportedImageFormats GetSupportedImageFormats} */
	@JavadocExclude
	public static native int nclGetSupportedImageFormats(long context, long flags, int image_type, int num_entries, long image_formats, long num_image_formats, long __functionAddress);

	/** Unsafe version of {@link #clGetSupportedImageFormats GetSupportedImageFormats} */
	@JavadocExclude
	public static int nclGetSupportedImageFormats(long context, long flags, int image_type, int num_entries, long image_formats, long num_image_formats) {
		long __functionAddress = getInstance().GetSupportedImageFormats;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclGetSupportedImageFormats(context, flags, image_type, num_entries, image_formats, num_image_formats, __functionAddress);
	}

	/**
	 * Can be used to get the list of image formats supported by an OpenCL implementation when the following information about an image memory object is
	 * specified:
	 * <ul>
	 * <li>Context</li>
	 * <li>Image type – 1D, 2D, or 3D image, 1D image buffer, 1D or 2D image array</li>
	 * <li>Image object allocation information</li>
	 * </ul>
	 * 
	 * <p>{@code clGetSupportedImageFormats} returns a union of image formats supported by all devices in the context.</p>
	 *
	 * @param context           a valid OpenCL context on which the image object(s) will be created
	 * @param flags             a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}, {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}, {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}, {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}, {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}, {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}
	 * @param image_type        the image type. One of:<br>{@link CL12#CL_MEM_OBJECT_IMAGE1D MEM_OBJECT_IMAGE1D}, {@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}, {@link #CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}, {@link #CL_MEM_OBJECT_IMAGE3D MEM_OBJECT_IMAGE3D}, {@link CL12#CL_MEM_OBJECT_IMAGE1D_ARRAY MEM_OBJECT_IMAGE1D_ARRAY}, {@link CL12#CL_MEM_OBJECT_IMAGE2D_ARRAY MEM_OBJECT_IMAGE2D_ARRAY}
	 * @param num_entries       the number of entries that can be returned in the memory location given by {@code image_formats}
	 * @param image_formats     a pointer to a memory location where the list of supported image formats are returned. Each entry describes a {@link CLImageFormat} structure
	 *                          supported by the OpenCL implementation. If {@code image_formats} is {@code NULL}, it is ignored.
	 * @param num_image_formats the actual number of supported image formats for a specific context and values specified by {@code flags}. If {@code num_image_formats} is {@code NULL}, it
	 *                          is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code flags} or {@code image_type} are not valid, or if {@code num_entries} is 0 and {@code image_formats} is not {@code NULL}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetSupportedImageFormats(long context, long flags, int image_type, int num_entries, ByteBuffer image_formats, ByteBuffer num_image_formats) {
		if ( LWJGLUtil.CHECKS ) {
			if ( image_formats != null ) checkBuffer(image_formats, num_entries * CLImageFormat.SIZEOF);
			if ( num_image_formats != null ) checkBuffer(num_image_formats, 1 << 2);
		}
		return nclGetSupportedImageFormats(context, flags, image_type, num_entries, memAddressSafe(image_formats), memAddressSafe(num_image_formats));
	}

	/** Alternative version of: {@link #clGetSupportedImageFormats GetSupportedImageFormats} */
	public static int clGetSupportedImageFormats(long context, long flags, int image_type, ByteBuffer image_formats, IntBuffer num_image_formats) {
		if ( LWJGLUtil.CHECKS )
			if ( num_image_formats != null ) checkBuffer(num_image_formats, 1);
		return nclGetSupportedImageFormats(context, flags, image_type, image_formats == null ? 0 : image_formats.remaining() / CLImageFormat.SIZEOF, memAddressSafe(image_formats), memAddressSafe(num_image_formats));
	}

	// --- [ clEnqueueReadImage ] ---

	/** JNI method for {@link #clEnqueueReadImage EnqueueReadImage} */
	@JavadocExclude
	public static native int nclEnqueueReadImage(long command_queue, long image, int blocking_read, long origin, long region, long row_pitch, long slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueReadImage EnqueueReadImage} */
	@JavadocExclude
	public static int nclEnqueueReadImage(long command_queue, long image, int blocking_read, long origin, long region, long row_pitch, long slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueReadImage;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(image);
		}
		return nclEnqueueReadImage(command_queue, image, blocking_read, origin, region, row_pitch, slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to read from an image or image array object to host memory.
	 * 
	 * <p>Calling {@code clEnqueueReadImage} to read a region of the image with the {@code ptr} argument value set to
	 * <code style="font-family: monospace">host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)</code>, where {@code host_ptr} is a pointer
	 * to the memory region specified when the image being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to
	 * avoid undefined behavior:
	 * <ul>
	 * <li>All commands that use this image object have finished execution before the read command begins execution.</li>
	 * <li>The row_pitch and slice_pitch argument values in clEnqueueReadImage must be set to the image row pitch and slice pitch.</li>
	 * <li>The image object is not mapped.</li>
	 * <li>The image object is not used by any command-queue until the read command has finished execution.</li>
	 * </ul></p>
	 *
	 * @param command_queue           the command-queue in which the read command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
	 * @param image                   a valid image or image array object
	 * @param blocking_read           indicates if the read operation is blocking or non-blocking.
	 *                                
	 *                                <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadImage} does not return until the buffer data has
	 *                                been read and copied into memory pointed to by {@code ptr}.</p>
	 *                                
	 *                                <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadImage} queues a non-blocking read command
	 *                                and returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
	 *                                returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
	 *                                the buffer that {@code ptr} points to can be used by the application.</p>
	 * @param origin                  defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
	 *                                is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
	 *                                {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
	 *                                {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
	 * @param region                  defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
	 *                                the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
	 *                                {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
	 *                                {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
	 * @param row_pitch               the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code row_pitch} is set
	 *                                to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
	 * @param slice_pitch             the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being read. This must be 0 if {@code image}
	 *                                is a 1D or 2D image. This value must be greater than or equal to {@code row_pitch * height}. If {@code slice_pitch} is set to 0, the appropriate
	 *                                slice pitch is calculated based on the {@code row_pitch * height}.
	 * @param ptr                     the pointer to a buffer in host memory where image data is to be read from
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
	 *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
	 *         {@code NULL} value.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
	 *         {@code origin} and {@code region}.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
	 *         supported by device associated with queue.</li>
	 *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
	 *         with queue.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE FALSE}).</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
	 *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueReadImage(long command_queue, long image, int blocking_read, ByteBuffer origin, ByteBuffer region, long row_pitch, long slice_pitch, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3 << POINTER_SHIFT);
			checkBuffer(region, 3 << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueReadImage(command_queue, image, blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueReadImage EnqueueReadImage} */
	public static int clEnqueueReadImage(long command_queue, long image, int blocking_read, PointerBuffer origin, PointerBuffer region, long row_pitch, long slice_pitch, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadImage(command_queue, image, blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** ShortBuffer version of: {@link #clEnqueueReadImage EnqueueReadImage} */
	public static int clEnqueueReadImage(long command_queue, long image, int blocking_read, PointerBuffer origin, PointerBuffer region, long row_pitch, long slice_pitch, ShortBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadImage(command_queue, image, blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** IntBuffer version of: {@link #clEnqueueReadImage EnqueueReadImage} */
	public static int clEnqueueReadImage(long command_queue, long image, int blocking_read, PointerBuffer origin, PointerBuffer region, long row_pitch, long slice_pitch, IntBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadImage(command_queue, image, blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** FloatBuffer version of: {@link #clEnqueueReadImage EnqueueReadImage} */
	public static int clEnqueueReadImage(long command_queue, long image, int blocking_read, PointerBuffer origin, PointerBuffer region, long row_pitch, long slice_pitch, FloatBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadImage(command_queue, image, blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** DoubleBuffer version of: {@link #clEnqueueReadImage EnqueueReadImage} */
	public static int clEnqueueReadImage(long command_queue, long image, int blocking_read, PointerBuffer origin, PointerBuffer region, long row_pitch, long slice_pitch, DoubleBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadImage(command_queue, image, blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueWriteImage ] ---

	/** JNI method for {@link #clEnqueueWriteImage EnqueueWriteImage} */
	@JavadocExclude
	public static native int nclEnqueueWriteImage(long command_queue, long image, int blocking_write, long origin, long region, long input_row_pitch, long input_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueWriteImage EnqueueWriteImage} */
	@JavadocExclude
	public static int nclEnqueueWriteImage(long command_queue, long image, int blocking_write, long origin, long region, long input_row_pitch, long input_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueWriteImage;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(image);
		}
		return nclEnqueueWriteImage(command_queue, image, blocking_write, origin, region, input_row_pitch, input_slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to write to an image or image array object from host memory.
	 * 
	 * <p>Calling {@code clEnqueueWriteImage} to update the latest bits in a region of the image with the {@code ptr} argument value set to
	 * <code style="font-family: monospace">host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)</code>, where {@code host_ptr} is a pointer
	 * to the memory region specified when the image being written is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order
	 * to avoid undefined behavior:
	 * <ul>
	 * <li>The host memory region being written contains the latest bits when the enqueued write command begins execution.</li>
	 * <li>The input_row_pitch and input_slice_pitch argument values in clEnqueueWriteImage must be set to the image row pitch and slice pitch.</li>
	 * <li>The image object is not mapped.</li>
	 * <li>The image object is not used by any command-queue until the write command has finished execution.</li>
	 * </ul></p>
	 *
	 * @param command_queue           the command-queue in which the write command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
	 * @param image                   a valid image or image array object
	 * @param blocking_write          indicates if the read operation is blocking or non-blocking.
	 *                                
	 *                                <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write command in the
	 *                                command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteImage} call returns.</p>
	 *                                
	 *                                <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
	 *                                the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
	 *                                {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
	 *                                completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
	 * @param origin                  defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
	 *                                is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
	 *                                {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
	 *                                {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
	 * @param region                  defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
	 *                                the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
	 *                                {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
	 *                                {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
	 * @param input_row_pitch         the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code input_row_pitch} is set
	 *                                to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
	 * @param input_slice_pitch       the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being written. This must be 0 if {@code image}
	 *                                is a 1D or 2D image. This value must be greater than or equal to {@code input_row_pitch * height}. If {@code input_slice_pitch} is set to 0, the appropriate
	 *                                slice pitch is calculated based on the {@code input_row_pitch * height}.
	 * @param ptr                     the pointer to a buffer in host memory where image data is to be written to
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
	 *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
	 *         {@code NULL} value.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
	 *         {@code origin} and {@code region}.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
	 *         supported by device associated with queue.</li>
	 *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
	 *         with queue.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE FALSE}).</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
	 *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueWriteImage(long command_queue, long image, int blocking_write, ByteBuffer origin, ByteBuffer region, long input_row_pitch, long input_slice_pitch, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3 << POINTER_SHIFT);
			checkBuffer(region, 3 << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueWriteImage(command_queue, image, blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueWriteImage EnqueueWriteImage} */
	public static int clEnqueueWriteImage(long command_queue, long image, int blocking_write, PointerBuffer origin, PointerBuffer region, long input_row_pitch, long input_slice_pitch, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteImage(command_queue, image, blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** ShortBuffer version of: {@link #clEnqueueWriteImage EnqueueWriteImage} */
	public static int clEnqueueWriteImage(long command_queue, long image, int blocking_write, PointerBuffer origin, PointerBuffer region, long input_row_pitch, long input_slice_pitch, ShortBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteImage(command_queue, image, blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** IntBuffer version of: {@link #clEnqueueWriteImage EnqueueWriteImage} */
	public static int clEnqueueWriteImage(long command_queue, long image, int blocking_write, PointerBuffer origin, PointerBuffer region, long input_row_pitch, long input_slice_pitch, IntBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteImage(command_queue, image, blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** FloatBuffer version of: {@link #clEnqueueWriteImage EnqueueWriteImage} */
	public static int clEnqueueWriteImage(long command_queue, long image, int blocking_write, PointerBuffer origin, PointerBuffer region, long input_row_pitch, long input_slice_pitch, FloatBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteImage(command_queue, image, blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** DoubleBuffer version of: {@link #clEnqueueWriteImage EnqueueWriteImage} */
	public static int clEnqueueWriteImage(long command_queue, long image, int blocking_write, PointerBuffer origin, PointerBuffer region, long input_row_pitch, long input_slice_pitch, DoubleBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteImage(command_queue, image, blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueCopyImage ] ---

	/** JNI method for {@link #clEnqueueCopyImage EnqueueCopyImage} */
	@JavadocExclude
	public static native int nclEnqueueCopyImage(long command_queue, long src_image, long dst_image, long src_origin, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueCopyImage EnqueueCopyImage} */
	@JavadocExclude
	public static int nclEnqueueCopyImage(long command_queue, long src_image, long dst_image, long src_origin, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueCopyImage;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(src_image);
			checkPointer(dst_image);
		}
		return nclEnqueueCopyImage(command_queue, src_image, dst_image, src_origin, dst_origin, region, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to copy image objects. {@code src_image} and {@code dst_image} can be 1D, 2D, 3D image or a 1D, 2D image array objects allowing us to
	 * perform the following actions:
	 * <ul>
	 * <li>Copy a 1D image object to a 1D image object.</li>
	 * <li>Copy a 1D image object to a scanline of a 2D image object and vice-versa.</li>
	 * <li>Copy a 1D image object to a scanline of a 2D slice of a 3D image object and vice-versa.</li>
	 * <li>Copy a 1D image object to a scanline of a specific image index of a 1D or 2D image array object and vice-versa.</li>
	 * <li>Copy a 2D image object to a 2D image object.</li>
	 * <li>Copy a 2D image object to a 2D slice of a 3D image object and vice-versa.</li>
	 * <li>Copy a 2D image object to a specific image index of a 2D image array object and vice-versa.</li>
	 * <li>Copy images from a 1D image array object to a 1D image array object.</li>
	 * <li>Copy images from a 2D image array object to a 2D image array object.</li>
	 * <li>Copy a 3D image object to a 3D image object.</li>
	 * </ul>
	 *
	 * @param command_queue           the command-queue in which the copy command will be queued. The OpenCL context associated with {@code command_queue}, {@code src_image} and
	 *                                {@code dst_image} must be the same.
	 * @param src_image               
	 * @param dst_image               
	 * @param src_origin              the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code src_image} is a 2D image object, {@code src_origin[2]} must be 0. If
	 *                                {@code src_image} is a 1D image object, {@code src_origin[1]} and {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object,
	 *                                {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object, {@code src_origin[1]} describes the image index in the 1D image
	 *                                array. If {@code src_image} is a 2D image array object, {@code src_origin[2]} describes the image index in the 2D image array.
	 * @param dst_origin              the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code dst_image} is a 2D image object, {@code dst_origin[2]} must be 0. If
	 *                                {@code dst_image} is a 1D image or 1D image buffer object, {@code dst_origin[1]} and {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D
	 *                                image array object, {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D image array object, {@code dst_origin[1]} describes the image
	 *                                index in the 1D image array. If {@code dst_image} is a 2D image array object, {@code dst_origin[2]} describes the image index in the 2D image array.
	 * @param region                  the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
	 *                                of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
	 *                                {@code src_image} or {@code dst_image} is a 2D image object, {@code region[2]} must be 1. If {@code src_image} or {@code dst_image} is a 1D image or
	 *                                1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If {@code src_image} or {@code dst_image} is a 1D image array object,
	 *                                {@code region[2]} must be 1. The values in {@code region} cannot be 0.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_image} and {@code dst_image} are not the same or if the
	 *         context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code src_image} and {@code dst_image} are not valid image objects.</li>
	 *         <li>{@link #CL_IMAGE_FORMAT_MISMATCH IMAGE_FORMAT_MISMATCH} if {@code src_image} and {@code dst_image} do not use the same image format.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the 2D or 3D rectangular region specified by {@code src_origin} and {@code src_origin + region} refers to a region
	 *         outside {@code src_image}, or if the 2D or 3D rectangular region specified by {@code dst_origin} and {@code dst_origin + region} refers to a region
	 *         outside {@code dst_image}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code src_origin}, {@code dst_origin} and {@code region} do not follow rules described in the argument
	 *         description for {@code src_origin}, {@code dst_origin} and {@code region}.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code src_image} or
	 *         {@code dst_image} are not supported by device associated with queue.</li>
	 *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code src_image} or {@code dst_image} are not
	 *         supported by device associated with queue.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_image} or {@code dst_image}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE FALSE}).</li>
	 *         <li>{@link #CL_MEM_COPY_OVERLAP MEM_COPY_OVERLAP} if {@code src_image} and {@code dst_image} are the same image object and the source and destination regions overlap.</li>
	 *         </ul>
	 */
	public static int clEnqueueCopyImage(long command_queue, long src_image, long dst_image, ByteBuffer src_origin, ByteBuffer dst_origin, ByteBuffer region, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(src_origin, 3 << POINTER_SHIFT);
			checkBuffer(dst_origin, 3 << POINTER_SHIFT);
			checkBuffer(region, 3 << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueCopyImage(command_queue, src_image, dst_image, memAddress(src_origin), memAddress(dst_origin), memAddress(region), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueCopyImage EnqueueCopyImage} */
	public static int clEnqueueCopyImage(long command_queue, long src_image, long dst_image, PointerBuffer src_origin, PointerBuffer dst_origin, PointerBuffer region, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(src_origin, 3);
			checkBuffer(dst_origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyImage(command_queue, src_image, dst_image, memAddress(src_origin), memAddress(dst_origin), memAddress(region), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueCopyImageToBuffer ] ---

	/** JNI method for {@link #clEnqueueCopyImageToBuffer EnqueueCopyImageToBuffer} */
	@JavadocExclude
	public static native int nclEnqueueCopyImageToBuffer(long command_queue, long src_image, long dst_buffer, long src_origin, long region, long dst_offset, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueCopyImageToBuffer EnqueueCopyImageToBuffer} */
	@JavadocExclude
	public static int nclEnqueueCopyImageToBuffer(long command_queue, long src_image, long dst_buffer, long src_origin, long region, long dst_offset, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueCopyImageToBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(src_image);
			checkPointer(dst_buffer);
		}
		return nclEnqueueCopyImageToBuffer(command_queue, src_image, dst_buffer, src_origin, region, dst_offset, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to copy an image object to a buffer object.
	 *
	 * @param command_queue           a valid command-queue. The OpenCL context associated with {@code command_queue}, {@code src_image} and {@code dst_buffer} must be the same.
	 * @param src_image               a valid image object
	 * @param dst_buffer              a valid buffer object
	 * @param src_origin              the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code src_image} is a 2D image object, {@code src_origin[2]} must be 0. If
	 *                                {@code src_image} is a 1D image object, {@code src_origin[1]} and {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object,
	 *                                {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object, {@code src_origin[1]} describes the image index in the 1D image
	 *                                array. If {@code src_image} is a 2D image array object, {@code src_origin[2]} describes the image index in the 2D image array.
	 * @param region                  the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
	 *                                of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
	 *                                {@code src_image} is a 2D image object, {@code region[2]} must be 1. If {@code src_image} is a 1D image or 1D image buffer object, {@code region[1]}
	 *                                and {@code region[2]} must be 1. If {@code src_image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot
	 *                                be 0.
	 * @param dst_offset              the offset where to begin copying data into {@code dst_buffer}. The size in bytes of the region to be copied referred to as {@code dst_cb} is
	 *                                computed as <code style="font-family: monospace">width * height * depth * bytes/image element</code> if {@code src_image} is a 3D image object, is computed as
	 *                                <code style="font-family: monospace">width * height * bytes/image element</code> if {@code src_image} is a 2D image, is computed as
	 *                                <code style="font-family: monospace">width * height * arraysize * bytes/image element</code> if {@code src_image} is a 2D image array object, is computed as
	 *                                <code style="font-family: monospace">width * bytes/image element</code> if {@code src_image} is a 1D image or 1D image buffer object and is computed as
	 *                                <code style="font-family: monospace">width * arraysize * bytes/image element</code> if {@code src_image} is a 1D image array object.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_image} and {@code dst_buffer} are not the same or if
	 *         the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code src_image} is not a valid image object or {@code dst_buffer} is not a valid buffer object or if
	 *         {@code src_image} is a 1D image buffer object created from {@code dst_buffer}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the 1D, 2D or 3D rectangular region specified by {@code src_origin} and {@code src_origin + region} refers to a region
	 *         outside {@code src_image}, or if the region specified by {@code dst_offset} and {@code dst_offset + dst_cb} to a region outside {@code dst_buffer}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code src_origin} and region do not follow rules described in the argument description for
	 *         {@code src_origin} and {@code region}.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code dst_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code src_image} are not
	 *         supported by device associated with queue.</li>
	 *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code src_image} are not supported by device
	 *         associated with queue.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_image} or {@code dst_buffer}.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE FALSE}).</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueCopyImageToBuffer(long command_queue, long src_image, long dst_buffer, ByteBuffer src_origin, ByteBuffer region, long dst_offset, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(src_origin, 3 << POINTER_SHIFT);
			checkBuffer(region, 3 << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueCopyImageToBuffer(command_queue, src_image, dst_buffer, memAddress(src_origin), memAddress(region), dst_offset, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueCopyImageToBuffer EnqueueCopyImageToBuffer} */
	public static int clEnqueueCopyImageToBuffer(long command_queue, long src_image, long dst_buffer, PointerBuffer src_origin, PointerBuffer region, long dst_offset, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(src_origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyImageToBuffer(command_queue, src_image, dst_buffer, memAddress(src_origin), memAddress(region), dst_offset, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueCopyBufferToImage ] ---

	/** JNI method for {@link #clEnqueueCopyBufferToImage EnqueueCopyBufferToImage} */
	@JavadocExclude
	public static native int nclEnqueueCopyBufferToImage(long command_queue, long src_buffer, long dst_image, long src_offset, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueCopyBufferToImage EnqueueCopyBufferToImage} */
	@JavadocExclude
	public static int nclEnqueueCopyBufferToImage(long command_queue, long src_buffer, long dst_image, long src_offset, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueCopyBufferToImage;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(src_buffer);
			checkPointer(dst_image);
		}
		return nclEnqueueCopyBufferToImage(command_queue, src_buffer, dst_image, src_offset, dst_origin, region, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to copy a buffer object to an image object.
	 *
	 * @param command_queue           a valid command-queue. The OpenCL context associated with {@code command_queue}, {@code src_buffer} and {@code dst_image} must be the same.
	 * @param src_buffer              a valid buffer object
	 * @param dst_image               a valid image object
	 * @param src_offset              the offset where to begin copying data from {@code src_buffer}
	 * @param dst_origin              the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code dst_image} is a 2D image object, {@code dst_origin[2]} must be 0. If
	 *                                {@code dst_image} is a 1D image or 1D image buffer object, {@code dst_origin[1]} and {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D
	 *                                image array object, {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D image array object, {@code dst_origin[1]} describes the image
	 *                                index in the 1D image array. If {@code dst_image} is a 2D image array object, {@code dst_origin[2]} describes the image index in the 2D image array.
	 * @param region                  the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
	 *                                of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
	 *                                {@code dst_image} is a 2D image object, {@code region[2]} must be 1. If {@code dst_image} is a 1D image or
	 *                                1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If {@code dst_image} is a 1D image array object,
	 *                                {@code region[2]} must be 1. The values in {@code region} cannot be 0.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_buffer} and {@code dst_image} are not the same or if
	 *         the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code src_buffer} is not a valid buffer object or {@code dst_image} is not a valid image object or if
	 *         {@code dst_image} is a 1D image buffer object created from {@code src_buffer}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the 1D, 2D or 3D rectangular region specified by {@code dst_origin} and {@code dst_origin + region} refer to a region
	 *         outside {@code dst_image}, or if the region specified by {@code src_offset} and {@code src_offset + src_cb refer} to a region outside
	 *         {@code src_buffer}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code dst_origin} and {@code region} do not follow rules described in the argument description for
	 *         {@code dst_origin} and {@code region}.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code src_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code dst_image} are not
	 *         supported by device associated with queue.</li>
	 *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code dst_image} are not supported by device
	 *         associated with queue.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_buffer} or {@code dst_image}.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE FALSE}).</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueCopyBufferToImage(long command_queue, long src_buffer, long dst_image, long src_offset, ByteBuffer dst_origin, ByteBuffer region, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(dst_origin, 3 << POINTER_SHIFT);
			checkBuffer(region, 3 << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueCopyBufferToImage(command_queue, src_buffer, dst_image, src_offset, memAddress(dst_origin), memAddress(region), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueCopyBufferToImage EnqueueCopyBufferToImage} */
	public static int clEnqueueCopyBufferToImage(long command_queue, long src_buffer, long dst_image, long src_offset, PointerBuffer dst_origin, PointerBuffer region, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(dst_origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyBufferToImage(command_queue, src_buffer, dst_image, src_offset, memAddress(dst_origin), memAddress(region), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueMapImage ] ---

	/** JNI method for {@link #clEnqueueMapImage EnqueueMapImage} */
	@JavadocExclude
	public static native long nclEnqueueMapImage(long command_queue, long image, int blocking_map, long map_flags, long origin, long region, long image_row_pitch, long image_slice_pitch, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueMapImage EnqueueMapImage} */
	@JavadocExclude
	public static long nclEnqueueMapImage(long command_queue, long image, int blocking_map, long map_flags, long origin, long region, long image_row_pitch, long image_slice_pitch, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret) {
		long __functionAddress = getInstance().EnqueueMapImage;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(image);
		}
		return nclEnqueueMapImage(command_queue, image, blocking_map, map_flags, origin, region, image_row_pitch, image_slice_pitch, num_events_in_wait_list, event_wait_list, event, errcode_ret, __functionAddress);
	}

	/**
	 * Enqueues a command to map a region in the image object given by {@code image} into the host address space and returns a pointer to this mapped region.
	 * 
	 * <p>The pointer returned maps a 1D, 2D or 3D region starting at {@code origin} and is at least {@code region[0]} pixels in size for a 1D image, 1D image
	 * buffer or 1D image array, {@code (image_row_pitch * region[1])} pixels in size for a 2D image or 2D image array, and
	 * {@code (image_slice_pitch * region[2])} pixels in size for a 3D image. The result of a memory access outside this region is undefined.</p>
	 * 
	 * <p>If the image object is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in {@code mem_flags}, the following will be true:
	 * <ul>
	 * <li>The {@code host_ptr} specified in {@link CL12#clCreateImage CreateImage} is guaranteed to contain the latest bits in the region being mapped when the
	 * {@code clEnqueueMapImage} command has completed.</li>
	 * <li>The pointer value returned by {@code clEnqueueMapImage} will be derived from the {@code host_ptr} specified when the image object is created.</li>
	 * </ul>
	 * Mapped image objects are unmapped using {@link #clEnqueueUnmapMemObject EnqueueUnmapMemObject}.</p>
	 *
	 * @param command_queue           a valid command-queue
	 * @param image                   a valid image object. The OpenCL context associated with {@code command_queue} and {@code image} must be the same.
	 * @param blocking_map            indicates if the map operation is blocking or non-blocking.
	 *                                
	 *                                <p>If {@code blocking_map} is {@link #CL_TRUE TRUE}, {@code clEnqueueMapImage} does not return until the specified region in image is mapped into the host address
	 *                                space and the application can access the contents of the mapped region using the pointer returned by {@code clEnqueueMapImage}.</p>
	 *                                
	 *                                <p>If {@code blocking_map} is {@link #CL_FALSE FALSE} i.e. map operation is non-blocking, the pointer to the mapped region returned by {@code clEnqueueMapImage}
	 *                                cannot be used until the map command has completed. The {@code event} argument returns an event object which can be used to query the execution
	 *                                status of the map command. When the map command is completed, the application can access the contents of the mapped region using the pointer
	 *                                returned by {@code clEnqueueMapImage}.</p>
	 * @param map_flags               a bit-field. One of:<br>{@link #CL_MAP_READ MAP_READ}, {@link #CL_MAP_WRITE MAP_WRITE}, {@link CL12#CL_MAP_WRITE_INVALIDATE_REGION MAP_WRITE_INVALIDATE_REGION}
	 * @param origin                  the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
	 *                                is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
	 *                                {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
	 *                                {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
	 * @param region                  the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
	 *                                of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If {@code image} is
	 *                                a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and {@code region[2]}
	 *                                must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
	 * @param image_row_pitch         the scan-line pitch in bytes for the mapped region. This must be a non-{@code NULL} value.
	 * @param image_slice_pitch       returns the size in bytes of each 2D slice of a 3D image or the size of each 1D or 2D image in a 1D or 2D image array for the mapped region. For a
	 *                                1D and 2D image, zero is returned if this argument is not {@code NULL}. For a 3D image, 1D and 2D image array, {@code image_slice_pitch} must be a non-{@code NULL}
	 *                                value.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 * @param errcode_ret             will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a pointer to the mapped region. The {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS}. A {@code NULL} pointer is returned otherwise with one of the following error values
	 *         returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and image are not the same or if context associated with
	 *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if region being mapped given by {@code (origin, origin+region)} is out of bounds or if values specified in
	 *         {@code map_flags} are not valid.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for {@code origin}
	 *         and {@code region}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code image_row_pitch} is {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code image} is a 3D image, 1D or 2D image array object and {@code image_slice_pitch} is {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
	 *         supported by device associated with queue.</li>
	 *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
	 *         with queue.</li>
	 *         <li>{@link #CL_MAP_FAILURE MAP_FAILURE} if there is a failure to map the requested region into the host address space. This error cannot occur for image objects
	 *         created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}.</li>
	 *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the map operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE FALSE}).</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code image} has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and
	 *         {@link #CL_MAP_READ MAP_READ} is set in {@code map_flags} or if image has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and {@link #CL_MAP_WRITE MAP_WRITE} or {@link CL12#CL_MAP_WRITE_INVALIDATE_REGION MAP_WRITE_INVALIDATE_REGION} is set in {@code map_flags}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static ByteBuffer clEnqueueMapImage(long command_queue, long image, int blocking_map, long map_flags, ByteBuffer origin, ByteBuffer region, ByteBuffer image_row_pitch, ByteBuffer image_slice_pitch, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3 << POINTER_SHIFT);
			checkBuffer(region, 3 << POINTER_SHIFT);
			checkBuffer(image_row_pitch, 1 << POINTER_SHIFT);
			if ( image_slice_pitch != null ) checkBuffer(image_slice_pitch, 1 << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		long __result = nclEnqueueMapImage(command_queue, image, blocking_map, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret));
		return memByteBuffer(__result, (int)(int)clGetMemObjectInfoPointer(image, CL_MEM_SIZE));
	}

	/** Alternative version of: {@link #clEnqueueMapImage EnqueueMapImage} */
	public static ByteBuffer clEnqueueMapImage(long command_queue, long image, int blocking_map, long map_flags, PointerBuffer origin, PointerBuffer region, PointerBuffer image_row_pitch, PointerBuffer image_slice_pitch, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret, ByteBuffer old_buffer) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			checkBuffer(image_row_pitch, 1);
			if ( image_slice_pitch != null ) checkBuffer(image_slice_pitch, 1);
			if ( event != null ) checkBuffer(event, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long __result = nclEnqueueMapImage(command_queue, image, blocking_map, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret));
		int length = (int)clGetMemObjectInfoPointer(image, CL_MEM_SIZE);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	/** Explicit size alternative version of: {@link #clEnqueueMapImage EnqueueMapImage} */
	public static ByteBuffer clEnqueueMapImage(long command_queue, long image, int blocking_map, long map_flags, PointerBuffer origin, PointerBuffer region, PointerBuffer image_row_pitch, PointerBuffer image_slice_pitch, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret, long length, ByteBuffer old_buffer) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			checkBuffer(image_row_pitch, 1);
			if ( image_slice_pitch != null ) checkBuffer(image_slice_pitch, 1);
			if ( event != null ) checkBuffer(event, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long __result = nclEnqueueMapImage(command_queue, image, blocking_map, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret));
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, (int)length);
	}

	// --- [ clGetImageInfo ] ---

	/** JNI method for {@link #clGetImageInfo GetImageInfo} */
	@JavadocExclude
	public static native int nclGetImageInfo(long image, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetImageInfo GetImageInfo} */
	@JavadocExclude
	public static int nclGetImageInfo(long image, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetImageInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(image);
		return nclGetImageInfo(image, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns information specific to an image object.
	 *
	 * @param image                the image object being queried
	 * @param param_name           the information to query. One of:<br>{@link #CL_IMAGE_FORMAT IMAGE_FORMAT}, {@link #CL_IMAGE_ELEMENT_SIZE IMAGE_ELEMENT_SIZE}, {@link #CL_IMAGE_ROW_PITCH IMAGE_ROW_PITCH}, {@link #CL_IMAGE_SLICE_PITCH IMAGE_SLICE_PITCH}, {@link #CL_IMAGE_WIDTH IMAGE_WIDTH}, {@link #CL_IMAGE_HEIGHT IMAGE_HEIGHT}, {@link #CL_IMAGE_DEPTH IMAGE_DEPTH}, {@link CL12#CL_IMAGE_ARRAY_SIZE IMAGE_ARRAY_SIZE}, {@link CL12#CL_IMAGE_BUFFER IMAGE_BUFFER}, {@link CL12#CL_IMAGE_NUM_MIP_LEVELS IMAGE_NUM_MIP_LEVELS}, {@link CL12#CL_IMAGE_NUM_SAMPLES IMAGE_NUM_SAMPLES}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is a not a valid image object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetImageInfo(long image, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetImageInfo(image, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetImageInfo GetImageInfo} */
	public static int clGetImageInfo(long image, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetImageInfo(image, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetImageInfo GetImageInfo} */
	public static int clGetImageInfo(long image, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetImageInfo(image, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetImageInfo GetImageInfo} */
	public static int clGetImageInfo(long image, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetImageInfo(image, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clRetainMemObject ] ---

	/** JNI method for {@link #clRetainMemObject RetainMemObject} */
	@JavadocExclude
	public static native int nclRetainMemObject(long memobj, long __functionAddress);

	/**
	 * Increments the {@code memobj} reference count.
	 * 
	 * <p>{@link #clCreateBuffer CreateBuffer}, {@link CL11#clCreateSubBuffer CreateSubBuffer} and {@link CL12#clCreateImage CreateImage} perform an implicit retain.</p>
	 *
	 * @param memobj the memory object to retain
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is not a valid memory object (buffer or image object).</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainMemObject(long memobj) {
		long __functionAddress = getInstance().RetainMemObject;
		if ( LWJGLUtil.CHECKS )
			checkPointer(memobj);
		return nclRetainMemObject(memobj, __functionAddress);
	}

	// --- [ clReleaseMemObject ] ---

	/** JNI method for {@link #clReleaseMemObject ReleaseMemObject} */
	@JavadocExclude
	public static native int nclReleaseMemObject(long memobj, long __functionAddress);

	/**
	 * Decrements the {@code memobj} reference count.
	 * 
	 * <p>After the {@code memobj} reference count becomes zero and commands queued for execution on a command-queue(s) that use {@code memobj} have finished, the
	 * memory object is deleted. If {@code memobj} is a buffer object, {@code memobj} cannot be deleted until all sub-buffer objects associated with
	 * {@code memobj} are deleted.</p>
	 *
	 * @param memobj the memory object to release
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is not a valid memory object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseMemObject(long memobj) {
		long __functionAddress = getInstance().ReleaseMemObject;
		if ( LWJGLUtil.CHECKS )
			checkPointer(memobj);
		return nclReleaseMemObject(memobj, __functionAddress);
	}

	// --- [ clEnqueueUnmapMemObject ] ---

	/** JNI method for {@link #clEnqueueUnmapMemObject EnqueueUnmapMemObject} */
	@JavadocExclude
	public static native int nclEnqueueUnmapMemObject(long command_queue, long memobj, long mapped_ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueUnmapMemObject EnqueueUnmapMemObject} */
	@JavadocExclude
	public static int nclEnqueueUnmapMemObject(long command_queue, long memobj, long mapped_ptr, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueUnmapMemObject;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(memobj);
		}
		return nclEnqueueUnmapMemObject(command_queue, memobj, mapped_ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to unmap a previously mapped region of a memory object. Reads or writes from the host using the pointer returned by
	 * {@link #clEnqueueMapBuffer EnqueueMapBuffer} or {@link #clEnqueueMapImage EnqueueMapImage} are considered to be complete.
	 * 
	 * <p>{@link #clEnqueueMapBuffer EnqueueMapBuffer}, and {@link #clEnqueueMapImage EnqueueMapImage} increments the mapped count of the memory object. The initial mapped count value of the memory object is zero.
	 * Multiple calls to {@link #clEnqueueMapBuffer EnqueueMapBuffer}, or {@link #clEnqueueMapImage EnqueueMapImage} on the same memory object will increment this mapped count by appropriate number of calls.
	 * {@code clEnqueueUnmapMemObject} decrements the mapped count of the memory object. {@link #clEnqueueMapBuffer EnqueueMapBuffer}, and {@link #clEnqueueMapImage EnqueueMapImage} act as synchronization points
	 * for a region of the buffer object being mapped.</p>
	 *
	 * @param command_queue           a valid command-queue
	 * @param memobj                  a valid memory object. The OpenCL context associated with {@code command_queue} and {@code memobj} must be the same.
	 * @param mapped_ptr              the host address returned by a previous call to {@link #clEnqueueMapBuffer EnqueueMapBuffer}, or {@link #clEnqueueMapImage EnqueueMapImage} for {@code memobj}
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is not a valid memory object.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code mapped_ptr} is not a valid pointer returned by {@link #clEnqueueMapBuffer EnqueueMapBuffer}, or {@link #clEnqueueMapImage EnqueueMapImage} for {@code memobj}.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and {@code memobj} are not the same or if the context associated with
	 *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         </ul>
	 */
	public static int clEnqueueUnmapMemObject(long command_queue, long memobj, ByteBuffer mapped_ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueUnmapMemObject(command_queue, memobj, memAddress(mapped_ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueUnmapMemObject EnqueueUnmapMemObject} */
	public static int clEnqueueUnmapMemObject(long command_queue, long memobj, ByteBuffer mapped_ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueUnmapMemObject(command_queue, memobj, memAddress(mapped_ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clGetMemObjectInfo ] ---

	/** JNI method for {@link #clGetMemObjectInfo GetMemObjectInfo} */
	@JavadocExclude
	public static native int nclGetMemObjectInfo(long memobj, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetMemObjectInfo GetMemObjectInfo} */
	@JavadocExclude
	public static int nclGetMemObjectInfo(long memobj, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetMemObjectInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(memobj);
		return nclGetMemObjectInfo(memobj, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns information that is common to all memory objects (buffer and image objects).
	 *
	 * @param memobj               the memory object being queried
	 * @param param_name           the information to query. One of:<br>{@link #CL_MEM_TYPE MEM_TYPE}, {@link #CL_MEM_FLAGS MEM_FLAGS}, {@link #CL_MEM_SIZE MEM_SIZE}, {@link #CL_MEM_HOST_PTR MEM_HOST_PTR}, {@link #CL_MEM_MAP_COUNT MEM_MAP_COUNT}, {@link #CL_MEM_REFERENCE_COUNT MEM_REFERENCE_COUNT}, {@link #CL_MEM_CONTEXT MEM_CONTEXT}, {@link CL11#CL_MEM_ASSOCIATED_MEMOBJECT MEM_ASSOCIATED_MEMOBJECT}, {@link CL11#CL_MEM_OFFSET MEM_OFFSET}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is a not a valid memory object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetMemObjectInfo(long memobj, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetMemObjectInfo(memobj, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetMemObjectInfo GetMemObjectInfo} */
	public static int clGetMemObjectInfo(long memobj, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetMemObjectInfo(memobj, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetMemObjectInfo GetMemObjectInfo} */
	public static int clGetMemObjectInfo(long memobj, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetMemObjectInfo(memobj, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** LongBuffer version of: {@link #clGetMemObjectInfo GetMemObjectInfo} */
	public static int clGetMemObjectInfo(long memobj, int param_name, LongBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetMemObjectInfo(memobj, param_name, (param_value == null ? 0 : param_value.remaining()) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetMemObjectInfo GetMemObjectInfo} */
	public static int clGetMemObjectInfo(long memobj, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetMemObjectInfo(memobj, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clCreateSampler ] ---

	/** JNI method for {@link #clCreateSampler CreateSampler} */
	@JavadocExclude
	public static native long nclCreateSampler(long context, int normalized_coords, int addressing_mode, int filter_mode, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateSampler CreateSampler} */
	@JavadocExclude
	public static long nclCreateSampler(long context, int normalized_coords, int addressing_mode, int filter_mode, long errcode_ret) {
		long __functionAddress = getInstance().CreateSampler;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclCreateSampler(context, normalized_coords, addressing_mode, filter_mode, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a sampler object.
	 * 
	 * <p>A sampler object describes how to sample an image when the image is read in the kernel. The built-in functions to read from an image in a kernel take a
	 * sampler as an argument. The sampler arguments to the image read function can be sampler objects created using OpenCL functions and passed as argument
	 * values to the kernel or can be samplers declared inside a kernel.</p>
	 *
	 * @param context           a valid OpenCL context
	 * @param normalized_coords determines if the image coordinates specified are normalized or not
	 * @param addressing_mode   specifies how out-of-range image coordinates are handled when reading from an image. One of:<br>{@link #CL_ADDRESS_NONE ADDRESS_NONE}, {@link #CL_ADDRESS_CLAMP_TO_EDGE ADDRESS_CLAMP_TO_EDGE}, {@link #CL_ADDRESS_CLAMP ADDRESS_CLAMP}, {@link #CL_ADDRESS_REPEAT ADDRESS_REPEAT}, {@link CL11#CL_ADDRESS_MIRRORED_REPEAT ADDRESS_MIRRORED_REPEAT}
	 * @param filter_mode       the type of filter that must be applied when reading an image. One of:<br>{@link #CL_FILTER_NEAREST FILTER_NEAREST}, {@link #CL_FILTER_LINEAR FILTER_LINEAR}
	 * @param errcode_ret       will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero sampler object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the sampler object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code addressing_mode}, {@code filter_mode} or {@code normalized_coords} or combination of these argument values are
	 *         not valid.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if images are not supported by any device associated with {@code context} (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE FALSE}).</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateSampler(long context, int normalized_coords, int addressing_mode, int filter_mode, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		return nclCreateSampler(context, normalized_coords, addressing_mode, filter_mode, memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateSampler CreateSampler} */
	public static long clCreateSampler(long context, int normalized_coords, int addressing_mode, int filter_mode, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateSampler(context, normalized_coords, addressing_mode, filter_mode, memAddressSafe(errcode_ret));
	}

	// --- [ clRetainSampler ] ---

	/** JNI method for {@link #clRetainSampler RetainSampler} */
	@JavadocExclude
	public static native int nclRetainSampler(long sampler, long __functionAddress);

	/**
	 * Increments the sampler reference count. {@link #clCreateSampler CreateSampler} performs an implicit retain.
	 *
	 * @param sampler the sample object to retain
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} if sampler is not a valid sampler object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainSampler(long sampler) {
		long __functionAddress = getInstance().RetainSampler;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sampler);
		return nclRetainSampler(sampler, __functionAddress);
	}

	// --- [ clReleaseSampler ] ---

	/** JNI method for {@link #clReleaseSampler ReleaseSampler} */
	@JavadocExclude
	public static native int nclReleaseSampler(long sampler, long __functionAddress);

	/**
	 * Decrements the sampler reference count. The sampler object is deleted after the reference count becomes zero and commands queued for execution on a
	 * command-queue(s) that use sampler have finished.
	 *
	 * @param sampler the sample object to release
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} if {@code sampler} is not a valid sampler object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseSampler(long sampler) {
		long __functionAddress = getInstance().ReleaseSampler;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sampler);
		return nclReleaseSampler(sampler, __functionAddress);
	}

	// --- [ clGetSamplerInfo ] ---

	/** JNI method for {@link #clGetSamplerInfo GetSamplerInfo} */
	@JavadocExclude
	public static native int nclGetSamplerInfo(long sampler, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetSamplerInfo GetSamplerInfo} */
	@JavadocExclude
	public static int nclGetSamplerInfo(long sampler, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetSamplerInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sampler);
		return nclGetSamplerInfo(sampler, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns information about a sampler object.
	 *
	 * @param sampler              the sampler being queried
	 * @param param_name           the information to query. One of:<br>{@link #CL_SAMPLER_REFERENCE_COUNT SAMPLER_REFERENCE_COUNT}, {@link #CL_SAMPLER_CONTEXT SAMPLER_CONTEXT}, {@link #CL_SAMPLER_NORMALIZED_COORDS SAMPLER_NORMALIZED_COORDS}, {@link #CL_SAMPLER_ADDRESSING_MODE SAMPLER_ADDRESSING_MODE}, {@link #CL_SAMPLER_FILTER_MODE SAMPLER_FILTER_MODE}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} if {@code sampler} is a not a valid sampler object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetSamplerInfo(long sampler, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetSamplerInfo(sampler, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetSamplerInfo GetSamplerInfo} */
	public static int clGetSamplerInfo(long sampler, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetSamplerInfo(sampler, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetSamplerInfo GetSamplerInfo} */
	public static int clGetSamplerInfo(long sampler, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetSamplerInfo(sampler, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetSamplerInfo GetSamplerInfo} */
	public static int clGetSamplerInfo(long sampler, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetSamplerInfo(sampler, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clCreateProgramWithSource ] ---

	/** JNI method for {@link #clCreateProgramWithSource CreateProgramWithSource} */
	@JavadocExclude
	public static native long nclCreateProgramWithSource(long context, int count, long strings, long lengths, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateProgramWithSource CreateProgramWithSource} */
	@JavadocExclude
	public static long nclCreateProgramWithSource(long context, int count, long strings, long lengths, long errcode_ret) {
		long __functionAddress = getInstance().CreateProgramWithSource;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclCreateProgramWithSource(context, count, strings, lengths, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a program object for a context, and loads the source code specified by the text strings in the strings array into the program object. The
	 * devices associated with the program object are the devices associated with {@code context}. The source code specified by strings is either an OpenCL C
	 * program source, header or implementation-defined source for custom devices that support an online compiler.
	 *
	 * @param context     a valid OpenCL context
	 * @param count       the number of elements in the {@code strings} and {@code lengths} arrays
	 * @param strings     an array of {@code count} pointers to optionally null-terminated character strings that make up the source code
	 * @param lengths     an array with the number of chars in each string (the string length). If an element in {@code lengths} is zero, its accompanying string is
	 *                    null-terminated. If {@code lengths} is {@code NULL}, all strings in the {@code strings} argument are considered null-terminated. Any length value passed in
	 *                    that is greater than zero excludes the null terminator in its count.
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero program object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code count} is zero or if {@code strings} or any entry in {@code strings} is {@code NULL}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateProgramWithSource(long context, int count, ByteBuffer strings, ByteBuffer lengths, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(strings, count << POINTER_SHIFT);
			if ( lengths != null ) checkBuffer(lengths, count << POINTER_SHIFT);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return nclCreateProgramWithSource(context, count, memAddress(strings), memAddressSafe(lengths), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateProgramWithSource CreateProgramWithSource} */
	public static long clCreateProgramWithSource(long context, PointerBuffer strings, PointerBuffer lengths, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( lengths != null ) checkBuffer(lengths, strings.remaining());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateProgramWithSource(context, strings.remaining(), memAddress(strings), memAddressSafe(lengths), memAddressSafe(errcode_ret));
	}

	/** Array version of: {@link #clCreateProgramWithSource CreateProgramWithSource} */
	public static long clCreateProgramWithSource(long context, CharSequence[] strings, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		APIBuffer __buffer = apiBuffer();
		int stringsLengths = __buffer.bufferParam(strings.length << POINTER_SHIFT);
		for ( int i = 0; i < strings.length; i++ )
			__buffer.pointerParam(stringsLengths, i, strings[i].length());
		int stringsAddress = __buffer.bufferParam(strings.length << POINTER_SHIFT);
		ByteBuffer[] stringsBuffers = new ByteBuffer[strings.length];
		for ( int i = 0; i < strings.length; i++ )
			__buffer.pointerParam(stringsAddress, i, memAddress(stringsBuffers[i] = memEncodeUTF8(strings[i], false)));
		return nclCreateProgramWithSource(context, strings.length, __buffer.address(stringsAddress), __buffer.address(stringsLengths), memAddressSafe(errcode_ret));
	}

	/** Single string version of: {@link #clCreateProgramWithSource CreateProgramWithSource} */
	public static long clCreateProgramWithSource(long context, CharSequence string, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		APIBuffer __buffer = apiBuffer();
		int stringsLengths = __buffer.pointerParam(string.length());
		ByteBuffer stringBuffers = memEncodeUTF8(string, false);
		int stringsAddress = __buffer.pointerParam(memAddress(stringBuffers));
		return nclCreateProgramWithSource(context, 1, __buffer.address(stringsAddress), __buffer.address(stringsLengths), memAddressSafe(errcode_ret));
	}

	// --- [ clCreateProgramWithBinary ] ---

	/** JNI method for {@link #clCreateProgramWithBinary CreateProgramWithBinary} */
	@JavadocExclude
	public static native long nclCreateProgramWithBinary(long context, int num_devices, long device_list, long lengths, long binaries, long binary_status, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateProgramWithBinary CreateProgramWithBinary} */
	@JavadocExclude
	public static long nclCreateProgramWithBinary(long context, int num_devices, long device_list, long lengths, long binaries, long binary_status, long errcode_ret) {
		long __functionAddress = getInstance().CreateProgramWithBinary;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclCreateProgramWithBinary(context, num_devices, device_list, lengths, binaries, binary_status, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a program object for a context, and loads the binary bits specified by {@code binary} into the program object.
	 * 
	 * <p>The program binaries specified by {@code binaries} contain the bits that describe one of the following:
	 * <ul>
	 * <li>a program executable to be run on the device(s) associated with {@code context},</li>
	 * <li>a compiled program for device(s) associated with {@code context}, or</li>
	 * <li>a library of compiled programs for device(s) associated with {@code context}.</li>
	 * </ul>
	 * The program binary can consist of either or both:
	 * <ul>
	 * <li>Device-specific code and/or,</li>
	 * <li>Implementation-specific intermediate representation (IR) which will be converted to the device-specific code.</li>
	 * </ul>
	 * OpenCL allows applications to create a program object using the program source or binary and build appropriate program executables. This can be very
	 * useful as it allows applications to load program source and then compile and link to generate a program executable online on its first instance for
	 * appropriate OpenCL devices in the system. These executables can now be queried and cached by the application. Future instances of the application
	 * launching will no longer need to compile and link the program executables. The cached executables can be read and loaded by the application, which can
	 * help significantly reduce the application initialization time.</p>
	 *
	 * @param context       a valid OpenCL context
	 * @param num_devices   the number of devices listed in {@code device_list}
	 * @param device_list   a pointer to a list of devices that are in {@code context}. device_list must be a non-{@code NULL} value. The binaries are loaded for devices specified in
	 *                      this list.
	 * @param lengths       an array of the size in bytes of the program binaries to be loaded for devices specified by {@code device_list}.
	 * @param binaries      an array of pointers to program binaries to be loaded for devices specified by {@code device_list}. For each device given by {@code device_list[i]},
	 *                      the pointer to the program binary for that device is given by {@code binaries[i]} and the length of this corresponding binary is given by
	 *                      {@code lengths[i]}. {@code lengths[i]} cannot be zero and {@code binaries[i]} cannot be a {@code NULL} pointer.
	 * @param binary_status returns whether the program binary for each device specified in device_list was loaded successfully or not. It is an array of {@code num_devices}
	 *                      entries and returns {@link #CL_SUCCESS SUCCESS} in {@code binary_status[i]} if binary was successfully loaded for device specified by {@code device_list[i]};
	 *                      otherwise returns {@link #CL_INVALID_VALUE INVALID_VALUE} if {@code lengths[i]} is zero or if {@code binaries[i]} is a {@code NULL} value or {@link #CL_INVALID_BINARY INVALID_BINARY} in
	 *                      {@code binary_status[i]} if program binary is not a valid binary for the specified device. If {@code binary_status} is {@code NULL}, it is ignored.
	 * @param errcode_ret   will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero program object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL}
	 *         value with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} or {@code num_devices} is zero.</li>
	 *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with {@code context}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code lengths} or {@code binaries} are NULL or if any entry in {@code lengths[i]} is zero or {@code binaries[i]} is {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_BINARY INVALID_BINARY} if an invalid program binary was encountered for any device. {@code binary_status} will return specific status for each device.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateProgramWithBinary(long context, int num_devices, ByteBuffer device_list, ByteBuffer lengths, ByteBuffer binaries, ByteBuffer binary_status, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(binaries, num_devices << POINTER_SHIFT);
			checkBuffer(device_list, num_devices << POINTER_SHIFT);
			checkBuffer(lengths, num_devices << POINTER_SHIFT);
			if ( binary_status != null ) checkBuffer(binary_status, num_devices << 2);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return nclCreateProgramWithBinary(context, num_devices, memAddress(device_list), memAddress(lengths), memAddress(binaries), memAddressSafe(binary_status), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateProgramWithBinary CreateProgramWithBinary} */
	public static long clCreateProgramWithBinary(long context, PointerBuffer device_list, PointerBuffer lengths, PointerBuffer binaries, IntBuffer binary_status, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(device_list, binaries.remaining());
			checkBuffer(lengths, binaries.remaining());
			if ( binary_status != null ) checkBuffer(binary_status, binaries.remaining());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateProgramWithBinary(context, binaries.remaining(), memAddress(device_list), memAddress(lengths), memAddress(binaries), memAddressSafe(binary_status), memAddressSafe(errcode_ret));
	}

	/** Array version of: {@link #clCreateProgramWithBinary CreateProgramWithBinary} */
	public static long clCreateProgramWithBinary(long context, PointerBuffer device_list, ByteBuffer[] binaries, IntBuffer binary_status, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(device_list, binaries.length);
			if ( binary_status != null ) checkBuffer(binary_status, binaries.length);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int binariesLengths = __buffer.bufferParam(binaries.length << POINTER_SHIFT);
		for ( int i = 0; i < binaries.length; i++ )
			__buffer.pointerParam(binariesLengths, i, binaries[i].remaining());
		int binariesAddress = __buffer.bufferParam(binaries.length << POINTER_SHIFT);
		for ( int i = 0; i < binaries.length; i++ )
			__buffer.pointerParam(binariesAddress, i, memAddress(binaries[i]));
		return nclCreateProgramWithBinary(context, binaries.length, memAddress(device_list), __buffer.address(binariesLengths), __buffer.address(binariesAddress), memAddressSafe(binary_status), memAddressSafe(errcode_ret));
	}

	/** Single binary version of: {@link #clCreateProgramWithBinary CreateProgramWithBinary} */
	public static long clCreateProgramWithBinary(long context, PointerBuffer device_list, ByteBuffer binary, IntBuffer binary_status, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(device_list, 1);
			if ( binary_status != null ) checkBuffer(binary_status, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int binariesLengths = __buffer.pointerParam(binary.remaining());
		int binariesAddress = __buffer.pointerParam(memAddress(binary));
		return nclCreateProgramWithBinary(context, 1, memAddress(device_list), __buffer.address(binariesLengths), __buffer.address(binariesAddress), memAddressSafe(binary_status), memAddressSafe(errcode_ret));
	}

	// --- [ clRetainProgram ] ---

	/** JNI method for {@link #clRetainProgram RetainProgram} */
	@JavadocExclude
	public static native int nclRetainProgram(long program, long __functionAddress);

	/**
	 * Increments the {@code program} reference count. {@code clCreateProgram} does an implicit retain.
	 *
	 * @param program the program object to retain
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainProgram(long program) {
		long __functionAddress = getInstance().RetainProgram;
		if ( LWJGLUtil.CHECKS )
			checkPointer(program);
		return nclRetainProgram(program, __functionAddress);
	}

	// --- [ clReleaseProgram ] ---

	/** JNI method for {@link #clReleaseProgram ReleaseProgram} */
	@JavadocExclude
	public static native int nclReleaseProgram(long program, long __functionAddress);

	/**
	 * Decrements the {@code program} reference count. The program object is deleted after all kernel objects associated with program have been deleted and the
	 * program reference count becomes zero.
	 *
	 * @param program the program object to release
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseProgram(long program) {
		long __functionAddress = getInstance().ReleaseProgram;
		if ( LWJGLUtil.CHECKS )
			checkPointer(program);
		return nclReleaseProgram(program, __functionAddress);
	}

	// --- [ clBuildProgram ] ---

	/** JNI method for {@link #clBuildProgram BuildProgram} */
	@JavadocExclude
	public static native int nclBuildProgram(long program, int num_devices, long device_list, long options, long pfn_notify, long user_data, long __functionAddress);

	/** Unsafe version of {@link #clBuildProgram BuildProgram} */
	@JavadocExclude
	public static int nclBuildProgram(long program, int num_devices, long device_list, long options, long pfn_notify, long user_data) {
		long __functionAddress = getInstance().BuildProgram;
		if ( LWJGLUtil.CHECKS )
			checkPointer(program);
		return nclBuildProgram(program, num_devices, device_list, options, pfn_notify, user_data, __functionAddress);
	}

	/**
	 * Builds (compiles & links) a program executable from the program source or binary for all the devices or a specific device(s) in the OpenCL context
	 * associated with {@code program}. OpenCL allows program executables to be built using the source or the binary. {@code clBuildProgram} must be called for
	 * {@code program} created using either {@link #clCreateProgramWithSource CreateProgramWithSource} or {@link #clCreateProgramWithBinary CreateProgramWithBinary} to build the program executable for one or more devices
	 * associated with {@code program}. If {@code program} is created with {@link #clCreateProgramWithBinary CreateProgramWithBinary}, then the program binary must be an executable binary (not
	 * a compiled binary or library).
	 * 
	 * <p>The executable binary can be queried using {@link #clGetProgramInfo GetProgramInfo} and can be specified to {@link #clCreateProgramWithBinary CreateProgramWithBinary} to create a new program object.</p>
	 *
	 * @param program     the program object
	 * @param num_devices the number of devices listed in {@code device_list}
	 * @param device_list a pointer to a list of devices associated with {@code program}. If {@code device_list} is a {@code NULL} value, the program executable is built for all
	 *                    devices associated with {@code program} for which a source or binary has been loaded. If {@code device_list} is a non-{@code NULL} value, the program
	 *                    executable is built for devices specified in this list for which a source or binary has been loaded.
	 * @param options     a pointer to a null-terminated string of characters that describes the build options to be used for building the program executable
	 * @param pfn_notify  a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
	 *                    called when the program executable has been built (successfully or unsuccessfully). If {@code pfn_notify} is not {@code NULL}, {@code clBuildProgram} does
	 *                    not need to wait for the build to complete and can return immediately once the build operation can begin. The build operation can begin if the
	 *                    context, program whose sources are being compiled and linked, list of devices and build options specified are all valid and appropriate host and
	 *                    device resources needed to perform the build are available. If {@code pfn_notify} is {@code NULL}, {@code clBuildProgram} does not return until the build
	 *                    has completed. This callback function may be called asynchronously by the OpenCL implementation. It is the application's responsibility to ensure
	 *                    that the callback function is thread-safe.
	 * @param user_data   will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be NULL.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} and {@code num_devices} is &gt; 0, or if {@code device_list} is not {@code NULL} and {@code num_devices} is 0.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with program.</li>
	 *         <li>{@link #CL_INVALID_BINARY INVALID_BINARY} if {@code program} is created with {@link #clCreateProgramWithBinary CreateProgramWithBinary} and devices listed in {@code device_list} do not have a valid
	 *         program binary loaded.</li>
	 *         <li>{@link #CL_INVALID_BUILD_OPTIONS INVALID_BUILD_OPTIONS} if the build options specified by {@code options} are invalid.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the build of a program executable for any of the devices listed in {@code device_list} by a previous call to
	 *         {@code clBuildProgram} for {@code program} has not completed.</li>
	 *         <li>{@link #CL_COMPILER_NOT_AVAILABLE COMPILER_NOT_AVAILABLE} if {@code program} is created with {@link #clCreateProgramWithSource CreateProgramWithSource} and a compiler is not available i.e.
	 *         {@link #CL_DEVICE_COMPILER_AVAILABLE DEVICE_COMPILER_AVAILABLE} is set to {@link #CL_FALSE FALSE}.</li>
	 *         <li>{@link #CL_BUILD_PROGRAM_FAILURE BUILD_PROGRAM_FAILURE} if there is a failure to build the program executable. This error will be returned if {@code clBuildProgram} does
	 *         not return until the build has completed.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are kernel objects attached to {@code program}.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if program was not created with {@link #clCreateProgramWithSource CreateProgramWithSource} or {@link #clCreateProgramWithBinary CreateProgramWithBinary}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clBuildProgram(long program, int num_devices, ByteBuffer device_list, ByteBuffer options, CLProgramCallback pfn_notify, long user_data) {
		if ( LWJGLUtil.CHECKS ) {
			if ( device_list != null ) checkBuffer(device_list, num_devices << POINTER_SHIFT);
			checkNT1(options);
		}
		return nclBuildProgram(program, num_devices, memAddressSafe(device_list), memAddress(options), pfn_notify == null ? NULL : pfn_notify.getPointer(), user_data);
	}

	/** Alternative version of: {@link #clBuildProgram BuildProgram} */
	public static int clBuildProgram(long program, PointerBuffer device_list, ByteBuffer options, CLProgramCallback pfn_notify, long user_data) {
		return nclBuildProgram(program, device_list == null ? 0 : device_list.remaining(), memAddressSafe(device_list), memAddress(options), pfn_notify == null ? NULL : pfn_notify.getPointer(), user_data);
	}

	/** CharSequence version of: {@link #clBuildProgram BuildProgram} */
	public static int clBuildProgram(long program, PointerBuffer device_list, CharSequence options, CLProgramCallback pfn_notify, long user_data) {
		APIBuffer __buffer = apiBuffer();
		int optionsEncoded = __buffer.stringParamASCII(options, true);
		return nclBuildProgram(program, device_list == null ? 0 : device_list.remaining(), memAddressSafe(device_list), __buffer.address(optionsEncoded), pfn_notify == null ? NULL : pfn_notify.getPointer(), user_data);
	}

	/** Single value version of: {@link #clBuildProgram BuildProgram} */
	public static int clBuildProgram(long program, long device, CharSequence options, CLProgramCallback pfn_notify, long user_data) {
		APIBuffer __buffer = apiBuffer();
		int optionsEncoded = __buffer.stringParamASCII(options, true);
		int device_list = __buffer.pointerParam(device);
		return nclBuildProgram(program, 1, __buffer.address(device_list), __buffer.address(optionsEncoded), pfn_notify == null ? NULL : pfn_notify.getPointer(), user_data);
	}

	// --- [ clUnloadCompiler ] ---

	/** JNI method for {@link #clUnloadCompiler UnloadCompiler} */
	@JavadocExclude
	public static native int nclUnloadCompiler(long __functionAddress);

	/**
	 * Allows the implementation to release the resources allocated by the OpenCL compiler. This is a hint from the application and does not guarantee that the
	 * compiler will not be used in the future or that the compiler will actually be unloaded by the implementation.
	 * 
	 * <p>Calls to {@link #clBuildProgram BuildProgram} after {@link #clUnloadCompiler UnloadCompiler} will reload the compiler, if necessary, to build the appropriate program executable.</p>
	 *
	 * @return always {@link #CL_SUCCESS SUCCESS}
	 */
	public static int clUnloadCompiler() {
		long __functionAddress = getInstance().UnloadCompiler;
		return nclUnloadCompiler(__functionAddress);
	}

	// --- [ clGetProgramInfo ] ---

	/** JNI method for {@link #clGetProgramInfo GetProgramInfo} */
	@JavadocExclude
	public static native int nclGetProgramInfo(long program, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetProgramInfo GetProgramInfo} */
	@JavadocExclude
	public static int nclGetProgramInfo(long program, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetProgramInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(program);
		return nclGetProgramInfo(program, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns information about a program object.
	 *
	 * @param program              the program object being queried
	 * @param param_name           the information to query. One of:<br>{@link #CL_PROGRAM_REFERENCE_COUNT PROGRAM_REFERENCE_COUNT}, {@link #CL_PROGRAM_CONTEXT PROGRAM_CONTEXT}, {@link #CL_PROGRAM_NUM_DEVICES PROGRAM_NUM_DEVICES}, {@link #CL_PROGRAM_DEVICES PROGRAM_DEVICES}, {@link #CL_PROGRAM_SOURCE PROGRAM_SOURCE}, {@link #CL_PROGRAM_BINARY_SIZES PROGRAM_BINARY_SIZES}, {@link #CL_PROGRAM_BINARIES PROGRAM_BINARIES}, {@link CL12#CL_PROGRAM_NUM_KERNELS PROGRAM_NUM_KERNELS}, {@link CL12#CL_PROGRAM_KERNEL_NAMES PROGRAM_KERNEL_NAMES}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is a not a valid program object.</li>
	 *         <li>{@link #CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} if {@code param_name} is {@link CL12#CL_PROGRAM_NUM_KERNELS PROGRAM_NUM_KERNELS} or {@link CL12#CL_PROGRAM_KERNEL_NAMES PROGRAM_KERNEL_NAMES} and a
	 *         successful program executable has not been built for at least one device in the list of devices associated with {@code program}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetProgramInfo(long program, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetProgramInfo(program, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetProgramInfo GetProgramInfo} */
	public static int clGetProgramInfo(long program, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetProgramInfo(program, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetProgramInfo GetProgramInfo} */
	public static int clGetProgramInfo(long program, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetProgramInfo(program, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetProgramInfo GetProgramInfo} */
	public static int clGetProgramInfo(long program, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetProgramInfo(program, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clGetProgramBuildInfo ] ---

	/** JNI method for {@link #clGetProgramBuildInfo GetProgramBuildInfo} */
	@JavadocExclude
	public static native int nclGetProgramBuildInfo(long program, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetProgramBuildInfo GetProgramBuildInfo} */
	@JavadocExclude
	public static int nclGetProgramBuildInfo(long program, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetProgramBuildInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(program);
			checkPointer(device);
		}
		return nclGetProgramBuildInfo(program, device, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns build information for each device in the program object.
	 *
	 * @param program              the program object being queried
	 * @param device               the device for which build information is being queried. {@code device} must be a valid device associated with {@code program}.
	 * @param param_name           the information to query. One of:<br>{@link #CL_PROGRAM_BUILD_STATUS PROGRAM_BUILD_STATUS}, {@link #CL_PROGRAM_BUILD_OPTIONS PROGRAM_BUILD_OPTIONS}, {@link #CL_PROGRAM_BUILD_LOG PROGRAM_BUILD_LOG}, {@link CL12#CL_PROGRAM_BINARY_TYPE PROGRAM_BINARY_TYPE}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not in the list of devices associated with program.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is a not a valid program object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetProgramBuildInfo(long program, long device, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetProgramBuildInfo(program, device, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetProgramBuildInfo GetProgramBuildInfo} */
	public static int clGetProgramBuildInfo(long program, long device, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetProgramBuildInfo(program, device, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetProgramBuildInfo GetProgramBuildInfo} */
	public static int clGetProgramBuildInfo(long program, long device, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetProgramBuildInfo(program, device, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetProgramBuildInfo GetProgramBuildInfo} */
	public static int clGetProgramBuildInfo(long program, long device, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetProgramBuildInfo(program, device, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clCreateKernel ] ---

	/** JNI method for {@link #clCreateKernel CreateKernel} */
	@JavadocExclude
	public static native long nclCreateKernel(long program, long kernel_name, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateKernel CreateKernel} */
	@JavadocExclude
	public static long nclCreateKernel(long program, long kernel_name, long errcode_ret) {
		long __functionAddress = getInstance().CreateKernel;
		if ( LWJGLUtil.CHECKS )
			checkPointer(program);
		return nclCreateKernel(program, kernel_name, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a kernel object.
	 * 
	 * <p>A kernel is a function declared in a program. A kernel is identified by the {@code __kernel} qualifier applied to any function in a program. A kernel
	 * object encapsulates the specific {@code __kernel} function declared in a program and the argument values to be used when executing this {@code __kernel}
	 * function.</p>
	 * 
	 * <p>Kernel objects can only be created once you have a program object with a valid program source or binary loaded into the program object and the program
	 * executable has been successfully built for one or more devices associated with program. No changes to the program executable are allowed while there are
	 * kernel objects associated with a program object. This means that calls to {@link #clBuildProgram BuildProgram} and {@link CL12#clCompileProgram CompileProgram} return
	 * {@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are kernel objects attached to a program object. The OpenCL context associated with program will be the context
	 * associated with kernel. The list of devices associated with program are the devices associated with kernel. Devices associated with a program object for
	 * which a valid program executable has been built can be used to execute kernels declared in the program object.</p>
	 *
	 * @param program     a program object with a successfully built executable
	 * @param kernel_name a function name in the program declared with the {@code __kernel} qualifier
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero kernel object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the kernel object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
	 *         <li>{@link #CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} if there is no successfully built executable for {@code program}.</li>
	 *         <li>{@link #CL_INVALID_KERNEL_NAME INVALID_KERNEL_NAME} if {@code kernel_name} is not found in {@code program}.</li>
	 *         <li>{@link #CL_INVALID_KERNEL_DEFINITION INVALID_KERNEL_DEFINITION} if the function definition for {@code __kernel} function given by {@code kernel_name} such as the number of
	 *         arguments, the argument types are not the same for all devices for which the program executable has been built.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code kernel_name} is {@code NULL}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateKernel(long program, ByteBuffer kernel_name, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(kernel_name);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return nclCreateKernel(program, memAddress(kernel_name), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateKernel CreateKernel} */
	public static long clCreateKernel(long program, ByteBuffer kernel_name, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateKernel(program, memAddress(kernel_name), memAddressSafe(errcode_ret));
	}

	/** CharSequence version of: {@link #clCreateKernel CreateKernel} */
	public static long clCreateKernel(long program, CharSequence kernel_name, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		APIBuffer __buffer = apiBuffer();
		int kernel_nameEncoded = __buffer.stringParamASCII(kernel_name, true);
		return nclCreateKernel(program, __buffer.address(kernel_nameEncoded), memAddressSafe(errcode_ret));
	}

	// --- [ clCreateKernelsInProgram ] ---

	/** JNI method for {@link #clCreateKernelsInProgram CreateKernelsInProgram} */
	@JavadocExclude
	public static native int nclCreateKernelsInProgram(long program, int num_kernels, long kernels, long num_kernels_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateKernelsInProgram CreateKernelsInProgram} */
	@JavadocExclude
	public static int nclCreateKernelsInProgram(long program, int num_kernels, long kernels, long num_kernels_ret) {
		long __functionAddress = getInstance().CreateKernelsInProgram;
		if ( LWJGLUtil.CHECKS )
			checkPointer(program);
		return nclCreateKernelsInProgram(program, num_kernels, kernels, num_kernels_ret, __functionAddress);
	}

	/**
	 * Creates kernel objects for all kernel functions in {@code program}. Kernel objects are not created for any {@code __kernel} functions in {@code program}
	 * that do not have the same function definition across all devices for which a program executable has been successfully built.
	 * 
	 * <p>See {@link #clCreateKernel CreateKernel} for more details.</p>
	 *
	 * @param program         a program object with a successfully built executable
	 * @param num_kernels     the size of memory pointed to by kernels specified as the number of cl_kernel entries
	 * @param kernels         the buffer where the kernel objects for kernels in {@code program} will be returned. If {@code kernels} is {@code NULL}, it is ignored. If {@code kernels}
	 *                        is not {@code NULL}, {@code num_kernels} must be greater than or equal to the number of kernels in {@code program}.
	 * @param num_kernels_ret the number of kernels in {@code program}. If {@code num_kernels_ret} is {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the kernel objects were successfully allocated. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
	 *         <li>{@link #CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} if there is no successfully built executable for any device in {@code program}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code kernels} is not {@code NULL} and {@code num_kernels} is less than the number of kernels in {@code program}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clCreateKernelsInProgram(long program, int num_kernels, ByteBuffer kernels, ByteBuffer num_kernels_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( kernels != null ) checkBuffer(kernels, num_kernels << POINTER_SHIFT);
			if ( num_kernels_ret != null ) checkBuffer(num_kernels_ret, 1 << 2);
		}
		return nclCreateKernelsInProgram(program, num_kernels, memAddressSafe(kernels), memAddressSafe(num_kernels_ret));
	}

	/** Alternative version of: {@link #clCreateKernelsInProgram CreateKernelsInProgram} */
	public static int clCreateKernelsInProgram(long program, PointerBuffer kernels, IntBuffer num_kernels_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( num_kernels_ret != null ) checkBuffer(num_kernels_ret, 1);
		return nclCreateKernelsInProgram(program, kernels == null ? 0 : kernels.remaining(), memAddressSafe(kernels), memAddressSafe(num_kernels_ret));
	}

	// --- [ clRetainKernel ] ---

	/** JNI method for {@link #clRetainKernel RetainKernel} */
	@JavadocExclude
	public static native int nclRetainKernel(long kernel, long __functionAddress);

	/**
	 * Increments the {@code kernel} reference count. {@link #clCreateKernel CreateKernel} or {@link #clCreateKernelsInProgram CreateKernelsInProgram} do an implicit retain.
	 *
	 * @param kernel the kernel to retain
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if kernel is not a valid kernel object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainKernel(long kernel) {
		long __functionAddress = getInstance().RetainKernel;
		if ( LWJGLUtil.CHECKS )
			checkPointer(kernel);
		return nclRetainKernel(kernel, __functionAddress);
	}

	// --- [ clReleaseKernel ] ---

	/** JNI method for {@link #clReleaseKernel ReleaseKernel} */
	@JavadocExclude
	public static native int nclReleaseKernel(long kernel, long __functionAddress);

	/**
	 * Decrements the {@code kernel} reference count.
	 * 
	 * <p>The kernel object is deleted once the number of instances that are retained to {@code kernel} become zero and the kernel object is no longer needed by
	 * any enqueued commands that use {@code kernel}.</p>
	 *
	 * @param kernel the kernel to release
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if kernel is not a valid kernel object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseKernel(long kernel) {
		long __functionAddress = getInstance().ReleaseKernel;
		if ( LWJGLUtil.CHECKS )
			checkPointer(kernel);
		return nclReleaseKernel(kernel, __functionAddress);
	}

	// --- [ clSetKernelArg ] ---

	/** JNI method for {@link #clSetKernelArg SetKernelArg} */
	@JavadocExclude
	public static native int nclSetKernelArg(long kernel, int arg_index, long arg_size, long arg_value, long __functionAddress);

	/** Unsafe version of {@link #clSetKernelArg SetKernelArg} */
	@JavadocExclude
	public static int nclSetKernelArg(long kernel, int arg_index, long arg_size, long arg_value) {
		long __functionAddress = getInstance().SetKernelArg;
		if ( LWJGLUtil.CHECKS )
			checkPointer(kernel);
		return nclSetKernelArg(kernel, arg_index, arg_size, arg_value, __functionAddress);
	}

	/**
	 * Set the argument value for a specific argument of a kernel.
	 *
	 * @param kernel    a valid kernel object
	 * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
	 *                  the total number of arguments declared by a kernel.
	 *                  
	 *                  <p>For example, consider the following kernel:
	 *                  <pre><code style="font-family: monospace">
	 *                  kernel void image_filter (
	 *                  	int n, int m,
	 *                  	__constant float *filter_weights,
	 *                  	__read_only image2d_t src_image,
	 *                  	__write_only image2d_t dst_image
	 *                  ) {
	 *                  	&hellip;
	 *                  }</code></pre>
	 *                  Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
	 *                  {@code dst_image}.</p>
	 *                  
	 *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
	 *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
	 * @param arg_size  the size of the argument value. If the argument is a memory object, the size is the size of the buffer or image object type. For arguments declared
	 *                  with the {@code __local} qualifier, the size specified will be the size in bytes of the buffer that must be allocated for the {@code __local}
	 *                  argument. If the argument is of type {@code sampler_t}, the {@code arg_size} value must be equal to {@code sizeof(cl_sampler)}. For all other
	 *                  arguments, the size will be the size of argument type.
	 * @param arg_value a pointer to data that should be used as the argument value for argument specified by {@code arg_index}. The argument data pointed to by
	 *                  {@code arg_value} is copied and the {@code arg_value} pointer can therefore be reused by the application after {@code clSetKernelArg} returns. The
	 *                  argument value specified is the value used by all API calls that enqueue kernel ({@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} and {@link #clEnqueueTask EnqueueTask}) until
	 *                  the argument value is changed by a call to {@code clSetKernelArg} for {@code kernel}.
	 *                  
	 *                  <p>If the argument is a memory object (buffer, image or image array), the {@code arg_value} entry will be a pointer to the appropriate buffer, image or
	 *                  image array object. The memory object must be created with the context associated with the kernel object. If the argument is a buffer object, the
	 *                  {@code arg_value} pointer can be {@code NULL} or point to a {@code NULL} value in which case a {@code NULL} value will be used as the value for the argument declared as
	 *                  a pointer to {@code __global} or {@code __constant} memory in the kernel. If the argument is declared with the {@code __local} qualifier, the
	 *                  {@code arg_value} entry must be {@code NULL}. If the argument is of type {@code sampler_t}, the {@code arg_value} entry must be a pointer to the sampler
	 *                  object.</p>
	 *                  
	 *                  <p>If the argument is declared to be a pointer of a built-in scalar or vector type, or a user defined structure type in the global or constant address
	 *                  space, the memory object specified as argument value must be a buffer object (or {@code NULL}). If the argument is declared with the {@code __constant}
	 *                  qualifier, the size in bytes of the memory object cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE} and the number of arguments declared as
	 *                  pointers to {@code __constant} memory cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}.</p>
	 *                  
	 *                  <p>The memory object specified as argument value must be a 2D image object if the argument is declared to be of type {@code image2d_t}. The memory
	 *                  object specified as argument value must be a 3D image object if argument is declared to be of type {@code image3d_t}. The memory object specified as
	 *                  argument value must be a 1D image object if the argument is declared to be of type {@code image1d_t}. The memory object specified as argument value
	 *                  must be a 1D image buffer object if the argument is declared to be of type {@code image1d_buffer_t}. The memory object specified as argument value
	 *                  must be a 1D image array object if argument is declared to be of type {@code image1d_array_t}. The memory object specified as argument value must be
	 *                  a 2D image array object if argument is declared to be of type {@code image2d_array_t}.</p>
	 *                  
	 *                  <p>For all other kernel arguments, the {@code arg_value} entry must be a pointer to the actual data to be used as argument value.</p>
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
	 *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
	 *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
	 *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
	 *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
	 *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
	 *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
	 *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
	 *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
	 *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clSetKernelArg(long kernel, int arg_index, long arg_size, ByteBuffer arg_value) {
		if ( LWJGLUtil.CHECKS )
			if ( arg_value != null ) checkBuffer(arg_value, arg_size);
		return nclSetKernelArg(kernel, arg_index, arg_size, memAddressSafe(arg_value));
	}

	/** Alternative version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg(long kernel, int arg_index, long arg_size) {
		return nclSetKernelArg(kernel, arg_index, arg_size, 0L);
	}

	/** ByteBuffer version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg(long kernel, int arg_index, ByteBuffer arg_value) {
		return nclSetKernelArg(kernel, arg_index, arg_value.remaining(), memAddress(arg_value));
	}

	/** ShortBuffer version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg(long kernel, int arg_index, ShortBuffer arg_value) {
		return nclSetKernelArg(kernel, arg_index, arg_value.remaining() << 1, memAddress(arg_value));
	}

	/** IntBuffer version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg(long kernel, int arg_index, IntBuffer arg_value) {
		return nclSetKernelArg(kernel, arg_index, arg_value.remaining() << 2, memAddress(arg_value));
	}

	/** LongBuffer version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg(long kernel, int arg_index, LongBuffer arg_value) {
		return nclSetKernelArg(kernel, arg_index, arg_value.remaining() << 3, memAddress(arg_value));
	}

	/** FloatBuffer version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg(long kernel, int arg_index, FloatBuffer arg_value) {
		return nclSetKernelArg(kernel, arg_index, arg_value.remaining() << 2, memAddress(arg_value));
	}

	/** DoubleBuffer version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg(long kernel, int arg_index, DoubleBuffer arg_value) {
		return nclSetKernelArg(kernel, arg_index, arg_value.remaining() << 3, memAddress(arg_value));
	}

	/** PointerBuffer version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg(long kernel, int arg_index, PointerBuffer arg_value) {
		return nclSetKernelArg(kernel, arg_index, arg_value.remaining() << POINTER_SHIFT, memAddress(arg_value));
	}

	/** Single byte value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg1b(long kernel, int arg_index, byte arg0) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.byteParam(arg0);
		return nclSetKernelArg(kernel, arg_index, (1 << 0) * 1, __buffer.address(arg_value));
	}

	/** byte2 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg2b(long kernel, int arg_index, byte arg0, byte arg1) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.byteParam(arg0);
		__buffer.byteParam(arg1);
		return nclSetKernelArg(kernel, arg_index, (1 << 0) * 2, __buffer.address(arg_value));
	}

	/** byte3 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg3b(long kernel, int arg_index, byte arg0, byte arg1, byte arg2) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.byteParam(arg0);
		__buffer.byteParam(arg1);
		__buffer.byteParam(arg2);
		return nclSetKernelArg(kernel, arg_index, (1 << 0) * 3, __buffer.address(arg_value));
	}

	/** byte4 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg4b(long kernel, int arg_index, byte arg0, byte arg1, byte arg2, byte arg3) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.byteParam(arg0);
		__buffer.byteParam(arg1);
		__buffer.byteParam(arg2);
		__buffer.byteParam(arg3);
		return nclSetKernelArg(kernel, arg_index, (1 << 0) * 4, __buffer.address(arg_value));
	}

	/** Single short value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg1s(long kernel, int arg_index, short arg0) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.shortParam(arg0);
		return nclSetKernelArg(kernel, arg_index, (1 << 1) * 1, __buffer.address(arg_value));
	}

	/** short2 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg2s(long kernel, int arg_index, short arg0, short arg1) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.shortParam(arg0);
		__buffer.shortParam(arg1);
		return nclSetKernelArg(kernel, arg_index, (1 << 1) * 2, __buffer.address(arg_value));
	}

	/** short3 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg3s(long kernel, int arg_index, short arg0, short arg1, short arg2) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.shortParam(arg0);
		__buffer.shortParam(arg1);
		__buffer.shortParam(arg2);
		return nclSetKernelArg(kernel, arg_index, (1 << 1) * 3, __buffer.address(arg_value));
	}

	/** short4 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg4s(long kernel, int arg_index, short arg0, short arg1, short arg2, short arg3) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.shortParam(arg0);
		__buffer.shortParam(arg1);
		__buffer.shortParam(arg2);
		__buffer.shortParam(arg3);
		return nclSetKernelArg(kernel, arg_index, (1 << 1) * 4, __buffer.address(arg_value));
	}

	/** Single int value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg1i(long kernel, int arg_index, int arg0) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.intParam(arg0);
		return nclSetKernelArg(kernel, arg_index, (1 << 2) * 1, __buffer.address(arg_value));
	}

	/** int2 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg2i(long kernel, int arg_index, int arg0, int arg1) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.intParam(arg0);
		__buffer.intParam(arg1);
		return nclSetKernelArg(kernel, arg_index, (1 << 2) * 2, __buffer.address(arg_value));
	}

	/** int3 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg3i(long kernel, int arg_index, int arg0, int arg1, int arg2) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.intParam(arg0);
		__buffer.intParam(arg1);
		__buffer.intParam(arg2);
		return nclSetKernelArg(kernel, arg_index, (1 << 2) * 3, __buffer.address(arg_value));
	}

	/** int4 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg4i(long kernel, int arg_index, int arg0, int arg1, int arg2, int arg3) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.intParam(arg0);
		__buffer.intParam(arg1);
		__buffer.intParam(arg2);
		__buffer.intParam(arg3);
		return nclSetKernelArg(kernel, arg_index, (1 << 2) * 4, __buffer.address(arg_value));
	}

	/** Single long value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg1l(long kernel, int arg_index, long arg0) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.longParam(arg0);
		return nclSetKernelArg(kernel, arg_index, (1 << 3) * 1, __buffer.address(arg_value));
	}

	/** long2 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg2l(long kernel, int arg_index, long arg0, long arg1) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.longParam(arg0);
		__buffer.longParam(arg1);
		return nclSetKernelArg(kernel, arg_index, (1 << 3) * 2, __buffer.address(arg_value));
	}

	/** long3 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg3l(long kernel, int arg_index, long arg0, long arg1, long arg2) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.longParam(arg0);
		__buffer.longParam(arg1);
		__buffer.longParam(arg2);
		return nclSetKernelArg(kernel, arg_index, (1 << 3) * 3, __buffer.address(arg_value));
	}

	/** long4 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg4l(long kernel, int arg_index, long arg0, long arg1, long arg2, long arg3) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.longParam(arg0);
		__buffer.longParam(arg1);
		__buffer.longParam(arg2);
		__buffer.longParam(arg3);
		return nclSetKernelArg(kernel, arg_index, (1 << 3) * 4, __buffer.address(arg_value));
	}

	/** Single float value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg1f(long kernel, int arg_index, float arg0) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.floatParam(arg0);
		return nclSetKernelArg(kernel, arg_index, (1 << 2) * 1, __buffer.address(arg_value));
	}

	/** float2 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg2f(long kernel, int arg_index, float arg0, float arg1) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.floatParam(arg0);
		__buffer.floatParam(arg1);
		return nclSetKernelArg(kernel, arg_index, (1 << 2) * 2, __buffer.address(arg_value));
	}

	/** float3 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg3f(long kernel, int arg_index, float arg0, float arg1, float arg2) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.floatParam(arg0);
		__buffer.floatParam(arg1);
		__buffer.floatParam(arg2);
		return nclSetKernelArg(kernel, arg_index, (1 << 2) * 3, __buffer.address(arg_value));
	}

	/** float4 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg4f(long kernel, int arg_index, float arg0, float arg1, float arg2, float arg3) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.floatParam(arg0);
		__buffer.floatParam(arg1);
		__buffer.floatParam(arg2);
		__buffer.floatParam(arg3);
		return nclSetKernelArg(kernel, arg_index, (1 << 2) * 4, __buffer.address(arg_value));
	}

	/** Single double value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg1d(long kernel, int arg_index, double arg0) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.doubleParam(arg0);
		return nclSetKernelArg(kernel, arg_index, (1 << 3) * 1, __buffer.address(arg_value));
	}

	/** double2 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg2d(long kernel, int arg_index, double arg0, double arg1) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.doubleParam(arg0);
		__buffer.doubleParam(arg1);
		return nclSetKernelArg(kernel, arg_index, (1 << 3) * 2, __buffer.address(arg_value));
	}

	/** double3 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg3d(long kernel, int arg_index, double arg0, double arg1, double arg2) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.doubleParam(arg0);
		__buffer.doubleParam(arg1);
		__buffer.doubleParam(arg2);
		return nclSetKernelArg(kernel, arg_index, (1 << 3) * 3, __buffer.address(arg_value));
	}

	/** double4 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg4d(long kernel, int arg_index, double arg0, double arg1, double arg2, double arg3) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.doubleParam(arg0);
		__buffer.doubleParam(arg1);
		__buffer.doubleParam(arg2);
		__buffer.doubleParam(arg3);
		return nclSetKernelArg(kernel, arg_index, (1 << 3) * 4, __buffer.address(arg_value));
	}

	/** Single pointer value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg1p(long kernel, int arg_index, long arg0) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.pointerParam(arg0);
		return nclSetKernelArg(kernel, arg_index, (1 << POINTER_SHIFT) * 1, __buffer.address(arg_value));
	}

	/** pointer2 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg2p(long kernel, int arg_index, long arg0, long arg1) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.pointerParam(arg0);
		__buffer.pointerParam(arg1);
		return nclSetKernelArg(kernel, arg_index, (1 << POINTER_SHIFT) * 2, __buffer.address(arg_value));
	}

	/** pointer3 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg3p(long kernel, int arg_index, long arg0, long arg1, long arg2) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.pointerParam(arg0);
		__buffer.pointerParam(arg1);
		__buffer.pointerParam(arg2);
		return nclSetKernelArg(kernel, arg_index, (1 << POINTER_SHIFT) * 3, __buffer.address(arg_value));
	}

	/** pointer4 value version of: {@link #clSetKernelArg SetKernelArg} */
	public static int clSetKernelArg4p(long kernel, int arg_index, long arg0, long arg1, long arg2, long arg3) {
		APIBuffer __buffer = apiBuffer();
		int arg_value = __buffer.pointerParam(arg0);
		__buffer.pointerParam(arg1);
		__buffer.pointerParam(arg2);
		__buffer.pointerParam(arg3);
		return nclSetKernelArg(kernel, arg_index, (1 << POINTER_SHIFT) * 4, __buffer.address(arg_value));
	}

	// --- [ clGetKernelInfo ] ---

	/** JNI method for {@link #clGetKernelInfo GetKernelInfo} */
	@JavadocExclude
	public static native int nclGetKernelInfo(long kernel, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetKernelInfo GetKernelInfo} */
	@JavadocExclude
	public static int nclGetKernelInfo(long kernel, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetKernelInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(kernel);
		return nclGetKernelInfo(kernel, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns information about a kernel object.
	 *
	 * @param kernel               the kernel object being queried
	 * @param param_name           the information to query. One of:<br>{@link #CL_KERNEL_FUNCTION_NAME KERNEL_FUNCTION_NAME}, {@link #CL_KERNEL_NUM_ARGS KERNEL_NUM_ARGS}, {@link #CL_KERNEL_REFERENCE_COUNT KERNEL_REFERENCE_COUNT}, {@link #CL_KERNEL_CONTEXT KERNEL_CONTEXT}, {@link #CL_KERNEL_PROGRAM KERNEL_PROGRAM}, {@link CL12#CL_KERNEL_ATTRIBUTES KERNEL_ATTRIBUTES}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetKernelInfo(long kernel, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetKernelInfo(kernel, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetKernelInfo GetKernelInfo} */
	public static int clGetKernelInfo(long kernel, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetKernelInfo(kernel, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetKernelInfo GetKernelInfo} */
	public static int clGetKernelInfo(long kernel, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetKernelInfo(kernel, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetKernelInfo GetKernelInfo} */
	public static int clGetKernelInfo(long kernel, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetKernelInfo(kernel, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clGetKernelWorkGroupInfo ] ---

	/** JNI method for {@link #clGetKernelWorkGroupInfo GetKernelWorkGroupInfo} */
	@JavadocExclude
	public static native int nclGetKernelWorkGroupInfo(long kernel, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetKernelWorkGroupInfo GetKernelWorkGroupInfo} */
	@JavadocExclude
	public static int nclGetKernelWorkGroupInfo(long kernel, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetKernelWorkGroupInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(kernel);
			checkPointer(device);
		}
		return nclGetKernelWorkGroupInfo(kernel, device, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns information about the kernel object that may be specific to a device.
	 *
	 * @param kernel               the kernel object being queried
	 * @param device               identifies a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL context
	 *                             that is associated with {@code kernel}. If the list of devices associated with {@code kernel} is a single device, {@code device} can be a {@code NULL} value.
	 * @param param_name           the information to query. One of:<br>{@link #CL_KERNEL_WORK_GROUP_SIZE KERNEL_WORK_GROUP_SIZE}, {@link #CL_KERNEL_COMPILE_WORK_GROUP_SIZE KERNEL_COMPILE_WORK_GROUP_SIZE}, {@link #CL_KERNEL_LOCAL_MEM_SIZE KERNEL_LOCAL_MEM_SIZE}, {@link CL11#CL_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE}, {@link CL11#CL_KERNEL_PRIVATE_MEM_SIZE KERNEL_PRIVATE_MEM_SIZE}, {@link CL12#CL_KERNEL_GLOBAL_WORK_SIZE KERNEL_GLOBAL_WORK_SIZE}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not in the list of devices associated with {@code kernel} or if {@code device} is {@code NULL} but there is
	 *         more than one device associated with {@code kernel}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is {@link CL12#CL_KERNEL_GLOBAL_WORK_SIZE KERNEL_GLOBAL_WORK_SIZE} and {@code device} is not a custom device or kernel is
	 *         not a built-in kernel.</li>
	 *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetKernelWorkGroupInfo(long kernel, long device, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetKernelWorkGroupInfo(kernel, device, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetKernelWorkGroupInfo GetKernelWorkGroupInfo} */
	public static int clGetKernelWorkGroupInfo(long kernel, long device, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetKernelWorkGroupInfo(kernel, device, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetKernelWorkGroupInfo GetKernelWorkGroupInfo} */
	public static int clGetKernelWorkGroupInfo(long kernel, long device, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetKernelWorkGroupInfo(kernel, device, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** LongBuffer version of: {@link #clGetKernelWorkGroupInfo GetKernelWorkGroupInfo} */
	public static int clGetKernelWorkGroupInfo(long kernel, long device, int param_name, LongBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetKernelWorkGroupInfo(kernel, device, param_name, (param_value == null ? 0 : param_value.remaining()) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetKernelWorkGroupInfo GetKernelWorkGroupInfo} */
	public static int clGetKernelWorkGroupInfo(long kernel, long device, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetKernelWorkGroupInfo(kernel, device, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clEnqueueNDRangeKernel ] ---

	/** JNI method for {@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} */
	@JavadocExclude
	public static native int nclEnqueueNDRangeKernel(long command_queue, long kernel, int work_dim, long global_work_offset, long global_work_size, long local_work_size, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} */
	@JavadocExclude
	public static int nclEnqueueNDRangeKernel(long command_queue, long kernel, int work_dim, long global_work_offset, long global_work_size, long local_work_size, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueNDRangeKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(kernel);
		}
		return nclEnqueueNDRangeKernel(command_queue, kernel, work_dim, global_work_offset, global_work_size, local_work_size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to execute a kernel on a device.
	 *
	 * @param command_queue           a valid command-queue. The kernel will be queued for execution on the device associated with {@code command_queue}.
	 * @param kernel                  a valid kernel object. The OpenCL context associated with {@code kernel} and {@code command_queue} must be the same.
	 * @param work_dim                the number of dimensions used to specify the global work-items and work-items in the work-group. {@code work_dim} must be greater than zero and less
	 *                                than or equal to {@link #CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS DEVICE_MAX_WORK_ITEM_DIMENSIONS}.
	 * @param global_work_offset      can be used to specify an array of {@code work_dim} unsigned values that describe the offset used to calculate the global ID of a work-item. If
	 *                                {@code global_work_offset} is {@code NULL}, the global IDs start at offset <code style="font-family: monospace">(0, 0, &hellip; 0)</code>.
	 * @param global_work_size        points to an array of {@code work_dim} unsigned values that describe the number of global work-items in {@code work_dim} dimensions that will
	 *                                execute the kernel function. The total number of global work-items is computed as <code style="font-family: monospace">global_work_size[0] * &hellip; * global_work_size[work_dim – 1]</code>.
	 * @param local_work_size         points to an array of {@code work_dim} unsigned values that describe the number of work-items that make up a work-group (also referred to as the
	 *                                size of the work-group) that will execute the kernel specified by {@code kernel}. The total number of work-items in a work-group is computed as
	 *                                <code style="font-family: monospace">local_work_size[0] * &hellip; * local_work_size[work_dim – 1]</code>. The total number of work-items in the work-group must be less than or equal to
	 *                                the {@link #CL_DEVICE_MAX_WORK_GROUP_SIZE DEVICE_MAX_WORK_GROUP_SIZE} value and the number of work-items specified in <code style="font-family: monospace">local_work_size[0], &hellip; local_work_size[work_dim – 1]</code>
	 *                                must be less than or equal to the corresponding values specified by {@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}<code style="font-family: monospace">[0]</code>, &hellip;
	 *                                {@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}<code style="font-family: monospace">[work_dim – 1]</code>. The explicitly specified {@code local_work_size} will be used to determine how to
	 *                                break the global work-items specified by {@code global_work_size} into appropriate work-group instances. If {@code local_work_size} is specified, the
	 *                                values specified in <code style="font-family: monospace">global_work_size[0], &hellip; global_work_size[work_dim - 1]</code> must be evenly divisible by the corresponding values
	 *                                specified in <code style="font-family: monospace">local_work_size[0], &hellip; local_work_size[work_dim – 1]</code>.
	 *                                
	 *                                <p>The work-group size to be used for kernel can also be specified in the program source using the
	 *                                <code style="font-family: monospace">__attribute__((reqd_work_group_size(X, Y, Z)))</code> qualifier. In this case the size of work group specified by {@code local_work_size} must
	 *                                match the value specified by the {@code reqd_work_group_size} attribute qualifier.</p>
	 *                                
	 *                                <p>{@code local_work_size} can also be a {@code NULL} value in which case the OpenCL implementation will determine how to be break the global work-items into
	 *                                appropriate work-group instances.</p>
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the kernel execution was successfully queued. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} if there is no successfully built program executable available for device associated with {@code command_queue}.</li>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and {@code kernel} are not the same or if the context associated with
	 *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_KERNEL_ARGS INVALID_KERNEL_ARGS} if the kernel argument values have not been specified.</li>
	 *         <li>{@link #CL_INVALID_WORK_DIMENSION INVALID_WORK_DIMENSION} if {@code work_dim} is not a valid value (i.e. a value between 1 and 3).</li>
	 *         <li>{@link #CL_INVALID_GLOBAL_WORK_SIZE INVALID_GLOBAL_WORK_SIZE} if {@code global_work_size} is {@code NULL}, or if any of the values specified in
	 *         <code style="font-family: monospace">global_work_size[0], &hellip; global_work_size[work_dim – 1]</code> are 0 or exceed the range given by the {@code sizeof(size_t)} for the device
	 *         on which the kernel execution will be enqueued.</li>
	 *         <li>{@link #CL_INVALID_GLOBAL_OFFSET INVALID_GLOBAL_OFFSET} if the value specified in {@code global_work_size} + the corresponding values in {@code global_work_offset} for
	 *         any dimensions is greater than the {@code sizeof(size_t)} for the device on which the kernel execution will be enqueued.</li>
	 *         <li>{@link #CL_INVALID_WORK_GROUP_SIZE INVALID_WORK_GROUP_SIZE} if {@code local_work_size} is specified and number of work-items specified by {@code global_work_size} is not
	 *         evenly divisible by size of work-group given by {@code local_work_size} or does not match the work-group size specified for kernel using the
	 *         <code style="font-family: monospace">__attribute__((reqd_work_group_size(X, Y, Z)))</code> qualifier in program source.</li>
	 *         <li>{@link #CL_INVALID_WORK_GROUP_SIZE INVALID_WORK_GROUP_SIZE} if {@code local_work_size} is specified and the total number of work-items in the work-group computed as
	 *         <code style="font-family: monospace">local_work_size[0] * &hellip; * local_work_size[work_dim – 1]</code> is greater than the value specified by {@link #CL_DEVICE_MAX_WORK_GROUP_SIZE DEVICE_MAX_WORK_GROUP_SIZE}</li>
	 *         <li>{@link #CL_INVALID_WORK_GROUP_SIZE INVALID_WORK_GROUP_SIZE} if {@code local_work_size} is {@code NULL} and the <code style="font-family: monospace">__attribute__((reqd_work_group_size(X, Y, Z)))</code> qualifier
	 *         is used to declare the work-group size for kernel in the program source.</li>
	 *         <li>{@link #CL_INVALID_WORK_ITEM_SIZE INVALID_WORK_ITEM_SIZE} if the number of work-items specified in any of <code style="font-family: monospace">local_work_size[0], &hellip; local_work_size[work_dim – 1]</code>
	 *         is greater than the corresponding values specified by {@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}{@code [0]}, &hellip; {@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}{@code [work_dim – 1]}.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if a sub-buffer object is specified as the value for an argument that is a buffer object and the offset
	 *         specified when the sub-buffer object is created is not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if an image object is specified as an argument value and the image dimensions (image width, height, specified or
	 *         compute row and/or slice pitch) are not supported by device associated with queue.</li>
	 *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if an image object is specified as an argument value and the image format (image channel order and data type)
	 *         is not supported by device associated with queue.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to queue the execution instance of kernel on the command-queue because of insufficient resources
	 *         needed to execute the kernel. For example, the explicitly specified {@code local_work_size} causes a failure to execute the kernel because of
	 *         insufficient resources such as registers or local memory. Another example would be the number of read-only image args used in kernel exceed the
	 *         {@link #CL_DEVICE_MAX_READ_IMAGE_ARGS DEVICE_MAX_READ_IMAGE_ARGS} value for device or the number of write-only image args used in kernel exceed the
	 *         {@link #CL_DEVICE_MAX_WRITE_IMAGE_ARGS DEVICE_MAX_WRITE_IMAGE_ARGS} value for device or the number of samplers used in kernel exceed {@link #CL_DEVICE_MAX_SAMPLERS DEVICE_MAX_SAMPLERS} for device.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with image or buffer objects specified
	 *         as arguments to kernel.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueNDRangeKernel(long command_queue, long kernel, int work_dim, ByteBuffer global_work_offset, ByteBuffer global_work_size, ByteBuffer local_work_size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			if ( global_work_offset != null ) checkBuffer(global_work_offset, work_dim << POINTER_SHIFT);
			if ( global_work_size != null ) checkBuffer(global_work_size, work_dim << POINTER_SHIFT);
			if ( local_work_size != null ) checkBuffer(local_work_size, work_dim << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueNDRangeKernel(command_queue, kernel, work_dim, memAddressSafe(global_work_offset), memAddressSafe(global_work_size), memAddressSafe(local_work_size), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} */
	public static int clEnqueueNDRangeKernel(long command_queue, long kernel, int work_dim, PointerBuffer global_work_offset, PointerBuffer global_work_size, PointerBuffer local_work_size, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			if ( global_work_offset != null ) checkBuffer(global_work_offset, work_dim);
			if ( global_work_size != null ) checkBuffer(global_work_size, work_dim);
			if ( local_work_size != null ) checkBuffer(local_work_size, work_dim);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueNDRangeKernel(command_queue, kernel, work_dim, memAddressSafe(global_work_offset), memAddressSafe(global_work_size), memAddressSafe(local_work_size), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueTask ] ---

	/** JNI method for {@link #clEnqueueTask EnqueueTask} */
	@JavadocExclude
	public static native int nclEnqueueTask(long command_queue, long kernel, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueTask EnqueueTask} */
	@JavadocExclude
	public static int nclEnqueueTask(long command_queue, long kernel, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueTask;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(kernel);
		}
		return nclEnqueueTask(command_queue, kernel, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to execute a kernel on a device. The kernel is executed using a single work-item.
	 * 
	 * <p>{@code clEnqueueTask} is equivalent to calling {@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} with {@code work_dim = 1}, {@code global_work_offset = NULL},
	 * {@code global_work_size[0]} set to 1 and {@code local_work_size[0]} set to 1.</p>
	 *
	 * @param command_queue           a valid command-queue. The kernel will be queued for execution on the device associated with {@code command_queue}.
	 * @param kernel                  a valid kernel object. The OpenCL context associated with {@code kernel} and {@code command_queue} must be the same.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the kernel execution was successfully queued. Otherwise, see {@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel}.
	 */
	public static int clEnqueueTask(long command_queue, long kernel, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueTask(command_queue, kernel, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueTask EnqueueTask} */
	public static int clEnqueueTask(long command_queue, long kernel, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueTask(command_queue, kernel, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueNativeKernel ] ---

	/** JNI method for {@link #clEnqueueNativeKernel EnqueueNativeKernel} */
	@JavadocExclude
	public static native int nclEnqueueNativeKernel(long command_queue, long user_func, long args, long cb_args, int num_mem_objects, long mem_list, long args_mem_loc, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueNativeKernel EnqueueNativeKernel} */
	@JavadocExclude
	public static int nclEnqueueNativeKernel(long command_queue, long user_func, long args, long cb_args, int num_mem_objects, long mem_list, long args_mem_loc, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueNativeKernel;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclEnqueueNativeKernel(command_queue, user_func, args, cb_args, num_mem_objects, mem_list, args_mem_loc, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to execute a native C/C++ function not compiled using the OpenCL compiler.
	 *
	 * @param command_queue           a valid command-queue. A native user function can only be executed on a command-queue created on a device that has {@link #CL_EXEC_NATIVE_KERNEL EXEC_NATIVE_KERNEL}
	 *                                capability set in {@link #CL_DEVICE_EXECUTION_CAPABILITIES DEVICE_EXECUTION_CAPABILITIES}.
	 * @param user_func               a pointer to a host-callable user function
	 * @param args                    a pointer to the args list that {@code user_func} should be called with
	 * @param cb_args                 the size in bytes of the args list that {@code args} points to.
	 *                                
	 *                                <p>The data pointed to by {@code args} and {@code cb_args} bytes in size will be copied and a pointer to this copied region will be passed to
	 *                                {@code user_func}. The copy needs to be done because the memory objects (cl_mem values) that args may contain need to be modified and replaced by
	 *                                appropriate pointers to global memory. When {@code clEnqueueNativeKernel} returns, the memory region pointed to by args can be reused by the
	 *                                application.</p>
	 * @param num_mem_objects         the number of buffer objects that are passed in {@code args}
	 * @param mem_list                a list of valid buffer objects, if {@code num_mem_objects} &gt; 0. The buffer object values specified in {@code mem_list} are memory object handles
	 *                                (cl_mem values) returned by {@link #clCreateBuffer CreateBuffer} or {@code NULL}.
	 * @param args_mem_loc            a pointer to appropriate locations that {@code args} points to where memory object handles (cl_mem values) are stored. Before the user function is
	 *                                executed, the memory object handles are replaced by pointers to global memory.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the user function execution instance was successfully queued. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code user_func} is {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code args} is a {@code NULL} value and {@code cb_args} &gt; 0, or if {@code args} is a {@code NULL} value and
	 *         {@code num_mem_objects} &gt; 0.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code args} is not {@code NULL} and {@code cb_args} is 0.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_mem_objects} &gt; 0 and {@code mem_list} or {@code args_mem_loc} are {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_mem_objects} = 0 and {@code mem_list} or {@code args_mem_loc} are not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} cannot execute the native kernel.</li>
	 *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if one or more memory objects specified in {@code mem_list} are not valid or are not buffer objects.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to queue the execution instance of kernel on the command-queue because of insufficient resources
	 *         needed to execute the kernel.</li>
	 *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer objects specified as
	 *         arguments to kernel.</li>
	 *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueNativeKernel(long command_queue, CLNativeKernel user_func, ByteBuffer args, long cb_args, int num_mem_objects, ByteBuffer mem_list, ByteBuffer args_mem_loc, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			if ( args != null ) checkBuffer(args, cb_args);
			if ( mem_list != null ) checkBuffer(mem_list, num_mem_objects << POINTER_SHIFT);
			if ( args_mem_loc != null ) checkBuffer(args_mem_loc, num_mem_objects << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueNativeKernel(command_queue, user_func.getPointer(), memAddressSafe(args), cb_args, num_mem_objects, memAddressSafe(mem_list), memAddressSafe(args_mem_loc), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueNativeKernel EnqueueNativeKernel} */
	public static int clEnqueueNativeKernel(long command_queue, CLNativeKernel user_func, ByteBuffer args, PointerBuffer mem_list, PointerBuffer args_mem_loc, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			if ( args_mem_loc != null ) checkBuffer(args_mem_loc, mem_list.remaining());
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueNativeKernel(command_queue, user_func.getPointer(), memAddressSafe(args), args == null ? 0 : args.remaining(), mem_list == null ? 0 : mem_list.remaining(), memAddressSafe(mem_list), memAddressSafe(args_mem_loc), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Single value version of: {@link #clEnqueueNativeKernel EnqueueNativeKernel} */
	public static int clEnqueueNativeKernel(long command_queue, CLNativeKernel user_func, ByteBuffer args, long memobj, long memobj_loc, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		APIBuffer __buffer = apiBuffer();
		int mem_list = __buffer.pointerParam(memobj);
		int args_mem_loc = __buffer.pointerParam(memobj_loc);
		return nclEnqueueNativeKernel(command_queue, user_func.getPointer(), memAddressSafe(args), args == null ? 0 : args.remaining(), 1, __buffer.address(mem_list), __buffer.address(args_mem_loc), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clWaitForEvents ] ---

	/** JNI method for {@link #clWaitForEvents WaitForEvents} */
	@JavadocExclude
	public static native int nclWaitForEvents(int num_events, long event_list, long __functionAddress);

	/** Unsafe version of {@link #clWaitForEvents WaitForEvents} */
	@JavadocExclude
	public static int nclWaitForEvents(int num_events, long event_list) {
		long __functionAddress = getInstance().WaitForEvents;
		return nclWaitForEvents(num_events, event_list, __functionAddress);
	}

	/**
	 * Waits on the host thread for commands identified by event objects in {@code event_list} to complete. A command is considered complete if its execution
	 * status is {@link #CL_COMPLETE COMPLETE} or a negative value. The events specified in {@code event_list} act as synchronization points.
	 *
	 * @param num_events the number of events in {@code event_list}
	 * @param event_list the list of events
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the execution status of all events in event_list is {@link #CL_COMPLETE COMPLETE}. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_events} is zero or {@code event_list} is {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if events specified in {@code event_list} do not belong to the same context.</li>
	 *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if event objects specified in {@code event_list} are not valid event objects.</li>
	 *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the execution status of any of the events in {@code event_list} is a negative integer value.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clWaitForEvents(int num_events, ByteBuffer event_list) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(event_list, num_events << POINTER_SHIFT);
		return nclWaitForEvents(num_events, memAddress(event_list));
	}

	/** Alternative version of: {@link #clWaitForEvents WaitForEvents} */
	public static int clWaitForEvents(PointerBuffer event_list) {
		return nclWaitForEvents(event_list.remaining(), memAddress(event_list));
	}

	/** Single value version of: {@link #clWaitForEvents WaitForEvents} */
	public static int clWaitForEvents(long event) {
		APIBuffer __buffer = apiBuffer();
		int event_list = __buffer.pointerParam(event);
		return nclWaitForEvents(1, __buffer.address(event_list));
	}

	// --- [ clGetEventInfo ] ---

	/** JNI method for {@link #clGetEventInfo GetEventInfo} */
	@JavadocExclude
	public static native int nclGetEventInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetEventInfo GetEventInfo} */
	@JavadocExclude
	public static int nclGetEventInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetEventInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(event);
		return nclGetEventInfo(event, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns information about an event object.
	 * 
	 * <p>Using {@code clGetEventInfo} to determine if a command identified by event has finished execution (i.e. {@link #CL_EVENT_COMMAND_EXECUTION_STATUS EVENT_COMMAND_EXECUTION_STATUS}
	 * returns {@link #CL_COMPLETE COMPLETE}) is not a synchronization point. There are no guarantees that the memory objects being modified by command associated with
	 * event will be visible to other enqueued commands.</p>
	 *
	 * @param event                the event object being queried
	 * @param param_name           the information to query. One of:<br>{@link #CL_EVENT_COMMAND_QUEUE EVENT_COMMAND_QUEUE}, {@link #CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}, {@link #CL_EVENT_REFERENCE_COUNT EVENT_REFERENCE_COUNT}, {@link #CL_EVENT_COMMAND_EXECUTION_STATUS EVENT_COMMAND_EXECUTION_STATUS}, {@link CL11#CL_EVENT_CONTEXT EVENT_CONTEXT}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if information to query given in {@code param_name} cannot be queried for event.</li>
	 *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if {@code event} is a not a valid event object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetEventInfo(long event, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetEventInfo(event, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetEventInfo GetEventInfo} */
	public static int clGetEventInfo(long event, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetEventInfo(event, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetEventInfo GetEventInfo} */
	public static int clGetEventInfo(long event, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetEventInfo(event, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetEventInfo GetEventInfo} */
	public static int clGetEventInfo(long event, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetEventInfo(event, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clRetainEvent ] ---

	/** JNI method for {@link #clRetainEvent RetainEvent} */
	@JavadocExclude
	public static native int nclRetainEvent(long event, long __functionAddress);

	/**
	 * Increments the event reference count. The OpenCL commands that return an event perform an implicit retain.
	 *
	 * @param event the event to retain
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if {@code event} is not a valid event object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainEvent(long event) {
		long __functionAddress = getInstance().RetainEvent;
		if ( LWJGLUtil.CHECKS )
			checkPointer(event);
		return nclRetainEvent(event, __functionAddress);
	}

	// --- [ clReleaseEvent ] ---

	/** JNI method for {@link #clReleaseEvent ReleaseEvent} */
	@JavadocExclude
	public static native int nclReleaseEvent(long event, long __functionAddress);

	/**
	 * Decrements the event reference count.
	 * 
	 * <p>The event object is deleted once the reference count becomes zero, the specific command identified by this event has completed (or terminated) and there
	 * are no commands in the command-queues of a context that require a wait for this event to complete.</p>
	 * 
	 * <p><strong>NOTE</strong>: Developers should be careful when releasing their last reference count on events created by {@link CL11#clCreateUserEvent CreateUserEvent} that
	 * have not yet been set to status of {@link #CL_COMPLETE COMPLETE} or an error. If the user event was used in the {@code event_wait_list} argument passed to a
	 * clEnqueue*** API or another application host thread is waiting for it in {@link #clWaitForEvents WaitForEvents}, those commands and host threads will continue to wait for the
	 * event status to reach {@link #CL_COMPLETE COMPLETE} or error, even after the user has released the object. Since in this scenario the developer has released his
	 * last reference count to the user event, it would be in principle no longer valid for him to change the status of the event to unblock all the other
	 * machinery. As a result the waiting tasks will wait forever, and associated events, cl_mem objects, command queues and contexts are likely to leak.
	 * In-order command-queues caught up in this deadlock may cease to do any work.</p>
	 *
	 * @param event the event to release
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if {@code event} is not a valid event object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseEvent(long event) {
		long __functionAddress = getInstance().ReleaseEvent;
		if ( LWJGLUtil.CHECKS )
			checkPointer(event);
		return nclReleaseEvent(event, __functionAddress);
	}

	// --- [ clEnqueueMarker ] ---

	/** JNI method for {@link #clEnqueueMarker EnqueueMarker} */
	@JavadocExclude
	public static native int nclEnqueueMarker(long command_queue, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueMarker EnqueueMarker} */
	@JavadocExclude
	public static int nclEnqueueMarker(long command_queue, long event) {
		long __functionAddress = getInstance().EnqueueMarker;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclEnqueueMarker(command_queue, event, __functionAddress);
	}

	/**
	 * Enqueues a marker command to {@code command_queue}. The marker command is not completed until all commands enqueued before it have completed. The marker
	 * command returns an event which can be waited on, i.e. this event can be waited on to insure that all commands, which have been queued before the marker
	 * command, have been completed.
	 *
	 * @param command_queue the command-queue to insert the marker to
	 * @param event         Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                      {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                      complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                      {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is successfully executed. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code event} is a {@code NULL} value.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueMarker(long command_queue, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		return nclEnqueueMarker(command_queue, memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueMarker EnqueueMarker} */
	public static int clEnqueueMarker(long command_queue, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueMarker(command_queue, memAddressSafe(event));
	}

	// --- [ clEnqueueBarrier ] ---

	/** JNI method for {@link #clEnqueueBarrier EnqueueBarrier} */
	@JavadocExclude
	public static native int nclEnqueueBarrier(long command_queue, long __functionAddress);

	/**
	 * Enqueues a barrier operation. The {@code clEnqueueBarrier} command ensures that all queued commands in {@code command_queue} have finished execution
	 * before the next batch of commands can begin execution. The {@code clEnqueueBarrier} command is a synchronization point.
	 *
	 * @param command_queue the command-queue to insert the barrier to
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is successfully executed. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueBarrier(long command_queue) {
		long __functionAddress = getInstance().EnqueueBarrier;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclEnqueueBarrier(command_queue, __functionAddress);
	}

	// --- [ clEnqueueWaitForEvents ] ---

	/** JNI method for {@link #clEnqueueWaitForEvents EnqueueWaitForEvents} */
	@JavadocExclude
	public static native int nclEnqueueWaitForEvents(long command_queue, int num_events, long event_list, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueWaitForEvents EnqueueWaitForEvents} */
	@JavadocExclude
	public static int nclEnqueueWaitForEvents(long command_queue, int num_events, long event_list) {
		long __functionAddress = getInstance().EnqueueWaitForEvents;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclEnqueueWaitForEvents(command_queue, num_events, event_list, __functionAddress);
	}

	/**
	 * Enqueues a wait for a specific event or a list of events to complete before any future commands queued in the command-queue are executed.
	 *
	 * @param command_queue the command-queue
	 * @param num_events    the number of events in {@code event_list}
	 * @param event_list    the list of events
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function was successfully executed. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and events in {@code event_list} are not the same.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_events} is zero or {@code event_list} is {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if event objects specified in {@code event_list} are not valid events.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueWaitForEvents(long command_queue, int num_events, ByteBuffer event_list) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(event_list, num_events << POINTER_SHIFT);
		return nclEnqueueWaitForEvents(command_queue, num_events, memAddress(event_list));
	}

	/** Alternative version of: {@link #clEnqueueWaitForEvents EnqueueWaitForEvents} */
	public static int clEnqueueWaitForEvents(long command_queue, PointerBuffer event_list) {
		return nclEnqueueWaitForEvents(command_queue, event_list.remaining(), memAddress(event_list));
	}

	/** Single value version of: {@link #clEnqueueWaitForEvents EnqueueWaitForEvents} */
	public static int clEnqueueWaitForEvents(long command_queue, long event) {
		APIBuffer __buffer = apiBuffer();
		int event_list = __buffer.pointerParam(event);
		return nclEnqueueWaitForEvents(command_queue, 1, __buffer.address(event_list));
	}

	// --- [ clGetEventProfilingInfo ] ---

	/** JNI method for {@link #clGetEventProfilingInfo GetEventProfilingInfo} */
	@JavadocExclude
	public static native int nclGetEventProfilingInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetEventProfilingInfo GetEventProfilingInfo} */
	@JavadocExclude
	public static int nclGetEventProfilingInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetEventProfilingInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(event);
		return nclGetEventProfilingInfo(event, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns profiling information for the command associated with {@code event}.
	 *
	 * @param event                the event object
	 * @param param_name           the profiling data to query. One of:<br>{@link #CL_PROFILING_COMMAND_QUEUED PROFILING_COMMAND_QUEUED}, {@link #CL_PROFILING_COMMAND_SUBMIT PROFILING_COMMAND_SUBMIT}, {@link #CL_PROFILING_COMMAND_START PROFILING_COMMAND_START}, {@link #CL_PROFILING_COMMAND_END PROFILING_COMMAND_END}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully and the profiling information has been recorded. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_PROFILING_INFO_NOT_AVAILABLE PROFILING_INFO_NOT_AVAILABLE} if the {@link #CL_QUEUE_PROFILING_ENABLE QUEUE_PROFILING_ENABLE} flag is not set for the command-queue, if the execution status of
	 *         the command identified by {@code event} is not {@link #CL_COMPLETE COMPLETE} or if {@code event} is a user event object.</li>
	 *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if {@code event} is a not a valid event object.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetEventProfilingInfo(long event, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetEventProfilingInfo(event, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetEventProfilingInfo GetEventProfilingInfo} */
	public static int clGetEventProfilingInfo(long event, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetEventProfilingInfo(event, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** LongBuffer version of: {@link #clGetEventProfilingInfo GetEventProfilingInfo} */
	public static int clGetEventProfilingInfo(long event, int param_name, LongBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetEventProfilingInfo(event, param_name, (param_value == null ? 0 : param_value.remaining()) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clFlush ] ---

	/** JNI method for {@link #clFlush Flush} */
	@JavadocExclude
	public static native int nclFlush(long command_queue, long __functionAddress);

	/**
	 * Issues all previously queued OpenCL commands in {@code command_queue} to the device associated with {@code command_queue}. {@code clFlush} only
	 * guarantees that all queued commands to {@code command_queue} will eventually be submitted to the appropriate device. There is no guarantee that they
	 * will be complete after {@code clFlush} returns.
	 * 
	 * <p>Any blocking commands queued in a command-queue and {@link #clReleaseCommandQueue ReleaseCommandQueue} perform an implicit flush of the command-queue. These blocking commands are
	 * {@link #clEnqueueReadBuffer EnqueueReadBuffer}, {@link CL11#clEnqueueReadBufferRect EnqueueReadBufferRect}, {@link #clEnqueueReadImage EnqueueReadImage}, with {@code blocking_read} set to {@link #CL_TRUE TRUE}; {@link #clEnqueueWriteBuffer EnqueueWriteBuffer},
	 * {@link CL11#clEnqueueWriteBufferRect EnqueueWriteBufferRect}, {@link #clEnqueueWriteImage EnqueueWriteImage} with {@code blocking_write} set to {@link #CL_TRUE TRUE}; {@link #clEnqueueMapBuffer EnqueueMapBuffer}, {@link #clEnqueueMapImage EnqueueMapImage} with
	 * {@code blocking_map} set to {@link #CL_TRUE TRUE}; or {@link #clWaitForEvents WaitForEvents}.</p>
	 * 
	 * <p>To use event objects that refer to commands enqueued in a command-queue as event objects to wait on by commands enqueued in a different command-queue,
	 * the application must call a {@code clFlush} or any blocking commands that perform an implicit flush of the command-queue where the commands that refer
	 * to these event objects are enqueued.</p>
	 *
	 * @param command_queue the command-queue
	 *
	 * @return {@link #CL_SUCCESS SUCCESS} if the function call was executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clFlush(long command_queue) {
		long __functionAddress = getInstance().Flush;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclFlush(command_queue, __functionAddress);
	}

	// --- [ clFinish ] ---

	/** JNI method for {@link #clFinish Finish} */
	@JavadocExclude
	public static native int nclFinish(long command_queue, long __functionAddress);

	/**
	 * Blocks until all previously queued OpenCL commands in {@code command_queue} are issued to the associated device and have completed. {@code clFinish}
	 * does not return until all previously queued commands in {@code command_queue} have been processed and completed. {@code clFinish} is also a
	 * synchronization point.
	 *
	 * @param command_queue the command-queue
	 */
	public static int clFinish(long command_queue) {
		long __functionAddress = getInstance().Finish;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclFinish(command_queue, __functionAddress);
	}

	// --- [ clGetExtensionFunctionAddress ] ---

	/** JNI method for {@link #clGetExtensionFunctionAddress GetExtensionFunctionAddress} */
	@JavadocExclude
	public static native long nclGetExtensionFunctionAddress(long funcname, long __functionAddress);

	/** Unsafe version of {@link #clGetExtensionFunctionAddress GetExtensionFunctionAddress} */
	@JavadocExclude
	public static long nclGetExtensionFunctionAddress(long funcname) {
		long __functionAddress = getInstance().GetExtensionFunctionAddress;
		return nclGetExtensionFunctionAddress(funcname, __functionAddress);
	}

	/**
	 * Returns the address of the extension function named by {@code funcname}. The pointer returned should be cast to a function pointer type matching the
	 * extension function's definition defined in the appropriate extension specification and header file. A return value of {@code NULL} indicates that the specified
	 * function does not exist for the implementation. A non-{@code NULL} return value for {@code clGetExtensionFunctionAddress} does not guarantee that an extension
	 * function is actually supported. The application must also make a corresponding query using <code style="font-family: monospace">clGetPlatformInfo(platform, CL_PLATFORM_EXTENSIONS, &hellip; )</code>
	 * or <code style="font-family: monospace">clGetDeviceInfo(device, CL_DEVICE_EXTENSIONS, &hellip; )</code> to determine if an extension is supported by the OpenCL implementation.
	 * 
	 * <p>{@code clGetExtensionFunctionAddress} may not be queried for core (non-extension) functions in OpenCL. For functions that are queryable with
	 * {@code clGetExtensionFunctionAddress}, implementations may choose to also export those functions statically from the object libraries implementing those
	 * functions. However, portable applications cannot rely on this behavior.</p>
	 *
	 * @param funcname the extension function name
	 *
	 * @return the extension function address
	 */
	public static long clGetExtensionFunctionAddress(ByteBuffer funcname) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(funcname);
		return nclGetExtensionFunctionAddress(memAddress(funcname));
	}

	/** CharSequence version of: {@link #clGetExtensionFunctionAddress GetExtensionFunctionAddress} */
	public static long clGetExtensionFunctionAddress(CharSequence funcname) {
		APIBuffer __buffer = apiBuffer();
		int funcnameEncoded = __buffer.stringParamASCII(funcname, true);
		return nclGetExtensionFunctionAddress(__buffer.address(funcnameEncoded));
	}

     /**
	 * Creates a {@link CLCreateContextCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLCreateContextCallback} instance
	 */
	public static CLCreateContextCallback CLCreateContextCallback(final CLCreateContextCallback.SAM sam) {
		return new CLCreateContextCallback() {
			@Override
			public void invoke(long errinfo, long private_info, long cb, long user_data) {
				sam.invoke(errinfo, private_info, cb, user_data);
			}
		};
	}

     /**
	 * Creates a {@link CLProgramCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLProgramCallback} instance
	 */
	public static CLProgramCallback CLProgramCallback(final CLProgramCallback.SAM sam) {
		return new CLProgramCallback() {
			@Override
			public void invoke(long program, long user_data) {
				sam.invoke(program, user_data);
			}
		};
	}

     /**
	 * Creates a {@link CLNativeKernel} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLNativeKernel} instance
	 */
	public static CLNativeKernel CLNativeKernel(final CLNativeKernel.SAM sam) {
		return new CLNativeKernel() {
			@Override
			public void invoke(long args) {
				sam.invoke(args);
			}
		};
	}

}