/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@link ExtentHooks} struct. */
@FunctionalInterface
@NativeType("extent_merge_t")
public interface ExtentMergeI extends CallbackI.Z {

    String SIGNATURE = "(pppppBi)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgBool(args),
            dcbArgInt(args)
        );
    }

    /**
     * Extent merge hook.
     * 
     * <p>An extent merge function conforms to the {@code extent_merge_t} type and optionally merges adjacent extents, at given {@code addr_a} and {@code size_a}
     * with given {@code addr_b} and {@code size_b} into one contiguous extent, operating on {@code committed}/decommitted memory as indicated, on behalf of arena
     * {@code arena_ind}, returning false upon success. If the function returns true, this indicates that the extents remain distinct mappings and therefore
     * should continue to be operated on independently.</p>
     *
     * @param extent_hooks 
     * @param addr_a       
     * @param size_a       
     * @param addr_b       
     * @param size_b       
     * @param committed    
     * @param arena_ind    
     */
    @NativeType("bool") boolean invoke(@NativeType("extent_hooks_t *") long extent_hooks, @NativeType("void *") long addr_a, @NativeType("size_t") long size_a, @NativeType("void *") long addr_b, @NativeType("size_t") long size_b, @NativeType("bool") boolean committed, @NativeType("unsigned int") int arena_ind);

}