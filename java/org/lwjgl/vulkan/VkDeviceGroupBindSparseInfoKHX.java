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
 * Structure indicating which instances are bound.
 * 
 * <h5>Description</h5>
 * 
 * <p>These device indices apply to all buffer and image memory binds included in the batch that points to this structure. The semaphore waits and signals for the batch are executed only by the physical device specified by the {@code resourceDeviceIndex}.</p>
 * 
 * <p>If this structure is not present, {@code resourceDeviceIndex} and {@code memoryDeviceIndex} are assumed to be zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code resourceDeviceIndex} and {@code memoryDeviceIndex} <b>must</b> both be valid device indices.</li>
 * <li>Each memory allocation bound in this batch <b>must</b> have allocated an instance for {@code memoryDeviceIndex}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHX}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code resourceDeviceIndex} &ndash; a device index indicating which instance of the resource is bound.</li>
 * <li>{@code memoryDeviceIndex} &ndash; a device index indicating which instance of the memory the resource instance is bound to.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDeviceGroupBindSparseInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t resourceDeviceIndex;
 *     uint32_t memoryDeviceIndex;
 * }</pre></code>
 */
public class VkDeviceGroupBindSparseInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RESOURCEDEVICEINDEX,
        MEMORYDEVICEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RESOURCEDEVICEINDEX = layout.offsetof(2);
        MEMORYDEVICEINDEX = layout.offsetof(3);
    }

    VkDeviceGroupBindSparseInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDeviceGroupBindSparseInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupBindSparseInfoKHX(ByteBuffer container) {
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
    /** Returns the value of the {@code resourceDeviceIndex} field. */
    @NativeType("uint32_t")
    public int resourceDeviceIndex() { return nresourceDeviceIndex(address()); }
    /** Returns the value of the {@code memoryDeviceIndex} field. */
    @NativeType("uint32_t")
    public int memoryDeviceIndex() { return nmemoryDeviceIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGroupBindSparseInfoKHX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGroupBindSparseInfoKHX pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code resourceDeviceIndex} field. */
    public VkDeviceGroupBindSparseInfoKHX resourceDeviceIndex(@NativeType("uint32_t") int value) { nresourceDeviceIndex(address(), value); return this; }
    /** Sets the specified value to the {@code memoryDeviceIndex} field. */
    public VkDeviceGroupBindSparseInfoKHX memoryDeviceIndex(@NativeType("uint32_t") int value) { nmemoryDeviceIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupBindSparseInfoKHX set(
        int sType,
        long pNext,
        int resourceDeviceIndex,
        int memoryDeviceIndex
    ) {
        sType(sType);
        pNext(pNext);
        resourceDeviceIndex(resourceDeviceIndex);
        memoryDeviceIndex(memoryDeviceIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupBindSparseInfoKHX set(VkDeviceGroupBindSparseInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupBindSparseInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupBindSparseInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupBindSparseInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupBindSparseInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupBindSparseInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupBindSparseInfoKHX create() {
        return new VkDeviceGroupBindSparseInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupBindSparseInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkDeviceGroupBindSparseInfoKHX create(long address) {
        return address == NULL ? null : new VkDeviceGroupBindSparseInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDeviceGroupBindSparseInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupBindSparseInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceGroupBindSparseInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDeviceGroupBindSparseInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceGroupBindSparseInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupBindSparseInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupBindSparseInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupBindSparseInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupBindSparseInfoKHX.PNEXT); }
    /** Unsafe version of {@link #resourceDeviceIndex}. */
    public static int nresourceDeviceIndex(long struct) { return memGetInt(struct + VkDeviceGroupBindSparseInfoKHX.RESOURCEDEVICEINDEX); }
    /** Unsafe version of {@link #memoryDeviceIndex}. */
    public static int nmemoryDeviceIndex(long struct) { return memGetInt(struct + VkDeviceGroupBindSparseInfoKHX.MEMORYDEVICEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGroupBindSparseInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupBindSparseInfoKHX.PNEXT, value); }
    /** Unsafe version of {@link #resourceDeviceIndex(int) resourceDeviceIndex}. */
    public static void nresourceDeviceIndex(long struct, int value) { memPutInt(struct + VkDeviceGroupBindSparseInfoKHX.RESOURCEDEVICEINDEX, value); }
    /** Unsafe version of {@link #memoryDeviceIndex(int) memoryDeviceIndex}. */
    public static void nmemoryDeviceIndex(long struct, int value) { memPutInt(struct + VkDeviceGroupBindSparseInfoKHX.MEMORYDEVICEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupBindSparseInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupBindSparseInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDeviceGroupBindSparseInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupBindSparseInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupBindSparseInfoKHX newInstance(long address) {
            return new VkDeviceGroupBindSparseInfoKHX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupBindSparseInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkDeviceGroupBindSparseInfoKHX.npNext(address()); }
        /** Returns the value of the {@code resourceDeviceIndex} field. */
        @NativeType("uint32_t")
        public int resourceDeviceIndex() { return VkDeviceGroupBindSparseInfoKHX.nresourceDeviceIndex(address()); }
        /** Returns the value of the {@code memoryDeviceIndex} field. */
        @NativeType("uint32_t")
        public int memoryDeviceIndex() { return VkDeviceGroupBindSparseInfoKHX.nmemoryDeviceIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGroupBindSparseInfoKHX.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupBindSparseInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGroupBindSparseInfoKHX.Buffer pNext(@NativeType("const void *") long value) { VkDeviceGroupBindSparseInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code resourceDeviceIndex} field. */
        public VkDeviceGroupBindSparseInfoKHX.Buffer resourceDeviceIndex(@NativeType("uint32_t") int value) { VkDeviceGroupBindSparseInfoKHX.nresourceDeviceIndex(address(), value); return this; }
        /** Sets the specified value to the {@code memoryDeviceIndex} field. */
        public VkDeviceGroupBindSparseInfoKHX.Buffer memoryDeviceIndex(@NativeType("uint32_t") int value) { VkDeviceGroupBindSparseInfoKHX.nmemoryDeviceIndex(address(), value); return this; }

    }

}