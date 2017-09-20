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
@NativeType("extent_alloc_t")
public interface ExtentAllocI extends CallbackI.P {

    String SIGNATURE = "(ppppppi)p";

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
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    /**
     * Extent allocation hook.
     * 
     * <p>An extent allocation function conforms to the {@code extent_alloc_t} type and upon success returns a pointer to {@code size} bytes of mapped memory on
     * behalf of arena {@code arena_ind} such that the extent's base address is a multiple of {@code alignment}, as well as setting {@code *zero} to indicate
     * whether the extent is zeroed and {@code *commit} to indicate whether the extent is committed. Upon error the function returns {@code NULL} and leaves
     * {@code *zero} and {@code *commit} unmodified. The {@code size} parameter is always a multiple of the page size. The {@code alignment} parameter is always a
     * power of two at least as large as the page size. Zeroing is mandatory if {@code *zero} is true upon function entry. Committing is mandatory if
     * {@code *commit} is true upon function entry. If {@code new_addr} is not {@code NULL}, the returned pointer must be {@code new_addr} on success or {@code NULL} on error.
     * Committed memory may be committed in absolute terms as on a system that does not overcommit, or in implicit terms as on a system that overcommits and
     * satisfies physical memory needs on demand via soft page faults. Note that replacing the default extent allocation function makes the arena's
     * {@code arena.i.dss} setting irrelevant.</p>
     *
     * @param extent_hooks 
     * @param new_addr     
     * @param size         
     * @param alignment    
     * @param zero         
     * @param commit       
     * @param arena_ind    
     */
    @NativeType("void *") long invoke(@NativeType("extent_hooks_t *") long extent_hooks, @NativeType("void *") long new_addr, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("bool *") long zero, @NativeType("bool *") long commit, @NativeType("unsigned int") int arena_ind);

}