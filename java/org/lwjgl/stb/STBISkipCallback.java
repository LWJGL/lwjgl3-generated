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

/** Instances of this interface may be set to the {@code skip} field of the {@link STBIIOCallbacks} struct. */
public abstract class STBISkipCallback extends Closure.Int {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(2);

	static {
		ARGS.put(0, ffi_type_pointer);
		ARGS.put(1, ffi_type_sint32);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_sint32, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare STBISkipCallback callback interface. Status: 0x%X", status));
	}

	protected STBISkipCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args))
		);
	}
	/**
	 * The {@code stbi_io_callbacks.skip} callback.
	 *
	 * @param user a pointer to user data
	 * @param n    the number of bytes to skip if positive, or <em>unget</em> the last {@code -n} bytes if negative
	 */
	public abstract int invoke(long user, int n);

	/** A functional interface for {@link STBISkipCallback}. */
	public interface SAM {
		int invoke(long user, int n);
	}

}