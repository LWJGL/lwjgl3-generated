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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCharModsCallback SetCharModsCallback} method. */
public abstract class GLFWCharModsCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWCharModsCallback");

	protected GLFWCharModsCallback() {
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
	 * Will be called when a Unicode character is input regardless of what modifier keys are used.
	 *
	 * @param window    the window that received the event
	 * @param codepoint the Unicode code point of the character
	 * @param mods      bitfield describing which modifier keys were held down
	 */
	public abstract void invoke(long window, int codepoint, int mods);

	/** A functional interface for {@link GLFWCharModsCallback}. */
	public interface SAM {
		void invoke(long window, int codepoint, int mods);
	}

	/**
	 * Creates a {@link GLFWCharModsCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWCharModsCallback} instance
	 */
	public static GLFWCharModsCallback create(SAM sam) {
		return new GLFWCharModsCallback() {
			@Override
			public void invoke(long window, int codepoint, int mods) {
				sam.invoke(window, codepoint, mods);
			}
		};
	}

	/** See {@link GLFW#glfwSetCharModsCallback SetCharModsCallback}. */
	public GLFWCharModsCallback set(long window) {
		glfwSetCharModsCallback(window, this);
		return this;
	}

}