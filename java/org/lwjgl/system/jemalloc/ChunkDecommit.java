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
public abstract class ChunkDecommit extends Callback.Z {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.system.jemalloc.ChunkDecommit");

	protected ChunkDecommit() {
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
	 * Chunk decommit hook.
	 *
	 * @param chunk     
	 * @param size      
	 * @param offset    
	 * @param length    
	 * @param arena_ind 
	 */
	public abstract boolean invoke(long chunk, long size, long offset, long length, int arena_ind);

	/** A functional interface for {@link ChunkDecommit}. */
	public interface SAM {
		boolean invoke(long chunk, long size, long offset, long length, int arena_ind);
	}

	/**
	 * Creates a {@link ChunkDecommit} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link ChunkDecommit} instance
	 */
	public static ChunkDecommit create(SAM sam) {
		return new ChunkDecommit() {
			@Override
			public boolean invoke(long chunk, long size, long offset, long length, int arena_ind) {
				return sam.invoke(chunk, size, offset, length, arena_ind);
			}
		};
	}

}