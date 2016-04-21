/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL20#clEnqueueSVMFree EnqueueSVMFree} method. */
@FunctionalInterface
public interface CLSVMFreeCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pipp)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called to free shared virtual memory pointers.
	 *
	 * @param queue            a valid host command-queue
	 * @param num_svm_pointers the number of pointers in the {@code svm_pointers} array
	 * @param svm_pointers     an array of shared virtual memory pointers to be freed
	 * @param user_data        the user-specified value that was passed when calling {@link CL20#clEnqueueSVMFree EnqueueSVMFree}
	 */
	void invoke(long queue, int num_svm_pointers, long svm_pointers, long user_data);

}