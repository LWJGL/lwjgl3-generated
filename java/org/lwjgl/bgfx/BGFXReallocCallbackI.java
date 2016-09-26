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
public interface BGFXReallocCallbackI extends CallbackI.P {

	String SIGNATURE = "(pppppi)p";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default long callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}


	long invoke(long _this, long _ptr, long _size, long _align, long _file, int _line);

}