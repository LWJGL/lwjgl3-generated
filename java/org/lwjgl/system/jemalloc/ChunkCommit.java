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
public abstract class ChunkCommit extends Closure.Boolean {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(5);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.system.jemalloc.ChunkCommit");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_uint8,
			ARGS, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint32
		);
	}

	protected ChunkCommit() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 4 + args))
		);
	}

	/**
	 * Chunk commit hook.
	 *
	 * @param chunk     
	 * @param size      
	 * @param offset    
	 * @param length    
	 * @param arena_ind 
	 */
	public abstract boolean invoke(long chunk, long size, long offset, long length, int arena_ind);

	/** A functional interface for {@link ChunkCommit}. */
	public interface SAM {
		boolean invoke(long chunk, long size, long offset, long length, int arena_ind);
	}

	/**
	 * Creates a {@link ChunkCommit} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link ChunkCommit} instance
	 */
	public static ChunkCommit create(final SAM sam) {
		return new ChunkCommit() {
			@Override
			public boolean invoke(long chunk, long size, long offset, long length, int arena_ind) {
				return sam.invoke(chunk, size, offset, length, arena_ind);
			}
		};
	}

}