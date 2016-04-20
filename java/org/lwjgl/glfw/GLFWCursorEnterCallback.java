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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback} method. */
@FunctionalInterface
public interface GLFWCursorEnterCallback extends Callback.V {

	/** Creates a {@code GLFWCursorEnterCallback} instance from the specified function pointer. */
	static GLFWCursorEnterCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWCursorEnterCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWCursorEnterCallback} instance that delegates to the specified {@code GLFWCursorEnterCallback} instance. */
	static GLFWCursorEnterCallback create(GLFWCursorEnterCallback sam) {
		return new GLFWCursorEnterCallbackHandle(sam.address(), sam);
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
	 * Will be called when the cursor enters or leaves the client area of the window.
	 *
	 * @param window  the window that received the event
	 * @param entered {@link GL11#GL_TRUE} if the cursor entered the window's client area, or {@link GL11#GL_FALSE} if it left it
	 */
	void invoke(long window, boolean entered);

	/** See {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback}. */
	default GLFWCursorEnterCallback set(long window) {
		glfwSetCursorEnterCallback(window, this);
		return this;
	}

}

final class GLFWCursorEnterCallbackHandle extends Pointer.Default implements GLFWCursorEnterCallback {

	private final GLFWCursorEnterCallback delegate;

	GLFWCursorEnterCallbackHandle(long functionPointer, GLFWCursorEnterCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, boolean entered) {
		delegate.invoke(window, entered);
	}

}