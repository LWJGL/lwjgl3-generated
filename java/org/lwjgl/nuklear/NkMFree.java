/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link NkAllocator} struct. */
public abstract class NkMFree extends Callback implements NkMFreeI {

	/** Creates a {@code NkMFree} instance from the specified function pointer. */
	public static NkMFree create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkMFreeI instance = Callback.get(functionPointer);
		return instance instanceof NkMFree
			? (NkMFree)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkMFree} instance that delegates to the specified {@code NkMFreeI} instance. */
	public static NkMFree create(NkMFreeI instance) {
		return instance instanceof NkMFree
			? (NkMFree)instance
			: new Container(instance.address(), instance);
	}

	protected NkMFree() {
		super(SIGNATURE);
	}

	private NkMFree(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkMFree {

		private final NkMFreeI delegate;

		Container(long functionPointer, NkMFreeI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long handle, long ptr) {
			delegate.invoke(handle, ptr);
		}

	}

}