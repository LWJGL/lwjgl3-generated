/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@code LogCallback} member of the {@link OVRInitParams} struct. */
public abstract class OVRLogCallback extends Callback implements OVRLogCallbackI {

	/** Creates a {@code OVRLogCallback} instance from the specified function pointer. */
	public static OVRLogCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		OVRLogCallbackI instance = Callback.get(functionPointer);
		return instance instanceof OVRLogCallback
			? (OVRLogCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code OVRLogCallback} instance that delegates to the specified {@code OVRLogCallbackI} instance. */
	public static OVRLogCallback create(OVRLogCallbackI instance) {
		return instance instanceof OVRLogCallback
			? (OVRLogCallback)instance
			: new Container(instance.address(), instance);
	}

	protected OVRLogCallback() {
		super(NULL);
		address = OVRLogCallbackI.super.address();
	}

	private OVRLogCallback(long functionPointer) {
		super(functionPointer);
	}

	/**
	 * Converts the specified {@link OVRLogCallback} argument to a String.
	 *
	 * <p>This method may only be used inside a OVRLogCallback invocation.</p>
	 *
	 * @param message the OVRLogCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	public static String getMessage(long message) {
		return memUTF8(message);
	}

	private static final class Container extends OVRLogCallback {

		private final OVRLogCallbackI delegate;

		Container(long functionPointer, OVRLogCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long userData, int level, long message) {
			delegate.invoke(userData, level, message);
		}

	}

}