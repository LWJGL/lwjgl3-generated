/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import org.lwjgl.opengl.GL11;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback} method. */
@FunctionalInterface
public interface GLFWWindowIconifyCallback extends Callback.V {

	/** Creates a {@code GLFWWindowIconifyCallback} instance from the specified function pointer. */
	static GLFWWindowIconifyCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWWindowIconifyCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWWindowIconifyCallback} instance that delegates to the specified {@code GLFWWindowIconifyCallback} instance. */
	static GLFWWindowIconifyCallback create(GLFWWindowIconifyCallback sam) {
		return new GLFWWindowIconifyCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pi)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args) != 0
		);
	}

	/**
	 * Will be called when the specified window is iconified or restored.
	 *
	 * @param window    the window that was iconified or restored.
	 * @param iconified {@link GL11#GL_TRUE} if the window was iconified, or {@link GL11#GL_FALSE} if it was restored
	 */
	void invoke(long window, boolean iconified);

	/** See {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback}. */
	default GLFWWindowIconifyCallback set(long window) {
		glfwSetWindowIconifyCallback(window, this);
		return this;
	}

}

final class GLFWWindowIconifyCallbackHandle extends Pointer.Default implements GLFWWindowIconifyCallback {

	private final GLFWWindowIconifyCallback delegate;

	GLFWWindowIconifyCallbackHandle(long functionPointer, GLFWWindowIconifyCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, boolean iconified) {
		delegate.invoke(window, iconified);
	}

}