/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetErrorCallback} method. */
public abstract class GLFWErrorCallback extends Closure.Void {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(2);

	static {
		ARGS.put(0, ffi_type_sint32);
		ARGS.put(1, ffi_type_pointer);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_void, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare GLFWErrorCallback callback interface. Status: 0x%X", status));
	}

	protected GLFWErrorCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args))
		);
	}
	/**
	 * Will be called with an error code and a human-readable description when a GLFW error occurs.
	 *
	 * @param error       the error code
	 * @param description a pointer to a UTF-8 encoded string describing the error
	 */
	public abstract void invoke(int error, long description);

	/** A functional interface for {@link GLFWErrorCallback}. */
	public interface SAM {
		void invoke(int error, long description);
	}

}