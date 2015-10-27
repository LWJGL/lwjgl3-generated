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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCursorEnterCallback} method. */
public abstract class GLFWCursorEnterCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(2);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWCursorEnterCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_sint32
		);
	}

	protected GLFWCursorEnterCallback() {
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

	/**
	 * Creates a {@link GLFWCursorEnterCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWCursorEnterCallback} instance
	 */
	public static GLFWCursorEnterCallback create(final SAM sam) {
		return new GLFWCursorEnterCallback() {
			@Override
			public void invoke(long window, int entered) {
				sam.invoke(window, entered);
			}
		};
	}

	/** See {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback}. */
	public GLFWCursorEnterCallback set(long window) {
		glfwSetCursorEnterCallback(window, this);
		return this;
	}
	
}