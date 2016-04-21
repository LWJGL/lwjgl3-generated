/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@code eof} field of the {@link STBIIOCallbacks} struct. */
public abstract class STBIEOFCallback extends Callback implements STBIEOFCallbackI {

	/** Creates a {@code STBIEOFCallback} instance from the specified function pointer. */
	public static STBIEOFCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		STBIEOFCallbackI instance = Callback.get(functionPointer);
		return instance instanceof STBIEOFCallback
			? (STBIEOFCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code STBIEOFCallback} instance that delegates to the specified {@code STBIEOFCallbackI} instance. */
	public static STBIEOFCallback create(STBIEOFCallbackI instance) {
		return instance instanceof STBIEOFCallback
			? (STBIEOFCallback)instance
			: new Container(instance.address(), instance);
	}

	protected STBIEOFCallback() {
		super(NULL);
		address = STBIEOFCallbackI.super.address();
	}

	private STBIEOFCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends STBIEOFCallback {

		private final STBIEOFCallbackI delegate;

		Container(long functionPointer, STBIEOFCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public int invoke(long user) {
			return delegate.invoke(user);
		}

	}

}