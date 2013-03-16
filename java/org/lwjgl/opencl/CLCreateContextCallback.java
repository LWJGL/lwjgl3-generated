/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.lang.reflect.Method;

import static org.lwjgl.system.APIUtil.*;

/** Instances of this class can be used to receive context creation error notifications. */
public abstract class CLCreateContextCallback {

	public static final long CALLBACK = setup(apiCallbackMethod(CLCreateContextCallback.class, long.class, long.class, long.class));

	private static native long setup(Method callback);

	/**
	 * The callback method.
	 *
	 * @param errinfo      
	 * @param private_info 
	 * @param cb           
	 */
	public abstract int invoke(long errinfo, long private_info, long cb);

}