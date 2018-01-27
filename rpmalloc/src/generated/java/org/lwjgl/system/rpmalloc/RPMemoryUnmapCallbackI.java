/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@link RPMallocConfig} struct.
 * 
 * <h3>Type</h3>
 * 
 * <code><pre>
 * void (*) (
 *     void *address,
 *     size_t size
 * )</pre></code>
 */
@FunctionalInterface
@NativeType("void (*) (void *, size_t)")
public interface RPMemoryUnmapCallbackI extends CallbackI.V {

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
     * Unmap the memory pages starting at address and spanning the given number of bytes.
     * 
     * <p>Address will always be an address returned by an earlier call to {@code memory_map} function.</p>
     *
     * @param address the address to unmap
     * @param size    the size of the mapped pages, in bytes
     */
    void invoke(@NativeType("void *") long address, @NativeType("size_t") long size);

}