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

/** Instances of this interface may be set to the {@code eof} field of the {@link STBIIOCallbacks} struct. */
public abstract class STBIEOFCallback extends Closure.Int {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(1);

	static {
		ARGS.put(0, ffi_type_pointer);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_sint32, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare STBIEOFCallback callback interface. Status: 0x%X", status));
	}

	protected STBIEOFCallback() {
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
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args))
		);
	}
	/**
	 * The {@code stbi_io_callbacks.eof} callback.
	 *
	 * @param user a pointer to user data
	 *
	 * @return nonzero if we are at the end of file/data
	 */
	public abstract int invoke(long user);

	/** A functional interface for {@link STBIEOFCallback}. */
	public interface SAM {
		int invoke(long user);
	}

}