/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link ARBDebugOutput#glDebugMessageCallbackARB DebugMessageCallbackARB} method. */
public abstract class GLDebugMessageARBCallback extends Callback implements GLDebugMessageARBCallbackI {

	/** Creates a {@code GLDebugMessageARBCallback} instance from the specified function pointer. */
	public static GLDebugMessageARBCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		GLDebugMessageARBCallbackI instance = Callback.get(functionPointer);
		return instance instanceof GLDebugMessageARBCallback
			? (GLDebugMessageARBCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code GLDebugMessageARBCallback} instance that delegates to the specified {@code GLDebugMessageARBCallbackI} instance. */
	public static GLDebugMessageARBCallback create(GLDebugMessageARBCallbackI instance) {
		return instance instanceof GLDebugMessageARBCallback
			? (GLDebugMessageARBCallback)instance
			: new Container(instance.address(), instance);
	}

	protected GLDebugMessageARBCallback() {
		super(NULL);
		address = GLDebugMessageARBCallbackI.super.address();
	}

	private GLDebugMessageARBCallback(long functionPointer) {
		super(functionPointer);
	}

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
	public static String getMessage(int length, long message) {
		return memUTF8(memByteBuffer(message, length));
	}

	private static final class Container extends GLDebugMessageARBCallback {

		private final GLDebugMessageARBCallbackI delegate;

		Container(long functionPointer, GLDebugMessageARBCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
			delegate.invoke(source, type, id, severity, length, message, userParam);
		}

	}

}