/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link NkUserFont} struct. */
public abstract class NkTextWidthCallback extends Callback implements NkTextWidthCallbackI {

	/** Creates a {@code NkTextWidthCallback} instance from the specified function pointer. */
	public static NkTextWidthCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkTextWidthCallbackI instance = Callback.get(functionPointer);
		return instance instanceof NkTextWidthCallback
			? (NkTextWidthCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkTextWidthCallback} instance that delegates to the specified {@code NkTextWidthCallbackI} instance. */
	public static NkTextWidthCallback create(NkTextWidthCallbackI instance) {
		return instance instanceof NkTextWidthCallback
			? (NkTextWidthCallback)instance
			: new Container(instance.address(), instance);
	}

	protected NkTextWidthCallback() {
		super(SIGNATURE);
	}

	private NkTextWidthCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkTextWidthCallback {

		private final NkTextWidthCallbackI delegate;

		Container(long functionPointer, NkTextWidthCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public float invoke(long handle, float h, long text, int len) {
			return delegate.invoke(handle, h, text, len);
		}

	}

}