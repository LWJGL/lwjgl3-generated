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
 * Structure describing a supported swapchain format tuple.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code surfaceFormat} &ndash; an instance of {@link VkSurfaceFormatKHR} describing a format-color space pair that is compatible with the specified surface.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkSurfaceFormat2KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkSurfaceFormatKHR VkSurfaceFormatKHR} surfaceFormat;
 * }</pre></code>
 */
public class VkSurfaceFormat2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SURFACEFORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkSurfaceFormatKHR.SIZEOF, VkSurfaceFormatKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SURFACEFORMAT = layout.offsetof(2);
    }

    VkSurfaceFormat2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSurfaceFormat2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceFormat2KHR(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns a {@link VkSurfaceFormatKHR} view of the {@code surfaceFormat} field. */
    public VkSurfaceFormatKHR surfaceFormat() { return nsurfaceFormat(address()); }

    // -----------------------------------

    /** Returns a new {@link VkSurfaceFormat2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceFormat2KHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkSurfaceFormat2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceFormat2KHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkSurfaceFormat2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceFormat2KHR create() {
        return new VkSurfaceFormat2KHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkSurfaceFormat2KHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkSurfaceFormat2KHR create(long address) {
        return address == NULL ? null : new VkSurfaceFormat2KHR(address, null);
    }

    /**
     * Returns a new {@link VkSurfaceFormat2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFormat2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFormat2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkSurfaceFormat2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkSurfaceFormat2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSurfaceFormat2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkSurfaceFormat2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSurfaceFormat2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkSurfaceFormat2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceFormat2KHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkSurfaceFormat2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceFormat2KHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSurfaceFormat2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSurfaceFormat2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSurfaceFormat2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFormat2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSurfaceFormat2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfaceFormat2KHR.PNEXT); }
    /** Unsafe version of {@link #surfaceFormat}. */
    public static VkSurfaceFormatKHR nsurfaceFormat(long struct) { return VkSurfaceFormatKHR.create(struct + VkSurfaceFormat2KHR.SURFACEFORMAT); }

    // -----------------------------------

    /** An array of {@link VkSurfaceFormat2KHR} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceFormat2KHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkSurfaceFormat2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceFormat2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSurfaceFormat2KHR newInstance(long address) {
            return new VkSurfaceFormat2KHR(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkSurfaceFormat2KHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkSurfaceFormat2KHR.npNext(address()); }
        /** Returns a {@link VkSurfaceFormatKHR} view of the {@code surfaceFormat} field. */
        public VkSurfaceFormatKHR surfaceFormat() { return VkSurfaceFormat2KHR.nsurfaceFormat(address()); }

    }

}