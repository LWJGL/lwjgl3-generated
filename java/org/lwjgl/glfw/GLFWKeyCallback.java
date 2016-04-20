/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetKeyCallback SetKeyCallback} method. */
@FunctionalInterface
public interface GLFWKeyCallback extends Callback.V {

	/** Creates a {@code GLFWKeyCallback} instance from the specified function pointer. */
	static GLFWKeyCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWKeyCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWKeyCallback} instance that delegates to the specified {@code GLFWKeyCallback} instance. */
	static GLFWKeyCallback create(GLFWKeyCallback sam) {
		return new GLFWKeyCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(piiii)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a key is pressed, repeated or released.
	 *
	 * @param window   the window that received the event
	 * @param key      the keyboard key that was pressed or released
	 * @param scancode the system-specific scancode of the key
	 * @param action   the key action. One of:<br><table><tr><td>{@link GLFW#GLFW_PRESS PRESS}</td><td>{@link GLFW#GLFW_RELEASE RELEASE}</td><td>{@link GLFW#GLFW_REPEAT REPEAT}</td></tr></table>
	 * @param mods     bitfield describing which modifiers keys were held down
	 */
	void invoke(long window, int key, int scancode, int action, int mods);

	/** See {@link GLFW#glfwSetKeyCallback SetKeyCallback}. */
	default GLFWKeyCallback set(long window) {
		glfwSetKeyCallback(window, this);
		return this;
	}

}

final class GLFWKeyCallbackHandle extends Pointer.Default implements GLFWKeyCallback {

	private final GLFWKeyCallback delegate;

	GLFWKeyCallbackHandle(long functionPointer, GLFWKeyCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, int key, int scancode, int action, int mods) {
		delegate.invoke(window, key, scancode, action, mods);
	}

}