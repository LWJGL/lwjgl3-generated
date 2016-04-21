/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetWindowRefreshCallback SetWindowRefreshCallback} method. */
public abstract class GLFWWindowRefreshCallback extends Callback implements GLFWWindowRefreshCallbackI {

	/** Creates a {@code GLFWWindowRefreshCallback} instance from the specified function pointer. */
	public static GLFWWindowRefreshCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWWindowRefreshCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWWindowRefreshCallback
			? (GLFWWindowRefreshCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWWindowRefreshCallback} instance that delegates to the specified {@code GLFWWindowRefreshCallbackI} instance. */
	public static GLFWWindowRefreshCallback create(GLFWWindowRefreshCallbackI instance) {
		return instance instanceof GLFWWindowRefreshCallback
			? (GLFWWindowRefreshCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWWindowRefreshCallback() {
		super(NULL);
		address = GLFWWindowRefreshCallbackI.super.address();
	}

	private GLFWWindowRefreshCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetWindowRefreshCallback SetWindowRefreshCallback}. */
	public GLFWWindowRefreshCallback set(long window) {
		glfwSetWindowRefreshCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWWindowRefreshCallback {

		private final GLFWWindowRefreshCallbackI delegate;

		Container(long functionPointer, GLFWWindowRefreshCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window) {
			delegate.invoke(window);
		}

	}

}