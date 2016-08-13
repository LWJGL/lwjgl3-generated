/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link NkTextEdit} struct. */
public abstract class NkFilterCallback extends Callback implements NkFilterCallbackI {

	/** Creates a {@code NkFilterCallback} instance from the specified function pointer. */
	public static NkFilterCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkFilterCallbackI instance = Callback.get(functionPointer);
		return instance instanceof NkFilterCallback
			? (NkFilterCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkFilterCallback} instance that delegates to the specified {@code NkFilterCallbackI} instance. */
	public static NkFilterCallback create(NkFilterCallbackI instance) {
		return instance instanceof NkFilterCallback
			? (NkFilterCallback)instance
			: new Container(instance.address(), instance);
	}

	protected NkFilterCallback() {
		super(SIGNATURE);
	}

	private NkFilterCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkFilterCallback {

		private final NkFilterCallbackI delegate;

		Container(long functionPointer, NkFilterCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public int invoke(long edit, int unicode) {
			return delegate.invoke(edit, unicode);
		}

	}

}