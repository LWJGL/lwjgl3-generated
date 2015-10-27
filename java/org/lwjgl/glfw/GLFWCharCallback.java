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

import static org.lwjgl.glfw.GLFW.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCharCallback} method. */
public abstract class GLFWCharCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(2);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWCharCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_uint32
		);
	}

	protected GLFWCharCallback() {
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
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args))
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
	public static GLFWCharCallback create(final SAM sam) {
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