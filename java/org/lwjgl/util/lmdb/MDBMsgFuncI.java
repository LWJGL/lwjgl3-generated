/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** A callback function used to print a message from the library. */
@FunctionalInterface
public interface MDBMsgFuncI extends CallbackI.I {

	String SIGNATURE = "(pp)i";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default int callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * A callback function used to print a message from the library.
	 *
	 * @param msg the string to be printed
	 * @param ctx an arbitrary context pointer for the callback
	 *
	 * @return &lt; 0 on failure, &ge; 0 on success
	 */
	int invoke(long msg, long ctx);

}