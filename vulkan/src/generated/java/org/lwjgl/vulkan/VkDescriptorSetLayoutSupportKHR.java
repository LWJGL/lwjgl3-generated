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
 * See {@link VkDescriptorSetLayoutSupport}.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDescriptorSetLayoutSupportKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 supported;
 * }</pre></code>
 */
public class VkDescriptorSetLayoutSupportKHR extends VkDescriptorSetLayoutSupport {

    VkDescriptorSetLayoutSupportKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDescriptorSetLayoutSupportKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutSupportKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorSetLayoutSupportKHR} instance for the specified memory address. */
    public static VkDescriptorSetLayoutSupportKHR create(long address) {
        return new VkDescriptorSetLayoutSupportKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutSupportKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutSupportKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetLayoutSupportKHR} structs. */
    public static class Buffer extends VkDescriptorSetLayoutSupport.Buffer {

        /**
         * Creates a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutSupportKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetLayoutSupportKHR newInstance(long address) {
            return new VkDescriptorSetLayoutSupportKHR(address, container);
        }

    }

}