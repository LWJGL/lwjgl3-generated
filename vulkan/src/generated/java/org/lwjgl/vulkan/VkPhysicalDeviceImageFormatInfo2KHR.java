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
 * Structure specifying image creation parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>The members of {@link VkPhysicalDeviceImageFormatInfo2KHR} correspond to the arguments to {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}, with {@code sType} and {@code pNext} added for extensibility.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGetPhysicalDeviceProperties2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPhysicalDeviceExternalImageFormatInfoKHR}</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure. The {@code pNext} chain of {@link VkPhysicalDeviceImageFormatInfo2KHR} is used to provide additional image parameters to {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR}.</li>
 * <li>{@code format} &ndash; a {@code VkFormat} value indicating the image format, corresponding to {@link VkImageCreateInfo}{@code ::format}.</li>
 * <li>{@code type} &ndash; a {@code VkImageType} value indicating the image type, corresponding to {@link VkImageCreateInfo}{@code ::imageType}.</li>
 * <li>{@code tiling} &ndash; a {@code VkImageTiling} value indicating the image tiling, corresponding to {@link VkImageCreateInfo}{@code ::tiling}.</li>
 * <li>{@code usage} &ndash; a bitmask of {@code VkImageUsageFlagBits} indicating the intended usage of the image, corresponding to {@link VkImageCreateInfo}{@code ::usage}.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkImageCreateFlagBits} indicating additional parameters of the image, corresponding to {@link VkImageCreateInfo}{@code ::flags}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceImageFormatInfo2KHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkFormat format;
 *     VkImageType type;
 *     VkImageTiling tiling;
 *     VkImageUsageFlags usage;
 *     VkImageCreateFlags flags;
 * }</pre></code>
 */
public class VkPhysicalDeviceImageFormatInfo2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMAT,
        TYPE,
        TILING,
        USAGE,
        FLAGS;

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
        TILING = layout.offsetof(4);
        USAGE = layout.offsetof(5);
        FLAGS = layout.offsetof(6);
    }

    VkPhysicalDeviceImageFormatInfo2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceImageFormatInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageFormatInfo2KHR(ByteBuffer container) {
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
    /** Returns the value of the {@code tiling} field. */
    @NativeType("VkImageTiling")
    public int tiling() { return ntiling(address()); }
    /** Returns the value of the {@code usage} field. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkImageCreateFlags")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImageFormatInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageFormatInfo2KHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkPhysicalDeviceImageFormatInfo2KHR format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkPhysicalDeviceImageFormatInfo2KHR type(@NativeType("VkImageType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code tiling} field. */
    public VkPhysicalDeviceImageFormatInfo2KHR tiling(@NativeType("VkImageTiling") int value) { ntiling(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VkPhysicalDeviceImageFormatInfo2KHR usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPhysicalDeviceImageFormatInfo2KHR flags(@NativeType("VkImageCreateFlags") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageFormatInfo2KHR set(
        int sType,
        long pNext,
        int format,
        int type,
        int tiling,
        int usage,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        format(format);
        type(type);
        tiling(tiling);
        usage(usage);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageFormatInfo2KHR set(VkPhysicalDeviceImageFormatInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageFormatInfo2KHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageFormatInfo2KHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageFormatInfo2KHR create() {
        return new VkPhysicalDeviceImageFormatInfo2KHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR} instance for the specified memory address. */
    public static VkPhysicalDeviceImageFormatInfo2KHR create(long address) {
        return new VkPhysicalDeviceImageFormatInfo2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageFormatInfo2KHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceImageFormatInfo2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceImageFormatInfo2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageFormatInfo2KHR.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.FORMAT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.TYPE); }
    /** Unsafe version of {@link #tiling}. */
    public static int ntiling(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.TILING); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.USAGE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageFormatInfo2KHR.PNEXT, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.FORMAT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.TYPE, value); }
    /** Unsafe version of {@link #tiling(int) tiling}. */
    public static void ntiling(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.TILING, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.USAGE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2KHR.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageFormatInfo2KHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageFormatInfo2KHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageFormatInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceImageFormatInfo2KHR newInstance(long address) {
            return new VkPhysicalDeviceImageFormatInfo2KHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageFormatInfo2KHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkPhysicalDeviceImageFormatInfo2KHR.npNext(address()); }
        /** Returns the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkPhysicalDeviceImageFormatInfo2KHR.nformat(address()); }
        /** Returns the value of the {@code type} field. */
        @NativeType("VkImageType")
        public int type() { return VkPhysicalDeviceImageFormatInfo2KHR.ntype(address()); }
        /** Returns the value of the {@code tiling} field. */
        @NativeType("VkImageTiling")
        public int tiling() { return VkPhysicalDeviceImageFormatInfo2KHR.ntiling(address()); }
        /** Returns the value of the {@code usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkPhysicalDeviceImageFormatInfo2KHR.nusage(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkImageCreateFlags")
        public int flags() { return VkPhysicalDeviceImageFormatInfo2KHR.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageFormatInfo2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer pNext(@NativeType("const void *") long value) { VkPhysicalDeviceImageFormatInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer format(@NativeType("VkFormat") int value) { VkPhysicalDeviceImageFormatInfo2KHR.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer type(@NativeType("VkImageType") int value) { VkPhysicalDeviceImageFormatInfo2KHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code tiling} field. */
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer tiling(@NativeType("VkImageTiling") int value) { VkPhysicalDeviceImageFormatInfo2KHR.ntiling(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkPhysicalDeviceImageFormatInfo2KHR.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer flags(@NativeType("VkImageCreateFlags") int value) { VkPhysicalDeviceImageFormatInfo2KHR.nflags(address(), value); return this; }

    }

}