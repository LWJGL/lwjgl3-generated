/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link GLES32#glDebugMessageCallback DebugMessageCallback} method. */
public abstract class GLDebugMessageCallback extends Callback implements GLDebugMessageCallbackI {

	/** Creates a {@code GLDebugMessageCallback} instance from the specified function pointer. */
	public static GLDebugMessageCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLDebugMessageCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLDebugMessageCallback
			? (GLDebugMessageCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLDebugMessageCallback} instance that delegates to the specified {@code GLDebugMessageCallbackI} instance. */
	public static GLDebugMessageCallback create(GLDebugMessageCallbackI instance) {
		return instance instanceof GLDebugMessageCallback
			? (GLDebugMessageCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLDebugMessageCallback() {
		super(NULL);
		address = GLDebugMessageCallbackI.super.address();
	}

	private GLDebugMessageCallback(long functionPointer) {
		super(functionPointer);
	}

	/**
	 * Converts the specified {@link GLDebugMessageCallback} arguments to a String.
	 *
	 * <p>This method may only be used inside a GLDebugMessageCallback invocation.</p>
	 *
	 * @param length  the GLDebugMessageCallback {@code length} argument
	 * @param message the GLDebugMessageCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	public static String getMessage(int length, long message) {
		return memUTF8(memByteBuffer(message, length));
	}

	private static final class Container extends GLDebugMessageCallback {

		private final GLDebugMessageCallbackI delegate;

		Container(long functionPointer, GLDebugMessageCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
			delegate.invoke(source, type, id, severity, length, message, userParam);
		}

	}

}