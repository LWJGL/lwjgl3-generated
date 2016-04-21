/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link AMDDebugOutput#glDebugMessageCallbackAMD DebugMessageCallbackAMD} method. */
@FunctionalInterface
public interface GLDebugMessageAMDCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(iiiipp)v", true);
	}

	@Override
	default void callback(long args) {
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
	void invoke(int id, int category, int severity, int length, long message, long userParam);

}