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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetFramebufferSizeCallback} method. */
public abstract class GLFWFramebufferSizeCallback extends Closure.Void {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(3);

	static {
		ARGS.put(0, ffi_type_pointer);
		ARGS.put(1, ffi_type_sint32);
		ARGS.put(2, ffi_type_sint32);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_void, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare GLFWFramebufferSizeCallback callback interface. Status: 0x%X", status));
	}

	protected GLFWFramebufferSizeCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 2 + args))
		);
	}
	/**
	 * Will be called when the framebuffer of the specified window is resized.
	 *
	 * @param window the window whose framebuffer was resized
	 * @param width  the new width, in pixels, of the framebuffer
	 * @param height the new height, in pixels, of the framebuffer
	 */
	public abstract void invoke(long window, int width, int height);

	/** A functional interface for {@link GLFWFramebufferSizeCallback}. */
	public interface SAM {
		void invoke(long window, int width, int height);
	}

}