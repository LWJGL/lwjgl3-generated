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

/** Instances of this interface may be passed to the {@link CL20#clEnqueueSVMFree} method. */
public abstract class CLSVMFreeCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(4);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.opencl.CLSVMFreeCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_SYSTEM,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
		);
	}

	protected CLSVMFreeCallback() {
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
			memGetAddress(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 3 + args))
		);
	}

	/**
	 * Will be called to free shared virtual memory pointers.
	 *
	 * @param queue            a valid host command-queue
	 * @param num_svm_pointers the number of pointers in the {@code svm_pointers} array
	 * @param svm_pointers     an array of shared virtual memory pointers to be freed
	 * @param user_data        the user-specified value that was passed when calling {@link CL20#clEnqueueSVMFree}
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
	public static CLSVMFreeCallback create(final SAM sam) {
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
	public static CLSVMFreeCallback createBuffer(final SAMBuffer sam) {
		return new CLSVMFreeCallback() {
			@Override
			public void invoke(long queue, int num_svm_pointers, long svm_pointers, long user_data) {
				sam.invoke(queue, memPointerBuffer(svm_pointers, num_svm_pointers), user_data);
			}
		};
	}
	
}