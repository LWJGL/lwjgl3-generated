/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@code LogCallback} member of the {@link OVRInitParams} struct. */
public abstract class OVRLogCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.ovr.OVRLogCallback");

	protected OVRLogCallback() {
		super(CALL_CONVENTION_DEFAULT + "(pip)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * The logging callback.
	 *
	 * @param userData an arbitrary value specified by the user of ovrInitParams
	 * @param level    one of the {@code ovrLogLevel} constants
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
	public static OVRLogCallback create(SAM sam) {
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
		return memUTF8(message);
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
	public static OVRLogCallback createString(SAMString sam) {
		return new OVRLogCallback() {
			@Override
			public void invoke(long userData, int level, long message) {
				sam.invoke(userData, level, getMessage(message));
			}
		};
	}

}