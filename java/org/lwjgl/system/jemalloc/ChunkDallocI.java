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
@NativeType("chunk_dalloc_t")
public interface ChunkDallocI extends CallbackI.Z {

    String SIGNATURE = "(ppBi)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgBool(args),
            dcbArgInt(args)
        );
    }

    /**
     * Chunk deallocation hook.
     *
     * @param chunk     
     * @param size      
     * @param committed 
     * @param arena_ind 
     */
    @NativeType("bool") boolean invoke(@NativeType("void *") long chunk, @NativeType("size_t") long size, @NativeType("bool") boolean committed, @NativeType("unsigned int") int arena_ind);

}