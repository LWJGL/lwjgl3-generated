/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL11#clSetEventCallback SetEventCallback} method. */
@FunctionalInterface
public interface CLEventCallback extends Callback.V {

	/** Creates a {@code CLEventCallback} instance from the specified function pointer. */
	static CLEventCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new CLEventCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code CLEventCallback} instance that delegates to the specified {@code CLEventCallback} instance. */
	static CLEventCallback create(CLEventCallback sam) {
		return new CLEventCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pip)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgPointer(args)
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
	 * @param user_data                 the user-specified value that was passed when calling {@link CL11#clSetEventCallback SetEventCallback}
	 */
	void invoke(long event, int event_command_exec_status, long user_data);

}

final class CLEventCallbackHandle extends Pointer.Default implements CLEventCallback {

	private final CLEventCallback delegate;

	CLEventCallbackHandle(long functionPointer, CLEventCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long event, int event_command_exec_status, long user_data) {
		delegate.invoke(event, event_command_exec_status, user_data);
	}

}