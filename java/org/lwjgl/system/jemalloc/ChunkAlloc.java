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

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(6);

	static {
		ARGS.put(0, ffi_type_pointer);
		ARGS.put(1, ffi_type_pointer);
		ARGS.put(2, ffi_type_pointer);
		ARGS.put(3, ffi_type_pointer);
		ARGS.put(4, ffi_type_pointer);
		ARGS.put(5, ffi_type_uint32);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_pointer, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare ChunkAlloc callback interface. Status: 0x%X", status));
	}

	protected ChunkAlloc() {
		super(CIF);
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

}