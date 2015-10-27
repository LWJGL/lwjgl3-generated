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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCursorPosCallback} method. */
public abstract class GLFWCursorPosCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(3);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWCursorPosCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_double, ffi_type_double
		);
	}

	protected GLFWCursorPosCallback() {
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
			memGetDouble(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetDouble(memGetAddress(POINTER_SIZE * 2 + args))
		);
	}

	/**
	 * Will be called when the cursor is moved.
	 *
	 * @param window the window that received the event
	 * @param xpos   the new x-coordinate, in screen coordinates of the cursor
	 * @param ypos   the new y-coordinate, in screen coordinates of the cursor
	 */
	public abstract void invoke(long window, double xpos, double ypos);

	/** A functional interface for {@link GLFWCursorPosCallback}. */
	public interface SAM {
		void invoke(long window, double xpos, double ypos);
	}

	/**
	 * Creates a {@link GLFWCursorPosCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWCursorPosCallback} instance
	 */
	public static GLFWCursorPosCallback create(final SAM sam) {
		return new GLFWCursorPosCallback() {
			@Override
			public void invoke(long window, double xpos, double ypos) {
				sam.invoke(window, xpos, ypos);
			}
		};
	}

	/** See {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback}. */
	public GLFWCursorPosCallback set(long window) {
		glfwSetCursorPosCallback(window, this);
		return this;
	}
	
}