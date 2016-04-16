/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL10#clEnqueueNativeKernel EnqueueNativeKernel} method. */
public abstract class CLNativeKernel extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.opencl.CLNativeKernel");

	protected CLNativeKernel() {
		super(CALL_CONVENTION_SYSTEM + "(p)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called by the OpenCL using {@link CL10#clEnqueueNativeKernel EnqueueNativeKernel}.
	 *
	 * @param args a pointer to the arguments list
	 */
	public abstract void invoke(long args);

	/** A functional interface for {@link CLNativeKernel}. */
	public interface SAM {
		void invoke(long args);
	}

	/**
	 * Creates a {@link CLNativeKernel} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLNativeKernel} instance
	 */
	public static CLNativeKernel create(SAM sam) {
		return new CLNativeKernel() {
			@Override
			public void invoke(long args) {
				sam.invoke(args);
			}
		};
	}

}