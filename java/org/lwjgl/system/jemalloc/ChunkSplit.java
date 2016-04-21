/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ChunkHooks} struct. */
public abstract class ChunkSplit extends Callback implements ChunkSplitI {

	/** Creates a {@code ChunkSplit} instance from the specified function pointer. */
	public static ChunkSplit create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		ChunkSplitI instance = Callback.get(functionPointer);
		return instance instanceof ChunkSplit
			? (ChunkSplit)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code ChunkSplit} instance that delegates to the specified {@code ChunkSplitI} instance. */
	public static ChunkSplit create(ChunkSplitI instance) {
		return instance instanceof ChunkSplit
			? (ChunkSplit)instance
			: new Container(instance.address(), instance);
	}

	protected ChunkSplit() {
		super(NULL);
		address = ChunkSplitI.super.address();
	}

	private ChunkSplit(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends ChunkSplit {

		private final ChunkSplitI delegate;

		Container(long functionPointer, ChunkSplitI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public boolean invoke(long chunk, long size, long size_a, long size_b, boolean committed, int arena_ind) {
			return delegate.invoke(chunk, size, size_a, size_b, committed, arena_ind);
		}

	}

}