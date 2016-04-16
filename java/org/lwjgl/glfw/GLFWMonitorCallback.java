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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetMonitorCallback SetMonitorCallback} method. */
public abstract class GLFWMonitorCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWMonitorCallback");

	protected GLFWMonitorCallback() {
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
	 * Will be called when a monitor is connected to or disconnected from the system.
	 *
	 * @param monitor the monitor that was connected or disconnected
	 * @param event   one of {@link GLFW#GLFW_CONNECTED CONNECTED} or {@link GLFW#GLFW_DISCONNECTED DISCONNECTED}
	 */
	public abstract void invoke(long monitor, int event);

	/** A functional interface for {@link GLFWMonitorCallback}. */
	public interface SAM {
		void invoke(long monitor, int event);
	}

	/**
	 * Creates a {@link GLFWMonitorCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWMonitorCallback} instance
	 */
	public static GLFWMonitorCallback create(SAM sam) {
		return new GLFWMonitorCallback() {
			@Override
			public void invoke(long monitor, int event) {
				sam.invoke(monitor, event);
			}
		};
	}

	/** See {@link GLFW#glfwSetMonitorCallback SetMonitorCallback}. */
	public GLFWMonitorCallback set() {
		glfwSetMonitorCallback(this);
		return this;
	}

}