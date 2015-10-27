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

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowSizeCallback} method. */
public abstract class GLFWWindowSizeCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(3);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWWindowSizeCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_sint32, ffi_type_sint32
		);
	}

	protected GLFWWindowSizeCallback() {
		super(CIF, CLASSPATH);
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
	 * Will be called when the specified window is resized.
	 *
	 * @param window the window that was resized
	 * @param width  the new width, in pixels, of the window
	 * @param height the new height, in pixels, of the window
	 */
	public abstract void invoke(long window, int width, int height);

	/** A functional interface for {@link GLFWWindowSizeCallback}. */
	public interface SAM {
		void invoke(long window, int width, int height);
	}

	/**
	 * Creates a {@link GLFWWindowSizeCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWWindowSizeCallback} instance
	 */
	public static GLFWWindowSizeCallback create(final SAM sam) {
		return new GLFWWindowSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				sam.invoke(window, width, height);
			}
		};
	}

	/** See {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback}. */
	public GLFWWindowSizeCallback set(long window) {
		glfwSetWindowSizeCallback(window, this);
		return this;
	}
	
}