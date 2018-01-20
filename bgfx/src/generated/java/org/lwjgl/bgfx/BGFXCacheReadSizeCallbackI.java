/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Returns the size of a cached item. Returns 0 if no cached item was found. */
@FunctionalInterface
@NativeType("cache_read_size")
public interface BGFXCacheReadSizeCallbackI extends CallbackI.I {

    String SIGNATURE = "(pl)i";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgLongLong(args)
        );
    }

    /**
     * Will be called to determine size of cached item.
     *
     * @param _this the callback interface
     * @param _id   cache id
     *
     * @return number of bytes to read
     */
    @NativeType("uint32_t") int invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("uint64_t") long _id);

}