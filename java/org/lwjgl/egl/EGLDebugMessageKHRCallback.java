/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link KHRDebug#eglDebugMessageControlKHR DebugMessageControlKHR} method. */
@FunctionalInterface
public interface EGLDebugMessageKHRCallback extends Callback.V {

	/** Creates a {@code EGLDebugMessageKHRCallback} instance from the specified function pointer. */
	static EGLDebugMessageKHRCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new EGLDebugMessageKHRCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code EGLDebugMessageKHRCallback} instance that delegates to the specified {@code EGLDebugMessageKHRCallback} instance. */
	static EGLDebugMessageKHRCallback create(EGLDebugMessageKHRCallback sam) {
		return new EGLDebugMessageKHRCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(ipippp)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgInt(args),
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when a debug message is generated.
	 *
	 * @param error       will contain an EGL error code, or {@link EGL10#EGL_SUCCESS SUCCESS}, as applicable
	 * @param command     will contain a pointer to a string. Example "eglBindApi".
	 * @param messageType will contain one of the debug message types
	 * @param threadLabel will contain the label attached to the current thread. The {@code threadLabel} will be {@code NULL} if not set by the application. If the message is from an
	 *                    internal thread, the label will be {@code NULL}.
	 * @param objectLabel will contain the label attached to the primary object of the message; Labels will be {@code NULL} if not set by the application. The primary object should
	 *                    be the object the function operates on, see table 13.2 which provides the recommended mapping between functions and their primary object. This
	 *                    {@code objectLabel} may be {@code NULL} even though the application labeled the object. This is because it is possible an error was raised while executing
	 *                    the command before the primary object was validated, therefore its label can not be included in the callback.
	 * @param message     will contain a platform specific debug string message; This string should provide added information to the application developer regarding the
	 *                    condition that generated the message. The format of a message is implementation-defined, although it should represent a concise description of the
	 *                    event that caused the message to be generated. Message strings can be {@code NULL} and should not be assumed otherwise.
	 */
	void invoke(int error, long command, int messageType, long threadLabel, long objectLabel, long message);

	/**
	 * Converts the specified {@link EGLDebugMessageKHRCallback} argument to a String.
	 *
	 * <p>This method may only be used inside an EGLDebugMessageKHRCallback invocation.</p>
	 *
	 * @param command the EGLDebugMessageKHRCallback {@code command} argument
	 *
	 * @return the command as a String
	 */
	static String getCommand(long command) {
		return memASCII(command);
	}

	/**
	 * Converts the specified {@link EGLDebugMessageKHRCallback} argument to a String.
	 *
	 * <p>This method may only be used inside an EGLDebugMessageKHRCallback invocation.</p>
	 *
	 * @param message the EGLDebugMessageKHRCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	static String getMessage(long message) {
		return memUTF8(message);
	}

}

final class EGLDebugMessageKHRCallbackHandle extends Pointer.Default implements EGLDebugMessageKHRCallback {

	private final EGLDebugMessageKHRCallback delegate;

	EGLDebugMessageKHRCallbackHandle(long functionPointer, EGLDebugMessageKHRCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(int error, long command, int messageType, long threadLabel, long objectLabel, long message) {
		delegate.invoke(error, command, messageType, threadLabel, objectLabel, message);
	}

}