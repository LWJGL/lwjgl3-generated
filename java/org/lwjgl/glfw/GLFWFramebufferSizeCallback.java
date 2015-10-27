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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetFramebufferSizeCallback} method. */
public abstract class GLFWFramebufferSizeCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(3);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWFramebufferSizeCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_sint32, ffi_type_sint32
		);
	}

	protected GLFWFramebufferSizeCallback() {
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

	/**
	 * Creates a {@link GLFWFramebufferSizeCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWFramebufferSizeCallback} instance
	 */
	public static GLFWFramebufferSizeCallback create(final SAM sam) {
		return new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				sam.invoke(window, width, height);
			}
		};
	}

	/** See {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback}. */
	public GLFWFramebufferSizeCallback set(long window) {
		glfwSetFramebufferSizeCallback(window, this);
		return this;
	}
	
}