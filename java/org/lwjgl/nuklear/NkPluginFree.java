/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;


public abstract class NkPluginFree extends Callback implements NkPluginFreeI {

	/** Creates a {@code NkPluginFree} instance from the specified function pointer. */
	public static NkPluginFree create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkPluginFreeI instance = Callback.get(functionPointer);
		return instance instanceof NkPluginFree
			? (NkPluginFree)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkPluginFree} instance that delegates to the specified {@code NkPluginFreeI} instance. */
	public static NkPluginFree create(NkPluginFreeI instance) {
		return instance instanceof NkPluginFree
			? (NkPluginFree)instance
			: new Container(instance.address(), instance);
	}

	protected NkPluginFree() {
		super(SIGNATURE);
	}

	private NkPluginFree(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkPluginFree {

		private final NkPluginFreeI delegate;

		Container(long functionPointer, NkPluginFreeI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long handle, long old) {
			delegate.invoke(handle, old);
		}

	}

}