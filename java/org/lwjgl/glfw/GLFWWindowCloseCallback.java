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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowCloseCallback SetWindowCloseCallback} method. */
public abstract class GLFWWindowCloseCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWWindowCloseCallback");

	protected GLFWWindowCloseCallback() {
		super(CALL_CONVENTION_DEFAULT + "(p)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when the user attempts to close the specified window, for example by clicking the close widget in the title bar.
	 *
	 * @param window the window that the user attempted to close
	 */
	public abstract void invoke(long window);

	/** A functional interface for {@link GLFWWindowCloseCallback}. */
	public interface SAM {
		void invoke(long window);
	}

	/**
	 * Creates a {@link GLFWWindowCloseCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWWindowCloseCallback} instance
	 */
	public static GLFWWindowCloseCallback create(SAM sam) {
		return new GLFWWindowCloseCallback() {
			@Override
			public void invoke(long window) {
				sam.invoke(window);
			}
		};
	}

	/** See {@link GLFW#glfwSetWindowCloseCallback SetWindowCloseCallback}. */
	public GLFWWindowCloseCallback set(long window) {
		glfwSetWindowCloseCallback(window, this);
		return this;
	}

}