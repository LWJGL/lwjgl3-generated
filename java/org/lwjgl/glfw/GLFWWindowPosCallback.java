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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowPosCallback SetWindowPosCallback} method. */
@FunctionalInterface
public interface GLFWWindowPosCallback extends Callback.V {

	/** Creates a {@code GLFWWindowPosCallback} instance from the specified function pointer. */
	static GLFWWindowPosCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWWindowPosCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWWindowPosCallback} instance that delegates to the specified {@code GLFWWindowPosCallback} instance. */
	static GLFWWindowPosCallback create(GLFWWindowPosCallback sam) {
		return new GLFWWindowPosCallbackHandle(sam.address(), sam);
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
	 * Will be called when the specified window moves.
	 *
	 * @param window the window that was moved
	 * @param xpos   the new x-coordinate, in pixels, of the upper-left corner of the client area of the window
	 * @param ypos   the new y-coordinate, in pixels, of the upper-left corner of the client area of the window
	 */
	void invoke(long window, int xpos, int ypos);

	/** See {@link GLFW#glfwSetWindowPosCallback SetWindowPosCallback}. */
	default GLFWWindowPosCallback set(long window) {
		glfwSetWindowPosCallback(window, this);
		return this;
	}

}

final class GLFWWindowPosCallbackHandle extends Pointer.Default implements GLFWWindowPosCallback {

	private final GLFWWindowPosCallback delegate;

	GLFWWindowPosCallbackHandle(long functionPointer, GLFWWindowPosCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, int xpos, int ypos) {
		delegate.invoke(window, xpos, ypos);
	}

}