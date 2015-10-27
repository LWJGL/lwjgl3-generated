/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@code LogCallback} member of the {@link OVRInitParams} struct. */
public abstract class OVRLogCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(3);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.ovr.OVRLogCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer
		);
	}

	protected OVRLogCallback() {
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
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 2 + args))
		);
	}

	/**
	 * The logging callback.
	 *
	 * @param userData an arbitrary value specified by the user of ovrInitParams
	 * @param level    one of the ovrLogLevel constants
	 * @param message  a UTF8-encoded null-terminated string
	 */
	public abstract void invoke(long userData, int level, long message);

	/** A functional interface for {@link OVRLogCallback}. */
	public interface SAM {
		void invoke(long userData, int level, long message);
	}

	/**
	 * Creates a {@link OVRLogCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link OVRLogCallback} instance
	 */
	public static OVRLogCallback create(final SAM sam) {
		return new OVRLogCallback() {
			@Override
			public void invoke(long userData, int level, long message) {
				sam.invoke(userData, level, message);
			}
		};
	}

	/**
	 * Converts the specified {@link OVRLogCallback} argument to a String.
	 *
	 * <p>This method may only be used inside a OVRLogCallback invocation.</p>
	 *
	 * @param message the OVRLogCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	public static String getMessage(long message) {
		return memDecodeUTF8(message);
	}

	/** A functional interface for {@link OVRLogCallback}. */
	public interface SAMString {
		void invoke(long userData, int level, String message);
	}

	/**
	 * Creates a {@link OVRLogCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link OVRLogCallback} instance
	 */
	public static OVRLogCallback createString(final SAMString sam) {
		return new OVRLogCallback() {
			@Override
			public void invoke(long userData, int level, long message) {
				sam.invoke(userData, level, getMessage(message));
			}
		};
	}
	
}