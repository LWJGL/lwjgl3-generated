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
 * struct SQL_INTERVAL_STRUCT {
 *     SQLINTERVAL interval_type;
 *     SQLSMALLINT interval_sign;
 *     struct {
 *         {@link SQL_YEAR_MONTH_STRUCT SQL_YEAR_MONTH_STRUCT} year_month;
 *         {@link SQL_DAY_SECOND_STRUCT SQL_DAY_SECOND_STRUCT} day_second;
 *     } intval;
 * }</pre></code>
 */
public class SQL_INTERVAL_STRUCT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INTERVAL_TYPE,
        INTERVAL_SIGN,
        INTVAL,
            INTVAL_YEAR_MONTH,
            INTVAL_DAY_SECOND;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __struct(
                __member(SQL_YEAR_MONTH_STRUCT.SIZEOF, SQL_YEAR_MONTH_STRUCT.ALIGNOF),
                __member(SQL_DAY_SECOND_STRUCT.SIZEOF, SQL_DAY_SECOND_STRUCT.ALIGNOF)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INTERVAL_TYPE = layout.offsetof(0);
        INTERVAL_SIGN = layout.offsetof(1);
        INTVAL = layout.offsetof(2);
            INTVAL_YEAR_MONTH = layout.offsetof(3);
            INTVAL_DAY_SECOND = layout.offsetof(4);
    }

    SQL_INTERVAL_STRUCT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link SQL_INTERVAL_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_INTERVAL_STRUCT(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code interval_type} field. */
    @NativeType("SQLINTERVAL")
    public int interval_type() { return ninterval_type(address()); }
    /** Returns the value of the {@code interval_sign} field. */
    @NativeType("SQLSMALLINT")
    public short interval_sign() { return ninterval_sign(address()); }
    /** Returns a {@link SQL_YEAR_MONTH_STRUCT} view of the {@code intval_year_month} field. */
    public SQL_YEAR_MONTH_STRUCT intval_year_month() { return nintval_year_month(address()); }
    /** Returns a {@link SQL_DAY_SECOND_STRUCT} view of the {@code intval_day_second} field. */
    public SQL_DAY_SECOND_STRUCT intval_day_second() { return nintval_day_second(address()); }

    /** Sets the specified value to the {@code interval_type} field. */
    public SQL_INTERVAL_STRUCT interval_type(@NativeType("SQLINTERVAL") int value) { ninterval_type(address(), value); return this; }
    /** Sets the specified value to the {@code interval_sign} field. */
    public SQL_INTERVAL_STRUCT interval_sign(@NativeType("SQLSMALLINT") short value) { ninterval_sign(address(), value); return this; }
    /** Copies the specified {@link SQL_YEAR_MONTH_STRUCT} to the {@code year_month} field. */
    public SQL_INTERVAL_STRUCT intval_year_month(SQL_YEAR_MONTH_STRUCT value) { nintval_year_month(address(), value); return this; }
    /** Copies the specified {@link SQL_DAY_SECOND_STRUCT} to the {@code day_second} field. */
    public SQL_INTERVAL_STRUCT intval_day_second(SQL_DAY_SECOND_STRUCT value) { nintval_day_second(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_INTERVAL_STRUCT set(
        int interval_type,
        short interval_sign,
        SQL_YEAR_MONTH_STRUCT intval_year_month,
        SQL_DAY_SECOND_STRUCT intval_day_second
    ) {
        interval_type(interval_type);
        interval_sign(interval_sign);
        intval_year_month(intval_year_month);
        intval_day_second(intval_day_second);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQL_INTERVAL_STRUCT set(SQL_INTERVAL_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link SQL_INTERVAL_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_INTERVAL_STRUCT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link SQL_INTERVAL_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_INTERVAL_STRUCT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link SQL_INTERVAL_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_INTERVAL_STRUCT create() {
        return new SQL_INTERVAL_STRUCT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link SQL_INTERVAL_STRUCT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static SQL_INTERVAL_STRUCT create(long address) {
        return address == NULL ? null : new SQL_INTERVAL_STRUCT(address, null);
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link SQL_INTERVAL_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link SQL_INTERVAL_STRUCT} instance allocated on the thread-local {@link MemoryStack}. */
    public static SQL_INTERVAL_STRUCT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link SQL_INTERVAL_STRUCT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static SQL_INTERVAL_STRUCT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_INTERVAL_STRUCT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_INTERVAL_STRUCT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #interval_type}. */
    public static int ninterval_type(long struct) { return memGetInt(struct + SQL_INTERVAL_STRUCT.INTERVAL_TYPE); }
    /** Unsafe version of {@link #interval_sign}. */
    public static short ninterval_sign(long struct) { return memGetShort(struct + SQL_INTERVAL_STRUCT.INTERVAL_SIGN); }
    /** Unsafe version of {@link #intval_year_month}. */
    public static SQL_YEAR_MONTH_STRUCT nintval_year_month(long struct) { return SQL_YEAR_MONTH_STRUCT.create(struct + SQL_INTERVAL_STRUCT.INTVAL_YEAR_MONTH); }
    /** Unsafe version of {@link #intval_day_second}. */
    public static SQL_DAY_SECOND_STRUCT nintval_day_second(long struct) { return SQL_DAY_SECOND_STRUCT.create(struct + SQL_INTERVAL_STRUCT.INTVAL_DAY_SECOND); }

    /** Unsafe version of {@link #interval_type(int) interval_type}. */
    public static void ninterval_type(long struct, int value) { memPutInt(struct + SQL_INTERVAL_STRUCT.INTERVAL_TYPE, value); }
    /** Unsafe version of {@link #interval_sign(short) interval_sign}. */
    public static void ninterval_sign(long struct, short value) { memPutShort(struct + SQL_INTERVAL_STRUCT.INTERVAL_SIGN, value); }
    /** Unsafe version of {@link #intval_year_month(SQL_YEAR_MONTH_STRUCT) intval_year_month}. */
    public static void nintval_year_month(long struct, SQL_YEAR_MONTH_STRUCT value) { memCopy(value.address(), struct + SQL_INTERVAL_STRUCT.INTVAL_YEAR_MONTH, SQL_YEAR_MONTH_STRUCT.SIZEOF); }
    /** Unsafe version of {@link #intval_day_second(SQL_DAY_SECOND_STRUCT) intval_day_second}. */
    public static void nintval_day_second(long struct, SQL_DAY_SECOND_STRUCT value) { memCopy(value.address(), struct + SQL_INTERVAL_STRUCT.INTVAL_DAY_SECOND, SQL_DAY_SECOND_STRUCT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link SQL_INTERVAL_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_INTERVAL_STRUCT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link SQL_INTERVAL_STRUCT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_INTERVAL_STRUCT#SIZEOF}, and its mark will be undefined.
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
        protected SQL_INTERVAL_STRUCT newInstance(long address) {
            return new SQL_INTERVAL_STRUCT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code interval_type} field. */
        @NativeType("SQLINTERVAL")
        public int interval_type() { return SQL_INTERVAL_STRUCT.ninterval_type(address()); }
        /** Returns the value of the {@code interval_sign} field. */
        @NativeType("SQLSMALLINT")
        public short interval_sign() { return SQL_INTERVAL_STRUCT.ninterval_sign(address()); }
        /** Returns a {@link SQL_YEAR_MONTH_STRUCT} view of the {@code intval_year_month} field. */
        public SQL_YEAR_MONTH_STRUCT intval_year_month() { return SQL_INTERVAL_STRUCT.nintval_year_month(address()); }
        /** Returns a {@link SQL_DAY_SECOND_STRUCT} view of the {@code intval_day_second} field. */
        public SQL_DAY_SECOND_STRUCT intval_day_second() { return SQL_INTERVAL_STRUCT.nintval_day_second(address()); }

        /** Sets the specified value to the {@code interval_type} field. */
        public SQL_INTERVAL_STRUCT.Buffer interval_type(@NativeType("SQLINTERVAL") int value) { SQL_INTERVAL_STRUCT.ninterval_type(address(), value); return this; }
        /** Sets the specified value to the {@code interval_sign} field. */
        public SQL_INTERVAL_STRUCT.Buffer interval_sign(@NativeType("SQLSMALLINT") short value) { SQL_INTERVAL_STRUCT.ninterval_sign(address(), value); return this; }
        /** Copies the specified {@link SQL_YEAR_MONTH_STRUCT} to the {@code year_month} field. */
        public SQL_INTERVAL_STRUCT.Buffer intval_year_month(SQL_YEAR_MONTH_STRUCT value) { SQL_INTERVAL_STRUCT.nintval_year_month(address(), value); return this; }
        /** Copies the specified {@link SQL_DAY_SECOND_STRUCT} to the {@code day_second} field. */
        public SQL_INTERVAL_STRUCT.Buffer intval_day_second(SQL_DAY_SECOND_STRUCT value) { SQL_INTERVAL_STRUCT.nintval_day_second(address(), value); return this; }

    }

}