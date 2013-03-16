/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.lang.reflect.Method;

import static org.lwjgl.system.APIUtil.*;

/**
 * Instances of this class can be used to handle OpenCL event callbacks. A single CLEventCallback instance should only be used on events generated from the
 * same CLCommandQueue or on user events associated with the same CLContext.
 */
public abstract class CLEventCallback {

	public static final long CALLBACK = setup(apiCallbackMethod(CLEventCallback.class, long.class, int.class));

	private static native long setup(Method callback);

	/**
	 * The callback method.
	 *
	 * @param event                     
	 * @param event_command_exec_status 
	 */
	public abstract int invoke(long event, int event_command_exec_status);

}