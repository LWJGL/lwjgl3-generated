/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetMonitorCallback SetMonitorCallback} method. */
public abstract class GLFWMonitorCallback extends Callback implements GLFWMonitorCallbackI {

	/** Creates a {@code GLFWMonitorCallback} instance from the specified function pointer. */
	public static GLFWMonitorCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWMonitorCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWMonitorCallback
			? (GLFWMonitorCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWMonitorCallback} instance that delegates to the specified {@code GLFWMonitorCallbackI} instance. */
	public static GLFWMonitorCallback create(GLFWMonitorCallbackI instance) {
		return instance instanceof GLFWMonitorCallback
			? (GLFWMonitorCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWMonitorCallback() {
		super(NULL);
		address = GLFWMonitorCallbackI.super.address();
	}

	private GLFWMonitorCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetMonitorCallback SetMonitorCallback}. */
	public GLFWMonitorCallback set() {
		glfwSetMonitorCallback(this);
		return this;
	}

	private static final class Container extends GLFWMonitorCallback {

		private final GLFWMonitorCallbackI delegate;

		Container(long functionPointer, GLFWMonitorCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long monitor, int event) {
			delegate.invoke(monitor, event);
		}

	}

}