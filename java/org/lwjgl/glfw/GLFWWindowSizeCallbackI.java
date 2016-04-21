/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback} method. */
@FunctionalInterface
public interface GLFWWindowSizeCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pii)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when the specified window is resized.
	 *
	 * @param window the window that was resized
	 * @param width  the new width, in screen coordinates, of the window
	 * @param height the new height, in screen coordinates, of the window
	 */
	void invoke(long window, int width, int height);

}