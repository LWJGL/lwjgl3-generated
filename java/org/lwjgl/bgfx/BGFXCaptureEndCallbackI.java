/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Called when capture ends. */
@FunctionalInterface
public interface BGFXCaptureEndCallbackI extends CallbackI.V {

	String SIGNATURE = "(p)v";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when capture ends.
	 *
	 * @param _this the callback interface
	 */
	void invoke(long _this);

}