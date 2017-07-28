/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@link ChunkHooks} struct. */
@FunctionalInterface
@NativeType("chunk_alloc_t")
public interface ChunkAllocI extends CallbackI.P {

    String SIGNATURE = "(pppppi)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    /**
     * Chunk allocation hook.
     *
     * @param new_addr  
     * @param size      
     * @param alignment 
     * @param zero      
     * @param commit    
     * @param arena_ind 
     */
    @NativeType("void *") long invoke(@NativeType("void *") long new_addr, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("bool *") long zero, @NativeType("bool *") long commit, @NativeType("unsigned int") int arena_ind);

}