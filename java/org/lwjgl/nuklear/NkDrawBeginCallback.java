/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@code nk_style_*} structs. */
public abstract class NkDrawBeginCallback extends Callback implements NkDrawBeginCallbackI {

	/** Creates a {@code NkDrawBeginCallback} instance from the specified function pointer. */
	public static NkDrawBeginCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkDrawBeginCallbackI instance = Callback.get(functionPointer);
		return instance instanceof NkDrawBeginCallback
			? (NkDrawBeginCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkDrawBeginCallback} instance that delegates to the specified {@code NkDrawBeginCallbackI} instance. */
	public static NkDrawBeginCallback create(NkDrawBeginCallbackI instance) {
		return instance instanceof NkDrawBeginCallback
			? (NkDrawBeginCallback)instance
			: new Container(instance.address(), instance);
	}

	protected NkDrawBeginCallback() {
		super(SIGNATURE);
	}

	private NkDrawBeginCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkDrawBeginCallback {

		private final NkDrawBeginCallbackI delegate;

		Container(long functionPointer, NkDrawBeginCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public float invoke(long buffer, long userdata) {
			return delegate.invoke(buffer, userdata);
		}

	}

}