/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCharCallback SetCharCallback} method. */
@FunctionalInterface
public interface GLFWCharCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pi)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a Unicode character is input.
	 *
	 * @param window    the window that received the event
	 * @param codepoint the Unicode code point of the character
	 */
	void invoke(long window, int codepoint);

}