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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowFocusCallback} method. */
public abstract class GLFWWindowFocusCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(2);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWWindowFocusCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_sint32
		);
	}

	protected GLFWWindowFocusCallback() {
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
	 * Will be called when the specified window gains or loses focus.
	 *
	 * @param window  the window that was focused or defocused
	 * @param focused {@link GL11#GL_TRUE} if the window was focused, or {@link GL11#GL_FALSE} if it was defocused
	 */
	public abstract void invoke(long window, int focused);

	/** A functional interface for {@link GLFWWindowFocusCallback}. */
	public interface SAM {
		void invoke(long window, int focused);
	}

	/**
	 * Creates a {@link GLFWWindowFocusCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWWindowFocusCallback} instance
	 */
	public static GLFWWindowFocusCallback create(final SAM sam) {
		return new GLFWWindowFocusCallback() {
			@Override
			public void invoke(long window, int focused) {
				sam.invoke(window, focused);
			}
		};
	}

	/** See {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback}. */
	public GLFWWindowFocusCallback set(long window) {
		glfwSetWindowFocusCallback(window, this);
		return this;
	}
	
}