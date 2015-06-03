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

/** The core OpenCL 2.0 functionality. */
public final class CL20 {

	/** OpenCL Version. */
	public static final int CL_VERSION_2_0 = 0x1;

	/** Error Codes */
	public static final int
		CL_INVALID_PIPE_SIZE    = 0xFFFFFFBB,
		CL_INVALID_DEVICE_QUEUE = 0xFFFFFFBA;

	/** cl_device_info */
	public static final int
		CL_DEVICE_QUEUE_ON_HOST_PROPERTIES             = 0x102A,
		CL_DEVICE_MAX_READ_WRITE_IMAGE_ARGS            = 0x104C,
		CL_DEVICE_MAX_GLOBAL_VARIABLE_SIZE             = 0x104D,
		CL_DEVICE_QUEUE_ON_DEVICE_PROPERTIES           = 0x104E,
		CL_DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE       = 0x104F,
		CL_DEVICE_QUEUE_ON_DEVICE_MAX_SIZE             = 0x1050,
		CL_DEVICE_MAX_ON_DEVICE_QUEUES                 = 0x1051,
		CL_DEVICE_MAX_ON_DEVICE_EVENTS                 = 0x1052,
		CL_DEVICE_SVM_CAPABILITIES                     = 0x1053,
		CL_DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE = 0x1054,
		CL_DEVICE_MAX_PIPE_ARGS                        = 0x1055,
		CL_DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS         = 0x1056,
		CL_DEVICE_PIPE_MAX_PACKET_SIZE                 = 0x1057,
		CL_DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT  = 0x1058,
		CL_DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT    = 0x1059,
		CL_DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT     = 0x105A;

	/** cl_command_queue_properties */
	public static final int
		CL_QUEUE_ON_DEVICE         = 1 << 2,
		CL_QUEUE_ON_DEVICE_DEFAULT = 1 << 3;

	/** cl_device_svm_capabilities */
	public static final int
		CL_DEVICE_SVM_COARSE_GRAIN_BUFFER = 1 << 0,
		CL_DEVICE_SVM_FINE_GRAIN_BUFFER   = 1 << 1,
		CL_DEVICE_SVM_FINE_GRAIN_SYSTEM   = 1 << 2,
		CL_DEVICE_SVM_ATOMICS             = 1 << 3;

	/** cl_command_queue_info */
	public static final int CL_QUEUE_SIZE = 0x1094;

	/** cl_svm_mem_flags */
	public static final int
		CL_MEM_SVM_FINE_GRAIN_BUFFER = 1 << 10,
		CL_MEM_SVM_ATOMICS           = 1 << 11;

	/** cl_mem_object_type */
	public static final int CL_MEM_OBJECT_PIPE = 0x10F7;

	/** cl_mem_info */
	public static final int CL_MEM_USES_SVM_POINTER = 0x1109;

	/** cl_channel_order */
	public static final int
		CL_sRGB  = 0x10BF,
		CL_sRGBx = 0x10C0,
		CL_sRGBA = 0x10C1,
		CL_sBGRA = 0x10C2,
		CL_ABGR  = 0x10C3;

	/** cl_pipe_info */
	public static final int
		CL_PIPE_PACKET_SIZE = 0x1120,
		CL_PIPE_MAX_PACKETS = 0x1121;

	/** cl_sampler_info */
	public static final int
		CL_SAMPLER_MIP_FILTER_MODE = 0x1155,
		CL_SAMPLER_LOD_MIN         = 0x1156,
		CL_SAMPLER_LOD_MAX         = 0x1157;

	/** cl_program_build_info */
	public static final int CL_PROGRAM_BUILD_GLOBAL_VARIABLE_TOTAL_SIZE = 0x1185;

	/** cl_kernel_arg_type_qualifer */
	public static final int CL_KERNEL_ARG_TYPE_PIPE = 1 << 3;

	/** cl_kernel_exec_info */
	public static final int
		CL_KERNEL_EXEC_INFO_SVM_PTRS              = 0x11B6,
		CL_KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM = 0x11B7;

	/** cl_command_type */
	public static final int
		CL_COMMAND_SVM_FREE    = 0x1209,
		CL_COMMAND_SVM_MEMCPY  = 0x120A,
		CL_COMMAND_SVM_MEMFILL = 0x120B,
		CL_COMMAND_SVM_MAP     = 0x120C,
		CL_COMMAND_SVM_UNMAP   = 0x120D;

	/** cl_profiling_info */
	public static final int CL_PROFILING_COMMAND_COMPLETE = 0x1284;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateCommandQueueWithProperties,
		CreatePipe,
		GetPipeInfo,
		SVMAlloc,
		SVMFree,
		EnqueueSVMFree,
		EnqueueSVMMemcpy,
		EnqueueSVMMemFill,
		EnqueueSVMMap,
		EnqueueSVMUnmap,
		SetKernelArgSVMPointer,
		SetKernelExecInfo,
		CreateSamplerWithProperties;

