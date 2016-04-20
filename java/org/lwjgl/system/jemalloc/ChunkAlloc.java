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
public interface ChunkAlloc extends Callback.P {

	/** Creates a {@code ChunkAlloc} instance from the specified function pointer. */
	static ChunkAlloc create(long functionPointer) {
		return functionPointer == NULL ? null : new ChunkAllocHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code ChunkAlloc} instance that delegates to the specified {@code ChunkAlloc} instance. */
	static ChunkAlloc create(ChunkAlloc sam) {
		return new ChunkAllocHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pppppi)p", false);
	}

	@Override
	default long callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Chunk allocation hook.
	 *
	 * @param new_addr  
	 * @param size      
	 * @param alignment 
	 * @param zero      
	 * @param commit    
	 * @param arena_ind 
	 */
	long invoke(long new_addr, long size, long alignment, long zero, long commit, int arena_ind);

}

final class ChunkAllocHandle extends Pointer.Default implements ChunkAlloc {

	private final ChunkAlloc delegate;

	ChunkAllocHandle(long functionPointer, ChunkAlloc delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public long invoke(long new_addr, long size, long alignment, long zero, long commit, int arena_ind) {
		return delegate.invoke(new_addr, size, alignment, zero, commit, arena_ind);
	}

}