/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import org.lwjgl.opengl.GL11;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback} method. */
public abstract class GLFWWindowFocusCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWWindowFocusCallback");

	protected GLFWWindowFocusCallback() {
		super(CALL_CONVENTION_DEFAULT + "(pi)v", CLASSPATH);
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
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when the specified window gains or loses focus.
	 *
	 * @param window  the window that was focused or defocused
	 * @param focused {@link GL11#GL_TRUE} if the window was focused, or {@link GL11#GL_FALSE} if it was defocused
	 */
	public abstract void invoke(long window, int focused);

	/** A functional interface for {@link GLFWWindowFocusCallback}. */
	public interface SAM {
		void invoke(long window, int focused);
	}

	/**
	 * Creates a {@link GLFWWindowFocusCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWWindowFocusCallback} instance
	 */
	public static GLFWWindowFocusCallback create(SAM sam) {
		return new GLFWWindowFocusCallback() {
			@Override
			public void invoke(long window, int focused) {
				sam.invoke(window, focused);
			}
		};
	}

	/** See {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback}. */
	public GLFWWindowFocusCallback set(long window) {
		glfwSetWindowFocusCallback(window, this);
		return this;
	}

}