	@JavadocExclude
	public CL20(FunctionProvider provider) {
		CreateCommandQueueWithProperties = provider.getFunctionAddress("clCreateCommandQueueWithProperties");
		CreatePipe = provider.getFunctionAddress("clCreatePipe");
		GetPipeInfo = provider.getFunctionAddress("clGetPipeInfo");
		SVMAlloc = provider.getFunctionAddress("clSVMAlloc");
		SVMFree = provider.getFunctionAddress("clSVMFree");
		EnqueueSVMFree = provider.getFunctionAddress("clEnqueueSVMFree");
		EnqueueSVMMemcpy = provider.getFunctionAddress("clEnqueueSVMMemcpy");
		EnqueueSVMMemFill = provider.getFunctionAddress("clEnqueueSVMMemFill");
		EnqueueSVMMap = provider.getFunctionAddress("clEnqueueSVMMap");
		EnqueueSVMUnmap = provider.getFunctionAddress("clEnqueueSVMUnmap");
		SetKernelArgSVMPointer = provider.getFunctionAddress("clSetKernelArgSVMPointer");
		SetKernelExecInfo = provider.getFunctionAddress("clSetKernelExecInfo");
		CreateSamplerWithProperties = provider.getFunctionAddress("clCreateSamplerWithProperties");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link CL20} instance for the currently loaded ICD. */
	public static CL20 getInstance() {
		return checkFunctionality(CL.getICD().__CL20);
	}

	static CL20 create(FunctionProvider provider) {
		CL20 funcs = new CL20(provider);

		boolean supported = checkFunctions(
			funcs.CreateCommandQueueWithProperties, funcs.CreatePipe, funcs.GetPipeInfo, funcs.SVMAlloc, funcs.SVMFree, funcs.EnqueueSVMFree, 
			funcs.EnqueueSVMMemcpy, funcs.EnqueueSVMMemFill, funcs.EnqueueSVMMap, funcs.EnqueueSVMUnmap, funcs.SetKernelArgSVMPointer, funcs.SetKernelExecInfo, 
			funcs.CreateSamplerWithProperties
		);

		return supported ? funcs : null;
	}

	// --- [ clCreateCommandQueueWithProperties ] ---

