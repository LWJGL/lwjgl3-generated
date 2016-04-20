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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback} method. */
@FunctionalInterface
public interface GLFWFramebufferSizeCallback extends Callback.V {

	/** Creates a {@code GLFWFramebufferSizeCallback} instance from the specified function pointer. */
	static GLFWFramebufferSizeCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWFramebufferSizeCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWFramebufferSizeCallback} instance that delegates to the specified {@code GLFWFramebufferSizeCallback} instance. */
	static GLFWFramebufferSizeCallback create(GLFWFramebufferSizeCallback sam) {
		return new GLFWFramebufferSizeCallbackHandle(sam.address(), sam);
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
	 * Will be called when the framebuffer of the specified window is resized.
	 *
	 * @param window the window whose framebuffer was resized
	 * @param width  the new width, in pixels, of the framebuffer
	 * @param height the new height, in pixels, of the framebuffer
	 */
	void invoke(long window, int width, int height);

	/** See {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback}. */
	default GLFWFramebufferSizeCallback set(long window) {
		glfwSetFramebufferSizeCallback(window, this);
		return this;
	}

}

final class GLFWFramebufferSizeCallbackHandle extends Pointer.Default implements GLFWFramebufferSizeCallback {

	private final GLFWFramebufferSizeCallback delegate;

	GLFWFramebufferSizeCallbackHandle(long functionPointer, GLFWFramebufferSizeCallback delegate) {
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