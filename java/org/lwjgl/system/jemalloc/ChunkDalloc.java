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
public abstract class ChunkDalloc extends Callback.Z {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.system.jemalloc.ChunkDalloc");

	protected ChunkDalloc() {
		super(CALL_CONVENTION_DEFAULT + "(ppBi)B", CLASSPATH);
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
	public abstract boolean invoke(long chunk, long size, boolean committed, int arena_ind);

	/** A functional interface for {@link ChunkDalloc}. */
	public interface SAM {
		boolean invoke(long chunk, long size, boolean committed, int arena_ind);
	}

	/**
	 * Creates a {@link ChunkDalloc} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link ChunkDalloc} instance
	 */
	public static ChunkDalloc create(SAM sam) {
		return new ChunkDalloc() {
			@Override
			public boolean invoke(long chunk, long size, boolean committed, int arena_ind) {
				return sam.invoke(chunk, size, committed, arena_ind);
			}
		};
	}

}