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
@NativeType("cache_read")
public interface BGFXCacheReadCallbackI extends CallbackI.Z {

    String SIGNATURE = "(plpi)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgLongLong(args),
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
    @NativeType("bool") boolean invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("uint64_t") long _id, @NativeType("void *") long _data, @NativeType("uint32_t") int _size);

}