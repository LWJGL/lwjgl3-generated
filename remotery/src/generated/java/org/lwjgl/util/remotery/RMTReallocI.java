/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * <h3>Type</h3>
 * 
 * <code><pre>
 * void* (*) (
 *     void *mm_context,
 *     void *ptr,
 *     rmtU32 size
 * )</pre></code>
 */
@FunctionalInterface
@NativeType("rmtReallocPtr")
public interface RMTReallocI extends CallbackI.P {

    String SIGNATURE = "(ppi)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    @NativeType("void *") long invoke(@NativeType("void *") long mm_context, @NativeType("void *") long ptr, @NativeType("rmtU32") int size);

}