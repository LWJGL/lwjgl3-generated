/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link BGFX#bgfx_make_ref_release make_ref_release} method. */
public abstract class BGFXReleaseFunctionCallback extends Callback implements BGFXReleaseFunctionCallbackI {

	/** Creates a {@code BGFXReleaseFunctionCallback} instance from the specified function pointer. */
	public static BGFXReleaseFunctionCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		BGFXReleaseFunctionCallbackI instance = Callback.get(functionPointer);
		return instance instanceof BGFXReleaseFunctionCallback
			? (BGFXReleaseFunctionCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code BGFXReleaseFunctionCallback} instance that delegates to the specified {@code BGFXReleaseFunctionCallbackI} instance. */
	public static BGFXReleaseFunctionCallback create(BGFXReleaseFunctionCallbackI instance) {
		return instance instanceof BGFXReleaseFunctionCallback
			? (BGFXReleaseFunctionCallback)instance
			: new Container(instance.address(), instance);
	}

	protected BGFXReleaseFunctionCallback() {
		super(SIGNATURE);
	}

	private BGFXReleaseFunctionCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends BGFXReleaseFunctionCallback {

		private final BGFXReleaseFunctionCallbackI delegate;

		Container(long functionPointer, BGFXReleaseFunctionCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long _ptr, long _userData) {
			delegate.invoke(_ptr, _userData);
		}

	}

}