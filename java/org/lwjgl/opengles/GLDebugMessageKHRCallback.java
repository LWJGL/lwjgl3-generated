/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link KHRDebug#glDebugMessageCallbackKHR DebugMessageCallbackKHR} method. */
@FunctionalInterface
public interface GLDebugMessageKHRCallback extends Callback.V {

	/** Creates a {@code GLDebugMessageKHRCallback} instance from the specified function pointer. */
	static GLDebugMessageKHRCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLDebugMessageKHRCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLDebugMessageKHRCallback} instance that delegates to the specified {@code GLDebugMessageKHRCallback} instance. */
	static GLDebugMessageKHRCallback create(GLDebugMessageKHRCallback sam) {
		return new GLDebugMessageKHRCallbackHandle(sam.address(), sam);
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
	 * @param userParam the user-specified value that was passed when calling {@link KHRDebug#glDebugMessageCallbackKHR DebugMessageCallbackKHR}
	 */
	void invoke(int source, int type, int id, int severity, int length, long message, long userParam);

	/**
	 * Converts the specified {@link GLDebugMessageKHRCallback} arguments to a String.
	 *
	 * <p>This method may only be used inside a GLDebugMessageKHRCallback invocation.</p>
	 *
	 * @param length  the GLDebugMessageKHRCallback {@code length} argument
	 * @param message the GLDebugMessageKHRCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	static String getMessage(int length, long message) {
		return memUTF8(memByteBuffer(message, length));
	}

}

final class GLDebugMessageKHRCallbackHandle extends Pointer.Default implements GLDebugMessageKHRCallback {

	private final GLDebugMessageKHRCallback delegate;

	GLDebugMessageKHRCallbackHandle(long functionPointer, GLDebugMessageKHRCallback delegate) {
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