/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ChunkHooks} struct. */
public abstract class ChunkDalloc extends Callback implements ChunkDallocI {

	/** Creates a {@code ChunkDalloc} instance from the specified function pointer. */
	public static ChunkDalloc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		ChunkDallocI instance = Callback.get(functionPointer);
		return instance instanceof ChunkDalloc
			? (ChunkDalloc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code ChunkDalloc} instance that delegates to the specified {@code ChunkDallocI} instance. */
	public static ChunkDalloc create(ChunkDallocI instance) {
		return instance instanceof ChunkDalloc
			? (ChunkDalloc)instance
			: new Container(instance.address(), instance);
	}

	protected ChunkDalloc() {
		super(NULL);
		address = ChunkDallocI.super.address();
	}

	private ChunkDalloc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends ChunkDalloc {

		private final ChunkDallocI delegate;

		Container(long functionPointer, ChunkDallocI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public boolean invoke(long chunk, long size, boolean committed, int arena_ind) {
			return delegate.invoke(chunk, size, committed, arena_ind);
		}

	}

}