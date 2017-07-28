/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link BGFX#bgfx_make_ref_release make_ref_release} method. */
@FunctionalInterface
@NativeType("bgfx_release_fn_t")
public interface BGFXReleaseFunctionCallbackI extends CallbackI.V {

    String SIGNATURE = "(pp)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /**
     * Memory release callback.
     *
     * @param _ptr      
     * @param _userData 
     */
    void invoke(@NativeType("void *") long _ptr, @NativeType("void *") long _userData);

}