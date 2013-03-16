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
import static org.lwjgl.system.MemoryUtil.*;

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
		CL_INVALID_GL_OBJECT               = -60,
		CL_INVALID_BUFFER_SIZE             = -61,
		CL_INVALID_MIP_LEVEL               = -62,
		CL_INVALID_GLOBAL_WORK_SIZE        = -63;

	/** OpenCL Version */
	public static final int
		CL_VERSION_1_0 = 0x1;

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
	public static final int
		CL_CONTEXT_PLATFORM = 0x1084;

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

	private CL10() {}

	// --- [ clGetPlatformIDs ] ---

	/** JNI method for {@link #clGetPlatformIDs(int, ByteBuffer, ByteBuffer)} */
	public static native int nclGetPlatformIDs(int num_entries, long platforms, long num_platforms, long __functionAddress);

	/**
	 * Obtains the list of available platforms.
	 *
	 * @param num_entries   the number of cl_platform_id entries that can be added to platforms. If platforms is not NULL, the num_entries must be greater than zero.
	 * @param platforms     returns a list of OpenCL platforms found. The cl_platform_id values returned in platforms can be used to identify a specific OpenCL platform. If
	 *                      platforms argument is NULL, this argument is ignored. The number of OpenCL platforms returned is the minimum of the value specified by num_entries
	 *                      or the number of OpenCL platforms available.
	 * @param num_platforms returns the number of OpenCL platforms available. If num_platforms is NULL, this argument is ignored.
	 */
	public static int clGetPlatformIDs(int num_entries, ByteBuffer platforms, ByteBuffer num_platforms) {
		long __functionAddress = CL.getFunctionProvider().getFunctionAddress("clGetPlatformIDs");
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( platforms != null ) checkBuffer(platforms, num_entries << PointerBuffer.getPointerSizeShift());
			if ( num_platforms != null ) checkBuffer(num_platforms, 1 << 2);
		}
		return nclGetPlatformIDs(num_entries, memAddressSafe(platforms), memAddressSafe(num_platforms), __functionAddress);
	}

	/** Alternative version of: {@link #clGetPlatformIDs(int, ByteBuffer, ByteBuffer)} */
	public static int clGetPlatformIDs(PointerBuffer platforms, IntBuffer num_platforms) {
		long __functionAddress = CL.getFunctionProvider().getFunctionAddress("clGetPlatformIDs");
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( num_platforms != null ) checkBuffer(num_platforms, 1);
		}
		return nclGetPlatformIDs(platforms == null ? 0 : platforms.remaining(), memAddressSafe(platforms), memAddressSafe(num_platforms), __functionAddress);
	}

	// --- [ clGetPlatformInfo ] ---

	/** JNI method for {@link #clGetPlatformInfo(CLPlatform, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetPlatformInfo(long platform, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * Returns information about the given OpenCL platform
	 *
	 * @param platform             the platform to query
	 * @param param_name           the parameter to query. One of:<p/>{@link #CL_PLATFORM_PROFILE}, {@link #CL_PLATFORM_VERSION}, {@link #CL_PLATFORM_NAME}, {@link #CL_PLATFORM_VENDOR}, {@link #CL_PLATFORM_EXTENSIONS}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}
	 * @param param_value          the memory location where appropriate values for a given {@code param_name} will be returned
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}
	 */
	public static int clGetPlatformInfo(CLPlatform platform, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(platform).clGetPlatformInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetPlatformInfo(platform.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetPlatformInfo(CLPlatform, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetPlatformInfo(CLPlatform platform, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(platform).clGetPlatformInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetPlatformInfo(platform.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clGetDeviceIDs ] ---

	/** JNI method for {@link #clGetDeviceIDs(CLPlatform, long, int, ByteBuffer, ByteBuffer)} */
	public static native int nclGetDeviceIDs(long platform, long device_type, int num_entries, long devices, long num_devices, long __functionAddress);

	/**
	 * 
	 *
	 * @param platform    
	 * @param device_type 
	 * @param num_entries 
	 * @param devices     
	 * @param num_devices 
	 */
	public static int clGetDeviceIDs(CLPlatform platform, long device_type, int num_entries, ByteBuffer devices, ByteBuffer num_devices) {
		long __functionAddress = getInstance(platform).clGetDeviceIDs;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( devices != null ) checkBuffer(devices, num_entries << PointerBuffer.getPointerSizeShift());
			if ( num_devices != null ) checkBuffer(num_devices, 1 << 2);
		}
		return nclGetDeviceIDs(platform.getPointer(), device_type, num_entries, memAddressSafe(devices), memAddressSafe(num_devices), __functionAddress);
	}

	/** Alternative version of: {@link #clGetDeviceIDs(CLPlatform, long, int, ByteBuffer, ByteBuffer)} */
	public static int clGetDeviceIDs(CLPlatform platform, long device_type, PointerBuffer devices, IntBuffer num_devices) {
		long __functionAddress = getInstance(platform).clGetDeviceIDs;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( num_devices != null ) checkBuffer(num_devices, 1);
		}
		return nclGetDeviceIDs(platform.getPointer(), device_type, devices == null ? 0 : devices.remaining(), memAddressSafe(devices), memAddressSafe(num_devices), __functionAddress);
	}

	// --- [ clGetDeviceInfo ] ---

	/** JNI method for {@link #clGetDeviceInfo(CLDevice, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetDeviceInfo(long device, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param device               
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetDeviceInfo(CLDevice device, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(device).clGetDeviceInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetDeviceInfo(device.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetDeviceInfo(CLDevice, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetDeviceInfo(CLDevice device, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(device).clGetDeviceInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetDeviceInfo(device.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateContext ] ---

	/** JNI method for {@link #clCreateContext(ByteBuffer, int, ByteBuffer, CLCreateContextCallback, ByteBuffer, ByteBuffer)} */
	public static native long nclCreateContext(long properties, int num_devices, long devices, long pfn_notify, long user_data, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param properties  
	 * @param num_devices 
	 * @param devices     
	 * @param pfn_notify  
	 * @param user_data   
	 * @param errcode_ret 
	 */
	public static CLContext clCreateContext(ByteBuffer properties, int num_devices, ByteBuffer devices, CLCreateContextCallback pfn_notify, ByteBuffer user_data, ByteBuffer errcode_ret) {
		CLPlatform platform = CLContext.getPlatform(properties);
		long __functionAddress = getInstance(platform).clCreateContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(properties, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(devices, num_devices << PointerBuffer.getPointerSizeShift());
			checkBuffer(devices, 1 << PointerBuffer.getPointerSizeShift());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLContext(nclCreateContext(memAddress(properties), num_devices, memAddress(devices), CLCreateContextCallback.CALLBACK, memAddress(user_data), memAddressSafe(errcode_ret), __functionAddress), platform);
	}

	/** Alternative version of: {@link #clCreateContext(ByteBuffer, int, ByteBuffer, CLCreateContextCallback, ByteBuffer, ByteBuffer)} */
	public static CLContext clCreateContext(PointerBuffer properties, PointerBuffer devices, CLCreateContextCallback pfn_notify, ByteBuffer user_data, IntBuffer errcode_ret) {
		CLPlatform platform = CLContext.getPlatform(properties);
		long __functionAddress = getInstance(platform).clCreateContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(properties, 3);
			checkBuffer(devices, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLContext(nclCreateContext(memAddress(properties), devices.remaining(), memAddress(devices), CLCreateContextCallback.CALLBACK, memAddress(user_data), memAddressSafe(errcode_ret), __functionAddress), platform);
	}

	// --- [ clCreateContextFromType ] ---

	/** JNI method for {@link #clCreateContextFromType(ByteBuffer, long, CLCreateContextCallback, ByteBuffer, ByteBuffer)} */
	public static native long nclCreateContextFromType(long properties, long device_type, long pfn_notify, long user_data, long errcode_ret, long __functionAddress);

	/**
	 * Creates a context using devices of the specified type.
	 * <p/>
	 * <b>LWJGL note</b>: {@code properties} must contain the CL_CONTEXT_PLATFORM property.
	 *
	 * @param properties  
	 * @param device_type 
	 * @param pfn_notify  
	 * @param user_data   
	 * @param errcode_ret 
	 */
	public static CLContext clCreateContextFromType(ByteBuffer properties, long device_type, CLCreateContextCallback pfn_notify, ByteBuffer user_data, ByteBuffer errcode_ret) {
		CLPlatform platform = CLContext.getPlatform(properties);
		long __functionAddress = getInstance(platform).clCreateContextFromType;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(properties, 3 << PointerBuffer.getPointerSizeShift());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLContext(nclCreateContextFromType(memAddress(properties), device_type, CLCreateContextCallback.CALLBACK, memAddress(user_data), memAddressSafe(errcode_ret), __functionAddress), platform);
	}

	/** Alternative version of: {@link #clCreateContextFromType(ByteBuffer, long, CLCreateContextCallback, ByteBuffer, ByteBuffer)} */
	public static CLContext clCreateContextFromType(PointerBuffer properties, long device_type, CLCreateContextCallback pfn_notify, ByteBuffer user_data, IntBuffer errcode_ret) {
		CLPlatform platform = CLContext.getPlatform(properties);
		long __functionAddress = getInstance(platform).clCreateContextFromType;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(properties, 3);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLContext(nclCreateContextFromType(memAddress(properties), device_type, CLCreateContextCallback.CALLBACK, memAddress(user_data), memAddressSafe(errcode_ret), __functionAddress), platform);
	}

	// --- [ clRetainContext ] ---

	/** JNI method for {@link #clRetainContext(CLContext)} */
	public static native int nclRetainContext(long context, long __functionAddress);

	/**
	 * 
	 *
	 * @param context 
	 */
	public static int clRetainContext(CLContext context) {
		long __functionAddress = getInstance(context).clRetainContext;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainContext(context.getPointer(), __functionAddress);
	}

	// --- [ clReleaseContext ] ---

	/** JNI method for {@link #clReleaseContext(CLContext)} */
	public static native int nclReleaseContext(long context, long __functionAddress);

	/**
	 * 
	 *
	 * @param context 
	 */
	public static int clReleaseContext(CLContext context) {
		long __functionAddress = getInstance(context).clReleaseContext;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseContext(context.getPointer(), __functionAddress);
	}

	// --- [ clGetContextInfo ] ---

	/** JNI method for {@link #clGetContextInfo(CLContext, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetContextInfo(long context, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param context              
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetContextInfo(CLContext context, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(context).clGetContextInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetContextInfo(context.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetContextInfo(CLContext, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetContextInfo(CLContext context, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(context).clGetContextInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetContextInfo(context.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateCommandQueue ] ---

	/** JNI method for {@link #clCreateCommandQueue(CLContext, CLDevice, long, ByteBuffer)} */
	public static native long nclCreateCommandQueue(long context, long device, long properties, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param context     
	 * @param device      
	 * @param properties  
	 * @param errcode_ret 
	 */
	public static CLCommandQueue clCreateCommandQueue(CLContext context, CLDevice device, long properties, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateCommandQueue;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLCommandQueue(nclCreateCommandQueue(context.getPointer(), device.getPointer(), properties, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateCommandQueue(CLContext, CLDevice, long, ByteBuffer)} */
	public static CLCommandQueue clCreateCommandQueue(CLContext context, CLDevice device, long properties, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateCommandQueue;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLCommandQueue(nclCreateCommandQueue(context.getPointer(), device.getPointer(), properties, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clRetainCommandQueue ] ---

	/** JNI method for {@link #clRetainCommandQueue(CLCommandQueue)} */
	public static native int nclRetainCommandQueue(long command_queue, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 */
	public static int clRetainCommandQueue(CLCommandQueue command_queue) {
		long __functionAddress = getInstance(command_queue).clRetainCommandQueue;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainCommandQueue(command_queue.getPointer(), __functionAddress);
	}

	// --- [ clReleaseCommandQueue ] ---

	/** JNI method for {@link #clReleaseCommandQueue(CLCommandQueue)} */
	public static native int nclReleaseCommandQueue(long command_queue, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 */
	public static int clReleaseCommandQueue(CLCommandQueue command_queue) {
		long __functionAddress = getInstance(command_queue).clReleaseCommandQueue;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseCommandQueue(command_queue.getPointer(), __functionAddress);
	}

	// --- [ clGetCommandQueueInfo ] ---

	/** JNI method for {@link #clGetCommandQueueInfo(CLCommandQueue, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetCommandQueueInfo(long command_queue, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue        
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetCommandQueueInfo(CLCommandQueue command_queue, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(command_queue).clGetCommandQueueInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetCommandQueueInfo(command_queue.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetCommandQueueInfo(CLCommandQueue, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetCommandQueueInfo(CLCommandQueue command_queue, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(command_queue).clGetCommandQueueInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetCommandQueueInfo(command_queue.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateBuffer ] ---

	/** JNI method for {@link #clCreateBuffer(CLContext, long, long, ByteBuffer, ByteBuffer)} */
	public static native long nclCreateBuffer(long context, long flags, long size, long host_ptr, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param context     
	 * @param flags       
	 * @param size        
	 * @param host_ptr    
	 * @param errcode_ret 
	 */
	public static CLMem clCreateBuffer(CLContext context, long flags, long size, ByteBuffer host_ptr, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(host_ptr, size);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLMem(nclCreateBuffer(context.getPointer(), flags, size, memAddress(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateBuffer(CLContext, long, long, ByteBuffer, ByteBuffer)} */
	public static CLMem clCreateBuffer(CLContext context, long flags, ByteBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLMem(nclCreateBuffer(context.getPointer(), flags, host_ptr.remaining(), memAddress(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clEnqueueReadBuffer ] ---

	/** JNI method for {@link #clEnqueueReadBuffer(CLCommandQueue, CLMem, int, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param buffer                  
	 * @param blocking_read           
	 * @param offset                  
	 * @param size                    
	 * @param ptr                     
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueReadBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_read, long offset, long size, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(ptr, size);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueReadBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_read, offset, size, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueReadBuffer(CLCommandQueue, CLMem, int, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueReadBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_read, long offset, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_read, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueWriteBuffer ] ---

	/** JNI method for {@link #clEnqueueWriteBuffer(CLCommandQueue, CLMem, int, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param buffer                  
	 * @param blocking_write          
	 * @param offset                  
	 * @param size                    
	 * @param ptr                     
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueWriteBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_write, long offset, long size, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(ptr, size);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueWriteBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_write, offset, size, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueWriteBuffer(CLCommandQueue, CLMem, int, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueWriteBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_write, long offset, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_write, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueCopyBuffer ] ---

	/** JNI method for {@link #clEnqueueCopyBuffer(CLCommandQueue, CLMem, CLMem, long, long, long, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueCopyBuffer(long command_queue, long src_buffer, long dst_buffer, long src_offset, long dst_offset, long size, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param src_buffer              
	 * @param dst_buffer              
	 * @param src_offset              
	 * @param dst_offset              
	 * @param size                    
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueCopyBuffer(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_buffer, long src_offset, long dst_offset, long size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueCopyBuffer(command_queue.getPointer(), src_buffer.getPointer(), dst_buffer.getPointer(), src_offset, dst_offset, size, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueCopyBuffer(CLCommandQueue, CLMem, CLMem, long, long, long, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueCopyBuffer(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_buffer, long src_offset, long dst_offset, long size, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyBuffer(command_queue.getPointer(), src_buffer.getPointer(), dst_buffer.getPointer(), src_offset, dst_offset, size, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueMapBuffer ] ---

	/** JNI method for {@link #clEnqueueMapBuffer(CLCommandQueue, CLMem, int, long, long, long, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static native long nclEnqueueMapBuffer(long command_queue, long buffer, int blocking_map, long map_flags, long offset, long size, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param buffer                  
	 * @param blocking_map            
	 * @param map_flags               
	 * @param offset                  
	 * @param size                    
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 * @param errcode_ret             
	 */
	public static ByteBuffer clEnqueueMapBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_map, long map_flags, long offset, long size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		long __result = nclEnqueueMapBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_map, map_flags, offset, size, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		return memByteBuffer(__result, (int)buffer.getInfoLong(CL_MEM_SIZE));
	}

	/** Alternative version of: {@link #clEnqueueMapBuffer(CLCommandQueue, CLMem, int, long, long, long, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static ByteBuffer clEnqueueMapBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_map, long map_flags, long offset, long size, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret, ByteBuffer old_buffer) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long __result = nclEnqueueMapBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_map, map_flags, offset, size, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		int length = (int)buffer.getInfoLong(CL_MEM_SIZE);
		return __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	/** Explicit size alternative version of: {@link #clEnqueueMapBuffer(CLCommandQueue, CLMem, int, long, long, long, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static ByteBuffer clEnqueueMapBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_map, long map_flags, long offset, long size, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret, int length, ByteBuffer old_buffer) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long __result = nclEnqueueMapBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_map, map_flags, offset, size, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		return __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	// --- [ clCreateImage2D ] ---

	/** JNI method for {@link #clCreateImage2D(CLContext, long, ByteBuffer, long, long, long, ByteBuffer, ByteBuffer)} */
	public static native long nclCreateImage2D(long context, long flags, long image_format, long image_width, long image_height, long image_row_pitch, long host_ptr, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param context         
	 * @param flags           
	 * @param image_format    
	 * @param image_width     
	 * @param image_height    
	 * @param image_row_pitch 
	 * @param host_ptr        
	 * @param errcode_ret     
	 */
	public static CLMem clCreateImage2D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, ByteBuffer host_ptr, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLMem(nclCreateImage2D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateImage2D(CLContext, long, ByteBuffer, long, long, long, ByteBuffer, ByteBuffer)} */
	public static CLMem clCreateImage2D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, ByteBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLMem(nclCreateImage2D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clCreateImage3D ] ---

	/** JNI method for {@link #clCreateImage3D(CLContext, long, ByteBuffer, long, long, long, long, long, ByteBuffer, ByteBuffer)} */
	public static native long nclCreateImage3D(long context, long flags, long image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, long host_ptr, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param context           
	 * @param flags             
	 * @param image_format      
	 * @param image_width       
	 * @param image_height      
	 * @param image_depth       
	 * @param image_row_pitch   
	 * @param image_slice_pitch 
	 * @param host_ptr          
	 * @param errcode_ret       
	 */
	public static CLMem clCreateImage3D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, ByteBuffer host_ptr, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLMem(nclCreateImage3D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateImage3D(CLContext, long, ByteBuffer, long, long, long, long, long, ByteBuffer, ByteBuffer)} */
	public static CLMem clCreateImage3D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, ByteBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLMem(nclCreateImage3D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clGetSupportedImageFormats ] ---

	/** JNI method for {@link #clGetSupportedImageFormats(CLContext, long, int, int, ByteBuffer, ByteBuffer)} */
	public static native int nclGetSupportedImageFormats(long context, long flags, int image_type, int num_entries, long image_formats, long num_image_formats, long __functionAddress);

	/**
	 * 
	 *
	 * @param context           
	 * @param flags             
	 * @param image_type        
	 * @param num_entries       
	 * @param image_formats     
	 * @param num_image_formats 
	 */
	public static int clGetSupportedImageFormats(CLContext context, long flags, int image_type, int num_entries, ByteBuffer image_formats, ByteBuffer num_image_formats) {
		long __functionAddress = getInstance(context).clGetSupportedImageFormats;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( image_formats != null ) checkBuffer(image_formats, num_entries);
			if ( image_formats != null ) checkBuffer(image_formats, cl_image_format.SIZEOF);
			if ( num_image_formats != null ) checkBuffer(num_image_formats, 1 << 2);
		}
		return nclGetSupportedImageFormats(context.getPointer(), flags, image_type, num_entries, memAddressSafe(image_formats), memAddressSafe(num_image_formats), __functionAddress);
	}

	/** Alternative version of: {@link #clGetSupportedImageFormats(CLContext, long, int, int, ByteBuffer, ByteBuffer)} */
	public static int clGetSupportedImageFormats(CLContext context, long flags, int image_type, ByteBuffer image_formats, IntBuffer num_image_formats) {
		long __functionAddress = getInstance(context).clGetSupportedImageFormats;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( image_formats != null ) checkBuffer(image_formats, cl_image_format.SIZEOF);
			if ( num_image_formats != null ) checkBuffer(num_image_formats, 1);
		}
		return nclGetSupportedImageFormats(context.getPointer(), flags, image_type, image_formats == null ? 0 : image_formats.remaining(), memAddressSafe(image_formats), memAddressSafe(num_image_formats), __functionAddress);
	}

	// --- [ clEnqueueReadImage ] ---

	/** JNI method for {@link #clEnqueueReadImage(CLCommandQueue, CLMem, int, ByteBuffer, ByteBuffer, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueReadImage(long command_queue, long image, int blocking_read, long origin, long region, long row_pitch, long slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param image                   
	 * @param blocking_read           
	 * @param origin                  
	 * @param region                  
	 * @param row_pitch               
	 * @param slice_pitch             
	 * @param ptr                     
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueReadImage(CLCommandQueue command_queue, CLMem image, int blocking_read, ByteBuffer origin, ByteBuffer region, long row_pitch, long slice_pitch, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueReadImage(command_queue.getPointer(), image.getPointer(), blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueReadImage(CLCommandQueue, CLMem, int, ByteBuffer, ByteBuffer, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueReadImage(CLCommandQueue command_queue, CLMem image, int blocking_read, PointerBuffer origin, PointerBuffer region, long row_pitch, long slice_pitch, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadImage(command_queue.getPointer(), image.getPointer(), blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueWriteImage ] ---

	/** JNI method for {@link #clEnqueueWriteImage(CLCommandQueue, CLMem, int, ByteBuffer, ByteBuffer, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueWriteImage(long command_queue, long image, int blocking_write, long origin, long region, long input_row_pitch, long input_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param image                   
	 * @param blocking_write          
	 * @param origin                  
	 * @param region                  
	 * @param input_row_pitch         
	 * @param input_slice_pitch       
	 * @param ptr                     
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueWriteImage(CLCommandQueue command_queue, CLMem image, int blocking_write, ByteBuffer origin, ByteBuffer region, long input_row_pitch, long input_slice_pitch, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueWriteImage(command_queue.getPointer(), image.getPointer(), blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueWriteImage(CLCommandQueue, CLMem, int, ByteBuffer, ByteBuffer, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueWriteImage(CLCommandQueue command_queue, CLMem image, int blocking_write, PointerBuffer origin, PointerBuffer region, long input_row_pitch, long input_slice_pitch, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteImage(command_queue.getPointer(), image.getPointer(), blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueCopyImage ] ---

	/** JNI method for {@link #clEnqueueCopyImage(CLCommandQueue, CLMem, CLMem, ByteBuffer, ByteBuffer, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueCopyImage(long command_queue, long src_image, long dst_image, long src_origin, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param src_image               
	 * @param dst_image               
	 * @param src_origin              
	 * @param dst_origin              
	 * @param region                  
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueCopyImage(CLCommandQueue command_queue, CLMem src_image, CLMem dst_image, ByteBuffer src_origin, ByteBuffer dst_origin, ByteBuffer region, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(dst_origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueCopyImage(command_queue.getPointer(), src_image.getPointer(), dst_image.getPointer(), memAddress(src_origin), memAddress(dst_origin), memAddress(region), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueCopyImage(CLCommandQueue, CLMem, CLMem, ByteBuffer, ByteBuffer, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueCopyImage(CLCommandQueue command_queue, CLMem src_image, CLMem dst_image, PointerBuffer src_origin, PointerBuffer dst_origin, PointerBuffer region, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3);
			checkBuffer(dst_origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyImage(command_queue.getPointer(), src_image.getPointer(), dst_image.getPointer(), memAddress(src_origin), memAddress(dst_origin), memAddress(region), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueCopyImageToBuffer ] ---

	/** JNI method for {@link #clEnqueueCopyImageToBuffer(CLCommandQueue, CLMem, CLMem, ByteBuffer, ByteBuffer, long, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueCopyImageToBuffer(long command_queue, long src_image, long dst_buffer, long src_origin, long region, long dst_offset, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param src_image               
	 * @param dst_buffer              
	 * @param src_origin              
	 * @param region                  
	 * @param dst_offset              
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueCopyImageToBuffer(CLCommandQueue command_queue, CLMem src_image, CLMem dst_buffer, ByteBuffer src_origin, ByteBuffer region, long dst_offset, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyImageToBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueCopyImageToBuffer(command_queue.getPointer(), src_image.getPointer(), dst_buffer.getPointer(), memAddress(src_origin), memAddress(region), dst_offset, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueCopyImageToBuffer(CLCommandQueue, CLMem, CLMem, ByteBuffer, ByteBuffer, long, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueCopyImageToBuffer(CLCommandQueue command_queue, CLMem src_image, CLMem dst_buffer, PointerBuffer src_origin, PointerBuffer region, long dst_offset, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyImageToBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyImageToBuffer(command_queue.getPointer(), src_image.getPointer(), dst_buffer.getPointer(), memAddress(src_origin), memAddress(region), dst_offset, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueCopyBufferToImage ] ---

	/** JNI method for {@link #clEnqueueCopyBufferToImage(CLCommandQueue, CLMem, CLMem, long, ByteBuffer, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueCopyBufferToImage(long command_queue, long src_buffer, long dst_image, long src_offset, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param src_buffer              
	 * @param dst_image               
	 * @param src_offset              
	 * @param dst_origin              
	 * @param region                  
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueCopyBufferToImage(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_image, long src_offset, ByteBuffer dst_origin, ByteBuffer region, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBufferToImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dst_origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueCopyBufferToImage(command_queue.getPointer(), src_buffer.getPointer(), dst_image.getPointer(), src_offset, memAddress(dst_origin), memAddress(region), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueCopyBufferToImage(CLCommandQueue, CLMem, CLMem, long, ByteBuffer, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueCopyBufferToImage(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_image, long src_offset, PointerBuffer dst_origin, PointerBuffer region, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBufferToImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dst_origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyBufferToImage(command_queue.getPointer(), src_buffer.getPointer(), dst_image.getPointer(), src_offset, memAddress(dst_origin), memAddress(region), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueMapImage ] ---

	/** JNI method for {@link #clEnqueueMapImage(CLCommandQueue, CLMem, int, long, ByteBuffer, ByteBuffer, ByteBuffer, ByteBuffer, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static native long nclEnqueueMapImage(long command_queue, long image, int blocking_map, long map_flags, long origin, long region, long image_row_pitch, long image_slice_pitch, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param image                   
	 * @param blocking_map            
	 * @param map_flags               
	 * @param origin                  
	 * @param region                  
	 * @param image_row_pitch         
	 * @param image_slice_pitch       
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 * @param errcode_ret             
	 */
	public static ByteBuffer clEnqueueMapImage(CLCommandQueue command_queue, CLMem image, int blocking_map, long map_flags, ByteBuffer origin, ByteBuffer region, ByteBuffer image_row_pitch, ByteBuffer image_slice_pitch, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(image_row_pitch, 1 << PointerBuffer.getPointerSizeShift());
			if ( image_slice_pitch != null ) checkBuffer(image_slice_pitch, 1 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		long __result = nclEnqueueMapImage(command_queue.getPointer(), image.getPointer(), blocking_map, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		return memByteBuffer(__result, (int)image.getInfoLong(CL_MEM_SIZE));
	}

	/** Alternative version of: {@link #clEnqueueMapImage(CLCommandQueue, CLMem, int, long, ByteBuffer, ByteBuffer, ByteBuffer, ByteBuffer, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static ByteBuffer clEnqueueMapImage(CLCommandQueue command_queue, CLMem image, int blocking_map, long map_flags, PointerBuffer origin, PointerBuffer region, PointerBuffer image_row_pitch, PointerBuffer image_slice_pitch, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret, ByteBuffer old_buffer) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			checkBuffer(image_row_pitch, 1);
			if ( image_slice_pitch != null ) checkBuffer(image_slice_pitch, 1);
			if ( event != null ) checkBuffer(event, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long __result = nclEnqueueMapImage(command_queue.getPointer(), image.getPointer(), blocking_map, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		int length = (int)image.getInfoLong(CL_MEM_SIZE);
		return __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	/** Explicit size alternative version of: {@link #clEnqueueMapImage(CLCommandQueue, CLMem, int, long, ByteBuffer, ByteBuffer, ByteBuffer, ByteBuffer, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static ByteBuffer clEnqueueMapImage(CLCommandQueue command_queue, CLMem image, int blocking_map, long map_flags, PointerBuffer origin, PointerBuffer region, PointerBuffer image_row_pitch, PointerBuffer image_slice_pitch, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret, int length, ByteBuffer old_buffer) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			checkBuffer(image_row_pitch, 1);
			if ( image_slice_pitch != null ) checkBuffer(image_slice_pitch, 1);
			if ( event != null ) checkBuffer(event, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long __result = nclEnqueueMapImage(command_queue.getPointer(), image.getPointer(), blocking_map, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		return __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	// --- [ clGetImageInfo ] ---

	/** JNI method for {@link #clGetImageInfo(CLMem, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetImageInfo(long image, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param image                
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetImageInfo(CLMem image, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(image).clGetImageInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetImageInfo(image.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetImageInfo(CLMem, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetImageInfo(CLMem image, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(image).clGetImageInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetImageInfo(image.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clRetainMemObject ] ---

	/** JNI method for {@link #clRetainMemObject(CLMem)} */
	public static native int nclRetainMemObject(long memobj, long __functionAddress);

	/**
	 * 
	 *
	 * @param memobj 
	 */
	public static int clRetainMemObject(CLMem memobj) {
		long __functionAddress = getInstance(memobj).clRetainMemObject;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainMemObject(memobj.getPointer(), __functionAddress);
	}

	// --- [ clReleaseMemObject ] ---

	/** JNI method for {@link #clReleaseMemObject(CLMem)} */
	public static native int nclReleaseMemObject(long memobj, long __functionAddress);

	/**
	 * 
	 *
	 * @param memobj 
	 */
	public static int clReleaseMemObject(CLMem memobj) {
		long __functionAddress = getInstance(memobj).clReleaseMemObject;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseMemObject(memobj.getPointer(), __functionAddress);
	}

	// --- [ clEnqueueUnmapMemObject ] ---

	/** JNI method for {@link #clEnqueueUnmapMemObject(CLCommandQueue, CLMem, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueUnmapMemObject(long command_queue, long memobj, long mapped_ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param memobj                  
	 * @param mapped_ptr              
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueUnmapMemObject(CLCommandQueue command_queue, CLMem memobj, ByteBuffer mapped_ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueUnmapMemObject;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueUnmapMemObject(command_queue.getPointer(), memobj.getPointer(), memAddress(mapped_ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueUnmapMemObject(CLCommandQueue, CLMem, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueUnmapMemObject(CLCommandQueue command_queue, CLMem memobj, ByteBuffer mapped_ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueUnmapMemObject;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueUnmapMemObject(command_queue.getPointer(), memobj.getPointer(), memAddress(mapped_ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clGetMemObjectInfo ] ---

	/** JNI method for {@link #clGetMemObjectInfo(CLMem, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetMemObjectInfo(long memobj, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param memobj               
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetMemObjectInfo(CLMem memobj, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).clGetMemObjectInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetMemObjectInfo(memobj.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetMemObjectInfo(CLMem, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetMemObjectInfo(CLMem memobj, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).clGetMemObjectInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetMemObjectInfo(memobj.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** IntBuffer version of: {@link #clGetMemObjectInfo(CLMem, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetMemObjectInfo(CLMem memobj, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).clGetMemObjectInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetMemObjectInfo(memobj.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** LongBuffer version of: {@link #clGetMemObjectInfo(CLMem, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetMemObjectInfo(CLMem memobj, int param_name, LongBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).clGetMemObjectInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetMemObjectInfo(memobj.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** PointerBuffer version of: {@link #clGetMemObjectInfo(CLMem, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetMemObjectInfo(CLMem memobj, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).clGetMemObjectInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetMemObjectInfo(memobj.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << PointerBuffer.getPointerSizeShift(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateSampler ] ---

	/** JNI method for {@link #clCreateSampler(CLContext, int, int, int, ByteBuffer)} */
	public static native long nclCreateSampler(long context, int normalized_coords, int addressing_mode, int filter_mode, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param context           
	 * @param normalized_coords 
	 * @param addressing_mode   
	 * @param filter_mode       
	 * @param errcode_ret       
	 */
	public static CLSampler clCreateSampler(CLContext context, int normalized_coords, int addressing_mode, int filter_mode, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateSampler;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLSampler(nclCreateSampler(context.getPointer(), normalized_coords, addressing_mode, filter_mode, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateSampler(CLContext, int, int, int, ByteBuffer)} */
	public static CLSampler clCreateSampler(CLContext context, int normalized_coords, int addressing_mode, int filter_mode, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateSampler;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLSampler(nclCreateSampler(context.getPointer(), normalized_coords, addressing_mode, filter_mode, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clRetainSampler ] ---

	/** JNI method for {@link #clRetainSampler(CLSampler)} */
	public static native int nclRetainSampler(long sampler, long __functionAddress);

	/**
	 * 
	 *
	 * @param sampler 
	 */
	public static int clRetainSampler(CLSampler sampler) {
		long __functionAddress = getInstance(sampler).clRetainSampler;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainSampler(sampler.getPointer(), __functionAddress);
	}

	// --- [ clReleaseSampler ] ---

	/** JNI method for {@link #clReleaseSampler(CLSampler)} */
	public static native int nclReleaseSampler(long sampler, long __functionAddress);

	/**
	 * 
	 *
	 * @param sampler 
	 */
	public static int clReleaseSampler(CLSampler sampler) {
		long __functionAddress = getInstance(sampler).clReleaseSampler;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseSampler(sampler.getPointer(), __functionAddress);
	}

	// --- [ clGetSamplerInfo ] ---

	/** JNI method for {@link #clGetSamplerInfo(CLSampler, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetSamplerInfo(long sampler, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param sampler              
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetSamplerInfo(CLSampler sampler, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(sampler).clGetSamplerInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetSamplerInfo(sampler.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetSamplerInfo(CLSampler, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetSamplerInfo(CLSampler sampler, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(sampler).clGetSamplerInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetSamplerInfo(sampler.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateProgramWithSource ] ---

	/** JNI method for {@link #clCreateProgramWithSource(CLContext, int, ByteBuffer, long, ByteBuffer)} */
	public static native long nclCreateProgramWithSource(long context, int count, long string, long lengths, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param context     
	 * @param count       
	 * @param string      
	 * @param lengths     
	 * @param errcode_ret 
	 */
	public static CLProgram clCreateProgramWithSource(CLContext context, int count, ByteBuffer string, long lengths, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithSource;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(string);
			checkBuffer(string, lengths);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLProgram(nclCreateProgramWithSource(context.getPointer(), count, memAddress(string), lengths, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateProgramWithSource(CLContext, int, ByteBuffer, long, ByteBuffer)} */
	public static CLProgram clCreateProgramWithSource(CLContext context, int count, ByteBuffer string, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithSource;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLProgram(nclCreateProgramWithSource(context.getPointer(), count, memAddress(string), string.remaining(), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** CharSequence version of: {@link #clCreateProgramWithSource(CLContext, int, ByteBuffer, long, ByteBuffer)} */
	public static CLProgram clCreateProgramWithSource(CLContext context, int count, CharSequence string, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithSource;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLProgram(nclCreateProgramWithSource(context.getPointer(), count, memAddress(memEncodeUTF8(string)), string.length(), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clCreateProgramWithBinary ] ---

	/** JNI method for {@link #clCreateProgramWithBinary(CLContext, int, CLDevice, long, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static native long nclCreateProgramWithBinary(long context, int num_devices, long device, long lengths, long binary, long binary_status, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param context       
	 * @param num_devices   
	 * @param device        
	 * @param lengths       
	 * @param binary        
	 * @param binary_status 
	 * @param errcode_ret   
	 */
	public static CLProgram clCreateProgramWithBinary(CLContext context, int num_devices, CLDevice device, long lengths, ByteBuffer binary, ByteBuffer binary_status, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(binary, lengths);
			checkBuffer(binary_status, 1 << 2);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLProgram(nclCreateProgramWithBinary(context.getPointer(), num_devices, device.getPointer(), lengths, memAddress(binary), memAddress(binary_status), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateProgramWithBinary(CLContext, int, CLDevice, long, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static CLProgram clCreateProgramWithBinary(CLContext context, int num_devices, CLDevice device, ByteBuffer binary, IntBuffer binary_status, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(binary_status, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLProgram(nclCreateProgramWithBinary(context.getPointer(), num_devices, device.getPointer(), binary.remaining(), memAddress(binary), memAddress(binary_status), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clRetainProgram ] ---

	/** JNI method for {@link #clRetainProgram(CLProgram)} */
	public static native int nclRetainProgram(long program, long __functionAddress);

	/**
	 * 
	 *
	 * @param program 
	 */
	public static int clRetainProgram(CLProgram program) {
		long __functionAddress = getInstance(program).clRetainProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainProgram(program.getPointer(), __functionAddress);
	}

	// --- [ clReleaseProgram ] ---

	/** JNI method for {@link #clReleaseProgram(CLProgram)} */
	public static native int nclReleaseProgram(long program, long __functionAddress);

	/**
	 * 
	 *
	 * @param program 
	 */
	public static int clReleaseProgram(CLProgram program) {
		long __functionAddress = getInstance(program).clReleaseProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseProgram(program.getPointer(), __functionAddress);
	}

	// --- [ clBuildProgram ] ---

	/** JNI method for {@link #clBuildProgram(CLProgram, int, ByteBuffer, ByteBuffer, CLProgramCallback, ByteBuffer)} */
	public static native int nclBuildProgram(long program, int num_devices, long device_list, long options, long pfn_notify, long user_data, long __functionAddress);

	/**
	 * 
	 *
	 * @param program     
	 * @param num_devices 
	 * @param device_list 
	 * @param options     
	 * @param pfn_notify  
	 * @param user_data   
	 */
	public static int clBuildProgram(CLProgram program, int num_devices, ByteBuffer device_list, ByteBuffer options, CLProgramCallback pfn_notify, ByteBuffer user_data) {
		long __functionAddress = getInstance(program).clBuildProgram;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( device_list != null ) checkBuffer(device_list, num_devices << PointerBuffer.getPointerSizeShift());
			checkNT1(options);
		}
		return nclBuildProgram(program.getPointer(), num_devices, memAddressSafe(device_list), memAddress(options), CLProgramCallback.CALLBACK, memAddress(user_data), __functionAddress);
	}

	/** Alternative version of: {@link #clBuildProgram(CLProgram, int, ByteBuffer, ByteBuffer, CLProgramCallback, ByteBuffer)} */
	public static int clBuildProgram(CLProgram program, PointerBuffer device_list, ByteBuffer options, CLProgramCallback pfn_notify, ByteBuffer user_data) {
		long __functionAddress = getInstance(program).clBuildProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclBuildProgram(program.getPointer(), device_list == null ? 0 : device_list.remaining(), memAddressSafe(device_list), memAddress(options), CLProgramCallback.CALLBACK, memAddress(user_data), __functionAddress);
	}

	/** CharSequence version of: {@link #clBuildProgram(CLProgram, int, ByteBuffer, ByteBuffer, CLProgramCallback, ByteBuffer)} */
	public static int clBuildProgram(CLProgram program, PointerBuffer device_list, CharSequence options, CLProgramCallback pfn_notify, ByteBuffer user_data) {
		long __functionAddress = getInstance(program).clBuildProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclBuildProgram(program.getPointer(), device_list == null ? 0 : device_list.remaining(), memAddressSafe(device_list), memAddress(memEncodeASCII(options)), CLProgramCallback.CALLBACK, memAddress(user_data), __functionAddress);
	}

	// --- [ clGetProgramInfo ] ---

	/** JNI method for {@link #clGetProgramInfo(CLProgram, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetProgramInfo(long program, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param program              
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetProgramInfo(CLProgram program, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(program).clGetProgramInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetProgramInfo(program.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetProgramInfo(CLProgram, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetProgramInfo(CLProgram program, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(program).clGetProgramInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetProgramInfo(program.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clGetProgramBuildInfo ] ---

	/** JNI method for {@link #clGetProgramBuildInfo(CLProgram, CLDevice, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetProgramBuildInfo(long program, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param program              
	 * @param device               
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetProgramBuildInfo(CLProgram program, CLDevice device, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(program).clGetProgramBuildInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetProgramBuildInfo(program.getPointer(), device.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetProgramBuildInfo(CLProgram, CLDevice, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetProgramBuildInfo(CLProgram program, CLDevice device, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(program).clGetProgramBuildInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetProgramBuildInfo(program.getPointer(), device.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateKernel ] ---

	/** JNI method for {@link #clCreateKernel(CLProgram, ByteBuffer, ByteBuffer)} */
	public static native long nclCreateKernel(long program, long kernel_name, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param program     
	 * @param kernel_name 
	 * @param errcode_ret 
	 */
	public static CLKernel clCreateKernel(CLProgram program, ByteBuffer kernel_name, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(program).clCreateKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(kernel_name);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLKernel(nclCreateKernel(program.getPointer(), memAddress(kernel_name), memAddressSafe(errcode_ret), __functionAddress), program);
	}

	/** Alternative version of: {@link #clCreateKernel(CLProgram, ByteBuffer, ByteBuffer)} */
	public static CLKernel clCreateKernel(CLProgram program, ByteBuffer kernel_name, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(program).clCreateKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLKernel(nclCreateKernel(program.getPointer(), memAddress(kernel_name), memAddressSafe(errcode_ret), __functionAddress), program);
	}

	/** CharSequence version of: {@link #clCreateKernel(CLProgram, ByteBuffer, ByteBuffer)} */
	public static CLKernel clCreateKernel(CLProgram program, CharSequence kernel_name, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(program).clCreateKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLKernel(nclCreateKernel(program.getPointer(), memAddress(memEncodeASCII(kernel_name)), memAddressSafe(errcode_ret), __functionAddress), program);
	}

	// --- [ clCreateKernelsInProgram ] ---

	/** JNI method for {@link #clCreateKernelsInProgram(CLProgram, int, ByteBuffer, ByteBuffer)} */
	public static native int nclCreateKernelsInProgram(long program, int num_kernels, long kernels, long num_kernels_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param program         
	 * @param num_kernels     
	 * @param kernels         
	 * @param num_kernels_ret 
	 */
	public static int clCreateKernelsInProgram(CLProgram program, int num_kernels, ByteBuffer kernels, ByteBuffer num_kernels_ret) {
		long __functionAddress = getInstance(program).clCreateKernelsInProgram;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( kernels != null ) checkBuffer(kernels, num_kernels << PointerBuffer.getPointerSizeShift());
			if ( num_kernels_ret != null ) checkBuffer(num_kernels_ret, 1 << 2);
		}
		return nclCreateKernelsInProgram(program.getPointer(), num_kernels, memAddressSafe(kernels), memAddressSafe(num_kernels_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clCreateKernelsInProgram(CLProgram, int, ByteBuffer, ByteBuffer)} */
	public static int clCreateKernelsInProgram(CLProgram program, PointerBuffer kernels, IntBuffer num_kernels_ret) {
		long __functionAddress = getInstance(program).clCreateKernelsInProgram;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( num_kernels_ret != null ) checkBuffer(num_kernels_ret, 1);
		}
		return nclCreateKernelsInProgram(program.getPointer(), kernels == null ? 0 : kernels.remaining(), memAddressSafe(kernels), memAddressSafe(num_kernels_ret), __functionAddress);
	}

	// --- [ clRetainKernel ] ---

	/** JNI method for {@link #clRetainKernel(CLKernel)} */
	public static native int nclRetainKernel(long kernel, long __functionAddress);

	/**
	 * 
	 *
	 * @param kernel 
	 */
	public static int clRetainKernel(CLKernel kernel) {
		long __functionAddress = getInstance(kernel).clRetainKernel;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainKernel(kernel.getPointer(), __functionAddress);
	}

	// --- [ clReleaseKernel ] ---

	/** JNI method for {@link #clReleaseKernel(CLKernel)} */
	public static native int nclReleaseKernel(long kernel, long __functionAddress);

	/**
	 * 
	 *
	 * @param kernel 
	 */
	public static int clReleaseKernel(CLKernel kernel) {
		long __functionAddress = getInstance(kernel).clReleaseKernel;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseKernel(kernel.getPointer(), __functionAddress);
	}

	// --- [ clSetKernelArg ] ---

	/** JNI method for {@link #clSetKernelArg(CLKernel, int, long, ByteBuffer)} */
	public static native int nclSetKernelArg(long kernel, int arg_index, long arg_size, long arg_value, long __functionAddress);

	/**
	 * 
	 *
	 * @param kernel    
	 * @param arg_index 
	 * @param arg_size  
	 * @param arg_value 
	 */
	public static int clSetKernelArg(CLKernel kernel, int arg_index, long arg_size, ByteBuffer arg_value) {
		long __functionAddress = getInstance(kernel).clSetKernelArg;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(arg_value, arg_size);
		}
		return nclSetKernelArg(kernel.getPointer(), arg_index, arg_size, memAddress(arg_value), __functionAddress);
	}

	/** Alternative version of: {@link #clSetKernelArg(CLKernel, int, long, ByteBuffer)} */
	public static int clSetKernelArg(CLKernel kernel, int arg_index, ByteBuffer arg_value) {
		long __functionAddress = getInstance(kernel).clSetKernelArg;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclSetKernelArg(kernel.getPointer(), arg_index, arg_value.remaining(), memAddress(arg_value), __functionAddress);
	}

	// --- [ clGetKernelInfo ] ---

	/** JNI method for {@link #clGetKernelInfo(CLKernel, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetKernelInfo(long kernel, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param kernel               
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetKernelInfo(CLKernel kernel, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(kernel).clGetKernelInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetKernelInfo(kernel.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetKernelInfo(CLKernel, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetKernelInfo(CLKernel kernel, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(kernel).clGetKernelInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetKernelInfo(kernel.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clGetKernelWorkGroupInfo ] ---

	/** JNI method for {@link #clGetKernelWorkGroupInfo(CLKernel, CLDevice, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetKernelWorkGroupInfo(long kernel, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param kernel               
	 * @param device               
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetKernelWorkGroupInfo(CLKernel kernel, CLDevice device, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(kernel).clGetKernelWorkGroupInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetKernelWorkGroupInfo(kernel.getPointer(), device.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetKernelWorkGroupInfo(CLKernel, CLDevice, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetKernelWorkGroupInfo(CLKernel kernel, CLDevice device, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(kernel).clGetKernelWorkGroupInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetKernelWorkGroupInfo(kernel.getPointer(), device.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clEnqueueNDRangeKernel ] ---

	/** JNI method for {@link #clEnqueueNDRangeKernel(CLCommandQueue, CLKernel, int, ByteBuffer, ByteBuffer, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueNDRangeKernel(long command_queue, long kernel, int work_dim, long global_work_offset, long global_work_size, long local_work_size, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param kernel                  
	 * @param work_dim                
	 * @param global_work_offset      
	 * @param global_work_size        
	 * @param local_work_size         
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueNDRangeKernel(CLCommandQueue command_queue, CLKernel kernel, int work_dim, ByteBuffer global_work_offset, ByteBuffer global_work_size, ByteBuffer local_work_size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueNDRangeKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( global_work_offset != null ) checkBuffer(global_work_offset, work_dim << PointerBuffer.getPointerSizeShift());
			if ( global_work_size != null ) checkBuffer(global_work_size, work_dim << PointerBuffer.getPointerSizeShift());
			if ( local_work_size != null ) checkBuffer(local_work_size, work_dim << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueNDRangeKernel(command_queue.getPointer(), kernel.getPointer(), work_dim, memAddressSafe(global_work_offset), memAddressSafe(global_work_size), memAddressSafe(local_work_size), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueNDRangeKernel(CLCommandQueue, CLKernel, int, ByteBuffer, ByteBuffer, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueNDRangeKernel(CLCommandQueue command_queue, CLKernel kernel, int work_dim, PointerBuffer global_work_offset, PointerBuffer global_work_size, PointerBuffer local_work_size, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueNDRangeKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( global_work_offset != null ) checkBuffer(global_work_offset, work_dim);
			if ( global_work_size != null ) checkBuffer(global_work_size, work_dim);
			if ( local_work_size != null ) checkBuffer(local_work_size, work_dim);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueNDRangeKernel(command_queue.getPointer(), kernel.getPointer(), work_dim, memAddressSafe(global_work_offset), memAddressSafe(global_work_size), memAddressSafe(local_work_size), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueTask ] ---

	/** JNI method for {@link #clEnqueueTask(CLCommandQueue, CLKernel, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueTask(long command_queue, long kernel, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param kernel                  
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueTask(CLCommandQueue command_queue, CLKernel kernel, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueTask;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueTask(command_queue.getPointer(), kernel.getPointer(), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueTask(CLCommandQueue, CLKernel, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueTask(CLCommandQueue command_queue, CLKernel kernel, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueTask;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueTask(command_queue.getPointer(), kernel.getPointer(), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueNativeKernel ] ---

	/** JNI method for {@link #clEnqueueNativeKernel(CLCommandQueue, CLNativeKernelFunc, ByteBuffer, long, int, ByteBuffer, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueNativeKernel(long command_queue, long user_func, long args, long cb_args, int num_mem_objects, long mem_list, long args_mem_loc, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param user_func               
	 * @param args                    
	 * @param cb_args                 
	 * @param num_mem_objects         
	 * @param mem_list                
	 * @param args_mem_loc            
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueNativeKernel(CLCommandQueue command_queue, CLNativeKernelFunc user_func, ByteBuffer args, long cb_args, int num_mem_objects, ByteBuffer mem_list, ByteBuffer args_mem_loc, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueNativeKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(args, cb_args);
			if ( mem_list != null ) checkBuffer(mem_list, 1 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueNativeKernel(command_queue.getPointer(), CLNativeKernelFunc.CALLBACK, memAddress(args), cb_args, num_mem_objects, memAddressSafe(mem_list), memAddress(args_mem_loc), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueNativeKernel(CLCommandQueue, CLNativeKernelFunc, ByteBuffer, long, int, ByteBuffer, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueNativeKernel(CLCommandQueue command_queue, CLNativeKernelFunc user_func, ByteBuffer args, int num_mem_objects, PointerBuffer mem_list, PointerBuffer args_mem_loc, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueNativeKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( mem_list != null ) checkBuffer(mem_list, 1);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueNativeKernel(command_queue.getPointer(), CLNativeKernelFunc.CALLBACK, memAddress(args), args.remaining(), num_mem_objects, memAddressSafe(mem_list), memAddress(args_mem_loc), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clGetEventInfo ] ---

	/** JNI method for {@link #clGetEventInfo(CLEvent, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetEventInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param event                
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetEventInfo(CLEvent event, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(event).clGetEventInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetEventInfo(event.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetEventInfo(CLEvent, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetEventInfo(CLEvent event, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(event).clGetEventInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetEventInfo(event.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clRetainEvent ] ---

	/** JNI method for {@link #clRetainEvent(CLEvent)} */
	public static native int nclRetainEvent(long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param event 
	 */
	public static int clRetainEvent(CLEvent event) {
		long __functionAddress = getInstance(event).clRetainEvent;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainEvent(event.getPointer(), __functionAddress);
	}

	// --- [ clReleaseEvent ] ---

	/** JNI method for {@link #clReleaseEvent(CLEvent)} */
	public static native int nclReleaseEvent(long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param event 
	 */
	public static int clReleaseEvent(CLEvent event) {
		long __functionAddress = getInstance(event).clReleaseEvent;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseEvent(event.getPointer(), __functionAddress);
	}

	// --- [ clEnqueueMarker ] ---

	/** JNI method for {@link #clEnqueueMarker(CLCommandQueue, ByteBuffer)} */
	public static native int nclEnqueueMarker(long command_queue, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 * @param event         
	 */
	public static int clEnqueueMarker(CLCommandQueue command_queue, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueMarker;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueMarker(command_queue.getPointer(), memAddress(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueMarker(CLCommandQueue, ByteBuffer)} */
	public static int clEnqueueMarker(CLCommandQueue command_queue, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueMarker;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(event, 1);
		}
		return nclEnqueueMarker(command_queue.getPointer(), memAddress(event), __functionAddress);
	}

	// --- [ clEnqueueBarrier ] ---

	/** JNI method for {@link #clEnqueueBarrier(CLCommandQueue)} */
	public static native int nclEnqueueBarrier(long command_queue, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 */
	public static int clEnqueueBarrier(CLCommandQueue command_queue) {
		long __functionAddress = getInstance(command_queue).clEnqueueBarrier;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclEnqueueBarrier(command_queue.getPointer(), __functionAddress);
	}

	// --- [ clEnqueueWaitForEvents ] ---

	/** JNI method for {@link #clEnqueueWaitForEvents(CLCommandQueue, int, ByteBuffer)} */
	public static native int nclEnqueueWaitForEvents(long command_queue, int num_events, long event_list, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 * @param num_events    
	 * @param event_list    
	 */
	public static int clEnqueueWaitForEvents(CLCommandQueue command_queue, int num_events, ByteBuffer event_list) {
		long __functionAddress = getInstance(command_queue).clEnqueueWaitForEvents;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(event_list, num_events << PointerBuffer.getPointerSizeShift());
			checkBuffer(event_list, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueWaitForEvents(command_queue.getPointer(), num_events, memAddress(event_list), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueWaitForEvents(CLCommandQueue, int, ByteBuffer)} */
	public static int clEnqueueWaitForEvents(CLCommandQueue command_queue, PointerBuffer event_list) {
		long __functionAddress = getInstance(command_queue).clEnqueueWaitForEvents;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(event_list, 1);
		}
		return nclEnqueueWaitForEvents(command_queue.getPointer(), event_list.remaining(), memAddress(event_list), __functionAddress);
	}

	// --- [ clGetEventProfilingInfo ] ---

	/** JNI method for {@link #clGetEventProfilingInfo(CLEvent, int, long, ByteBuffer, ByteBuffer)} */
	public static native int nclGetEventProfilingInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param event                
	 * @param param_name           
	 * @param param_value_size     
	 * @param param_value          
	 * @param param_value_size_ret 
	 */
	public static int clGetEventProfilingInfo(CLEvent event, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(event).clGetEventProfilingInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetEventProfilingInfo(event.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetEventProfilingInfo(CLEvent, int, long, ByteBuffer, ByteBuffer)} */
	public static int clGetEventProfilingInfo(CLEvent event, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(event).clGetEventProfilingInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetEventProfilingInfo(event.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clFlush ] ---

	/** JNI method for {@link #clFlush(CLCommandQueue)} */
	public static native int nclFlush(long command_queue, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 */
	public static int clFlush(CLCommandQueue command_queue) {
		long __functionAddress = getInstance(command_queue).clFlush;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclFlush(command_queue.getPointer(), __functionAddress);
	}

	// --- [ clFinish ] ---

	/** JNI method for {@link #clFinish(CLCommandQueue)} */
	public static native int nclFinish(long command_queue, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 */
	public static int clFinish(CLCommandQueue command_queue) {
		long __functionAddress = getInstance(command_queue).clFinish;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclFinish(command_queue.getPointer(), __functionAddress);
	}

	// --- [ clGetExtensionFunctionAddress ] ---

	/** JNI method for {@link #clGetExtensionFunctionAddress(ByteBuffer)} */
	public static native long nclGetExtensionFunctionAddress(long func_name, long __functionAddress);

	/**
	 * 
	 *
	 * @param func_name 
	 */
	public static long clGetExtensionFunctionAddress(ByteBuffer func_name) {
		long __functionAddress = CL.getFunctionProvider().getFunctionAddress("clGetExtensionFunctionAddress");
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(func_name);
		}
		return nclGetExtensionFunctionAddress(memAddress(func_name), __functionAddress);
	}

	/** CharSequence version of: {@link #clGetExtensionFunctionAddress(ByteBuffer)} */
	public static long clGetExtensionFunctionAddress(CharSequence func_name) {
		long __functionAddress = CL.getFunctionProvider().getFunctionAddress("clGetExtensionFunctionAddress");
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclGetExtensionFunctionAddress(memAddress(memEncodeASCII(func_name)), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance(CLObject object) {
		return object.getCapabilities().__CL10;
	}

	static Functions create(java.util.Set<String> ext, FunctionProviderLocal provider) {
		if ( !ext.contains("OpenCL10") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			funcs.clGetPlatformIDs != 0L &&
			funcs.clGetPlatformInfo != 0L &&
			funcs.clGetDeviceIDs != 0L &&
			funcs.clGetDeviceInfo != 0L &&
			funcs.clCreateContext != 0L &&
			funcs.clCreateContextFromType != 0L &&
			funcs.clRetainContext != 0L &&
			funcs.clReleaseContext != 0L &&
			funcs.clGetContextInfo != 0L &&
			funcs.clCreateCommandQueue != 0L &&
			funcs.clRetainCommandQueue != 0L &&
			funcs.clReleaseCommandQueue != 0L &&
			funcs.clGetCommandQueueInfo != 0L &&
			funcs.clCreateBuffer != 0L &&
			funcs.clEnqueueReadBuffer != 0L &&
			funcs.clEnqueueWriteBuffer != 0L &&
			funcs.clEnqueueCopyBuffer != 0L &&
			funcs.clEnqueueMapBuffer != 0L &&
			funcs.clCreateImage2D != 0L &&
			funcs.clCreateImage3D != 0L &&
			funcs.clGetSupportedImageFormats != 0L &&
			funcs.clEnqueueReadImage != 0L &&
			funcs.clEnqueueWriteImage != 0L &&
			funcs.clEnqueueCopyImage != 0L &&
			funcs.clEnqueueCopyImageToBuffer != 0L &&
			funcs.clEnqueueCopyBufferToImage != 0L &&
			funcs.clEnqueueMapImage != 0L &&
			funcs.clGetImageInfo != 0L &&
			funcs.clRetainMemObject != 0L &&
			funcs.clReleaseMemObject != 0L &&
			funcs.clEnqueueUnmapMemObject != 0L &&
			funcs.clGetMemObjectInfo != 0L &&
			funcs.clCreateSampler != 0L &&
			funcs.clRetainSampler != 0L &&
			funcs.clReleaseSampler != 0L &&
			funcs.clGetSamplerInfo != 0L &&
			funcs.clCreateProgramWithSource != 0L &&
			funcs.clCreateProgramWithBinary != 0L &&
			funcs.clRetainProgram != 0L &&
			funcs.clReleaseProgram != 0L &&
			funcs.clBuildProgram != 0L &&
			funcs.clGetProgramInfo != 0L &&
			funcs.clGetProgramBuildInfo != 0L &&
			funcs.clCreateKernel != 0L &&
			funcs.clCreateKernelsInProgram != 0L &&
			funcs.clRetainKernel != 0L &&
			funcs.clReleaseKernel != 0L &&
			funcs.clSetKernelArg != 0L &&
			funcs.clGetKernelInfo != 0L &&
			funcs.clGetKernelWorkGroupInfo != 0L &&
			funcs.clEnqueueNDRangeKernel != 0L &&
			funcs.clEnqueueTask != 0L &&
			funcs.clEnqueueNativeKernel != 0L &&
			funcs.clGetEventInfo != 0L &&
			funcs.clRetainEvent != 0L &&
			funcs.clReleaseEvent != 0L &&
			funcs.clEnqueueMarker != 0L &&
			funcs.clEnqueueBarrier != 0L &&
			funcs.clEnqueueWaitForEvents != 0L &&
			funcs.clGetEventProfilingInfo != 0L &&
			funcs.clFlush != 0L &&
			funcs.clFinish != 0L &&
			funcs.clGetExtensionFunctionAddress != 0L;

		return CL.checkExtension("OpenCL10", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code CL10}. */
	public static final class Functions implements FunctionMap {

		public final long
			clGetPlatformIDs,
			clGetPlatformInfo,
			clGetDeviceIDs,
			clGetDeviceInfo,
			clCreateContext,
			clCreateContextFromType,
			clRetainContext,
			clReleaseContext,
			clGetContextInfo,
			clCreateCommandQueue,
			clRetainCommandQueue,
			clReleaseCommandQueue,
			clGetCommandQueueInfo,
			clCreateBuffer,
			clEnqueueReadBuffer,
			clEnqueueWriteBuffer,
			clEnqueueCopyBuffer,
			clEnqueueMapBuffer,
			clCreateImage2D,
			clCreateImage3D,
			clGetSupportedImageFormats,
			clEnqueueReadImage,
			clEnqueueWriteImage,
			clEnqueueCopyImage,
			clEnqueueCopyImageToBuffer,
			clEnqueueCopyBufferToImage,
			clEnqueueMapImage,
			clGetImageInfo,
			clRetainMemObject,
			clReleaseMemObject,
			clEnqueueUnmapMemObject,
			clGetMemObjectInfo,
			clCreateSampler,
			clRetainSampler,
			clReleaseSampler,
			clGetSamplerInfo,
			clCreateProgramWithSource,
			clCreateProgramWithBinary,
			clRetainProgram,
			clReleaseProgram,
			clBuildProgram,
			clGetProgramInfo,
			clGetProgramBuildInfo,
			clCreateKernel,
			clCreateKernelsInProgram,
			clRetainKernel,
			clReleaseKernel,
			clSetKernelArg,
			clGetKernelInfo,
			clGetKernelWorkGroupInfo,
			clEnqueueNDRangeKernel,
			clEnqueueTask,
			clEnqueueNativeKernel,
			clGetEventInfo,
			clRetainEvent,
			clReleaseEvent,
			clEnqueueMarker,
			clEnqueueBarrier,
			clEnqueueWaitForEvents,
			clGetEventProfilingInfo,
			clFlush,
			clFinish,
			clGetExtensionFunctionAddress;

		public Functions(FunctionProviderLocal provider) {
			clGetPlatformIDs = provider.getFunctionAddress("clGetPlatformIDs");
			clGetPlatformInfo = provider.getFunctionAddress("clGetPlatformInfo");
			clGetDeviceIDs = provider.getFunctionAddress("clGetDeviceIDs");
			clGetDeviceInfo = provider.getFunctionAddress("clGetDeviceInfo");
			clCreateContext = provider.getFunctionAddress("clCreateContext");
			clCreateContextFromType = provider.getFunctionAddress("clCreateContextFromType");
			clRetainContext = provider.getFunctionAddress("clRetainContext");
			clReleaseContext = provider.getFunctionAddress("clReleaseContext");
			clGetContextInfo = provider.getFunctionAddress("clGetContextInfo");
			clCreateCommandQueue = provider.getFunctionAddress("clCreateCommandQueue");
			clRetainCommandQueue = provider.getFunctionAddress("clRetainCommandQueue");
			clReleaseCommandQueue = provider.getFunctionAddress("clReleaseCommandQueue");
			clGetCommandQueueInfo = provider.getFunctionAddress("clGetCommandQueueInfo");
			clCreateBuffer = provider.getFunctionAddress("clCreateBuffer");
			clEnqueueReadBuffer = provider.getFunctionAddress("clEnqueueReadBuffer");
			clEnqueueWriteBuffer = provider.getFunctionAddress("clEnqueueWriteBuffer");
			clEnqueueCopyBuffer = provider.getFunctionAddress("clEnqueueCopyBuffer");
			clEnqueueMapBuffer = provider.getFunctionAddress("clEnqueueMapBuffer");
			clCreateImage2D = provider.getFunctionAddress("clCreateImage2D");
			clCreateImage3D = provider.getFunctionAddress("clCreateImage3D");
			clGetSupportedImageFormats = provider.getFunctionAddress("clGetSupportedImageFormats");
			clEnqueueReadImage = provider.getFunctionAddress("clEnqueueReadImage");
			clEnqueueWriteImage = provider.getFunctionAddress("clEnqueueWriteImage");
			clEnqueueCopyImage = provider.getFunctionAddress("clEnqueueCopyImage");
			clEnqueueCopyImageToBuffer = provider.getFunctionAddress("clEnqueueCopyImageToBuffer");
			clEnqueueCopyBufferToImage = provider.getFunctionAddress("clEnqueueCopyBufferToImage");
			clEnqueueMapImage = provider.getFunctionAddress("clEnqueueMapImage");
			clGetImageInfo = provider.getFunctionAddress("clGetImageInfo");
			clRetainMemObject = provider.getFunctionAddress("clRetainMemObject");
			clReleaseMemObject = provider.getFunctionAddress("clReleaseMemObject");
			clEnqueueUnmapMemObject = provider.getFunctionAddress("clEnqueueUnmapMemObject");
			clGetMemObjectInfo = provider.getFunctionAddress("clGetMemObjectInfo");
			clCreateSampler = provider.getFunctionAddress("clCreateSampler");
			clRetainSampler = provider.getFunctionAddress("clRetainSampler");
			clReleaseSampler = provider.getFunctionAddress("clReleaseSampler");
			clGetSamplerInfo = provider.getFunctionAddress("clGetSamplerInfo");
			clCreateProgramWithSource = provider.getFunctionAddress("clCreateProgramWithSource");
			clCreateProgramWithBinary = provider.getFunctionAddress("clCreateProgramWithBinary");
			clRetainProgram = provider.getFunctionAddress("clRetainProgram");
			clReleaseProgram = provider.getFunctionAddress("clReleaseProgram");
			clBuildProgram = provider.getFunctionAddress("clBuildProgram");
			clGetProgramInfo = provider.getFunctionAddress("clGetProgramInfo");
			clGetProgramBuildInfo = provider.getFunctionAddress("clGetProgramBuildInfo");
			clCreateKernel = provider.getFunctionAddress("clCreateKernel");
			clCreateKernelsInProgram = provider.getFunctionAddress("clCreateKernelsInProgram");
			clRetainKernel = provider.getFunctionAddress("clRetainKernel");
			clReleaseKernel = provider.getFunctionAddress("clReleaseKernel");
			clSetKernelArg = provider.getFunctionAddress("clSetKernelArg");
			clGetKernelInfo = provider.getFunctionAddress("clGetKernelInfo");
			clGetKernelWorkGroupInfo = provider.getFunctionAddress("clGetKernelWorkGroupInfo");
			clEnqueueNDRangeKernel = provider.getFunctionAddress("clEnqueueNDRangeKernel");
			clEnqueueTask = provider.getFunctionAddress("clEnqueueTask");
			clEnqueueNativeKernel = provider.getFunctionAddress("clEnqueueNativeKernel");
			clGetEventInfo = provider.getFunctionAddress("clGetEventInfo");
			clRetainEvent = provider.getFunctionAddress("clRetainEvent");
			clReleaseEvent = provider.getFunctionAddress("clReleaseEvent");
			clEnqueueMarker = provider.getFunctionAddress("clEnqueueMarker");
			clEnqueueBarrier = provider.getFunctionAddress("clEnqueueBarrier");
			clEnqueueWaitForEvents = provider.getFunctionAddress("clEnqueueWaitForEvents");
			clGetEventProfilingInfo = provider.getFunctionAddress("clGetEventProfilingInfo");
			clFlush = provider.getFunctionAddress("clFlush");
			clFinish = provider.getFunctionAddress("clFinish");
			clGetExtensionFunctionAddress = provider.getFunctionAddress("clGetExtensionFunctionAddress");
		}

	}

}