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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback} method. */
public abstract class GLFWWindowIconifyCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWWindowIconifyCallback");

	protected GLFWWindowIconifyCallback() {
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
	 * Will be called when the specified window is iconified or restored.
	 *
	 * @param window    the window that was iconified or restored.
	 * @param iconified {@link GL11#GL_TRUE} if the window was iconified, or {@link GL11#GL_FALSE} if it was restored
	 */
	public abstract void invoke(long window, int iconified);

	/** A functional interface for {@link GLFWWindowIconifyCallback}. */
	public interface SAM {
		void invoke(long window, int iconified);
	}

	/**
	 * Creates a {@link GLFWWindowIconifyCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWWindowIconifyCallback} instance
	 */
	public static GLFWWindowIconifyCallback create(SAM sam) {
		return new GLFWWindowIconifyCallback() {
			@Override
			public void invoke(long window, int iconified) {
				sam.invoke(window, iconified);
			}
		};
	}

	/** See {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback}. */
	public GLFWWindowIconifyCallback set(long window) {
		glfwSetWindowIconifyCallback(window, this);
		return this;
	}

}