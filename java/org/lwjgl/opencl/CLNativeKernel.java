/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link CL10#clEnqueueNativeKernel EnqueueNativeKernel} method. */
public abstract class CLNativeKernel extends Callback implements CLNativeKernelI {

	/** Creates a {@code CLNativeKernel} instance from the specified function pointer. */
	public static CLNativeKernel create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		CLNativeKernelI instance = Callback.get(functionPointer);
		return instance instanceof CLNativeKernel
			? (CLNativeKernel)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code CLNativeKernel} instance that delegates to the specified {@code CLNativeKernelI} instance. */
	public static CLNativeKernel create(CLNativeKernelI instance) {
		return instance instanceof CLNativeKernel
			? (CLNativeKernel)instance
			: new Container(instance.address(), instance);
	}

	protected CLNativeKernel() {
		super(SIGNATURE);
	}

	private CLNativeKernel(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends CLNativeKernel {

		private final CLNativeKernelI delegate;

		Container(long functionPointer, CLNativeKernelI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long args) {
			delegate.invoke(args);
		}

	}

}