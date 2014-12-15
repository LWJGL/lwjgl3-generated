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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowRefreshCallback} method. */
public abstract class GLFWWindowRefreshCallback extends Closure.Void {

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(1);

	static {
		ARGS.put(0, ffi_type_pointer);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_void, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare GLFWWindowRefreshCallback callback interface. Status: 0x%X", status));
	}

	protected GLFWWindowRefreshCallback() {
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
	 * Will be called when the client area of the specified window needs to be redrawn, for example if the window has been exposed after having been covered by
	 * another window.
	 *
	 * @param window the window whose content needs to be refreshed
	 */
	public abstract void invoke(long window);

	/** A functional interface for {@link GLFWWindowRefreshCallback}. */
	public interface SAM {
		void invoke(long window);
	}

}