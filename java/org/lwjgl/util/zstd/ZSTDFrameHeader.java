/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code frameContentSize} &ndash; if {@link Zstd#ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN}, it means this field is not available. 0 means "empty"</li>
 * <li>{@code windowSize} &ndash; can be very large, up to &le; {@code frameContentSize}</li>
 * <li>{@code frameType} &ndash; if {@link ZstdX#ZSTD_skippableFrame skippableFrame}, {@code frameContentSize} is the size of skippable content</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ZSTD_frameHeader {
 *     unsigned long long frameContentSize;
 *     unsigned long long windowSize;
 *     unsigned blockSizeMax;
 *     ZSTD_frameType_e frameType;
 *     unsigned headerSize;
 *     unsigned dictID;
 *     unsigned checksumFlag;
 * }</pre></code>
 */
@NativeType("struct ZSTD_frameHeader")
public class ZSTDFrameHeader extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FRAMECONTENTSIZE,
        WINDOWSIZE,
        BLOCKSIZEMAX,
        FRAMETYPE,
        HEADERSIZE,
        DICTID,
        CHECKSUMFLAG;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FRAMECONTENTSIZE = layout.offsetof(0);
        WINDOWSIZE = layout.offsetof(1);
        BLOCKSIZEMAX = layout.offsetof(2);
        FRAMETYPE = layout.offsetof(3);
        HEADERSIZE = layout.offsetof(4);
        DICTID = layout.offsetof(5);
        CHECKSUMFLAG = layout.offsetof(6);
    }

    ZSTDFrameHeader(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link ZSTDFrameHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDFrameHeader(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code frameContentSize} field. */
    @NativeType("unsigned long long")
    public long frameContentSize() { return nframeContentSize(address()); }
    /** Returns the value of the {@code windowSize} field. */
    @NativeType("unsigned long long")
    public long windowSize() { return nwindowSize(address()); }
    /** Returns the value of the {@code blockSizeMax} field. */
    @NativeType("unsigned")
    public int blockSizeMax() { return nblockSizeMax(address()); }
    /** Returns the value of the {@code frameType} field. */
    @NativeType("ZSTD_frameType_e")
    public int frameType() { return nframeType(address()); }
    /** Returns the value of the {@code headerSize} field. */
    @NativeType("unsigned")
    public int headerSize() { return nheaderSize(address()); }
    /** Returns the value of the {@code dictID} field. */
    @NativeType("unsigned")
    public int dictID() { return ndictID(address()); }
    /** Returns the value of the {@code checksumFlag} field. */
    @NativeType("unsigned")
    public int checksumFlag() { return nchecksumFlag(address()); }

    // -----------------------------------

    /** Returns a new {@link ZSTDFrameHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDFrameHeader malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link ZSTDFrameHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDFrameHeader calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link ZSTDFrameHeader} instance allocated with {@link BufferUtils}. */
    public static ZSTDFrameHeader create() {
        return new ZSTDFrameHeader(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link ZSTDFrameHeader} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static ZSTDFrameHeader create(long address) {
        return address == NULL ? null : new ZSTDFrameHeader(address, null);
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link ZSTDFrameHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link ZSTDFrameHeader} instance allocated on the thread-local {@link MemoryStack}. */
    public static ZSTDFrameHeader mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link ZSTDFrameHeader} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ZSTDFrameHeader callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link ZSTDFrameHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDFrameHeader mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDFrameHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDFrameHeader callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #frameContentSize}. */
    public static long nframeContentSize(long struct) { return memGetLong(struct + ZSTDFrameHeader.FRAMECONTENTSIZE); }
    /** Unsafe version of {@link #windowSize}. */
    public static long nwindowSize(long struct) { return memGetLong(struct + ZSTDFrameHeader.WINDOWSIZE); }
    /** Unsafe version of {@link #blockSizeMax}. */
    public static int nblockSizeMax(long struct) { return memGetInt(struct + ZSTDFrameHeader.BLOCKSIZEMAX); }
    /** Unsafe version of {@link #frameType}. */
    public static int nframeType(long struct) { return memGetInt(struct + ZSTDFrameHeader.FRAMETYPE); }
    /** Unsafe version of {@link #headerSize}. */
    public static int nheaderSize(long struct) { return memGetInt(struct + ZSTDFrameHeader.HEADERSIZE); }
    /** Unsafe version of {@link #dictID}. */
    public static int ndictID(long struct) { return memGetInt(struct + ZSTDFrameHeader.DICTID); }
    /** Unsafe version of {@link #checksumFlag}. */
    public static int nchecksumFlag(long struct) { return memGetInt(struct + ZSTDFrameHeader.CHECKSUMFLAG); }

    // -----------------------------------

    /** An array of {@link ZSTDFrameHeader} structs. */
    public static class Buffer extends StructBuffer<ZSTDFrameHeader, Buffer> implements NativeResource {

        /**
         * Creates a new {@link ZSTDFrameHeader.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDFrameHeader#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDFrameHeader newInstance(long address) {
            return new ZSTDFrameHeader(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code frameContentSize} field. */
        @NativeType("unsigned long long")
        public long frameContentSize() { return ZSTDFrameHeader.nframeContentSize(address()); }
        /** Returns the value of the {@code windowSize} field. */
        @NativeType("unsigned long long")
        public long windowSize() { return ZSTDFrameHeader.nwindowSize(address()); }
        /** Returns the value of the {@code blockSizeMax} field. */
        @NativeType("unsigned")
        public int blockSizeMax() { return ZSTDFrameHeader.nblockSizeMax(address()); }
        /** Returns the value of the {@code frameType} field. */
        @NativeType("ZSTD_frameType_e")
        public int frameType() { return ZSTDFrameHeader.nframeType(address()); }
        /** Returns the value of the {@code headerSize} field. */
        @NativeType("unsigned")
        public int headerSize() { return ZSTDFrameHeader.nheaderSize(address()); }
        /** Returns the value of the {@code dictID} field. */
        @NativeType("unsigned")
        public int dictID() { return ZSTDFrameHeader.ndictID(address()); }
        /** Returns the value of the {@code checksumFlag} field. */
        @NativeType("unsigned")
        public int checksumFlag() { return ZSTDFrameHeader.nchecksumFlag(address()); }

    }

}