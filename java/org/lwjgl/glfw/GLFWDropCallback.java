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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetDropCallback} method. */
public abstract class GLFWDropCallback extends Closure.Void {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(3);

	static {
		ARGS.put(0, ffi_type_pointer);
		ARGS.put(1, ffi_type_sint32);
		ARGS.put(2, ffi_type_pointer);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_void, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare GLFWDropCallback callback interface. Status: 0x%X", status));
	}

	protected GLFWDropCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 2 + args))
		);
	}
	/**
	 * Will be called when one or more dragged files are dropped on the window.
	 *
	 * @param window the window that received the event
	 * @param count  the number of dropped files
	 * @param names  pointer to the array of UTF-8 encoded path names of the dropped files
	 */
	public abstract void invoke(long window, int count, long names);

	/** A functional interface for {@link GLFWDropCallback}. */
	public interface SAM {
		void invoke(long window, int count, long names);
	}

}