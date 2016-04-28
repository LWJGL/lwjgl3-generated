/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link ALTERALiveObjectTracking#clReportLiveObjectsAltera ReportLiveObjectsAltera} method. */
public abstract class CLReportLiveObjectsAlteraCallback extends Callback implements CLReportLiveObjectsAlteraCallbackI {

	/** Creates a {@code CLReportLiveObjectsAlteraCallback} instance from the specified function pointer. */
	public static CLReportLiveObjectsAlteraCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		CLReportLiveObjectsAlteraCallbackI instance = Callback.get(functionPointer);
		return instance instanceof CLReportLiveObjectsAlteraCallback
			? (CLReportLiveObjectsAlteraCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code CLReportLiveObjectsAlteraCallback} instance that delegates to the specified {@code CLReportLiveObjectsAlteraCallbackI} instance. */
	public static CLReportLiveObjectsAlteraCallback create(CLReportLiveObjectsAlteraCallbackI instance) {
		return instance instanceof CLReportLiveObjectsAlteraCallback
			? (CLReportLiveObjectsAlteraCallback)instance
			: new Container(instance.address(), instance);
	}

	protected CLReportLiveObjectsAlteraCallback() {
		super(NULL);
		address = CLReportLiveObjectsAlteraCallbackI.super.address();
	}

	private CLReportLiveObjectsAlteraCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends CLReportLiveObjectsAlteraCallback {

		private final CLReportLiveObjectsAlteraCallbackI delegate;

		Container(long functionPointer, CLReportLiveObjectsAlteraCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long user_data, long obj_ptr, long type_name, int refcount) {
			delegate.invoke(user_data, obj_ptr, type_name, refcount);
		}

	}

}