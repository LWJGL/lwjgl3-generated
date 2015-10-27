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

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowIconifyCallback} method. */
public abstract class GLFWWindowIconifyCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(2);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWWindowIconifyCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_sint32
		);
	}

	protected GLFWWindowIconifyCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args))
		);
	}

	/**
	 * Will be called when the specified window is iconified or restored.
	 *
	 * @param window    the window that was iconified or restored.
	 * @param iconified {@link GL11#GL_TRUE} if the window was iconified, or {@link GL11#GL_FALSE} if it was restored
	 */
	public abstract void invoke(long window, int iconified);

	/** A functional interface for {@link GLFWWindowIconifyCallback}. */
	public interface SAM {
		void invoke(long window, int iconified);
	}

	/**
	 * Creates a {@link GLFWWindowIconifyCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWWindowIconifyCallback} instance
	 */
	public static GLFWWindowIconifyCallback create(final SAM sam) {
		return new GLFWWindowIconifyCallback() {
			@Override
			public void invoke(long window, int iconified) {
				sam.invoke(window, iconified);
			}
		};
	}

	/** See {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback}. */
	public GLFWWindowIconifyCallback set(long window) {
		glfwSetWindowIconifyCallback(window, this);
		return this;
	}
	
}