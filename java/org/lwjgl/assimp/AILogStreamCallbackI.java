/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;


@FunctionalInterface
public interface AILogStreamCallbackI extends CallbackI.V {

	String SIGNATURE = "(pp)v";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Callback to be called for log stream messages
	 *
	 * @param message The message to be logged
	 * @param user    The user data from the log stream
	 */
	void invoke(long message, long user);

}