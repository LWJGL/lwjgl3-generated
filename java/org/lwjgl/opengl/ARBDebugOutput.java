/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/debug_output.txt">ARB_debug_output</a> extension.
 * 
 * <p>This extension allows the GL to notify applications when various events occur that may be useful during application development and debugging.</p>
 * 
 * <p>These events are represented in the form of enumerable messages with a human-readable string representation. Examples of debug events include incorrect
 * use of the GL, warnings of undefined behavior, and performance warnings.</p>
 * 
 * <p>A message is uniquely identified by a source, a type and an implementation-dependent ID within the source and type pair.</p>
 * 
 * <p>A message's source identifies the origin of the message and can either describe components of the GL, the window system, third-party external sources
 * such as external debuggers, or even the application itself.</p>
 * 
 * <p>The type of the message roughly identifies the nature of the event that caused the message. Examples include errors, performance warnings, or warnings
 * about undefined behavior.</p>
 * 
 * <p>A message's ID for a given source and type further distinguishes messages within those groups. For example, an error caused by a negative parameter
 * value or an invalid internal texture format are both errors generated by the API, but would likely have different message IDs.</p>
 * 
 * <p>Each message is also assigned to a severity level that denotes roughly how "important" that message is in comparison to other messages across all
 * sources and types. For example, notification of a GL error would likely have a higher severity than a performance warning due to redundant state
 * changes.</p>
 * 
 * <p>Finally, every message contains an implementation-dependent string representation that provides a useful description of the event.</p>
 * 
 * <p>Messages are communicated to the application through an application-defined callback function that is called by the GL implementation on each debug
 * message. The motivation for the callback routine is to free application developers from actively having to query whether a GL error, or any other
 * debuggable event has happened after each call to a GL function. With a callback, developers can keep their code free of debug checks, and only have to
 * react to messages as they occur. In situations where using a callback is not possible, a message log is also provided that stores copies of recent
 * messages until they are actively queried.</p>
 * 
 * <p>To control the volume of debug output, messages can be disabled either individually by ID, or entire groups of messages can be turned off based on
 * combination of source and type.</p>
 * 
 * <p>The only requirement on the minimum quantity and type of messages that implementations of this extension must support is that some sort of message must
 * be sent notifying the application whenever any GL error occurs. Any further messages are left to the implementation. Implementations do not have to
 * output messages from all sources nor do they have to use all types of messages listed by this extension, and both new sources and types can be added by
 * other extensions.</p>
 * 
 * <p>For performance reasons it is recommended, but not required, that implementations restrict supporting this extension only to contexts created using the
 * debug flag as provided by {@link WGLARBCreateContext WGL_ARB_create_context} or {@link GLXARBCreateContext GLX_ARB_create_context}. This extension places no limits on any other functionality
 * provided by debug contexts through other extensions.</p>
 */
public class ARBDebugOutput {

	/**
	 * Tokens accepted by the {@code target} parameters of Enable, Disable, and IsEnabled.
	 * 
	 * <p>The behavior of how and when the GL driver is allowed to generate debug messages, and subsequently either call back to the application or place the
	 * message in the debug message log, is affected by the state DEBUG_OUTPUT_SYNCHRONOUS_ARB. This state can be modified by the {@link GL11#glEnable Enable} and
	 * {@link GL11#glDisable Disable} commands. Its initial value is {@link GL11#GL_FALSE FALSE}.</p>
	 * 
	 * <p>When DEBUG_OUTPUT_SYNCHRONOUS_ARB is disabled, the driver is optionally allowed to concurrently call the debug callback routine from potentially
	 * multiple threads, including threads that the context that generated the message is not currently bound to. The implementation may also call the callback
	 * routine asynchronously after the GL command that generated the message has already returned. The application is fully responsible for ensuring thread
	 * safety due to debug callbacks under these circumstances. In this situation the {@code userParam} value may be helpful in identifying which application
	 * thread's command originally generated the debug callback.</p>
	 * 
	 * <p>When DEBUG_OUTPUT_SYNCHRONOUS_ARB is enabled, the driver guarantees synchronous calls to the callback routine by the context. When synchronous callbacks
	 * are enabled, all calls to the callback routine will be made by the thread that owns the current context; all such calls will be made serially by the
	 * current context; and each call will be made before the GL command that generated the debug message is allowed to return.</p>
	 * 
	 * <p>When no callback is specified and DEBUG_OUTPUT_SYNCHRONOUS_ARB is disabled, the driver can still asynchronously place messages in the debug message log,
	 * even after the context thread has returned from the GL function that generated those messages. When DEBUG_OUTPUT_SYNCHRONOUS_ARB is enabled, the driver
	 * guarantees that all messages are added to the log before the GL function returns.</p>
	 * 
	 * <p>Enabling synchronous debug output greatly simplifies the responsibilities of the application for making its callback functions thread-safe, but may
	 * potentially result in drastically reduced driver performance.</p>
	 * 
	 * <p>The DEBUG_OUTPUT_SYNCHRONOUS_ARB only guarantees intra-context synchronization for the callbacks of messages generated by that context, and does not
	 * guarantee synchronization across multiple contexts. If multiple contexts are concurrently used by the application, it is allowed for those contexts to
	 * also concurrently call their designated callbacks, and the application is responsible for handling thread safety in that situation even if
	 * DEBUG_OUTPUT_SYNCHRONOUS_ARB is enabled in all contexts.</p>
	 */
	public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_ARB = 0x8242;

