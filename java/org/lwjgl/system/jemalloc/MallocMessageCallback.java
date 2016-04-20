/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link JEmalloc#je_malloc_usable_size malloc_usable_size} method. */
@FunctionalInterface
public interface MallocMessageCallback extends Callback.V {

	/** Creates a {@code MallocMessageCallback} instance from the specified function pointer. */
	static MallocMessageCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new MallocMessageCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code MallocMessageCallback} instance that delegates to the specified {@code MallocMessageCallback} instance. */
	static MallocMessageCallback create(MallocMessageCallback sam) {
		return new MallocMessageCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pp)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called by the {@link JEmalloc#je_malloc_usable_size malloc_usable_size} method.
	 *
	 * @param cbopaque the opaque pointer passed to {@link JEmalloc#je_malloc_usable_size malloc_usable_size}
	 * @param s        the message
	 */
	void invoke(long cbopaque, long s);

	/**
	 * Converts the specified {@link MallocMessageCallback} arguments to a String.
	 *
	 * <p>This method may only be used inside a MallocMessageCallback invocation.</p>
	 *
	 * @param s the MallocMessageCallback {@code s} argument
	 *
	 * @return the message as a String
	 */
	static String getMessage(long s) {
		return memASCII(s);
	}

}

final class MallocMessageCallbackHandle extends Pointer.Default implements MallocMessageCallback {

	private final MallocMessageCallback delegate;

	MallocMessageCallbackHandle(long functionPointer, MallocMessageCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long cbopaque, long s) {
		delegate.invoke(cbopaque, s);
	}

}