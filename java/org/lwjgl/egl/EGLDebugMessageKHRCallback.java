/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link KHRDebug#eglDebugMessageControlKHR} method. */
public abstract class EGLDebugMessageKHRCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(6);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.egl.EGLDebugMessageKHRCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_SYSTEM,
			CIF, ffi_type_void,
			ARGS, ffi_type_uint32, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
		);
	}

	protected EGLDebugMessageKHRCallback() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			memGetInt(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 3 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 4 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 5 + args))
		);
	}

	/**
	 * Will be called when a debug message is generated.
	 *
	 * @param error       will contain an EGL error code, or {@link EGL10#EGL_SUCCESS}, as applicable
	 * @param command     will contain a pointer to a string. Example "eglBindApi".
	 * @param messageType will contain one of the debug message types
	 * @param threadLabel will contain the label attached to the current thread. The {@code threadLabel} will be {@code NULL} if not set by the application. If the message is from
	 *                    an internal thread, the label will be {@code NULL}.
	 * @param objectLabel will contain the label attached to the primary object of the message; Labels will be {@code NULL} if not set by the application. The primary object should
	 *                    be the object the function operates on, see table 13.2 which provides the recommended mapping between functions and their primary object. This
	 *                    {@code objectLabel} may be {@code NULL} even though the application labeled the object. This is because it is possible an error was raised while executing
	 *                    the command before the primary object was validated, therefore its label can not be included in the callback.
	 * @param message     will contain a platform specific debug string message; This string should provide added information to the application developer regarding the
	 *                    condition that generated the message. The format of a message is implementation-defined, although it should represent a concise description of the
	 *                    event that caused the message to be generated. Message strings can be {@code NULL} and should not be assumed otherwise.
	 */
	public abstract void invoke(int error, long command, int messageType, long threadLabel, long objectLabel, long message);

	/** A functional interface for {@link EGLDebugMessageKHRCallback}. */
	public interface SAM {
		void invoke(int error, long command, int messageType, long threadLabel, long objectLabel, long message);
	}

	/**
	 * Creates a {@link EGLDebugMessageKHRCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link EGLDebugMessageKHRCallback} instance
	 */
	public static EGLDebugMessageKHRCallback create(final SAM sam) {
		return new EGLDebugMessageKHRCallback() {
			@Override
			public void invoke(int error, long command, int messageType, long threadLabel, long objectLabel, long message) {
				sam.invoke(error, command, messageType, threadLabel, objectLabel, message);
			}
		};
	}

	/**
	 * Converts the specified {@link EGLDebugMessageKHRCallback} argument to a String.
	 *
	 * <p>This method may only be used inside an EGLDebugMessageKHRCallback invocation.</p>
	 *
	 * @param command the EGLDebugMessageKHRCallback {@code command} argument
	 *
	 * @return the command as a String
	 */
	public static String getCommand(long command) {
		return memDecodeASCII(command);
	}

	/**
	 * Converts the specified {@link EGLDebugMessageKHRCallback} argument to a String.
	 *
	 * <p>This method may only be used inside an EGLDebugMessageKHRCallback invocation.</p>
	 *
	 * @param message the EGLDebugMessageKHRCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	public static String getMessage(long message) {
		return memDecodeUTF8(message);
	}

	/** A functional interface for {@link EGLDebugMessageKHRCallback}. */
	public interface SAMString {
		void invoke(int error, String command, int messageType, long threadLabel, long objectLabel, String message);
	}

	/**
	 * Creates a {@link EGLDebugMessageKHRCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link EGLDebugMessageKHRCallback} instance
	 */
	public static EGLDebugMessageKHRCallback createString(final SAMString sam) {
		return new EGLDebugMessageKHRCallback() {
			@Override
			public void invoke(int error, long command, int messageType, long threadLabel, long objectLabel, long message) {
				sam.invoke(error, getCommand(command), messageType, threadLabel, objectLabel, getMessage(message));
			}
		};
	}
	
}