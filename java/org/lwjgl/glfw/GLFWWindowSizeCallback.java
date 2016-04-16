/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback} method. */
public abstract class GLFWWindowSizeCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWWindowSizeCallback");

	protected GLFWWindowSizeCallback() {
		super(CALL_CONVENTION_DEFAULT + "(pii)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when the specified window is resized.
	 *
	 * @param window the window that was resized
	 * @param width  the new width, in screen coordinates, of the window
	 * @param height the new height, in screen coordinates, of the window
	 */
	public abstract void invoke(long window, int width, int height);

	/** A functional interface for {@link GLFWWindowSizeCallback}. */
	public interface SAM {
		void invoke(long window, int width, int height);
	}

	/**
	 * Creates a {@link GLFWWindowSizeCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWWindowSizeCallback} instance
	 */
	public static GLFWWindowSizeCallback create(SAM sam) {
		return new GLFWWindowSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				sam.invoke(window, width, height);
			}
		};
	}

	/** See {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback}. */
	public GLFWWindowSizeCallback set(long window) {
		glfwSetWindowSizeCallback(window, this);
		return this;
	}

}