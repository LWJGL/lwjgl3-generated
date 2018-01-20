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
 * Structure specifying combined image sampler descriptor count for multi-planar images.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSamplerYcbcrConversion#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code combinedImageSamplerDescriptorCount} &ndash; the number of combined image sampler descriptors that the implementation uses to access the format.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkSamplerYcbcrConversionImageFormatPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t combinedImageSamplerDescriptorCount;
 * }</pre></code>
 */
public class VkSamplerYcbcrConversionImageFormatPropertiesKHR extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMBINEDIMAGESAMPLERDESCRIPTORCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMBINEDIMAGESAMPLERDESCRIPTORCOUNT = layout.offsetof(2);
    }

    VkSamplerYcbcrConversionImageFormatPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSamplerYcbcrConversionImageFormatPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code combinedImageSamplerDescriptorCount} field. */
    @NativeType("uint32_t")
    public int combinedImageSamplerDescriptorCount() { return ncombinedImageSamplerDescriptorCount(address()); }

    // -----------------------------------

    /** Returns a new {@link VkSamplerYcbcrConversionImageFormatPropertiesKHR} instance for the specified memory address. */
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR create(long address) {
        return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkSamplerYcbcrConversionImageFormatPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionImageFormatPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerYcbcrConversionImageFormatPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #combinedImageSamplerDescriptorCount}. */
    public static int ncombinedImageSamplerDescriptorCount(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionImageFormatPropertiesKHR.COMBINEDIMAGESAMPLERDESCRIPTORCOUNT); }

    // -----------------------------------

    /** An array of {@link VkSamplerYcbcrConversionImageFormatPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkSamplerYcbcrConversionImageFormatPropertiesKHR, Buffer> {

        /**
         * Creates a new {@link VkSamplerYcbcrConversionImageFormatPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerYcbcrConversionImageFormatPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSamplerYcbcrConversionImageFormatPropertiesKHR newInstance(long address) {
            return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerYcbcrConversionImageFormatPropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSamplerYcbcrConversionImageFormatPropertiesKHR.npNext(address()); }
        /** Returns the value of the {@code combinedImageSamplerDescriptorCount} field. */
        @NativeType("uint32_t")
        public int combinedImageSamplerDescriptorCount() { return VkSamplerYcbcrConversionImageFormatPropertiesKHR.ncombinedImageSamplerDescriptorCount(address()); }

    }

}