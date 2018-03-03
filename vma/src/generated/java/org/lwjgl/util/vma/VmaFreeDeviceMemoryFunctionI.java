/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@link VmaDeviceMemoryCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <code><pre>
 * void (*) (
 *     VmaAllocator allocator,
 *     uint32_t memoryType,
 *     VkDeviceMemory memory,
 *     VkDeviceSize size
 * )</pre></code>
 */
@FunctionalInterface
@NativeType("PFN_vmaFreeDeviceMemoryFunction")
public interface VmaFreeDeviceMemoryFunctionI extends CallbackI.V {

    String SIGNATURE = "(pill)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgLongLong(args),
            dcbArgLongLong(args)
        );
    }

    /**
     * Called before {@code vkFreeMemory}.
     *
     * @param allocator  
     * @param memoryType 
     * @param memory     
     * @param size       
     */
    void invoke(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int memoryType, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize") long size);

}