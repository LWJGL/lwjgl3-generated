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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback} method. */
public abstract class GLFWFramebufferSizeCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWFramebufferSizeCallback");

	protected GLFWFramebufferSizeCallback() {
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
	 * Will be called when the framebuffer of the specified window is resized.
	 *
	 * @param window the window whose framebuffer was resized
	 * @param width  the new width, in pixels, of the framebuffer
	 * @param height the new height, in pixels, of the framebuffer
	 */
	public abstract void invoke(long window, int width, int height);

	/** A functional interface for {@link GLFWFramebufferSizeCallback}. */
	public interface SAM {
		void invoke(long window, int width, int height);
	}

	/**
	 * Creates a {@link GLFWFramebufferSizeCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWFramebufferSizeCallback} instance
	 */
	public static GLFWFramebufferSizeCallback create(SAM sam) {
		return new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				sam.invoke(window, width, height);
			}
		};
	}

	/** See {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback}. */
	public GLFWFramebufferSizeCallback set(long window) {
		glfwSetFramebufferSizeCallback(window, this);
		return this;
	}

}