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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowCloseCallback} method. */
public abstract class GLFWWindowCloseCallback extends Closure.Void {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(1);

	static {
		ARGS.put(0, ffi_type_pointer);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_void, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare GLFWWindowCloseCallback callback interface. Status: 0x%X", status));
	}

	protected GLFWWindowCloseCallback() {
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
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args))
		);
	}
	/**
	 * Will be called when the user attempts to close the specified window, for example by clicking the close widget in the title bar.
	 *
	 * @param window the window that the user attempted to close
	 */
	public abstract void invoke(long window);

	/** A functional interface for {@link GLFWWindowCloseCallback}. */
	public interface SAM {
		void invoke(long window);
	}

}