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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowPosCallback SetWindowPosCallback} method. */
public abstract class GLFWWindowPosCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWWindowPosCallback");

	protected GLFWWindowPosCallback() {
		super(CALL_CONVENTION_DEFAULT + "(pii)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when the specified window moves.
	 *
	 * @param window the window that was moved
	 * @param xpos   the new x-coordinate, in pixels, of the upper-left corner of the client area of the window
	 * @param ypos   the new y-coordinate, in pixels, of the upper-left corner of the client area of the window
	 */
	public abstract void invoke(long window, int xpos, int ypos);

	/** A functional interface for {@link GLFWWindowPosCallback}. */
	public interface SAM {
		void invoke(long window, int xpos, int ypos);
	}

	/**
	 * Creates a {@link GLFWWindowPosCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWWindowPosCallback} instance
	 */
	public static GLFWWindowPosCallback create(SAM sam) {
		return new GLFWWindowPosCallback() {
			@Override
			public void invoke(long window, int xpos, int ypos) {
				sam.invoke(window, xpos, ypos);
			}
		};
	}

	/** See {@link GLFW#glfwSetWindowPosCallback SetWindowPosCallback}. */
	public GLFWWindowPosCallback set(long window) {
		glfwSetWindowPosCallback(window, this);
		return this;
	}

}