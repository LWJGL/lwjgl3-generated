/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Reads cached item. */
public abstract class BGFXCacheReadCallback extends Callback implements BGFXCacheReadCallbackI {

	/** Creates a {@code BGFXCacheReadCallback} instance from the specified function pointer. */
	public static BGFXCacheReadCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		BGFXCacheReadCallbackI instance = Callback.get(functionPointer);
		return instance instanceof BGFXCacheReadCallback
			? (BGFXCacheReadCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code BGFXCacheReadCallback} instance that delegates to the specified {@code BGFXCacheReadCallbackI} instance. */
	public static BGFXCacheReadCallback create(BGFXCacheReadCallbackI instance) {
		return instance instanceof BGFXCacheReadCallback
			? (BGFXCacheReadCallback)instance
			: new Container(instance.address(), instance);
	}

	protected BGFXCacheReadCallback() {
		super(SIGNATURE);
	}

	private BGFXCacheReadCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends BGFXCacheReadCallback {

		private final BGFXCacheReadCallbackI delegate;

		Container(long functionPointer, BGFXCacheReadCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public boolean invoke(long _this, long _id, long _data, int _size) {
			return delegate.invoke(_this, _id, _data, _size);
		}

	}

}