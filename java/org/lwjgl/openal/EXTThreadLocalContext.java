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

	/** Function address. */
	@JavadocExclude
	public final long
		SetThreadContext,
		GetThreadContext;

	@JavadocExclude
	public EXTThreadLocalContext(FunctionProviderLocal provider, long device) {
		SetThreadContext = provider.getFunctionAddress(device, "alcSetThreadContext");
		GetThreadContext = provider.getFunctionAddress(device, "alcGetThreadContext");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTThreadLocalContext} instance for the current context. */
	public static EXTThreadLocalContext getInstance() {
		return ALC.getCapabilities().__EXTThreadLocalContext;
	}

	static EXTThreadLocalContext create(java.util.Set<String> ext, FunctionProviderLocal provider, long device) {
		if ( !ext.contains("ALC_EXT_thread_local_context") ) return null;

		EXTThreadLocalContext funcs = new EXTThreadLocalContext(provider, device);

		boolean supported = checkFunctions(
			funcs.SetThreadContext, funcs.GetThreadContext
		);

		return ALC.checkExtension("ALC_EXT_thread_local_context", funcs, supported);
	}

	// --- [ alcSetThreadContext ] ---

	/** JNI method for {@link #alcSetThreadContext SetThreadContext} */
	@JavadocExclude
	public static native boolean nalcSetThreadContext(long context, long __functionAddress);

	/**
	 * Makes a context current with respect to OpenAL operation on the current thread. The context parameter can be NULL or a valid context pointer. Using NULL
	 * results in no thread-specific context being current in the calling thread, which is useful when shutting OpenAL down.
	 *
	 * @param context the context to make current
	 */
	public static boolean alcSetThreadContext(long context) {
		long __functionAddress = getInstance().SetThreadContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
		}
		return nalcSetThreadContext(context, __functionAddress);
	}

	// --- [ alcGetThreadContext ] ---

	/** JNI method for {@link #alcGetThreadContext GetThreadContext} */
	@JavadocExclude
	public static native long nalcGetThreadContext(long __functionAddress);

	/**
	 * Returns a handle for the context that is currently affecting the thread. This will return a handle to the current thread-specific context if it is not
	 * NULL, otherwise it will return the last set process-wide context.
	 */
	public static long alcGetThreadContext() {
		long __functionAddress = getInstance().GetThreadContext;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalcGetThreadContext(__functionAddress);
	}

}