/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@code nk_style_*} structs. */
public abstract class NkDrawEndCallback extends Callback implements NkDrawEndCallbackI {

	/** Creates a {@code NkDrawEndCallback} instance from the specified function pointer. */
	public static NkDrawEndCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkDrawEndCallbackI instance = Callback.get(functionPointer);
		return instance instanceof NkDrawEndCallback
			? (NkDrawEndCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkDrawEndCallback} instance that delegates to the specified {@code NkDrawEndCallbackI} instance. */
	public static NkDrawEndCallback create(NkDrawEndCallbackI instance) {
		return instance instanceof NkDrawEndCallback
			? (NkDrawEndCallback)instance
			: new Container(instance.address(), instance);
	}

	protected NkDrawEndCallback() {
		super(SIGNATURE);
	}

	private NkDrawEndCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkDrawEndCallback {

		private final NkDrawEndCallbackI delegate;

		Container(long functionPointer, NkDrawEndCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public float invoke(long buffer, long userdata) {
			return delegate.invoke(buffer, userdata);
		}

	}

}