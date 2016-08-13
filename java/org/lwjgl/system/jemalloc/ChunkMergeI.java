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
public interface ChunkMergeI extends CallbackI.Z {

	String SIGNATURE = "(ppppBi)B";

	@Override
	default String getSignature() { return SIGNATURE; }

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