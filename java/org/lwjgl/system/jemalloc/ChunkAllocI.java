/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@link ChunkHooks} struct. */
@FunctionalInterface
public interface ChunkAllocI extends CallbackI.P {

	String SIGNATURE = "(pppppi)p";

	@Override
	default String getSignature() { return SIGNATURE; }

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