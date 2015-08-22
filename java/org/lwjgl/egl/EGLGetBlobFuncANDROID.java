/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link ANDROIDBlobCache#eglSetBlobCacheFuncsANDROID} method. */
public abstract class EGLGetBlobFuncANDROID extends Closure.Ptr {

	private static final ByteBuffer    CIF  = memAlloc(FFICIF.SIZEOF);
	private static final PointerBuffer ARGS = memAllocPointer(4);

	static {
		ARGS.put(0, ffi_type_pointer);
		ARGS.put(1, ffi_type_pointer);
		ARGS.put(2, ffi_type_pointer);
		ARGS.put(3, ffi_type_pointer);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_pointer, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare EGLGetBlobFuncANDROID callback interface. Status: 0x%X", status));
	}

	protected EGLGetBlobFuncANDROID() {
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
			memGetAddress(memGetAddress(POINTER_SIZE * 3 + args))
		);
	}

	public abstract long invoke(long key, long keySize, long value, long valueSize);

	/** A functional interface for {@link EGLGetBlobFuncANDROID}. */
	public interface SAM {
		long invoke(long key, long keySize, long value, long valueSize);
	}

}