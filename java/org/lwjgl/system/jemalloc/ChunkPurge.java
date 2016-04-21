/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@link ChunkHooks} struct. */
public abstract class ChunkPurge extends Callback implements ChunkPurgeI {

	/** Creates a {@code ChunkPurge} instance from the specified function pointer. */
	public static ChunkPurge create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		ChunkPurgeI instance = Callback.get(functionPointer);
		return instance instanceof ChunkPurge
			? (ChunkPurge)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code ChunkPurge} instance that delegates to the specified {@code ChunkPurgeI} instance. */
	public static ChunkPurge create(ChunkPurgeI instance) {
		return instance instanceof ChunkPurge
			? (ChunkPurge)instance
			: new Container(instance.address(), instance);
	}

	protected ChunkPurge() {
		super(NULL);
		address = ChunkPurgeI.super.address();
	}

	private ChunkPurge(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends ChunkPurge {

		private final ChunkPurgeI delegate;

		Container(long functionPointer, ChunkPurgeI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public boolean invoke(long chunk, long size, long offset, long length, int arena_ind) {
			return delegate.invoke(chunk, size, offset, length, arena_ind);
		}

	}

}