/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.odbc;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct SQL_NUMERIC_STRUCT {
 *     SQLCHAR precision;
 *     SQLSCHAR scale;
 *     SQLCHAR sign;
 *     SQLCHAR val[16];
 * }</pre></code>
 */
public class SQL_NUMERIC_STRUCT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PRECISION,
        SCALE,
        SIGN,
        VAL;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __array(1, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PRECISION = layout.offsetof(0);
        SCALE = layout.offsetof(1);
        SIGN = layout.offsetof(2);
        VAL = layout.offsetof(3);
    }

    SQL_NUMERIC_STRUCT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link SQL_NUMERIC_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_NUMERIC_STRUCT(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code precision} field. */
    @NativeType("SQLCHAR")
    public byte precision() { return nprecision(address()); }
    /** Returns the value of the {@code scale} field. */
    @NativeType("SQLSCHAR")
    public byte scale() { return nscale(address()); }
    /** Returns the value of the {@code sign} field. */
    @NativeType("SQLCHAR")
    public byte sign() { return nsign(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code val} field. */
    @NativeType("SQLCHAR[16]")
    public ByteBuffer val() { return nval(address()); }
    /** Returns the value at the specified index of the {@code val} field. */
    @NativeType("SQLCHAR")
    public byte val(int index) { return nval(address(), index); }

    /** Sets the specified value to the {@code precision} field. */
    public SQL_NUMERIC_STRUCT precision(@NativeType("SQLCHAR") byte value) { nprecision(address(), value); return this; }
    /** Sets the specified value to the {@code scale} field. */
    public SQL_NUMERIC_STRUCT scale(@NativeType("SQLSCHAR") byte value) { nscale(address(), value); return this; }
    /** Sets the specified value to the {@code sign} field. */
    public SQL_NUMERIC_STRUCT sign(@NativeType("SQLCHAR") byte value) { nsign(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code val} field. */
    public SQL_NUMERIC_STRUCT val(@NativeType("SQLCHAR[16]") ByteBuffer value) { nval(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code val} field. */
    public SQL_NUMERIC_STRUCT val(int index, @NativeType("SQLCHAR") byte value) { nval(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_NUMERIC_STRUCT set(
        byte precision,
        byte scale,
        byte sign,
        ByteBuffer val
    ) {
        precision(precision);
        scale(scale);
        sign(sign);
        val(val);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQL_NUMERIC_STRUCT set(SQL_NUMERIC_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link SQL_NUMERIC_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_NUMERIC_STRUCT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link SQL_NUMERIC_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_NUMERIC_STRUCT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link SQL_NUMERIC_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_NUMERIC_STRUCT create() {
        return new SQL_NUMERIC_STRUCT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link SQL_NUMERIC_STRUCT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static SQL_NUMERIC_STRUCT create(long address) {
        return address == NULL ? null : new SQL_NUMERIC_STRUCT(address, null);
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link SQL_NUMERIC_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link SQL_NUMERIC_STRUCT} instance allocated on the thread-local {@link MemoryStack}. */
    public static SQL_NUMERIC_STRUCT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link SQL_NUMERIC_STRUCT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static SQL_NUMERIC_STRUCT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_NUMERIC_STRUCT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_NUMERIC_STRUCT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #precision}. */
    public static byte nprecision(long struct) { return memGetByte(struct + SQL_NUMERIC_STRUCT.PRECISION); }
    /** Unsafe version of {@link #scale}. */
    public static byte nscale(long struct) { return memGetByte(struct + SQL_NUMERIC_STRUCT.SCALE); }
    /** Unsafe version of {@link #sign}. */
    public static byte nsign(long struct) { return memGetByte(struct + SQL_NUMERIC_STRUCT.SIGN); }
    /** Unsafe version of {@link #val}. */
    public static ByteBuffer nval(long struct) { return memByteBuffer(struct + SQL_NUMERIC_STRUCT.VAL, 16); }
    /** Unsafe version of {@link #val(int) val}. */
    public static byte nval(long struct, int index) {
        if (CHECKS) { check(index, 16); }
        return memGetByte(struct + SQL_NUMERIC_STRUCT.VAL + index * 1);
    }

    /** Unsafe version of {@link #precision(byte) precision}. */
    public static void nprecision(long struct, byte value) { memPutByte(struct + SQL_NUMERIC_STRUCT.PRECISION, value); }
    /** Unsafe version of {@link #scale(byte) scale}. */
    public static void nscale(long struct, byte value) { memPutByte(struct + SQL_NUMERIC_STRUCT.SCALE, value); }
    /** Unsafe version of {@link #sign(byte) sign}. */
    public static void nsign(long struct, byte value) { memPutByte(struct + SQL_NUMERIC_STRUCT.SIGN, value); }
    /** Unsafe version of {@link #val(ByteBuffer) val}. */
    public static void nval(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + SQL_NUMERIC_STRUCT.VAL, value.remaining() * 1);
    }
    /** Unsafe version of {@link #val(int, byte) val}. */
    public static void nval(long struct, int index, byte value) {
        if (CHECKS) { check(index, 16); }
        memPutByte(struct + SQL_NUMERIC_STRUCT.VAL + index * 1, value);
    }

    // -----------------------------------

    /** An array of {@link SQL_NUMERIC_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_NUMERIC_STRUCT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link SQL_NUMERIC_STRUCT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_NUMERIC_STRUCT#SIZEOF}, and its mark will be undefined.
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
        protected SQL_NUMERIC_STRUCT newInstance(long address) {
            return new SQL_NUMERIC_STRUCT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code precision} field. */
        @NativeType("SQLCHAR")
        public byte precision() { return SQL_NUMERIC_STRUCT.nprecision(address()); }
        /** Returns the value of the {@code scale} field. */
        @NativeType("SQLSCHAR")
        public byte scale() { return SQL_NUMERIC_STRUCT.nscale(address()); }
        /** Returns the value of the {@code sign} field. */
        @NativeType("SQLCHAR")
        public byte sign() { return SQL_NUMERIC_STRUCT.nsign(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code val} field. */
        @NativeType("SQLCHAR[16]")
        public ByteBuffer val() { return SQL_NUMERIC_STRUCT.nval(address()); }
        /** Returns the value at the specified index of the {@code val} field. */
        @NativeType("SQLCHAR")
        public byte val(int index) { return SQL_NUMERIC_STRUCT.nval(address(), index); }

        /** Sets the specified value to the {@code precision} field. */
        public SQL_NUMERIC_STRUCT.Buffer precision(@NativeType("SQLCHAR") byte value) { SQL_NUMERIC_STRUCT.nprecision(address(), value); return this; }
        /** Sets the specified value to the {@code scale} field. */
        public SQL_NUMERIC_STRUCT.Buffer scale(@NativeType("SQLSCHAR") byte value) { SQL_NUMERIC_STRUCT.nscale(address(), value); return this; }
        /** Sets the specified value to the {@code sign} field. */
        public SQL_NUMERIC_STRUCT.Buffer sign(@NativeType("SQLCHAR") byte value) { SQL_NUMERIC_STRUCT.nsign(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code val} field. */
        public SQL_NUMERIC_STRUCT.Buffer val(@NativeType("SQLCHAR[16]") ByteBuffer value) { SQL_NUMERIC_STRUCT.nval(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code val} field. */
        public SQL_NUMERIC_STRUCT.Buffer val(int index, @NativeType("SQLCHAR") byte value) { SQL_NUMERIC_STRUCT.nval(address(), index, value); return this; }

    }

}