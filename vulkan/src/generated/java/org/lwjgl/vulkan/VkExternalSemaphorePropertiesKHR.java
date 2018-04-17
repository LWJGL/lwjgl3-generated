/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * See {@link VkExternalSemaphoreProperties}.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExternalSemaphorePropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes;
 *     VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes;
 *     VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures;
 * }</pre></code>
 */
public class VkExternalSemaphorePropertiesKHR extends VkExternalSemaphoreProperties {

    VkExternalSemaphorePropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExternalSemaphorePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalSemaphorePropertiesKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    // -----------------------------------

    /** Returns a new {@link VkExternalSemaphorePropertiesKHR} instance for the specified memory address. */
    public static VkExternalSemaphorePropertiesKHR create(long address) {
        return new VkExternalSemaphorePropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalSemaphorePropertiesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkExternalSemaphorePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalSemaphorePropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** An array of {@link VkExternalSemaphorePropertiesKHR} structs. */
    public static class Buffer extends VkExternalSemaphoreProperties.Buffer {

        /**
         * Creates a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalSemaphorePropertiesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkExternalSemaphorePropertiesKHR newInstance(long address) {
            return new VkExternalSemaphorePropertiesKHR(address, container);
        }

    }

}