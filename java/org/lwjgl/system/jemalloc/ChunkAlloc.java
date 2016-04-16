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
public abstract class ChunkAlloc extends Callback.P {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.system.jemalloc.ChunkAlloc");

	protected ChunkAlloc() {
		super(CALL_CONVENTION_DEFAULT + "(pppppi)p", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected long callback(long args) {
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
	public abstract long invoke(long new_addr, long size, long alignment, long zero, long commit, int arena_ind);

	/** A functional interface for {@link ChunkAlloc}. */
	public interface SAM {
		long invoke(long new_addr, long size, long alignment, long zero, long commit, int arena_ind);
	}

	/**
	 * Creates a {@link ChunkAlloc} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link ChunkAlloc} instance
	 */
	public static ChunkAlloc create(SAM sam) {
		return new ChunkAlloc() {
			@Override
			public long invoke(long new_addr, long size, long alignment, long zero, long commit, int arena_ind) {
				return sam.invoke(new_addr, size, alignment, zero, commit, arena_ind);
			}
		};
	}

}