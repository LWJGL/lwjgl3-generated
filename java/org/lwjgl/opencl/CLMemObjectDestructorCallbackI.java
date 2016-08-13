/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL11#clSetMemObjectDestructorCallback SetMemObjectDestructorCallback} method. */
@FunctionalInterface
public interface CLMemObjectDestructorCallbackI extends CallbackI.V {

	String SIGNATURE = Callback.__stdcall("(pp)v");

	@Override
	default String getSignature() { return SIGNATURE; }

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