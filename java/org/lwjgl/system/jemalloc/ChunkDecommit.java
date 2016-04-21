/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ChunkHooks} struct. */
public abstract class ChunkDecommit extends Callback implements ChunkDecommitI {

	/** Creates a {@code ChunkDecommit} instance from the specified function pointer. */
	public static ChunkDecommit create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		ChunkDecommitI instance = Callback.get(functionPointer);
		return instance instanceof ChunkDecommit
			? (ChunkDecommit)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code ChunkDecommit} instance that delegates to the specified {@code ChunkDecommitI} instance. */
	public static ChunkDecommit create(ChunkDecommitI instance) {
		return instance instanceof ChunkDecommit
			? (ChunkDecommit)instance
			: new Container(instance.address(), instance);
	}

	protected ChunkDecommit() {
		super(NULL);
		address = ChunkDecommitI.super.address();
	}

	private ChunkDecommit(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends ChunkDecommit {

		private final ChunkDecommitI delegate;

		Container(long functionPointer, ChunkDecommitI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public boolean invoke(long chunk, long size, long offset, long length, int arena_ind) {
			return delegate.invoke(chunk, size, offset, length, arena_ind);
		}

	}

}