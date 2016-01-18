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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetCharModsCallback} method. */
public abstract class GLFWCharModsCallback extends Closure.V {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(3);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWCharModsCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_uint32, ffi_type_sint32
		);
	}

	protected GLFWCharModsCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 2 + args))
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
	public static GLFWCharModsCallback create(final SAM sam) {
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