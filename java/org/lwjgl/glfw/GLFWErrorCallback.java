/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Map;
import org.lwjgl.system.APIUtil;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetErrorCallback} method. */
public abstract class GLFWErrorCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(2);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWErrorCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_sint32, ffi_type_pointer
		);
	}

	protected GLFWErrorCallback() {
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
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args))
		);
	}

	/**
	 * Will be called with an error code and a human-readable description when a GLFW error occurs.
	 *
	 * @param error       the error code
	 * @param description a pointer to a UTF-8 encoded string describing the error
	 */
	public abstract void invoke(int error, long description);

	/** A functional interface for {@link GLFWErrorCallback}. */
	public interface SAM {
		void invoke(int error, long description);
	}

	/**
	 * Creates a {@link GLFWErrorCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWErrorCallback} instance
	 */
	public static GLFWErrorCallback create(final SAM sam) {
		return new GLFWErrorCallback() {
			@Override
			public void invoke(int error, long description) {
				sam.invoke(error, description);
			}
		};
	}

	/**
	 * Converts the specified {@link GLFWErrorCallback} argument to a String.
	 *
	 * <p>This method may only be used inside a GLFWErrorCallback invocation.</p>
	 *
	 * @param description pointer to the UTF-8 encoded description string
	 *
	 * @return the description as a String
	 */
	public static String getDescription(long description) {
		return memDecodeUTF8(description);
	}

	/** A functional interface for {@link GLFWErrorCallback}. */
	public interface SAMString {
		void invoke(int error, String description);
	}

	/**
	 * Creates a {@link GLFWErrorCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWErrorCallback} instance
	 */
	public static GLFWErrorCallback createString(final SAMString sam) {
		return new GLFWErrorCallback() {
			@Override
			public void invoke(int error, long description) {
				sam.invoke(error, getDescription(description));
			}
		};
	}

	/**
	 * Returns a {@link GLFWErrorCallback} instance that prints the error to the {@link APIUtil#DEBUG_STREAM}.
	 *
	 * @return the GLFWerrorCallback
	 */
	public static GLFWErrorCallback createPrint() {
		return createPrint(DEBUG_STREAM);
	}

	/**
	 * Returns a {@link GLFWErrorCallback} instance that prints the error in the specified {@link PrintStream}.
	 *
	 * @param stream the PrintStream to use
	 *
	 * @return the GLFWerrorCallback
	 */
	public static GLFWErrorCallback createPrint(final PrintStream stream) {
		return new GLFWErrorCallback() {
			private final Map<Integer, String> ERROR_CODES = apiClassTokens(new TokenFilter() {
				@Override
				public boolean accept(Field field, int value) {
					return 0x10000 < value && value < 0x20000;
				}
			}, null, GLFW.class);

			@Override
			public void invoke(int error, long description) {
				String msg = memDecodeUTF8(description);

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
	public static GLFWErrorCallback createThrow() {
		return new GLFWErrorCallback() {
			@Override
			public void invoke(int error, long description) {
				throw new IllegalStateException(String.format("GLFW error [0x%X]: %s", error, memDecodeUTF8(description)));
			}
		};
	}

	/** See {@link GLFW#glfwSetErrorCallback SetErrorCallback}. */
	public GLFWErrorCallback set() {
		glfwSetErrorCallback(this);
		return this;
	}

}