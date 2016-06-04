/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link NkClipboard} struct. */
public abstract class NkCopyCallback extends Callback implements NkCopyCallbackI {

	/** Creates a {@code NkCopyCallback} instance from the specified function pointer. */
	public static NkCopyCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkCopyCallbackI instance = Callback.get(functionPointer);
		return instance instanceof NkCopyCallback
			? (NkCopyCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkCopyCallback} instance that delegates to the specified {@code NkCopyCallbackI} instance. */
	public static NkCopyCallback create(NkCopyCallbackI instance) {
		return instance instanceof NkCopyCallback
			? (NkCopyCallback)instance
			: new Container(instance.address(), instance);
	}

	protected NkCopyCallback() {
		super(NULL);
		address = NkCopyCallbackI.super.address();
	}

	private NkCopyCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkCopyCallback {

		private final NkCopyCallbackI delegate;

		Container(long functionPointer, NkCopyCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long handle, long text, int len) {
			delegate.invoke(handle, text, len);
		}

	}

}