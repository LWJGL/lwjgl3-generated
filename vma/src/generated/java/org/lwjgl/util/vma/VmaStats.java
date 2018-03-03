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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * General statistics from current state of Allocator.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VmaStats {
 *     {@link VmaStatInfo VmaStatInfo} memoryType[32];
 *     {@link VmaStatInfo VmaStatInfo} memoryHeap[16];
 *     {@link VmaStatInfo VmaStatInfo} total;
 * }</pre></code>
 */
public class VmaStats extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEMORYTYPE,
        MEMORYHEAP,
        TOTAL;

    static {
        Layout layout = __struct(
            __array(VmaStatInfo.SIZEOF, VmaStatInfo.ALIGNOF, 32),
            __array(VmaStatInfo.SIZEOF, VmaStatInfo.ALIGNOF, 16),
            __member(VmaStatInfo.SIZEOF, VmaStatInfo.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORYTYPE = layout.offsetof(0);
        MEMORYHEAP = layout.offsetof(1);
        TOTAL = layout.offsetof(2);
    }

    VmaStats(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VmaStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaStats(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VmaStatInfo}.Buffer view of the {@code memoryType} field. */
    @NativeType("VmaStatInfo[32]")
    public VmaStatInfo.Buffer memoryType() { return nmemoryType(address()); }
    /** Returns a {@link VmaStatInfo} view of the struct at the specified index of the {@code memoryType} field. */
    public VmaStatInfo memoryType(int index) { return nmemoryType(address(), index); }
    /** Returns a {@link VmaStatInfo}.Buffer view of the {@code memoryHeap} field. */
    @NativeType("VmaStatInfo[16]")
    public VmaStatInfo.Buffer memoryHeap() { return nmemoryHeap(address()); }
    /** Returns a {@link VmaStatInfo} view of the struct at the specified index of the {@code memoryHeap} field. */
    public VmaStatInfo memoryHeap(int index) { return nmemoryHeap(address(), index); }
    /** Returns a {@link VmaStatInfo} view of the {@code total} field. */
    public VmaStatInfo total() { return ntotal(address()); }

    // -----------------------------------

    /** Returns a new {@link VmaStats} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaStats malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VmaStats} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaStats calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VmaStats} instance allocated with {@link BufferUtils}. */
    public static VmaStats create() {
        return new VmaStats(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VmaStats} instance for the specified memory address. */
    public static VmaStats create(long address) {
        return new VmaStats(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaStats createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VmaStats.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaStats.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaStats.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaStats.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaStats.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaStats.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VmaStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaStats.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaStats.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VmaStats} instance allocated on the thread-local {@link MemoryStack}. */
    public static VmaStats mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VmaStats} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VmaStats callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VmaStats} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaStats mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VmaStats} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaStats callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaStats.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaStats.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaStats.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VmaStats.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaStats.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaStats.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaStats.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaStats.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #memoryType}. */
    public static VmaStatInfo.Buffer nmemoryType(long struct) { return VmaStatInfo.create(struct + VmaStats.MEMORYTYPE, 32); }
    /** Unsafe version of {@link #memoryType(int) memoryType}. */
    public static VmaStatInfo nmemoryType(long struct, int index) {
        return VmaStatInfo.create(struct + VmaStats.MEMORYTYPE + check(index, 32) * VmaStatInfo.SIZEOF);
    }
    /** Unsafe version of {@link #memoryHeap}. */
    public static VmaStatInfo.Buffer nmemoryHeap(long struct) { return VmaStatInfo.create(struct + VmaStats.MEMORYHEAP, 16); }
    /** Unsafe version of {@link #memoryHeap(int) memoryHeap}. */
    public static VmaStatInfo nmemoryHeap(long struct, int index) {
        return VmaStatInfo.create(struct + VmaStats.MEMORYHEAP + check(index, 16) * VmaStatInfo.SIZEOF);
    }
    /** Unsafe version of {@link #total}. */
    public static VmaStatInfo ntotal(long struct) { return VmaStatInfo.create(struct + VmaStats.TOTAL); }

    // -----------------------------------

    /** An array of {@link VmaStats} structs. */
    public static class Buffer extends StructBuffer<VmaStats, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VmaStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaStats#SIZEOF}, and its mark will be undefined.
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
        protected VmaStats newInstance(long address) {
            return new VmaStats(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link VmaStatInfo}.Buffer view of the {@code memoryType} field. */
        @NativeType("VmaStatInfo[32]")
        public VmaStatInfo.Buffer memoryType() { return VmaStats.nmemoryType(address()); }
        /** Returns a {@link VmaStatInfo} view of the struct at the specified index of the {@code memoryType} field. */
        public VmaStatInfo memoryType(int index) { return VmaStats.nmemoryType(address(), index); }
        /** Returns a {@link VmaStatInfo}.Buffer view of the {@code memoryHeap} field. */
        @NativeType("VmaStatInfo[16]")
        public VmaStatInfo.Buffer memoryHeap() { return VmaStats.nmemoryHeap(address()); }
        /** Returns a {@link VmaStatInfo} view of the struct at the specified index of the {@code memoryHeap} field. */
        public VmaStatInfo memoryHeap(int index) { return VmaStats.nmemoryHeap(address(), index); }
        /** Returns a {@link VmaStatInfo} view of the {@code total} field. */
        public VmaStatInfo total() { return VmaStats.ntotal(address()); }

    }

}