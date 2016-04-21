/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link CL11#clSetMemObjectDestructorCallback SetMemObjectDestructorCallback} method. */
public abstract class CLMemObjectDestructorCallback extends Callback implements CLMemObjectDestructorCallbackI {

	/** Creates a {@code CLMemObjectDestructorCallback} instance from the specified function pointer. */
	public static CLMemObjectDestructorCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		CLMemObjectDestructorCallbackI instance = Callback.get(functionPointer);
		return instance instanceof CLMemObjectDestructorCallback
			? (CLMemObjectDestructorCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code CLMemObjectDestructorCallback} instance that delegates to the specified {@code CLMemObjectDestructorCallbackI} instance. */
	public static CLMemObjectDestructorCallback create(CLMemObjectDestructorCallbackI instance) {
		return instance instanceof CLMemObjectDestructorCallback
			? (CLMemObjectDestructorCallback)instance
			: new Container(instance.address(), instance);
	}

	protected CLMemObjectDestructorCallback() {
		super(NULL);
		address = CLMemObjectDestructorCallbackI.super.address();
	}

	private CLMemObjectDestructorCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends CLMemObjectDestructorCallback {

		private final CLMemObjectDestructorCallbackI delegate;

		Container(long functionPointer, CLMemObjectDestructorCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long memobj, long user_data) {
			delegate.invoke(memobj, user_data);
		}

	}

}