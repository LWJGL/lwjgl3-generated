/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link NkClipboard} struct. */
public abstract class NkPluginPaste extends Callback implements NkPluginPasteI {

	/** Creates a {@code NkPluginPaste} instance from the specified function pointer. */
	public static NkPluginPaste create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkPluginPasteI instance = Callback.get(functionPointer);
		return instance instanceof NkPluginPaste
			? (NkPluginPaste)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkPluginPaste} instance that delegates to the specified {@code NkPluginPasteI} instance. */
	public static NkPluginPaste create(NkPluginPasteI instance) {
		return instance instanceof NkPluginPaste
			? (NkPluginPaste)instance
			: new Container(instance.address(), instance);
	}

	protected NkPluginPaste() {
		super(SIGNATURE);
	}

	private NkPluginPaste(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkPluginPaste {

		private final NkPluginPasteI delegate;

		Container(long functionPointer, NkPluginPasteI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long handle, long edit) {
			delegate.invoke(handle, edit);
		}

	}

}