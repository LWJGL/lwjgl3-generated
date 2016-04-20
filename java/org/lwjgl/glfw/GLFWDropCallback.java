/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetDropCallback SetDropCallback} method. */
@FunctionalInterface
public interface GLFWDropCallback extends Callback.V {

	/** Creates a {@code GLFWDropCallback} instance from the specified function pointer. */
	static GLFWDropCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWDropCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWDropCallback} instance that delegates to the specified {@code GLFWDropCallback} instance. */
	static GLFWDropCallback create(GLFWDropCallback sam) {
		return new GLFWDropCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pip)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when one or more dragged files are dropped on the window.
	 *
	 * @param window the window that received the event
	 * @param count  the number of dropped files
	 * @param names  pointer to the array of UTF-8 encoded path names of the dropped files
	 */
	void invoke(long window, int count, long names);

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
	static String getName(long names, int index) {
		return memUTF8(memGetAddress(names + Pointer.POINTER_SIZE * index));
	}

	/** See {@link GLFW#glfwSetDropCallback SetDropCallback}. */
	default GLFWDropCallback set(long window) {
		glfwSetDropCallback(window, this);
		return this;
	}

}

final class GLFWDropCallbackHandle extends Pointer.Default implements GLFWDropCallback {

	private final GLFWDropCallback delegate;

	GLFWDropCallbackHandle(long functionPointer, GLFWDropCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, int count, long names) {
		delegate.invoke(window, count, names);
	}

}