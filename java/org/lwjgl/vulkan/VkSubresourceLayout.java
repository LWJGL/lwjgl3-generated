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
 * Structure specifying subresource layout.
 * 
 * <h5>Description</h5>
 * 
 * <p>For images created with linear tiling, {@code rowPitch}, {@code arrayPitch} and {@code depthPitch} describe the layout of the image subresource in linear memory. For uncompressed formats, {@code rowPitch} is the number of bytes between texels with the same x coordinate in adjacent rows (y coordinates differ by one). {@code arrayPitch} is the number of bytes between texels with the same x and y coordinate in adjacent array layers of the image (array layer values differ by one). {@code depthPitch} is the number of bytes between texels with the same x and y coordinate in adjacent slices of a 3D image (z coordinates differ by one). Expressed as an addressing formula, the starting byte of a texel in the image subresource has address:</p>
 * 
 * <code><pre>
 * // (x,y,z,layer) are in texel coordinates
 * address(x,y,z,layer) = layer*arrayPitch + z*depthPitch + y*rowPitch + x*elementSize + offset</pre></code>
 * 
 * <p>For compressed formats, the {@code rowPitch} is the number of bytes between compressed texel blocks in adjacent rows. {@code arrayPitch} is the number of bytes between compressed texel blocks in adjacent array layers. {@code depthPitch} is the number of bytes between compressed texel blocks in adjacent slices of a 3D image.</p>
 * 
 * <code><pre>
 * // (x,y,z,layer) are in compressed texel block coordinates
 * address(x,y,z,layer) = layer*arrayPitch + z*depthPitch + y*rowPitch + x*compressedTexelBlockByteSize + offset;</pre></code>
 * 
 * <p>{@code arrayPitch} is undefined for images that were not created as arrays. {@code depthPitch} is defined only for 3D images.</p>
 * 
 * <p>For color formats, the {@code aspectMask} member of {@link VkImageSubresource} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}. For depth/stencil formats, {@code aspectMask} <b>must</b> be either {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}. On implementations that store depth and stencil aspects separately, querying each of these image subresource layouts will return a different {@code offset} and {@code size} representing the region of memory used for that aspect. On implementations that store depth and stencil aspects interleaved, the same {@code offset} and {@code size} are returned and represent the interleaved memory allocation.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkGetImageSubresourceLayout GetImageSubresourceLayout}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code offset} &ndash; the byte offset from the start of the image where the image subresource begins.</li>
 * <li>{@code size} &ndash; the size in bytes of the image subresource. {@code size} includes any extra memory that is required based on {@code rowPitch}.</li>
 * <li>{@code rowPitch} &ndash; describes the number of bytes between each row of texels in an image.</li>
 * <li>{@code arrayPitch} &ndash; describes the number of bytes between each array layer of an image.</li>
 * <li>{@code depthPitch} &ndash; describes the number of bytes between each slice of 3D image.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkSubresourceLayout {
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 *     VkDeviceSize rowPitch;
 *     VkDeviceSize arrayPitch;
 *     VkDeviceSize depthPitch;
 * }</pre></code>
 */
public class VkSubresourceLayout extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        SIZE,
        ROWPITCH,
        ARRAYPITCH,
        DEPTHPITCH;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        ROWPITCH = layout.offsetof(2);
        ARRAYPITCH = layout.offsetof(3);
        DEPTHPITCH = layout.offsetof(4);
    }

    VkSubresourceLayout(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSubresourceLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubresourceLayout(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** Returns the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** Returns the value of the {@code rowPitch} field. */
    @NativeType("VkDeviceSize")
    public long rowPitch() { return nrowPitch(address()); }
    /** Returns the value of the {@code arrayPitch} field. */
    @NativeType("VkDeviceSize")
    public long arrayPitch() { return narrayPitch(address()); }
    /** Returns the value of the {@code depthPitch} field. */
    @NativeType("VkDeviceSize")
    public long depthPitch() { return ndepthPitch(address()); }

    // -----------------------------------

    /** Returns a new {@link VkSubresourceLayout} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkSubresourceLayout} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkSubresourceLayout} instance allocated with {@link BufferUtils}. */
    public static VkSubresourceLayout create() {
        return new VkSubresourceLayout(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkSubresourceLayout} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkSubresourceLayout create(long address) {
        return address == NULL ? null : new VkSubresourceLayout(address, null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkSubresourceLayout.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkSubresourceLayout} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSubresourceLayout mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkSubresourceLayout} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSubresourceLayout callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkSubresourceLayout} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubresourceLayout} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkSubresourceLayout.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkSubresourceLayout.SIZE); }
    /** Unsafe version of {@link #rowPitch}. */
    public static long nrowPitch(long struct) { return memGetLong(struct + VkSubresourceLayout.ROWPITCH); }
    /** Unsafe version of {@link #arrayPitch}. */
    public static long narrayPitch(long struct) { return memGetLong(struct + VkSubresourceLayout.ARRAYPITCH); }
    /** Unsafe version of {@link #depthPitch}. */
    public static long ndepthPitch(long struct) { return memGetLong(struct + VkSubresourceLayout.DEPTHPITCH); }

    // -----------------------------------

    /** An array of {@link VkSubresourceLayout} structs. */
    public static class Buffer extends StructBuffer<VkSubresourceLayout, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkSubresourceLayout.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubresourceLayout#SIZEOF}, and its mark will be undefined.
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
        protected VkSubresourceLayout newInstance(long address) {
            return new VkSubresourceLayout(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkSubresourceLayout.noffset(address()); }
        /** Returns the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkSubresourceLayout.nsize(address()); }
        /** Returns the value of the {@code rowPitch} field. */
        @NativeType("VkDeviceSize")
        public long rowPitch() { return VkSubresourceLayout.nrowPitch(address()); }
        /** Returns the value of the {@code arrayPitch} field. */
        @NativeType("VkDeviceSize")
        public long arrayPitch() { return VkSubresourceLayout.narrayPitch(address()); }
        /** Returns the value of the {@code depthPitch} field. */
        @NativeType("VkDeviceSize")
        public long depthPitch() { return VkSubresourceLayout.ndepthPitch(address()); }

    }

}