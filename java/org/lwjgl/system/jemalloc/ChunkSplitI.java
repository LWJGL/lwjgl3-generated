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
@NativeType("chunk_split_t")
public interface ChunkSplitI extends CallbackI.Z {

    String SIGNATURE = "(ppppBi)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgBool(args),
            dcbArgInt(args)
        );
    }

    /**
     * Chunk split hook.
     *
     * @param chunk     
     * @param size      
     * @param size_a    
     * @param size_b    
     * @param committed 
     * @param arena_ind 
     */
    @NativeType("bool") boolean invoke(@NativeType("void *") long chunk, @NativeType("size_t") long size, @NativeType("size_t") long size_a, @NativeType("size_t") long size_b, @NativeType("bool") boolean committed, @NativeType("unsigned int") int arena_ind);

}