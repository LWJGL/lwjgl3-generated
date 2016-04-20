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
public interface ChunkDecommit extends Callback.Z {

	/** Creates a {@code ChunkDecommit} instance from the specified function pointer. */
	static ChunkDecommit create(long functionPointer) {
		return functionPointer == NULL ? null : new ChunkDecommitHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code ChunkDecommit} instance that delegates to the specified {@code ChunkDecommit} instance. */
	static ChunkDecommit create(ChunkDecommit sam) {
		return new ChunkDecommitHandle(sam.address(), sam);
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
	 * Chunk decommit hook.
	 *
	 * @param chunk     
	 * @param size      
	 * @param offset    
	 * @param length    
	 * @param arena_ind 
	 */
	boolean invoke(long chunk, long size, long offset, long length, int arena_ind);

}

final class ChunkDecommitHandle extends Pointer.Default implements ChunkDecommit {

	private final ChunkDecommit delegate;

	ChunkDecommitHandle(long functionPointer, ChunkDecommit delegate) {
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