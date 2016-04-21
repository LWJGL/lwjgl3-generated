/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetJoystickCallback SetJoystickCallback} method. */
@FunctionalInterface
public interface GLFWJoystickCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(ii)v", false);
	}

	@Override
	default void callback(long args) {
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
	void invoke(int joy, int event);

}