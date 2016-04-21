/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import java.nio.*;

/** Instances of this class may be used with the {@link STBImageWrite} {@code write_type_to_func} functions. */
public abstract class STBIWriteCallback extends Callback implements STBIWriteCallbackI {

	/** Creates a {@code STBIWriteCallback} instance from the specified function pointer. */
	public static STBIWriteCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		STBIWriteCallbackI instance = Callback.get(functionPointer);
		return instance instanceof STBIWriteCallback
			? (STBIWriteCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code STBIWriteCallback} instance that delegates to the specified {@code STBIWriteCallbackI} instance. */
	public static STBIWriteCallback create(STBIWriteCallbackI instance) {
		return instance instanceof STBIWriteCallback
			? (STBIWriteCallback)instance
			: new Container(instance.address(), instance);
	}

	protected STBIWriteCallback() {
		super(NULL);
		address = STBIWriteCallbackI.super.address();
	}

	private STBIWriteCallback(long functionPointer) {
		super(functionPointer);
	}

	/**
	 * Converts the specified {@link STBIWriteCallback} arguments to a ByteBuffer.
	 *
	 * <p>This method may only be used inside a STBIWriteCallback invocation.</p>
	 *
	 * @param data the STBIWriteCallback {@code data} argument
	 * @param size the STBIWriteCallback {@code size} argument
	 *
	 * @return the data as a ByteBuffer
	 */
	public static ByteBuffer getData(long data, int size) {
		return memByteBuffer(data, size);
	}

	private static final class Container extends STBIWriteCallback {

		private final STBIWriteCallbackI delegate;

		Container(long functionPointer, STBIWriteCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long context, long data, int size) {
			delegate.invoke(context, data, size);
		}

	}

}