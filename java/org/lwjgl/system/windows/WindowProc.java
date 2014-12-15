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

/** An application-defined function that processes messages sent to a window. */
public abstract class WindowProc extends Closure.Ptr {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(4);

	static {
		ARGS.put(0, ffi_type_pointer);
		ARGS.put(1, ffi_type_uint32);
		ARGS.put(2, ffi_type_pointer);
		ARGS.put(3, ffi_type_pointer);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_SYSTEM, ffi_type_pointer, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare WindowProc callback interface. Status: 0x%X", status));
	}

	protected WindowProc() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 3 + args))
		);
	}
	/**
	 * Will be called for each message sent to the window.
	 *
	 * @param hwnd   a handle to the window procedure that received the message
	 * @param uMsg   the message
	 * @param wParam additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter.
	 * @param lParam additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter.
	 */
	public abstract long invoke(long hwnd, int uMsg, long wParam, long lParam);

	/** A functional interface for {@link WindowProc}. */
	public interface SAM {
		long invoke(long hwnd, int uMsg, long wParam, long lParam);
	}

}