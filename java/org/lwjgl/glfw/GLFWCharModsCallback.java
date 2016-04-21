/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetCharModsCallback SetCharModsCallback} method. */
public abstract class GLFWCharModsCallback extends Callback implements GLFWCharModsCallbackI {

	/** Creates a {@code GLFWCharModsCallback} instance from the specified function pointer. */
	public static GLFWCharModsCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWCharModsCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWCharModsCallback
			? (GLFWCharModsCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWCharModsCallback} instance that delegates to the specified {@code GLFWCharModsCallbackI} instance. */
	public static GLFWCharModsCallback create(GLFWCharModsCallbackI instance) {
		return instance instanceof GLFWCharModsCallback
			? (GLFWCharModsCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWCharModsCallback() {
		super(NULL);
		address = GLFWCharModsCallbackI.super.address();
	}

	private GLFWCharModsCallback(long functionPointer) {
		super(functionPointer);
	}

	/** See {@link GLFW#glfwSetCharModsCallback SetCharModsCallback}. */
	public GLFWCharModsCallback set(long window) {
		glfwSetCharModsCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWCharModsCallback {

		private final GLFWCharModsCallbackI delegate;

		Container(long functionPointer, GLFWCharModsCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, int codepoint, int mods) {
			delegate.invoke(window, codepoint, mods);
		}

	}

}