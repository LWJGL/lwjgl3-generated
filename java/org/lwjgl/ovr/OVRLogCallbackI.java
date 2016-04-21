/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@code LogCallback} member of the {@link OVRInitParams} struct. */
@FunctionalInterface
public interface OVRLogCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pip)v", false);
	}

	@Override
	default void callback(long args) {
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
	void invoke(long userData, int level, long message);

}