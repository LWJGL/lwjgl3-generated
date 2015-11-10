/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be set to the {@link ChunkHooks} struct. */
public abstract class ChunkSplit extends Closure.Boolean {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(6);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.system.jemalloc.ChunkSplit");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_uint8,
			ARGS, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint8, ffi_type_uint32
		);
	}

	protected ChunkSplit() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected boolean callback(long args) {
		return invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 3 + args)),
			memGetBoolean(memGetAddress(POINTER_SIZE * 4 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 5 + args))
		);
	}

	/**
	 * Chunk split hook.
	 *
	 * @param chunk     
	 * @param size      
	 * @param size_a    
	 * @param size_b    
	 * @param committed 
	 * @param arena_ind 
	 */
	public abstract boolean invoke(long chunk, long size, long size_a, long size_b, boolean committed, int arena_ind);

	/** A functional interface for {@link ChunkSplit}. */
	public interface SAM {
		boolean invoke(long chunk, long size, long size_a, long size_b, boolean committed, int arena_ind);
	}

	/**
	 * Creates a {@link ChunkSplit} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link ChunkSplit} instance
	 */
	public static ChunkSplit create(final SAM sam) {
		return new ChunkSplit() {
			@Override
			public boolean invoke(long chunk, long size, long size_a, long size_b, boolean committed, int arena_ind) {
				return sam.invoke(chunk, size, size_a, size_b, committed, arena_ind);
			}
		};
	}

}