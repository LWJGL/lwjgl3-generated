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

/**
 * Native bindings to the <a href="http://www.khronos.org/registry/cl/extensions/amd/cl_amd_bus_addressable_memory.txt">amd_bus_addressable_memory</a> extension.
 * 
 * <p>This extension defines an API that allows improved control of the physical memory used by the graphics device.</p>
 * 
 * <p>It allows to share a memory allocated by the Graphics driver to be used by other device on the bus by exposing a write-only bus address. One example of
 * application would be a video capture device which would DMA into the GPU memory.</p>
 * 
 * <p>It also offers the reverse operation of specifying a buffer allocated on another device to be used for write access by the GPU.</p>
 */
public final class AMDBusAddressableMemory {

	/**
	 * Accepted by the {@code flags} parameter of {@link CL10#clCreateBuffer CreateBuffer}.
	 * 
	 * <p>This flag specifies that the application wants the OpenCL implementation to create a buffer that can be accessed by remote device DMA.</p>
	 * 
	 * <p>{@link #CL_MEM_BUS_ADDRESSABLE_AMD MEM_BUS_ADDRESSABLE_AMD}, {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are mutually exclusive.</p>
	 */
	public static final int CL_MEM_BUS_ADDRESSABLE_AMD = 1<<30;

	/**
	 * Accepted by the {@code flags} parameter of {@link CL10#clCreateBuffer CreateBuffer}.
	 * 
	 * <p>This flag specifies that the application wants the OpenCL implementation to create a buffer from an already allocated memory on remote device.</p>
	 * 
	 * <p>{@link #CL_MEM_EXTERNAL_PHYSICAL_AMD MEM_EXTERNAL_PHYSICAL_AMD}, {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}, {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are mutually exclusive.</p>
	 * 
	 * <p>{@link #CL_MEM_EXTERNAL_PHYSICAL_AMD MEM_EXTERNAL_PHYSICAL_AMD}, {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE} and {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} are mutually exclusive.</p>
	 */
	public static final int CL_MEM_EXTERNAL_PHYSICAL_AMD = 1<<31;

	/** New command types for the events returned by the <strong>amd_bus_addressable_memory</strong> functions. */
	public static final int
		CL_COMMAND_WAIT_SIGNAL_AMD           = 0x4080,
		CL_COMMAND_WRITE_SIGNAL_AMD          = 0x4081,
		CL_COMMAND_MAKE_BUFFERS_RESIDENT_AMD = 0x4082;

	/** Function address. */
	@JavadocExclude
	public final long
		EnqueueWaitSignalAMD,
		EnqueueWriteSignalAMD,
		EnqueueMakeBuffersResidentAMD;

	@JavadocExclude
	public AMDBusAddressableMemory(FunctionProvider provider) {
		EnqueueWaitSignalAMD = provider.getFunctionAddress("clEnqueueWaitSignalAMD");
		EnqueueWriteSignalAMD = provider.getFunctionAddress("clEnqueueWriteSignalAMD");
		EnqueueMakeBuffersResidentAMD = provider.getFunctionAddress("clEnqueueMakeBuffersResidentAMD");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link AMDBusAddressableMemory} instance for the currently loaded ICD. */
	public static AMDBusAddressableMemory getInstance() {
		return checkFunctionality(CL.getICD().__AMDBusAddressableMemory);
	}

	static AMDBusAddressableMemory create(FunctionProvider provider) {
		AMDBusAddressableMemory funcs = new AMDBusAddressableMemory(provider);

		boolean supported = checkFunctions(
			funcs.EnqueueWaitSignalAMD, funcs.EnqueueWriteSignalAMD, funcs.EnqueueMakeBuffersResidentAMD
		);

		return supported ? funcs : null;
	}

	// --- [ clEnqueueWaitSignalAMD ] ---

