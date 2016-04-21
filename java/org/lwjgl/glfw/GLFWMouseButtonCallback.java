/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetMouseButtonCallback SetMouseButtonCallback} method. */
public abstract class GLFWMouseButtonCallback extends Callback implements GLFWMouseButtonCallbackI {

	/** Creates a {@code GLFWMouseButtonCallback} instance from the specified function pointer. */
	public static GLFWMouseButtonCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWMouseButtonCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWMouseButtonCallback
			? (GLFWMouseButtonCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWMouseButtonCallback} instance that delegates to the specified {@code GLFWMouseButtonCallbackI} instance. */
	public static GLFWMouseButtonCallback create(GLFWMouseButtonCallbackI instance) {
		return instance instanceof GLFWMouseButtonCallback
			? (GLFWMouseButtonCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWMouseButtonCallback() {
		super(NULL);
		address = GLFWMouseButtonCallbackI.super.address();
	}

	private GLFWMouseButtonCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetMouseButtonCallback SetMouseButtonCallback}. */
	public GLFWMouseButtonCallback set(long window) {
		glfwSetMouseButtonCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWMouseButtonCallback {

		private final GLFWMouseButtonCallbackI delegate;

		Container(long functionPointer, GLFWMouseButtonCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, int button, int action, int mods) {
			delegate.invoke(window, button, action, mods);
		}

	}

}