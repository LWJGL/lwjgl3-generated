/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link ARBDebugOutput#glDebugMessageCallbackARB DebugMessageCallbackARB} method. */
@FunctionalInterface
public interface GLDebugMessageARBCallback extends Callback.V {

	/** Creates a {@code GLDebugMessageARBCallback} instance from the specified function pointer. */
	static GLDebugMessageARBCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLDebugMessageARBCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLDebugMessageARBCallback} instance that delegates to the specified {@code GLDebugMessageARBCallback} instance. */
	static GLDebugMessageARBCallback create(GLDebugMessageARBCallback sam) {
		return new GLDebugMessageARBCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(iiiiipp)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when a debug message is generated.
	 *
	 * @param source    the message source
	 * @param type      the message type
	 * @param id        the message ID
	 * @param severity  the message severity
	 * @param length    the message length, excluding the null-terminator
	 * @param message   a pointer to the message string representation
	 * @param userParam the user-specified value that was passed when calling {@link ARBDebugOutput#glDebugMessageCallbackARB DebugMessageCallbackARB}
	 */
	void invoke(int source, int type, int id, int severity, int length, long message, long userParam);

	/**
	 * Converts the specified {@link GLDebugMessageARBCallback} arguments to a String.
	 *
	 * <p>This method may only be used inside a GLDebugMessageARBCallback invocation.</p>
	 *
	 * @param length  the GLDebugMessageARBCallback {@code length} argument
	 * @param message the GLDebugMessageARBCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	static String getMessage(int length, long message) {
		return memUTF8(memByteBuffer(message, length));
	}

}

final class GLDebugMessageARBCallbackHandle extends Pointer.Default implements GLDebugMessageARBCallback {

	private final GLDebugMessageARBCallback delegate;

	GLDebugMessageARBCallbackHandle(long functionPointer, GLDebugMessageARBCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
		delegate.invoke(source, type, id, severity, length, message, userParam);
	}

}