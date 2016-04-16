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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetScrollCallback SetScrollCallback} method. */
public abstract class GLFWScrollCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWScrollCallback");

	protected GLFWScrollCallback() {
		super(CALL_CONVENTION_DEFAULT + "(pdd)v", CLASSPATH);
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
			dcbArgDouble(args),
			dcbArgDouble(args)
		);
	}

	/**
	 * Will be called when a scrolling device is used, such as a mouse wheel or scrolling area of a touchpad.
	 *
	 * @param window  the window that received the event
	 * @param xoffset the scroll offset along the x-axis
	 * @param yoffset the scroll offset along the y-axis
	 */
	public abstract void invoke(long window, double xoffset, double yoffset);

	/** A functional interface for {@link GLFWScrollCallback}. */
	public interface SAM {
		void invoke(long window, double xoffset, double yoffset);
	}

	/**
	 * Creates a {@link GLFWScrollCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWScrollCallback} instance
	 */
	public static GLFWScrollCallback create(SAM sam) {
		return new GLFWScrollCallback() {
			@Override
			public void invoke(long window, double xoffset, double yoffset) {
				sam.invoke(window, xoffset, yoffset);
			}
		};
	}

	/** See {@link GLFW#glfwSetScrollCallback SetScrollCallback}. */
	public GLFWScrollCallback set(long window) {
		glfwSetScrollCallback(window, this);
		return this;
	}

}