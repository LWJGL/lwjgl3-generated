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
 * See {@link VkQueueFamilyProperties2}.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkQueueFamilyProperties2KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkQueueFamilyProperties VkQueueFamilyProperties} queueFamilyProperties;
 * }</pre></code>
 */
public class VkQueueFamilyProperties2KHR extends VkQueueFamilyProperties2 {

    VkQueueFamilyProperties2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkQueueFamilyProperties2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyProperties2KHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    // -----------------------------------

    /** Returns a new {@link VkQueueFamilyProperties2KHR} instance for the specified memory address. */
    public static VkQueueFamilyProperties2KHR create(long address) {
        return new VkQueueFamilyProperties2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyProperties2KHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkQueueFamilyProperties2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyProperties2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyProperties2KHR} structs. */
    public static class Buffer extends VkQueueFamilyProperties2.Buffer {

        /**
         * Creates a new {@link VkQueueFamilyProperties2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyProperties2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkQueueFamilyProperties2KHR newInstance(long address) {
            return new VkQueueFamilyProperties2KHR(address, container);
        }

    }

}