	/** JNI method for {@link #clCreateCommandQueueWithProperties CreateCommandQueueWithProperties} */
	@JavadocExclude
	public static native long nclCreateCommandQueueWithProperties(long context, long device, long properties, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateCommandQueueWithProperties CreateCommandQueueWithProperties} */
	@JavadocExclude
	public static long nclCreateCommandQueueWithProperties(long context, long device, long properties, long errcode_ret) {
		long __functionAddress = getInstance().CreateCommandQueueWithProperties;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(context);
			checkPointer(device);
		}
		return nclCreateCommandQueueWithProperties(context, device, properties, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a host or device command-queue on a specific device.
	 * 
	 * <p>OpenCL objects such as memory, program and kernel objects are created using a context. Operations on these objects are performed using a command-queue.
	 * The command-queue can be used to queue a set of operations (referred to as commands) in order. Having multiple command-queues allows applications to
	 * queue multiple independent commands without requiring synchronization. Note that this should work as long as these objects are not being shared. Sharing
	 * of objects across multiple command-queues will require the application to perform appropriate synchronization.</p>
	 *
	 * @param context     a valid OpenCL context
	 * @param device      a device associated with context. It can either be in the list of devices specified when context is created using {@link CL10#clCreateContext CreateContext} or have the same
	 *                    device type as device type specified when context is created using {@link CL10#clCreateContextFromType CreateContextFromType}.
	 * @param properties  a list of properties for the command-queue and their corresponding values. Each property name is immediately followed by the corresponding desired
	 *                    value. The list is terminated with {@code 0}. If a supported property and its value is not specified in properties, its default value will be used.
	 *                    {@code properties} can be {@code NULL} in which case the default values for supported command-queue properties will be used. One of:<br>{@link CL10#CL_QUEUE_PROPERTIES QUEUE_PROPERTIES}, {@link #CL_QUEUE_SIZE QUEUE_SIZE}
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero command-queue and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the command-queue is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not a valid device or is not associated with {@code context}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code properties} are not valid.</li>
	 *         <li>{@link CL10#CL_INVALID_QUEUE_PROPERTIES INVALID_QUEUE_PROPERTIES} if values specified in {@code properties} are valid but are not supported by the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateCommandQueueWithProperties(long context, long device, ByteBuffer properties, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		return nclCreateCommandQueueWithProperties(context, device, memAddress(properties), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateCommandQueueWithProperties CreateCommandQueueWithProperties} */
	public static long clCreateCommandQueueWithProperties(long context, long device, LongBuffer properties, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateCommandQueueWithProperties(context, device, memAddress(properties), memAddressSafe(errcode_ret));
	}

	// --- [ clCreatePipe ] ---

	/** JNI method for {@link #clCreatePipe CreatePipe} */
	@JavadocExclude
	public static native long nclCreatePipe(long context, long flags, int pipe_packet_size, int pipe_max_packets, long properties, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreatePipe CreatePipe} */
	@JavadocExclude
	public static long nclCreatePipe(long context, long flags, int pipe_packet_size, int pipe_max_packets, long properties, long errcode_ret) {
		long __functionAddress = getInstance().CreatePipe;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclCreatePipe(context, flags, pipe_packet_size, pipe_max_packets, properties, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a pipe object.
	 *
	 * @param context          a valid OpenCL context used to create the pipe object
	 * @param flags            a bit-field that is used to specify allocation and usage information such as the memory arena that should be used to allocate the pipe object and
	 *                         how it will be used. If value specified for flags is 0, the default is used which is {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}.
	 * @param pipe_packet_size the size in bytes of a pipe packet
	 * @param pipe_max_packets the pipe capacity by specifying the maximum number of packets the pipe can hold
	 * @param properties       a list of properties for the pipe and their corresponding values. Each property name is immediately followed by the corresponding desired value. The
	 *                         list is terminated with {@code 0}. In OpenCL 2.0, {@code properties} must be {@code NULL}.
	 * @param errcode_ret      will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero pipe object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the pipe object is created successfully. Otherwise, it returns a {@code NULL} value with
	 *         one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are invalid.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code properties} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_PIPE_SIZE INVALID_PIPE_SIZE} if {@code pipe_packet_size} is {@code 0} or the {@code pipe_packet_size} exceeds {@link #CL_DEVICE_PIPE_MAX_PACKET_SIZE DEVICE_PIPE_MAX_PACKET_SIZE}
	 *         value for all devices in {@code context} or if {@code pipe_max_packets} is {@code 0}.</li>
	 *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for the pipe object.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreatePipe(long context, long flags, int pipe_packet_size, int pipe_max_packets, ByteBuffer properties, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		return nclCreatePipe(context, flags, pipe_packet_size, pipe_max_packets, memAddress(properties), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreatePipe CreatePipe} */
	public static long clCreatePipe(long context, long flags, int pipe_packet_size, int pipe_max_packets, IntBuffer properties, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreatePipe(context, flags, pipe_packet_size, pipe_max_packets, memAddress(properties), memAddressSafe(errcode_ret));
	}

	// --- [ clGetPipeInfo ] ---

	/** JNI method for {@link #clGetPipeInfo GetPipeInfo} */
	@JavadocExclude
	public static native int nclGetPipeInfo(long pipe, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetPipeInfo GetPipeInfo} */
	@JavadocExclude
	public static int nclGetPipeInfo(long pipe, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetPipeInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pipe);
		return nclGetPipeInfo(pipe, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Queries information specific to a pipe object.
	 *
	 * @param pipe                 the pipe object being queried
	 * @param param_name           the information to query
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type and
	 *         {@code param_value} is not {@code NULL}.</li>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code pipe} is not a valid pipe object.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetPipeInfo(long pipe, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetPipeInfo(pipe, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetPipeInfo GetPipeInfo} */
	public static int clGetPipeInfo(long pipe, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetPipeInfo(pipe, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetPipeInfo GetPipeInfo} */
	public static int clGetPipeInfo(long pipe, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetPipeInfo(pipe, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	// --- [ clSVMAlloc ] ---

	/** JNI method for {@link #clSVMAlloc SVMAlloc} */
	@JavadocExclude
	public static native long nclSVMAlloc(long context, long flags, long size, int alignment, long __functionAddress);

	/** Unsafe version of {@link #clSVMAlloc SVMAlloc} */
	@JavadocExclude
	public static long nclSVMAlloc(long context, long flags, long size, int alignment) {
		long __functionAddress = getInstance().SVMAlloc;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclSVMAlloc(context, flags, size, alignment, __functionAddress);
	}

	/**
	 * Allocates a shared virtual memory buffer (referred to as a SVM buffer) that can be shared by the host and all devices in an OpenCL context that support
	 * shared virtual memory.
	 * 
	 * <p>If {@link #CL_MEM_SVM_FINE_GRAIN_BUFFER MEM_SVM_FINE_GRAIN_BUFFER} is not specified, the buffer can be created as a coarse grained SVM allocation. Similarly, if
	 * {@link #CL_MEM_SVM_ATOMICS MEM_SVM_ATOMICS} is not specified, the buffer can be created without support for the OpenCL 2.0 SVM atomic operations.</p>
	 * 
	 * <p>Calling {@code SVMAlloc} does not itself provide consistency for the shared memory region. When the host can't use the SVM atomic operations, it must
	 * rely on OpenCL's guaranteed memory consistency at synchronization points. To initialize a buffer to be shared with a kernel, the host can create the
	 * buffer and use the resulting virtual memory pointer to initialize the buffer's contents.</p>
	 * 
	 * <p>For SVM to be used efficiently, the host and any devices sharing a buffer containing virtual memory pointers should have the same endianness. If the
	 * context passed to {@code SVMAlloc} has devices with mixed endianness and the OpenCL implementation is unable to implement SVM because of that mixed
	 * endianness, {@code SVMAlloc} will fail and return {@code NULL}.</p>
	 * 
	 * <p>Although SVM is generally not supported for image objects, {@link CL12#clCreateImage CreateImage} may create an image from a buffer (a 1D image from a buffer
	 * or a 2D image from buffer) if the buffer specified in its image description parameter is a SVM buffer. Such images have a linear memory representation
	 * so their memory can be shared using SVM. However, fine grained sharing and atomics are not supported for image reads and writes in a kernel.</p>
	 * 
	 * <p>If {@link CL10#clCreateBuffer CreateBuffer} is called with a pointer returned by {@code SVMAlloc} as its {@code host_ptr} argument, and
	 * {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} is set in its {@code flags} argument, {@code CreateBuffer} will succeed and return a valid non-zero buffer object as
	 * long as the {@code size} argument to {@code CreateBuffer} is no larger than the {@code size} argument passed in the original {@code SVMAlloc} call. The
	 * new buffer object returned has the shared memory as the underlying storage. Locations in the buffer's underlying shared memory can be operated on using,
	 * e.g., atomic operations if the device supports them.</p>
	 *
	 * @param context   a valid OpenCL context used to create the SVM buffer
	 * @param flags     a bit-field that is used to specify allocation and usage information. One of:<br>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}, {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}, {@link #CL_MEM_SVM_FINE_GRAIN_BUFFER MEM_SVM_FINE_GRAIN_BUFFER}, {@link #CL_MEM_SVM_ATOMICS MEM_SVM_ATOMICS}
	 * @param size      the size in bytes of the SVM buffer to be allocated
	 * @param alignment the minimum alignment in bytes that is required for the newly created buffer's memory region. It must be a power of two up to the largest data type
	 *                  supported by the OpenCL device. For the full profile, the largest data type is {@code long16}. For the embedded profile, it is {@code long16} if the
	 *                  device supports 64-bit integers; otherwise it is {@code int16}. If alignment is {@code 0}, a default alignment will be used that is equal to the
	 *                  size of largest data type supported by the OpenCL implementation.
	 *
	 * @return a valid non-{@code NULL} shared virtual memory address if the SVM buffer is successfully allocated. Otherwise, like {@code malloc}, it returns a {@code NULL} pointer
	 *         value. {@code SVMAlloc} will fail if:
	 *         <ul>
	 *         <li>{@code context} is not a valid context.</li>
	 *         <li>{@code flags} does not contain {@link #CL_MEM_SVM_FINE_GRAIN_BUFFER MEM_SVM_FINE_GRAIN_BUFFER} but does contain {@link #CL_MEM_SVM_ATOMICS MEM_SVM_ATOMICS}.</li>
	 *         <li>Values specified in {@code flags} do not follow rules for supported values.</li>
	 *         <li>{@link #CL_MEM_SVM_FINE_GRAIN_BUFFER MEM_SVM_FINE_GRAIN_BUFFER} or {@link #CL_MEM_SVM_ATOMICS MEM_SVM_ATOMICS} is specified in flags and these are not supported by at least one device in context.</li>
	 *         <li>The values specified in {@code flags} are not valid.</li>
	 *         <li>{@code size} is {@code 0} or &gt; {@link CL10#CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} value for any device in context.</li>
	 *         <li>{@code alignment} is not a power of two or the OpenCL implementation cannot support the specified alignment for at least one device in context.</li>
	 *         <li>There was a failure to allocate resources.</li>
	 *         </ul>
	 */
	public static ByteBuffer clSVMAlloc(long context, long flags, long size, int alignment) {
		long __result = nclSVMAlloc(context, flags, size, alignment);
		return memByteBuffer(__result, (int)size);
	}

	// --- [ clSVMFree ] ---

	/** JNI method for {@link #clSVMFree SVMFree} */
	@JavadocExclude
	public static native void nclSVMFree(long context, long svm_pointer, long __functionAddress);

	/** Unsafe version of {@link #clSVMFree SVMFree} */
	@JavadocExclude
	public static void nclSVMFree(long context, long svm_pointer) {
		long __functionAddress = getInstance().SVMFree;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		nclSVMFree(context, svm_pointer, __functionAddress);
	}

	/**
	 * Frees a shared virtual memory buffer allocated using {@link #clSVMAlloc SVMAlloc}.
	 * 
	 * <p>Note that {@code SVMFree} does not wait for previously enqueued commands that may be using {@code svm_pointer} to finish before freeing
	 * {@code svm_pointer}. It is the responsibility of the application to make sure that enqueued commands that use {@code svm_pointer} have finished before
	 * freeing {@code svm_pointer}. This can be done by enqueuing a blocking operation such as {@link CL10#clFinish Finish}, {@link CL10#clWaitForEvents WaitForEvents},
	 * {@link CL10#clEnqueueReadBuffer EnqueueReadBuffer} or by registering a callback with the events associated with enqueued commands and when the last enqueued command
	 * has finished freeing {@code svm_pointer}.</p>
	 * 
	 * <p>The behavior of using {@code svm_pointer} after it has been freed is undefined. In addition, if a buffer object is created using
	 * {@link CL10#clCreateBuffer CreateBuffer} with {@code svm_pointer}, the buffer object must first be released before the {@code svm_pointer} is freed.</p>
	 *
	 * @param context     a valid OpenCL context used to create the SVM buffer
	 * @param svm_pointer must be the value returned by a call to {@link #clSVMAlloc SVMAlloc}. If a {@code NULL} pointer is passed in {@code svm_pointer}, no action occurs.
	 */
	public static void clSVMFree(long context, ByteBuffer svm_pointer) {
		nclSVMFree(context, memAddress(svm_pointer));
	}

	// --- [ clEnqueueSVMFree ] ---

	/** JNI method for {@link #clEnqueueSVMFree EnqueueSVMFree} */
	@JavadocExclude
	public static native int nclEnqueueSVMFree(long command_queue, int num_svm_pointers, long svm_pointers, long pfn_free_func, long user_data, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueSVMFree EnqueueSVMFree} */
	@JavadocExclude
	public static int nclEnqueueSVMFree(long command_queue, int num_svm_pointers, long svm_pointers, long pfn_free_func, long user_data, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueSVMFree;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclEnqueueSVMFree(command_queue, num_svm_pointers, svm_pointers, pfn_free_func, user_data, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to free the shared virtual memory buffer allocated using {@link #clSVMAlloc SVMAlloc} or a shared system memory pointer.
	 *
	 * @param command_queue           a valid host command-queue
	 * @param num_svm_pointers        the number of pointers in the {@code svm_pointers} array
	 * @param svm_pointers            the shared virtual memory pointers to be freed. Each pointer in {@code svm_pointers} that was allocated using {@link #clSVMAlloc SVMAlloc} must have been allocated
	 *                                from the same context from which {@code command_queue} was created. The memory associated with {@code svm_pointers} can be reused or freed after the
	 *                                function returns.
	 * @param pfn_free_func           the callback function to be called to free the SVM pointers. If pfn_free_func is {@code NULL}, all pointers specified in {@code svm_pointers} must be
	 *                                allocated using {@link #clSVMAlloc SVMAlloc} and the OpenCL implementation will free these SVM pointers. {@code pfn_free_func} must be a valid callback function if any
	 *                                SVM pointer to be freed is a shared system memory pointer i.e. not allocated using {@link #clSVMAlloc SVMAlloc}. If {@code pfn_free_func} is a valid callback function,
	 *                                the OpenCL implementation will call {@code pfn_free_func} to free all the SVM pointers specified in {@code svm_pointers}.
	 * @param user_data               will be passed as the {@code user_data} argument when {@code pfn_free_func} is called. {@code user_data} can be {@code NULL}.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code num_svm_pointers} is {@code 0} or if {@code svm_pointers} is {@code NULL} or if any of the pointers specified in
	 *         {@code svm_pointers} array is {@code NULL}.</li>
	 *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueSVMFree(long command_queue, int num_svm_pointers, ByteBuffer svm_pointers, CLSVMFreeCallback pfn_free_func, ByteBuffer user_data, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(svm_pointers, num_svm_pointers << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueSVMFree(command_queue, num_svm_pointers, memAddress(svm_pointers), pfn_free_func == null ? NULL : pfn_free_func.getPointer(), memAddressSafe(user_data), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueSVMFree EnqueueSVMFree} */
	public static int clEnqueueSVMFree(long command_queue, PointerBuffer svm_pointers, CLSVMFreeCallback pfn_free_func, ByteBuffer user_data, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueSVMFree(command_queue, svm_pointers.remaining(), memAddress(svm_pointers), pfn_free_func == null ? NULL : pfn_free_func.getPointer(), memAddressSafe(user_data), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueSVMMemcpy ] ---

	/** JNI method for {@link #clEnqueueSVMMemcpy EnqueueSVMMemcpy} */
	@JavadocExclude
	public static native int nclEnqueueSVMMemcpy(long command_queue, int blocking_copy, long dst_ptr, long src_ptr, long size, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueSVMMemcpy EnqueueSVMMemcpy} */
	@JavadocExclude
	public static int nclEnqueueSVMMemcpy(long command_queue, int blocking_copy, long dst_ptr, long src_ptr, long size, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueSVMMemcpy;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclEnqueueSVMMemcpy(command_queue, blocking_copy, dst_ptr, src_ptr, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to do a {@code memcpy} operation.
	 * 
	 * <p>If {@code dst_ptr} and/or {@code src_ptr} are allocated using {@link #clSVMAlloc SVMAlloc} then they must be allocated from the same context from which
	 * {@code command_queue} was created. Otherwise the behavior is undefined.</p>
	 *
	 * @param command_queue           the host command-queue in which the read / write command will be queued
	 * @param blocking_copy           indicates if the copy operation is <em>blocking</em> or <em>non-blocking</em>.
	 *                                
	 *                                <p>If {@code blocking_copy} is {@link CL10#CL_TRUE TRUE} i.e. the copy command is blocking, {@code EnqueueSVMMemcpy} does not return until the buffer data has been copied
	 *                                into memory pointed to by {@code dst_ptr}.</p>
	 *                                
	 *                                <p>If {@code blocking_copy} is {@link CL10#CL_FALSE FALSE} i.e. the copy command is non-blocking, {@code EnqueueSVMMemcpy} queues a non-blocking copy command and returns.
	 *                                The contents of the buffer that {@code dst_ptr} point to cannot be used until the copy command has completed. The event argument returns an event
	 *                                object which can be used to query the execution status of the read command. When the copy command has completed, the contents of the buffer that
	 *                                {@code dst_ptr} points to can be used by the application.</p>
	 * @param dst_ptr                 the pointer to a memory region where data is copied to
	 * @param src_ptr                 the pointer to a memory region where data is copied from
	 * @param size                    the size in bytes of data being copied
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the copy operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code dst_ptr} or {@code src_ptr} are {@code NULL}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code size} is {@code 0}.</li>
	 *         <li>{@link CL10#CL_MEM_COPY_OVERLAP MEM_COPY_OVERLAP} if the values specified for {@code dst_ptr}, {@code src_ptr} and {@code size} result in an overlapping copy.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueSVMMemcpy(long command_queue, int blocking_copy, ByteBuffer dst_ptr, ByteBuffer src_ptr, long size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueSVMMemcpy(command_queue, blocking_copy, memAddress(dst_ptr), memAddress(src_ptr), size, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueSVMMemcpy EnqueueSVMMemcpy} */
	public static int clEnqueueSVMMemcpy(long command_queue, int blocking_copy, ByteBuffer dst_ptr, ByteBuffer src_ptr, long size, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueSVMMemcpy(command_queue, blocking_copy, memAddress(dst_ptr), memAddress(src_ptr), size, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueSVMMemFill ] ---

	/** JNI method for {@link #clEnqueueSVMMemFill EnqueueSVMMemFill} */
	@JavadocExclude
	public static native int nclEnqueueSVMMemFill(long command_queue, long svm_ptr, long pattern, long pattern_size, long size, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueSVMMemFill EnqueueSVMMemFill} */
	@JavadocExclude
	public static int nclEnqueueSVMMemFill(long command_queue, long svm_ptr, long pattern, long pattern_size, long size, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueSVMMemFill;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclEnqueueSVMMemFill(command_queue, svm_ptr, pattern, pattern_size, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to fill a region in memory with a pattern of a given pattern size.
	 *
	 * @param command_queue           the host command-queue in which the fill command will be queued
	 * @param svm_ptr                 a pointer to a memory region that will be filled with pattern. It must be aligned to {@code pattern_size} bytes. If {@code svm_ptr} is allocated
	 *                                using {@link #clSVMAlloc SVMAlloc} then it must be allocated from the same context from which {@code command_queue} was created. Otherwise the behavior is undefined.
	 * @param pattern                 a pointer to the data pattern of size {@code pattern_size} in bytes. {@code pattern} will be used to fill a region in buffer starting at
	 *                                {@code svm_ptr} and is {@code size} bytes in size. The data pattern must be a scalar or vector integer or floating-point data type supported by
	 *                                OpenCL. For example, if region pointed to by {@code svm_ptr} is to be filled with a pattern of float4 values, then pattern will be a pointer to a
	 *                                {@code cl_float4} value and {@code pattern_size} will be {@code sizeof(cl_float4)}. The maximum value of {@code pattern_size} is the size of the
	 *                                largest integer or floating-point vector data type supported by the OpenCL device. The memory associated with pattern can be reused or freed after
	 *                                the function returns.
	 * @param pattern_size            the size of the {@code pattern} array, in bytes
	 * @param size                    the size in bytes of region being filled starting with {@code svm_ptr} and must be a multiple of {@code pattern_size}
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code svm_ptr} is {@code NULL}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code svm_ptr} is not aligned to {@code pattern_size} bytes.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pattern} is {@code NULL} or if {@code pattern_size} is {@code 0} or if {@code pattern_size} is not one of
	 *         {@code &#123;1, 2, 4, 8, 16, 32, 64, 128&#125;}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code size} is {@code 0} or is not a multiple of {@code pattern_size}.</li>
	 *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueSVMMemFill(long command_queue, ByteBuffer svm_ptr, ByteBuffer pattern, long pattern_size, long size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pattern, pattern_size);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueSVMMemFill(command_queue, memAddress(svm_ptr), memAddress(pattern), pattern_size, size, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueSVMMemFill EnqueueSVMMemFill} */
	public static int clEnqueueSVMMemFill(long command_queue, ByteBuffer svm_ptr, ByteBuffer pattern, long size, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueSVMMemFill(command_queue, memAddress(svm_ptr), memAddress(pattern), pattern.remaining(), size, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueSVMMap ] ---

	/** JNI method for {@link #clEnqueueSVMMap EnqueueSVMMap} */
	@JavadocExclude
	public static native int nclEnqueueSVMMap(long command_queue, int blocking_map, long map_flags, long svm_ptr, long size, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueSVMMap EnqueueSVMMap} */
	@JavadocExclude
	public static int nclEnqueueSVMMap(long command_queue, int blocking_map, long map_flags, long svm_ptr, long size, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueSVMMap;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclEnqueueSVMMap(command_queue, blocking_map, map_flags, svm_ptr, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command that will allow the host to update a region of a SVM buffer. Note that since we are enqueuing a command with a SVM buffer, the region
	 * is already mapped in the host address space.
	 *
	 * @param command_queue           a valid host command-queue
	 * @param blocking_map            indicates if the map operation is blocking or non-blocking.
	 *                                
	 *                                <p>If {@code blocking_map} is {@link CL10#CL_TRUE TRUE}, {@code EnqueueSVMMap} does not return until the application can access the contents of the SVM region specified by
	 *                                {@code svm_ptr} and {@code size} on the host.</p>
	 *                                
	 *                                <p>If {@code blocking_map} is {@link CL10#CL_FALSE FALSE} i.e. map operation is non-blocking, the region specified by {@code svm_ptr} and {@code size} cannot be used until
	 *                                the map command has completed. The event argument returns an event object which can be used to query the execution status of the map command. When
	 *                                the map command is completed, the application can access the contents of the region specified by {@code svm_ptr} and {@code size}.</p>
	 * @param map_flags               a bit-field
	 * @param svm_ptr                 a pointer to a memory region and {@code size} in bytes that will be updated by the host. If {@code svm_ptr} is allocated using {@link #clSVMAlloc SVMAlloc} then it
	 *                                must be allocated from the same context from which {@code command_queue} was created. Otherwise the behavior is undefined.
	 * @param size                    the size of the memory region to map, in bytes
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code svm_ptr} is {@code NULL}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code size} is {@code 0} or if values specified in {@code map_flags} are not valid.</li>
	 *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the map operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueSVMMap(long command_queue, int blocking_map, long map_flags, ByteBuffer svm_ptr, long size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(svm_ptr, size);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueSVMMap(command_queue, blocking_map, map_flags, memAddress(svm_ptr), size, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueSVMMap EnqueueSVMMap} */
	public static int clEnqueueSVMMap(long command_queue, int blocking_map, long map_flags, ByteBuffer svm_ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueSVMMap(command_queue, blocking_map, map_flags, memAddress(svm_ptr), svm_ptr.remaining(), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueSVMUnmap ] ---

	/** JNI method for {@link #clEnqueueSVMUnmap EnqueueSVMUnmap} */
	@JavadocExclude
	public static native int nclEnqueueSVMUnmap(long command_queue, long svm_ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueSVMUnmap EnqueueSVMUnmap} */
	@JavadocExclude
	public static int nclEnqueueSVMUnmap(long command_queue, long svm_ptr, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueSVMUnmap;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclEnqueueSVMUnmap(command_queue, svm_ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Enqueues a command to indicate that the host has completed updating the region given by {@code svm_ptr} and which was specified in a previous call to
	 * {@link #clEnqueueSVMMap EnqueueSVMMap}.
	 *
	 * @param command_queue           a valid host command-queue
	 * @param svm_ptr                 a pointer that was specified in a previous call to {@link #clEnqueueSVMMap EnqueueSVMMap}. If {@code svm_ptr} is allocated using {@link #clSVMAlloc SVMAlloc} then it must be allocated from
	 *                                the same context from which {@code command_queue} was created. Otherwise the behavior is undefined.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code svm_ptr} is {@code NULL}.</li>
	 *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueSVMUnmap(long command_queue, ByteBuffer svm_ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueSVMUnmap(command_queue, memAddress(svm_ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueSVMUnmap EnqueueSVMUnmap} */
	public static int clEnqueueSVMUnmap(long command_queue, ByteBuffer svm_ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueSVMUnmap(command_queue, memAddress(svm_ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clSetKernelArgSVMPointer ] ---

	/** JNI method for {@link #clSetKernelArgSVMPointer SetKernelArgSVMPointer} */
	@JavadocExclude
	public static native int nclSetKernelArgSVMPointer(long kernel, int arg_index, long arg_value, long __functionAddress);

	/** Unsafe version of {@link #clSetKernelArgSVMPointer SetKernelArgSVMPointer} */
	@JavadocExclude
	public static int nclSetKernelArgSVMPointer(long kernel, int arg_index, long arg_value) {
		long __functionAddress = getInstance().SetKernelArgSVMPointer;
		if ( LWJGLUtil.CHECKS )
			checkPointer(kernel);
		return nclSetKernelArgSVMPointer(kernel, arg_index, arg_value, __functionAddress);
	}

	/**
	 * Set a SVM pointer as the argument value for a specific argument of a kernel.
	 *
	 * @param kernel    a valid kernel object
	 * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from {@code 0} for the leftmost argument to {@code n - 1}, where
	 *                  {@code n} is the total number of arguments declared by a kernel.
	 * @param arg_value the SVM pointer that should be used as the argument value for argument specified by {@code arg_index}. The SVM pointer specified is the value used
	 *                  by all API calls that enqueue kernel ({@link CL10#clEnqueueNDRangeKernel EnqueueNDRangeKernel}) until the argument value is changed by a call to
	 *                  {@code SetKernelArgSVMPointer} for {@code kernel}. The SVM pointer can only be used for arguments that are declared to be a pointer to global or
	 *                  constant memory. The SVM pointer value must be aligned according to the argument's type. For example, if the argument is declared to be
	 *                  {@code global float4 *p}, the SVM pointer value passed for {@code p} must be at a minimum aligned to a {@code float4}. The SVM pointer value
	 *                  specified as the argument value can be the pointer returned by {@link #clSVMAlloc SVMAlloc} or can be a pointer + offset into the SVM region.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
	 *         <li>{@link CL10#CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
	 *         <li>{@link CL10#CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clSetKernelArgSVMPointer(long kernel, int arg_index, ByteBuffer arg_value) {
		return nclSetKernelArgSVMPointer(kernel, arg_index, memAddress(arg_value));
	}

	// --- [ clSetKernelExecInfo ] ---

	/** JNI method for {@link #clSetKernelExecInfo SetKernelExecInfo} */
	@JavadocExclude
	public static native int nclSetKernelExecInfo(long kernel, int param_name, long param_value_size, long param_value, long __functionAddress);

	/** Unsafe version of {@link #clSetKernelExecInfo SetKernelExecInfo} */
	@JavadocExclude
	public static int nclSetKernelExecInfo(long kernel, int param_name, long param_value_size, long param_value) {
		long __functionAddress = getInstance().SetKernelExecInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(kernel);
		return nclSetKernelExecInfo(kernel, param_name, param_value_size, param_value, __functionAddress);
	}

	/**
	 * Can be used to pass additional information other than argument values to a kernel.
	 * 
	 * <p>NOTES</p>
	 * 
	 * <p>1. Coarse-grain or fine-grain buffer SVM pointers used by a kernel which are not passed as a kernel arguments must be specified using
	 * {@code SetKernelExecInfo} with {@link #CL_KERNEL_EXEC_INFO_SVM_PTRS KERNEL_EXEC_INFO_SVM_PTRS}. For example, if SVM buffer A contains a pointer to another SVM buffer B, and the
	 * kernel dereferences that pointer, then a pointer to B must either be passed as an argument in the call to that kernel or it must be made available to
	 * the kernel using {@code SetKernelExecInfo}. For example, we might pass extra SVM pointers as follows:</p>
	 * 
	 * <p><code style="font-family: monospace">clSetKernelExecInfo(kernel, CL_KERNEL_EXEC_INFO_SVM_PTRS, num_ptrs * sizeof(void *), extra_svm_ptr_list);</code></p>
	 * 
	 * <p>Here {@code num_ptrs} specifies the number of additional SVM pointers while {@code extra_svm_ptr_list} specifies a pointer to memory containing those
	 * SVM pointers. When calling {@code SetKernelExecInfo} with {@link #CL_KERNEL_EXEC_INFO_SVM_PTRS KERNEL_EXEC_INFO_SVM_PTRS} to specify pointers to non-argument SVM buffers as extra
	 * arguments to a kernel, each of these pointers can be the SVM pointer returned by {@link #clSVMAlloc SVMAlloc} or can be a pointer + offset into the SVM region. It is
	 * sufficient to provide one pointer for each SVM buffer used.</p>
	 * 
	 * <p>2. {@link #CL_KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM} is used to indicate whether SVM pointers used by a kernel will refer to system allocations or not.</p>
	 * 
	 * <p>{@link #CL_KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM} = {@link CL10#CL_FALSE FALSE} indicates that the OpenCL implementation may assume that system pointers are not passed as
	 * kernel arguments and are not stored inside SVM allocations passed as kernel arguments.</p>
	 * 
	 * <p>{@link #CL_KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM} = {@link CL10#CL_TRUE TRUE} indicates that the OpenCL implementation must assume that system pointers might be passed as
	 * kernel arguments and/or stored inside SVM allocations passed as kernel arguments. In this case, if the device to which the kernel is enqueued does not
	 * support system SVM pointers, {@link CL10#clEnqueueNDRangeKernel EnqueueNDRangeKernel} will return a {@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} error. If none of the devices in the context
	 * associated with kernel support fine-grain system SVM allocations, {@code SetKernelExecInfo} will return a {@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} error.</p>
	 * 
	 * <p>If {@code SetKernelExecInfo} has not been called with a value for {@link #CL_KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM}, the default value is used for this
	 * kernel attribute. The default value depends on whether the device on which the kernel is enqueued supports fine-grain system SVM allocations. If so, the
	 * default value used is {@link CL10#CL_TRUE TRUE} (system pointers might be passed); otherwise, the default is {@link CL10#CL_FALSE FALSE}.</p>
	 *
	 * @param kernel           the kernel object being queried
	 * @param param_name       the information to be passed to {@code kernel}
	 * @param param_value_size the size in bytes of the memory pointed to by {@code param_value}
	 * @param param_value      a pointer to memory where the appropriate values determined by {@code param_name} are specified
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, if {@code param_value} is {@code NULL} or if the size specified by {@code param_value_size} is not valid.</li>
	 *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code param_name} = {@link #CL_KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM} and {@code param_value} = {@link CL10#CL_TRUE TRUE} but no devices in
	 *         context associated with kernel support fine-grain system SVM allocations.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clSetKernelExecInfo(long kernel, int param_name, long param_value_size, ByteBuffer param_value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param_value, param_value_size);
		return nclSetKernelExecInfo(kernel, param_name, param_value_size, memAddress(param_value));
	}

	/** PointerBuffer version of: {@link #clSetKernelExecInfo SetKernelExecInfo} */
	public static int clSetKernelExecInfo(long kernel, int param_name, PointerBuffer param_value) {
		return nclSetKernelExecInfo(kernel, param_name, param_value.remaining() << POINTER_SHIFT, memAddress(param_value));
	}

	/** IntBuffer version of: {@link #clSetKernelExecInfo SetKernelExecInfo} */
	public static int clSetKernelExecInfo(long kernel, int param_name, IntBuffer param_value) {
		return nclSetKernelExecInfo(kernel, param_name, param_value.remaining() << 2, memAddress(param_value));
	}

	// --- [ clCreateSamplerWithProperties ] ---

	/** JNI method for {@link #clCreateSamplerWithProperties CreateSamplerWithProperties} */
	@JavadocExclude
	public static native long nclCreateSamplerWithProperties(long context, long sampler_properties, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateSamplerWithProperties CreateSamplerWithProperties} */
	@JavadocExclude
	public static long nclCreateSamplerWithProperties(long context, long sampler_properties, long errcode_ret) {
		long __functionAddress = getInstance().CreateSamplerWithProperties;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclCreateSamplerWithProperties(context, sampler_properties, errcode_ret, __functionAddress);
	}

	/**
	 * Creates a sampler object.
	 *
	 * @param context            a valid OpenCL context
	 * @param sampler_properties a list of sampler property names and their corresponding values. Each sampler property name is immediately followed by the corresponding desired
	 *                           value. The list is terminated with {@code 0}. If a supported property and its value is not specified in {@code sampler_properties}, its default
	 *                           value will be used. {@code sampler_properties} can be {@code NULL} in which case the default values for supported sampler properties will be used.
	 * @param errcode_ret        will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero sampler object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the sampler object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the property name in {@code sampler_properties} is not a supported property name, if the value specified for a supported property
	 *         name is not valid, or if the same property name is specified more than once.</li>
	 *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if images are not supported by any device associated with context.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateSamplerWithProperties(long context, ByteBuffer sampler_properties, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( sampler_properties != null ) checkNT4(sampler_properties);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return nclCreateSamplerWithProperties(context, memAddressSafe(sampler_properties), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateSamplerWithProperties CreateSamplerWithProperties} */
	public static long clCreateSamplerWithProperties(long context, IntBuffer sampler_properties, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( sampler_properties != null ) checkNT(sampler_properties);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateSamplerWithProperties(context, memAddressSafe(sampler_properties), memAddressSafe(errcode_ret));
	}

     /**
	 * Creates a {@link CLSVMFreeCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLSVMFreeCallback} instance
	 */
	public static CLSVMFreeCallback CLSVMFreeCallback(final CLSVMFreeCallback.SAM sam) {
		return new CLSVMFreeCallback() {
			@Override
			public void invoke(long queue, int num_svm_pointers, long svm_pointers, long user_data) {
				sam.invoke(queue, num_svm_pointers, svm_pointers, user_data);
			}
		};
	}

}