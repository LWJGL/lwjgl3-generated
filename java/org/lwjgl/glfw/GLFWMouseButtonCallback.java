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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetMouseButtonCallback} method. */
public abstract class GLFWMouseButtonCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(4);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWMouseButtonCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_sint32, ffi_type_sint32, ffi_type_sint32
		);
	}

	protected GLFWMouseButtonCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 3 + args))
		);
	}

	/**
	 * Will be called when a mouse button is pressed or released.
	 *
	 * @param window the window that received the event
	 * @param button the mouse button that was pressed or released
	 * @param action the button action. One of:<br>{@link GLFW#GLFW_PRESS}, {@link GLFW#GLFW_RELEASE}, {@link GLFW#GLFW_REPEAT}
	 * @param mods   bitfield describing which modifiers keys were held down
	 */
	public abstract void invoke(long window, int button, int action, int mods);

	/** A functional interface for {@link GLFWMouseButtonCallback}. */
	public interface SAM {
		void invoke(long window, int button, int action, int mods);
	}

	/**
	 * Creates a {@link GLFWMouseButtonCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWMouseButtonCallback} instance
	 */
	public static GLFWMouseButtonCallback create(final SAM sam) {
		return new GLFWMouseButtonCallback() {
			@Override
			public void invoke(long window, int button, int action, int mods) {
				sam.invoke(window, button, action, mods);
			}
		};
	}

	/** See {@link GLFW#glfwSetMouseButtonCallback SetMouseButtonCallback}. */
	public GLFWMouseButtonCallback set(long window) {
		glfwSetMouseButtonCallback(window, this);
		return this;
	}
	
}