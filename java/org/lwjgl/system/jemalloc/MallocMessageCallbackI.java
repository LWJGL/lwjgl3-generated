/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link JEmalloc#je_malloc_usable_size malloc_usable_size} method. */
@FunctionalInterface
public interface MallocMessageCallbackI extends CallbackI.V {

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
     * Will be called by the {@link JEmalloc#je_malloc_usable_size malloc_usable_size} method.
     *
     * @param cbopaque the opaque pointer passed to {@link JEmalloc#je_malloc_usable_size malloc_usable_size}
     * @param s        the message
     */
    void invoke(long cbopaque, long s);

}