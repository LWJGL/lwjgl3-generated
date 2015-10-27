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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetScrollCallback} method. */
public abstract class GLFWScrollCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(3);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWScrollCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_double, ffi_type_double
		);
	}

	protected GLFWScrollCallback() {
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
	 * Will be called when a scrolling device is used, such as a mouse wheel or scrolling area of a touchpad.
	 *
	 * @param window  the window that received the event
	 * @param xoffset the scroll offset along the x-axis
	 * @param yoffset the scroll offset along the y-axis
	 */
	public abstract void invoke(long window, double xoffset, double yoffset);

	/** A functional interface for {@link GLFWScrollCallback}. */
	public interface SAM {
		void invoke(long window, double xoffset, double yoffset);
	}

	/**
	 * Creates a {@link GLFWScrollCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWScrollCallback} instance
	 */
	public static GLFWScrollCallback create(final SAM sam) {
		return new GLFWScrollCallback() {
			@Override
			public void invoke(long window, double xoffset, double yoffset) {
				sam.invoke(window, xoffset, yoffset);
			}
		};
	}

	/** See {@link GLFW#glfwSetScrollCallback SetScrollCallback}. */
	public GLFWScrollCallback set(long window) {
		glfwSetScrollCallback(window, this);
		return this;
	}
	
}