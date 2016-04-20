/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL20#clEnqueueSVMFree EnqueueSVMFree} method. */
@FunctionalInterface
public interface CLSVMFreeCallback extends Callback.V {

	/** Creates a {@code CLSVMFreeCallback} instance from the specified function pointer. */
	static CLSVMFreeCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new CLSVMFreeCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code CLSVMFreeCallback} instance that delegates to the specified {@code CLSVMFreeCallback} instance. */
	static CLSVMFreeCallback create(CLSVMFreeCallback sam) {
		return new CLSVMFreeCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pipp)v", true);
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

final class CLSVMFreeCallbackHandle extends Pointer.Default implements CLSVMFreeCallback {

	private final CLSVMFreeCallback delegate;

	CLSVMFreeCallbackHandle(long functionPointer, CLSVMFreeCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long queue, int num_svm_pointers, long svm_pointers, long user_data) {
		delegate.invoke(queue, num_svm_pointers, svm_pointers, user_data);
	}

}