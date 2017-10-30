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
 * Structure specifying a image subresource.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
 * <li>{@code aspectMask} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSparseImageMemoryBind}, {@link VK10#vkGetImageSubresourceLayout GetImageSubresourceLayout}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code aspectMask} &ndash; a {@code VkImageAspectFlags} selecting the image <em>aspect</em>.</li>
 * <li>{@code mipLevel} &ndash; selects the mipmap level.</li>
 * <li>{@code arrayLayer} &ndash; selects the array layer.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImageSubresource {
 *     VkImageAspectFlags aspectMask;
 *     uint32_t mipLevel;
 *     uint32_t arrayLayer;
 * }</pre></code>
 */
public class VkImageSubresource extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASPECTMASK,
        MIPLEVEL,
        ARRAYLAYER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASPECTMASK = layout.offsetof(0);
        MIPLEVEL = layout.offsetof(1);
        ARRAYLAYER = layout.offsetof(2);
    }

    VkImageSubresource(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImageSubresource} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageSubresource(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code aspectMask} field. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }
    /** Returns the value of the {@code mipLevel} field. */
    @NativeType("uint32_t")
    public int mipLevel() { return nmipLevel(address()); }
    /** Returns the value of the {@code arrayLayer} field. */
    @NativeType("uint32_t")
    public int arrayLayer() { return narrayLayer(address()); }

    /** Sets the specified value to the {@code aspectMask} field. */
    public VkImageSubresource aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }
    /** Sets the specified value to the {@code mipLevel} field. */
    public VkImageSubresource mipLevel(@NativeType("uint32_t") int value) { nmipLevel(address(), value); return this; }
    /** Sets the specified value to the {@code arrayLayer} field. */
    public VkImageSubresource arrayLayer(@NativeType("uint32_t") int value) { narrayLayer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageSubresource set(
        int aspectMask,
        int mipLevel,
        int arrayLayer
    ) {
        aspectMask(aspectMask);
        mipLevel(mipLevel);
        arrayLayer(arrayLayer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageSubresource set(VkImageSubresource src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImageSubresource} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageSubresource malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkImageSubresource} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageSubresource calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkImageSubresource} instance allocated with {@link BufferUtils}. */
    public static VkImageSubresource create() {
        return new VkImageSubresource(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImageSubresource} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkImageSubresource create(long address) {
        return address == NULL ? null : new VkImageSubresource(address, null);
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkImageSubresource.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImageSubresource} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageSubresource mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImageSubresource} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageSubresource callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImageSubresource} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresource mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageSubresource} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresource callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return memGetInt(struct + VkImageSubresource.ASPECTMASK); }
    /** Unsafe version of {@link #mipLevel}. */
    public static int nmipLevel(long struct) { return memGetInt(struct + VkImageSubresource.MIPLEVEL); }
    /** Unsafe version of {@link #arrayLayer}. */
    public static int narrayLayer(long struct) { return memGetInt(struct + VkImageSubresource.ARRAYLAYER); }

    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { memPutInt(struct + VkImageSubresource.ASPECTMASK, value); }
    /** Unsafe version of {@link #mipLevel(int) mipLevel}. */
    public static void nmipLevel(long struct, int value) { memPutInt(struct + VkImageSubresource.MIPLEVEL, value); }
    /** Unsafe version of {@link #arrayLayer(int) arrayLayer}. */
    public static void narrayLayer(long struct, int value) { memPutInt(struct + VkImageSubresource.ARRAYLAYER, value); }

    // -----------------------------------

    /** An array of {@link VkImageSubresource} structs. */
    public static class Buffer extends StructBuffer<VkImageSubresource, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImageSubresource.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageSubresource#SIZEOF}, and its mark will be undefined.
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
        protected VkImageSubresource newInstance(long address) {
            return new VkImageSubresource(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkImageSubresource.naspectMask(address()); }
        /** Returns the value of the {@code mipLevel} field. */
        @NativeType("uint32_t")
        public int mipLevel() { return VkImageSubresource.nmipLevel(address()); }
        /** Returns the value of the {@code arrayLayer} field. */
        @NativeType("uint32_t")
        public int arrayLayer() { return VkImageSubresource.narrayLayer(address()); }

        /** Sets the specified value to the {@code aspectMask} field. */
        public VkImageSubresource.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkImageSubresource.naspectMask(address(), value); return this; }
        /** Sets the specified value to the {@code mipLevel} field. */
        public VkImageSubresource.Buffer mipLevel(@NativeType("uint32_t") int value) { VkImageSubresource.nmipLevel(address(), value); return this; }
        /** Sets the specified value to the {@code arrayLayer} field. */
        public VkImageSubresource.Buffer arrayLayer(@NativeType("uint32_t") int value) { VkImageSubresource.narrayLayer(address(), value); return this; }

    }

}