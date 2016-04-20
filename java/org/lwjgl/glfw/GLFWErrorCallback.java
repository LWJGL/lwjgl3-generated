/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import java.io.PrintStream;
import java.util.Map;
import org.lwjgl.system.APIUtil;

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetErrorCallback SetErrorCallback} method. */
@FunctionalInterface
public interface GLFWErrorCallback extends Callback.V {

	/** Creates a {@code GLFWErrorCallback} instance from the specified function pointer. */
	static GLFWErrorCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLFWErrorCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLFWErrorCallback} instance that delegates to the specified {@code GLFWErrorCallback} instance. */
	static GLFWErrorCallback create(GLFWErrorCallback sam) {
		return new GLFWErrorCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(ip)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgInt(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called with an error code and a human-readable description when a GLFW error occurs.
	 *
	 * @param error       the error code
	 * @param description a pointer to a UTF-8 encoded string describing the error
	 */
	void invoke(int error, long description);

	/**
	 * Converts the specified {@link GLFWErrorCallback} argument to a String.
	 *
	 * <p>This method may only be used inside a GLFWErrorCallback invocation.</p>
	 *
	 * @param description pointer to the UTF-8 encoded description string
	 *
	 * @return the description as a String
	 */
	static String getDescription(long description) {
		return memUTF8(description);
	}

	/**
	 * Returns a {@link GLFWErrorCallback} instance that prints the error to the {@link APIUtil#DEBUG_STREAM}.
	 *
	 * @return the GLFWerrorCallback
	 */
	static GLFWErrorCallback createPrint() {
		return createPrint(APIUtil.DEBUG_STREAM);
	}

	/**
	 * Returns a {@link GLFWErrorCallback} instance that prints the error in the specified {@link PrintStream}.
	 *
	 * @param stream the PrintStream to use
	 *
	 * @return the GLFWerrorCallback
	 */
	static GLFWErrorCallback createPrint(PrintStream stream) {
		return new GLFWErrorCallback() {
			private Map<Integer, String> ERROR_CODES = APIUtil.apiClassTokens((field, value) -> 0x10000 < value && value < 0x20000, null, GLFW.class);

			@Override
			public void invoke(int error, long description) {
				String msg = getDescription(description);

				stream.printf("[LWJGL] %s error\n", ERROR_CODES.get(error));
				stream.println("\tDescription : " + msg);
				stream.println("\tStacktrace  :");
				StackTraceElement[] stack = Thread.currentThread().getStackTrace();
				for ( int i = 4; i < stack.length; i++ ) {
					stream.print("\t\t");
					stream.println(stack[i].toString());
				}
			}
		};
	}

	/**
	 * Returns a {@link GLFWErrorCallback} instance that throws an {@link IllegalStateException} when an error occurs.
	 *
	 * @return the GLFWerrorCallback
	 */
	static GLFWErrorCallback createThrow() {
		return (error, description) -> {
			throw new IllegalStateException(String.format("GLFW error [0x%X]: %s", error, getDescription(description)));
		};
	}

	/** See {@link GLFW#glfwSetErrorCallback SetErrorCallback}. */
	default GLFWErrorCallback set() {
		glfwSetErrorCallback(this);
		return this;
	}

}

final class GLFWErrorCallbackHandle extends Pointer.Default implements GLFWErrorCallback {

	private final GLFWErrorCallback delegate;

	GLFWErrorCallbackHandle(long functionPointer, GLFWErrorCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(int error, long description) {
		delegate.invoke(error, description);
	}

}