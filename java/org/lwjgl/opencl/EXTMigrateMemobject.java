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
 * Native bindings to the <a href="http://www.khronos.org/registry/cl/extensions/ext/cl_ext_migrate_memobject.txt">ext_migrate_memobject</a> extension.
 * 
 * <p>This extension defines a mechanism for assigning which device an OpenCL memory object resides.</p>
 */
public final class EXTMigrateMemobject {

	/** This flag specifies that the specified set of memory objects are to be migrated to the host, regardless of the target command queue. */
	public static final int CL_MIGRATE_MEM_OBJECT_HOST_EXT = 0x1;

	/** Returned in the {@code param_value} parameter of the clGetEventInfo when {@code param_name} is {@link CL10#CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}. */
	public static final int CL_COMMAND_MIGRATE_MEM_OBJECT_EXT = 0x4040;

	/** Function address. */
	@JavadocExclude
	public final long EnqueueMigrateMemObjectEXT;

	@JavadocExclude
	public EXTMigrateMemobject(FunctionProvider provider) {
		EnqueueMigrateMemObjectEXT = provider.getFunctionAddress("clEnqueueMigrateMemObjectEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTMigrateMemobject} instance for the currently loaded ICD. */
	public static EXTMigrateMemobject getInstance() {
		return checkFunctionality(CL.getICD().__EXTMigrateMemobject);
	}

	static EXTMigrateMemobject create(FunctionProvider provider) {
		EXTMigrateMemobject funcs = new EXTMigrateMemobject(provider);

		boolean supported = checkFunctions(
			funcs.EnqueueMigrateMemObjectEXT
		);

		return supported ? funcs : null;
	}

	// --- [ clEnqueueMigrateMemObjectEXT ] ---

	/** JNI method for {@link #clEnqueueMigrateMemObjectEXT EnqueueMigrateMemObjectEXT} */
	@JavadocExclude
	public static native int nclEnqueueMigrateMemObjectEXT(long command_queue, int num_mem_objects, long mem_objects, long flags, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/** Unsafe version of {@link #clEnqueueMigrateMemObjectEXT EnqueueMigrateMemObjectEXT} */
	@JavadocExclude
	public static int nclEnqueueMigrateMemObjectEXT(long command_queue, int num_mem_objects, long mem_objects, long flags, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueMigrateMemObjectEXT;
		if ( LWJGLUtil.CHECKS )
			checkPointer(command_queue);
		return nclEnqueueMigrateMemObjectEXT(command_queue, num_mem_objects, mem_objects, flags, num_events_in_wait_list, event_wait_list, event, __functionAddress);
	}

	/**
	 * Provides the application with a way to indicate which device a set of memory objects should be associated. Typically, memory objects are implicitly
	 * migrated to a device for which enqueued commands, using the memory object, are targeted. clEnqueueMigrateMemObjectEXT allows this migration to be
	 * explicitly performed ahead of the dependent commands. This permits an application to overlap the placement of memory objects with other unrelated
	 * operations. Once the OpenCL event, returned from clEnqueueMigrateMemObject, has been marked {@link CL10#CL_COMPLETE COMPLETE} the memory objects specified in
	 * {@code mem_objects} have been successfully migrated to the device associated with {@code command_queue}. The migrated memory object shall remain
	 * resident on the device until another command is enqueued that either implicitly or explicitly migrates it away. As well, clEnqueueMigrateMemObjectEXT
	 * can be used to direct the initial placement of a memory object, after creation, possibly avoiding the initial overhead of instantiating the object on
	 * the first enqueued command to use it.
	 * 
	 * <p>The user is responsible for managing the event dependencies, associated with this command, in order to avoid overlapping access to memory objects.
	 * Improperly specified event dependencies passed to clEnqueueMigrateMemObject could result in undefined results.</p>
	 *
	 * @param command_queue           a valid command queue
	 * @param num_mem_objects         the number of memory objects specified in the {@code mem_objects} argument
	 * @param mem_objects             the memory objects to migrate to the OpenCL device associated with {@code command_queue}
	 * @param flags                   a bitfield that is used to specify migration options. One of:<br>0, {@link #CL_MIGRATE_MEM_OBJECT_HOST_EXT MIGRATE_MEM_OBJECT_HOST_EXT}
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 */
	public static int clEnqueueMigrateMemObjectEXT(long command_queue, int num_mem_objects, ByteBuffer mem_objects, long flags, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(mem_objects, num_mem_objects << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueMigrateMemObjectEXT(command_queue, num_mem_objects, memAddress(mem_objects), flags, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueMigrateMemObjectEXT EnqueueMigrateMemObjectEXT} */
	public static int clEnqueueMigrateMemObjectEXT(long command_queue, PointerBuffer mem_objects, long flags, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( LWJGLUtil.CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueMigrateMemObjectEXT(command_queue, mem_objects.remaining(), memAddress(mem_objects), flags, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

}