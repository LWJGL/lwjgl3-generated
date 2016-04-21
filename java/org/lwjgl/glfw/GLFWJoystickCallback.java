/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetJoystickCallback SetJoystickCallback} method. */
public abstract class GLFWJoystickCallback extends Callback implements GLFWJoystickCallbackI {

	/** Creates a {@code GLFWJoystickCallback} instance from the specified function pointer. */
	public static GLFWJoystickCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWJoystickCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWJoystickCallback
			? (GLFWJoystickCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWJoystickCallback} instance that delegates to the specified {@code GLFWJoystickCallbackI} instance. */
	public static GLFWJoystickCallback create(GLFWJoystickCallbackI instance) {
		return instance instanceof GLFWJoystickCallback
			? (GLFWJoystickCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWJoystickCallback() {
		super(NULL);
		address = GLFWJoystickCallbackI.super.address();
	}

	private GLFWJoystickCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetJoystickCallback SetJoystickCallback}. */
	public GLFWJoystickCallback set() {
		glfwSetJoystickCallback(this);
		return this;
	}

	private static final class Container extends GLFWJoystickCallback {

		private final GLFWJoystickCallbackI delegate;

		Container(long functionPointer, GLFWJoystickCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(int joy, int event) {
			delegate.invoke(joy, event);
		}

	}

}