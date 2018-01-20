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
 * Structure specifying sparse image format inputs.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code samples} <b>must</b> be a bit value that is set in {@link VkImageFormatProperties}{@code ::sampleCounts} returned by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} with {@code format}, {@code type}, {@code tiling}, and {@code usage} equal to those in this command and {@code flags} equal to the value that is set in {@link VkImageCreateInfo}{@code ::flags} when the image is created</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGetPhysicalDeviceProperties2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceSparseImageFormatProperties2KHR GetPhysicalDeviceSparseImageFormatProperties2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code format} &ndash; the image format.</li>
 * <li>{@code type} &ndash; the dimensionality of image.</li>
 * <li>{@code samples} &ndash; the number of samples per texel as defined in {@code VkSampleCountFlagBits}.</li>
 * <li>{@code usage} &ndash; a bitmask describing the intended usage of the image.</li>
 * <li>{@code tiling} &ndash; the tiling arrangement of the data elements in memory.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceSparseImageFormatInfo2KHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkFormat format;
 *     VkImageType type;
 *     VkSampleCountFlagBits samples;
 *     VkImageUsageFlags usage;
 *     VkImageTiling tiling;
 * }</pre></code>
 */
public class VkPhysicalDeviceSparseImageFormatInfo2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMAT,
        TYPE,
        SAMPLES,
        USAGE,
        TILING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        TYPE = layout.offsetof(3);
        SAMPLES = layout.offsetof(4);
        USAGE = layout.offsetof(5);
        TILING = layout.offsetof(6);
    }

    VkPhysicalDeviceSparseImageFormatInfo2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** Returns the value of the {@code type} field. */
    @NativeType("VkImageType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code samples} field. */
    @NativeType("VkSampleCountFlagBits")
    public int samples() { return nsamples(address()); }
    /** Returns the value of the {@code usage} field. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }
    /** Returns the value of the {@code tiling} field. */
    @NativeType("VkImageTiling")
    public int tiling() { return ntiling(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR type(@NativeType("VkImageType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code samples} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR samples(@NativeType("VkSampleCountFlagBits") int value) { nsamples(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code tiling} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR tiling(@NativeType("VkImageTiling") int value) { ntiling(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR set(
        int sType,
        long pNext,
        int format,
        int type,
        int samples,
        int usage,
        int tiling
    ) {
        sType(sType);
        pNext(pNext);
        format(format);
        type(type);
        samples(samples);
        usage(usage);
        tiling(tiling);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR set(VkPhysicalDeviceSparseImageFormatInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR create() {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} instance for the specified memory address. */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR create(long address) {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.FORMAT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.TYPE); }
    /** Unsafe version of {@link #samples}. */
    public static int nsamples(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.SAMPLES); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.USAGE); }
    /** Unsafe version of {@link #tiling}. */
    public static int ntiling(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.TILING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.PNEXT, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.FORMAT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.TYPE, value); }
    /** Unsafe version of {@link #samples(int) samples}. */
    public static void nsamples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.SAMPLES, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.USAGE, value); }
    /** Unsafe version of {@link #tiling(int) tiling}. */
    public static void ntiling(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSparseImageFormatInfo2KHR.TILING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSparseImageFormatInfo2KHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSparseImageFormatInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSparseImageFormatInfo2KHR newInstance(long address) {
            return new VkPhysicalDeviceSparseImageFormatInfo2KHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSparseImageFormatInfo2KHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkPhysicalDeviceSparseImageFormatInfo2KHR.npNext(address()); }
        /** Returns the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkPhysicalDeviceSparseImageFormatInfo2KHR.nformat(address()); }
        /** Returns the value of the {@code type} field. */
        @NativeType("VkImageType")
        public int type() { return VkPhysicalDeviceSparseImageFormatInfo2KHR.ntype(address()); }
        /** Returns the value of the {@code samples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int samples() { return VkPhysicalDeviceSparseImageFormatInfo2KHR.nsamples(address()); }
        /** Returns the value of the {@code usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkPhysicalDeviceSparseImageFormatInfo2KHR.nusage(address()); }
        /** Returns the value of the {@code tiling} field. */
        @NativeType("VkImageTiling")
        public int tiling() { return VkPhysicalDeviceSparseImageFormatInfo2KHR.ntiling(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer pNext(@NativeType("const void *") long value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer format(@NativeType("VkFormat") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer type(@NativeType("VkImageType") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code samples} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer samples(@NativeType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.nsamples(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code tiling} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer tiling(@NativeType("VkImageTiling") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.ntiling(address(), value); return this; }

    }

}