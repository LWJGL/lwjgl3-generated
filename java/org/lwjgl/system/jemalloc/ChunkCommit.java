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
public interface ChunkCommit extends Callback.Z {

	/** Creates a {@code ChunkCommit} instance from the specified function pointer. */
	static ChunkCommit create(long functionPointer) {
		return functionPointer == NULL ? null : new ChunkCommitHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code ChunkCommit} instance that delegates to the specified {@code ChunkCommit} instance. */
	static ChunkCommit create(ChunkCommit sam) {
		return new ChunkCommitHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(ppppi)B", false);
	}

	@Override
	default boolean callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Chunk commit hook.
	 *
	 * @param chunk     
	 * @param size      
	 * @param offset    
	 * @param length    
	 * @param arena_ind 
	 */
	boolean invoke(long chunk, long size, long offset, long length, int arena_ind);

}

final class ChunkCommitHandle extends Pointer.Default implements ChunkCommit {

	private final ChunkCommit delegate;

	ChunkCommitHandle(long functionPointer, ChunkCommit delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public boolean invoke(long chunk, long size, long offset, long length, int arena_ind) {
		return delegate.invoke(chunk, size, offset, length, arena_ind);
	}

}