/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback} method. */
public abstract class GLFWCursorPosCallback extends Callback implements GLFWCursorPosCallbackI {

	/** Creates a {@code GLFWCursorPosCallback} instance from the specified function pointer. */
	public static GLFWCursorPosCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWCursorPosCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWCursorPosCallback
			? (GLFWCursorPosCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWCursorPosCallback} instance that delegates to the specified {@code GLFWCursorPosCallbackI} instance. */
	public static GLFWCursorPosCallback create(GLFWCursorPosCallbackI instance) {
		return instance instanceof GLFWCursorPosCallback
			? (GLFWCursorPosCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWCursorPosCallback() {
		super(NULL);
		address = GLFWCursorPosCallbackI.super.address();
	}

	private GLFWCursorPosCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback}. */
	public GLFWCursorPosCallback set(long window) {
		glfwSetCursorPosCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWCursorPosCallback {

		private final GLFWCursorPosCallbackI delegate;

		Container(long functionPointer, GLFWCursorPosCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, double xpos, double ypos) {
			delegate.invoke(window, xpos, ypos);
		}

	}

}