/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**  */
@FunctionalInterface
public interface BGFXCacheReadSizeCallbackI extends CallbackI.I {

	String SIGNATURE = "(pl)i";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default int callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgLong(args)
		);
	}


	int invoke(long _this, long _id);

}