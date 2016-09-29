/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Called when capture begins. */
public abstract class BGFXCaptureBeginCallback extends Callback implements BGFXCaptureBeginCallbackI {

	/** Creates a {@code BGFXCaptureBeginCallback} instance from the specified function pointer. */
	public static BGFXCaptureBeginCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		BGFXCaptureBeginCallbackI instance = Callback.get(functionPointer);
		return instance instanceof BGFXCaptureBeginCallback
			? (BGFXCaptureBeginCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code BGFXCaptureBeginCallback} instance that delegates to the specified {@code BGFXCaptureBeginCallbackI} instance. */
	public static BGFXCaptureBeginCallback create(BGFXCaptureBeginCallbackI instance) {
		return instance instanceof BGFXCaptureBeginCallback
			? (BGFXCaptureBeginCallback)instance
			: new Container(instance.address(), instance);
	}

	protected BGFXCaptureBeginCallback() {
		super(SIGNATURE);
	}

	private BGFXCaptureBeginCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends BGFXCaptureBeginCallback {

		private final BGFXCaptureBeginCallbackI delegate;

		Container(long functionPointer, BGFXCaptureBeginCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long _this, int _width, int _height, int _pitch, int _format, boolean _yflip) {
			delegate.invoke(_this, _width, _height, _pitch, _format, _yflip);
		}

	}

}