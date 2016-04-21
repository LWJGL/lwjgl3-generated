/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link CL20#clEnqueueSVMFree EnqueueSVMFree} method. */
public abstract class CLSVMFreeCallback extends Callback implements CLSVMFreeCallbackI {

	/** Creates a {@code CLSVMFreeCallback} instance from the specified function pointer. */
	public static CLSVMFreeCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		CLSVMFreeCallbackI instance = Callback.get(functionPointer);
		return instance instanceof CLSVMFreeCallback
			? (CLSVMFreeCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code CLSVMFreeCallback} instance that delegates to the specified {@code CLSVMFreeCallbackI} instance. */
	public static CLSVMFreeCallback create(CLSVMFreeCallbackI instance) {
		return instance instanceof CLSVMFreeCallback
			? (CLSVMFreeCallback)instance
			: new Container(instance.address(), instance);
	}

	protected CLSVMFreeCallback() {
		super(NULL);
		address = CLSVMFreeCallbackI.super.address();
	}

	private CLSVMFreeCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends CLSVMFreeCallback {

		private final CLSVMFreeCallbackI delegate;

		Container(long functionPointer, CLSVMFreeCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long queue, int num_svm_pointers, long svm_pointers, long user_data) {
			delegate.invoke(queue, num_svm_pointers, svm_pointers, user_data);
		}

	}

}