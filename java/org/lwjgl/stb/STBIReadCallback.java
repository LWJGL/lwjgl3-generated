/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import java.nio.*;

/** Instances of this class may be set to the {@code read} field of the {@link STBIIOCallbacks} struct. */
public abstract class STBIReadCallback extends Callback implements STBIReadCallbackI {

	/** Creates a {@code STBIReadCallback} instance from the specified function pointer. */
	public static STBIReadCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		STBIReadCallbackI instance = Callback.get(functionPointer);
		return instance instanceof STBIReadCallback
			? (STBIReadCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code STBIReadCallback} instance that delegates to the specified {@code STBIReadCallbackI} instance. */
	public static STBIReadCallback create(STBIReadCallbackI instance) {
		return instance instanceof STBIReadCallback
			? (STBIReadCallback)instance
			: new Container(instance.address(), instance);
	}

	protected STBIReadCallback() {
		super(NULL);
		address = STBIReadCallbackI.super.address();
	}

	private STBIReadCallback(long functionPointer) {
		super(functionPointer);
	}

	/**
	 * Converts the specified {@link STBIReadCallback} arguments to a ByteBuffer.
	 *
	 * <p>This method may only be used inside a STBIReadCallback invocation.</p>
	 *
	 * @param data the STBIReadCallback {@code data} argument
	 * @param size the STBIReadCallback {@code size} argument
	 *
	 * @return the data as a ByteBuffer
	 */
	public static ByteBuffer getData(long data, int size) {
		return memByteBuffer(data, size);
	}

	private static final class Container extends STBIReadCallback {

		private final STBIReadCallbackI delegate;

		Container(long functionPointer, STBIReadCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public int invoke(long user, long data, int size) {
			return delegate.invoke(user, data, size);
		}

	}

}