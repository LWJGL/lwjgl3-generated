/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Makes it possible to set or read frame parameters.
 * 
 * <p>It's not required to set all fields, as long as the structure was initially {@code memset()} to zero. For all fields, 0 sets it to default value.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code blockSizeID} &ndash; {@code 0 == default}. One of:<br><table><tr><td>{@link LZ4Frame#LZ4F_max64KB max64KB}</td><td>{@link LZ4Frame#LZ4F_max256KB max256KB}</td><td>{@link LZ4Frame#LZ4F_max1MB max1MB}</td><td>{@link LZ4Frame#LZ4F_max4MB max4MB}</td></tr></table></li>
 * <li>{@code blockMode} &ndash; {@code 0 == default}. One of:<br><table><tr><td>{@link LZ4Frame#LZ4F_blockLinked blockLinked}</td><td>{@link LZ4Frame#LZ4F_blockIndependent blockIndependent}</td><td>{@link LZ4Frame#LZ4F_blockChecksumEnabled blockChecksumEnabled}</td></tr></table></li>
 * <li>{@code contentChecksumFlag} &ndash; if enabled, frame is terminated with a 32-bits checksum of decompressed data; {@code 0 == disabled} (default)</li>
 * <li>{@code frameType} &ndash; read-only field. One of:<br><table><tr><td>{@link LZ4Frame#LZ4F_frame frame}</td><td>{@link LZ4Frame#LZ4F_skippableFrame skippableFrame}</td></tr></table></li>
 * <li>{@code contentSize} &ndash; size of uncompressed content ; {@code 0 == unknown}</li>
 * <li>{@code dictID} &ndash; dictionary ID, sent by the compressor to help decoder select the correct dictionary; {@code 0 == no dictID} provided</li>
 * <li>{@code blockChecksumFlag} &ndash; if enabled, each block is followed by a checksum of block's compressed data ; {@code 0 == disabled} (default)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct LZ4F_frameInfo_t {
 *     LZ4F_blockSizeID_t blockSizeID;
 *     LZ4F_blockMode_t blockMode;
 *     LZ4F_contentChecksum_t contentChecksumFlag;
 *     LZ4F_frameType_t frameType;
 *     unsigned long long contentSize;
 *     unsigned dictID;
 *     LZ4F_blockChecksum_t blockChecksumFlag;
 * }</pre></code>
 */
@NativeType("struct LZ4F_frameInfo_t")
public class LZ4FFrameInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BLOCKSIZEID,
        BLOCKMODE,
        CONTENTCHECKSUMFLAG,
        FRAMETYPE,
        CONTENTSIZE,
        DICTID,
        BLOCKCHECKSUMFLAG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BLOCKSIZEID = layout.offsetof(0);
        BLOCKMODE = layout.offsetof(1);
        CONTENTCHECKSUMFLAG = layout.offsetof(2);
        FRAMETYPE = layout.offsetof(3);
        CONTENTSIZE = layout.offsetof(4);
        DICTID = layout.offsetof(5);
        BLOCKCHECKSUMFLAG = layout.offsetof(6);
    }

    LZ4FFrameInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link LZ4FFrameInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4FFrameInfo(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code blockSizeID} field. */
    @NativeType("LZ4F_blockSizeID_t")
    public int blockSizeID() { return nblockSizeID(address()); }
    /** Returns the value of the {@code blockMode} field. */
    @NativeType("LZ4F_blockMode_t")
    public int blockMode() { return nblockMode(address()); }
    /** Returns the value of the {@code contentChecksumFlag} field. */
    @NativeType("LZ4F_contentChecksum_t")
    public int contentChecksumFlag() { return ncontentChecksumFlag(address()); }
    /** Returns the value of the {@code frameType} field. */
    @NativeType("LZ4F_frameType_t")
    public int frameType() { return nframeType(address()); }
    /** Returns the value of the {@code contentSize} field. */
    @NativeType("unsigned long long")
    public long contentSize() { return ncontentSize(address()); }
    /** Returns the value of the {@code dictID} field. */
    @NativeType("unsigned")
    public int dictID() { return ndictID(address()); }
    /** Returns the value of the {@code blockChecksumFlag} field. */
    @NativeType("LZ4F_blockChecksum_t")
    public int blockChecksumFlag() { return nblockChecksumFlag(address()); }

    /** Sets the specified value to the {@code blockSizeID} field. */
    public LZ4FFrameInfo blockSizeID(@NativeType("LZ4F_blockSizeID_t") int value) { nblockSizeID(address(), value); return this; }
    /** Sets the specified value to the {@code blockMode} field. */
    public LZ4FFrameInfo blockMode(@NativeType("LZ4F_blockMode_t") int value) { nblockMode(address(), value); return this; }
    /** Sets the specified value to the {@code contentChecksumFlag} field. */
    public LZ4FFrameInfo contentChecksumFlag(@NativeType("LZ4F_contentChecksum_t") int value) { ncontentChecksumFlag(address(), value); return this; }
    /** Sets the specified value to the {@code frameType} field. */
    public LZ4FFrameInfo frameType(@NativeType("LZ4F_frameType_t") int value) { nframeType(address(), value); return this; }
    /** Sets the specified value to the {@code contentSize} field. */
    public LZ4FFrameInfo contentSize(@NativeType("unsigned long long") long value) { ncontentSize(address(), value); return this; }
    /** Sets the specified value to the {@code dictID} field. */
    public LZ4FFrameInfo dictID(@NativeType("unsigned") int value) { ndictID(address(), value); return this; }
    /** Sets the specified value to the {@code blockChecksumFlag} field. */
    public LZ4FFrameInfo blockChecksumFlag(@NativeType("LZ4F_blockChecksum_t") int value) { nblockChecksumFlag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LZ4FFrameInfo set(
        int blockSizeID,
        int blockMode,
        int contentChecksumFlag,
        int frameType,
        long contentSize,
        int dictID,
        int blockChecksumFlag
    ) {
        blockSizeID(blockSizeID);
        blockMode(blockMode);
        contentChecksumFlag(contentChecksumFlag);
        frameType(frameType);
        contentSize(contentSize);
        dictID(dictID);
        blockChecksumFlag(blockChecksumFlag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LZ4FFrameInfo set(LZ4FFrameInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link LZ4FFrameInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LZ4FFrameInfo malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link LZ4FFrameInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LZ4FFrameInfo calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link LZ4FFrameInfo} instance allocated with {@link BufferUtils}. */
    public static LZ4FFrameInfo create() {
        return new LZ4FFrameInfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link LZ4FFrameInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static LZ4FFrameInfo create(long address) {
        return address == NULL ? null : new LZ4FFrameInfo(address, null);
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link LZ4FFrameInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link LZ4FFrameInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static LZ4FFrameInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link LZ4FFrameInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static LZ4FFrameInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link LZ4FFrameInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FFrameInfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link LZ4FFrameInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FFrameInfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #blockSizeID}. */
    public static int nblockSizeID(long struct) { return memGetInt(struct + LZ4FFrameInfo.BLOCKSIZEID); }
    /** Unsafe version of {@link #blockMode}. */
    public static int nblockMode(long struct) { return memGetInt(struct + LZ4FFrameInfo.BLOCKMODE); }
    /** Unsafe version of {@link #contentChecksumFlag}. */
    public static int ncontentChecksumFlag(long struct) { return memGetInt(struct + LZ4FFrameInfo.CONTENTCHECKSUMFLAG); }
    /** Unsafe version of {@link #frameType}. */
    public static int nframeType(long struct) { return memGetInt(struct + LZ4FFrameInfo.FRAMETYPE); }
    /** Unsafe version of {@link #contentSize}. */
    public static long ncontentSize(long struct) { return memGetLong(struct + LZ4FFrameInfo.CONTENTSIZE); }
    /** Unsafe version of {@link #dictID}. */
    public static int ndictID(long struct) { return memGetInt(struct + LZ4FFrameInfo.DICTID); }
    /** Unsafe version of {@link #blockChecksumFlag}. */
    public static int nblockChecksumFlag(long struct) { return memGetInt(struct + LZ4FFrameInfo.BLOCKCHECKSUMFLAG); }

    /** Unsafe version of {@link #blockSizeID(int) blockSizeID}. */
    public static void nblockSizeID(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.BLOCKSIZEID, value); }
    /** Unsafe version of {@link #blockMode(int) blockMode}. */
    public static void nblockMode(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.BLOCKMODE, value); }
    /** Unsafe version of {@link #contentChecksumFlag(int) contentChecksumFlag}. */
    public static void ncontentChecksumFlag(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.CONTENTCHECKSUMFLAG, value); }
    /** Unsafe version of {@link #frameType(int) frameType}. */
    public static void nframeType(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.FRAMETYPE, value); }
    /** Unsafe version of {@link #contentSize(long) contentSize}. */
    public static void ncontentSize(long struct, long value) { memPutLong(struct + LZ4FFrameInfo.CONTENTSIZE, value); }
    /** Unsafe version of {@link #dictID(int) dictID}. */
    public static void ndictID(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.DICTID, value); }
    /** Unsafe version of {@link #blockChecksumFlag(int) blockChecksumFlag}. */
    public static void nblockChecksumFlag(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.BLOCKCHECKSUMFLAG, value); }

    // -----------------------------------

    /** An array of {@link LZ4FFrameInfo} structs. */
    public static class Buffer extends StructBuffer<LZ4FFrameInfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link LZ4FFrameInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4FFrameInfo#SIZEOF}, and its mark will be undefined.
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
        protected LZ4FFrameInfo newInstance(long address) {
            return new LZ4FFrameInfo(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code blockSizeID} field. */
        @NativeType("LZ4F_blockSizeID_t")
        public int blockSizeID() { return LZ4FFrameInfo.nblockSizeID(address()); }
        /** Returns the value of the {@code blockMode} field. */
        @NativeType("LZ4F_blockMode_t")
        public int blockMode() { return LZ4FFrameInfo.nblockMode(address()); }
        /** Returns the value of the {@code contentChecksumFlag} field. */
        @NativeType("LZ4F_contentChecksum_t")
        public int contentChecksumFlag() { return LZ4FFrameInfo.ncontentChecksumFlag(address()); }
        /** Returns the value of the {@code frameType} field. */
        @NativeType("LZ4F_frameType_t")
        public int frameType() { return LZ4FFrameInfo.nframeType(address()); }
        /** Returns the value of the {@code contentSize} field. */
        @NativeType("unsigned long long")
        public long contentSize() { return LZ4FFrameInfo.ncontentSize(address()); }
        /** Returns the value of the {@code dictID} field. */
        @NativeType("unsigned")
        public int dictID() { return LZ4FFrameInfo.ndictID(address()); }
        /** Returns the value of the {@code blockChecksumFlag} field. */
        @NativeType("LZ4F_blockChecksum_t")
        public int blockChecksumFlag() { return LZ4FFrameInfo.nblockChecksumFlag(address()); }

        /** Sets the specified value to the {@code blockSizeID} field. */
        public LZ4FFrameInfo.Buffer blockSizeID(@NativeType("LZ4F_blockSizeID_t") int value) { LZ4FFrameInfo.nblockSizeID(address(), value); return this; }
        /** Sets the specified value to the {@code blockMode} field. */
        public LZ4FFrameInfo.Buffer blockMode(@NativeType("LZ4F_blockMode_t") int value) { LZ4FFrameInfo.nblockMode(address(), value); return this; }
        /** Sets the specified value to the {@code contentChecksumFlag} field. */
        public LZ4FFrameInfo.Buffer contentChecksumFlag(@NativeType("LZ4F_contentChecksum_t") int value) { LZ4FFrameInfo.ncontentChecksumFlag(address(), value); return this; }
        /** Sets the specified value to the {@code frameType} field. */
        public LZ4FFrameInfo.Buffer frameType(@NativeType("LZ4F_frameType_t") int value) { LZ4FFrameInfo.nframeType(address(), value); return this; }
        /** Sets the specified value to the {@code contentSize} field. */
        public LZ4FFrameInfo.Buffer contentSize(@NativeType("unsigned long long") long value) { LZ4FFrameInfo.ncontentSize(address(), value); return this; }
        /** Sets the specified value to the {@code dictID} field. */
        public LZ4FFrameInfo.Buffer dictID(@NativeType("unsigned") int value) { LZ4FFrameInfo.ndictID(address(), value); return this; }
        /** Sets the specified value to the {@code blockChecksumFlag} field. */
        public LZ4FFrameInfo.Buffer blockChecksumFlag(@NativeType("LZ4F_blockChecksum_t") int value) { LZ4FFrameInfo.nblockChecksumFlag(address(), value); return this; }

    }

}