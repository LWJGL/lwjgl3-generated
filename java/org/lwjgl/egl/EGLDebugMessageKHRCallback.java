/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link KHRDebug#eglDebugMessageControlKHR DebugMessageControlKHR} method. */
public abstract class EGLDebugMessageKHRCallback extends Callback implements EGLDebugMessageKHRCallbackI {

	/** Creates a {@code EGLDebugMessageKHRCallback} instance from the specified function pointer. */
	public static EGLDebugMessageKHRCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		EGLDebugMessageKHRCallbackI instance = Callback.get(functionPointer);
		return instance instanceof EGLDebugMessageKHRCallback
			? (EGLDebugMessageKHRCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code EGLDebugMessageKHRCallback} instance that delegates to the specified {@code EGLDebugMessageKHRCallbackI} instance. */
	public static EGLDebugMessageKHRCallback create(EGLDebugMessageKHRCallbackI instance) {
		return instance instanceof EGLDebugMessageKHRCallback
			? (EGLDebugMessageKHRCallback)instance
			: new Container(instance.address(), instance);
	}

	protected EGLDebugMessageKHRCallback() {
		super(NULL);
		address = EGLDebugMessageKHRCallbackI.super.address();
	}

	private EGLDebugMessageKHRCallback(long functionPointer) {
		super(functionPointer);
	}

	/**
	 * Converts the specified {@link EGLDebugMessageKHRCallback} argument to a String.
	 *
	 * <p>This method may only be used inside an EGLDebugMessageKHRCallback invocation.</p>
	 *
	 * @param command the EGLDebugMessageKHRCallback {@code command} argument
	 *
	 * @return the command as a String
	 */
	public static String getCommand(long command) {
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
	public static String getMessage(long message) {
		return memUTF8(message);
	}

	private static final class Container extends EGLDebugMessageKHRCallback {

		private final EGLDebugMessageKHRCallbackI delegate;

		Container(long functionPointer, EGLDebugMessageKHRCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(int error, long command, int messageType, long threadLabel, long objectLabel, long message) {
			delegate.invoke(error, command, messageType, threadLabel, objectLabel, message);
		}

	}

}