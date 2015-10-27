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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetKeyCallback} method. */
public abstract class GLFWKeyCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(5);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWKeyCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_sint32, ffi_type_sint32, ffi_type_sint32, ffi_type_sint32
		);
	}

	protected GLFWKeyCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 3 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 4 + args))
		);
	}

	/**
	 * Will be called when a key is pressed, repeated or released.
	 *
	 * @param window   the window that received the event
	 * @param key      the keyboard key that was pressed or released
	 * @param scancode the system-specific scancode of the key
	 * @param action   the key action. One of:<br>{@link GLFW#GLFW_PRESS}, {@link GLFW#GLFW_RELEASE}, {@link GLFW#GLFW_REPEAT}
	 * @param mods     bitfield describing which modifiers keys were held down
	 */
	public abstract void invoke(long window, int key, int scancode, int action, int mods);

	/** A functional interface for {@link GLFWKeyCallback}. */
	public interface SAM {
		void invoke(long window, int key, int scancode, int action, int mods);
	}

	/**
	 * Creates a {@link GLFWKeyCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWKeyCallback} instance
	 */
	public static GLFWKeyCallback create(final SAM sam) {
		return new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				sam.invoke(window, key, scancode, action, mods);
			}
		};
	}

	/** See {@link GLFW#glfwSetKeyCallback SetKeyCallback}. */
	public GLFWKeyCallback set(long window) {
		glfwSetKeyCallback(window, this);
		return this;
	}
	
}