/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@code skip} field of the {@link STBIIOCallbacks} struct. */
public abstract class STBISkipCallback extends Callback implements STBISkipCallbackI {

	/** Creates a {@code STBISkipCallback} instance from the specified function pointer. */
	public static STBISkipCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		STBISkipCallbackI instance = Callback.get(functionPointer);
		return instance instanceof STBISkipCallback
			? (STBISkipCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code STBISkipCallback} instance that delegates to the specified {@code STBISkipCallbackI} instance. */
	public static STBISkipCallback create(STBISkipCallbackI instance) {
		return instance instanceof STBISkipCallback
			? (STBISkipCallback)instance
			: new Container(instance.address(), instance);
	}

	protected STBISkipCallback() {
		super(NULL);
		address = STBISkipCallbackI.super.address();
	}

	private STBISkipCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends STBISkipCallback {

		private final STBISkipCallbackI delegate;

		Container(long functionPointer, STBISkipCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long user, int n) {
			delegate.invoke(user, n);
		}

	}

}