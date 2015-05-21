/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be set to the {@code read} field of the {@link STBIIOCallbacks} struct. */
public abstract class STBIReadCallback extends Closure.Int {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(3);

	static {
		ARGS.put(0, ffi_type_pointer);
		ARGS.put(1, ffi_type_pointer);
		ARGS.put(2, ffi_type_sint32);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_sint32, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare STBIReadCallback callback interface. Status: 0x%X", status));
	}

	protected STBIReadCallback() {
		super(CIF);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected int callback(long args) {
		return invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 2 + args))
		);
	}
	/**
	 * The {@code stbi_io_callbacks.read} callback.
	 *
	 * @param user a pointer to user data
	 * @param data the data buffer to fill
	 * @param size the number of bytes to read
	 *
	 * @return the number of bytes actually read
	 */
	public abstract int invoke(long user, long data, int size);

	/** A functional interface for {@link STBIReadCallback}. */
	public interface SAM {
		int invoke(long user, long data, int size);
	}

}