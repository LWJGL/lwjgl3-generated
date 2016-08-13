/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link NkAllocator} struct. */
public abstract class NkMalloc extends Callback implements NkMallocI {

	/** Creates a {@code NkMalloc} instance from the specified function pointer. */
	public static NkMalloc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		NkMallocI instance = Callback.get(functionPointer);
		return instance instanceof NkMalloc
			? (NkMalloc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code NkMalloc} instance that delegates to the specified {@code NkMallocI} instance. */
	public static NkMalloc create(NkMallocI instance) {
		return instance instanceof NkMalloc
			? (NkMalloc)instance
			: new Container(instance.address(), instance);
	}

	protected NkMalloc() {
		super(SIGNATURE);
	}

	private NkMalloc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends NkMalloc {

		private final NkMallocI delegate;

		Container(long functionPointer, NkMallocI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public long invoke(long handle, long old, long size) {
			return delegate.invoke(handle, old, size);
		}

	}

}