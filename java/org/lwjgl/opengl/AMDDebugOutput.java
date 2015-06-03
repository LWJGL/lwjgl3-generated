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
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/debug_output.txt">AMD_debug_output</a> extension.
 * 
 * <p>This extension allows the GL to notify applications when various debug events occur in contexts that have been created with the debug flag, as provided
 * by {@link WGLARBCreateContext WGL_ARB_create_context} and {@link GLXARBCreateContext GLX_ARB_create_context}.</p>
 * 
 * <p>These events are represented in the form of enumerable messages with an included human-readable translation. Examples of debug events include incorrect
 * use of the GL, warnings of undefined behavior, and performance warnings.</p>
 * 
 * <p>A message is uniquely identified by a category and an implementation-dependent ID within that category. Message categories are general and are used to
 * organize large groups of similar messages together. Examples of categories include GL errors, performance warnings, and deprecated functionality
 * warnings. Each message is also assigned a severity level that denotes roughly how "important" that message is in comparison to other messages across all
 * categories. For example, notification of a GL error would have a higher severity than a performance warning due to redundant state changes.</p>
 * 
 * <p>Messages are communicated to the application through an application-defined callback function that is called by the GL implementation on each debug
 * message. The motivation for the callback routine is to free application developers from actively having to query whether any GL error or other
 * debuggable event has happened after each call to a GL function. With a callback, developers can keep their code free of debug checks, and only have to
 * react to messages as they occur. In order to support indirect rendering, a message log is also provided that stores copies of recent messages until they
 * are actively queried.</p>
 * 
 * <p>To control the volume of debug output, messages can be disabled either individually by ID, or entire groups of messages can be turned off based on
 * category or severity.</p>
 * 
 * <p>The only requirement on the minimum quantity and type of messages that implementations of this extension must support is that a message must be sent
 * notifying the application whenever any GL error occurs. Any further messages are left to the implementation. Implementations do not have to output
 * messages from all categories listed by this extension in order to support this extension, and new categories can be added by other extensions.</p>
 * 
 * <p>This extension places no restrictions or requirements on any additional functionality provided by the debug context flag through other extensions.</p>
 * 
 * <p>Requires {@link WGLARBCreateContext WGL_ARB_create_context} or {@link GLXARBCreateContext GLX_ARB_create_context}.</p>
 */
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

	/** Function address. */
	@JavadocExclude
	public final long
		DebugMessageEnableAMD,
		DebugMessageInsertAMD,
		DebugMessageCallbackAMD,
		GetDebugMessageLogAMD;

	@JavadocExclude
	public AMDDebugOutput(FunctionProvider provider) {
		DebugMessageEnableAMD = provider.getFunctionAddress("glDebugMessageEnableAMD");
		DebugMessageInsertAMD = provider.getFunctionAddress("glDebugMessageInsertAMD");
		DebugMessageCallbackAMD = provider.getFunctionAddress("glDebugMessageCallbackAMD");
		GetDebugMessageLogAMD = provider.getFunctionAddress("glGetDebugMessageLogAMD");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link AMDDebugOutput} instance for the current context. */
	public static AMDDebugOutput getInstance() {
		return checkFunctionality(GL.getCapabilities().__AMDDebugOutput);
	}

	static AMDDebugOutput create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_AMD_debug_output") ) return null;

		AMDDebugOutput funcs = new AMDDebugOutput(provider);

		boolean supported = checkFunctions(
			funcs.DebugMessageEnableAMD, funcs.DebugMessageInsertAMD, funcs.DebugMessageCallbackAMD, funcs.GetDebugMessageLogAMD
		);

		return GL.checkExtension("GL_AMD_debug_output", funcs, supported);
	}

	// --- [ glDebugMessageEnableAMD ] ---

	/** JNI method for {@link #glDebugMessageEnableAMD DebugMessageEnableAMD} */
	@JavadocExclude
	public static native void nglDebugMessageEnableAMD(int category, int severity, int count, long ids, boolean enabled, long __functionAddress);

	/** Unsafe version of {@link #glDebugMessageEnableAMD DebugMessageEnableAMD} */
	@JavadocExclude
	public static void nglDebugMessageEnableAMD(int category, int severity, int count, long ids, boolean enabled) {
		long __functionAddress = getInstance().DebugMessageEnableAMD;
		nglDebugMessageEnableAMD(category, severity, count, ids, enabled, __functionAddress);
	}

	/**
	 * Allows disabling or enabling generation of subsets of messages. If {@code enabled} is {@link GL11#GL_TRUE TRUE}, the referenced subset of messages is enabled. If
	 * {@link GL11#GL_FALSE FALSE}, then those messages are disabled. This command can reference different subsets of messages by varying its parameter values in the following
	 * ways:
	 * <ol>
	 * <li>To reference all messages, let {@code category}, {@code severity}, and {@code count} all be zero. The value of {@code ids} is ignored in this case.</li>
	 * <li>To reference all messages across all categories with a specific severity level, let {@code category} and {@code count} be zero and let
	 * {@code severity} identify the severity level. The value of {@code ids} is ignored in this case.</li>
	 * <li>To reference all messages within a single category, let {@code category} identify the referenced category and let {@code severity} and {@code count}
	 * be zero. The value of {@code ids} is ignored in this case.</li>
	 * <li>To reference all messages within a single category and at a specific severity level, let {@code category} identify the category and {@code severity}
	 * identify the severity level, and let {@code count} be zero. The value of {@code ids} is ignored in this case.</li>
	 * <li>To reference specific messages by ID within a single category, let {@code category} identify the category, let {@code severity} be zero, let
	 * {@code count} be greater than zero and let {@code ids} identify the IDs of {@code count} messages within the identified category. Operations on
	 * message IDs that are not valid within the category are silently ignored.</li>
	 * </ol>
	 * In all of the above cases, if {@code category} is non-zero and specifies an invalid category, the error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated. Similarly if
	 * {@code severity} is non-zero and is an invalid severity level, the error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated. If {@code count} is less than zero, the error
	 * {@link GL11#GL_INVALID_VALUE INVALID_VALUE} is generated. If the parameters do not fall into one of the cases defined above, the error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} is generated. The error
	 * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if this command is called in a non-debug context.
	 * 
	 * <p>Although messages are grouped into categories and severities, and entire groups of messages can be turned off with a single call, there is no explicit
	 * per-category or per-severity enabled state. Instead the enabled state is stored individually for each message. There is no difference between disabling
	 * a category of messages with a single call, and enumerating all messages of that category and individually disabling each of them by their ID.</p>
	 * 
	 * <p>All messages of severity level {@link #GL_DEBUG_SEVERITY_MEDIUM_AMD DEBUG_SEVERITY_MEDIUM_AMD} and {@link #GL_DEBUG_SEVERITY_HIGH_AMD DEBUG_SEVERITY_HIGH_AMD} in all categories are initially enabled, and all messages at
	 * {@link #GL_DEBUG_SEVERITY_LOW_AMD DEBUG_SEVERITY_LOW_AMD} are initially disabled.</p>
	 *
	 * @param category the message category. One of:<br>{@link #GL_DEBUG_CATEGORY_API_ERROR_AMD DEBUG_CATEGORY_API_ERROR_AMD}, {@link #GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD DEBUG_CATEGORY_WINDOW_SYSTEM_AMD}, {@link #GL_DEBUG_CATEGORY_DEPRECATION_AMD DEBUG_CATEGORY_DEPRECATION_AMD}, {@link #GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD}, {@link #GL_DEBUG_CATEGORY_PERFORMANCE_AMD DEBUG_CATEGORY_PERFORMANCE_AMD}, {@link #GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD DEBUG_CATEGORY_SHADER_COMPILER_AMD}, {@link #GL_DEBUG_CATEGORY_APPLICATION_AMD DEBUG_CATEGORY_APPLICATION_AMD}, {@link #GL_DEBUG_CATEGORY_OTHER_AMD DEBUG_CATEGORY_OTHER_AMD}
	 * @param severity the message severity. One of:<br>{@link #GL_DEBUG_SEVERITY_HIGH_AMD DEBUG_SEVERITY_HIGH_AMD}, {@link #GL_DEBUG_SEVERITY_MEDIUM_AMD DEBUG_SEVERITY_MEDIUM_AMD}, {@link #GL_DEBUG_SEVERITY_LOW_AMD DEBUG_SEVERITY_LOW_AMD}
	 * @param count    the number of values in the {@code ids} array
	 * @param ids      an array of message ids
	 * @param enabled  whether to enable or disable the referenced subset of messages
	 */
	public static void glDebugMessageEnableAMD(int category, int severity, int count, ByteBuffer ids, boolean enabled) {
		if ( LWJGLUtil.CHECKS )
			if ( ids != null ) checkBuffer(ids, count << 2);
		nglDebugMessageEnableAMD(category, severity, count, memAddressSafe(ids), enabled);
	}

	/** Alternative version of: {@link #glDebugMessageEnableAMD DebugMessageEnableAMD} */
	public static void glDebugMessageEnableAMD(int category, int severity, IntBuffer ids, boolean enabled) {
		nglDebugMessageEnableAMD(category, severity, ids == null ? 0 : ids.remaining(), memAddressSafe(ids), enabled);
	}

	// --- [ glDebugMessageInsertAMD ] ---

	/** JNI method for {@link #glDebugMessageInsertAMD DebugMessageInsertAMD} */
	@JavadocExclude
	public static native void nglDebugMessageInsertAMD(int category, int severity, int id, int length, long buf, long __functionAddress);

	/** Unsafe version of {@link #glDebugMessageInsertAMD DebugMessageInsertAMD} */
	@JavadocExclude
	public static void nglDebugMessageInsertAMD(int category, int severity, int id, int length, long buf) {
		long __functionAddress = getInstance().DebugMessageInsertAMD;
		nglDebugMessageInsertAMD(category, severity, id, length, buf, __functionAddress);
	}

	/**
	 * Injects an application-supplied message into the debug message stream.
	 * 
	 * <p>The value of {@code id} specifies the ID for the message and {@code severity} indicates its severity level as defined by the application. If
	 * {@code severity} is not a valid severity level, the error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} will be generated. The value of {@code category} must be
	 * {@link #GL_DEBUG_CATEGORY_APPLICATION_AMD DEBUG_CATEGORY_APPLICATION_AMD}, or the error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} will be generated. The string {@code buf} contains the string representation of the
	 * message. The parameter {@code length} contains the size of the message's string representation, excluding the null-terminator. If {@code length} is
	 * zero, then its value is derived from the string-length of {@code buf} and {@code buf} must contain a null-terminated string. The error
	 * {@link GL11#GL_INVALID_VALUE INVALID_VALUE} will be generated if {@code length} is less than zero or its derived value is larger than or equal to {@link #GL_MAX_DEBUG_MESSAGE_LENGTH_AMD MAX_DEBUG_MESSAGE_LENGTH_AMD}.
	 * The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} will be generated if this function is called in a non-debug context.</p>
	 *
	 * @param category the message category. Must be:<br>{@link #GL_DEBUG_CATEGORY_APPLICATION_AMD DEBUG_CATEGORY_APPLICATION_AMD}
	 * @param severity the message severity. One of:<br>{@link #GL_DEBUG_SEVERITY_HIGH_AMD DEBUG_SEVERITY_HIGH_AMD}, {@link #GL_DEBUG_SEVERITY_MEDIUM_AMD DEBUG_SEVERITY_MEDIUM_AMD}, {@link #GL_DEBUG_SEVERITY_LOW_AMD DEBUG_SEVERITY_LOW_AMD}
	 * @param id       the message id
	 * @param length   the number of character in the message
	 * @param buf      the message characters
	 */
	public static void glDebugMessageInsertAMD(int category, int severity, int id, int length, ByteBuffer buf) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buf, length);
		nglDebugMessageInsertAMD(category, severity, id, length, memAddress(buf));
	}

	/** Alternative version of: {@link #glDebugMessageInsertAMD DebugMessageInsertAMD} */
	public static void glDebugMessageInsertAMD(int category, int severity, int id, ByteBuffer buf) {
		nglDebugMessageInsertAMD(category, severity, id, buf.remaining(), memAddress(buf));
	}

	/** CharSequence version of: {@link #glDebugMessageInsertAMD DebugMessageInsertAMD} */
	public static void glDebugMessageInsertAMD(int category, int severity, int id, CharSequence buf) {
		APIBuffer __buffer = apiBuffer();
		int bufEncoded = __buffer.stringParamUTF8(buf, false);
		int bufEncodedLen = __buffer.getOffset() - bufEncoded;
		nglDebugMessageInsertAMD(category, severity, id, bufEncodedLen, __buffer.address(bufEncoded));
	}

	// --- [ glDebugMessageCallbackAMD ] ---

	/** JNI method for {@link #glDebugMessageCallbackAMD DebugMessageCallbackAMD} */
	@JavadocExclude
	public static native void nglDebugMessageCallbackAMD(long callback, long userParam, long __functionAddress);

	/**
	 * Specifies a callback to receive debugging messages from the GL.
	 * 
	 * <p>With {@code callback} storing the address of the callback function. This function's signature must follow the type definition of DEBUGPROCAMD, and its
	 * calling convention must be the same as the calling convention of GL functions. Anything else will result in undefined behavior. Only one debug callback
	 * can be specified for the current context, and further calls overwrite the previous callback. Specifying zero as the value of {@code callback} clears the
	 * current callback and disables message output through callbacks. Applications can specify user-specified data through the pointer {@code userParam}. The
	 * context will store this pointer and will include it as one of the parameters of each call to the callback function. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION}
	 * will be generated if this function is called for contexts created without the debug flag.</p>
	 * 
	 * <p>If the application has specified a callback function in a debug context, the implementation will call that function whenever any unfiltered message is
	 * generated. The ID, category, and severity of the message are specified by the callback parameters {@code id}, {@code category} and {@code severity},
	 * respectively. The string representation of the message is stored in {@code message} and its length (excluding the null-terminator) is stored in
	 * {@code length}. The parameter {@code userParam} is the user-specified value that was passed when calling DebugMessageCallbackAMD. The memory for
	 * {@code message} is allocated, owned and released by the implementation, and should only be considered valid for the duration of the callback function
	 * call. While it is allowed to concurrently use multiple debug contexts with the same debug callback function, note that it is the application's
	 * responsibility to ensure that any work that occurs inside the debug callback function is thread-safe. Furthermore, calling any GL or window layer
	 * function from within the callback function results in undefined behavior.</p>
	 * 
	 * <p>If no callback is set, then messages are instead stored in an internal message log up to some maximum number of strings as defined by the
	 * implementation-dependent constant {@link #GL_MAX_DEBUG_LOGGED_MESSAGES_AMD MAX_DEBUG_LOGGED_MESSAGES_AMD}. Each context stores its own message log and will only store messages generated by
	 * commands operating in that context. If the message log is full, then the oldest messages will be removed from the log to make room for newer ones. The
	 * application can query the number of messages currently in the log by obtaining the value of {@link #GL_DEBUG_LOGGED_MESSAGES_AMD DEBUG_LOGGED_MESSAGES_AMD}.</p>
	 *
	 * @param callback  a callback function that will be called when a debug message is generated
	 * @param userParam a user supplied pointer that will be passed on each invocation of {@code callback}
	 */
	public static void glDebugMessageCallbackAMD(GLDebugMessageAMDCallback callback, long userParam) {
		long __functionAddress = getInstance().DebugMessageCallbackAMD;
		nglDebugMessageCallbackAMD(callback == null ? NULL : callback.getPointer(), userParam, __functionAddress);
	}

	// --- [ glGetDebugMessageLogAMD ] ---

	/** JNI method for {@link #glGetDebugMessageLogAMD GetDebugMessageLogAMD} */
	@JavadocExclude
	public static native int nglGetDebugMessageLogAMD(int count, int bufsize, long categories, long severities, long ids, long lengths, long messageLog, long __functionAddress);

	/** Unsafe version of {@link #glGetDebugMessageLogAMD GetDebugMessageLogAMD} */
	@JavadocExclude
	public static int nglGetDebugMessageLogAMD(int count, int bufsize, long categories, long severities, long ids, long lengths, long messageLog) {
		long __functionAddress = getInstance().GetDebugMessageLogAMD;
		return nglGetDebugMessageLogAMD(count, bufsize, categories, severities, ids, lengths, messageLog, __functionAddress);
	}

	/**
	 * Retrieves messages from the debug message log.
	 * 
	 * <p>This function will fetch as many messages as possible from the message log up to {@code count} in order from oldest to newest, and will return the
	 * number of messages fetched. Those messages that were fetched will be removed from the log. The value of {@code count} must be greater than zero and less
	 * than {@link #GL_MAX_DEBUG_LOGGED_MESSAGES_AMD MAX_DEBUG_LOGGED_MESSAGES_AMD} or otherwise the error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} will be generated. The value of {@code count} can be larger than the
	 * actual number of messages currently in the log. If {@code messageLog} is not a null pointer, then the string representations of all fetched messages
	 * will be stored in the buffer {@code messageLog} and will be separated by null-terminators. The maximum size of the buffer (including all
	 * null-terminators) is denoted by {@code bufSize}, and strings of messages within {@code count} that do not fit in the buffer will not be fetched. If
	 * {@code bufSize} is less than zero, the error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} will be generated. If {@code messageLog} is a null pointer, then the value of
	 * {@code bufSize} is ignored. The categories, severity levels, IDs, and string representation lengths of all (up to {@code count}) removed messages will
	 * be stored in the arrays {@code categories}, {@code severities}, {@code ids}, and {@code lengths}, respectively. The counts stored in the array
	 * {@code lengths} include the null-terminator of each string. Any and all of the output arrays, including {@code messageLog}, are optional, and no data is
	 * returned for those arrays that are specified with a null pointer. To simply delete up to {@code count} messages from the message log and ignoring, the
	 * application can call the function with null pointers for all output arrays. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} will be generated by GetDebugMessageLogAMD
	 * if it is called in a non-debug context.</p>
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
		if ( LWJGLUtil.CHECKS ) {
			if ( messageLog != null ) checkBuffer(messageLog, bufsize);
			if ( categories != null ) checkBuffer(categories, count << 2);
			if ( severities != null ) checkBuffer(severities, count << 2);
			if ( ids != null ) checkBuffer(ids, count << 2);
			if ( lengths != null ) checkBuffer(lengths, count << 2);
		}
		return nglGetDebugMessageLogAMD(count, bufsize, memAddressSafe(categories), memAddressSafe(severities), memAddressSafe(ids), memAddressSafe(lengths), memAddressSafe(messageLog));
	}

	/** Alternative version of: {@link #glGetDebugMessageLogAMD GetDebugMessageLogAMD} */
	public static int glGetDebugMessageLogAMD(int count, IntBuffer categories, IntBuffer severities, IntBuffer ids, IntBuffer lengths, ByteBuffer messageLog) {
		if ( LWJGLUtil.CHECKS ) {
			if ( categories != null ) checkBuffer(categories, count);
			if ( severities != null ) checkBuffer(severities, count);
			if ( ids != null ) checkBuffer(ids, count);
			if ( lengths != null ) checkBuffer(lengths, count);
		}
		return nglGetDebugMessageLogAMD(count, messageLog == null ? 0 : messageLog.remaining(), memAddressSafe(categories), memAddressSafe(severities), memAddressSafe(ids), memAddressSafe(lengths), memAddressSafe(messageLog));
	}

     /**
	 * Creates a {@link GLDebugMessageAMDCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLDebugMessageAMDCallback} instance
	 */
	public static GLDebugMessageAMDCallback GLDebugMessageAMDCallback(final GLDebugMessageAMDCallback.SAM sam) {
		return new GLDebugMessageAMDCallback() {
			@Override
			public void invoke(int id, int category, int severity, int length, long message, long userParam) {
				sam.invoke(id, category, severity, length, message, userParam);
			}
		};
	}

}