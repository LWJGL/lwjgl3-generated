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
public abstract class ChunkAlloc extends Closure.Ptr {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(6);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.system.jemalloc.ChunkAlloc");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_pointer,
			ARGS, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint32
		);
	}

	protected ChunkAlloc() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected long callback(long args) {
		return invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 3 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 4 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 5 + args))
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
	public static ChunkAlloc create(final SAM sam) {
		return new ChunkAlloc() {
			@Override
			public long invoke(long new_addr, long size, long alignment, long zero, long commit, int arena_ind) {
				return sam.invoke(new_addr, size, alignment, zero, commit, arena_ind);
			}
		};
	}

}