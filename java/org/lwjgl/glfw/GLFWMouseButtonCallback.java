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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetMouseButtonCallback SetMouseButtonCallback} method. */
public abstract class GLFWMouseButtonCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWMouseButtonCallback");

	protected GLFWMouseButtonCallback() {
		super(CALL_CONVENTION_DEFAULT + "(piii)v", CLASSPATH);
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
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a mouse button is pressed or released.
	 *
	 * @param window the window that received the event
	 * @param button the mouse button that was pressed or released
	 * @param action the button action. One of:<br><table><tr><td>{@link GLFW#GLFW_PRESS PRESS}</td><td>{@link GLFW#GLFW_RELEASE RELEASE}</td><td>{@link GLFW#GLFW_REPEAT REPEAT}</td></tr></table>
	 * @param mods   bitfield describing which modifiers keys were held down
	 */
	public abstract void invoke(long window, int button, int action, int mods);

	/** A functional interface for {@link GLFWMouseButtonCallback}. */
	public interface SAM {
		void invoke(long window, int button, int action, int mods);
	}

	/**
	 * Creates a {@link GLFWMouseButtonCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWMouseButtonCallback} instance
	 */
	public static GLFWMouseButtonCallback create(SAM sam) {
		return new GLFWMouseButtonCallback() {
			@Override
			public void invoke(long window, int button, int action, int mods) {
				sam.invoke(window, button, action, mods);
			}
		};
	}

	/** See {@link GLFW#glfwSetMouseButtonCallback SetMouseButtonCallback}. */
	public GLFWMouseButtonCallback set(long window) {
		glfwSetMouseButtonCallback(window, this);
		return this;
	}

}