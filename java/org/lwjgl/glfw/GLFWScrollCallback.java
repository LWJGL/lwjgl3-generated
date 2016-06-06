/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetScrollCallback SetScrollCallback} method. */
public abstract class GLFWScrollCallback extends Callback implements GLFWScrollCallbackI {

	/** Creates a {@code GLFWScrollCallback} instance from the specified function pointer. */
	public static GLFWScrollCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWScrollCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWScrollCallback
			? (GLFWScrollCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWScrollCallback} instance that delegates to the specified {@code GLFWScrollCallbackI} instance. */
	public static GLFWScrollCallback create(GLFWScrollCallbackI instance) {
		return instance instanceof GLFWScrollCallback
			? (GLFWScrollCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWScrollCallback() {
		super(SIGNATURE);
	}

	private GLFWScrollCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetScrollCallback SetScrollCallback}. */
	public GLFWScrollCallback set(long window) {
		glfwSetScrollCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWScrollCallback {

		private final GLFWScrollCallbackI delegate;

		Container(long functionPointer, GLFWScrollCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, double xoffset, double yoffset) {
			delegate.invoke(window, xoffset, yoffset);
		}

	}

}