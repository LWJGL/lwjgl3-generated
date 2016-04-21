/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCharModsCallback SetCharModsCallback} method. */
@FunctionalInterface
public interface GLFWCharModsCallbackI extends CallbackI.V {

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
	 * Will be called when a Unicode character is input regardless of what modifier keys are used.
	 *
	 * @param window    the window that received the event
	 * @param codepoint the Unicode code point of the character
	 * @param mods      bitfield describing which modifier keys were held down
	 */
	void invoke(long window, int codepoint, int mods);

}