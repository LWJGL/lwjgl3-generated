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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowCloseCallback SetWindowCloseCallback} method. */
@FunctionalInterface
public interface GLFWWindowCloseCallback extends Callback.V {

	/** Creates a {@code GLFWWindowCloseCallback} instance from the specified function pointer. */
	static GLFWWindowCloseCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWWindowCloseCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWWindowCloseCallback} instance that delegates to the specified {@code GLFWWindowCloseCallback} instance. */
	static GLFWWindowCloseCallback create(GLFWWindowCloseCallback sam) {
		return new GLFWWindowCloseCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(p)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when the user attempts to close the specified window, for example by clicking the close widget in the title bar.
	 *
	 * @param window the window that the user attempted to close
	 */
	void invoke(long window);

	/** See {@link GLFW#glfwSetWindowCloseCallback SetWindowCloseCallback}. */
	default GLFWWindowCloseCallback set(long window) {
		glfwSetWindowCloseCallback(window, this);
		return this;
	}

}

final class GLFWWindowCloseCallbackHandle extends Pointer.Default implements GLFWWindowCloseCallback {

	private final GLFWWindowCloseCallback delegate;

	GLFWWindowCloseCallbackHandle(long functionPointer, GLFWWindowCloseCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window) {
		delegate.invoke(window);
	}

}