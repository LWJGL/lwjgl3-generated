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
 * struct SQL_TIME_STRUCT {
 *     SQLUSMALLINT hour;
 *     SQLUSMALLINT minute;
 *     SQLUSMALLINT second;
 * }</pre></code>
 */
public class SQL_TIME_STRUCT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HOUR,
        MINUTE,
        SECOND;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HOUR = layout.offsetof(0);
        MINUTE = layout.offsetof(1);
        SECOND = layout.offsetof(2);
    }

    SQL_TIME_STRUCT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link SQL_TIME_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_TIME_STRUCT(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code hour} field. */
    @NativeType("SQLUSMALLINT")
    public short hour() { return nhour(address()); }
    /** Returns the value of the {@code minute} field. */
    @NativeType("SQLUSMALLINT")
    public short minute() { return nminute(address()); }
    /** Returns the value of the {@code second} field. */
    @NativeType("SQLUSMALLINT")
    public short second() { return nsecond(address()); }

    /** Sets the specified value to the {@code hour} field. */
    public SQL_TIME_STRUCT hour(@NativeType("SQLUSMALLINT") short value) { nhour(address(), value); return this; }
    /** Sets the specified value to the {@code minute} field. */
    public SQL_TIME_STRUCT minute(@NativeType("SQLUSMALLINT") short value) { nminute(address(), value); return this; }
    /** Sets the specified value to the {@code second} field. */
    public SQL_TIME_STRUCT second(@NativeType("SQLUSMALLINT") short value) { nsecond(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_TIME_STRUCT set(
        short hour,
        short minute,
        short second
    ) {
        hour(hour);
        minute(minute);
        second(second);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQL_TIME_STRUCT set(SQL_TIME_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link SQL_TIME_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_TIME_STRUCT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link SQL_TIME_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_TIME_STRUCT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link SQL_TIME_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_TIME_STRUCT create() {
        return new SQL_TIME_STRUCT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link SQL_TIME_STRUCT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static SQL_TIME_STRUCT create(long address) {
        return address == NULL ? null : new SQL_TIME_STRUCT(address, null);
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link SQL_TIME_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link SQL_TIME_STRUCT} instance allocated on the thread-local {@link MemoryStack}. */
    public static SQL_TIME_STRUCT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link SQL_TIME_STRUCT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static SQL_TIME_STRUCT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_TIME_STRUCT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_TIME_STRUCT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #hour}. */
    public static short nhour(long struct) { return memGetShort(struct + SQL_TIME_STRUCT.HOUR); }
    /** Unsafe version of {@link #minute}. */
    public static short nminute(long struct) { return memGetShort(struct + SQL_TIME_STRUCT.MINUTE); }
    /** Unsafe version of {@link #second}. */
    public static short nsecond(long struct) { return memGetShort(struct + SQL_TIME_STRUCT.SECOND); }

    /** Unsafe version of {@link #hour(short) hour}. */
    public static void nhour(long struct, short value) { memPutShort(struct + SQL_TIME_STRUCT.HOUR, value); }
    /** Unsafe version of {@link #minute(short) minute}. */
    public static void nminute(long struct, short value) { memPutShort(struct + SQL_TIME_STRUCT.MINUTE, value); }
    /** Unsafe version of {@link #second(short) second}. */
    public static void nsecond(long struct, short value) { memPutShort(struct + SQL_TIME_STRUCT.SECOND, value); }

    // -----------------------------------

    /** An array of {@link SQL_TIME_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_TIME_STRUCT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link SQL_TIME_STRUCT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_TIME_STRUCT#SIZEOF}, and its mark will be undefined.
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
        protected SQL_TIME_STRUCT newInstance(long address) {
            return new SQL_TIME_STRUCT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code hour} field. */
        @NativeType("SQLUSMALLINT")
        public short hour() { return SQL_TIME_STRUCT.nhour(address()); }
        /** Returns the value of the {@code minute} field. */
        @NativeType("SQLUSMALLINT")
        public short minute() { return SQL_TIME_STRUCT.nminute(address()); }
        /** Returns the value of the {@code second} field. */
        @NativeType("SQLUSMALLINT")
        public short second() { return SQL_TIME_STRUCT.nsecond(address()); }

        /** Sets the specified value to the {@code hour} field. */
        public SQL_TIME_STRUCT.Buffer hour(@NativeType("SQLUSMALLINT") short value) { SQL_TIME_STRUCT.nhour(address(), value); return this; }
        /** Sets the specified value to the {@code minute} field. */
        public SQL_TIME_STRUCT.Buffer minute(@NativeType("SQLUSMALLINT") short value) { SQL_TIME_STRUCT.nminute(address(), value); return this; }
        /** Sets the specified value to the {@code second} field. */
        public SQL_TIME_STRUCT.Buffer second(@NativeType("SQLUSMALLINT") short value) { SQL_TIME_STRUCT.nsecond(address(), value); return this; }

    }

}