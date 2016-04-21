/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetWindowCloseCallback SetWindowCloseCallback} method. */
public abstract class GLFWWindowCloseCallback extends Callback implements GLFWWindowCloseCallbackI {

	/** Creates a {@code GLFWWindowCloseCallback} instance from the specified function pointer. */
	public static GLFWWindowCloseCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWWindowCloseCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWWindowCloseCallback
			? (GLFWWindowCloseCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWWindowCloseCallback} instance that delegates to the specified {@code GLFWWindowCloseCallbackI} instance. */
	public static GLFWWindowCloseCallback create(GLFWWindowCloseCallbackI instance) {
		return instance instanceof GLFWWindowCloseCallback
			? (GLFWWindowCloseCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWWindowCloseCallback() {
		super(NULL);
		address = GLFWWindowCloseCallbackI.super.address();
	}

	private GLFWWindowCloseCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetWindowCloseCallback SetWindowCloseCallback}. */
	public GLFWWindowCloseCallback set(long window) {
		glfwSetWindowCloseCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWWindowCloseCallback {

		private final GLFWWindowCloseCallbackI delegate;

		Container(long functionPointer, GLFWWindowCloseCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window) {
			delegate.invoke(window);
		}

	}

}