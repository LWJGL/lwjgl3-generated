/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetCharCallback SetCharCallback} method. */
public abstract class GLFWCharCallback extends Callback implements GLFWCharCallbackI {

	/** Creates a {@code GLFWCharCallback} instance from the specified function pointer. */
	public static GLFWCharCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWCharCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWCharCallback
			? (GLFWCharCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWCharCallback} instance that delegates to the specified {@code GLFWCharCallbackI} instance. */
	public static GLFWCharCallback create(GLFWCharCallbackI instance) {
		return instance instanceof GLFWCharCallback
			? (GLFWCharCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWCharCallback() {
		super(NULL);
		address = GLFWCharCallbackI.super.address();
	}

	private GLFWCharCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetCharCallback SetCharCallback}. */
	public GLFWCharCallback set(long window) {
		glfwSetCharCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWCharCallback {

		private final GLFWCharCallbackI delegate;

		Container(long functionPointer, GLFWCharCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, int codepoint) {
			delegate.invoke(window, codepoint);
		}

	}

}