	/** JNI method for {@link #clEnqueueWaitSignalAMD EnqueueWaitSignalAMD} */
	@JavadocExclude
	public static native int nclEnqueueWaitSignalAMD(long command_queue, long mem_object, int value, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueWaitSignalAMD EnqueueWaitSignalAMD} */
	@JavadocExclude
	public static int nclEnqueueWaitSignalAMD(long command_queue, long mem_object, int value, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueWaitSignalAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(mem_object);
		}
		return nclEnqueueWaitSignalAMD(command_queue, mem_object, value, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Instructs the OpenCL to wait until {@code value} is written to {@code buffer} before issuing the next command.
	 *
	 * @param command_queue           a command-queue
	 * @param mem_object              a memory object
	 * @param value                   the signal value
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
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} is generated if the {@code buffer} parameter of clEnqueueWaitSignalAMD is not a valid buffer.</li>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} is generated if the {@code command_queue} parameter of clEnqueueWaitSignalAMD is not a valid command queue.</li>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} is generated if the {@code buffer} parameter of clEnqueueWaitSignalAMD does not represent a buffer allocated with
	 *         {@link #CL_MEM_BUS_ADDRESSABLE_AMD MEM_BUS_ADDRESSABLE_AMD}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} is generated if the signal address used by clEnqueueWaitSignalAMD of {@code bufffer} is invalid (for example 0).</li>
	 *         </ul>
	 */
	public static int clEnqueueWaitSignalAMD(long command_queue, long mem_object, int value, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueWaitSignalAMD(command_queue, mem_object, value, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueWaitSignalAMD EnqueueWaitSignalAMD} */
	public static int clEnqueueWaitSignalAMD(long command_queue, long mem_object, int value, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueWaitSignalAMD(command_queue, mem_object, value, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueWriteSignalAMD ] ---

	/** JNI method for {@link #clEnqueueWriteSignalAMD EnqueueWriteSignalAMD} */
	@JavadocExclude
	public static native int nclEnqueueWriteSignalAMD(long command_queue, long mem_object, int value, long offset, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueWriteSignalAMD EnqueueWriteSignalAMD} */
	@JavadocExclude
	public static int nclEnqueueWriteSignalAMD(long command_queue, long mem_object, int value, long offset, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueWriteSignalAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(command_queue);
			checkPointer(mem_object);
		}
		return nclEnqueueWriteSignalAMD(command_queue, mem_object, value, offset, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * This command instructs the OpenCL to write {@code value} to the signal address + {@code offset} of {@code buffer} (which must be a buffer created with
	 * {@link #CL_MEM_EXTERNAL_PHYSICAL_AMD MEM_EXTERNAL_PHYSICAL_AMD}). This should be done after a write operation by the device into that buffer is complete. Consecutive marker values must
	 * keep increasing.
	 *
	 * @param command_queue           a command-queue
	 * @param mem_object              a memory object
	 * @param value                   the signal value
	 * @param offset                  the write offset
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
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} is generated if the {@code buffer} parameter of clEnqueueWriteSignalAMD is not a valid buffer.</li>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} is generated if the {@code command_queue} parameter of clEnqueueWriteSignalAMD is not a valid command queue.</li>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} is generated if the {@code buffer} parameter of clEnqueueWriteSignalAMD does not represent a buffer defined as
	 *         {@link #CL_MEM_EXTERNAL_PHYSICAL_AMD MEM_EXTERNAL_PHYSICAL_AMD}.</li>
	 *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} is generated if the {@code offset} parameter of clEnqueueWriteSignalAMD would lead to a write beyond the size of
	 *         {@code buffer}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} is generated if the signal address used by clEnqueueWriteSignalAMD of {@code bufffer} is invalid (for example 0).</li>
	 *         </ul>
	 */
	public static int clEnqueueWriteSignalAMD(long command_queue, long mem_object, int value, long offset, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueWriteSignalAMD(command_queue, mem_object, value, offset, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueWriteSignalAMD EnqueueWriteSignalAMD} */
	public static int clEnqueueWriteSignalAMD(long command_queue, long mem_object, int value, long offset, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueWriteSignalAMD(command_queue, mem_object, value, offset, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueMakeBuffersResidentAMD ] ---

	/** JNI method for {@link #clEnqueueMakeBuffersResidentAMD EnqueueMakeBuffersResidentAMD} */
	@JavadocExclude
	public static native int nclEnqueueMakeBuffersResidentAMD(long command_queue, int num_mem_objs, long mem_objects, int blocking_make_resident, long bus_addresses, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueMakeBuffersResidentAMD EnqueueMakeBuffersResidentAMD} */
	@JavadocExclude
	public static int nclEnqueueMakeBuffersResidentAMD(long command_queue, int num_mem_objs, long mem_objects, int blocking_make_resident, long bus_addresses, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueMakeBuffersResidentAMD;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclEnqueueMakeBuffersResidentAMD(command_queue, num_mem_objs, mem_objects, blocking_make_resident, bus_addresses, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * The application requires the bus address in order to access the buffers from a remote device. As the OS may rearrange buffers to make space for other
	 * memory allocation, we must make the buffers resident before trying to access them on remote device.
	 * 
	 * <p>This function is used to make buffers resident.</p>
	 *
	 * @param command_queue           a command-queue
	 * @param num_mem_objs            the number of memory objects in {@code mem_objects}
	 * @param mem_objects             a pointer to a list of memory objects created with {@link #CL_MEM_BUS_ADDRESSABLE_AMD MEM_BUS_ADDRESSABLE_AMD} flag
	 * @param blocking_make_resident  indicates if read operation is <em>blocking</em> or <em>non-blocking</em>
	 * @param bus_addresses           a pointer to a list of {@link CLBusAddressAMD} structures
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
	 *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} is generated if any of the pointer parameters of clEnqueueMakeBuffersResidentAMD are {@code NULL} (and count is &gt; 0).</li>
	 *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} is generated if any of the mem_objects passed to clEnqueueMakeBuffersResidentAMD was not a valid cl_mem object created with
	 *         {@link #CL_MEM_BUS_ADDRESSABLE_AMD MEM_BUS_ADDRESSABLE_AMD} flag.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} is generated if any of the mem_objects passed to clEnqueueMakeBuffersResidentAMD could not be made resident so that the buffer
	 *         or signal bus addresses will be returned as 0.</li>
	 *         </ul>
	 */
	public static int clEnqueueMakeBuffersResidentAMD(long command_queue, int num_mem_objs, ByteBuffer mem_objects, int blocking_make_resident, ByteBuffer bus_addresses, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(mem_objects, num_mem_objs << POINTER_SHIFT);
			checkBuffer(bus_addresses, num_mem_objs * CLBusAddressAMD.SIZEOF);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueMakeBuffersResidentAMD(command_queue, num_mem_objs, memAddress(mem_objects), blocking_make_resident, memAddress(bus_addresses), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueMakeBuffersResidentAMD EnqueueMakeBuffersResidentAMD} */
	public static int clEnqueueMakeBuffersResidentAMD(long command_queue, PointerBuffer mem_objects, int blocking_make_resident, ByteBuffer bus_addresses, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(bus_addresses, mem_objects.remaining() * CLBusAddressAMD.SIZEOF);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueMakeBuffersResidentAMD(command_queue, mem_objects.remaining(), memAddress(mem_objects), blocking_make_resident, memAddress(bus_addresses), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

}