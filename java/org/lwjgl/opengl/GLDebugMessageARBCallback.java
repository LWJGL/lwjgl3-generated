/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link ARBDebugOutput#glDebugMessageCallbackARB} method. */
public abstract class GLDebugMessageARBCallback extends Closure.Void {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(7);

	static {
		ARGS.put(0, ffi_type_uint32);
		ARGS.put(1, ffi_type_uint32);
		ARGS.put(2, ffi_type_uint32);
		ARGS.put(3, ffi_type_uint32);
		ARGS.put(4, ffi_type_sint32);
		ARGS.put(5, ffi_type_pointer);
		ARGS.put(6, ffi_type_pointer);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_SYSTEM, ffi_type_void, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare GLDebugMessageARBCallback callback interface. Status: 0x%X", status));
	}

	protected GLDebugMessageARBCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 3 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 4 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 5 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 6 + args))
		);
	}
	/**
	 * Will be called when a debug message is generated.
	 *
	 * @param source    the message source
	 * @param type      the message type
	 * @param id        the message ID
	 * @param severity  the message severity
	 * @param length    the message length, excluding the null-terminator
	 * @param message   a pointer to the message string representation
	 * @param userParam the user-specified value that was passed when calling {@link ARBDebugOutput#glDebugMessageCallbackARB}
	 */
	public abstract void invoke(int source, int type, int id, int severity, int length, long message, long userParam);

	/** A functional interface for {@link GLDebugMessageARBCallback}. */
	public interface SAM {
		void invoke(int source, int type, int id, int severity, int length, long message, long userParam);
	}

}