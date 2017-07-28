/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;


@FunctionalInterface
@NativeType("YGFree")
public interface YGFreeI extends CallbackI.P {

    String SIGNATURE = "(p)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args)
        );
    }

    @NativeType("void *") long invoke(@NativeType("void *") long ptr);

}