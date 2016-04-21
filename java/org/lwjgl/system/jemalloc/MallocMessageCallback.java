/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link JEmalloc#je_malloc_usable_size malloc_usable_size} method. */
public abstract class MallocMessageCallback extends Callback implements MallocMessageCallbackI {

	/** Creates a {@code MallocMessageCallback} instance from the specified function pointer. */
	public static MallocMessageCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		MallocMessageCallbackI instance = Callback.get(functionPointer);
		return instance instanceof MallocMessageCallback
			? (MallocMessageCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code MallocMessageCallback} instance that delegates to the specified {@code MallocMessageCallbackI} instance. */
	public static MallocMessageCallback create(MallocMessageCallbackI instance) {
		return instance instanceof MallocMessageCallback
			? (MallocMessageCallback)instance
			: new Container(instance.address(), instance);
	}

	protected MallocMessageCallback() {
		super(NULL);
		address = MallocMessageCallbackI.super.address();
	}

	private MallocMessageCallback(long functionPointer) {
		super(functionPointer);
	}

	/**
	 * Converts the specified {@link MallocMessageCallback} arguments to a String.
	 *
	 * <p>This method may only be used inside a MallocMessageCallback invocation.</p>
	 *
	 * @param s the MallocMessageCallback {@code s} argument
	 *
	 * @return the message as a String
	 */
	public static String getMessage(long s) {
		return memASCII(s);
	}

	private static final class Container extends MallocMessageCallback {

		private final MallocMessageCallbackI delegate;

		Container(long functionPointer, MallocMessageCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long cbopaque, long s) {
			delegate.invoke(cbopaque, s);
		}

	}

}