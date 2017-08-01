/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code requested} &ndash; Amount of memory currently requested in allocations (only if {@code ENABLE_STATISTICS=1})</li>
 * <li>{@code allocated} &ndash; Amount of memory actually allocated in memory blocks (only if {@code ENABLE_STATISTICS=1})</li>
 * <li>{@code active} &ndash; Current number of bytes available for allocation from active spans</li>
 * <li>{@code sizecache} &ndash; Current number of bytes available in thread size class caches</li>
 * <li>{@code spancache} &ndash; Current number of bytes available in thread span caches</li>
 * <li>{@code deferred} &ndash; Current number of bytes in pending deferred deallocations</li>
 * <li>{@code thread_to_global} &ndash; Total number of bytes transitioned from thread cache to global cache</li>
 * <li>{@code global_to_thread} &ndash; Total number of bytes transitioned from global cache to thread cache</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct rpmalloc_thread_statistics_t {
 *     size_t requested;
 *     size_t allocated;
 *     size_t active;
 *     size_t sizecache;
 *     size_t spancache;
 *     size_t deferred;
 *     size_t thread_to_global;
 *     size_t global_to_thread;
 * }</pre></code>
 */
@NativeType("struct rpmalloc_thread_statistics_t")
public class RPmallocThreadStatistics extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        REQUESTED,
        ALLOCATED,
        ACTIVE,
        SIZECACHE,
        SPANCACHE,
        DEFERRED,
        THREAD_TO_GLOBAL,
        GLOBAL_TO_THREAD;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        REQUESTED = layout.offsetof(0);
        ALLOCATED = layout.offsetof(1);
        ACTIVE = layout.offsetof(2);
        SIZECACHE = layout.offsetof(3);
        SPANCACHE = layout.offsetof(4);
        DEFERRED = layout.offsetof(5);
        THREAD_TO_GLOBAL = layout.offsetof(6);
        GLOBAL_TO_THREAD = layout.offsetof(7);
    }

    RPmallocThreadStatistics(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link RPmallocThreadStatistics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RPmallocThreadStatistics(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code requested} field. */
    @NativeType("size_t")
    public long requested() { return nrequested(address()); }
    /** Returns the value of the {@code allocated} field. */
    @NativeType("size_t")
    public long allocated() { return nallocated(address()); }
    /** Returns the value of the {@code active} field. */
    @NativeType("size_t")
    public long active() { return nactive(address()); }
    /** Returns the value of the {@code sizecache} field. */
    @NativeType("size_t")
    public long sizecache() { return nsizecache(address()); }
    /** Returns the value of the {@code spancache} field. */
    @NativeType("size_t")
    public long spancache() { return nspancache(address()); }
    /** Returns the value of the {@code deferred} field. */
    @NativeType("size_t")
    public long deferred() { return ndeferred(address()); }
    /** Returns the value of the {@code thread_to_global} field. */
    @NativeType("size_t")
    public long thread_to_global() { return nthread_to_global(address()); }
    /** Returns the value of the {@code global_to_thread} field. */
    @NativeType("size_t")
    public long global_to_thread() { return nglobal_to_thread(address()); }

    // -----------------------------------

    /** Returns a new {@link RPmallocThreadStatistics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RPmallocThreadStatistics malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link RPmallocThreadStatistics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RPmallocThreadStatistics calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link RPmallocThreadStatistics} instance allocated with {@link BufferUtils}. */
    public static RPmallocThreadStatistics create() {
        return new RPmallocThreadStatistics(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link RPmallocThreadStatistics} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static RPmallocThreadStatistics create(long address) {
        return address == NULL ? null : new RPmallocThreadStatistics(address, null);
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link RPmallocThreadStatistics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link RPmallocThreadStatistics} instance allocated on the thread-local {@link MemoryStack}. */
    public static RPmallocThreadStatistics mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link RPmallocThreadStatistics} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static RPmallocThreadStatistics callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RPmallocThreadStatistics mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RPmallocThreadStatistics callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #requested}. */
    public static long nrequested(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.REQUESTED); }
    /** Unsafe version of {@link #allocated}. */
    public static long nallocated(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.ALLOCATED); }
    /** Unsafe version of {@link #active}. */
    public static long nactive(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.ACTIVE); }
    /** Unsafe version of {@link #sizecache}. */
    public static long nsizecache(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.SIZECACHE); }
    /** Unsafe version of {@link #spancache}. */
    public static long nspancache(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.SPANCACHE); }
    /** Unsafe version of {@link #deferred}. */
    public static long ndeferred(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.DEFERRED); }
    /** Unsafe version of {@link #thread_to_global}. */
    public static long nthread_to_global(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.THREAD_TO_GLOBAL); }
    /** Unsafe version of {@link #global_to_thread}. */
    public static long nglobal_to_thread(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.GLOBAL_TO_THREAD); }

    // -----------------------------------

    /** An array of {@link RPmallocThreadStatistics} structs. */
    public static class Buffer extends StructBuffer<RPmallocThreadStatistics, Buffer> implements NativeResource {

        /**
         * Creates a new {@link RPmallocThreadStatistics.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RPmallocThreadStatistics#SIZEOF}, and its mark will be undefined.
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
        protected RPmallocThreadStatistics newInstance(long address) {
            return new RPmallocThreadStatistics(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code requested} field. */
        @NativeType("size_t")
        public long requested() { return RPmallocThreadStatistics.nrequested(address()); }
        /** Returns the value of the {@code allocated} field. */
        @NativeType("size_t")
        public long allocated() { return RPmallocThreadStatistics.nallocated(address()); }
        /** Returns the value of the {@code active} field. */
        @NativeType("size_t")
        public long active() { return RPmallocThreadStatistics.nactive(address()); }
        /** Returns the value of the {@code sizecache} field. */
        @NativeType("size_t")
        public long sizecache() { return RPmallocThreadStatistics.nsizecache(address()); }
        /** Returns the value of the {@code spancache} field. */
        @NativeType("size_t")
        public long spancache() { return RPmallocThreadStatistics.nspancache(address()); }
        /** Returns the value of the {@code deferred} field. */
        @NativeType("size_t")
        public long deferred() { return RPmallocThreadStatistics.ndeferred(address()); }
        /** Returns the value of the {@code thread_to_global} field. */
        @NativeType("size_t")
        public long thread_to_global() { return RPmallocThreadStatistics.nthread_to_global(address()); }
        /** Returns the value of the {@code global_to_thread} field. */
        @NativeType("size_t")
        public long global_to_thread() { return RPmallocThreadStatistics.nglobal_to_thread(address()); }

    }

}