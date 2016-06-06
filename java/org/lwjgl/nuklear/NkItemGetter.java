/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link #nk_combo_callback} and {@link #nk_combobox_callback} functions. */
public abstract class NkItemGetter extends Callback implements NkItemGetterI {

	/** Creates a {@code NkItemGetter} instance from the specified function pointer. */
	public static NkItemGetter create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkItemGetterI instance = Callback.get(functionPointer);
		return instance instanceof NkItemGetter
			? (NkItemGetter)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkItemGetter} instance that delegates to the specified {@code NkItemGetterI} instance. */
	public static NkItemGetter create(NkItemGetterI instance) {
		return instance instanceof NkItemGetter
			? (NkItemGetter)instance
			: new Container(instance.address(), instance);
	}

	protected NkItemGetter() {
		super(SIGNATURE);
	}

	private NkItemGetter(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkItemGetter {

		private final NkItemGetterI delegate;

		Container(long functionPointer, NkItemGetterI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public float invoke(long userdata, int selected, long item) {
			return delegate.invoke(userdata, selected, item);
		}

	}

}