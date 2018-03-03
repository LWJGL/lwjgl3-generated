/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Statistics returned by function {@link Vma#vmaDefragment Defragment}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code bytesMoved} &ndash; total number of bytes that have been copied while moving allocations to different places</li>
 * <li>{@code bytesFreed} &ndash; total number of bytes that have been released to the system by freeing empty {@code VkDeviceMemory} objects</li>
 * <li>{@code allocationsMoved} &ndash; tumber of allocations that have been moved to different places</li>
 * <li>{@code deviceMemoryBlocksFreed} &ndash; number of empty {@code VkDeviceMemory} objects that have been released to the system</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VmaDefragmentationStats {
 *     VkDeviceSize bytesMoved;
 *     VkDeviceSize bytesFreed;
 *     uint32_t allocationsMoved;
 *     uint32_t deviceMemoryBlocksFreed;
 * }</pre></code>
 */
public class VmaDefragmentationStats extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BYTESMOVED,
        BYTESFREED,
        ALLOCATIONSMOVED,
        DEVICEMEMORYBLOCKSFREED;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BYTESMOVED = layout.offsetof(0);
        BYTESFREED = layout.offsetof(1);
        ALLOCATIONSMOVED = layout.offsetof(2);
        DEVICEMEMORYBLOCKSFREED = layout.offsetof(3);
    }

    VmaDefragmentationStats(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VmaDefragmentationStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaDefragmentationStats(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code bytesMoved} field. */
    @NativeType("VkDeviceSize")
    public long bytesMoved() { return nbytesMoved(address()); }
    /** Returns the value of the {@code bytesFreed} field. */
    @NativeType("VkDeviceSize")
    public long bytesFreed() { return nbytesFreed(address()); }
    /** Returns the value of the {@code allocationsMoved} field. */
    @NativeType("uint32_t")
    public int allocationsMoved() { return nallocationsMoved(address()); }
    /** Returns the value of the {@code deviceMemoryBlocksFreed} field. */
    @NativeType("uint32_t")
    public int deviceMemoryBlocksFreed() { return ndeviceMemoryBlocksFreed(address()); }

    // -----------------------------------

    /** Returns a new {@link VmaDefragmentationStats} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationStats malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VmaDefragmentationStats} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationStats calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VmaDefragmentationStats} instance allocated with {@link BufferUtils}. */
    public static VmaDefragmentationStats create() {
        return new VmaDefragmentationStats(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VmaDefragmentationStats} instance for the specified memory address. */
    public static VmaDefragmentationStats create(long address) {
        return new VmaDefragmentationStats(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationStats createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VmaDefragmentationStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationStats.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VmaDefragmentationStats} instance allocated on the thread-local {@link MemoryStack}. */
    public static VmaDefragmentationStats mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VmaDefragmentationStats} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VmaDefragmentationStats callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VmaDefragmentationStats} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationStats mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VmaDefragmentationStats} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationStats callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bytesMoved}. */
    public static long nbytesMoved(long struct) { return memGetLong(struct + VmaDefragmentationStats.BYTESMOVED); }
    /** Unsafe version of {@link #bytesFreed}. */
    public static long nbytesFreed(long struct) { return memGetLong(struct + VmaDefragmentationStats.BYTESFREED); }
    /** Unsafe version of {@link #allocationsMoved}. */
    public static int nallocationsMoved(long struct) { return memGetInt(struct + VmaDefragmentationStats.ALLOCATIONSMOVED); }
    /** Unsafe version of {@link #deviceMemoryBlocksFreed}. */
    public static int ndeviceMemoryBlocksFreed(long struct) { return memGetInt(struct + VmaDefragmentationStats.DEVICEMEMORYBLOCKSFREED); }

    // -----------------------------------

    /** An array of {@link VmaDefragmentationStats} structs. */
    public static class Buffer extends StructBuffer<VmaDefragmentationStats, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VmaDefragmentationStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaDefragmentationStats#SIZEOF}, and its mark will be undefined.
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
        protected VmaDefragmentationStats newInstance(long address) {
            return new VmaDefragmentationStats(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code bytesMoved} field. */
        @NativeType("VkDeviceSize")
        public long bytesMoved() { return VmaDefragmentationStats.nbytesMoved(address()); }
        /** Returns the value of the {@code bytesFreed} field. */
        @NativeType("VkDeviceSize")
        public long bytesFreed() { return VmaDefragmentationStats.nbytesFreed(address()); }
        /** Returns the value of the {@code allocationsMoved} field. */
        @NativeType("uint32_t")
        public int allocationsMoved() { return VmaDefragmentationStats.nallocationsMoved(address()); }
        /** Returns the value of the {@code deviceMemoryBlocksFreed} field. */
        @NativeType("uint32_t")
        public int deviceMemoryBlocksFreed() { return VmaDefragmentationStats.ndeviceMemoryBlocksFreed(address()); }

    }

}