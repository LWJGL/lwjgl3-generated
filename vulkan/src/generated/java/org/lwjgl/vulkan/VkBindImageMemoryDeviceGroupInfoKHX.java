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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying device within a group to bind to.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link VkBindImageMemoryDeviceGroupInfoKHX} structure is defined as:</p>
 * 
 * <ul>
 * <li>{@code sType} is the type of this structure.</li>
 * <li>{@code pNext} is {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code deviceIndexCount} is the number of elements in {@code pDeviceIndices}.</li>
 * <li>{@code pDeviceIndices} is a pointer to an array of device indices.</li>
 * <li>{@code SFRRectCount} is the number of elements in {@code pSFRRects}.</li>
 * <li>{@code pSFRRects} is a pointer to an array of rectangles describing which regions of the image are attached to each instance of memory.</li>
 * </ul>
 * 
 * <p>If {@code deviceIndexCount} is greater than zero, then on device index <code>i</code> {@code image} is attached to the instance of the memory on the physical device with device index <code>pDeviceIndices[i]</code>.</p>
 * 
 * <p>Let <code>N</code> be the number of physical devices in the logical device. If {@code SFRRectCount} is greater than zero, then {@code pSFRRects} is an array of <code>N<sup>2</sup></code> rectangles, where the image region specified by the rectangle at element <code>i*N+j</code> in resource instance <code>i</code> is bound to the memory instance <code>j</code>. The blocks of the memory that are bound to each sparse image block region use an offset in memory, relative to {@code memoryOffset}, computed as if the whole image were being bound to a contiguous range of memory. In other words, horizontally adjacent image blocks use consecutive blocks of memory, vertically adjacent image blocks are separated by the number of bytes per block multiplied by the width in blocks of {@code image}, and the block at <code>(0,0)</code> corresponds to memory starting at {@code memoryOffset}.</p>
 * 
 * <p>If {@code SFRRectCount} and {@code deviceIndexCount} are zero and the memory comes from a memory heap with the {@link KHXDeviceGroupCreation#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX} bit set, then it is as if {@code pDeviceIndices} contains consecutive indices from zero to the number of physical devices in the logical device, minus one. In other words, by default each physical device attaches to its own instance of the memory.</p>
 * 
 * <p>If {@code SFRRectCount} and {@code deviceIndexCount} are zero and the memory comes from a memory heap without the {@link KHXDeviceGroupCreation#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX} bit set, then it is as if {@code pDeviceIndices} contains an array of zeros. In other words, by default each physical device attaches to instance zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>At least one of {@code deviceIndexCount} and {@code SFRRectCount} <b>must</b> be zero.</li>
 * <li>{@code deviceIndexCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device</li>
 * <li>All elements of {@code pDeviceIndices} <b>must</b> be valid device indices.</li>
 * <li>{@code SFRRectCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device squared</li>
 * <li>Elements of {@code pSFRRects} that correspond to the same instance of an image <b>must</b> not overlap.</li>
 * <li>The {@code offset.x} member of any element of {@code pSFRRects} <b>must</b> be a multiple of the sparse image block width ({@link VkSparseImageFormatProperties}{@code ::imageGranularity}.width) of all non-metadata aspects of the image</li>
 * <li>The {@code offset.y} member of any element of {@code pSFRRects} <b>must</b> be a multiple of the sparse image block height ({@link VkSparseImageFormatProperties}{@code ::imageGranularity}.height) of all non-metadata aspects of the image</li>
 * <li>The {@code extent.width} member of any element of {@code pSFRRects} <b>must</b> either be a multiple of the sparse image block width of all non-metadata aspects of the image, or else {@code extent.width} + {@code offset.x} <b>must</b> equal the width of the image subresource</li>
 * <li>The {@code extent.height} member of any element of {@code pSFRRects} <b>must</b> either be a multiple of the sparse image block height of all non-metadata aspects of the image, or else {@code extent.height} {@code offset.y} <b>must</b> equal the width of the image subresource</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHX STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code deviceIndexCount} is not 0, {@code pDeviceIndices} <b>must</b> be a valid pointer to an array of {@code deviceIndexCount} {@code uint32_t} values</li>
 * <li>If {@code SFRRectCount} is not 0, {@code pSFRRects} <b>must</b> be a valid pointer to an array of {@code SFRRectCount} {@link VkRect2D} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkBindImageMemoryDeviceGroupInfoKHX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t deviceIndexCount;
 *     uint32_t const * pDeviceIndices;
 *     uint32_t SFRRectCount;
 *     {@link VkRect2D VkRect2D const} * pSFRRects;
 * }</pre></code>
 */
public class VkBindImageMemoryDeviceGroupInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEINDEXCOUNT,
        PDEVICEINDICES,
        SFRRECTCOUNT,
        PSFRRECTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEINDEXCOUNT = layout.offsetof(2);
        PDEVICEINDICES = layout.offsetof(3);
        SFRRECTCOUNT = layout.offsetof(4);
        PSFRRECTS = layout.offsetof(5);
    }

    VkBindImageMemoryDeviceGroupInfoKHX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkBindImageMemoryDeviceGroupInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindImageMemoryDeviceGroupInfoKHX(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code deviceIndexCount} field. */
    @NativeType("uint32_t")
    public int deviceIndexCount() { return ndeviceIndexCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pDeviceIndices() { return npDeviceIndices(address()); }
    /** Returns the value of the {@code SFRRectCount} field. */
    @NativeType("uint32_t")
    public int SFRRectCount() { return nSFRRectCount(address()); }
    /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pSFRRects} field. */
    @Nullable
    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pSFRRects() { return npSFRRects(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindImageMemoryDeviceGroupInfoKHX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindImageMemoryDeviceGroupInfoKHX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    public VkBindImageMemoryDeviceGroupInfoKHX pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceIndices(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pSFRRects} field. */
    public VkBindImageMemoryDeviceGroupInfoKHX pSFRRects(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { npSFRRects(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindImageMemoryDeviceGroupInfoKHX set(
        int sType,
        long pNext,
        @Nullable IntBuffer pDeviceIndices,
        @Nullable VkRect2D.Buffer pSFRRects
    ) {
        sType(sType);
        pNext(pNext);
        pDeviceIndices(pDeviceIndices);
        pSFRRects(pSFRRects);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindImageMemoryDeviceGroupInfoKHX set(VkBindImageMemoryDeviceGroupInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryDeviceGroupInfoKHX malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryDeviceGroupInfoKHX calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkBindImageMemoryDeviceGroupInfoKHX create() {
        return new VkBindImageMemoryDeviceGroupInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX} instance for the specified memory address. */
    public static VkBindImageMemoryDeviceGroupInfoKHX create(long address) {
        return new VkBindImageMemoryDeviceGroupInfoKHX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryDeviceGroupInfoKHX createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHX.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHX.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHX.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkBindImageMemoryDeviceGroupInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryDeviceGroupInfoKHX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindImageMemoryDeviceGroupInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindImageMemoryDeviceGroupInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryDeviceGroupInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryDeviceGroupInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHX.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindImageMemoryDeviceGroupInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindImageMemoryDeviceGroupInfoKHX.PNEXT); }
    /** Unsafe version of {@link #deviceIndexCount}. */
    public static int ndeviceIndexCount(long struct) { return memGetInt(struct + VkBindImageMemoryDeviceGroupInfoKHX.DEVICEINDEXCOUNT); }
    /** Unsafe version of {@link #pDeviceIndices() pDeviceIndices}. */
    @Nullable public static IntBuffer npDeviceIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkBindImageMemoryDeviceGroupInfoKHX.PDEVICEINDICES), ndeviceIndexCount(struct)); }
    /** Unsafe version of {@link #SFRRectCount}. */
    public static int nSFRRectCount(long struct) { return memGetInt(struct + VkBindImageMemoryDeviceGroupInfoKHX.SFRRECTCOUNT); }
    /** Unsafe version of {@link #pSFRRects}. */
    @Nullable public static VkRect2D.Buffer npSFRRects(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkBindImageMemoryDeviceGroupInfoKHX.PSFRRECTS), nSFRRectCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindImageMemoryDeviceGroupInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindImageMemoryDeviceGroupInfoKHX.PNEXT, value); }
    /** Sets the specified value to the {@code deviceIndexCount} field of the specified {@code struct}. */
    public static void ndeviceIndexCount(long struct, int value) { memPutInt(struct + VkBindImageMemoryDeviceGroupInfoKHX.DEVICEINDEXCOUNT, value); }
    /** Unsafe version of {@link #pDeviceIndices(IntBuffer) pDeviceIndices}. */
    public static void npDeviceIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkBindImageMemoryDeviceGroupInfoKHX.PDEVICEINDICES, memAddressSafe(value)); ndeviceIndexCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code SFRRectCount} field of the specified {@code struct}. */
    public static void nSFRRectCount(long struct, int value) { memPutInt(struct + VkBindImageMemoryDeviceGroupInfoKHX.SFRRECTCOUNT, value); }
    /** Unsafe version of {@link #pSFRRects(VkRect2D.Buffer) pSFRRects}. */
    public static void npSFRRects(long struct, @Nullable VkRect2D.Buffer value) { memPutAddress(struct + VkBindImageMemoryDeviceGroupInfoKHX.PSFRRECTS, memAddressSafe(value)); nSFRRectCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndeviceIndexCount(struct) != 0) {
            check(memGetAddress(struct + VkBindImageMemoryDeviceGroupInfoKHX.PDEVICEINDICES));
        }
        if (nSFRRectCount(struct) != 0) {
            check(memGetAddress(struct + VkBindImageMemoryDeviceGroupInfoKHX.PSFRRECTS));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkBindImageMemoryDeviceGroupInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkBindImageMemoryDeviceGroupInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkBindImageMemoryDeviceGroupInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindImageMemoryDeviceGroupInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkBindImageMemoryDeviceGroupInfoKHX newInstance(long address) {
            return new VkBindImageMemoryDeviceGroupInfoKHX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindImageMemoryDeviceGroupInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindImageMemoryDeviceGroupInfoKHX.npNext(address()); }
        /** Returns the value of the {@code deviceIndexCount} field. */
        @NativeType("uint32_t")
        public int deviceIndexCount() { return VkBindImageMemoryDeviceGroupInfoKHX.ndeviceIndexCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pDeviceIndices() { return VkBindImageMemoryDeviceGroupInfoKHX.npDeviceIndices(address()); }
        /** Returns the value of the {@code SFRRectCount} field. */
        @NativeType("uint32_t")
        public int SFRRectCount() { return VkBindImageMemoryDeviceGroupInfoKHX.nSFRRectCount(address()); }
        /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pSFRRects} field. */
        @Nullable
        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pSFRRects() { return VkBindImageMemoryDeviceGroupInfoKHX.npSFRRects(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindImageMemoryDeviceGroupInfoKHX.Buffer sType(@NativeType("VkStructureType") int value) { VkBindImageMemoryDeviceGroupInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindImageMemoryDeviceGroupInfoKHX.Buffer pNext(@NativeType("void const *") long value) { VkBindImageMemoryDeviceGroupInfoKHX.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        public VkBindImageMemoryDeviceGroupInfoKHX.Buffer pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindImageMemoryDeviceGroupInfoKHX.npDeviceIndices(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pSFRRects} field. */
        public VkBindImageMemoryDeviceGroupInfoKHX.Buffer pSFRRects(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { VkBindImageMemoryDeviceGroupInfoKHX.npSFRRects(address(), value); return this; }

    }

}