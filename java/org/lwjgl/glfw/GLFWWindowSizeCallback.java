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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback} method. */
@FunctionalInterface
public interface GLFWWindowSizeCallback extends Callback.V {

	/** Creates a {@code GLFWWindowSizeCallback} instance from the specified function pointer. */
	static GLFWWindowSizeCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWWindowSizeCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWWindowSizeCallback} instance that delegates to the specified {@code GLFWWindowSizeCallback} instance. */
	static GLFWWindowSizeCallback create(GLFWWindowSizeCallback sam) {
		return new GLFWWindowSizeCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pii)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when the specified window is resized.
	 *
	 * @param window the window that was resized
	 * @param width  the new width, in screen coordinates, of the window
	 * @param height the new height, in screen coordinates, of the window
	 */
	void invoke(long window, int width, int height);

	/** See {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback}. */
	default GLFWWindowSizeCallback set(long window) {
		glfwSetWindowSizeCallback(window, this);
		return this;
	}

}

final class GLFWWindowSizeCallbackHandle extends Pointer.Default implements GLFWWindowSizeCallback {

	private final GLFWWindowSizeCallback delegate;

	GLFWWindowSizeCallbackHandle(long functionPointer, GLFWWindowSizeCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, int width, int height) {
		delegate.invoke(window, width, height);
	}

}