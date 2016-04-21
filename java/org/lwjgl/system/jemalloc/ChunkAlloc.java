/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ChunkHooks} struct. */
public abstract class ChunkAlloc extends Callback implements ChunkAllocI {

	/** Creates a {@code ChunkAlloc} instance from the specified function pointer. */
	public static ChunkAlloc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		ChunkAllocI instance = Callback.get(functionPointer);
		return instance instanceof ChunkAlloc
			? (ChunkAlloc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code ChunkAlloc} instance that delegates to the specified {@code ChunkAllocI} instance. */
	public static ChunkAlloc create(ChunkAllocI instance) {
		return instance instanceof ChunkAlloc
			? (ChunkAlloc)instance
			: new Container(instance.address(), instance);
	}

	protected ChunkAlloc() {
		super(NULL);
		address = ChunkAllocI.super.address();
	}

	private ChunkAlloc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends ChunkAlloc {

		private final ChunkAllocI delegate;

		Container(long functionPointer, ChunkAllocI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public long invoke(long new_addr, long size, long alignment, long zero, long commit, int arena_ind) {
			return delegate.invoke(new_addr, size, alignment, zero, commit, arena_ind);
		}

	}

}