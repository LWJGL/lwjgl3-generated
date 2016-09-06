/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link NkTextEdit} struct. */
public abstract class NkPluginFilter extends Callback implements NkPluginFilterI {

	/** Creates a {@code NkPluginFilter} instance from the specified function pointer. */
	public static NkPluginFilter create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkPluginFilterI instance = Callback.get(functionPointer);
		return instance instanceof NkPluginFilter
			? (NkPluginFilter)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkPluginFilter} instance that delegates to the specified {@code NkPluginFilterI} instance. */
	public static NkPluginFilter create(NkPluginFilterI instance) {
		return instance instanceof NkPluginFilter
			? (NkPluginFilter)instance
			: new Container(instance.address(), instance);
	}

	protected NkPluginFilter() {
		super(SIGNATURE);
	}

	private NkPluginFilter(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkPluginFilter {

		private final NkPluginFilterI delegate;

		Container(long functionPointer, NkPluginFilterI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public int invoke(long edit, int unicode) {
			return delegate.invoke(edit, unicode);
		}

	}

}