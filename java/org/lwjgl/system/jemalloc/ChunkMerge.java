/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@link ChunkHooks} struct. */
public abstract class ChunkMerge extends Callback.Z {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.system.jemalloc.ChunkMerge");

	protected ChunkMerge() {
		super(CALL_CONVENTION_DEFAULT + "(ppppBi)B", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected boolean callback(long args) {
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
	public abstract boolean invoke(long chunk_a, long size_a, long chunk_b, long size_b, boolean committed, int arena_ind);

	/** A functional interface for {@link ChunkMerge}. */
	public interface SAM {
		boolean invoke(long chunk_a, long size_a, long chunk_b, long size_b, boolean committed, int arena_ind);
	}

	/**
	 * Creates a {@link ChunkMerge} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link ChunkMerge} instance
	 */
	public static ChunkMerge create(SAM sam) {
		return new ChunkMerge() {
			@Override
			public boolean invoke(long chunk_a, long size_a, long chunk_b, long size_b, boolean committed, int arena_ind) {
				return sam.invoke(chunk_a, size_a, chunk_b, size_b, committed, arena_ind);
			}
		};
	}

}