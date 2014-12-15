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

import org.lwjgl.opengl.GL11;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCursorEnterCallback} method. */
public abstract class GLFWCursorEnterCallback extends Closure.Void {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(2);

	static {
		ARGS.put(0, ffi_type_pointer);
		ARGS.put(1, ffi_type_sint32);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_void, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare GLFWCursorEnterCallback callback interface. Status: 0x%X", status));
	}

	protected GLFWCursorEnterCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args))
		);
	}
	/**
	 * Will be called when the cursor enters or leaves the client area of the window.
	 *
	 * @param window  the window that received the event
	 * @param entered {@link GL11#GL_TRUE} if the cursor entered the window's client area, or {@link GL11#GL_FALSE} if it left it
	 */
	public abstract void invoke(long window, int entered);

	/** A functional interface for {@link GLFWCursorEnterCallback}. */
	public interface SAM {
		void invoke(long window, int entered);
	}

}