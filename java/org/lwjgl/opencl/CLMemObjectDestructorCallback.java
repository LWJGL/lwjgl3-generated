/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.lang.reflect.Method;

import static org.lwjgl.system.APIUtil.*;

/** Instances of this class can be used to receive OpenCL memory object destruction notifications. */
public abstract class CLMemObjectDestructorCallback {

	public static final long CALLBACK = setup(apiCallbackMethod(CLMemObjectDestructorCallback.class, long.class));

	private static native long setup(Method callback);

	/**
	 * The callback method.
	 *
	 * @param memobj 
	 */
	public abstract int invoke(long memobj);

}