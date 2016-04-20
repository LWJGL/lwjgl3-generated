/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link AMDDebugOutput#glDebugMessageCallbackAMD DebugMessageCallbackAMD} method. */
@FunctionalInterface
public interface GLDebugMessageAMDCallback extends Callback.V {

	/** Creates a {@code GLDebugMessageAMDCallback} instance from the specified function pointer. */
	static GLDebugMessageAMDCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new GLDebugMessageAMDCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code GLDebugMessageAMDCallback} instance that delegates to the specified {@code GLDebugMessageAMDCallback} instance. */
	static GLDebugMessageAMDCallback create(GLDebugMessageAMDCallback sam) {
		return new GLDebugMessageAMDCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(iiiipp)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
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
	 * @param id        the message ID
	 * @param category  the message category
	 * @param severity  the message severity
	 * @param length    the message length, excluding the null-terminator
	 * @param message   a pointer to the message string representation
	 * @param userParam the user-specified value that was passed when calling {@link AMDDebugOutput#glDebugMessageCallbackAMD DebugMessageCallbackAMD}
	 */
	void invoke(int id, int category, int severity, int length, long message, long userParam);

	/**
	 * Converts the specified {@link GLDebugMessageAMDCallback} arguments to a String.
	 *
	 * <p>This method may only be used inside a GLDebugMessageAMDCallback invocation.</p>
	 *
	 * @param length  the GLDebugMessageAMDCallback {@code length} argument
	 * @param message the GLDebugMessageAMDCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	static String getMessage(int length, long message) {
		return memUTF8(memByteBuffer(message, length));
	}

}

final class GLDebugMessageAMDCallbackHandle extends Pointer.Default implements GLDebugMessageAMDCallback {

	private final GLDebugMessageAMDCallback delegate;

	GLDebugMessageAMDCallbackHandle(long functionPointer, GLDebugMessageAMDCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(int id, int category, int severity, int length, long message, long userParam) {
		delegate.invoke(id, category, severity, length, message, userParam);
	}

}