/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback} method. */
public abstract class GLFWCursorEnterCallback extends Callback implements GLFWCursorEnterCallbackI {

	/** Creates a {@code GLFWCursorEnterCallback} instance from the specified function pointer. */
	public static GLFWCursorEnterCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWCursorEnterCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWCursorEnterCallback
			? (GLFWCursorEnterCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWCursorEnterCallback} instance that delegates to the specified {@code GLFWCursorEnterCallbackI} instance. */
	public static GLFWCursorEnterCallback create(GLFWCursorEnterCallbackI instance) {
		return instance instanceof GLFWCursorEnterCallback
			? (GLFWCursorEnterCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWCursorEnterCallback() {
		super(NULL);
		address = GLFWCursorEnterCallbackI.super.address();
	}

	private GLFWCursorEnterCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback}. */
	public GLFWCursorEnterCallback set(long window) {
		glfwSetCursorEnterCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWCursorEnterCallback {

		private final GLFWCursorEnterCallbackI delegate;

		Container(long functionPointer, GLFWCursorEnterCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, boolean entered) {
			delegate.invoke(window, entered);
		}

	}

}