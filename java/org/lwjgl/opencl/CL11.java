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

/** The core OpenCL 1.1 functionality. */
public final class CL11 {

	/** Error Codes. */
	public static final int
		CL_MISALIGNED_SUB_BUFFER_OFFSET              = -13,
		CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST = -14,
		CL_INVALID_PROPERTY                          = -64;

	/** OpenCL Version. */
	public static final int
		CL_VERSION_1_1 = 0x1;

	/** cl_device_info. */
	public static final int
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_HALF = 0x1034,
		CL_DEVICE_HOST_UNIFIED_MEMORY         = 0x1035,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_CHAR    = 0x1036,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_SHORT   = 0x1037,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_INT     = 0x1038,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_LONG    = 0x1039,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_FLOAT   = 0x103A,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE  = 0x103B,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF    = 0x103C,
		CL_DEVICE_OPENCL_C_VERSION            = 0x103D;

	/** cl_device_fp_config - bitfield. */
	public static final int
		CL_FP_SOFT_FLOAT = 1 << 6;

	/** cl_context_info. */
	public static final int
		CL_CONTEXT_NUM_DEVICES = 0x1083;

	/** cl_channel_order. */
	public static final int
		CL_Rx   = 0x10BA,
		CL_RGx  = 0x10BB,
		CL_RGBx = 0x10BC;

	/** cl_mem_info. */
	public static final int
		CL_MEM_ASSOCIATED_MEMOBJECT = 0x1107,
		CL_MEM_OFFSET               = 0x1108;

	/** cl_addressing_mode. */
	public static final int
		CL_ADDRESS_MIRRORED_REPEAT = 0x1134;

	/** cl_kernel_work_group_info. */
	public static final int
		CL_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE = 0x11B3,
		CL_KERNEL_PRIVATE_MEM_SIZE                   = 0x11B4;

	/** cl_event_info. */
	public static final int
		CL_EVENT_CONTEXT = 0x11D4;

	/** cl_command_type. */
	public static final int
		CL_COMMAND_READ_BUFFER_RECT  = 0x1201,
		CL_COMMAND_WRITE_BUFFER_RECT = 0x1202,
		CL_COMMAND_COPY_BUFFER_RECT  = 0x1203,
		CL_COMMAND_USER              = 0x1204;

	/** cl_buffer_create_type. */
	public static final int
		CL_BUFFER_CREATE_TYPE_REGION = 0x1220;

	private CL11() {}

	// --- [ clCreateSubBuffer ] ---

	/** JNI method for {@link #clCreateSubBuffer} */
	public static native long nclCreateSubBuffer(long buffer, long flags, int buffer_create_type, long buffer_create_info, long errcode_ret, long __functionAddress);

