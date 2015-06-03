/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://kcat.strangesoft.net/openal-extensions/EXT_thread_local_context.txt">EXT_thread_local_context</a> extension.
 * 
 * <p>This extension introduces the concept of a current thread-local context, with each thread able to have its own current context. The current context is
 * what the al- functions work on, effectively allowing multiple threads to independently drive separate OpenAL playback contexts.</p>
 */
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
		return checkFunctionality(ALC.getCapabilities().__EXTThreadLocalContext);
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
	 * Makes a context current with respect to OpenAL operation on the current thread. The context parameter can be {@code NULL} or a valid context pointer. Using
	 * {@code NULL} results in no thread-specific context being current in the calling thread, which is useful when shutting OpenAL down.
	 *
	 * @param context the context to make current
	 */
	public static boolean alcSetThreadContext(long context) {
		long __functionAddress = getInstance().SetThreadContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nalcSetThreadContext(context, __functionAddress);
	}

	// --- [ alcGetThreadContext ] ---

	/** JNI method for {@link #alcGetThreadContext GetThreadContext} */
	@JavadocExclude
	public static native long nalcGetThreadContext(long __functionAddress);

	/** Retrieve a handle to the thread-specific context of the calling thread. This function will return {@code NULL} if no thread- specific context is set. */
	public static long alcGetThreadContext() {
		long __functionAddress = getInstance().GetThreadContext;
		return nalcGetThreadContext(__functionAddress);
	}

}