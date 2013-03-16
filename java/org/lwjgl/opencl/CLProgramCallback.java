/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.lang.reflect.Method;

import static org.lwjgl.system.APIUtil.*;

/** Instances of this class can be used to receive program event notifications. */
public abstract class CLProgramCallback {

	public static final long CALLBACK = setup(apiCallbackMethod(CLProgramCallback.class, long.class));

	private static native long setup(Method callback);

	/**
	 * The callback method.
	 *
	 * @param program 
	 */
	public abstract int invoke(long program);

}