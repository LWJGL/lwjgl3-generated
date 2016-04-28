/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link ALTERALiveObjectTracking#clReportLiveObjectsAltera ReportLiveObjectsAltera} method. */
@FunctionalInterface
public interface CLReportLiveObjectsAlteraCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pppi)v", true);
	}

	@Override
	default void callback(long args) {
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
	 * @param user_data the {@code user_data} argument specified to {@link ALTERALiveObjectTracking#clReportLiveObjectsAltera ReportLiveObjectsAltera}
	 * @param obj_ptr   a pointer to the live object
	 * @param type_name a C string corresponding to the OpenCL API object type. For example, a leaked {@code cl_mem} object will have "cl_mem" as its type string.
	 * @param refcount  an instantaneous reference count for the object. Consider it to be immediately stale.
	 */
	void invoke(long user_data, long obj_ptr, long type_name, int refcount);

}