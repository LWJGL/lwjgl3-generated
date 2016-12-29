/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class YGMalloc extends Callback implements YGMallocI {

	/** Creates a {@code YGMalloc} instance from the specified function pointer. */
	public static YGMalloc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		YGMallocI instance = Callback.get(functionPointer);
		return instance instanceof YGMalloc
			? (YGMalloc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code YGMalloc} instance that delegates to the specified {@code YGMallocI} instance. */
	public static YGMalloc create(YGMallocI instance) {
		return instance instanceof YGMalloc
			? (YGMalloc)instance
			: new Container(instance.address(), instance);
	}

	protected YGMalloc() {
		super(SIGNATURE);
	}

	private YGMalloc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends YGMalloc {

		private final YGMallocI delegate;

		Container(long functionPointer, YGMallocI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public long invoke(long size) {
			return delegate.invoke(size);
		}

	}

}