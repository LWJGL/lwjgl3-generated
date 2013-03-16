/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to the EXT_thread_local_context ALC extension. */
public final class EXTThreadLocalContext {

	private EXTThreadLocalContext() {}

	// --- [ alcSetThreadContext ] ---

	/** JNI method for {@link #alcSetThreadContext(long)} */
	public static native boolean nalcSetThreadContext(long context, long __functionAddress);

	/**
	 * Makes a context current with respect to OpenAL operation on the current thread. The context parameter can be NULL or a valid context pointer. Using NULL
	 * results in no thread-specific context being current in the calling thread, which is useful when shutting OpenAL down.
	 *
	 * @param context the context to make current
	 */
	public static boolean alcSetThreadContext(long context) {
		long __functionAddress = getInstance().alcSetThreadContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
		}
		return nalcSetThreadContext(context, __functionAddress);
	}

	// --- [ alcGetThreadContext ] ---

	/** JNI method for {@link #alcGetThreadContext()} */
	public static native long nalcGetThreadContext(long __functionAddress);

	/**
	 * Returns a handle for the context that is currently affecting the thread. This will return a handle to the current thread-specific context if it is not
	 * NULL, otherwise it will return the last set process-wide context.
	 */
	public static long alcGetThreadContext() {
		long __functionAddress = getInstance().alcGetThreadContext;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalcGetThreadContext(__functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return ALC.getCapabilities().__EXTThreadLocalContext;
	}

	static Functions create(java.util.Set<String> ext, FunctionProviderLocal provider, long device) {		if ( !ext.contains("ALC_EXT_thread_local_context") ) return null;

		Functions funcs = new Functions(provider, device);

		boolean supported = 
			funcs.alcSetThreadContext != 0L &&
			funcs.alcGetThreadContext != 0L;

		return ALC.checkExtension("ALC_EXT_thread_local_context", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code EXTThreadLocalContext}. */
	public static final class Functions implements FunctionMap {

		public final long
			alcSetThreadContext,
			alcGetThreadContext;

		public Functions(FunctionProviderLocal provider, long device) {
			alcSetThreadContext = provider.getFunctionAddress(device, "alcSetThreadContext");
			alcGetThreadContext = provider.getFunctionAddress(device, "alcGetThreadContext");
		}

	}

}