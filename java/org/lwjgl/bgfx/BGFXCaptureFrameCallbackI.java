/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Captured frame. */
@FunctionalInterface
public interface BGFXCaptureFrameCallbackI extends CallbackI.V {

	String SIGNATURE = "(ppi)v";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called when a frame is captured.
	 *
	 * @param _this the callback interface
	 * @param _data image data
	 * @param _size image size
	 */
	void invoke(long _this, long _data, int _size);

}