/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <a href="http://www.khronos.org/registry/cl/extensions/khr/cl_khr_egl_image.txt">khr_egl_image</a> extension.
 * 
 * <p>This extension provides a mechanism for creating derived resources, such as OpenCL image objects, from {@code EGLImages}.</p>
 */
public class KHREGLImage {

	/** Error Codes */
	public static final int
		CL_EGL_RESOURCE_NOT_ACQUIRED_KHR = -1092,
		CL_INVALID_EGL_OBJECT_KHR        = -1093;

	/** Command types. */
	public static final int
		CL_COMMAND_ACQUIRE_EGL_OBJECTS_KHR = 0x202D,
		CL_COMMAND_RELEASE_EGL_OBJECTS_KHR = 0x202E;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateFromEGLImageKHR,
		EnqueueAcquireEGLObjectsKHR,
		EnqueueReleaseEGLObjectsKHR;

	@JavadocExclude
	protected KHREGLImage() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public KHREGLImage(FunctionProvider provider) {
		CreateFromEGLImageKHR = provider.getFunctionAddress("clCreateFromEGLImageKHR");
		EnqueueAcquireEGLObjectsKHR = provider.getFunctionAddress("clEnqueueAcquireEGLObjectsKHR");
		EnqueueReleaseEGLObjectsKHR = provider.getFunctionAddress("clEnqueueReleaseEGLObjectsKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHREGLImage} instance of the currently loaded ICD. */
	public static KHREGLImage getInstance() {
		return getInstance(CL.getICD());
	}

	/** Returns the {@link KHREGLImage} instance of the specified {@link CLCapabilities}. */
	public static KHREGLImage getInstance(CLCapabilities caps) {
		return checkFunctionality(caps.__KHREGLImage);
	}

	static KHREGLImage create(FunctionProvider provider) {
		KHREGLImage funcs = new KHREGLImage(provider);

		boolean supported = checkFunctions(
			funcs.CreateFromEGLImageKHR, funcs.EnqueueAcquireEGLObjectsKHR, funcs.EnqueueReleaseEGLObjectsKHR
		);

		return supported ? funcs : null;
	}

	// --- [ clCreateFromEGLImageKHR ] ---

	/** Unsafe version of {@link #clCreateFromEGLImageKHR CreateFromEGLImageKHR} */
	@JavadocExclude
	public static long nclCreateFromEGLImageKHR(long context, long display, long image, long flags, long properties, long errcode_ret) {
		long __functionAddress = getInstance().CreateFromEGLImageKHR;
		if ( CHECKS ) {
			checkPointer(context);
			checkPointer(display);
			checkPointer(image);
		}
		return callPPPJPPP(__functionAddress, context, display, image, flags, properties, errcode_ret);
	}

	/**
	 * Creates an {@code EGLImage} target of type {@code cl_mem} from the {@code EGLImage} source provided as {@code image}.
	 *
	 * @param context     
	 * @param display     an {@code EGLDisplay}
	 * @param image       an {@code EGLImageKHR}
	 * @param flags       a bit-field that is used to specify usage information about the memory object being created
	 * @param properties  a list of property names and their corresponding values
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 */
	public static long clCreateFromEGLImageKHR(long context, long display, long image, long flags, ByteBuffer properties, ByteBuffer errcode_ret) {
		if ( CHECKS ) {
			if ( properties != null ) checkNTP(properties);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return nclCreateFromEGLImageKHR(context, display, image, flags, memAddressSafe(properties), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateFromEGLImageKHR CreateFromEGLImageKHR} */
	public static long clCreateFromEGLImageKHR(long context, long display, long image, long flags, PointerBuffer properties, IntBuffer errcode_ret) {
		if ( CHECKS ) {
			if ( properties != null ) checkNT(properties);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return nclCreateFromEGLImageKHR(context, display, image, flags, memAddressSafe(properties), memAddressSafe(errcode_ret));
	}

	// --- [ clEnqueueAcquireEGLObjectsKHR ] ---

	/** Unsafe version of {@link #clEnqueueAcquireEGLObjectsKHR EnqueueAcquireEGLObjectsKHR} */
	@JavadocExclude
	public static int nclEnqueueAcquireEGLObjectsKHR(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueAcquireEGLObjectsKHR;
		if ( CHECKS )
			checkPointer(command_queue);
		return callPIPIPPI(__functionAddress, command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event);
	}

	/**
	 * Acquires OpenCL memory objects that have been created from EGL resources. The EGL objects are acquired by the OpenCL context associated with
	 * {@code command_queue} and can therefore be used by all command-queues associated with the OpenCL context.
	 *
	 * @param command_queue           a valid command-queue
	 * @param num_objects             the number of memory objects to be acquired in {@code mem_objects}
	 * @param mem_objects             a pointer to a list of OpenCL memory objects that were created from EGL resources, within the context associated with {@code command_queue}
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 */
	public static int clEnqueueAcquireEGLObjectsKHR(long command_queue, int num_objects, ByteBuffer mem_objects, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( CHECKS ) {
			checkBuffer(mem_objects, num_objects << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueAcquireEGLObjectsKHR(command_queue, num_objects, memAddress(mem_objects), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueAcquireEGLObjectsKHR EnqueueAcquireEGLObjectsKHR} */
	public static int clEnqueueAcquireEGLObjectsKHR(long command_queue, PointerBuffer mem_objects, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueAcquireEGLObjectsKHR(command_queue, mem_objects.remaining(), memAddress(mem_objects), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueReleaseEGLObjectsKHR ] ---

	/** Unsafe version of {@link #clEnqueueReleaseEGLObjectsKHR EnqueueReleaseEGLObjectsKHR} */
	@JavadocExclude
	public static int nclEnqueueReleaseEGLObjectsKHR(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueReleaseEGLObjectsKHR;
		if ( CHECKS )
			checkPointer(command_queue);
		return callPIPIPPI(__functionAddress, command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event);
	}

	/**
	 * Releases OpenCL memory objects that have been created from EGL resources. The EGL objects are released by the OpenCL context associated with
	 * {@code command_queue}.
	 *
	 * @param command_queue           a valid command-queue
	 * @param num_objects             the number of memory objects to be released in {@code mem_objects}
	 * @param mem_objects             a pointer to a list of OpenCL memory objects that were created from EGL resources, within the context associated with {@code command_queue}
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 */
	public static int clEnqueueReleaseEGLObjectsKHR(long command_queue, int num_objects, ByteBuffer mem_objects, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( CHECKS ) {
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueReleaseEGLObjectsKHR(command_queue, num_objects, memAddress(mem_objects), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueReleaseEGLObjectsKHR EnqueueReleaseEGLObjectsKHR} */
	public static int clEnqueueReleaseEGLObjectsKHR(long command_queue, int num_objects, PointerBuffer mem_objects, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueReleaseEGLObjectsKHR(command_queue, num_objects, memAddress(mem_objects), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

}