	/** Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_DEBUG_MESSAGE_LENGTH_ARB         = 0x9143,
		GL_MAX_DEBUG_LOGGED_MESSAGES_ARB        = 0x9144,
		GL_DEBUG_LOGGED_MESSAGES_ARB            = 0x9145,
		GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB = 0x8243;

	/** Tokens accepted by the {@code pname} parameter of GetPointerv. */
	public static final int
		GL_DEBUG_CALLBACK_FUNCTION_ARB   = 0x8244,
		GL_DEBUG_CALLBACK_USER_PARAM_ARB = 0x8245;

	/**
	 * Tokens accepted or provided by the {@code source} parameters of DebugMessageControlARB, DebugMessageInsertARB and DEBUGPROCARB, and the {@code sources}
	 * parameter of GetDebugMessageLogARB.
	 */
	public static final int
		GL_DEBUG_SOURCE_API_ARB             = 0x8246,
		GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB   = 0x8247,
		GL_DEBUG_SOURCE_SHADER_COMPILER_ARB = 0x8248,
		GL_DEBUG_SOURCE_THIRD_PARTY_ARB     = 0x8249,
		GL_DEBUG_SOURCE_APPLICATION_ARB     = 0x824A,
		GL_DEBUG_SOURCE_OTHER_ARB           = 0x824B;

	/**
	 * Tokens accepted or provided by the {@code type} parameters of DebugMessageControlARB, DebugMessageInsertARB and DEBUGPROCARB, and the {@code types}
	 * parameter of GetDebugMessageLogARB.
	 */
	public static final int
		GL_DEBUG_TYPE_ERROR_ARB               = 0x824C,
		GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB = 0x824D,
		GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB  = 0x824E,
		GL_DEBUG_TYPE_PORTABILITY_ARB         = 0x824F,
		GL_DEBUG_TYPE_PERFORMANCE_ARB         = 0x8250,
		GL_DEBUG_TYPE_OTHER_ARB               = 0x8251;

	/**
	 * Tokens accepted or provided by the {@code severity} parameters of DebugMessageControlARB, DebugMessageInsertARB and DEBUGPROCARB callback functions, and
	 * the {@code severities} parameter of GetDebugMessageLogARB.
	 */
	public static final int
		GL_DEBUG_SEVERITY_HIGH_ARB   = 0x9146,
		GL_DEBUG_SEVERITY_MEDIUM_ARB = 0x9147,
		GL_DEBUG_SEVERITY_LOW_ARB    = 0x9148;

	/** Function address. */
	public final long
		DebugMessageControlARB,
		DebugMessageInsertARB,
		DebugMessageCallbackARB,
		GetDebugMessageLogARB;

	protected ARBDebugOutput() {
		throw new UnsupportedOperationException();
	}

