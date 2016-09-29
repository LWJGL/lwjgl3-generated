/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetWindowMaximizeCallback SetWindowMaximizeCallback} method. */
public abstract class GLFWWindowMaximizeCallback extends Callback implements GLFWWindowMaximizeCallbackI {

	/** Creates a {@code GLFWWindowMaximizeCallback} instance from the specified function pointer. */
	public static GLFWWindowMaximizeCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWWindowMaximizeCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWWindowMaximizeCallback
			? (GLFWWindowMaximizeCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWWindowMaximizeCallback} instance that delegates to the specified {@code GLFWWindowMaximizeCallbackI} instance. */
	public static GLFWWindowMaximizeCallback create(GLFWWindowMaximizeCallbackI instance) {
		return instance instanceof GLFWWindowMaximizeCallback
			? (GLFWWindowMaximizeCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWWindowMaximizeCallback() {
		super(SIGNATURE);
	}

	private GLFWWindowMaximizeCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetWindowMaximizeCallback SetWindowMaximizeCallback}. */
	public GLFWWindowMaximizeCallback set(long window) {
		glfwSetWindowMaximizeCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWWindowMaximizeCallback {

		private final GLFWWindowMaximizeCallbackI delegate;

		Container(long functionPointer, GLFWWindowMaximizeCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, boolean maximized) {
			delegate.invoke(window, maximized);
		}

	}

}