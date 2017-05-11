/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a image format properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the combination of parameters to {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR} is not supported by the implementation for use in {@link VK10#vkCreateImage CreateImage}, then all members of {@code imageFormatProperties} will be filled with zero.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageFormatProperties}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code imageFormatProperties} &ndash; an instance of a {@link VkImageFormatProperties} structure in which capabilities are returned.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkImageFormatProperties2KHR {
    VkStructureType sType;
    void * pNext;
    {@link VkImageFormatProperties VkImageFormatProperties} imageFormatProperties;
}</code></pre>
 */
public class VkImageFormatProperties2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEFORMATPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkImageFormatProperties.SIZEOF, VkImageFormatProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEFORMATPROPERTIES = layout.offsetof(2);
    }

    VkImageFormatProperties2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImageFormatProperties2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageFormatProperties2KHR(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns a {@link VkImageFormatProperties} view of the {@code imageFormatProperties} field. */
    public VkImageFormatProperties imageFormatProperties() { return nimageFormatProperties(address()); }

    // -----------------------------------

    /** Returns a new {@link VkImageFormatProperties2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageFormatProperties2KHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkImageFormatProperties2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageFormatProperties2KHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkImageFormatProperties2KHR} instance allocated with {@link BufferUtils}. */
    public static VkImageFormatProperties2KHR create() {
        return new VkImageFormatProperties2KHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImageFormatProperties2KHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkImageFormatProperties2KHR create(long address) {
        return address == NULL ? null : new VkImageFormatProperties2KHR(address, null);
    }

    /**
     * Returns a new {@link VkImageFormatProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkImageFormatProperties2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImageFormatProperties2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageFormatProperties2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImageFormatProperties2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageFormatProperties2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImageFormatProperties2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatProperties2KHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageFormatProperties2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatProperties2KHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageFormatProperties2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageFormatProperties2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageFormatProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageFormatProperties2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageFormatProperties2KHR.PNEXT); }
    /** Unsafe version of {@link #imageFormatProperties}. */
    public static VkImageFormatProperties nimageFormatProperties(long struct) { return VkImageFormatProperties.create(struct + VkImageFormatProperties2KHR.IMAGEFORMATPROPERTIES); }

    // -----------------------------------

    /** An array of {@link VkImageFormatProperties2KHR} structs. */
    public static class Buffer extends StructBuffer<VkImageFormatProperties2KHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImageFormatProperties2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageFormatProperties2KHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkImageFormatProperties2KHR newInstance(long address) {
            return new VkImageFormatProperties2KHR(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkImageFormatProperties2KHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkImageFormatProperties2KHR.npNext(address()); }
        /** Returns a {@link VkImageFormatProperties} view of the {@code imageFormatProperties} field. */
        public VkImageFormatProperties imageFormatProperties() { return VkImageFormatProperties2KHR.nimageFormatProperties(address()); }

    }

}