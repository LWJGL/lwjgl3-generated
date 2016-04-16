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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetKeyCallback SetKeyCallback} method. */
public abstract class GLFWKeyCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWKeyCallback");

	protected GLFWKeyCallback() {
		super(CALL_CONVENTION_DEFAULT + "(piiii)v", CLASSPATH);
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
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a key is pressed, repeated or released.
	 *
	 * @param window   the window that received the event
	 * @param key      the keyboard key that was pressed or released
	 * @param scancode the system-specific scancode of the key
	 * @param action   the key action. One of:<br><table><tr><td>{@link GLFW#GLFW_PRESS PRESS}</td><td>{@link GLFW#GLFW_RELEASE RELEASE}</td><td>{@link GLFW#GLFW_REPEAT REPEAT}</td></tr></table>
	 * @param mods     bitfield describing which modifiers keys were held down
	 */
	public abstract void invoke(long window, int key, int scancode, int action, int mods);

	/** A functional interface for {@link GLFWKeyCallback}. */
	public interface SAM {
		void invoke(long window, int key, int scancode, int action, int mods);
	}

	/**
	 * Creates a {@link GLFWKeyCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWKeyCallback} instance
	 */
	public static GLFWKeyCallback create(SAM sam) {
		return new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				sam.invoke(window, key, scancode, action, mods);
			}
		};
	}

	/** See {@link GLFW#glfwSetKeyCallback SetKeyCallback}. */
	public GLFWKeyCallback set(long window) {
		glfwSetKeyCallback(window, this);
		return this;
	}

}