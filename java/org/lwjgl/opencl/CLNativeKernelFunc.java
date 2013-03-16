/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.lang.reflect.Method;

import static org.lwjgl.system.APIUtil.*;

/** Native kernel. */
public abstract class CLNativeKernelFunc {

	public static final long CALLBACK = setup(apiCallbackMethod(CLNativeKernelFunc.class));

	private static native long setup(Method callback);

	/** The callback method. */
	public abstract int invoke();

}