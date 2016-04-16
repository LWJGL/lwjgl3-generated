/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL11#clSetMemObjectDestructorCallback SetMemObjectDestructorCallback} method. */
public abstract class CLMemObjectDestructorCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.opencl.CLMemObjectDestructorCallback");

	protected CLMemObjectDestructorCallback() {
		super(CALL_CONVENTION_SYSTEM + "(pp)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
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
	public abstract void invoke(long memobj, long user_data);

	/** A functional interface for {@link CLMemObjectDestructorCallback}. */
	public interface SAM {
		void invoke(long memobj, long user_data);
	}

	/**
	 * Creates a {@link CLMemObjectDestructorCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLMemObjectDestructorCallback} instance
	 */
	public static CLMemObjectDestructorCallback create(SAM sam) {
		return new CLMemObjectDestructorCallback() {
			@Override
			public void invoke(long memobj, long user_data) {
				sam.invoke(memobj, user_data);
			}
		};
	}

}