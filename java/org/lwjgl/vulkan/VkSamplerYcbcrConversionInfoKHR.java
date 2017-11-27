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
 * Structure specifying Y'CbCr conversion to a sampler or image view.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSamplerYcbcrConversion#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR}</li>
 * <li>{@code conversion} <b>must</b> be a valid {@code VkSamplerYcbcrConversionKHR} handle</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code conversion} &ndash; a {@code VkSamplerYcbcrConversionKHR} handle created with {@link KHRSamplerYcbcrConversion#vkCreateSamplerYcbcrConversionKHR CreateSamplerYcbcrConversionKHR}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkSamplerYcbcrConversionInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkSamplerYcbcrConversionKHR conversion;
 * }</pre></code>
 */
public class VkSamplerYcbcrConversionInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CONVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONVERSION = layout.offsetof(2);
    }

    VkSamplerYcbcrConversionInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSamplerYcbcrConversionInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerYcbcrConversionInfoKHR(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code conversion} field. */
    @NativeType("VkSamplerYcbcrConversionKHR")
    public long conversion() { return nconversion(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSamplerYcbcrConversionInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSamplerYcbcrConversionInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code conversion} field. */
    public VkSamplerYcbcrConversionInfoKHR conversion(@NativeType("VkSamplerYcbcrConversionKHR") long value) { nconversion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerYcbcrConversionInfoKHR set(
        int sType,
        long pNext,
        long conversion
    ) {
        sType(sType);
        pNext(pNext);
        conversion(conversion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerYcbcrConversionInfoKHR set(VkSamplerYcbcrConversionInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkSamplerYcbcrConversionInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionInfoKHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkSamplerYcbcrConversionInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionInfoKHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkSamplerYcbcrConversionInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSamplerYcbcrConversionInfoKHR create() {
        return new VkSamplerYcbcrConversionInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkSamplerYcbcrConversionInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkSamplerYcbcrConversionInfoKHR create(long address) {
        return address == NULL ? null : new VkSamplerYcbcrConversionInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkSamplerYcbcrConversionInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSamplerYcbcrConversionInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkSamplerYcbcrConversionInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSamplerYcbcrConversionInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerYcbcrConversionInfoKHR.PNEXT); }
    /** Unsafe version of {@link #conversion}. */
    public static long nconversion(long struct) { return memGetLong(struct + VkSamplerYcbcrConversionInfoKHR.CONVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerYcbcrConversionInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #conversion(long) conversion}. */
    public static void nconversion(long struct, long value) { memPutLong(struct + VkSamplerYcbcrConversionInfoKHR.CONVERSION, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerYcbcrConversionInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSamplerYcbcrConversionInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerYcbcrConversionInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSamplerYcbcrConversionInfoKHR newInstance(long address) {
            return new VkSamplerYcbcrConversionInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerYcbcrConversionInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkSamplerYcbcrConversionInfoKHR.npNext(address()); }
        /** Returns the value of the {@code conversion} field. */
        @NativeType("VkSamplerYcbcrConversionKHR")
        public long conversion() { return VkSamplerYcbcrConversionInfoKHR.nconversion(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSamplerYcbcrConversionInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerYcbcrConversionInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSamplerYcbcrConversionInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkSamplerYcbcrConversionInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code conversion} field. */
        public VkSamplerYcbcrConversionInfoKHR.Buffer conversion(@NativeType("VkSamplerYcbcrConversionKHR") long value) { VkSamplerYcbcrConversionInfoKHR.nconversion(address(), value); return this; }

    }

}