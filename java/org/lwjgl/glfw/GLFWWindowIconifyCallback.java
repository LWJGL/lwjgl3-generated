/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback} method. */
public abstract class GLFWWindowIconifyCallback extends Callback implements GLFWWindowIconifyCallbackI {

	/** Creates a {@code GLFWWindowIconifyCallback} instance from the specified function pointer. */
	public static GLFWWindowIconifyCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWWindowIconifyCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWWindowIconifyCallback
			? (GLFWWindowIconifyCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWWindowIconifyCallback} instance that delegates to the specified {@code GLFWWindowIconifyCallbackI} instance. */
	public static GLFWWindowIconifyCallback create(GLFWWindowIconifyCallbackI instance) {
		return instance instanceof GLFWWindowIconifyCallback
			? (GLFWWindowIconifyCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWWindowIconifyCallback() {
		super(NULL);
		address = GLFWWindowIconifyCallbackI.super.address();
	}

	private GLFWWindowIconifyCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback}. */
	public GLFWWindowIconifyCallback set(long window) {
		glfwSetWindowIconifyCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWWindowIconifyCallback {

		private final GLFWWindowIconifyCallbackI delegate;

		Container(long functionPointer, GLFWWindowIconifyCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, boolean iconified) {
			delegate.invoke(window, iconified);
		}

	}

}