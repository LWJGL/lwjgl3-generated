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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetJoystickCallback SetJoystickCallback} method. */
@FunctionalInterface
public interface GLFWJoystickCallback extends Callback.V {

	/** Creates a {@code GLFWJoystickCallback} instance from the specified function pointer. */
	static GLFWJoystickCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWJoystickCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWJoystickCallback} instance that delegates to the specified {@code GLFWJoystickCallback} instance. */
	static GLFWJoystickCallback create(GLFWJoystickCallback sam) {
		return new GLFWJoystickCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(ii)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a joystick is connected to or disconnected from the system.
	 *
	 * @param joy   the joystick that was connected or disconnected
	 * @param event one of {@link GLFW#GLFW_CONNECTED CONNECTED} or {@link GLFW#GLFW_DISCONNECTED DISCONNECTED}
	 */
	void invoke(int joy, int event);

	/** See {@link GLFW#glfwSetJoystickCallback SetJoystickCallback}. */
	default GLFWJoystickCallback set() {
		glfwSetJoystickCallback(this);
		return this;
	}

}

final class GLFWJoystickCallbackHandle extends Pointer.Default implements GLFWJoystickCallback {

	private final GLFWJoystickCallback delegate;

	GLFWJoystickCallbackHandle(long functionPointer, GLFWJoystickCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(int joy, int event) {
		delegate.invoke(joy, event);
	}

}