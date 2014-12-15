/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link WinGDI#EnumObjects} method. */
public abstract class EnumObjectsCallback extends Closure.Int {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(2);

	static {
		ARGS.put(0, ffi_type_pointer);
		ARGS.put(1, ffi_type_pointer);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_SYSTEM, ffi_type_sint32, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare EnumObjectsCallback callback interface. Status: 0x%X", status));
	}

	protected EnumObjectsCallback() {
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
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args))
		);
	}
	/**
	 * Will be called for each available object.
	 *
	 * @param logObject a pointer to a {@link LOGPEN} or {@link LOGBRUSH} structure describing the attributes of the object
	 * @param data      a pointer to the application-defined data passed by the {@link WinGDI#EnumObjects} function
	 */
	public abstract int invoke(long logObject, long data);

	/** A functional interface for {@link EnumObjectsCallback}. */
	public interface SAM {
		int invoke(long logObject, long data);
	}

}