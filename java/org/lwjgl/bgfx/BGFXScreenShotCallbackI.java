/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Screenshot captured. Screenshot format is always 4-byte BGRA. */
@FunctionalInterface
public interface BGFXScreenShotCallbackI extends CallbackI.V {

	String SIGNATURE = "(ppiiipiB)v";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgBool(args) != 0
		);
	}

	/**
	 * 
	 *
	 * @param _this     the callback interface
	 * @param _filePath file path
	 * @param _width    image width
	 * @param _height   image height
	 * @param _pitch    number of bytes to skip to next line
	 * @param _data     image data
	 * @param _size     image size
	 * @param _yflip    if true image origin is bottom left
	 */
	void invoke(long _this, long _filePath, int _width, int _height, int _pitch, long _data, int _size, boolean _yflip);

}