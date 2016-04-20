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
public interface ChunkDalloc extends Callback.Z {

	/** Creates a {@code ChunkDalloc} instance from the specified function pointer. */
	static ChunkDalloc create(long functionPointer) {
		return functionPointer == NULL ? null : new ChunkDallocHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code ChunkDalloc} instance that delegates to the specified {@code ChunkDalloc} instance. */
	static ChunkDalloc create(ChunkDalloc sam) {
		return new ChunkDallocHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(ppBi)B", false);
	}

	@Override
	default boolean callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgBool(args) != 0,
			dcbArgInt(args)
		);
	}

	/**
	 * Chunk deallocation hook.
	 *
	 * @param chunk     
	 * @param size      
	 * @param committed 
	 * @param arena_ind 
	 */
	boolean invoke(long chunk, long size, boolean committed, int arena_ind);

}

final class ChunkDallocHandle extends Pointer.Default implements ChunkDalloc {

	private final ChunkDalloc delegate;

	ChunkDallocHandle(long functionPointer, ChunkDalloc delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public boolean invoke(long chunk, long size, boolean committed, int arena_ind) {
		return delegate.invoke(chunk, size, committed, arena_ind);
	}

}