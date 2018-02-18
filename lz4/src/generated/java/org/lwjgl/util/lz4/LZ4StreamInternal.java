/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.lz4.LZ4.LZ4_HASH_SIZE_U32;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code bufferStart} &ndash; obsolete, used for {@code slideInputBuffer}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct LZ4_stream_t_internal {
 *     uint32_t hashTable[LZ4_HASH_SIZE_U32];
 *     uint32_t currentOffset;
 *     uint32_t initCheck;
 *     const uint8_t * dictionary;
 *     uint8_t * bufferStart;
 *     uint32_t dictSize;
 * }</pre></code>
 */
@NativeType("struct LZ4_stream_t_internal")
public class LZ4StreamInternal extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HASHTABLE,
        CURRENTOFFSET,
        INITCHECK,
        DICTIONARY,
        BUFFERSTART,
        DICTSIZE;

    static {
        Layout layout = __struct(
            __array(4, LZ4_HASH_SIZE_U32),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HASHTABLE = layout.offsetof(0);
        CURRENTOFFSET = layout.offsetof(1);
        INITCHECK = layout.offsetof(2);
        DICTIONARY = layout.offsetof(3);
        BUFFERSTART = layout.offsetof(4);
        DICTSIZE = layout.offsetof(5);
    }

    LZ4StreamInternal(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link LZ4StreamInternal} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4StreamInternal(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link IntBuffer} view of the {@code hashTable} field. */
    @NativeType("uint32_t[LZ4_HASH_SIZE_U32]")
    public IntBuffer hashTable() { return nhashTable(address()); }
    /** Returns the value at the specified index of the {@code hashTable} field. */
    @NativeType("uint32_t")
    public int hashTable(int index) { return nhashTable(address(), index); }
    /** Returns the value of the {@code currentOffset} field. */
    @NativeType("uint32_t")
    public int currentOffset() { return ncurrentOffset(address()); }
    /** Returns the value of the {@code initCheck} field. */
    @NativeType("uint32_t")
    public int initCheck() { return ninitCheck(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code dictionary} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("const uint8_t *")
    public ByteBuffer dictionary(int capacity) { return ndictionary(address(), capacity); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code bufferStart} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("uint8_t *")
    public ByteBuffer bufferStart(int capacity) { return nbufferStart(address(), capacity); }
    /** Returns the value of the {@code dictSize} field. */
    @NativeType("uint32_t")
    public int dictSize() { return ndictSize(address()); }

    // -----------------------------------

    /** Returns a new {@link LZ4StreamInternal} instance for the specified memory address. */
    public static LZ4StreamInternal create(long address) {
        return new LZ4StreamInternal(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4StreamInternal createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link LZ4StreamInternal.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4StreamInternal.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4StreamInternal.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #hashTable}. */
    public static IntBuffer nhashTable(long struct) { return memIntBuffer(struct + LZ4StreamInternal.HASHTABLE, LZ4_HASH_SIZE_U32); }
    /** Unsafe version of {@link #hashTable(int) hashTable}. */
    public static int nhashTable(long struct, int index) {
        return memGetInt(struct + LZ4StreamInternal.HASHTABLE + check(index, LZ4_HASH_SIZE_U32) * 4);
    }
    /** Unsafe version of {@link #currentOffset}. */
    public static int ncurrentOffset(long struct) { return memGetInt(struct + LZ4StreamInternal.CURRENTOFFSET); }
    /** Unsafe version of {@link #initCheck}. */
    public static int ninitCheck(long struct) { return memGetInt(struct + LZ4StreamInternal.INITCHECK); }
    /** Unsafe version of {@link #dictionary(int) dictionary}. */
    public static ByteBuffer ndictionary(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4StreamInternal.DICTIONARY), capacity); }
    /** Unsafe version of {@link #bufferStart(int) bufferStart}. */
    public static ByteBuffer nbufferStart(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4StreamInternal.BUFFERSTART), capacity); }
    /** Unsafe version of {@link #dictSize}. */
    public static int ndictSize(long struct) { return memGetInt(struct + LZ4StreamInternal.DICTSIZE); }

    // -----------------------------------

    /** An array of {@link LZ4StreamInternal} structs. */
    public static class Buffer extends StructBuffer<LZ4StreamInternal, Buffer> {

        /**
         * Creates a new {@link LZ4StreamInternal.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4StreamInternal#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected LZ4StreamInternal newInstance(long address) {
            return new LZ4StreamInternal(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link IntBuffer} view of the {@code hashTable} field. */
        @NativeType("uint32_t[LZ4_HASH_SIZE_U32]")
        public IntBuffer hashTable() { return LZ4StreamInternal.nhashTable(address()); }
        /** Returns the value at the specified index of the {@code hashTable} field. */
        @NativeType("uint32_t")
        public int hashTable(int index) { return LZ4StreamInternal.nhashTable(address(), index); }
        /** Returns the value of the {@code currentOffset} field. */
        @NativeType("uint32_t")
        public int currentOffset() { return LZ4StreamInternal.ncurrentOffset(address()); }
        /** Returns the value of the {@code initCheck} field. */
        @NativeType("uint32_t")
        public int initCheck() { return LZ4StreamInternal.ninitCheck(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code dictionary} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("const uint8_t *")
        public ByteBuffer dictionary(int capacity) { return LZ4StreamInternal.ndictionary(address(), capacity); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code bufferStart} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint8_t *")
        public ByteBuffer bufferStart(int capacity) { return LZ4StreamInternal.nbufferStart(address(), capacity); }
        /** Returns the value of the {@code dictSize} field. */
        @NativeType("uint32_t")
        public int dictSize() { return LZ4StreamInternal.ndictSize(address()); }

    }

}