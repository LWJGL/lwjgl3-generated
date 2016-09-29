/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Called when capture begins. */
@FunctionalInterface
public interface BGFXCaptureBeginCallbackI extends CallbackI.V {

	String SIGNATURE = "(piiiiB)v";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgBool(args) != 0
		);
	}

	/**
	 * Will be called when capture begins.
	 *
	 * @param _this   the callback interface
	 * @param _width  image width
	 * @param _height image height
	 * @param _pitch  number of bytes to skip to next line
	 * @param _format texture format
	 * @param _yflip  if true image origin is bottom left
	 */
	void invoke(long _this, int _width, int _height, int _pitch, int _format, boolean _yflip);

}