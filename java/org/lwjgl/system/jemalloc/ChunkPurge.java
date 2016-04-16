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
public abstract class ChunkPurge extends Callback.Z {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.system.jemalloc.ChunkPurge");

	protected ChunkPurge() {
		super(CALL_CONVENTION_DEFAULT + "(ppppi)B", CLASSPATH);
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
			dcbArgInt(args)
		);
	}

	/**
	 * Chunk purge hook.
	 *
	 * @param chunk     
	 * @param size      
	 * @param offset    
	 * @param length    
	 * @param arena_ind 
	 */
	public abstract boolean invoke(long chunk, long size, long offset, long length, int arena_ind);

	/** A functional interface for {@link ChunkPurge}. */
	public interface SAM {
		boolean invoke(long chunk, long size, long offset, long length, int arena_ind);
	}

	/**
	 * Creates a {@link ChunkPurge} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link ChunkPurge} instance
	 */
	public static ChunkPurge create(SAM sam) {
		return new ChunkPurge() {
			@Override
			public boolean invoke(long chunk, long size, long offset, long length, int arena_ind) {
				return sam.invoke(chunk, size, offset, length, arena_ind);
			}
		};
	}

}