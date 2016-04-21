/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetErrorCallback SetErrorCallback} method. */
@FunctionalInterface
public interface GLFWErrorCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(ip)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgInt(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called with an error code and a human-readable description when a GLFW error occurs.
	 *
	 * @param error       the error code
	 * @param description a pointer to a UTF-8 encoded string describing the error
	 */
	void invoke(int error, long description);

}