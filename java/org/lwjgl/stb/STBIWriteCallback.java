/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import java.nio.*;

/** Instances of this interface may be used with the {@link STBImageWrite} {@code write_type_to_func} functions. */
@FunctionalInterface
public interface STBIWriteCallback extends Callback.V {

	/** Creates a {@code STBIWriteCallback} instance from the specified function pointer. */
	static STBIWriteCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new STBIWriteCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code STBIWriteCallback} instance that delegates to the specified {@code STBIWriteCallback} instance. */
	static STBIWriteCallback create(STBIWriteCallback sam) {
		return new STBIWriteCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(ppi)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * The {@code stbi_write_func} callback.
	 *
	 * @param context the context passed to the write function
	 * @param data    the data to write
	 * @param size    the number of bytes in {@code data}
	 */
	void invoke(long context, long data, int size);

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
	static ByteBuffer getData(long data, int size) {
		return memByteBuffer(data, size);
	}

}

final class STBIWriteCallbackHandle extends Pointer.Default implements STBIWriteCallback {

	private final STBIWriteCallback delegate;

	STBIWriteCallbackHandle(long functionPointer, STBIWriteCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long context, long data, int size) {
		delegate.invoke(context, data, size);
	}

}