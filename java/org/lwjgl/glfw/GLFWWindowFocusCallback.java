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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback} method. */
@FunctionalInterface
public interface GLFWWindowFocusCallback extends Callback.V {

	/** Creates a {@code GLFWWindowFocusCallback} instance from the specified function pointer. */
	static GLFWWindowFocusCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWWindowFocusCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWWindowFocusCallback} instance that delegates to the specified {@code GLFWWindowFocusCallback} instance. */
	static GLFWWindowFocusCallback create(GLFWWindowFocusCallback sam) {
		return new GLFWWindowFocusCallbackHandle(sam.address(), sam);
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
	 * Will be called when the specified window gains or loses focus.
	 *
	 * @param window  the window that was focused or defocused
	 * @param focused {@link GL11#GL_TRUE} if the window was focused, or {@link GL11#GL_FALSE} if it was defocused
	 */
	void invoke(long window, boolean focused);

	/** See {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback}. */
	default GLFWWindowFocusCallback set(long window) {
		glfwSetWindowFocusCallback(window, this);
		return this;
	}

}

final class GLFWWindowFocusCallbackHandle extends Pointer.Default implements GLFWWindowFocusCallback {

	private final GLFWWindowFocusCallback delegate;

	GLFWWindowFocusCallbackHandle(long functionPointer, GLFWWindowFocusCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, boolean focused) {
		delegate.invoke(window, focused);
	}

}