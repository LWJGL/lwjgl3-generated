/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Captured frame. */
public abstract class BGFXCaptureFrameCallback extends Callback implements BGFXCaptureFrameCallbackI {

	/** Creates a {@code BGFXCaptureFrameCallback} instance from the specified function pointer. */
	public static BGFXCaptureFrameCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		BGFXCaptureFrameCallbackI instance = Callback.get(functionPointer);
		return instance instanceof BGFXCaptureFrameCallback
			? (BGFXCaptureFrameCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code BGFXCaptureFrameCallback} instance that delegates to the specified {@code BGFXCaptureFrameCallbackI} instance. */
	public static BGFXCaptureFrameCallback create(BGFXCaptureFrameCallbackI instance) {
		return instance instanceof BGFXCaptureFrameCallback
			? (BGFXCaptureFrameCallback)instance
			: new Container(instance.address(), instance);
	}

	protected BGFXCaptureFrameCallback() {
		super(SIGNATURE);
	}

	private BGFXCaptureFrameCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends BGFXCaptureFrameCallback {

		private final BGFXCaptureFrameCallbackI delegate;

		Container(long functionPointer, BGFXCaptureFrameCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long _this, long _data, int _size) {
			delegate.invoke(_this, _data, _size);
		}

	}

}