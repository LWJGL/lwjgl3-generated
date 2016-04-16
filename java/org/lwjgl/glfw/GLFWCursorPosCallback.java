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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback} method. */
public abstract class GLFWCursorPosCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWCursorPosCallback");

	protected GLFWCursorPosCallback() {
		super(CALL_CONVENTION_DEFAULT + "(pdd)v", CLASSPATH);
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
			dcbArgDouble(args),
			dcbArgDouble(args)
		);
	}

	/**
	 * Will be called when the cursor is moved.
	 * 
	 * <p>The callback function receives the cursor position, measured in screen coordinates but relative to the top-left corner of the window client area. On
	 * platforms that provide it, the full sub-pixel cursor position is passed on.</p>
	 *
	 * @param window the window that received the event
	 * @param xpos   the new cursor x-coordinate, relative to the left edge of the client area
	 * @param ypos   the new cursor y-coordinate, relative to the top edge of the client area
	 */
	public abstract void invoke(long window, double xpos, double ypos);

	/** A functional interface for {@link GLFWCursorPosCallback}. */
	public interface SAM {
		void invoke(long window, double xpos, double ypos);
	}

	/**
	 * Creates a {@link GLFWCursorPosCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWCursorPosCallback} instance
	 */
	public static GLFWCursorPosCallback create(SAM sam) {
		return new GLFWCursorPosCallback() {
			@Override
			public void invoke(long window, double xpos, double ypos) {
				sam.invoke(window, xpos, ypos);
			}
		};
	}

	/** See {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback}. */
	public GLFWCursorPosCallback set(long window) {
		glfwSetCursorPosCallback(window, this);
		return this;
	}

}