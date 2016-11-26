/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;


@FunctionalInterface
public interface AIFileSeekI extends CallbackI.I {

	String SIGNATURE = "(ppi)i";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default int callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * File seek procedure
	 *
	 * @param pFile  File pointer to seek to
	 * @param offset Number of bytes to shift from origin
	 * @param origin Position used as reference for the offset.
	 */
	int invoke(long pFile, long offset, int origin);

}