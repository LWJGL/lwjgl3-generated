/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetDropCallback SetDropCallback} method. */
public abstract class GLFWDropCallback extends Callback implements GLFWDropCallbackI {

	/** Creates a {@code GLFWDropCallback} instance from the specified function pointer. */
	public static GLFWDropCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLFWDropCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLFWDropCallback
			? (GLFWDropCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLFWDropCallback} instance that delegates to the specified {@code GLFWDropCallbackI} instance. */
	public static GLFWDropCallback create(GLFWDropCallbackI instance) {
		return instance instanceof GLFWDropCallback
			? (GLFWDropCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLFWDropCallback() {
		super(NULL);
		address = GLFWDropCallbackI.super.address();
	}

	private GLFWDropCallback(long functionPointer) {
		super(functionPointer);
	}

	/**
	 * Decodes the specified {@link GLFWDropCallback} arguments to a String.
	 *
	 * <p>This method may only be used inside a {@code GLFWDropCallback} invocation.</p>
	 *
	 * @param names pointer to the array of UTF-8 encoded path names of the dropped files
	 * @param index the index to decode
	 *
	 * @return the name at the specified index as a String
	 */
	public static String getName(long names, int index) {
		return memUTF8(memGetAddress(names + Pointer.POINTER_SIZE * index));
	}

	/** See {@link GLFW#glfwSetDropCallback SetDropCallback}. */
	public GLFWDropCallback set(long window) {
		glfwSetDropCallback(window, this);
		return this;
	}

	private static final class Container extends GLFWDropCallback {

		private final GLFWDropCallbackI delegate;

		Container(long functionPointer, GLFWDropCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long window, int count, long names) {
			delegate.invoke(window, count, names);
		}

	}

}