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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowCloseCallback} method. */
public abstract class GLFWWindowCloseCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(1);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWWindowCloseCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer
		);
	}

	protected GLFWWindowCloseCallback() {
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
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args))
		);
	}

	/**
	 * Will be called when the user attempts to close the specified window, for example by clicking the close widget in the title bar.
	 *
	 * @param window the window that the user attempted to close
	 */
	public abstract void invoke(long window);

	/** A functional interface for {@link GLFWWindowCloseCallback}. */
	public interface SAM {
		void invoke(long window);
	}

	/**
	 * Creates a {@link GLFWWindowCloseCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWWindowCloseCallback} instance
	 */
	public static GLFWWindowCloseCallback create(final SAM sam) {
		return new GLFWWindowCloseCallback() {
			@Override
			public void invoke(long window) {
				sam.invoke(window);
			}
		};
	}

	/** See {@link GLFW#glfwSetWindowCloseCallback SetWindowCloseCallback}. */
	public GLFWWindowCloseCallback set(long window) {
		glfwSetWindowCloseCallback(window, this);
		return this;
	}
	
}