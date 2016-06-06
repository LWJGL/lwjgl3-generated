/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link NkClipboard} struct. */
public abstract class NkPasteCallback extends Callback implements NkPasteCallbackI {

	/** Creates a {@code NkPasteCallback} instance from the specified function pointer. */
	public static NkPasteCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkPasteCallbackI instance = Callback.get(functionPointer);
		return instance instanceof NkPasteCallback
			? (NkPasteCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkPasteCallback} instance that delegates to the specified {@code NkPasteCallbackI} instance. */
	public static NkPasteCallback create(NkPasteCallbackI instance) {
		return instance instanceof NkPasteCallback
			? (NkPasteCallback)instance
			: new Container(instance.address(), instance);
	}

	protected NkPasteCallback() {
		super(SIGNATURE);
	}

	private NkPasteCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkPasteCallback {

		private final NkPasteCallbackI delegate;

		Container(long functionPointer, NkPasteCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long handle, long edit) {
			delegate.invoke(handle, edit);
		}

	}

}