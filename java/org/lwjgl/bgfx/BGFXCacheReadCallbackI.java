/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Reads cached item. */
@FunctionalInterface
public interface BGFXCacheReadCallbackI extends CallbackI.Z {

	String SIGNATURE = "(plpi)B";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default boolean callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgLong(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called to read a cached item.
	 *
	 * @param _this the callback interface
	 * @param _id   cache id
	 * @param _data buffer where to read data
	 * @param _size size of data to read
	 *
	 * @return true if data is read
	 */
	boolean invoke(long _this, long _id, long _data, int _size);

}