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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetMonitorCallback} method. */
public abstract class GLFWMonitorCallback extends Closure.Void {

	private static final ByteBuffer    CIF  = memAlloc(FFICIF.SIZEOF);
	private static final PointerBuffer ARGS = memAllocPointer(2);

	static {
		ARGS.put(0, ffi_type_pointer);
		ARGS.put(1, ffi_type_sint32);

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_DEFAULT, ffi_type_void, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare GLFWMonitorCallback callback interface. Status: 0x%X", status));
	}

	protected GLFWMonitorCallback() {
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
	 * Will be called when a monitor is connected to or disconnected from the system.
	 *
	 * @param monitor the monitor that was connected or disconnected
	 * @param event   one of {@link GLFW#GLFW_CONNECTED} or {@link GLFW#GLFW_DISCONNECTED}
	 */
	public abstract void invoke(long monitor, int event);

	/** A functional interface for {@link GLFWMonitorCallback}. */
	public interface SAM {
		void invoke(long monitor, int event);
	}

}