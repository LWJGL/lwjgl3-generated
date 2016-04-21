/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ChunkHooks} struct. */
public abstract class ChunkMerge extends Callback implements ChunkMergeI {

	/** Creates a {@code ChunkMerge} instance from the specified function pointer. */
	public static ChunkMerge create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		ChunkMergeI instance = Callback.get(functionPointer);
		return instance instanceof ChunkMerge
			? (ChunkMerge)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code ChunkMerge} instance that delegates to the specified {@code ChunkMergeI} instance. */
	public static ChunkMerge create(ChunkMergeI instance) {
		return instance instanceof ChunkMerge
			? (ChunkMerge)instance
			: new Container(instance.address(), instance);
	}

	protected ChunkMerge() {
		super(NULL);
		address = ChunkMergeI.super.address();
	}

	private ChunkMerge(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends ChunkMerge {

		private final ChunkMergeI delegate;

		Container(long functionPointer, ChunkMergeI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public boolean invoke(long chunk_a, long size_a, long chunk_b, long size_b, boolean committed, int arena_ind) {
			return delegate.invoke(chunk_a, size_a, chunk_b, size_b, committed, arena_ind);
		}

	}

}