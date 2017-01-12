/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class YGBaselineFunc extends Callback implements YGBaselineFuncI {

	/** Creates a {@code YGBaselineFunc} instance from the specified function pointer. */
	public static YGBaselineFunc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		YGBaselineFuncI instance = Callback.get(functionPointer);
		return instance instanceof YGBaselineFunc
			? (YGBaselineFunc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code YGBaselineFunc} instance that delegates to the specified {@code YGBaselineFuncI} instance. */
	public static YGBaselineFunc create(YGBaselineFuncI instance) {
		return instance instanceof YGBaselineFunc
			? (YGBaselineFunc)instance
			: new Container(instance.address(), instance);
	}

	protected YGBaselineFunc() {
		super(SIGNATURE);
	}

	private YGBaselineFunc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends YGBaselineFunc {

		private final YGBaselineFuncI delegate;

		Container(long functionPointer, YGBaselineFuncI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public float invoke(long node, float width, float height) {
			return delegate.invoke(node, width, height);
		}

	}

}