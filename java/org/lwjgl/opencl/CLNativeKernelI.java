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
@FunctionalInterface
public interface CLNativeKernelI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(p)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called by the OpenCL using {@link CL10#clEnqueueNativeKernel EnqueueNativeKernel}.
	 *
	 * @param args a pointer to the arguments list
	 */
	void invoke(long args);

}