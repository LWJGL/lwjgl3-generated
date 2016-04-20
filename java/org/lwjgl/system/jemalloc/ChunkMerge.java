/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@link ChunkHooks} struct. */
@FunctionalInterface
public interface ChunkMerge extends Callback.Z {

	/** Creates a {@code ChunkMerge} instance from the specified function pointer. */
	static ChunkMerge create(long functionPointer) {
		return functionPointer == NULL ? null : new ChunkMergeHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code ChunkMerge} instance that delegates to the specified {@code ChunkMerge} instance. */
	static ChunkMerge create(ChunkMerge sam) {
		return new ChunkMergeHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(ppppBi)B", false);
	}

	@Override
	default boolean callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgBool(args) != 0,
			dcbArgInt(args)
		);
	}

	/**
	 * Chunk merge hook.
	 *
	 * @param chunk_a   
	 * @param size_a    
	 * @param chunk_b   
	 * @param size_b    
	 * @param committed 
	 * @param arena_ind 
	 */
	boolean invoke(long chunk_a, long size_a, long chunk_b, long size_b, boolean committed, int arena_ind);

}

final class ChunkMergeHandle extends Pointer.Default implements ChunkMerge {

	private final ChunkMerge delegate;

	ChunkMergeHandle(long functionPointer, ChunkMerge delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public boolean invoke(long chunk_a, long size_a, long chunk_b, long size_b, boolean committed, int arena_ind) {
		return delegate.invoke(chunk_a, size_a, chunk_b, size_b, committed, arena_ind);
	}

}