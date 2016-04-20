/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL11#clSetMemObjectDestructorCallback SetMemObjectDestructorCallback} method. */
@FunctionalInterface
public interface CLMemObjectDestructorCallback extends Callback.V {

	/** Creates a {@code CLMemObjectDestructorCallback} instance from the specified function pointer. */
	static CLMemObjectDestructorCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new CLMemObjectDestructorCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code CLMemObjectDestructorCallback} instance that delegates to the specified {@code CLMemObjectDestructorCallback} instance. */
	static CLMemObjectDestructorCallback create(CLMemObjectDestructorCallback sam) {
		return new CLMemObjectDestructorCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pp)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when a memory object is deleted.
	 *
	 * @param memobj    the memory object that was deleted
	 * @param user_data the user-specified value that was passed when calling {@link CL11#clSetMemObjectDestructorCallback SetMemObjectDestructorCallback}
	 */
	void invoke(long memobj, long user_data);

}

final class CLMemObjectDestructorCallbackHandle extends Pointer.Default implements CLMemObjectDestructorCallback {

	private final CLMemObjectDestructorCallback delegate;

	CLMemObjectDestructorCallbackHandle(long functionPointer, CLMemObjectDestructorCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long memobj, long user_data) {
		delegate.invoke(memobj, user_data);
	}

}