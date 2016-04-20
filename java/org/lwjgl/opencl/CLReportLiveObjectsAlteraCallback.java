/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link ALTERALiveObjectTracking#ReportLiveObjectsAltera} method. */
@FunctionalInterface
public interface CLReportLiveObjectsAlteraCallback extends Callback.V {

	/** Creates a {@code CLReportLiveObjectsAlteraCallback} instance from the specified function pointer. */
	static CLReportLiveObjectsAlteraCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new CLReportLiveObjectsAlteraCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code CLReportLiveObjectsAlteraCallback} instance that delegates to the specified {@code CLReportLiveObjectsAlteraCallback} instance. */
	static CLReportLiveObjectsAlteraCallback create(CLReportLiveObjectsAlteraCallback sam) {
		return new CLReportLiveObjectsAlteraCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pppi)v", true);
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
	 * @param user_data the {@code user_data} argument specified to {@link ALTERALiveObjectTracking#clReportLiveObjectsAltera}
	 * @param obj_ptr   a pointer to the live object
	 * @param type_name a C string corresponding to the OpenCL API object type. For example, a leaked {@code cl_mem} object will have "cl_mem" as its type string.
	 * @param refcount  an instantaneous reference count for the object. Consider it to be immediately stale.
	 */
	void invoke(long user_data, long obj_ptr, long type_name, int refcount);

}

final class CLReportLiveObjectsAlteraCallbackHandle extends Pointer.Default implements CLReportLiveObjectsAlteraCallback {

	private final CLReportLiveObjectsAlteraCallback delegate;

	CLReportLiveObjectsAlteraCallbackHandle(long functionPointer, CLReportLiveObjectsAlteraCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long user_data, long obj_ptr, long type_name, int refcount) {
		delegate.invoke(user_data, obj_ptr, type_name, refcount);
	}

}