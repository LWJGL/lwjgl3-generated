/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback} method. */
@FunctionalInterface
public interface GLFWWindowFocusCallbackI extends CallbackI.V {

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
	 * Will be called when the specified window gains or loses focus.
	 *
	 * @param window  the window that was focused or defocused
	 * @param focused {@link GLFW#GLFW_TRUE TRUE} if the window was focused, or {@link GLFW#GLFW_FALSE FALSE} if it was defocused
	 */
	void invoke(long window, boolean focused);

}