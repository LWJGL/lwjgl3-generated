/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
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
public class APPLEContextLoggingFunctions {

	protected APPLEContextLoggingFunctions() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(CLCapabilities caps) {
		return checkFunctions(
			caps.clLogMessagesToSystemLogAPPLE, caps.clLogMessagesToStdoutAPPLE, caps.clLogMessagesToStderrAPPLE
		);
	}

	// --- [ clLogMessagesToSystemLogAPPLE ] ---

	/**
	 * Forwards on all log messages to the Apple System Logger.
	 *
	 * @param errstr       
	 * @param private_info 
	 * @param cb           
	 * @param user_data    
	 */
	public static void nclLogMessagesToSystemLogAPPLE(long errstr, long private_info, long cb, long user_data) {
		long __functionAddress = CL.getICD().clLogMessagesToSystemLogAPPLE;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPPV(__functionAddress, errstr, private_info, cb, user_data);
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

	/**
	 * Forwards on all log messages to the standard output stream.
	 *
	 * @param errstr       
	 * @param private_info 
	 * @param cb           
	 * @param user_data    
	 */
	public static void nclLogMessagesToStdoutAPPLE(long errstr, long private_info, long cb, long user_data) {
		long __functionAddress = CL.getICD().clLogMessagesToStdoutAPPLE;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPPV(__functionAddress, errstr, private_info, cb, user_data);
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

	/**
	 * Forwards on all log messages to the standard error stream.
	 *
	 * @param errstr       
	 * @param private_info 
	 * @param cb           
	 * @param user_data    
	 */
	public static void nclLogMessagesToStderrAPPLE(long errstr, long private_info, long cb, long user_data) {
		long __functionAddress = CL.getICD().clLogMessagesToStderrAPPLE;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPPV(__functionAddress, errstr, private_info, cb, user_data);
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