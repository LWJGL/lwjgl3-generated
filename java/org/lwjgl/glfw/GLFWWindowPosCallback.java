/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetWindowPosCallback SetWindowPosCallback} method. */
public abstract class GLFWWindowPosCallback extends Callback implements GLFWWindowPosCallbackI {

	/** Creates a {@code GLFWWindowPosCallback} instance from the specified function pointer. */
	public static GLFWWindowPosCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWWindowPosCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWWindowPosCallback
			? (GLFWWindowPosCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWWindowPosCallback} instance that delegates to the specified {@code GLFWWindowPosCallbackI} instance. */
	public static GLFWWindowPosCallback create(GLFWWindowPosCallbackI instance) {
		return instance instanceof GLFWWindowPosCallback
			? (GLFWWindowPosCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWWindowPosCallback() {
		super(NULL);
		address = GLFWWindowPosCallbackI.super.address();
	}

	private GLFWWindowPosCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetWindowPosCallback SetWindowPosCallback}. */
	public GLFWWindowPosCallback set(long window) {
		glfwSetWindowPosCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWWindowPosCallback {

		private final GLFWWindowPosCallbackI delegate;

		Container(long functionPointer, GLFWWindowPosCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, int xpos, int ypos) {
			delegate.invoke(window, xpos, ypos);
		}

	}

}