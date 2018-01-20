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
@NativeType("cache_write")
public interface BGFXCacheWriteCallbackI extends CallbackI.V {

    String SIGNATURE = "(plpi)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgLongLong(args),
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
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("uint64_t") long _id, @NativeType("const void *") long _data, @NativeType("uint32_t") int _size);

}