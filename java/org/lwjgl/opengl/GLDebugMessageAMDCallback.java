/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@link AMDDebugOutput#glDebugMessageCallbackAMD DebugMessageCallbackAMD} method. */
public abstract class GLDebugMessageAMDCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.opengl.GLDebugMessageAMDCallback");

	protected GLDebugMessageAMDCallback() {
		super(CALL_CONVENTION_SYSTEM + "(iiiipp)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
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
	 * @param userParam the user-specified value that was passed when calling {@link AMDDebugOutput#glDebugMessageCallbackAMD DebugMessageCallbackAMD}
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
	public static GLDebugMessageAMDCallback create(SAM sam) {
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
		return memUTF8(memByteBuffer(message, length));
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
	public static GLDebugMessageAMDCallback createString(SAMString sam) {
		return new GLDebugMessageAMDCallback() {
			@Override
			public void invoke(int id, int category, int severity, int length, long message, long userParam) {
				sam.invoke(id, category, severity, getMessage(length, message), userParam);
			}
		};
	}

}