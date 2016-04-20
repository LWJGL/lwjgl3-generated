/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** A mutation handler. */
@FunctionalInterface
public interface EnumerationMutationHandler extends Callback.V {

	/** Creates a {@code EnumerationMutationHandler} instance from the specified function pointer. */
	static EnumerationMutationHandler create(long functionPointer) {
		return functionPointer == NULL ? null : new EnumerationMutationHandlerHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code EnumerationMutationHandler} instance that delegates to the specified {@code EnumerationMutationHandler} instance. */
	static EnumerationMutationHandler create(EnumerationMutationHandler sam) {
		return new EnumerationMutationHandlerHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(p)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when an object is mutated during a foreach iteration.
	 *
	 * @param id the object that was mutated
	 */
	void invoke(long id);

}

final class EnumerationMutationHandlerHandle extends Pointer.Default implements EnumerationMutationHandler {

	private final EnumerationMutationHandler delegate;

	EnumerationMutationHandlerHandle(long functionPointer, EnumerationMutationHandler delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long id) {
		delegate.invoke(id);
	}

}