/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@code eof} field of the {@link STBIIOCallbacks} struct. */
@FunctionalInterface
public interface STBIEOFCallback extends Callback.I {

	/** Creates a {@code STBIEOFCallback} instance from the specified function pointer. */
	static STBIEOFCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new STBIEOFCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code STBIEOFCallback} instance that delegates to the specified {@code STBIEOFCallback} instance. */
	static STBIEOFCallback create(STBIEOFCallback sam) {
		return new STBIEOFCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(p)i", false);
	}

	@Override
	default int callback(long args) {
		return invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * The {@code stbi_io_callbacks.eof} callback.
	 *
	 * @param user a pointer to user data
	 *
	 * @return nonzero if we are at the end of file/data
	 */
	int invoke(long user);

}

final class STBIEOFCallbackHandle extends Pointer.Default implements STBIEOFCallback {

	private final STBIEOFCallback delegate;

	STBIEOFCallbackHandle(long functionPointer, STBIEOFCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public int invoke(long user) {
		return delegate.invoke(user);
	}

}