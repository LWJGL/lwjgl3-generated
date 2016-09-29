/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Screenshot captured. Screenshot format is always 4-byte BGRA. */
public abstract class BGFXScreenShotCallback extends Callback implements BGFXScreenShotCallbackI {

	/** Creates a {@code BGFXScreenShotCallback} instance from the specified function pointer. */
	public static BGFXScreenShotCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		BGFXScreenShotCallbackI instance = Callback.get(functionPointer);
		return instance instanceof BGFXScreenShotCallback
			? (BGFXScreenShotCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code BGFXScreenShotCallback} instance that delegates to the specified {@code BGFXScreenShotCallbackI} instance. */
	public static BGFXScreenShotCallback create(BGFXScreenShotCallbackI instance) {
		return instance instanceof BGFXScreenShotCallback
			? (BGFXScreenShotCallback)instance
			: new Container(instance.address(), instance);
	}

	protected BGFXScreenShotCallback() {
		super(SIGNATURE);
	}

	private BGFXScreenShotCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends BGFXScreenShotCallback {

		private final BGFXScreenShotCallbackI delegate;

		Container(long functionPointer, BGFXScreenShotCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long _this, long _filePath, int _width, int _height, int _pitch, long _data, int _size, boolean _yflip) {
			delegate.invoke(_this, _filePath, _width, _height, _pitch, _data, _size, _yflip);
		}

	}

}