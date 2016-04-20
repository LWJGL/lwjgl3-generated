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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetMonitorCallback SetMonitorCallback} method. */
@FunctionalInterface
public interface GLFWMonitorCallback extends Callback.V {

	/** Creates a {@code GLFWMonitorCallback} instance from the specified function pointer. */
	static GLFWMonitorCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWMonitorCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWMonitorCallback} instance that delegates to the specified {@code GLFWMonitorCallback} instance. */
	static GLFWMonitorCallback create(GLFWMonitorCallback sam) {
		return new GLFWMonitorCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pi)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a monitor is connected to or disconnected from the system.
	 *
	 * @param monitor the monitor that was connected or disconnected
	 * @param event   one of {@link GLFW#GLFW_CONNECTED CONNECTED} or {@link GLFW#GLFW_DISCONNECTED DISCONNECTED}
	 */
	void invoke(long monitor, int event);

	/** See {@link GLFW#glfwSetMonitorCallback SetMonitorCallback}. */
	default GLFWMonitorCallback set() {
		glfwSetMonitorCallback(this);
		return this;
	}

}

final class GLFWMonitorCallbackHandle extends Pointer.Default implements GLFWMonitorCallback {

	private final GLFWMonitorCallback delegate;

	GLFWMonitorCallbackHandle(long functionPointer, GLFWMonitorCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long monitor, int event) {
		delegate.invoke(monitor, event);
	}

}