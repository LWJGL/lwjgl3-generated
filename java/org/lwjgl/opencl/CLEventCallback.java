/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link CL11#clSetEventCallback SetEventCallback} method. */
public abstract class CLEventCallback extends Callback implements CLEventCallbackI {

	/** Creates a {@code CLEventCallback} instance from the specified function pointer. */
	public static CLEventCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		CLEventCallbackI instance = Callback.get(functionPointer);
		return instance instanceof CLEventCallback
			? (CLEventCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code CLEventCallback} instance that delegates to the specified {@code CLEventCallbackI} instance. */
	public static CLEventCallback create(CLEventCallbackI instance) {
		return instance instanceof CLEventCallback
			? (CLEventCallback)instance
			: new Container(instance.address(), instance);
	}

	protected CLEventCallback() {
		super(NULL);
		address = CLEventCallbackI.super.address();
	}

	private CLEventCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends CLEventCallback {

		private final CLEventCallbackI delegate;

		Container(long functionPointer, CLEventCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long event, int event_command_exec_status, long user_data) {
			delegate.invoke(event, event_command_exec_status, user_data);
		}

	}

}