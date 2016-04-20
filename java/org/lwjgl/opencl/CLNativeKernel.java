/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL10#clEnqueueNativeKernel EnqueueNativeKernel} method. */
@FunctionalInterface
public interface CLNativeKernel extends Callback.V {

	/** Creates a {@code CLNativeKernel} instance from the specified function pointer. */
	static CLNativeKernel create(long functionPointer) {
		return functionPointer == NULL ? null : new CLNativeKernelHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code CLNativeKernel} instance that delegates to the specified {@code CLNativeKernel} instance. */
	static CLNativeKernel create(CLNativeKernel sam) {
		return new CLNativeKernelHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(p)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called by the OpenCL using {@link CL10#clEnqueueNativeKernel EnqueueNativeKernel}.
	 *
	 * @param args a pointer to the arguments list
	 */
	void invoke(long args);

}

final class CLNativeKernelHandle extends Pointer.Default implements CLNativeKernel {

	private final CLNativeKernel delegate;

	CLNativeKernelHandle(long functionPointer, CLNativeKernel delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long args) {
		delegate.invoke(args);
	}

}