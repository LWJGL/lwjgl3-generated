/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.lz4.LZ4HC.LZ4_STREAMHCSIZE_SIZET;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * union LZ4_streamHC_u {
 *     size_t table[LZ4_STREAMHCSIZE_SIZET];
 *     {@link LZ4HCCCtxInternal LZ4HC_CCtx_internal} internal_donotuse;
 * }</pre></code>
 */
@NativeType("union LZ4_streamHC_u")
public class LZ4StreamHC extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TABLE,
        INTERNAL_DONOTUSE;

    static {
        Layout layout = __union(
            __array(POINTER_SIZE, LZ4_STREAMHCSIZE_SIZET),
            __member(LZ4HCCCtxInternal.SIZEOF, LZ4HCCCtxInternal.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TABLE = layout.offsetof(0);
        INTERNAL_DONOTUSE = layout.offsetof(1);
    }

    LZ4StreamHC(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link LZ4StreamHC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4StreamHC(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link PointerBuffer} view of the {@code table} field. */
    @NativeType("size_t[LZ4_STREAMHCSIZE_SIZET]")
    public PointerBuffer table() { return ntable(address()); }
    /** Returns the value at the specified index of the {@code table} field. */
    @NativeType("size_t")
    public long table(int index) { return ntable(address(), index); }
    /** Returns a {@link LZ4HCCCtxInternal} view of the {@code internal_donotuse} field. */
    @NativeType("LZ4HC_CCtx_internal")
    public LZ4HCCCtxInternal internal_donotuse() { return ninternal_donotuse(address()); }

    // -----------------------------------

    /** Returns a new {@link LZ4StreamHC} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static LZ4StreamHC create(long address) {
        return address == NULL ? null : new LZ4StreamHC(address, null);
    }

    /**
     * Create a {@link LZ4StreamHC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #table}. */
    public static PointerBuffer ntable(long struct) { return memPointerBuffer(struct + LZ4StreamHC.TABLE, LZ4_STREAMHCSIZE_SIZET); }
    /** Unsafe version of {@link #table(int) table}. */
    public static long ntable(long struct, int index) {
        if (CHECKS) { check(index, LZ4_STREAMHCSIZE_SIZET); }
        return memGetAddress(struct + LZ4StreamHC.TABLE + index * POINTER_SIZE);
    }
    /** Unsafe version of {@link #internal_donotuse}. */
    public static LZ4HCCCtxInternal ninternal_donotuse(long struct) { return LZ4HCCCtxInternal.create(struct + LZ4StreamHC.INTERNAL_DONOTUSE); }

    // -----------------------------------

    /** An array of {@link LZ4StreamHC} structs. */
    public static class Buffer extends StructBuffer<LZ4StreamHC, Buffer> {

        /**
         * Creates a new {@link LZ4StreamHC.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4StreamHC#SIZEOF}, and its mark will be undefined.
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
        protected LZ4StreamHC newInstance(long address) {
            return new LZ4StreamHC(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link PointerBuffer} view of the {@code table} field. */
        @NativeType("size_t[LZ4_STREAMHCSIZE_SIZET]")
        public PointerBuffer table() { return LZ4StreamHC.ntable(address()); }
        /** Returns the value at the specified index of the {@code table} field. */
        @NativeType("size_t")
        public long table(int index) { return LZ4StreamHC.ntable(address(), index); }
        /** Returns a {@link LZ4HCCCtxInternal} view of the {@code internal_donotuse} field. */
        @NativeType("LZ4HC_CCtx_internal")
        public LZ4HCCCtxInternal internal_donotuse() { return LZ4StreamHC.ninternal_donotuse(address()); }

    }

}