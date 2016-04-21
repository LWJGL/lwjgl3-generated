/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback} method. */
@FunctionalInterface
public interface GLFWFramebufferSizeCallbackI extends CallbackI.V {

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
	 * Will be called when the framebuffer of the specified window is resized.
	 *
	 * @param window the window whose framebuffer was resized
	 * @param width  the new width, in pixels, of the framebuffer
	 * @param height the new height, in pixels, of the framebuffer
	 */
	void invoke(long window, int width, int height);

}