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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCharCallback SetCharCallback} method. */
@FunctionalInterface
public interface GLFWCharCallback extends Callback.V {

	/** Creates a {@code GLFWCharCallback} instance from the specified function pointer. */
	static GLFWCharCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWCharCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWCharCallback} instance that delegates to the specified {@code GLFWCharCallback} instance. */
	static GLFWCharCallback create(GLFWCharCallback sam) {
		return new GLFWCharCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pi)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a Unicode character is input.
	 *
	 * @param window    the window that received the event
	 * @param codepoint the Unicode code point of the character
	 */
	void invoke(long window, int codepoint);

	/** See {@link GLFW#glfwSetCharCallback SetCharCallback}. */
	default GLFWCharCallback set(long window) {
		glfwSetCharCallback(window, this);
		return this;
	}

}

final class GLFWCharCallbackHandle extends Pointer.Default implements GLFWCharCallback {

	private final GLFWCharCallback delegate;

	GLFWCharCallbackHandle(long functionPointer, GLFWCharCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, int codepoint) {
		delegate.invoke(window, codepoint);
	}

}