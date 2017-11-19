/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.odbc;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct DBMONEY {
 *     LONG mnyhigh;
 *     ULONG mnylow;
 * }</pre></code>
 */
public class DBMONEY extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNYHIGH,
        MNYLOW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNYHIGH = layout.offsetof(0);
        MNYLOW = layout.offsetof(1);
    }

    DBMONEY(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link DBMONEY} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DBMONEY(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code mnyhigh} field. */
    @NativeType("LONG")
    public int mnyhigh() { return nmnyhigh(address()); }
    /** Returns the value of the {@code mnylow} field. */
    @NativeType("ULONG")
    public int mnylow() { return nmnylow(address()); }

    /** Sets the specified value to the {@code mnyhigh} field. */
    public DBMONEY mnyhigh(@NativeType("LONG") int value) { nmnyhigh(address(), value); return this; }
    /** Sets the specified value to the {@code mnylow} field. */
    public DBMONEY mnylow(@NativeType("ULONG") int value) { nmnylow(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public DBMONEY set(
        int mnyhigh,
        int mnylow
    ) {
        mnyhigh(mnyhigh);
        mnylow(mnylow);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public DBMONEY set(DBMONEY src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link DBMONEY} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DBMONEY malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link DBMONEY} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DBMONEY calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link DBMONEY} instance allocated with {@link BufferUtils}. */
    public static DBMONEY create() {
        return new DBMONEY(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link DBMONEY} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static DBMONEY create(long address) {
        return address == NULL ? null : new DBMONEY(address, null);
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link DBMONEY.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link DBMONEY} instance allocated on the thread-local {@link MemoryStack}. */
    public static DBMONEY mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link DBMONEY} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static DBMONEY callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link DBMONEY} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DBMONEY mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link DBMONEY} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DBMONEY callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mnyhigh}. */
    public static int nmnyhigh(long struct) { return memGetInt(struct + DBMONEY.MNYHIGH); }
    /** Unsafe version of {@link #mnylow}. */
    public static int nmnylow(long struct) { return memGetInt(struct + DBMONEY.MNYLOW); }

    /** Unsafe version of {@link #mnyhigh(int) mnyhigh}. */
    public static void nmnyhigh(long struct, int value) { memPutInt(struct + DBMONEY.MNYHIGH, value); }
    /** Unsafe version of {@link #mnylow(int) mnylow}. */
    public static void nmnylow(long struct, int value) { memPutInt(struct + DBMONEY.MNYLOW, value); }

    // -----------------------------------

    /** An array of {@link DBMONEY} structs. */
    public static class Buffer extends StructBuffer<DBMONEY, Buffer> implements NativeResource {

        /**
         * Creates a new {@link DBMONEY.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DBMONEY#SIZEOF}, and its mark will be undefined.
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
        protected DBMONEY newInstance(long address) {
            return new DBMONEY(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code mnyhigh} field. */
        @NativeType("LONG")
        public int mnyhigh() { return DBMONEY.nmnyhigh(address()); }
        /** Returns the value of the {@code mnylow} field. */
        @NativeType("ULONG")
        public int mnylow() { return DBMONEY.nmnylow(address()); }

        /** Sets the specified value to the {@code mnyhigh} field. */
        public DBMONEY.Buffer mnyhigh(@NativeType("LONG") int value) { DBMONEY.nmnyhigh(address(), value); return this; }
        /** Sets the specified value to the {@code mnylow} field. */
        public DBMONEY.Buffer mnylow(@NativeType("ULONG") int value) { DBMONEY.nmnylow(address(), value); return this; }

    }

}