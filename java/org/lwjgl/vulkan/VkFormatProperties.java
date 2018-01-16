/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying image format properties.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>If no format feature flags are supported, the format itself is not supported, and images of that format cannot be created.</p>
 * </div>
 * 
 * <p>If {@code format} is a block-compression format, then buffers <b>must</b> not support any features for the format.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkFormatProperties2KHR}, {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code linearTilingFeatures} &ndash; a bitmask of {@code VkFormatFeatureFlagBits} specifying features supported by images created with a {@code tiling} parameter of {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}.</li>
 * <li>{@code optimalTilingFeatures} &ndash; a bitmask of {@code VkFormatFeatureFlagBits} specifying features supported by images created with a {@code tiling} parameter of {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}.</li>
 * <li>{@code bufferFeatures} &ndash; a bitmask of {@code VkFormatFeatureFlagBits} specifying features supported by buffers.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkFormatProperties {
 *     VkFormatFeatureFlags linearTilingFeatures;
 *     VkFormatFeatureFlags optimalTilingFeatures;
 *     VkFormatFeatureFlags bufferFeatures;
 * }</pre></code>
 */
public class VkFormatProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LINEARTILINGFEATURES,
        OPTIMALTILINGFEATURES,
        BUFFERFEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LINEARTILINGFEATURES = layout.offsetof(0);
        OPTIMALTILINGFEATURES = layout.offsetof(1);
        BUFFERFEATURES = layout.offsetof(2);
    }

    VkFormatProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkFormatProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFormatProperties(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code linearTilingFeatures} field. */
    @NativeType("VkFormatFeatureFlags")
    public int linearTilingFeatures() { return nlinearTilingFeatures(address()); }
    /** Returns the value of the {@code optimalTilingFeatures} field. */
    @NativeType("VkFormatFeatureFlags")
    public int optimalTilingFeatures() { return noptimalTilingFeatures(address()); }
    /** Returns the value of the {@code bufferFeatures} field. */
    @NativeType("VkFormatFeatureFlags")
    public int bufferFeatures() { return nbufferFeatures(address()); }

    // -----------------------------------

    /** Returns a new {@link VkFormatProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFormatProperties malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkFormatProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFormatProperties calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkFormatProperties} instance allocated with {@link BufferUtils}. */
    public static VkFormatProperties create() {
        return new VkFormatProperties(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkFormatProperties} instance for the specified memory address. */
    public static VkFormatProperties create(long address) {
        return new VkFormatProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFormatProperties createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkFormatProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFormatProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkFormatProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkFormatProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkFormatProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkFormatProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkFormatProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkFormatProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #linearTilingFeatures}. */
    public static int nlinearTilingFeatures(long struct) { return memGetInt(struct + VkFormatProperties.LINEARTILINGFEATURES); }
    /** Unsafe version of {@link #optimalTilingFeatures}. */
    public static int noptimalTilingFeatures(long struct) { return memGetInt(struct + VkFormatProperties.OPTIMALTILINGFEATURES); }
    /** Unsafe version of {@link #bufferFeatures}. */
    public static int nbufferFeatures(long struct) { return memGetInt(struct + VkFormatProperties.BUFFERFEATURES); }

    // -----------------------------------

    /** An array of {@link VkFormatProperties} structs. */
    public static class Buffer extends StructBuffer<VkFormatProperties, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkFormatProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFormatProperties#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
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
        protected VkFormatProperties newInstance(long address) {
            return new VkFormatProperties(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code linearTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags")
        public int linearTilingFeatures() { return VkFormatProperties.nlinearTilingFeatures(address()); }
        /** Returns the value of the {@code optimalTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags")
        public int optimalTilingFeatures() { return VkFormatProperties.noptimalTilingFeatures(address()); }
        /** Returns the value of the {@code bufferFeatures} field. */
        @NativeType("VkFormatFeatureFlags")
        public int bufferFeatures() { return VkFormatProperties.nbufferFeatures(address()); }

    }

}