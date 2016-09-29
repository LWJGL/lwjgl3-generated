/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Writes cached item. */
public abstract class BGFXCacheWriteCallback extends Callback implements BGFXCacheWriteCallbackI {

	/** Creates a {@code BGFXCacheWriteCallback} instance from the specified function pointer. */
	public static BGFXCacheWriteCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		BGFXCacheWriteCallbackI instance = Callback.get(functionPointer);
		return instance instanceof BGFXCacheWriteCallback
			? (BGFXCacheWriteCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code BGFXCacheWriteCallback} instance that delegates to the specified {@code BGFXCacheWriteCallbackI} instance. */
	public static BGFXCacheWriteCallback create(BGFXCacheWriteCallbackI instance) {
		return instance instanceof BGFXCacheWriteCallback
			? (BGFXCacheWriteCallback)instance
			: new Container(instance.address(), instance);
	}

	protected BGFXCacheWriteCallback() {
		super(SIGNATURE);
	}

	private BGFXCacheWriteCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends BGFXCacheWriteCallback {

		private final BGFXCacheWriteCallbackI delegate;

		Container(long functionPointer, BGFXCacheWriteCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long _this, long _id, long _data, int _size) {
			delegate.invoke(_this, _id, _data, _size);
		}

	}

}