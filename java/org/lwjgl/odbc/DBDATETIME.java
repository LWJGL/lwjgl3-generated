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
 * struct DBDATETIME {
 *     LONG dtdays;
 *     ULONG dttime;
 * }</pre></code>
 */
public class DBDATETIME extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DTDAYS,
        DTTIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DTDAYS = layout.offsetof(0);
        DTTIME = layout.offsetof(1);
    }

    DBDATETIME(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link DBDATETIME} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DBDATETIME(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code dtdays} field. */
    @NativeType("LONG")
    public int dtdays() { return ndtdays(address()); }
    /** Returns the value of the {@code dttime} field. */
    @NativeType("ULONG")
    public int dttime() { return ndttime(address()); }

    /** Sets the specified value to the {@code dtdays} field. */
    public DBDATETIME dtdays(@NativeType("LONG") int value) { ndtdays(address(), value); return this; }
    /** Sets the specified value to the {@code dttime} field. */
    public DBDATETIME dttime(@NativeType("ULONG") int value) { ndttime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public DBDATETIME set(
        int dtdays,
        int dttime
    ) {
        dtdays(dtdays);
        dttime(dttime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public DBDATETIME set(DBDATETIME src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link DBDATETIME} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DBDATETIME malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link DBDATETIME} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DBDATETIME calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link DBDATETIME} instance allocated with {@link BufferUtils}. */
    public static DBDATETIME create() {
        return new DBDATETIME(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link DBDATETIME} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static DBDATETIME create(long address) {
        return address == NULL ? null : new DBDATETIME(address, null);
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link DBDATETIME.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link DBDATETIME} instance allocated on the thread-local {@link MemoryStack}. */
    public static DBDATETIME mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link DBDATETIME} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static DBDATETIME callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link DBDATETIME} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DBDATETIME mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link DBDATETIME} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DBDATETIME callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dtdays}. */
    public static int ndtdays(long struct) { return memGetInt(struct + DBDATETIME.DTDAYS); }
    /** Unsafe version of {@link #dttime}. */
    public static int ndttime(long struct) { return memGetInt(struct + DBDATETIME.DTTIME); }

    /** Unsafe version of {@link #dtdays(int) dtdays}. */
    public static void ndtdays(long struct, int value) { memPutInt(struct + DBDATETIME.DTDAYS, value); }
    /** Unsafe version of {@link #dttime(int) dttime}. */
    public static void ndttime(long struct, int value) { memPutInt(struct + DBDATETIME.DTTIME, value); }

    // -----------------------------------

    /** An array of {@link DBDATETIME} structs. */
    public static class Buffer extends StructBuffer<DBDATETIME, Buffer> implements NativeResource {

        /**
         * Creates a new {@link DBDATETIME.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DBDATETIME#SIZEOF}, and its mark will be undefined.
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
        protected DBDATETIME newInstance(long address) {
            return new DBDATETIME(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code dtdays} field. */
        @NativeType("LONG")
        public int dtdays() { return DBDATETIME.ndtdays(address()); }
        /** Returns the value of the {@code dttime} field. */
        @NativeType("ULONG")
        public int dttime() { return DBDATETIME.ndttime(address()); }

        /** Sets the specified value to the {@code dtdays} field. */
        public DBDATETIME.Buffer dtdays(@NativeType("LONG") int value) { DBDATETIME.ndtdays(address(), value); return this; }
        /** Sets the specified value to the {@code dttime} field. */
        public DBDATETIME.Buffer dttime(@NativeType("ULONG") int value) { DBDATETIME.ndttime(address(), value); return this; }

    }

}