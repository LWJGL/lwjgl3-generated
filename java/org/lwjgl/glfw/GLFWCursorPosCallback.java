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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback} method. */
@FunctionalInterface
public interface GLFWCursorPosCallback extends Callback.V {

	/** Creates a {@code GLFWCursorPosCallback} instance from the specified function pointer. */
	static GLFWCursorPosCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWCursorPosCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWCursorPosCallback} instance that delegates to the specified {@code GLFWCursorPosCallback} instance. */
	static GLFWCursorPosCallback create(GLFWCursorPosCallback sam) {
		return new GLFWCursorPosCallbackHandle(sam.address(), sam);
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
	 * Will be called when the cursor is moved.
	 * 
	 * <p>The callback function receives the cursor position, measured in screen coordinates but relative to the top-left corner of the window client area. On
	 * platforms that provide it, the full sub-pixel cursor position is passed on.</p>
	 *
	 * @param window the window that received the event
	 * @param xpos   the new cursor x-coordinate, relative to the left edge of the client area
	 * @param ypos   the new cursor y-coordinate, relative to the top edge of the client area
	 */
	void invoke(long window, double xpos, double ypos);

	/** See {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback}. */
	default GLFWCursorPosCallback set(long window) {
		glfwSetCursorPosCallback(window, this);
		return this;
	}

}

final class GLFWCursorPosCallbackHandle extends Pointer.Default implements GLFWCursorPosCallback {

	private final GLFWCursorPosCallback delegate;

	GLFWCursorPosCallbackHandle(long functionPointer, GLFWCursorPosCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, double xpos, double ypos) {
		delegate.invoke(window, xpos, ypos);
	}

}