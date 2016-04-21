/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link KHRDebug#glDebugMessageCallbackKHR DebugMessageCallbackKHR} method. */
public abstract class GLDebugMessageKHRCallback extends Callback implements GLDebugMessageKHRCallbackI {

	/** Creates a {@code GLDebugMessageKHRCallback} instance from the specified function pointer. */
	public static GLDebugMessageKHRCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLDebugMessageKHRCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLDebugMessageKHRCallback
			? (GLDebugMessageKHRCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLDebugMessageKHRCallback} instance that delegates to the specified {@code GLDebugMessageKHRCallbackI} instance. */
	public static GLDebugMessageKHRCallback create(GLDebugMessageKHRCallbackI instance) {
		return instance instanceof GLDebugMessageKHRCallback
			? (GLDebugMessageKHRCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLDebugMessageKHRCallback() {
		super(NULL);
		address = GLDebugMessageKHRCallbackI.super.address();
	}

	private GLDebugMessageKHRCallback(long functionPointer) {
		super(functionPointer);
	}

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
	public static String getMessage(int length, long message) {
		return memUTF8(memByteBuffer(message, length));
	}

	private static final class Container extends GLDebugMessageKHRCallback {

		private final GLDebugMessageKHRCallbackI delegate;

		Container(long functionPointer, GLDebugMessageKHRCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
			delegate.invoke(source, type, id, severity, length, message, userParam);
		}

	}

}