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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCharCallback SetCharCallback} method. */
public abstract class GLFWCharCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWCharCallback");

	protected GLFWCharCallback() {
		super(CALL_CONVENTION_DEFAULT + "(pi)v", CLASSPATH);
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
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a Unicode character is input.
	 *
	 * @param window    the window that received the event
	 * @param codepoint the Unicode code point of the character
	 */
	public abstract void invoke(long window, int codepoint);

	/** A functional interface for {@link GLFWCharCallback}. */
	public interface SAM {
		void invoke(long window, int codepoint);
	}

	/**
	 * Creates a {@link GLFWCharCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWCharCallback} instance
	 */
	public static GLFWCharCallback create(SAM sam) {
		return new GLFWCharCallback() {
			@Override
			public void invoke(long window, int codepoint) {
				sam.invoke(window, codepoint);
			}
		};
	}

	/** See {@link GLFW#glfwSetCharCallback SetCharCallback}. */
	public GLFWCharCallback set(long window) {
		glfwSetCharCallback(window, this);
		return this;
	}

}