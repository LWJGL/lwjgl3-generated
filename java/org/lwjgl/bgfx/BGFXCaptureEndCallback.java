/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Called when capture ends. */
public abstract class BGFXCaptureEndCallback extends Callback implements BGFXCaptureEndCallbackI {

	/** Creates a {@code BGFXCaptureEndCallback} instance from the specified function pointer. */
	public static BGFXCaptureEndCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		BGFXCaptureEndCallbackI instance = Callback.get(functionPointer);
		return instance instanceof BGFXCaptureEndCallback
			? (BGFXCaptureEndCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code BGFXCaptureEndCallback} instance that delegates to the specified {@code BGFXCaptureEndCallbackI} instance. */
	public static BGFXCaptureEndCallback create(BGFXCaptureEndCallbackI instance) {
		return instance instanceof BGFXCaptureEndCallback
			? (BGFXCaptureEndCallback)instance
			: new Container(instance.address(), instance);
	}

	protected BGFXCaptureEndCallback() {
		super(SIGNATURE);
	}

	private BGFXCaptureEndCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends BGFXCaptureEndCallback {

		private final BGFXCaptureEndCallbackI delegate;

		Container(long functionPointer, BGFXCaptureEndCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long _this) {
			delegate.invoke(_this);
		}

	}

}