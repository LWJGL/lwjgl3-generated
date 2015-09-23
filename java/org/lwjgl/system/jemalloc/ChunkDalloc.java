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
public abstract class ChunkDalloc extends Closure.Byte {

	private static final ByteBuffer    CIF  = staticAlloc(FFICIF.SIZEOF);
	private static final PointerBuffer ARGS = staticAllocPointer(4);

	static {
		prepareCIF(
			"ChunkDalloc",
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_uint8,
			ARGS, ffi_type_pointer, ffi_type_pointer, ffi_type_uint8, ffi_type_uint32
		);
	}

	protected ChunkDalloc() {
		super(CIF);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected byte callback(long args) {
		return invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetByte(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 3 + args))
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
	public abstract byte invoke(long chunk, long size, byte committed, int arena_ind);

	/** A functional interface for {@link ChunkDalloc}. */
	public interface SAM {
		byte invoke(long chunk, long size, byte committed, int arena_ind);
	}

	/**
	 * Creates a {@link ChunkDalloc} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link ChunkDalloc} instance
	 */
	public static ChunkDalloc create(final SAM sam) {
		return new ChunkDalloc() {
			@Override
			public byte invoke(long chunk, long size, byte committed, int arena_ind) {
				return sam.invoke(chunk, size, committed, arena_ind);
			}
		};
	}

}