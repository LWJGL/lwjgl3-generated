/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback} method. */
public abstract class GLFWWindowFocusCallback extends Callback implements GLFWWindowFocusCallbackI {

	/** Creates a {@code GLFWWindowFocusCallback} instance from the specified function pointer. */
	public static GLFWWindowFocusCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWWindowFocusCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWWindowFocusCallback
			? (GLFWWindowFocusCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWWindowFocusCallback} instance that delegates to the specified {@code GLFWWindowFocusCallbackI} instance. */
	public static GLFWWindowFocusCallback create(GLFWWindowFocusCallbackI instance) {
		return instance instanceof GLFWWindowFocusCallback
			? (GLFWWindowFocusCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWWindowFocusCallback() {
		super(NULL);
		address = GLFWWindowFocusCallbackI.super.address();
	}

	private GLFWWindowFocusCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback}. */
	public GLFWWindowFocusCallback set(long window) {
		glfwSetWindowFocusCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWWindowFocusCallback {

		private final GLFWWindowFocusCallbackI delegate;

		Container(long functionPointer, GLFWWindowFocusCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, boolean focused) {
			delegate.invoke(window, focused);
		}

	}

}