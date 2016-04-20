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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCharModsCallback SetCharModsCallback} method. */
@FunctionalInterface
public interface GLFWCharModsCallback extends Callback.V {

	/** Creates a {@code GLFWCharModsCallback} instance from the specified function pointer. */
	static GLFWCharModsCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWCharModsCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWCharModsCallback} instance that delegates to the specified {@code GLFWCharModsCallback} instance. */
	static GLFWCharModsCallback create(GLFWCharModsCallback sam) {
		return new GLFWCharModsCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pii)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a Unicode character is input regardless of what modifier keys are used.
	 *
	 * @param window    the window that received the event
	 * @param codepoint the Unicode code point of the character
	 * @param mods      bitfield describing which modifier keys were held down
	 */
	void invoke(long window, int codepoint, int mods);

	/** See {@link GLFW#glfwSetCharModsCallback SetCharModsCallback}. */
	default GLFWCharModsCallback set(long window) {
		glfwSetCharModsCallback(window, this);
		return this;
	}

}

final class GLFWCharModsCallbackHandle extends Pointer.Default implements GLFWCharModsCallback {

	private final GLFWCharModsCallback delegate;

	GLFWCharModsCallbackHandle(long functionPointer, GLFWCharModsCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long window, int codepoint, int mods) {
		delegate.invoke(window, codepoint, mods);
	}

}