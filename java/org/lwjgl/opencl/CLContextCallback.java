/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link CL10#clCreateContext CreateContext} and {@link CL10#clCreateContextFromType CreateContextFromType} methods. */
public abstract class CLContextCallback extends Callback implements CLContextCallbackI {

	/** Creates a {@code CLContextCallback} instance from the specified function pointer. */
	public static CLContextCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		CLContextCallbackI instance = Callback.get(functionPointer);
		return instance instanceof CLContextCallback
			? (CLContextCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code CLContextCallback} instance that delegates to the specified {@code CLContextCallbackI} instance. */
	public static CLContextCallback create(CLContextCallbackI instance) {
		return instance instanceof CLContextCallback
			? (CLContextCallback)instance
			: new Container(instance.address(), instance);
	}

	protected CLContextCallback() {
		super(NULL);
		address = CLContextCallbackI.super.address();
	}

	private CLContextCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends CLContextCallback {

		private final CLContextCallbackI delegate;

		Container(long functionPointer, CLContextCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long errinfo, long private_info, long cb, long user_data) {
			delegate.invoke(errinfo, private_info, cb, user_data);
		}

	}

}