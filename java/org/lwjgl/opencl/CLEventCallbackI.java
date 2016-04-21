/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL11#clSetEventCallback SetEventCallback} method. */
@FunctionalInterface
public interface CLEventCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pip)v", true);
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