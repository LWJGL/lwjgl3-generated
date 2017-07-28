/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;


@FunctionalInterface
@NativeType("YGRealloc")
public interface YGReallocI extends CallbackI.P {

    String SIGNATURE = "(pp)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    @NativeType("void *") long invoke(@NativeType("void *") long ptr, @NativeType("size_t") long size);

}