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
 * <li>{@code contentSizeFlag} &ndash; 1: content size will be in frame header (when known)</li>
 * <li>{@code checksumFlag} &ndash; 1: generate a 32-bits checksum at end of frame, for error detection</li>
 * <li>{@code noDictIDFlag} &ndash; 1: no {@code dictID} will be saved into frame header (if dictionary compression)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ZSTD_frameParameters {
 *     unsigned contentSizeFlag;
 *     unsigned checksumFlag;
 *     unsigned noDictIDFlag;
 * }</pre></code>
 */
@NativeType("struct ZSTD_frameParameters")
public class ZSTDFrameParameters extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONTENTSIZEFLAG,
        CHECKSUMFLAG,
        NODICTIDFLAG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CONTENTSIZEFLAG = layout.offsetof(0);
        CHECKSUMFLAG = layout.offsetof(1);
        NODICTIDFLAG = layout.offsetof(2);
    }

    ZSTDFrameParameters(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link ZSTDFrameParameters} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDFrameParameters(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code contentSizeFlag} field. */
    @NativeType("unsigned")
    public boolean contentSizeFlag() { return ncontentSizeFlag(address()) != 0; }
    /** Returns the value of the {@code checksumFlag} field. */
    @NativeType("unsigned")
    public boolean checksumFlag() { return nchecksumFlag(address()) != 0; }
    /** Returns the value of the {@code noDictIDFlag} field. */
    @NativeType("unsigned")
    public boolean noDictIDFlag() { return nnoDictIDFlag(address()) != 0; }

    /** Sets the specified value to the {@code contentSizeFlag} field. */
    public ZSTDFrameParameters contentSizeFlag(@NativeType("unsigned") boolean value) { ncontentSizeFlag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code checksumFlag} field. */
    public ZSTDFrameParameters checksumFlag(@NativeType("unsigned") boolean value) { nchecksumFlag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code noDictIDFlag} field. */
    public ZSTDFrameParameters noDictIDFlag(@NativeType("unsigned") boolean value) { nnoDictIDFlag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public ZSTDFrameParameters set(
        boolean contentSizeFlag,
        boolean checksumFlag,
        boolean noDictIDFlag
    ) {
        contentSizeFlag(contentSizeFlag);
        checksumFlag(checksumFlag);
        noDictIDFlag(noDictIDFlag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ZSTDFrameParameters set(ZSTDFrameParameters src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link ZSTDFrameParameters} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDFrameParameters malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link ZSTDFrameParameters} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDFrameParameters calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link ZSTDFrameParameters} instance allocated with {@link BufferUtils}. */
    public static ZSTDFrameParameters create() {
        return new ZSTDFrameParameters(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link ZSTDFrameParameters} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static ZSTDFrameParameters create(long address) {
        return address == NULL ? null : new ZSTDFrameParameters(address, null);
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link ZSTDFrameParameters.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link ZSTDFrameParameters} instance allocated on the thread-local {@link MemoryStack}. */
    public static ZSTDFrameParameters mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link ZSTDFrameParameters} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ZSTDFrameParameters callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link ZSTDFrameParameters} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDFrameParameters mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDFrameParameters} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDFrameParameters callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #contentSizeFlag}. */
    public static int ncontentSizeFlag(long struct) { return memGetInt(struct + ZSTDFrameParameters.CONTENTSIZEFLAG); }
    /** Unsafe version of {@link #checksumFlag}. */
    public static int nchecksumFlag(long struct) { return memGetInt(struct + ZSTDFrameParameters.CHECKSUMFLAG); }
    /** Unsafe version of {@link #noDictIDFlag}. */
    public static int nnoDictIDFlag(long struct) { return memGetInt(struct + ZSTDFrameParameters.NODICTIDFLAG); }

    /** Unsafe version of {@link #contentSizeFlag(boolean) contentSizeFlag}. */
    public static void ncontentSizeFlag(long struct, int value) { memPutInt(struct + ZSTDFrameParameters.CONTENTSIZEFLAG, value); }
    /** Unsafe version of {@link #checksumFlag(boolean) checksumFlag}. */
    public static void nchecksumFlag(long struct, int value) { memPutInt(struct + ZSTDFrameParameters.CHECKSUMFLAG, value); }
    /** Unsafe version of {@link #noDictIDFlag(boolean) noDictIDFlag}. */
    public static void nnoDictIDFlag(long struct, int value) { memPutInt(struct + ZSTDFrameParameters.NODICTIDFLAG, value); }

    // -----------------------------------

    /** An array of {@link ZSTDFrameParameters} structs. */
    public static class Buffer extends StructBuffer<ZSTDFrameParameters, Buffer> implements NativeResource {

        /**
         * Creates a new {@link ZSTDFrameParameters.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDFrameParameters#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDFrameParameters newInstance(long address) {
            return new ZSTDFrameParameters(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code contentSizeFlag} field. */
        @NativeType("unsigned")
        public boolean contentSizeFlag() { return ZSTDFrameParameters.ncontentSizeFlag(address()) != 0; }
        /** Returns the value of the {@code checksumFlag} field. */
        @NativeType("unsigned")
        public boolean checksumFlag() { return ZSTDFrameParameters.nchecksumFlag(address()) != 0; }
        /** Returns the value of the {@code noDictIDFlag} field. */
        @NativeType("unsigned")
        public boolean noDictIDFlag() { return ZSTDFrameParameters.nnoDictIDFlag(address()) != 0; }

        /** Sets the specified value to the {@code contentSizeFlag} field. */
        public ZSTDFrameParameters.Buffer contentSizeFlag(@NativeType("unsigned") boolean value) { ZSTDFrameParameters.ncontentSizeFlag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code checksumFlag} field. */
        public ZSTDFrameParameters.Buffer checksumFlag(@NativeType("unsigned") boolean value) { ZSTDFrameParameters.nchecksumFlag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code noDictIDFlag} field. */
        public ZSTDFrameParameters.Buffer noDictIDFlag(@NativeType("unsigned") boolean value) { ZSTDFrameParameters.nnoDictIDFlag(address(), value ? 1 : 0); return this; }

    }

}