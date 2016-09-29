/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * If fatal code is not {@link BGFX#BGFX_FATAL_DEBUG_CHECK FATAL_DEBUG_CHECK} this callback is called on unrecoverable error. It's not safe to continue, inform user and terminate application
 * from this call.
 * 
 * <p>Not thread safe and it can be called from any thread.</p>
 */
public abstract class BGFXFatalCallback extends Callback implements BGFXFatalCallbackI {

	/** Creates a {@code BGFXFatalCallback} instance from the specified function pointer. */
	public static BGFXFatalCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		BGFXFatalCallbackI instance = Callback.get(functionPointer);
		return instance instanceof BGFXFatalCallback
			? (BGFXFatalCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code BGFXFatalCallback} instance that delegates to the specified {@code BGFXFatalCallbackI} instance. */
	public static BGFXFatalCallback create(BGFXFatalCallbackI instance) {
		return instance instanceof BGFXFatalCallback
			? (BGFXFatalCallback)instance
			: new Container(instance.address(), instance);
	}

	protected BGFXFatalCallback() {
		super(SIGNATURE);
	}

	private BGFXFatalCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends BGFXFatalCallback {

		private final BGFXFatalCallbackI delegate;

		Container(long functionPointer, BGFXFatalCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long _this, int _code, long _str) {
			delegate.invoke(_this, _code, _str);
		}

	}

}