/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetJoystickCallback} method. */
public abstract class GLFWJoystickCallback extends Closure.V {

	private static final FFICIF        CIF  = apiClosureCIF();
	private static final PointerBuffer ARGS = apiClosureArgs(2);

	private static final long CLASSPATH = apiClosureText("org.lwjgl.glfw.GLFWJoystickCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_sint32, ffi_type_sint32
		);
	}

	protected GLFWJoystickCallback() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			memGetInt(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args))
		);
	}

	/**
	 * Will be called when a joystick is connected to or disconnected from the system.
	 *
	 * @param joy   the joystick that was connected or disconnected
	 * @param event one of {@link GLFW#GLFW_CONNECTED} or {@link GLFW#GLFW_DISCONNECTED}
	 */
	public abstract void invoke(int joy, int event);

	/** A functional interface for {@link GLFWJoystickCallback}. */
	public interface SAM {
		void invoke(int joy, int event);
	}

	/**
	 * Creates a {@link GLFWJoystickCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWJoystickCallback} instance
	 */
	public static GLFWJoystickCallback create(final SAM sam) {
		return new GLFWJoystickCallback() {
			@Override
			public void invoke(int joy, int event) {
				sam.invoke(joy, event);
			}
		};
	}

	/** See {@link GLFW#glfwSetJoystickCallback SetJoystickCallback}. */
	public GLFWJoystickCallback set() {
		glfwSetJoystickCallback(this);
		return this;
	}
	
}