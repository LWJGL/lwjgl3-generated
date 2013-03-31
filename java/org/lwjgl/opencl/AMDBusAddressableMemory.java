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
 * Native bindings to the <strong>amd_bus_addressable_memory</strong> extension.
 * <p/>
 * This extension defines an API for peer-to-peer transfers between AMD GPUs and other PCIe device, such as third-party SDI I/O devices. Peer-to-peer
 * transfers have extremely low latencies by not having to use the host's main memory or the CPU. This extension allows sharing a memory allocated by the
 * graphics driver to be used by other devices on the PCIe bus (peer-to-peer transfers) by exposing a write-only bus address. It also allows memory
 * allocated on other PCIe devices (non-AMD GPU) to be directly accessed by AMD GPUs. One possible use of this is for a video capture device to directly
 * write into the GPU memory using its DMA. This extension is supported only on AMD FirePro™ professional graphics cards.
 */
public final class AMDBusAddressableMemory {

	/** cl_mem flag - bitfield */
	public static final int
		CL_MEM_BUS_ADDRESSABLE_AMD   = 1 << 30,
		CL_MEM_EXTERNAL_PHYSICAL_AMD = 1 << 31;

	/** Commands */
	public static final int
		CL_COMMAND_WAIT_SIGNAL_AMD           = 0x4080,
		CL_COMMAND_WRITE_SIGNAL_AMD          = 0x4081,
		CL_COMMAND_MAKE_BUFFERS_RESIDENT_AMD = 0x4082;

	private AMDBusAddressableMemory() {}

	// --- [ clEnqueueWaitSignalAMD ] ---

	/** JNI method for {@link #clEnqueueWaitSignalAMD} */
	public static native int nclEnqueueWaitSignalAMD(long command_queue, long mem_object, int value, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a wait signal.
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
	 */
	public static int clEnqueueWaitSignalAMD(CLCommandQueue command_queue, CLMem mem_object, int value, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWaitSignalAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueWaitSignalAMD(command_queue.getPointer(), mem_object.getPointer(), value, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueWaitSignalAMD} */
	public static int clEnqueueWaitSignalAMD(CLCommandQueue command_queue, CLMem mem_object, int value, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWaitSignalAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWaitSignalAMD(command_queue.getPointer(), mem_object.getPointer(), value, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueWriteSignalAMD ] ---

	/** JNI method for {@link #clEnqueueWriteSignalAMD} */
	public static native int nclEnqueueWriteSignalAMD(long command_queue, long mem_object, int value, long offset, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a write signal.
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
	 */
	public static int clEnqueueWriteSignalAMD(CLCommandQueue command_queue, CLMem mem_object, int value, long offset, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteSignalAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueWriteSignalAMD(command_queue.getPointer(), mem_object.getPointer(), value, offset, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueWriteSignalAMD} */
	public static int clEnqueueWriteSignalAMD(CLCommandQueue command_queue, CLMem mem_object, int value, long offset, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteSignalAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteSignalAMD(command_queue.getPointer(), mem_object.getPointer(), value, offset, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueMakeBuffersResidentAMD ] ---

	/** JNI method for {@link #clEnqueueMakeBuffersResidentAMD} */
	public static native int nclEnqueueMakeBuffersResidentAMD(long command_queue, int num_mem_objs, long mem_objects, int blocking_make_resident, long bus_addresses, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to make buffers resident.
	 *
	 * @param command_queue           a command-queue
	 * @param num_mem_objs            the number of memory objects in {@code mem_objects}
	 * @param mem_objects             a pointer to a list of memory objects
	 * @param blocking_make_resident  indicates if read operation is <em>blocking</em> or <em>non-blocking</em>
	 * @param bus_addresses           a {@link cl_bus_address_amd} structure
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 */
	public static int clEnqueueMakeBuffersResidentAMD(CLCommandQueue command_queue, int num_mem_objs, ByteBuffer mem_objects, int blocking_make_resident, ByteBuffer bus_addresses, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueMakeBuffersResidentAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(mem_objects, num_mem_objs << POINTER_SHIFT);
			checkBuffer(bus_addresses, cl_bus_address_amd.SIZEOF);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueMakeBuffersResidentAMD(command_queue.getPointer(), num_mem_objs, memAddress(mem_objects), blocking_make_resident, memAddress(bus_addresses), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueMakeBuffersResidentAMD} */
	public static int clEnqueueMakeBuffersResidentAMD(CLCommandQueue command_queue, PointerBuffer mem_objects, int blocking_make_resident, ByteBuffer bus_addresses, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueMakeBuffersResidentAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(bus_addresses, cl_bus_address_amd.SIZEOF);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueMakeBuffersResidentAMD(command_queue.getPointer(), mem_objects.remaining(), memAddress(mem_objects), blocking_make_resident, memAddress(bus_addresses), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance(CLObject object) {
		return object.getCapabilities().__AMDBusAddressableMemory;
	}

	static Functions create(java.util.Set<String> ext, FunctionProviderLocal provider, long platform) {
		if ( !ext.contains("cl_amd_bus_addressable_memory") ) return null;

		Functions funcs = new Functions(provider, platform);

		boolean supported = 
			funcs.clEnqueueWaitSignalAMD != 0L &&
			funcs.clEnqueueWriteSignalAMD != 0L &&
			funcs.clEnqueueMakeBuffersResidentAMD != 0L;

		return CL.checkExtension("cl_amd_bus_addressable_memory", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code AMDBusAddressableMemory}. */
	public static final class Functions implements FunctionMap {

		public final long
			clEnqueueWaitSignalAMD,
			clEnqueueWriteSignalAMD,
			clEnqueueMakeBuffersResidentAMD;

		public Functions(FunctionProviderLocal provider, long platform) {
			clEnqueueWaitSignalAMD = provider.getFunctionAddress(platform, "clEnqueueWaitSignalAMD");
			clEnqueueWriteSignalAMD = provider.getFunctionAddress(platform, "clEnqueueWriteSignalAMD");
			clEnqueueMakeBuffersResidentAMD = provider.getFunctionAddress(platform, "clEnqueueMakeBuffersResidentAMD");
		}

	}

}