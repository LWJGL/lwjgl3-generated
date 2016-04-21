/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback} method. */
public abstract class GLFWWindowSizeCallback extends Callback implements GLFWWindowSizeCallbackI {

	/** Creates a {@code GLFWWindowSizeCallback} instance from the specified function pointer. */
	public static GLFWWindowSizeCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWWindowSizeCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWWindowSizeCallback
			? (GLFWWindowSizeCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWWindowSizeCallback} instance that delegates to the specified {@code GLFWWindowSizeCallbackI} instance. */
	public static GLFWWindowSizeCallback create(GLFWWindowSizeCallbackI instance) {
		return instance instanceof GLFWWindowSizeCallback
			? (GLFWWindowSizeCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWWindowSizeCallback() {
		super(NULL);
		address = GLFWWindowSizeCallbackI.super.address();
	}

	private GLFWWindowSizeCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback}. */
	public GLFWWindowSizeCallback set(long window) {
		glfwSetWindowSizeCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWWindowSizeCallback {

		private final GLFWWindowSizeCallbackI delegate;

		Container(long functionPointer, GLFWWindowSizeCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, int width, int height) {
			delegate.invoke(window, width, height);
		}

	}

}