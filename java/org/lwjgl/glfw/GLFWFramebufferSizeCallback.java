/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback} method. */
public abstract class GLFWFramebufferSizeCallback extends Callback implements GLFWFramebufferSizeCallbackI {

	/** Creates a {@code GLFWFramebufferSizeCallback} instance from the specified function pointer. */
	public static GLFWFramebufferSizeCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWFramebufferSizeCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWFramebufferSizeCallback
			? (GLFWFramebufferSizeCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWFramebufferSizeCallback} instance that delegates to the specified {@code GLFWFramebufferSizeCallbackI} instance. */
	public static GLFWFramebufferSizeCallback create(GLFWFramebufferSizeCallbackI instance) {
		return instance instanceof GLFWFramebufferSizeCallback
			? (GLFWFramebufferSizeCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWFramebufferSizeCallback() {
		super(NULL);
		address = GLFWFramebufferSizeCallbackI.super.address();
	}

	private GLFWFramebufferSizeCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback}. */
	public GLFWFramebufferSizeCallback set(long window) {
		glfwSetFramebufferSizeCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWFramebufferSizeCallback {

		private final GLFWFramebufferSizeCallbackI delegate;

		Container(long functionPointer, GLFWFramebufferSizeCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, int width, int height) {
			delegate.invoke(window, width, height);
		}

	}

}