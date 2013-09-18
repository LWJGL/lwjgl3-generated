/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/debug_output.txt">AMD_debug_output</a> extension. */
public final class AMDDebugOutput {

	/** Tokens accepted by GetIntegerv. */
	public static final int
		GL_MAX_DEBUG_MESSAGE_LENGTH_AMD  = 0x9143,
		GL_MAX_DEBUG_LOGGED_MESSAGES_AMD = 0x9144,
		GL_DEBUG_LOGGED_MESSAGES_AMD     = 0x9145;

	/** Tokens accepted by DebugMessageEnableAMD, GetDebugMessageLogAMD, DebugMessageInsertAMD, and DEBUGPROCAMD callback function for {@code severity}. */
	public static final int
		GL_DEBUG_SEVERITY_HIGH_AMD   = 0x9146,
		GL_DEBUG_SEVERITY_MEDIUM_AMD = 0x9147,
		GL_DEBUG_SEVERITY_LOW_AMD    = 0x9148;

	/** Tokens accepted by DebugMessageEnableAMD, GetDebugMessageLogAMD, and DEBUGPROCAMD callback function for {@code category}. */
	public static final int
		GL_DEBUG_CATEGORY_API_ERROR_AMD          = 0x9149,
		GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD      = 0x914A,
		GL_DEBUG_CATEGORY_DEPRECATION_AMD        = 0x914B,
		GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD = 0x914C,
		GL_DEBUG_CATEGORY_PERFORMANCE_AMD        = 0x914D,
		GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD    = 0x914E,
		GL_DEBUG_CATEGORY_APPLICATION_AMD        = 0x914F,
		GL_DEBUG_CATEGORY_OTHER_AMD              = 0x9150;

	private AMDDebugOutput() {}

	// --- [ glDebugMessageEnableAMD ] ---

	/** JNI method for {@link #glDebugMessageEnableAMD glDebugMessageEnableAMD} */
	public static native void nglDebugMessageEnableAMD(int category, int severity, int count, long ids, boolean enabled, long __functionAddress);

