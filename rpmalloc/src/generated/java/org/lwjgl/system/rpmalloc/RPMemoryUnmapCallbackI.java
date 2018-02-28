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
 *     size_t size,
 *     size_t offset,
 *     int release
 * )</pre></code>
 */
@FunctionalInterface
@NativeType("void (*) (void *, size_t, size_t, int)")
public interface RPMemoryUnmapCallbackI extends CallbackI.V {

    String SIGNATURE = "(pppi)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args) != 0
        );
    }

    /**
     * Unmap the memory pages starting at address and spanning the given number of bytes.
     * 
     * <p>If release is set to 1, the unmap is for an entire span range as returned by a previous call to {@code memory_map} and that the entire range should be
     * released. If release is set to 0, the unmap is a partial decommit of a subset of the mapped memory range.</p>
     *
     * @param address the address to unmap
     * @param size    the size of the mapped pages, in bytes
     * @param offset  the alignment offset
     * @param release the release flag
     */
    void invoke(@NativeType("void *") long address, @NativeType("size_t") long size, @NativeType("size_t") long offset, @NativeType("int") boolean release);

}