	/**
	 * Creates a new buffer object (referred to as a sub-buffer object) from an existing buffer object.
	 * <p/>
	 * <strong>NOTE</strong>: Concurrent reading from, writing to and copying between both a buffer object and its sub-buffer object(s) is undefined.
	 * Concurrent reading from, writing to and copying between overlapping sub-buffer objects created with the same buffer object is undefined. Only reading
	 * from both a buffer object and its sub-buffer objects or reading from multiple overlapping sub-buffer objects is defined.
	 *
	 * @param buffer             a valid buffer object and cannot be a sub-buffer object
	 * @param flags              a bit-field that is used to specify allocation and usage information about the sub-buffer memory object being created.
	 *                           <p/>
	 *                           If the {@link CL10#CL_MEM_READ_WRITE}, {@link CL10#CL_MEM_READ_ONLY} or {@link CL10#CL_MEM_WRITE_ONLY} values are not specified in flags, they are
	 *                           inherited from the corresponding memory access qualifers associated with buffer. The {@link CL10#CL_MEM_USE_HOST_PTR}, {@link CL10#CL_MEM_ALLOC_HOST_PTR}
	 *                           and {@link CL10#CL_MEM_COPY_HOST_PTR} values cannot be specified in flags but are inherited from the corresponding memory access qualifiers
	 *                           associated with buffer. If {@link CL10#CL_MEM_COPY_HOST_PTR} is specified in the memory access qualifier values associated with buffer it does not
	 *                           imply any additional copies when the sub-buffer is created from buffer. If the {@link CL12#CL_MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY}
	 *                           or {@link CL12#CL_MEM_HOST_NO_ACCESS} values are not specified in flags, they are inherited from the corresponding memory access qualifiers
	 *                           associated with buffer.
	 * @param buffer_create_type the type of buffer object to be created. Must be:<p/>{@link #CL_BUFFER_CREATE_TYPE_REGION}
	 * @param buffer_create_info details about the buffer object to be created.
	 *                           <p/>
	 *                           When {@code buffer_create_type} is {@link #CL_BUFFER_CREATE_TYPE_REGION}, then {@code buffer_create_info} is a pointer to a {@link cl_buffer_region}
	 *                           structure. {@code (origin, size)} defines the offset and size in bytes in buffer.
	 * @param errcode_ret        will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return {@link CL10#CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object or is a sub-buffer object.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code buffer} was created with {@link CL10#CL_MEM_WRITE_ONLY} and {@code flags} specifies {@link CL10#CL_MEM_READ_WRITE}
	 *         or {@link CL10#CL_MEM_READ_ONLY}, or if {@code buffer} was created with {@link CL10#CL_MEM_READ_ONLY} and {@code flags} specifies
	 *         {@link CL10#CL_MEM_READ_WRITE} or {@link CL10#CL_MEM_WRITE_ONLY}, or if {@code flags} specifies {@link CL10#CL_MEM_USE_HOST_PTR} or
	 *         {@link CL10#CL_MEM_ALLOC_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code buffer} was created with {@link CL12#CL_MEM_HOST_WRITE_ONLY} and {@code flags} specify {@link CL12#CL_MEM_HOST_READ_ONLY},
	 *         or if {@code buffer} was created with {@link CL12#CL_MEM_HOST_READ_ONLY} and {@code flags} specify {@link CL12#CL_MEM_HOST_WRITE_ONLY}, or if
	 *         {@code buffer} was created with {@link CL12#CL_MEM_HOST_NO_ACCESS} and {@code flags} specify {@link CL12#CL_MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_WRITE_ONLY}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if value specified in {@code buffer_create_type} is not valid.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if value(s) specified in {@code buffer_create_info} (for a given {@code buffer_create_type}) is not valid or if
	 *         {@code buffer_create_info} is {@code NULL}.</li>
	 *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE} if {@code size} is 0.</li>
	 *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for sub-buffer object.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLMem clCreateSubBuffer(CLMem buffer, long flags, int buffer_create_type, ByteBuffer buffer_create_info, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(buffer).clCreateSubBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLMem.create(nclCreateSubBuffer(buffer.getPointer(), flags, buffer_create_type, memAddress(buffer_create_info), memAddressSafe(errcode_ret), __functionAddress), buffer);
	}

	/** Alternative version of: {@link #clCreateSubBuffer} */
	public static CLMem clCreateSubBuffer(CLMem buffer, long flags, int buffer_create_type, ByteBuffer buffer_create_info, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(buffer).clCreateSubBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateSubBuffer(buffer.getPointer(), flags, buffer_create_type, memAddress(buffer_create_info), memAddressSafe(errcode_ret), __functionAddress), buffer);
	}

	// --- [ clSetMemObjectDestructorCallback ] ---

	/** JNI method for {@link #clSetMemObjectDestructorCallback} */
	public static native int nclSetMemObjectDestructorCallback(long memobj, long pfn_notify, long user_data, long __functionAddress);

	/**
	 * Registers a user callback function with a memory object. Each call to {@code clSetMemObjectDestructorCallback} registers the specified user callback
	 * function on a callback stack associated with {@code memobj}. The registered user callback functions are called in the reverse order in which they were
	 * registered. The user callback functions are called and then the memory object's resources are freed and the memory object is deleted. This provides a
	 * mechanism for the application (and libraries) using {@code memobj} to be notified when the memory referenced by {@code host_ptr}, specified when the
	 * memory object is created and used as the storage bits for the memory object, can be reused or freed.
	 *
	 * @param memobj     a valid memory object
	 * @param pfn_notify the callback function that can be registered by the application. This callback function may be called asynchronously by the OpenCL implementation.
	 *                   It is the application's responsibility to ensure that the callback function is thread-safe.
	 * @param user_data  will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
	 *
	 * @return {@link CL10#CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT} if {@code memobj} is not a valid memory object.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code pfn_notify} is NULL.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clSetMemObjectDestructorCallback(CLMem memobj, long pfn_notify, long user_data) {
		long __functionAddress = getInstance(memobj).clSetMemObjectDestructorCallback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclSetMemObjectDestructorCallback(memobj.getPointer(), pfn_notify, user_data, __functionAddress);
	}

	/** Alternative version of: {@link #clSetMemObjectDestructorCallback} */
	public static int clSetMemObjectDestructorCallback(CLMem memobj, CLMemObjectDestructorCallback pfn_notify) {
		long __functionAddress = getInstance(memobj).clSetMemObjectDestructorCallback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long user_data = memGlobalRefNew(pfn_notify); // this global reference is deleted in native code (after invoke)
		int __result = nclSetMemObjectDestructorCallback(memobj.getPointer(), CLMemObjectDestructorCallback.CALLBACK, user_data, __functionAddress);
		if ( __result != CL10.CL_SUCCESS ) memGlobalRefDelete(user_data);
		return __result;
	}

	// --- [ clEnqueueReadBufferRect ] ---

	/** JNI method for {@link #clEnqueueReadBufferRect} */
	public static native int nclEnqueueReadBufferRect(long command_queue, long buffer, int blocking_read, long buffer_offset, long host_offset, long region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to read a 2D or 3D rectangular region from a buffer object to host memory.
	 * <p/>
	 * Calling {@code clEnqueueReadBufferRect} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr} and
	 * {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified when the buffer
	 * object being read is created with {@link CL10#CL_MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:
	 * <ul>
	 * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
	 * read command begins execution.</li>
	 * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
	 * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
	 * </ul>
	 *
	 * @param command_queue           the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
	 * @param buffer                  a valid buffer object
	 * @param blocking_read           indicates if the read operation is <em>blocking</em> or <em>nonblocking</em>.
	 *                                <p/>
	 *                                If {@code blocking_read} is {@link CL10#CL_TRUE} i.e. the read command is blocking, {@code clEnqueueReadBufferRect} does not return until the buffer data has
	 *                                been read and copied into memory pointed to by {@code ptr}.
	 *                                <p/>
	 *                                If {@code blocking_read} is {@link CL10#CL_FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBufferRect} queues a non-blocking read command and
	 *                                returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
	 *                                returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
	 *                                the buffer that {@code ptr} points to can be used by the application.
	 * @param buffer_offset           the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
	 *                                should be 0. The offset in bytes is computed as <code>buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]</code>.
	 * @param host_offset             the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
	 *                                should be 0. The offset in bytes is computed as <code>host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]</code>.
	 * @param region                  the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
	 *                                given by {@code region[2]} should be 1. The values in region cannot be 0.
	 * @param buffer_row_pitch        the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
	 *                                {@code buffer_row_pitch} is computed as {@code region[0]}.
	 * @param buffer_slice_pitch      the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
	 *                                {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
	 * @param host_row_pitch          the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
	 *                                is computed as {@code region[0]}.
	 * @param host_slice_pitch        the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
	 *                                {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
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
	 * @return {@link CL10#CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
	 *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if the region being read specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if any {@code region} array element is 0.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
	 *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
	 *         <li>{@link CL10#CL_INVALID_OPERATION} if {@code clEnqueueReadBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS}.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueReadBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_read, ByteBuffer buffer_offset, ByteBuffer host_offset, ByteBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3 << POINTER_SHIFT);
			checkBuffer(host_offset, 3 << POINTER_SHIFT);
			checkBuffer(region, 3 << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueReadBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_read, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueReadBufferRect} */
	public static int clEnqueueReadBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_read, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_read, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** ShortBuffer version of: {@link #clEnqueueReadBufferRect} */
	public static int clEnqueueReadBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_read, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, ShortBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_read, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** IntBuffer version of: {@link #clEnqueueReadBufferRect} */
	public static int clEnqueueReadBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_read, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, IntBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_read, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** FloatBuffer version of: {@link #clEnqueueReadBufferRect} */
	public static int clEnqueueReadBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_read, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, FloatBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_read, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #clEnqueueReadBufferRect} */
	public static int clEnqueueReadBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_read, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, DoubleBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_read, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueWriteBufferRect ] ---

	/** JNI method for {@link #clEnqueueWriteBufferRect} */
	public static native int nclEnqueueWriteBufferRect(long command_queue, long buffer, int blocking_write, long buffer_offset, long host_offset, long region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to write a 2D or 3D rectangular region to a buffer object from host memory.
	 * <p/>
	 * Calling {@code clEnqueueWriteBufferRect} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
	 * {@code host_ptr} and {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified
	 * when the buffer object being written is created with {@link CL10#CL_MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined
	 * behavior:
	 * <ul>
	 * <li>The host memory region given by {@code (buffer_origin region)} contains the latest bits when the enqueued write command begins execution.</li>
	 * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
	 * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
	 * </ul>
	 *
	 * @param command_queue           the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
	 * @param buffer                  a valid buffer object
	 * @param blocking_write          indicates if the write operation is <em>blocking</em> or <em>nonblocking</em>.
	 *                                <p/>
	 *                                If {@code blocking_write} is {@link CL10#CL_TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
	 *                                command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBufferRect} call returns.
	 *                                <p/>
	 *                                If {@code blocking_write} is {@link CL10#CL_FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
	 *                                the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
	 *                                {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
	 *                                completed, the memory pointed to by {@code ptr} can then be reused by the application.
	 * @param buffer_offset           the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
	 *                                should be 0. The offset in bytes is computed as <code>buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]</code>.
	 * @param host_offset             the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
	 *                                should be 0. The offset in bytes is computed as <code>host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]</code>.
	 * @param region                  the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
	 *                                given by {@code region[2]} should be 1. The values in region cannot be 0.
	 * @param buffer_row_pitch        the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
	 *                                {@code buffer_row_pitch} is computed as {@code region[0]}.
	 * @param buffer_slice_pitch      the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
	 *                                {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
	 * @param host_row_pitch          the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
	 *                                is computed as {@code region[0]}.
	 * @param host_slice_pitch        the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
	 *                                {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
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
	 * @return {@link CL10#CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
	 *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if the region being written specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if any {@code region} array element is 0.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
	 *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
	 *         <li>{@link CL10#CL_INVALID_OPERATION} if {@code clEnqueueWriteBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS}.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueWriteBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_write, ByteBuffer buffer_offset, ByteBuffer host_offset, ByteBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3 << POINTER_SHIFT);
			checkBuffer(host_offset, 3 << POINTER_SHIFT);
			checkBuffer(region, 3 << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueWriteBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_write, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueWriteBufferRect} */
	public static int clEnqueueWriteBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_write, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_write, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** ShortBuffer version of: {@link #clEnqueueWriteBufferRect} */
	public static int clEnqueueWriteBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_write, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, ShortBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_write, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** IntBuffer version of: {@link #clEnqueueWriteBufferRect} */
	public static int clEnqueueWriteBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_write, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, IntBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_write, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** FloatBuffer version of: {@link #clEnqueueWriteBufferRect} */
	public static int clEnqueueWriteBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_write, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, FloatBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_write, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #clEnqueueWriteBufferRect} */
	public static int clEnqueueWriteBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_write, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, DoubleBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_write, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueCopyBufferRect ] ---

	/** JNI method for {@link #clEnqueueCopyBufferRect} */
	public static native int nclEnqueueCopyBufferRect(long command_queue, long src_buffer, long dst_buffer, long src_origin, long dst_origin, long region, long src_row_pitch, long src_slice_pitch, long dst_row_pitch, long dst_slice_pitch, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to copy a 2D or 3D rectangular region from the buffer object identified by {@code src_buffer} to a 2D or 3D region in the buffer
	 * object identified by {@code dst_buffer}. Copying begins at the source offset and destination offset which are computed as described below in the
	 * description for {@code src_origin} and {@code dst_origin}. Each byte of the region's width is copied from the source offset to the destination offset.
	 * After copying each width, the source and destination offsets are incremented by their respective source and destination row pitches. After copying each
	 * 2D rectangle, the source and destination offsets are incremented by their respective source and destination slice pitches.
	 * <p/>
	 * <strong>NOTE</strong>: If {@code src_buffer} and {@code dst_buffer} are the same buffer object, {@code src_row_pitch} must equal {@code dst_row_pitch}
	 * and {@code src_slice_pitch} must equal {@code dst_slice_pitch}.
	 *
	 * @param command_queue           the command-queue in which the copy command will be queued. The OpenCL context associated with {@code command_queue}, {@code src_buffer} and
	 *                                {@code dst_buffer} must be the same.
	 * @param src_buffer              the source buffer
	 * @param dst_buffer              the destination buffer
	 * @param src_origin              the {@code (x, y, z)} offset in the memory region associated with {@code src_buffer}. For a 2D rectangle region, the z value given by {@code src_origin[2]}
	 *                                should be 0. The offset in bytes is computed as <code>src_origin[2] * src_slice_pitch + src_origin[1] * src_row_pitch + src_origin[0]</code>.
	 * @param dst_origin              the {@code (x, y, z)} offset in the memory region associated with {@code dst_buffer}. For a 2D rectangle region, the z value given by {@code dst_origin[2]}
	 *                                should be 0. The offset in bytes is computed as <code>dst_origin[2] * dst_slice_pitch + dst_origin[1] * dst_row_pitch + dst_origin[0]</code>.
	 * @param region                  the ({@code width} in bytes, {@code height} in rows, {@code depth} in slices) of the 2D or 3D rectangle being copied. For a 2D rectangle, the depth
	 *                                value given by {@code region[2]} should be 1. The values in {@code region} cannot be 0.
	 * @param src_row_pitch           the length of each row in bytes to be used for the memory region associated with {@code src_buffer}. If {@code src_row_pitch} is 0, {@code src_row_pitch}
	 *                                is computed as {@code region[0]}.
	 * @param src_slice_pitch         the length of each 2D slice in bytes to be used for the memory region associated with {@code src_buffer}. If {@code src_slice_pitch} is 0,
	 *                                {@code src_slice_pitch} is computed as {@code region[1] * src_row_pitch}.
	 * @param dst_row_pitch           the length of each row in bytes to be used for the memory region associated with {@code dst_buffer}. If {@code dst_row_pitch} is 0, {@code dst_row_pitch}
	 *                                is computed as {@code region[0]}.
	 * @param dst_slice_pitch         the length of each 2D slice in bytes to be used for the memory region associated with {@code dst_buffer}. If {@code dst_slice_pitch} is 0,
	 *                                {@code dst_slice_pitch} is computed as {@code region[1] * dst_row_pitch}.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link CL10#CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_buffer} and {@code dst_buffer} are not the same or
	 *         if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT} if {@code src_buffer} and {@code dst_buffer} are not valid buffer objects.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code (src_origin, region, src_row_pitch, src_slice_pitch)} or {@code (dst_origin, region, dst_row_pitch, dst_slice_pitch)}
	 *         require accessing elements outside the {@code src_buffer} and {@code dst_buffer} buffer objects respectively.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if any {@code region} array element is 0.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code src_row_pitch} is not 0 and is less than {@code region[0]}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code dst_row_pitch} is not 0 and is less than {@code region[0]}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code src_slice_pitch} is not 0 and is less than {@code region[1] * src_row_pitch} or if {@code src_slice_pitch}
	 *         is not 0 and is not a multiple of {@code src_row_pitch}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code dst_slice_pitch} is not 0 and is less than {@code region[1] * dst_row_pitch} or if {@code dst_slice_pitch}
	 *         is not 0 and is not a multiple of {@code dst_row_pitch}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code src_buffer} and {@code dst_buffer} are the same buffer object and {@code src_slice_pitch} is not equal to
	 *         {@code dst_slice_pitch} and {@code src_row_pitch} is not equal to {@code dst_row_pitch}.</li>
	 *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL10#CL_MEM_COPY_OVERLAP} if {@code src_buffer} and {@code dst_buffer} are the same buffer or subbuffer object and the source and destination
	 *         regions overlap or if {@code src_buffer} and {@code dst_buffer} are different sub-buffers of the same associated buffer object and they overlap.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET} if {@code src_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET} if {@code dst_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_buffer} or {@code dst_buffer}.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueCopyBufferRect(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_buffer, ByteBuffer src_origin, ByteBuffer dst_origin, ByteBuffer region, long src_row_pitch, long src_slice_pitch, long dst_row_pitch, long dst_slice_pitch, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3 << POINTER_SHIFT);
			checkBuffer(dst_origin, 3 << POINTER_SHIFT);
			checkBuffer(region, 3 << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueCopyBufferRect(command_queue.getPointer(), src_buffer.getPointer(), dst_buffer.getPointer(), memAddress(src_origin), memAddress(dst_origin), memAddress(region), src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueCopyBufferRect} */
	public static int clEnqueueCopyBufferRect(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_buffer, PointerBuffer src_origin, PointerBuffer dst_origin, PointerBuffer region, long src_row_pitch, long src_slice_pitch, long dst_row_pitch, long dst_slice_pitch, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3);
			checkBuffer(dst_origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyBufferRect(command_queue.getPointer(), src_buffer.getPointer(), dst_buffer.getPointer(), memAddress(src_origin), memAddress(dst_origin), memAddress(region), src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clCreateUserEvent ] ---

	/** JNI method for {@link #clCreateUserEvent} */
	public static native long nclCreateUserEvent(long context, long errcode_ret, long __functionAddress);

	/**
	 * Creates a user event object. User events allow applications to enqueue commands that wait on a user event to finish before the command is executed by
	 * the device.
	 * <p/>
	 * The execution status of the user event object created is set to {@link CL10#CL_SUBMITTED}.
	 *
	 * @param context     a valid OpenCL context
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero event object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS} if the user event object is created successfully. Otherwise, it returns a {@code NULL}
	 *         value with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLEvent clCreateUserEvent(CLContext context, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateUserEvent;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLEvent.create(nclCreateUserEvent(context.getPointer(), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateUserEvent} */
	public static CLEvent clCreateUserEvent(CLContext context, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateUserEvent;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLEvent.create(nclCreateUserEvent(context.getPointer(), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clSetUserEventStatus ] ---

	/** JNI method for {@link #clSetUserEventStatus} */
	public static native int nclSetUserEventStatus(long event, int execution_status, long __functionAddress);

	/**
	 * Sets the execution status of a user event object.
	 * <p/>
	 * <strong>NOTE</strong>: Enqueued commands that specify user events in the {@code event_wait_list} argument of {@code clEnqueue***} commands must ensure
	 * that the status of these user events being waited on are set using {@code clSetUserEventStatus} before any OpenCL APIs that release OpenCL objects
	 * except for event objects are called; otherwise the behavior is undefined.
	 * <p/>
	 * For example, the following code sequence will result in undefined behavior of {@link CL10#clReleaseMemObject}.
	 * <pre>{@code
	 * ev1 = clCreateUserEvent(ctx, NULL);
	 * clEnqueueWriteBuffer(cq, buf1, CL_FALSE, ..., 1, &ev1, NULL);
	 * clEnqueueWriteBuffer(cq, buf2, CL_FALSE, ...);
	 * clReleaseMemObject(buf2);
	 * clSetUserEventStatus(ev1, CL_COMPLETE);}</pre>
	 * The following code sequence, however, works correctly.
	 * <pre>{@code
	 * ev1 = clCreateUserEvent(ctx, NULL);
	 * clEnqueueWriteBuffer(cq, buf1, CL_FALSE, ..., 1, &ev1, NULL);
	 * clEnqueueWriteBuffer(cq, buf2, CL_FALSE, ...);
	 * clSetUserEventStatus(ev1, CL_COMPLETE);
	 * clReleaseMemObject(buf2);}</pre>
	 *
	 * @param event            a user event object created using {@link #clCreateUserEvent}
	 * @param execution_status the new execution status to be set and can be {@link CL10#CL_COMPLETE} or a negative integer value to indicate an error. A negative integer value
	 *                         causes all enqueued commands that wait on this user event to be terminated. {@code clSetUserEventStatus} can only be called once to change the
	 *                         execution status of event.
	 *
	 * @return {@link CL10#CL_SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_EVENT} if {@code event} is not a valid user event object.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if the {@code execution_status} is not {@link CL10#CL_COMPLETE} or a negative integer value.</li>
	 *         <li>{@link CL10#CL_INVALID_OPERATION} if the {@code execution_status} for event has already been changed by a previous call to {@code clSetUserEventStatus}.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clSetUserEventStatus(CLEvent event, int execution_status) {
		long __functionAddress = getInstance(event).clSetUserEventStatus;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclSetUserEventStatus(event.getPointer(), execution_status, __functionAddress);
	}

	// --- [ clSetEventCallback ] ---

	/** JNI method for {@link #clSetEventCallback} */
	public static native int nclSetEventCallback(long event, int command_exec_callback_type, long pfn_notify, long user_data, long __functionAddress);

	/**
	 * Registers a user callback function for a specific command execution status. The registered callback function will be called when the execution status of
	 * command associated with event changes to an execution status equal to or past the status specified by {@code command_exec_status}.
	 * <p/>
	 * Each call to {@code clSetEventCallback} registers the specified user callback function on a callback stack associated with event. The order in which the
	 * registered user callback functions are called is undefined.
	 * <p/>
	 * All callbacks registered for an event object must be called. All enqueued callbacks shall be called before the event object is destroyed. Callbacks must
	 * return promptly. The behavior of calling expensive system routines, OpenCL API calls to create contexts or command-queues, or blocking OpenCL operations
	 * from the following list below, in a callback is undefined.
	 * <ul>
	 * <li>{@link CL10#clFinish},</li>
	 * <li>{@link CL10#clWaitForEvents},</li>
	 * <li>blocking calls to {@link CL10#clEnqueueReadBuffer}, {@link #clEnqueueReadBufferRect}, {@link CL10#clEnqueueWriteBuffer}, {@link #clEnqueueWriteBufferRect},</li>
	 * <li>blocking calls to {@link CL10#clEnqueueReadImage} and {@link CL10#clEnqueueWriteImage},</li>
	 * <li>blocking calls to {@link CL10#clEnqueueMapBuffer} and {@link CL10#clEnqueueMapImage},</li>
	 * <li>blocking calls to {@link CL10#clBuildProgram}, {@link CL12#clCompileProgram} or {@link CL12#clLinkProgram}</li>
	 * </ul>
	 * If an application needs to wait for completion of a routine from the above list in a callback, please use the non-blocking form of the function, and
	 * assign a completion callback to it to do the remainder of your work. Note that when a callback (or other code) enqueues commands to a command-queue, the
	 * commands are not required to begin execution until the queue is flushed. In standard usage, blocking enqueue calls serve this role by implicitly
	 * flushing the queue. Since blocking calls are not permitted in callbacks, those callbacks that enqueue commands on a command queue should either call
	 * {@link CL10#clFlush} on the queue before returning or arrange for {@link CL10#clFlush} to be called later on another thread.
	 *
	 * @param event                      a valid event object
	 * @param command_exec_callback_type the command execution status for which the callback is registered. There is no guarantee that the callback functions registered for various
	 *                                   execution status values for an event will be called in the exact order that the execution status of a command changes. Furthermore, it should be
	 *                                   noted that receiving a call back for an event with a status other than {@link CL10#CL_COMPLETE}, in no way implies that the memory model or
	 *                                   execution model as defined by the OpenCL specification has changed. For example, it is not valid to assume that a corresponding memory transfer has
	 *                                   completed unless the event is in a state {@link CL10#CL_COMPLETE}. One of:<p/>{@link CL10#CL_SUBMITTED}, {@link CL10#CL_RUNNING}, {@link CL10#CL_COMPLETE}
	 * @param pfn_notify                 the event callback function that can be registered by the application. This callback function may be called asynchronously by the OpenCL
	 *                                   implementation. It is the application's responsibility to ensure that the callback function is thread-safe.
	 * @param user_data                  will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
	 *
	 * @return {@link CL10#CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_EVENT} if {@code event} is not a valid event object.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code pfn_event_notify} is {@code NULL} or if {@code command_exec_callback_type} is not {@link CL10#CL_SUBMITTED},
	 *         {@link CL10#CL_RUNNING} or {@link CL10#CL_COMPLETE}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if {@code event} is a user event object and {@code command_exec_callback_type} is not {@link CL10#CL_COMPLETE}.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clSetEventCallback(CLEvent event, int command_exec_callback_type, long pfn_notify, long user_data) {
		long __functionAddress = getInstance(event).clSetEventCallback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclSetEventCallback(event.getPointer(), command_exec_callback_type, pfn_notify, user_data, __functionAddress);
	}

	/** Alternative version of: {@link #clSetEventCallback} */
	public static int clSetEventCallback(CLEvent event, int command_exec_callback_type, CLEventCallback pfn_notify) {
		long __functionAddress = getInstance(event).clSetEventCallback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long user_data = memGlobalRefNew(pfn_notify); // this global reference is deleted in native code (after invoke)
		int __result = nclSetEventCallback(event.getPointer(), command_exec_callback_type, CLEventCallback.CALLBACK, user_data, __functionAddress);
		if ( __result != CL10.CL_SUCCESS ) memGlobalRefDelete(user_data);
		return __result;
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance(CLObject object) {
		return object.getCapabilities().__CL11;
	}

	static Functions create(java.util.Set<String> ext, FunctionProviderLocal provider) {
		if ( !ext.contains("opencl11") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			funcs.clCreateSubBuffer != 0L &&
			funcs.clSetMemObjectDestructorCallback != 0L &&
			funcs.clEnqueueReadBufferRect != 0L &&
			funcs.clEnqueueWriteBufferRect != 0L &&
			funcs.clEnqueueCopyBufferRect != 0L &&
			funcs.clCreateUserEvent != 0L &&
			funcs.clSetUserEventStatus != 0L &&
			funcs.clSetEventCallback != 0L;

		return CL.checkExtension("opencl11", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code CL11}. */
	public static final class Functions implements FunctionMap {

		public final long
			clCreateSubBuffer,
			clSetMemObjectDestructorCallback,
			clEnqueueReadBufferRect,
			clEnqueueWriteBufferRect,
			clEnqueueCopyBufferRect,
			clCreateUserEvent,
			clSetUserEventStatus,
			clSetEventCallback;

		public Functions(FunctionProviderLocal provider) {
			clCreateSubBuffer = provider.getFunctionAddress("clCreateSubBuffer");
			clSetMemObjectDestructorCallback = provider.getFunctionAddress("clSetMemObjectDestructorCallback");
			clEnqueueReadBufferRect = provider.getFunctionAddress("clEnqueueReadBufferRect");
			clEnqueueWriteBufferRect = provider.getFunctionAddress("clEnqueueWriteBufferRect");
			clEnqueueCopyBufferRect = provider.getFunctionAddress("clEnqueueCopyBufferRect");
			clCreateUserEvent = provider.getFunctionAddress("clCreateUserEvent");
			clSetUserEventStatus = provider.getFunctionAddress("clSetUserEventStatus");
			clSetEventCallback = provider.getFunctionAddress("clSetEventCallback");
		}

	}

}