/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <strong>APPLE_ContextLoggingFunctions</strong> extension.
 * 
 * <p>Provides convenience functions that are intended to be used as the {@code pfn_notify} parameter to {@link CL10#clCreateContext CreateContext}.</p>
 * 
 * <p>Note that if you pass {@code NULL} to the {@link CL10#clCreateContext CreateContext} {@code pfn_notify} parameter, you can also use these by setting the {@code CL_LOG_ERRORS}
 * environment variable to one of stdout, stderr, or console. Pass your own do-nothing context logging function to disable the {@code CL_LOG_ERRORS}
 * override.</p>
 */
public final class APPLEContextLoggingFunctions {

	/** Function address. */
	@JavadocExclude
	public final long
		LogMessagesToSystemLogAPPLE,
		LogMessagesToStdoutAPPLE,
		LogMessagesToStderrAPPLE;

	@JavadocExclude
	public APPLEContextLoggingFunctions(FunctionProvider provider) {
		LogMessagesToSystemLogAPPLE = provider.getFunctionAddress("clLogMessagesToSystemLogAPPLE");
		LogMessagesToStdoutAPPLE = provider.getFunctionAddress("clLogMessagesToStdoutAPPLE");
		LogMessagesToStderrAPPLE = provider.getFunctionAddress("clLogMessagesToStderrAPPLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link APPLEContextLoggingFunctions} instance for the currently loaded ICD. */
	public static APPLEContextLoggingFunctions getInstance() {
		return checkFunctionality(CL.getICD().__APPLEContextLoggingFunctions);
	}

	static APPLEContextLoggingFunctions create(FunctionProvider provider) {
		APPLEContextLoggingFunctions funcs = new APPLEContextLoggingFunctions(provider);

		boolean supported = checkFunctions(
			funcs.LogMessagesToSystemLogAPPLE, funcs.LogMessagesToStdoutAPPLE, funcs.LogMessagesToStderrAPPLE
		);

		return supported ? funcs : null;
	}

	// --- [ clLogMessagesToSystemLogAPPLE ] ---

	/** JNI method for {@link #clLogMessagesToSystemLogAPPLE LogMessagesToSystemLogAPPLE} */
	@JavadocExclude
	public static native void nclLogMessagesToSystemLogAPPLE(long errstr, long private_info, long cb, long user_data, long __functionAddress);

	/** Unsafe version of {@link #clLogMessagesToSystemLogAPPLE LogMessagesToSystemLogAPPLE} */
	@JavadocExclude
	public static void nclLogMessagesToSystemLogAPPLE(long errstr, long private_info, long cb, long user_data) {
		long __functionAddress = getInstance().LogMessagesToSystemLogAPPLE;
		nclLogMessagesToSystemLogAPPLE(errstr, private_info, cb, user_data, __functionAddress);
	}

	/**
	 * Forwards on all log messages to the Apple System Logger.
	 *
	 * @param errstr       
	 * @param private_info 
	 * @param cb           
	 * @param user_data    
	 */
	public static void clLogMessagesToSystemLogAPPLE(ByteBuffer errstr, ByteBuffer private_info, long cb, ByteBuffer user_data) {
		nclLogMessagesToSystemLogAPPLE(memAddress(errstr), memAddress(private_info), cb, memAddress(user_data));
	}

	// --- [ clLogMessagesToStdoutAPPLE ] ---

	/** JNI method for {@link #clLogMessagesToStdoutAPPLE LogMessagesToStdoutAPPLE} */
	@JavadocExclude
	public static native void nclLogMessagesToStdoutAPPLE(long errstr, long private_info, long cb, long user_data, long __functionAddress);

	/** Unsafe version of {@link #clLogMessagesToStdoutAPPLE LogMessagesToStdoutAPPLE} */
	@JavadocExclude
	public static void nclLogMessagesToStdoutAPPLE(long errstr, long private_info, long cb, long user_data) {
		long __functionAddress = getInstance().LogMessagesToStdoutAPPLE;
		nclLogMessagesToStdoutAPPLE(errstr, private_info, cb, user_data, __functionAddress);
	}

	/**
	 * Forwards on all log messages to the standard output stream.
	 *
	 * @param errstr       
	 * @param private_info 
	 * @param cb           
	 * @param user_data    
	 */
	public static void clLogMessagesToStdoutAPPLE(ByteBuffer errstr, ByteBuffer private_info, long cb, ByteBuffer user_data) {
		nclLogMessagesToStdoutAPPLE(memAddress(errstr), memAddress(private_info), cb, memAddress(user_data));
	}

	// --- [ clLogMessagesToStderrAPPLE ] ---

	/** JNI method for {@link #clLogMessagesToStderrAPPLE LogMessagesToStderrAPPLE} */
	@JavadocExclude
	public static native void nclLogMessagesToStderrAPPLE(long errstr, long private_info, long cb, long user_data, long __functionAddress);

	/** Unsafe version of {@link #clLogMessagesToStderrAPPLE LogMessagesToStderrAPPLE} */
	@JavadocExclude
	public static void nclLogMessagesToStderrAPPLE(long errstr, long private_info, long cb, long user_data) {
		long __functionAddress = getInstance().LogMessagesToStderrAPPLE;
		nclLogMessagesToStderrAPPLE(errstr, private_info, cb, user_data, __functionAddress);
	}

	/**
	 * Forwards on all log messages to the standard error stream.
	 *
	 * @param errstr       
	 * @param private_info 
	 * @param cb           
	 * @param user_data    
	 */
	public static void clLogMessagesToStderrAPPLE(ByteBuffer errstr, ByteBuffer private_info, long cb, ByteBuffer user_data) {
		nclLogMessagesToStderrAPPLE(memAddress(errstr), memAddress(private_info), cb, memAddress(user_data));
	}

}