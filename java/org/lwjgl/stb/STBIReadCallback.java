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

/** Instances of this interface may be set to the {@code read} field of the {@link STBIIOCallbacks} struct. */
@FunctionalInterface
public interface STBIReadCallback extends Callback.I {

	/** Creates a {@code STBIReadCallback} instance from the specified function pointer. */
	static STBIReadCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new STBIReadCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code STBIReadCallback} instance that delegates to the specified {@code STBIReadCallback} instance. */
	static STBIReadCallback create(STBIReadCallback sam) {
		return new STBIReadCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(ppi)i", false);
	}

	@Override
	default int callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * The {@code stbi_io_callbacks.read} callback.
	 *
	 * @param user a pointer to user data
	 * @param data the data buffer to fill
	 * @param size the number of bytes to read
	 *
	 * @return the number of bytes actually read
	 */
	int invoke(long user, long data, int size);

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
	static ByteBuffer getData(long data, int size) {
		return memByteBuffer(data, size);
	}

}

final class STBIReadCallbackHandle extends Pointer.Default implements STBIReadCallback {

	private final STBIReadCallback delegate;

	STBIReadCallbackHandle(long functionPointer, STBIReadCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public int invoke(long user, long data, int size) {
		return delegate.invoke(user, data, size);
	}

}