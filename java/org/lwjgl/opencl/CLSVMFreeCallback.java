/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import org.lwjgl.PointerBuffer;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@link CL20#clEnqueueSVMFree EnqueueSVMFree} method. */
public abstract class CLSVMFreeCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.opencl.CLSVMFreeCallback");

	protected CLSVMFreeCallback() {
		super(CALL_CONVENTION_SYSTEM + "(pipp)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
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
	public abstract void invoke(long queue, int num_svm_pointers, long svm_pointers, long user_data);

	/** A functional interface for {@link CLSVMFreeCallback}. */
	public interface SAM {
		void invoke(long queue, int num_svm_pointers, long svm_pointers, long user_data);
	}

	/**
	 * Creates a {@link CLSVMFreeCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLSVMFreeCallback} instance
	 */
	public static CLSVMFreeCallback create(SAM sam) {
		return new CLSVMFreeCallback() {
			@Override
			public void invoke(long queue, int num_svm_pointers, long svm_pointers, long user_data) {
				sam.invoke(queue, num_svm_pointers, svm_pointers, user_data);
			}
		};
	}

	/** A functional interface for {@link CLSVMFreeCallback}. */
	public interface SAMBuffer {
		void invoke(long queue, PointerBuffer svm_pointers, long user_data);
	}

	/**
	 * Creates a {@link CLSVMFreeCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLSVMFreeCallback} instance
	 */
	public static CLSVMFreeCallback createBuffer(SAMBuffer sam) {
		return new CLSVMFreeCallback() {
			@Override
			public void invoke(long queue, int num_svm_pointers, long svm_pointers, long user_data) {
				sam.invoke(queue, memPointerBuffer(svm_pointers, num_svm_pointers), user_data);
			}
		};
	}

}