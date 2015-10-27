/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link AMDDebugOutput#glDebugMessageCallbackAMD} method. */
public abstract class GLDebugMessageAMDCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(6);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.opengl.GLDebugMessageAMDCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_SYSTEM,
			CIF, ffi_type_void,
			ARGS, ffi_type_uint32, ffi_type_uint32, ffi_type_uint32, ffi_type_sint32, ffi_type_pointer, ffi_type_pointer
		);
	}

	protected GLDebugMessageAMDCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 3 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 4 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 5 + args))
		);
	}

	/**
	 * Will be called when a debug message is generated.
	 *
	 * @param id        the message ID
	 * @param category  the message category
	 * @param severity  the message severity
	 * @param length    the message length, excluding the null-terminator
	 * @param message   a pointer to the message string representation
	 * @param userParam the user-specified value that was passed when calling {@link AMDDebugOutput#glDebugMessageCallbackAMD}
	 */
	public abstract void invoke(int id, int category, int severity, int length, long message, long userParam);

	/** A functional interface for {@link GLDebugMessageAMDCallback}. */
	public interface SAM {
		void invoke(int id, int category, int severity, int length, long message, long userParam);
	}

	/**
	 * Creates a {@link GLDebugMessageAMDCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLDebugMessageAMDCallback} instance
	 */
	public static GLDebugMessageAMDCallback create(final SAM sam) {
		return new GLDebugMessageAMDCallback() {
			@Override
			public void invoke(int id, int category, int severity, int length, long message, long userParam) {
				sam.invoke(id, category, severity, length, message, userParam);
			}
		};
	}

	/**
	 * Converts the specified {@link GLDebugMessageAMDCallback} arguments to a String.
	 *
	 * <p>This method may only be used inside a GLDebugMessageAMDCallback invocation.</p>
	 *
	 * @param length  the GLDebugMessageAMDCallback {@code length} argument
	 * @param message the GLDebugMessageAMDCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	public static String getMessage(int length, long message) {
		return memDecodeUTF8(memByteBuffer(message, length));
	}

	/** A functional interface for {@link GLDebugMessageAMDCallback}. */
	public interface SAMString {
		void invoke(int id, int category, int severity, String message, long userParam);
	}

	/**
	 * Creates a {@link GLDebugMessageAMDCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLDebugMessageAMDCallback} instance
	 */
	public static GLDebugMessageAMDCallback createString(final SAMString sam) {
		return new GLDebugMessageAMDCallback() {
			@Override
			public void invoke(int id, int category, int severity, int length, long message, long userParam) {
				sam.invoke(id, category, severity, getMessage(length, message), userParam);
			}
		};
	}
	
}