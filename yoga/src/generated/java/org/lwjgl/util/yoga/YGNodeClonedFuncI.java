/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;


@FunctionalInterface
@NativeType("YGNodeClonedFunc")
public interface YGNodeClonedFuncI extends CallbackI.V {

    String SIGNATURE = "(pppi)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    void invoke(@NativeType("YGNodeRef") long oldNode, @NativeType("YGNodeRef") long newNode, @NativeType("YGNodeRef") long parent, int childIndex);

}