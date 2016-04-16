/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link ALTERALiveObjectTracking#ReportLiveObjectsAltera} method. */
public abstract class CLReportLiveObjectsAlteraCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.opencl.CLReportLiveObjectsAlteraCallback");

	protected CLReportLiveObjectsAlteraCallback() {
		super(CALL_CONVENTION_SYSTEM + "(pppi)v", CLASSPATH);
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
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Reports a live OpenCL API object.
	 *
	 * @param user_data the {@code user_data} argument specified to {@link ALTERALiveObjectTracking#clReportLiveObjectsAltera}
	 * @param obj_ptr   a pointer to the live object
	 * @param type_name a C string corresponding to the OpenCL API object type. For example, a leaked {@code cl_mem} object will have "cl_mem" as its type string.
	 * @param refcount  an instantaneous reference count for the object. Consider it to be immediately stale.
	 */
	public abstract void invoke(long user_data, long obj_ptr, long type_name, int refcount);

	/** A functional interface for {@link CLReportLiveObjectsAlteraCallback}. */
	public interface SAM {
		void invoke(long user_data, long obj_ptr, long type_name, int refcount);
	}

	/**
	 * Creates a {@link CLReportLiveObjectsAlteraCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLReportLiveObjectsAlteraCallback} instance
	 */
	public static CLReportLiveObjectsAlteraCallback create(SAM sam) {
		return new CLReportLiveObjectsAlteraCallback() {
			@Override
			public void invoke(long user_data, long obj_ptr, long type_name, int refcount) {
				sam.invoke(user_data, obj_ptr, type_name, refcount);
			}
		};
	}

}