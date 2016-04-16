/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowRefreshCallback SetWindowRefreshCallback} method. */
public abstract class GLFWWindowRefreshCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWWindowRefreshCallback");

	protected GLFWWindowRefreshCallback() {
		super(CALL_CONVENTION_DEFAULT + "(p)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
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
	public abstract void invoke(long window);

	/** A functional interface for {@link GLFWWindowRefreshCallback}. */
	public interface SAM {
		void invoke(long window);
	}

	/**
	 * Creates a {@link GLFWWindowRefreshCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWWindowRefreshCallback} instance
	 */
	public static GLFWWindowRefreshCallback create(SAM sam) {
		return new GLFWWindowRefreshCallback() {
			@Override
			public void invoke(long window) {
				sam.invoke(window);
			}
		};
	}

	/** See {@link GLFW#glfwSetWindowRefreshCallback SetWindowRefreshCallback}. */
	public GLFWWindowRefreshCallback set(long window) {
		glfwSetWindowRefreshCallback(window, this);
		return this;
	}

}