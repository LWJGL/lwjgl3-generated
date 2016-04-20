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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowRefreshCallback SetWindowRefreshCallback} method. */
@FunctionalInterface
public interface GLFWWindowRefreshCallback extends Callback.V {

	/** Creates a {@code GLFWWindowRefreshCallback} instance from the specified function pointer. */
	static GLFWWindowRefreshCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWWindowRefreshCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWWindowRefreshCallback} instance that delegates to the specified {@code GLFWWindowRefreshCallback} instance. */
	static GLFWWindowRefreshCallback create(GLFWWindowRefreshCallback sam) {
		return new GLFWWindowRefreshCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(p)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when the client area of the specified window needs to be redrawn, for example if the window has been exposed after having been covered by
	 * another window.
	 *
	 * @param window the window whose content needs to be refreshed
	 */
	void invoke(long window);

	/** See {@link GLFW#glfwSetWindowRefreshCallback SetWindowRefreshCallback}. */
	default GLFWWindowRefreshCallback set(long window) {
		glfwSetWindowRefreshCallback(window, this);
		return this;
	}

}

final class GLFWWindowRefreshCallbackHandle extends Pointer.Default implements GLFWWindowRefreshCallback {

	private final GLFWWindowRefreshCallback delegate;

	GLFWWindowRefreshCallbackHandle(long functionPointer, GLFWWindowRefreshCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window) {
		delegate.invoke(window);
	}

}