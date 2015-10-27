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

/** Instances of this interface may be passed to the {@link GLFW#glfwSetMonitorCallback} method. */
public abstract class GLFWMonitorCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(2);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.glfw.GLFWMonitorCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_sint32
		);
	}

	protected GLFWMonitorCallback() {
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
	 * Will be called when a monitor is connected to or disconnected from the system.
	 *
	 * @param monitor the monitor that was connected or disconnected
	 * @param event   one of {@link GLFW#GLFW_CONNECTED} or {@link GLFW#GLFW_DISCONNECTED}
	 */
	public abstract void invoke(long monitor, int event);

	/** A functional interface for {@link GLFWMonitorCallback}. */
	public interface SAM {
		void invoke(long monitor, int event);
	}

	/**
	 * Creates a {@link GLFWMonitorCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWMonitorCallback} instance
	 */
	public static GLFWMonitorCallback create(final SAM sam) {
		return new GLFWMonitorCallback() {
			@Override
			public void invoke(long monitor, int event) {
				sam.invoke(monitor, event);
			}
		};
	}

	/** See {@link GLFW#glfwSetMonitorCallback SetMonitorCallback}. */
	public GLFWMonitorCallback set() {
		glfwSetMonitorCallback(this);
		return this;
	}
	
}