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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback} method. */
public abstract class GLFWCursorEnterCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWCursorEnterCallback");

	protected GLFWCursorEnterCallback() {
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
	 * Will be called when the cursor enters or leaves the client area of the window.
	 *
	 * @param window  the window that received the event
	 * @param entered {@link GL11#GL_TRUE} if the cursor entered the window's client area, or {@link GL11#GL_FALSE} if it left it
	 */
	public abstract void invoke(long window, int entered);

	/** A functional interface for {@link GLFWCursorEnterCallback}. */
	public interface SAM {
		void invoke(long window, int entered);
	}

	/**
	 * Creates a {@link GLFWCursorEnterCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWCursorEnterCallback} instance
	 */
	public static GLFWCursorEnterCallback create(SAM sam) {
		return new GLFWCursorEnterCallback() {
			@Override
			public void invoke(long window, int entered) {
				sam.invoke(window, entered);
			}
		};
	}

	/** See {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback}. */
	public GLFWCursorEnterCallback set(long window) {
		glfwSetCursorEnterCallback(window, this);
		return this;
	}

}