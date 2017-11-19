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
 * struct SQL_YEAR_MONTH_STRUCT {
 *     SQLUINTEGER year;
 *     SQLUINTEGER month;
 * }</pre></code>
 */
public class SQL_YEAR_MONTH_STRUCT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        YEAR,
        MONTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        YEAR = layout.offsetof(0);
        MONTH = layout.offsetof(1);
    }

    SQL_YEAR_MONTH_STRUCT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link SQL_YEAR_MONTH_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_YEAR_MONTH_STRUCT(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code year} field. */
    @NativeType("SQLUINTEGER")
    public int year() { return nyear(address()); }
    /** Returns the value of the {@code month} field. */
    @NativeType("SQLUINTEGER")
    public int month() { return nmonth(address()); }

    /** Sets the specified value to the {@code year} field. */
    public SQL_YEAR_MONTH_STRUCT year(@NativeType("SQLUINTEGER") int value) { nyear(address(), value); return this; }
    /** Sets the specified value to the {@code month} field. */
    public SQL_YEAR_MONTH_STRUCT month(@NativeType("SQLUINTEGER") int value) { nmonth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_YEAR_MONTH_STRUCT set(
        int year,
        int month
    ) {
        year(year);
        month(month);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQL_YEAR_MONTH_STRUCT set(SQL_YEAR_MONTH_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link SQL_YEAR_MONTH_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_YEAR_MONTH_STRUCT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link SQL_YEAR_MONTH_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_YEAR_MONTH_STRUCT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link SQL_YEAR_MONTH_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_YEAR_MONTH_STRUCT create() {
        return new SQL_YEAR_MONTH_STRUCT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link SQL_YEAR_MONTH_STRUCT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static SQL_YEAR_MONTH_STRUCT create(long address) {
        return address == NULL ? null : new SQL_YEAR_MONTH_STRUCT(address, null);
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link SQL_YEAR_MONTH_STRUCT} instance allocated on the thread-local {@link MemoryStack}. */
    public static SQL_YEAR_MONTH_STRUCT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link SQL_YEAR_MONTH_STRUCT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static SQL_YEAR_MONTH_STRUCT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_YEAR_MONTH_STRUCT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_YEAR_MONTH_STRUCT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #year}. */
    public static int nyear(long struct) { return memGetInt(struct + SQL_YEAR_MONTH_STRUCT.YEAR); }
    /** Unsafe version of {@link #month}. */
    public static int nmonth(long struct) { return memGetInt(struct + SQL_YEAR_MONTH_STRUCT.MONTH); }

    /** Unsafe version of {@link #year(int) year}. */
    public static void nyear(long struct, int value) { memPutInt(struct + SQL_YEAR_MONTH_STRUCT.YEAR, value); }
    /** Unsafe version of {@link #month(int) month}. */
    public static void nmonth(long struct, int value) { memPutInt(struct + SQL_YEAR_MONTH_STRUCT.MONTH, value); }

    // -----------------------------------

    /** An array of {@link SQL_YEAR_MONTH_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_YEAR_MONTH_STRUCT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_YEAR_MONTH_STRUCT#SIZEOF}, and its mark will be undefined.
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
        protected SQL_YEAR_MONTH_STRUCT newInstance(long address) {
            return new SQL_YEAR_MONTH_STRUCT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code year} field. */
        @NativeType("SQLUINTEGER")
        public int year() { return SQL_YEAR_MONTH_STRUCT.nyear(address()); }
        /** Returns the value of the {@code month} field. */
        @NativeType("SQLUINTEGER")
        public int month() { return SQL_YEAR_MONTH_STRUCT.nmonth(address()); }

        /** Sets the specified value to the {@code year} field. */
        public SQL_YEAR_MONTH_STRUCT.Buffer year(@NativeType("SQLUINTEGER") int value) { SQL_YEAR_MONTH_STRUCT.nyear(address(), value); return this; }
        /** Sets the specified value to the {@code month} field. */
        public SQL_YEAR_MONTH_STRUCT.Buffer month(@NativeType("SQLUINTEGER") int value) { SQL_YEAR_MONTH_STRUCT.nmonth(address(), value); return this; }

    }

}