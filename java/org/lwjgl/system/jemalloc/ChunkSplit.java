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
public interface ChunkSplit extends Callback.Z {

	/** Creates a {@code ChunkSplit} instance from the specified function pointer. */
	static ChunkSplit create(long functionPointer) {
		return functionPointer == NULL ? null : new ChunkSplitHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code ChunkSplit} instance that delegates to the specified {@code ChunkSplit} instance. */
	static ChunkSplit create(ChunkSplit sam) {
		return new ChunkSplitHandle(sam.address(), sam);
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
	 * Chunk split hook.
	 *
	 * @param chunk     
	 * @param size      
	 * @param size_a    
	 * @param size_b    
	 * @param committed 
	 * @param arena_ind 
	 */
	boolean invoke(long chunk, long size, long size_a, long size_b, boolean committed, int arena_ind);

}

final class ChunkSplitHandle extends Pointer.Default implements ChunkSplit {

	private final ChunkSplit delegate;

	ChunkSplitHandle(long functionPointer, ChunkSplit delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public boolean invoke(long chunk, long size, long size_a, long size_b, boolean committed, int arena_ind) {
		return delegate.invoke(chunk, size, size_a, size_b, committed, arena_ind);
	}

}