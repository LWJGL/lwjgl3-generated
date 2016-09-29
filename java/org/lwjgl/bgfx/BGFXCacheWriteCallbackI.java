/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Writes cached item. */
@FunctionalInterface
public interface BGFXCacheWriteCallbackI extends CallbackI.V {

	String SIGNATURE = "(plpi)v";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgLong(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called to writes a cached item.
	 *
	 * @param _this the callback interface
	 * @param _id   cache id
	 * @param _data data to write
	 * @param _size size of data to write
	 */
	void invoke(long _this, long _id, long _data, int _size);

}