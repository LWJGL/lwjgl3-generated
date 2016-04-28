/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback} method. */
@FunctionalInterface
public interface GLFWCursorEnterCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pi)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args) != 0
		);
	}

	/**
	 * Will be called when the cursor enters or leaves the client area of the window.
	 *
	 * @param window  the window that received the event
	 * @param entered {@link GLFW#GLFW_TRUE TRUE} if the cursor entered the window's client area, or {@link GLFW#GLFW_FALSE FALSE} if it left it
	 */
	void invoke(long window, boolean entered);

}