	/**
	 * Disables or enables generation of subsets of messages.
	 *
	 * @param category the message category. One of:<p/>{@link #GL_DEBUG_CATEGORY_API_ERROR_AMD DEBUG_CATEGORY_API_ERROR_AMD}, {@link #GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD DEBUG_CATEGORY_WINDOW_SYSTEM_AMD}, {@link #GL_DEBUG_CATEGORY_DEPRECATION_AMD DEBUG_CATEGORY_DEPRECATION_AMD}, {@link #GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD}, {@link #GL_DEBUG_CATEGORY_PERFORMANCE_AMD DEBUG_CATEGORY_PERFORMANCE_AMD}, {@link #GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD DEBUG_CATEGORY_SHADER_COMPILER_AMD}, {@link #GL_DEBUG_CATEGORY_APPLICATION_AMD DEBUG_CATEGORY_APPLICATION_AMD}, {@link #GL_DEBUG_CATEGORY_OTHER_AMD DEBUG_CATEGORY_OTHER_AMD}
	 * @param severity the message severity. One of:<p/>{@link #GL_DEBUG_SEVERITY_HIGH_AMD DEBUG_SEVERITY_HIGH_AMD}, {@link #GL_DEBUG_SEVERITY_MEDIUM_AMD DEBUG_SEVERITY_MEDIUM_AMD}, {@link #GL_DEBUG_SEVERITY_LOW_AMD DEBUG_SEVERITY_LOW_AMD}
	 * @param count    the number of values in the {@code ids} array
	 * @param ids      an array of message ids
	 * @param enabled  whether to enable or disable the referenced subset of messages
	 */
	public static void glDebugMessageEnableAMD(int category, int severity, int count, ByteBuffer ids, boolean enabled) {
		long __functionAddress = getInstance().glDebugMessageEnableAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( ids != null ) checkBuffer(ids, count << 2);
		}
		nglDebugMessageEnableAMD(category, severity, count, memAddressSafe(ids), enabled, __functionAddress);
	}

	/** Alternative version of: {@link #glDebugMessageEnableAMD glDebugMessageEnableAMD} */
	public static void glDebugMessageEnableAMD(int category, int severity, IntBuffer ids, boolean enabled) {
		long __functionAddress = getInstance().glDebugMessageEnableAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDebugMessageEnableAMD(category, severity, ids == null ? 0 : ids.remaining(), memAddressSafe(ids), enabled, __functionAddress);
	}

	// --- [ glDebugMessageInsertAMD ] ---

	/** JNI method for {@link #glDebugMessageInsertAMD glDebugMessageInsertAMD} */
	public static native void nglDebugMessageInsertAMD(int category, int severity, int id, int length, long buf, long __functionAddress);

	/**
	 * Injects an application-supplied message into the debug message stream.
	 *
	 * @param category the message category. One of:<p/>{@link #GL_DEBUG_CATEGORY_API_ERROR_AMD DEBUG_CATEGORY_API_ERROR_AMD}, {@link #GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD DEBUG_CATEGORY_WINDOW_SYSTEM_AMD}, {@link #GL_DEBUG_CATEGORY_DEPRECATION_AMD DEBUG_CATEGORY_DEPRECATION_AMD}, {@link #GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD}, {@link #GL_DEBUG_CATEGORY_PERFORMANCE_AMD DEBUG_CATEGORY_PERFORMANCE_AMD}, {@link #GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD DEBUG_CATEGORY_SHADER_COMPILER_AMD}, {@link #GL_DEBUG_CATEGORY_APPLICATION_AMD DEBUG_CATEGORY_APPLICATION_AMD}, {@link #GL_DEBUG_CATEGORY_OTHER_AMD DEBUG_CATEGORY_OTHER_AMD}
	 * @param severity the message severity. One of:<p/>{@link #GL_DEBUG_SEVERITY_HIGH_AMD DEBUG_SEVERITY_HIGH_AMD}, {@link #GL_DEBUG_SEVERITY_MEDIUM_AMD DEBUG_SEVERITY_MEDIUM_AMD}, {@link #GL_DEBUG_SEVERITY_LOW_AMD DEBUG_SEVERITY_LOW_AMD}
	 * @param id       the message id
	 * @param length   the number of character in the message
	 * @param buf      the message characters
	 */
	public static void glDebugMessageInsertAMD(int category, int severity, int id, int length, ByteBuffer buf) {
		long __functionAddress = getInstance().glDebugMessageInsertAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buf, length);
			checkNT1(buf);
		}
		nglDebugMessageInsertAMD(category, severity, id, length, memAddress(buf), __functionAddress);
	}

	/** Alternative version of: {@link #glDebugMessageInsertAMD glDebugMessageInsertAMD} */
	public static void glDebugMessageInsertAMD(int category, int severity, int id, ByteBuffer buf) {
		long __functionAddress = getInstance().glDebugMessageInsertAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDebugMessageInsertAMD(category, severity, id, buf.remaining(), memAddress(buf), __functionAddress);
	}

	/** CharSequence version of: {@link #glDebugMessageInsertAMD glDebugMessageInsertAMD} */
	public static void glDebugMessageInsertAMD(int category, int severity, int id, CharSequence buf) {
		long __functionAddress = getInstance().glDebugMessageInsertAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDebugMessageInsertAMD(category, severity, id, buf.length(), memAddress(memEncodeUTF8(buf)), __functionAddress);
	}

	// --- [ glDebugMessageCallbackAMD ] ---

	/** JNI method for {@link #glDebugMessageCallbackAMD glDebugMessageCallbackAMD} */
	public static native void nglDebugMessageCallbackAMD(long callback, long userParam, long __functionAddress);

	/**
	 * Specifies a callback to receive debugging messages from the GL.
	 *
	 * @param callback  a callback function that will be called when a debug message is generated
	 * @param userParam a user supplied pointer that will be passed on each invocation of {@code callback}
	 */
	public static void glDebugMessageCallbackAMD(long callback, long userParam) {
		Functions __instance = getInstance();
		long __functionAddress = __instance.glDebugMessageCallbackAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDebugMessageCallbackAMD(callback, userParam, __functionAddress);
	}

	/** Alternative version of: {@link #glDebugMessageCallbackAMD glDebugMessageCallbackAMD} */
	public static void glDebugMessageCallbackAMD(DEBUGPROCAMD callback) {
		Functions __instance = getInstance();
		long __functionAddress = __instance.glDebugMessageCallbackAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDebugMessageCallbackAMD(callback == null ? NULL : DEBUGPROCAMD.Util.CALLBACK, DEBUGPROCAMD.Util.register(__instance, callback), __functionAddress);
	}

	// --- [ glGetDebugMessageLogAMD ] ---

	/** JNI method for {@link #glGetDebugMessageLogAMD glGetDebugMessageLogAMD} */
	public static native int nglGetDebugMessageLogAMD(int count, int bufsize, long categories, long severities, long ids, long lengths, long messageLog, long __functionAddress);

	/**
	 * Retrieves messages from the debug message log.
	 *
	 * @param count      the number of debug messages to retrieve from the log
	 * @param bufsize    the maximum number of characters that can be written in the {@code message} array
	 * @param categories an array of variables to receive the categories of the retrieved messages
	 * @param severities an array of variables to receive the severities of the retrieved messages
	 * @param ids        an array of variables to receive the ids of the retrieved messages
	 * @param lengths    an array of variables to receive the lengths of the retrieved messages
	 * @param messageLog an array of characters that will receive the messages
	 */
	public static int glGetDebugMessageLogAMD(int count, int bufsize, ByteBuffer categories, ByteBuffer severities, ByteBuffer ids, ByteBuffer lengths, ByteBuffer messageLog) {
		long __functionAddress = getInstance().glGetDebugMessageLogAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(messageLog, bufsize);
			if ( categories != null ) checkBuffer(categories, count << 2);
			if ( severities != null ) checkBuffer(severities, count << 2);
			if ( ids != null ) checkBuffer(ids, count << 2);
			if ( lengths != null ) checkBuffer(lengths, count << 2);
			checkNT1(messageLog);
		}
		return nglGetDebugMessageLogAMD(count, bufsize, memAddressSafe(categories), memAddressSafe(severities), memAddressSafe(ids), memAddressSafe(lengths), memAddress(messageLog), __functionAddress);
	}

	/** Alternative version of: {@link #glGetDebugMessageLogAMD glGetDebugMessageLogAMD} */
	public static int glGetDebugMessageLogAMD(int count, IntBuffer categories, IntBuffer severities, IntBuffer ids, IntBuffer lengths, ByteBuffer messageLog) {
		long __functionAddress = getInstance().glGetDebugMessageLogAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( categories != null ) checkBuffer(categories, count);
			if ( severities != null ) checkBuffer(severities, count);
			if ( ids != null ) checkBuffer(ids, count);
			if ( lengths != null ) checkBuffer(lengths, count);
		}
		return nglGetDebugMessageLogAMD(count, messageLog.remaining(), memAddressSafe(categories), memAddressSafe(severities), memAddressSafe(ids), memAddressSafe(lengths), memAddress(messageLog), __functionAddress);
	}

	/** CharSequence version of: {@link #glGetDebugMessageLogAMD glGetDebugMessageLogAMD} */
	public static int glGetDebugMessageLogAMD(int count, IntBuffer categories, IntBuffer severities, IntBuffer ids, IntBuffer lengths, CharSequence messageLog) {
		long __functionAddress = getInstance().glGetDebugMessageLogAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( categories != null ) checkBuffer(categories, count);
			if ( severities != null ) checkBuffer(severities, count);
			if ( ids != null ) checkBuffer(ids, count);
			if ( lengths != null ) checkBuffer(lengths, count);
		}
		return nglGetDebugMessageLogAMD(count, messageLog.length(), memAddressSafe(categories), memAddressSafe(severities), memAddressSafe(ids), memAddressSafe(lengths), memAddress(memEncodeUTF8(messageLog)), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__AMDDebugOutput;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_AMD_debug_output") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glDebugMessageEnableAMD) &&
			GL.isFunctionSupported(funcs.glDebugMessageInsertAMD) &&
			GL.isFunctionSupported(funcs.glDebugMessageCallbackAMD) &&
			GL.isFunctionSupported(funcs.glGetDebugMessageLogAMD);

		return GL.checkExtension("GL_AMD_debug_output", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code AMDDebugOutput}. */
	public static final class Functions implements FunctionMap {

		public final long
			glDebugMessageEnableAMD,
			glDebugMessageInsertAMD,
			glDebugMessageCallbackAMD,
			glGetDebugMessageLogAMD;

		long DEBUGPROCAMD;

		public Functions(FunctionProvider provider) {
			glDebugMessageEnableAMD = provider.getFunctionAddress("glDebugMessageEnableAMD");
			glDebugMessageInsertAMD = provider.getFunctionAddress("glDebugMessageInsertAMD");
			glDebugMessageCallbackAMD = provider.getFunctionAddress("glDebugMessageCallbackAMD");
			glGetDebugMessageLogAMD = provider.getFunctionAddress("glGetDebugMessageLogAMD");
		}

	}

}