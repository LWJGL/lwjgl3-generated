/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetScrollCallback SetScrollCallback} method. */
@FunctionalInterface
public interface GLFWScrollCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pdd)v", false);
	}

	@Override
	default void callback(long args) {
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
	void invoke(long window, double xoffset, double yoffset);

}