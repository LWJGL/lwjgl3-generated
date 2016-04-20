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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetMouseButtonCallback SetMouseButtonCallback} method. */
@FunctionalInterface
public interface GLFWMouseButtonCallback extends Callback.V {

	/** Creates a {@code GLFWMouseButtonCallback} instance from the specified function pointer. */
	static GLFWMouseButtonCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWMouseButtonCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWMouseButtonCallback} instance that delegates to the specified {@code GLFWMouseButtonCallback} instance. */
	static GLFWMouseButtonCallback create(GLFWMouseButtonCallback sam) {
		return new GLFWMouseButtonCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(piii)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a mouse button is pressed or released.
	 *
	 * @param window the window that received the event
	 * @param button the mouse button that was pressed or released
	 * @param action the button action. One of:<br><table><tr><td>{@link GLFW#GLFW_PRESS PRESS}</td><td>{@link GLFW#GLFW_RELEASE RELEASE}</td><td>{@link GLFW#GLFW_REPEAT REPEAT}</td></tr></table>
	 * @param mods   bitfield describing which modifiers keys were held down
	 */
	void invoke(long window, int button, int action, int mods);

	/** See {@link GLFW#glfwSetMouseButtonCallback SetMouseButtonCallback}. */
	default GLFWMouseButtonCallback set(long window) {
		glfwSetMouseButtonCallback(window, this);
		return this;
	}

}

final class GLFWMouseButtonCallbackHandle extends Pointer.Default implements GLFWMouseButtonCallback {

	private final GLFWMouseButtonCallback delegate;

	GLFWMouseButtonCallbackHandle(long functionPointer, GLFWMouseButtonCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, int button, int action, int mods) {
		delegate.invoke(window, button, action, mods);
	}

}