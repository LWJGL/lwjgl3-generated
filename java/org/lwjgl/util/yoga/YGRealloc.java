/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class YGRealloc extends Callback implements YGReallocI {

	/** Creates a {@code YGRealloc} instance from the specified function pointer. */
	public static YGRealloc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		YGReallocI instance = Callback.get(functionPointer);
		return instance instanceof YGRealloc
			? (YGRealloc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code YGRealloc} instance that delegates to the specified {@code YGReallocI} instance. */
	public static YGRealloc create(YGReallocI instance) {
		return instance instanceof YGRealloc
			? (YGRealloc)instance
			: new Container(instance.address(), instance);
	}

	protected YGRealloc() {
		super(SIGNATURE);
	}

	private YGRealloc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends YGRealloc {

		private final YGReallocI delegate;

		Container(long functionPointer, YGReallocI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public long invoke(long ptr, long size) {
			return delegate.invoke(ptr, size);
		}

	}

}