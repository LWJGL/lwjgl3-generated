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

import static org.lwjgl.util.lz4.LZ4HC.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code end} &ndash; next block here to continue on current prefix</li>
 * <li>{@code base} &ndash; All index relative to this position</li>
 * <li>{@code dictBase} &ndash; alternate base for {@code extDict}</li>
 * <li>{@code inputBuffer} &ndash; deprecated</li>
 * <li>{@code dictLimit} &ndash; below that point, need {@code extDict}</li>
 * <li>{@code lowLimit} &ndash; below that point, no more {@code dict}</li>
 * <li>{@code nextToUpdate} &ndash; index from which to continue dictionary update</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct LZ4HC_CCtx_internal {
 *     uint32_t hashTable[LZ4HC_HASHTABLESIZE];
 *     uint16_t chainTable[LZ4HC_MAXD];
 *     const uint8_t * end;
 *     const uint8_t * base;
 *     const uint8_t * dictBase;
 *     uint8_t * inputBuffer;
 *     uint32_t dictLimit;
 *     uint32_t lowLimit;
 *     uint32_t nextToUpdate;
 *     int compressionLevel;
 * }</pre></code>
 */
@NativeType("struct LZ4HC_CCtx_internal")
public class LZ4HCCCtxInternal extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HASHTABLE,
        CHAINTABLE,
        END,
        BASE,
        DICTBASE,
        INPUTBUFFER,
        DICTLIMIT,
        LOWLIMIT,
        NEXTTOUPDATE,
        COMPRESSIONLEVEL;

    static {
        Layout layout = __struct(
            __array(4, LZ4HC_HASHTABLESIZE),
            __array(2, LZ4HC_MAXD),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HASHTABLE = layout.offsetof(0);
        CHAINTABLE = layout.offsetof(1);
        END = layout.offsetof(2);
        BASE = layout.offsetof(3);
        DICTBASE = layout.offsetof(4);
        INPUTBUFFER = layout.offsetof(5);
        DICTLIMIT = layout.offsetof(6);
        LOWLIMIT = layout.offsetof(7);
        NEXTTOUPDATE = layout.offsetof(8);
        COMPRESSIONLEVEL = layout.offsetof(9);
    }

    LZ4HCCCtxInternal(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link LZ4HCCCtxInternal} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4HCCCtxInternal(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link IntBuffer} view of the {@code hashTable} field. */
    @NativeType("uint32_t[LZ4HC_HASHTABLESIZE]")
    public IntBuffer hashTable() { return nhashTable(address()); }
    /** Returns the value at the specified index of the {@code hashTable} field. */
    @NativeType("uint32_t")
    public int hashTable(int index) { return nhashTable(address(), index); }
    /** Returns a {@link ShortBuffer} view of the {@code chainTable} field. */
    @NativeType("uint16_t[LZ4HC_MAXD]")
    public ShortBuffer chainTable() { return nchainTable(address()); }
    /** Returns the value at the specified index of the {@code chainTable} field. */
    @NativeType("uint16_t")
    public short chainTable(int index) { return nchainTable(address(), index); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code end} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("const uint8_t *")
    public ByteBuffer end(int capacity) { return nend(address(), capacity); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code base} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("const uint8_t *")
    public ByteBuffer base(int capacity) { return nbase(address(), capacity); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code dictBase} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("const uint8_t *")
    public ByteBuffer dictBase(int capacity) { return ndictBase(address(), capacity); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code inputBuffer} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("uint8_t *")
    public ByteBuffer inputBuffer(int capacity) { return ninputBuffer(address(), capacity); }
    /** Returns the value of the {@code dictLimit} field. */
    @NativeType("uint32_t")
    public int dictLimit() { return ndictLimit(address()); }
    /** Returns the value of the {@code lowLimit} field. */
    @NativeType("uint32_t")
    public int lowLimit() { return nlowLimit(address()); }
    /** Returns the value of the {@code nextToUpdate} field. */
    @NativeType("uint32_t")
    public int nextToUpdate() { return nnextToUpdate(address()); }
    /** Returns the value of the {@code compressionLevel} field. */
    public int compressionLevel() { return ncompressionLevel(address()); }

    // -----------------------------------

    /** Returns a new {@link LZ4HCCCtxInternal} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static LZ4HCCCtxInternal create(long address) {
        return address == NULL ? null : new LZ4HCCCtxInternal(address, null);
    }

    /**
     * Create a {@link LZ4HCCCtxInternal.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #hashTable}. */
    public static IntBuffer nhashTable(long struct) { return memIntBuffer(struct + LZ4HCCCtxInternal.HASHTABLE, LZ4HC_HASHTABLESIZE); }
    /** Unsafe version of {@link #hashTable(int) hashTable}. */
    public static int nhashTable(long struct, int index) {
        if (CHECKS) { check(index, LZ4HC_HASHTABLESIZE); }
        return memGetInt(struct + LZ4HCCCtxInternal.HASHTABLE + index * 4);
    }
    /** Unsafe version of {@link #chainTable}. */
    public static ShortBuffer nchainTable(long struct) { return memShortBuffer(struct + LZ4HCCCtxInternal.CHAINTABLE, LZ4HC_MAXD); }
    /** Unsafe version of {@link #chainTable(int) chainTable}. */
    public static short nchainTable(long struct, int index) {
        if (CHECKS) { check(index, LZ4HC_MAXD); }
        return memGetShort(struct + LZ4HCCCtxInternal.CHAINTABLE + index * 2);
    }
    /** Unsafe version of {@link #end(int) end}. */
    public static ByteBuffer nend(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4HCCCtxInternal.END), capacity); }
    /** Unsafe version of {@link #base(int) base}. */
    public static ByteBuffer nbase(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4HCCCtxInternal.BASE), capacity); }
    /** Unsafe version of {@link #dictBase(int) dictBase}. */
    public static ByteBuffer ndictBase(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4HCCCtxInternal.DICTBASE), capacity); }
    /** Unsafe version of {@link #inputBuffer(int) inputBuffer}. */
    public static ByteBuffer ninputBuffer(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4HCCCtxInternal.INPUTBUFFER), capacity); }
    /** Unsafe version of {@link #dictLimit}. */
    public static int ndictLimit(long struct) { return memGetInt(struct + LZ4HCCCtxInternal.DICTLIMIT); }
    /** Unsafe version of {@link #lowLimit}. */
    public static int nlowLimit(long struct) { return memGetInt(struct + LZ4HCCCtxInternal.LOWLIMIT); }
    /** Unsafe version of {@link #nextToUpdate}. */
    public static int nnextToUpdate(long struct) { return memGetInt(struct + LZ4HCCCtxInternal.NEXTTOUPDATE); }
    /** Unsafe version of {@link #compressionLevel}. */
    public static int ncompressionLevel(long struct) { return memGetInt(struct + LZ4HCCCtxInternal.COMPRESSIONLEVEL); }

    // -----------------------------------

    /** An array of {@link LZ4HCCCtxInternal} structs. */
    public static class Buffer extends StructBuffer<LZ4HCCCtxInternal, Buffer> {

        /**
         * Creates a new {@link LZ4HCCCtxInternal.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4HCCCtxInternal#SIZEOF}, and its mark will be undefined.
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
        protected LZ4HCCCtxInternal newInstance(long address) {
            return new LZ4HCCCtxInternal(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link IntBuffer} view of the {@code hashTable} field. */
        @NativeType("uint32_t[LZ4HC_HASHTABLESIZE]")
        public IntBuffer hashTable() { return LZ4HCCCtxInternal.nhashTable(address()); }
        /** Returns the value at the specified index of the {@code hashTable} field. */
        @NativeType("uint32_t")
        public int hashTable(int index) { return LZ4HCCCtxInternal.nhashTable(address(), index); }
        /** Returns a {@link ShortBuffer} view of the {@code chainTable} field. */
        @NativeType("uint16_t[LZ4HC_MAXD]")
        public ShortBuffer chainTable() { return LZ4HCCCtxInternal.nchainTable(address()); }
        /** Returns the value at the specified index of the {@code chainTable} field. */
        @NativeType("uint16_t")
        public short chainTable(int index) { return LZ4HCCCtxInternal.nchainTable(address(), index); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code end} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("const uint8_t *")
        public ByteBuffer end(int capacity) { return LZ4HCCCtxInternal.nend(address(), capacity); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code base} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("const uint8_t *")
        public ByteBuffer base(int capacity) { return LZ4HCCCtxInternal.nbase(address(), capacity); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code dictBase} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("const uint8_t *")
        public ByteBuffer dictBase(int capacity) { return LZ4HCCCtxInternal.ndictBase(address(), capacity); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code inputBuffer} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint8_t *")
        public ByteBuffer inputBuffer(int capacity) { return LZ4HCCCtxInternal.ninputBuffer(address(), capacity); }
        /** Returns the value of the {@code dictLimit} field. */
        @NativeType("uint32_t")
        public int dictLimit() { return LZ4HCCCtxInternal.ndictLimit(address()); }
        /** Returns the value of the {@code lowLimit} field. */
        @NativeType("uint32_t")
        public int lowLimit() { return LZ4HCCCtxInternal.nlowLimit(address()); }
        /** Returns the value of the {@code nextToUpdate} field. */
        @NativeType("uint32_t")
        public int nextToUpdate() { return LZ4HCCCtxInternal.nnextToUpdate(address()); }
        /** Returns the value of the {@code compressionLevel} field. */
        public int compressionLevel() { return LZ4HCCCtxInternal.ncompressionLevel(address()); }

    }

}