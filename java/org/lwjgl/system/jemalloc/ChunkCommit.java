/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ChunkHooks} struct. */
public abstract class ChunkCommit extends Callback implements ChunkCommitI {

	/** Creates a {@code ChunkCommit} instance from the specified function pointer. */
	public static ChunkCommit create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		ChunkCommitI instance = Callback.get(functionPointer);
		return instance instanceof ChunkCommit
			? (ChunkCommit)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code ChunkCommit} instance that delegates to the specified {@code ChunkCommitI} instance. */
	public static ChunkCommit create(ChunkCommitI instance) {
		return instance instanceof ChunkCommit
			? (ChunkCommit)instance
			: new Container(instance.address(), instance);
	}

	protected ChunkCommit() {
		super(NULL);
		address = ChunkCommitI.super.address();
	}

	private ChunkCommit(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends ChunkCommit {

		private final ChunkCommitI delegate;

		Container(long functionPointer, ChunkCommitI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public boolean invoke(long chunk, long size, long offset, long length, int arena_ind) {
			return delegate.invoke(chunk, size, offset, length, arena_ind);
		}

	}

}