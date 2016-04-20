/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL10#clCreateContext CreateContext} and {@link CL10#clCreateContextFromType CreateContextFromType} methods. */
@FunctionalInterface
public interface CLContextCallback extends Callback.V {

	/** Creates a {@code CLContextCallback} instance from the specified function pointer. */
	static CLContextCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new CLContextCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code CLContextCallback} instance that delegates to the specified {@code CLContextCallback} instance. */
	static CLContextCallback create(CLContextCallback sam) {
		return new CLContextCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pppp)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when a debug message is generated.
	 *
	 * @param errinfo      a pointer to the message string representation
	 * @param private_info a pointer to binary data that is returned by the OpenCL implementation that can be used to log additional information helpful in debugging the error
	 * @param cb           the number of bytes in the {@code private_info} pointer
	 * @param user_data    the user-specified value that was passed when calling {@link CL10#clCreateContext CreateContext} or {@link CL10#clCreateContextFromType CreateContextFromType}
	 */
	void invoke(long errinfo, long private_info, long cb, long user_data);

}

final class CLContextCallbackHandle extends Pointer.Default implements CLContextCallback {

	private final CLContextCallback delegate;

	CLContextCallbackHandle(long functionPointer, CLContextCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long errinfo, long private_info, long cb, long user_data) {
		delegate.invoke(errinfo, private_info, cb, user_data);
	}

}