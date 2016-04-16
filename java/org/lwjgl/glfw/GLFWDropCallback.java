/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import java.nio.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetDropCallback SetDropCallback} method. */
public abstract class GLFWDropCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.glfw.GLFWDropCallback");

	protected GLFWDropCallback() {
		super(CALL_CONVENTION_DEFAULT + "(pip)v", CLASSPATH);
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
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when one or more dragged files are dropped on the window.
	 *
	 * @param window the window that received the event
	 * @param count  the number of dropped files
	 * @param names  pointer to the array of UTF-8 encoded path names of the dropped files
	 */
	public abstract void invoke(long window, int count, long names);

	/** A functional interface for {@link GLFWDropCallback}. */
	public interface SAM {
		void invoke(long window, int count, long names);
	}

	/**
	 * Creates a {@link GLFWDropCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWDropCallback} instance
	 */
	public static GLFWDropCallback create(SAM sam) {
		return new GLFWDropCallback() {
			@Override
			public void invoke(long window, int count, long names) {
				sam.invoke(window, count, names);
			}
		};
	}

	/** A functional interface for {@link GLFWDropCallback}. */
	public interface SAMBuffer {
		void invoke(long window, ByteBuffer[] names);
	}

	/**
	 * Creates a {@link GLFWDropCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWDropCallback} instance
	 */
	public static GLFWDropCallback createBuffer(SAMBuffer sam) {
		return new GLFWDropCallback() {
			@Override
			public void invoke(long window, int count, long names) {
				sam.invoke(window, getNamesBuffer(count, names));
			}
		};
	}

	/** A functional interface for {@link GLFWDropCallback}. */
	public interface SAMString {
		void invoke(long window, String[] names);
	}

	/**
	 * Creates a {@link GLFWDropCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWDropCallback} instance
	 */
	public static GLFWDropCallback createString(SAMString sam) {
		return new GLFWDropCallback() {
			@Override
			public void invoke(long window, int count, long names) {
				sam.invoke(window, getNames(count, names));
			}
		};
	}

	/**
	 * Converts the specified {@link GLFWDropCallback} arguments to a ByteBuffer array.
	 *
	 * <p>This method may only be used inside a GLFWdropCallback invocation. If you wish to use the array after the callback returns, you need to make a deep
	 * copy.</p>
	 *
	 * @param count the number of dropped files
	 * @param names pointer to the array of UTF-8 encoded path names of the dropped files
	 *
	 * @return the array of names, as ByteBuffers
	 */
	public static ByteBuffer[] getNamesBuffer(int count, long names) {
		ByteBuffer[] buffers = new ByteBuffer[count];

		for ( int i = 0; i < count; i++ )
			buffers[i] = memByteBufferNT1(memGetAddress(names + POINTER_SIZE * i));

		return buffers;
	}

	/**
	 * Converts the specified {@link GLFWDropCallback} arguments to a String array.
	 *
	 * <p>This method may only be used inside a GLFWdropCallback invocation.</p>
	 *
	 * @param count the number of dropped files
	 * @param names pointer to the array of UTF-8 encoded path names of the dropped files
	 *
	 * @return the array of names, as Strings
	 */
	public static String[] getNames(int count, long names) {
		String[] strings = new String[count];

		for ( int i = 0; i < count; i++ )
			strings[i] = memUTF8(memGetAddress(names + POINTER_SIZE * i));

		return strings;
	}

	/** A functional interface that can be used with {@link #apply(int, long, ConsumerBuffer) apply}. */
	public interface ConsumerBuffer {
		void accept(int index, ByteBuffer name);
	}

	/** A functional interface that can be used with {@link #apply(int, long, ConsumerString) apply}. */
	public interface ConsumerString {
		void accept(int index, String name);
	}

	/**
	 * Applies the specified {@link ConsumerBuffer} to the specified {@link GLFWDropCallback} arguments.
	 *
	 * <p>This method may only be used inside a GLFWDropCallback invocation.</p>
	 *
	 * @param count    the number of dropped files
	 * @param names    pointer to the array of UTF-8 encoded path names of the dropped files
	 * @param consumer the {@link ConsumerBuffer} to apply
	 */
	public static void apply(int count, long names, ConsumerBuffer consumer) {
		for ( int i = 0; i < count; i++ )
			consumer.accept(i, memByteBufferNT1(memGetAddress(names + POINTER_SIZE * i)));
	}

	/**
	 * Applies the specified {@link ConsumerString} to the specified {@link GLFWDropCallback} arguments.
	 *
	 * <p>This method may only be used inside a GLFWDropCallback invocation.</p>
	 *
	 * @param count    the number of dropped files
	 * @param names    pointer to the array of UTF-8 encoded path names of the dropped files
	 * @param consumer the {@link ConsumerString} to apply
	 */
	public static void apply(int count, long names, ConsumerString consumer) {
		for ( int i = 0; i < count; i++ )
			consumer.accept(i, memUTF8(memGetAddress(names + POINTER_SIZE * i)));
	}

	/** See {@link GLFW#glfwSetDropCallback SetDropCallback}. */
	public GLFWDropCallback set(long window) {
		glfwSetDropCallback(window, this);
		return this;
	}

}