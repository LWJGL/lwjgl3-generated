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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetJoystickCallback SetJoystickCallback} method. */
public abstract class GLFWJoystickCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWJoystickCallback");

	protected GLFWJoystickCallback() {
		super(CALL_CONVENTION_DEFAULT + "(ii)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a joystick is connected to or disconnected from the system.
	 *
	 * @param joy   the joystick that was connected or disconnected
	 * @param event one of {@link GLFW#GLFW_CONNECTED CONNECTED} or {@link GLFW#GLFW_DISCONNECTED DISCONNECTED}
	 */
	public abstract void invoke(int joy, int event);

	/** A functional interface for {@link GLFWJoystickCallback}. */
	public interface SAM {
		void invoke(int joy, int event);
	}

	/**
	 * Creates a {@link GLFWJoystickCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWJoystickCallback} instance
	 */
	public static GLFWJoystickCallback create(SAM sam) {
		return new GLFWJoystickCallback() {
			@Override
			public void invoke(int joy, int event) {
				sam.invoke(joy, event);
			}
		};
	}

	/** See {@link GLFW#glfwSetJoystickCallback SetJoystickCallback}. */
	public GLFWJoystickCallback set() {
		glfwSetJoystickCallback(this);
		return this;
	}

}