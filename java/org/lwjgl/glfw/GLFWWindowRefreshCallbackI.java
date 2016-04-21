/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowRefreshCallback SetWindowRefreshCallback} method. */
@FunctionalInterface
public interface GLFWWindowRefreshCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(p)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when the client area of the specified window needs to be redrawn, for example if the window has been exposed after having been covered by
	 * another window.
	 *
	 * @param window the window whose content needs to be refreshed
	 */
	void invoke(long window);

}