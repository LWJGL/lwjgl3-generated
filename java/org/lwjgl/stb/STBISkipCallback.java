/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@code skip} field of the {@link STBIIOCallbacks} struct. */
@FunctionalInterface
public interface STBISkipCallback extends Callback.V {

	/** Creates a {@code STBISkipCallback} instance from the specified function pointer. */
	static STBISkipCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new STBISkipCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code STBISkipCallback} instance that delegates to the specified {@code STBISkipCallback} instance. */
	static STBISkipCallback create(STBISkipCallback sam) {
		return new STBISkipCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pi)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * The {@code stbi_io_callbacks.skip} callback.
	 *
	 * @param user a pointer to user data
	 * @param n    the number of bytes to skip if positive, or <em>unget</em> the last {@code -n} bytes if negative
	 */
	void invoke(long user, int n);

}

final class STBISkipCallbackHandle extends Pointer.Default implements STBISkipCallback {

	private final STBISkipCallback delegate;

	STBISkipCallbackHandle(long functionPointer, STBISkipCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long user, int n) {
		delegate.invoke(user, n);
	}

}