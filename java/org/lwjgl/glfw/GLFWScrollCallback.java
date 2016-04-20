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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetScrollCallback SetScrollCallback} method. */
@FunctionalInterface
public interface GLFWScrollCallback extends Callback.V {

	/** Creates a {@code GLFWScrollCallback} instance from the specified function pointer. */
	static GLFWScrollCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWScrollCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWScrollCallback} instance that delegates to the specified {@code GLFWScrollCallback} instance. */
	static GLFWScrollCallback create(GLFWScrollCallback sam) {
		return new GLFWScrollCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pdd)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgDouble(args),
			dcbArgDouble(args)
		);
	}

	/**
	 * Will be called when a scrolling device is used, such as a mouse wheel or scrolling area of a touchpad.
	 *
	 * @param window  the window that received the event
	 * @param xoffset the scroll offset along the x-axis
	 * @param yoffset the scroll offset along the y-axis
	 */
	void invoke(long window, double xoffset, double yoffset);

	/** See {@link GLFW#glfwSetScrollCallback SetScrollCallback}. */
	default GLFWScrollCallback set(long window) {
		glfwSetScrollCallback(window, this);
		return this;
	}

}

final class GLFWScrollCallbackHandle extends Pointer.Default implements GLFWScrollCallback {

	private final GLFWScrollCallback delegate;

	GLFWScrollCallbackHandle(long functionPointer, GLFWScrollCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, double xoffset, double yoffset) {
		delegate.invoke(window, xoffset, yoffset);
	}

}