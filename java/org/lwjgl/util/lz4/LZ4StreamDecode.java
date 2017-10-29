/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.lz4.LZ4.LZ4_STREAMDECODESIZE_U64;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * union LZ4_streamDecode_u {
 *     unsigned long long table[LZ4_STREAMDECODESIZE_U64];
 *     {@link LZ4StreamDecodeInternal LZ4_streamDecode_t_internal} internal_donotuse;
 * }</pre></code>
 */
@NativeType("union LZ4_streamDecode_u")
public class LZ4StreamDecode extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TABLE,
        INTERNAL_DONOTUSE;

    static {
        Layout layout = __union(
            __array(8, LZ4_STREAMDECODESIZE_U64),
            __member(LZ4StreamDecodeInternal.SIZEOF, LZ4StreamDecodeInternal.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TABLE = layout.offsetof(0);
        INTERNAL_DONOTUSE = layout.offsetof(1);
    }

    LZ4StreamDecode(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link LZ4StreamDecode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4StreamDecode(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link LongBuffer} view of the {@code table} field. */
    @NativeType("unsigned long long[LZ4_STREAMDECODESIZE_U64]")
    public LongBuffer table() { return ntable(address()); }
    /** Returns the value at the specified index of the {@code table} field. */
    @NativeType("unsigned long long")
    public long table(int index) { return ntable(address(), index); }
    /** Returns a {@link LZ4StreamDecodeInternal} view of the {@code internal_donotuse} field. */
    @NativeType("LZ4_streamDecode_t_internal")
    public LZ4StreamDecodeInternal internal_donotuse() { return ninternal_donotuse(address()); }

    // -----------------------------------

    /** Returns a new {@link LZ4StreamDecode} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static LZ4StreamDecode create(long address) {
        return address == NULL ? null : new LZ4StreamDecode(address, null);
    }

    /**
     * Create a {@link LZ4StreamDecode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #table}. */
    public static LongBuffer ntable(long struct) { return memLongBuffer(struct + LZ4StreamDecode.TABLE, LZ4_STREAMDECODESIZE_U64); }
    /** Unsafe version of {@link #table(int) table}. */
    public static long ntable(long struct, int index) {
        if (CHECKS) { check(index, LZ4_STREAMDECODESIZE_U64); }
        return memGetLong(struct + LZ4StreamDecode.TABLE + index * 8);
    }
    /** Unsafe version of {@link #internal_donotuse}. */
    public static LZ4StreamDecodeInternal ninternal_donotuse(long struct) { return LZ4StreamDecodeInternal.create(struct + LZ4StreamDecode.INTERNAL_DONOTUSE); }

    // -----------------------------------

    /** An array of {@link LZ4StreamDecode} structs. */
    public static class Buffer extends StructBuffer<LZ4StreamDecode, Buffer> {

        /**
         * Creates a new {@link LZ4StreamDecode.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4StreamDecode#SIZEOF}, and its mark will be undefined.
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
        protected LZ4StreamDecode newInstance(long address) {
            return new LZ4StreamDecode(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link LongBuffer} view of the {@code table} field. */
        @NativeType("unsigned long long[LZ4_STREAMDECODESIZE_U64]")
        public LongBuffer table() { return LZ4StreamDecode.ntable(address()); }
        /** Returns the value at the specified index of the {@code table} field. */
        @NativeType("unsigned long long")
        public long table(int index) { return LZ4StreamDecode.ntable(address(), index); }
        /** Returns a {@link LZ4StreamDecodeInternal} view of the {@code internal_donotuse} field. */
        @NativeType("LZ4_streamDecode_t_internal")
        public LZ4StreamDecodeInternal internal_donotuse() { return LZ4StreamDecode.ninternal_donotuse(address()); }

    }

}