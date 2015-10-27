/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link CL11#clSetEventCallback} method. */
public abstract class CLEventCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(3);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.opencl.CLEventCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_SYSTEM,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer
		);
	}

	protected CLEventCallback() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 2 + args))
		);
	}

	/**
	 * Will be called when the execution status of the command associated with {@code event} changes to an execution status equal or past the status specified by
	 * {@code command_exec_status}."
	 *
	 * @param event                     the event
	 * @param event_command_exec_status represents the execution status of command for which this callback function is invoked. If the callback is called as the result of the command
	 *                                  associated with event being abnormally terminated, an appropriate error code for the error that caused the termination will be passed to
	 *                                  {@code event_command_exec_status} instead.
	 * @param user_data                 the user-specified value that was passed when calling {@link CL11#clSetEventCallback}
	 */
	public abstract void invoke(long event, int event_command_exec_status, long user_data);

	/** A functional interface for {@link CLEventCallback}. */
	public interface SAM {
		void invoke(long event, int event_command_exec_status, long user_data);
	}

	/**
	 * Creates a {@link CLEventCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLEventCallback} instance
	 */
	public static CLEventCallback create(final SAM sam) {
		return new CLEventCallback() {
			@Override
			public void invoke(long event, int event_command_exec_status, long user_data) {
				sam.invoke(event, event_command_exec_status, user_data);
			}
		};
	}

}