	public ARBDebugOutput(FunctionProvider provider) {
		DebugMessageControlARB = provider.getFunctionAddress("glDebugMessageControlARB");
		DebugMessageInsertARB = provider.getFunctionAddress("glDebugMessageInsertARB");
		DebugMessageCallbackARB = provider.getFunctionAddress("glDebugMessageCallbackARB");
		GetDebugMessageLogARB = provider.getFunctionAddress("glGetDebugMessageLogARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBDebugOutput} instance of the current context. */
	public static ARBDebugOutput getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link ARBDebugOutput} instance of the specified {@link GLCapabilities}. */
	public static ARBDebugOutput getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__ARBDebugOutput);
	}

	static ARBDebugOutput create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_debug_output") ) return null;

		ARBDebugOutput funcs = new ARBDebugOutput(provider);

		boolean supported = checkFunctions(
			funcs.DebugMessageControlARB, funcs.DebugMessageInsertARB, funcs.DebugMessageCallbackARB, funcs.GetDebugMessageLogARB
		);

		return GL.checkExtension("GL_ARB_debug_output", funcs, supported);
	}

	// --- [ glDebugMessageControlARB ] ---

	/** Unsafe version of {@link #glDebugMessageControlARB DebugMessageControlARB} */
	public static void nglDebugMessageControlARB(int source, int type, int severity, int count, long ids, boolean enabled) {
		long __functionAddress = getInstance().DebugMessageControlARB;
		callIIIIPZV(__functionAddress, source, type, severity, count, ids, enabled);
	}

	/**
	 * Controls the volume of debug output by disabling specific or groups of messages.
	 * 
	 * <p>If {@code enabled} is {@link GL11#GL_TRUE TRUE}, the referenced subset of messages will be enabled. If {@link GL11#GL_FALSE FALSE}, then those messages will be disabled.</p>
	 * 
	 * <p>This command can reference different subsets of messages by first considering the set of all messages, and filtering out messages based on the following
	 * ways:</p>
	 * 
	 * <ul>
	 * <li>If {@code source} is not {@link GL11#GL_DONT_CARE DONT_CARE}, then all messages whose source does not match {@code source} will not be referenced.</li>
	 * <li>If {@code type} is not {@link GL11#GL_DONT_CARE DONT_CARE}, then all messages whose type does not match {@code type} will not be referenced.</li>
	 * <li>If {@code severity} is not {@link GL11#GL_DONT_CARE DONT_CARE}, then all messages whose severity level does not match {@code severity} will not be referenced.</li>
	 * <li>If {@code count} is greater than zero, then {@code ids} is an array of {@code count} message IDs for the specified combination of {@code source} and
	 * {@code type}. In this case, if {@code source} or {@code type} is {@link GL11#GL_DONT_CARE DONT_CARE}, or {@code severity} is not {@link GL11#GL_DONT_CARE DONT_CARE}, the error
	 * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated. If {@code count} is zero, the value if {@code ids} is ignored.</li>
	 * </ul>
	 * 
	 * <p>Although messages are grouped into an implicit hierarchy by their sources and types, there is no explicit per-source, per-type or per-severity enabled
	 * state. Instead, the enabled state is stored individually for each message. There is no difference between disabling all messages from one source in a
	 * single call, and individually disabling all messages from that source using their types and IDs.</p>
	 *
	 * @param source   the message source. One of:<br>{@link #GL_DEBUG_SOURCE_API_ARB DEBUG_SOURCE_API_ARB}, {@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB DEBUG_SOURCE_WINDOW_SYSTEM_ARB}, {@link #GL_DEBUG_SOURCE_SHADER_COMPILER_ARB DEBUG_SOURCE_SHADER_COMPILER_ARB}, {@link #GL_DEBUG_SOURCE_THIRD_PARTY_ARB DEBUG_SOURCE_THIRD_PARTY_ARB}, {@link #GL_DEBUG_SOURCE_APPLICATION_ARB DEBUG_SOURCE_APPLICATION_ARB}, {@link #GL_DEBUG_SOURCE_OTHER_ARB DEBUG_SOURCE_OTHER_ARB}
	 * @param type     the message type. One of:<br>{@link #GL_DEBUG_TYPE_ERROR_ARB DEBUG_TYPE_ERROR_ARB}, {@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB}, {@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB}, {@link #GL_DEBUG_TYPE_PORTABILITY_ARB DEBUG_TYPE_PORTABILITY_ARB}, {@link #GL_DEBUG_TYPE_PERFORMANCE_ARB DEBUG_TYPE_PERFORMANCE_ARB}, {@link #GL_DEBUG_TYPE_OTHER_ARB DEBUG_TYPE_OTHER_ARB}
	 * @param severity the message severity level. One of:<br>{@link #GL_DEBUG_SEVERITY_HIGH_ARB DEBUG_SEVERITY_HIGH_ARB}, {@link #GL_DEBUG_SEVERITY_MEDIUM_ARB DEBUG_SEVERITY_MEDIUM_ARB}, {@link #GL_DEBUG_SEVERITY_LOW_ARB DEBUG_SEVERITY_LOW_ARB}
	 * @param count    the number of message IDs in {@code ids}
	 * @param ids      the message IDs to enable or disable
	 * @param enabled  whether to enable or disable the references subset of messages
	 */
	public static void glDebugMessageControlARB(int source, int type, int severity, int count, ByteBuffer ids, boolean enabled) {
		if ( CHECKS )
			if ( ids != null ) checkBuffer(ids, count << 2);
		nglDebugMessageControlARB(source, type, severity, count, memAddressSafe(ids), enabled);
	}

	/** Alternative version of: {@link #glDebugMessageControlARB DebugMessageControlARB} */
	public static void glDebugMessageControlARB(int source, int type, int severity, IntBuffer ids, boolean enabled) {
		nglDebugMessageControlARB(source, type, severity, ids == null ? 0 : ids.remaining(), memAddressSafe(ids), enabled);
	}

	/** Single value version of: {@link #glDebugMessageControlARB DebugMessageControlARB} */
	public static void glDebugMessageControlARB(int source, int type, int severity, int id, boolean enabled) {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam(id);
		nglDebugMessageControlARB(source, type, severity, 1, __buffer.address(ids), enabled);
	}

	// --- [ glDebugMessageInsertARB ] ---

	/** Unsafe version of {@link #glDebugMessageInsertARB DebugMessageInsertARB} */
	public static void nglDebugMessageInsertARB(int source, int type, int id, int severity, int length, long buf) {
		long __functionAddress = getInstance().DebugMessageInsertARB;
		callIIIIIPV(__functionAddress, source, type, id, severity, length, buf);
	}

	/**
	 * This function can be called by applications and third-party libraries to generate their own messages, such as ones containing timestamp information or
	 * signals about specific render system events.
	 * 
	 * <p>The error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} will be generated if the number of characters in {@code buf}, excluding the null terminator when {@code length} is
	 * negative, is not less than {@link #GL_MAX_DEBUG_MESSAGE_LENGTH_ARB MAX_DEBUG_MESSAGE_LENGTH_ARB}.</p>
	 *
	 * @param source   the message source. One of:<br>{@link #GL_DEBUG_SOURCE_THIRD_PARTY_ARB DEBUG_SOURCE_THIRD_PARTY_ARB}, {@link #GL_DEBUG_SOURCE_APPLICATION_ARB DEBUG_SOURCE_APPLICATION_ARB}
	 * @param type     the message type. One of:<br>{@link #GL_DEBUG_TYPE_ERROR_ARB DEBUG_TYPE_ERROR_ARB}, {@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB}, {@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB}, {@link #GL_DEBUG_TYPE_PORTABILITY_ARB DEBUG_TYPE_PORTABILITY_ARB}, {@link #GL_DEBUG_TYPE_PERFORMANCE_ARB DEBUG_TYPE_PERFORMANCE_ARB}, {@link #GL_DEBUG_TYPE_OTHER_ARB DEBUG_TYPE_OTHER_ARB}
	 * @param id       the message ID
	 * @param severity the message severity level. One of:<br>{@link #GL_DEBUG_SEVERITY_HIGH_ARB DEBUG_SEVERITY_HIGH_ARB}, {@link #GL_DEBUG_SEVERITY_MEDIUM_ARB DEBUG_SEVERITY_MEDIUM_ARB}, {@link #GL_DEBUG_SEVERITY_LOW_ARB DEBUG_SEVERITY_LOW_ARB}
	 * @param length   the number of characters in {@code buf}. If negative, it is implied that {@code buf} contains a null terminated string.
	 * @param buf      the string representation of the message
	 */
	public static void glDebugMessageInsertARB(int source, int type, int id, int severity, int length, ByteBuffer buf) {
		if ( CHECKS )
			checkBuffer(buf, length);
		nglDebugMessageInsertARB(source, type, id, severity, length, memAddress(buf));
	}

	/** Alternative version of: {@link #glDebugMessageInsertARB DebugMessageInsertARB} */
	public static void glDebugMessageInsertARB(int source, int type, int id, int severity, ByteBuffer buf) {
		nglDebugMessageInsertARB(source, type, id, severity, buf.remaining(), memAddress(buf));
	}

	/** CharSequence version of: {@link #glDebugMessageInsertARB DebugMessageInsertARB} */
	public static void glDebugMessageInsertARB(int source, int type, int id, int severity, CharSequence buf) {
		APIBuffer __buffer = apiBuffer();
		int bufEncoded = __buffer.stringParamUTF8(buf, false);
		int bufEncodedLen = __buffer.getOffset() - bufEncoded;
		nglDebugMessageInsertARB(source, type, id, severity, bufEncodedLen, __buffer.address(bufEncoded));
	}

	// --- [ glDebugMessageCallbackARB ] ---

	/**
	 * Specifies a callback function for receiving debug messages.
	 * 
	 * <p>This function's prototype must follow the type definition of DEBUGPROCARB including its platform-dependent calling convention. Anything else will result
	 * in undefined behavior. Only one debug callback can be specified for the current context, and further calls overwrite the previous callback. Specifying
	 * {@code NULL} as the value of {@code callback} clears the current callback and disables message output through callbacks. Applications can provide
	 * user-specified data through the pointer {@code userParam}. The context will store this pointer and will include it as one of the parameters in each call
	 * to the callback function.</p>
	 * 
	 * <p>If the application has specified a callback function for receiving debug output, the implementation will call that function whenever any enabled message
	 * is generated. The source, type, ID, and severity of the message are specified by the DEBUGPROCARB parameters {@code source}, {@code type}, {@code id},
	 * and {@code severity}, respectively. The string representation of the message is stored in {@code message} and its length (excluding the null-terminator)
	 * is stored in {@code length}. The parameter {@code userParam} is the user-specified parameter that was given when calling DebugMessageCallbackARB.</p>
	 * 
	 * <p>Applications can query the current callback function and the current user-specified parameter by obtaining the values of {@link #GL_DEBUG_CALLBACK_FUNCTION_ARB DEBUG_CALLBACK_FUNCTION_ARB}
	 * and {@link #GL_DEBUG_CALLBACK_USER_PARAM_ARB DEBUG_CALLBACK_USER_PARAM_ARB}, respectively.</p>
	 * 
	 * <p>Applications that specify a callback function must be aware of certain special conditions when executing code inside a callback when it is called by the
	 * GL, regardless of the debug source.</p>
	 * 
	 * <p>The memory for {@code message} is owned and managed by the GL, and should only be considered valid for the duration of the function call.</p>
	 * 
	 * <p>The behavior of calling any GL or window system function from within the callback function is undefined and may lead to program termination.</p>
	 * 
	 * <p>Care must also be taken in securing debug callbacks for use with asynchronous debug output by multi-threaded GL implementations.</p>
	 * 
	 * <p>If {@link #GL_DEBUG_CALLBACK_FUNCTION_ARB DEBUG_CALLBACK_FUNCTION_ARB} is {@code NULL}, then debug messages are instead stored in an internal message log up to some maximum number of messages as
	 * defined by the value of {@link #GL_MAX_DEBUG_LOGGED_MESSAGES_ARB MAX_DEBUG_LOGGED_MESSAGES_ARB}.</p>
	 * 
	 * <p>Each context stores its own message log and will only store messages generated by commands operating in that context.  If the message log fills up, then
	 * any subsequently generated messages will not be placed in the log until the message log is cleared, and will instead be discarded.</p>
	 * 
	 * <p>Applications can query the number of messages currently in the log by obtaining the value of {@link #GL_DEBUG_LOGGED_MESSAGES_ARB DEBUG_LOGGED_MESSAGES_ARB}, and the string length
	 * (including its null terminator) of the oldest message in the log through the value of {@link #GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB}.</p>
	 *
	 * @param callback  a callback function that will be called when a debug message is generated
	 * @param userParam a user supplied pointer that will be passed on each invocation of {@code callback}
	 */
	public static void glDebugMessageCallbackARB(GLDebugMessageARBCallback callback, long userParam) {
		long __functionAddress = getInstance().DebugMessageCallbackARB;
		callPPV(__functionAddress, callback == null ? NULL : callback.address(), userParam);
	}

	// --- [ glGetDebugMessageLogARB ] ---

	/** Unsafe version of {@link #glGetDebugMessageLogARB GetDebugMessageLogARB} */
	public static int nglGetDebugMessageLogARB(int count, int bufSize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
		long __functionAddress = getInstance().GetDebugMessageLogARB;
		return callIIPPPPPPI(__functionAddress, count, bufSize, sources, types, ids, severities, lengths, messageLog);
	}

	/**
	 * When no debug callback is set, debug messages are stored in a debug message log. Messages can be queried from the log by calling this function.
	 * 
	 * <p>This function fetches a maximum of {@code count} messages from the message log, and will return the number of messages successfully fetched.</p>
	 * 
	 * <p>Messages will be fetched from the log in order of oldest to newest. Those messages that were fetched will be removed from the log.</p>
	 * 
	 * <p>The sources, types, severities, IDs, and string lengths of fetched messages will be stored in the application-provided arrays {@code sources},
	 * {@code types}, {@code severities}, {@code ids}, and {@code lengths}, respectively. The application is responsible for allocating enough space for each
	 * array to hold up to {@code count} elements. The string representations of all fetched messages are stored in the {@code messageLog} array. If multiple
	 * messages are fetched, their strings are concatenated into the same {@code messageLog} array and will be separated by single null terminators. The last
	 * string in the array will also be null-terminated. The maximum size of {@code messageLog}, including the space used by all null terminators, is given by
	 * {@code bufSize}. If {@code bufSize} is less than zero, the error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} will be generated. If a message's string, including its null
	 * terminator, can not fully fit within the {@code messageLog} array's remaining space, then that message and any subsequent messages will not be fetched
	 * and will remain in the log. The string lengths stored in the array {@code lengths} include the space for the null terminator of each string.</p>
	 * 
	 * <p>Any or all of the arrays {@code sources}, {@code types}, {@code ids}, {@code severities}, {@code lengths} and {@code messageLog} can also be null
	 * pointers, which causes the attributes for such arrays to be discarded when messages are fetched, however those messages will still be removed from the
	 * log. Thus to simply delete up to {@code count} messages from the message log while ignoring their attributes, the application can call the function with
	 * null pointers for all attribute arrays. If {@code messageLog} is {@code NULL}, the value of {@code bufSize} is ignored.</p>
	 *
	 * @param count      the number of debug messages to retrieve from the log
	 * @param bufSize    the maximum number of characters that can be written in the {@code messageLog} array
	 * @param sources    a buffer in which to place the returned message sources
	 * @param types      a buffer in which to place the returned message typesd
	 * @param ids        a buffer in which to place the returned message IDs
	 * @param severities a buffer in which to place the returned message severity levels
	 * @param lengths    a buffer in which to place the returned message lengths
	 * @param messageLog a buffer in which to place the returned messages
	 */
	public static int glGetDebugMessageLogARB(int count, int bufSize, ByteBuffer sources, ByteBuffer types, ByteBuffer ids, ByteBuffer severities, ByteBuffer lengths, ByteBuffer messageLog) {
		if ( CHECKS ) {
			if ( messageLog != null ) checkBuffer(messageLog, bufSize);
			if ( sources != null ) checkBuffer(sources, count << 2);
			if ( types != null ) checkBuffer(types, count << 2);
			if ( ids != null ) checkBuffer(ids, count << 2);
			if ( severities != null ) checkBuffer(severities, count << 2);
			if ( lengths != null ) checkBuffer(lengths, count << 2);
		}
		return nglGetDebugMessageLogARB(count, bufSize, memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(messageLog));
	}

	/** Alternative version of: {@link #glGetDebugMessageLogARB GetDebugMessageLogARB} */
	public static int glGetDebugMessageLogARB(int count, IntBuffer sources, IntBuffer types, IntBuffer ids, IntBuffer severities, IntBuffer lengths, ByteBuffer messageLog) {
		if ( CHECKS ) {
			if ( sources != null ) checkBuffer(sources, count);
			if ( types != null ) checkBuffer(types, count);
			if ( ids != null ) checkBuffer(ids, count);
			if ( severities != null ) checkBuffer(severities, count);
			if ( lengths != null ) checkBuffer(lengths, count);
		}
		return nglGetDebugMessageLogARB(count, messageLog == null ? 0 : messageLog.remaining(), memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(messageLog));
	}

}