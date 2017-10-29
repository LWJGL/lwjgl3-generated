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
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ZSTD_parameters {
 *     {@link ZSTDCompressionParameters ZSTD_compressionParameters} cParams;
 *     {@link ZSTDFrameParameters ZSTD_frameParameters} fParams;
 * }</pre></code>
 */
@NativeType("struct ZSTD_parameters")
public class ZSTDParameters extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CPARAMS,
        FPARAMS;

    static {
        Layout layout = __struct(
            __member(ZSTDCompressionParameters.SIZEOF, ZSTDCompressionParameters.ALIGNOF),
            __member(ZSTDFrameParameters.SIZEOF, ZSTDFrameParameters.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CPARAMS = layout.offsetof(0);
        FPARAMS = layout.offsetof(1);
    }

    ZSTDParameters(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link ZSTDParameters} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDParameters(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ZSTDCompressionParameters} view of the {@code cParams} field. */
    @NativeType("ZSTD_compressionParameters")
    public ZSTDCompressionParameters cParams() { return ncParams(address()); }
    /** Returns a {@link ZSTDFrameParameters} view of the {@code fParams} field. */
    @NativeType("ZSTD_frameParameters")
    public ZSTDFrameParameters fParams() { return nfParams(address()); }

    /** Copies the specified {@link ZSTDCompressionParameters} to the {@code cParams} field. */
    public ZSTDParameters cParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters value) { ncParams(address(), value); return this; }
    /** Copies the specified {@link ZSTDFrameParameters} to the {@code fParams} field. */
    public ZSTDParameters fParams(@NativeType("ZSTD_frameParameters") ZSTDFrameParameters value) { nfParams(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ZSTDParameters set(
        ZSTDCompressionParameters cParams,
        ZSTDFrameParameters fParams
    ) {
        cParams(cParams);
        fParams(fParams);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ZSTDParameters set(ZSTDParameters src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link ZSTDParameters} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDParameters malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link ZSTDParameters} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDParameters calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link ZSTDParameters} instance allocated with {@link BufferUtils}. */
    public static ZSTDParameters create() {
        return new ZSTDParameters(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link ZSTDParameters} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static ZSTDParameters create(long address) {
        return address == NULL ? null : new ZSTDParameters(address, null);
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link ZSTDParameters.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link ZSTDParameters} instance allocated on the thread-local {@link MemoryStack}. */
    public static ZSTDParameters mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link ZSTDParameters} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ZSTDParameters callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link ZSTDParameters} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDParameters mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDParameters} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDParameters callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cParams}. */
    public static ZSTDCompressionParameters ncParams(long struct) { return ZSTDCompressionParameters.create(struct + ZSTDParameters.CPARAMS); }
    /** Unsafe version of {@link #fParams}. */
    public static ZSTDFrameParameters nfParams(long struct) { return ZSTDFrameParameters.create(struct + ZSTDParameters.FPARAMS); }

    /** Unsafe version of {@link #cParams(ZSTDCompressionParameters) cParams}. */
    public static void ncParams(long struct, ZSTDCompressionParameters value) { memCopy(value.address(), struct + ZSTDParameters.CPARAMS, ZSTDCompressionParameters.SIZEOF); }
    /** Unsafe version of {@link #fParams(ZSTDFrameParameters) fParams}. */
    public static void nfParams(long struct, ZSTDFrameParameters value) { memCopy(value.address(), struct + ZSTDParameters.FPARAMS, ZSTDFrameParameters.SIZEOF); }

    // -----------------------------------

    /** An array of {@link ZSTDParameters} structs. */
    public static class Buffer extends StructBuffer<ZSTDParameters, Buffer> implements NativeResource {

        /**
         * Creates a new {@link ZSTDParameters.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDParameters#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDParameters newInstance(long address) {
            return new ZSTDParameters(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ZSTDCompressionParameters} view of the {@code cParams} field. */
        @NativeType("ZSTD_compressionParameters")
        public ZSTDCompressionParameters cParams() { return ZSTDParameters.ncParams(address()); }
        /** Returns a {@link ZSTDFrameParameters} view of the {@code fParams} field. */
        @NativeType("ZSTD_frameParameters")
        public ZSTDFrameParameters fParams() { return ZSTDParameters.nfParams(address()); }

        /** Copies the specified {@link ZSTDCompressionParameters} to the {@code cParams} field. */
        public ZSTDParameters.Buffer cParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters value) { ZSTDParameters.ncParams(address(), value); return this; }
        /** Copies the specified {@link ZSTDFrameParameters} to the {@code fParams} field. */
        public ZSTDParameters.Buffer fParams(@NativeType("ZSTD_frameParameters") ZSTDFrameParameters value) { ZSTDParameters.nfParams(address(), value); return this; }

    }

}