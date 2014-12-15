/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link CL10#clCreateContext} and {@link CL10#clCreateContextFromType} methods. */
public abstract class CLCreateContextCallback extends Closure.Void {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(4);

	static {
		ARGS.put(0, ffi_type_pointer);
		ARGS.put(1, ffi_type_pointer);
		ARGS.put(2, ffi_type_pointer);
		ARGS.put(3, ffi_type_pointer);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_SYSTEM, ffi_type_void, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare CLCreateContextCallback callback interface. Status: 0x%X", status));
	}

	protected CLCreateContextCallback() {
		super(CIF);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 3 + args))
		);
	}
	/**
	 * Will be called when a debug message is generated.
	 *
	 * @param errinfo      a pointer to the message string representation
	 * @param private_info a pointer to binary data that is returned by the OpenCL implementation that can be used to log additional information helpful in debugging the error
	 * @param cb           the number of bytes in the {@code private_info} pointer
	 * @param user_data    the user-specified value that was passed when calling {@link CL10#clCreateContext} or {@link CL10#clCreateContextFromType}
	 */
	public abstract void invoke(long errinfo, long private_info, long cb, long user_data);

	/** A functional interface for {@link CLCreateContextCallback}. */
	public interface SAM {
		void invoke(long errinfo, long private_info, long cb, long user_data);
	}

}