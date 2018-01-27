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
 * void* (*) (
 *     size_t size
 * )</pre></code>
 */
@FunctionalInterface
@NativeType("void* (*) (size_t)")
public interface RPMemoryMapCallbackI extends CallbackI.P {

    String SIGNATURE = "(p)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args)
        );
    }

    /**
     * Map memory pages for the given number of bytes.
     * 
     * <p>The returned address MUST be 2 byte aligned, and should ideally be 64KiB aligned. If memory returned is not 64KiB aligned rpmalloc will call unmap and
     * then another map request with size padded by 64KiB in order to align it internally.</p>
     *
     * @param size the number of bytes to map
     */
    @NativeType("void *") long invoke(@NativeType("size_t") long size);

}