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
 * <li>{@code windowLog} &ndash; largest match distance : larger == more compression, more memory needed during decompression</li>
 * <li>{@code chainLog} &ndash; fully searched segment : larger == more compression, slower, more memory (useless for fast)</li>
 * <li>{@code hashLog} &ndash; dispatch table : larger == faster, more memory</li>
 * <li>{@code searchLog} &ndash; nb of searches : larger == more compression, slower</li>
 * <li>{@code searchLength} &ndash; match length searched : larger == faster decompression, sometimes less compression</li>
 * <li>{@code targetLength} &ndash; acceptable match size for optimal parser (only) : larger == more compression, slower</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ZSTD_compressionParameters {
 *     unsigned windowLog;
 *     unsigned chainLog;
 *     unsigned hashLog;
 *     unsigned searchLog;
 *     unsigned searchLength;
 *     unsigned targetLength;
 *     ZSTD_strategy strategy;
 * }</pre></code>
 */
@NativeType("struct ZSTD_compressionParameters")
public class ZSTDCompressionParameters extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WINDOWLOG,
        CHAINLOG,
        HASHLOG,
        SEARCHLOG,
        SEARCHLENGTH,
        TARGETLENGTH,
        STRATEGY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WINDOWLOG = layout.offsetof(0);
        CHAINLOG = layout.offsetof(1);
        HASHLOG = layout.offsetof(2);
        SEARCHLOG = layout.offsetof(3);
        SEARCHLENGTH = layout.offsetof(4);
        TARGETLENGTH = layout.offsetof(5);
        STRATEGY = layout.offsetof(6);
    }

    ZSTDCompressionParameters(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link ZSTDCompressionParameters} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDCompressionParameters(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code windowLog} field. */
    @NativeType("unsigned")
    public int windowLog() { return nwindowLog(address()); }
    /** Returns the value of the {@code chainLog} field. */
    @NativeType("unsigned")
    public int chainLog() { return nchainLog(address()); }
    /** Returns the value of the {@code hashLog} field. */
    @NativeType("unsigned")
    public int hashLog() { return nhashLog(address()); }
    /** Returns the value of the {@code searchLog} field. */
    @NativeType("unsigned")
    public int searchLog() { return nsearchLog(address()); }
    /** Returns the value of the {@code searchLength} field. */
    @NativeType("unsigned")
    public int searchLength() { return nsearchLength(address()); }
    /** Returns the value of the {@code targetLength} field. */
    @NativeType("unsigned")
    public int targetLength() { return ntargetLength(address()); }
    /** Returns the value of the {@code strategy} field. */
    @NativeType("ZSTD_strategy")
    public int strategy() { return nstrategy(address()); }

    /** Sets the specified value to the {@code windowLog} field. */
    public ZSTDCompressionParameters windowLog(@NativeType("unsigned") int value) { nwindowLog(address(), value); return this; }
    /** Sets the specified value to the {@code chainLog} field. */
    public ZSTDCompressionParameters chainLog(@NativeType("unsigned") int value) { nchainLog(address(), value); return this; }
    /** Sets the specified value to the {@code hashLog} field. */
    public ZSTDCompressionParameters hashLog(@NativeType("unsigned") int value) { nhashLog(address(), value); return this; }
    /** Sets the specified value to the {@code searchLog} field. */
    public ZSTDCompressionParameters searchLog(@NativeType("unsigned") int value) { nsearchLog(address(), value); return this; }
    /** Sets the specified value to the {@code searchLength} field. */
    public ZSTDCompressionParameters searchLength(@NativeType("unsigned") int value) { nsearchLength(address(), value); return this; }
    /** Sets the specified value to the {@code targetLength} field. */
    public ZSTDCompressionParameters targetLength(@NativeType("unsigned") int value) { ntargetLength(address(), value); return this; }
    /** Sets the specified value to the {@code strategy} field. */
    public ZSTDCompressionParameters strategy(@NativeType("ZSTD_strategy") int value) { nstrategy(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ZSTDCompressionParameters set(
        int windowLog,
        int chainLog,
        int hashLog,
        int searchLog,
        int searchLength,
        int targetLength,
        int strategy
    ) {
        windowLog(windowLog);
        chainLog(chainLog);
        hashLog(hashLog);
        searchLog(searchLog);
        searchLength(searchLength);
        targetLength(targetLength);
        strategy(strategy);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ZSTDCompressionParameters set(ZSTDCompressionParameters src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link ZSTDCompressionParameters} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDCompressionParameters malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link ZSTDCompressionParameters} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDCompressionParameters calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link ZSTDCompressionParameters} instance allocated with {@link BufferUtils}. */
    public static ZSTDCompressionParameters create() {
        return new ZSTDCompressionParameters(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link ZSTDCompressionParameters} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static ZSTDCompressionParameters create(long address) {
        return address == NULL ? null : new ZSTDCompressionParameters(address, null);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link ZSTDCompressionParameters.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link ZSTDCompressionParameters} instance allocated on the thread-local {@link MemoryStack}. */
    public static ZSTDCompressionParameters mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link ZSTDCompressionParameters} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ZSTDCompressionParameters callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDCompressionParameters mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDCompressionParameters callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #windowLog}. */
    public static int nwindowLog(long struct) { return memGetInt(struct + ZSTDCompressionParameters.WINDOWLOG); }
    /** Unsafe version of {@link #chainLog}. */
    public static int nchainLog(long struct) { return memGetInt(struct + ZSTDCompressionParameters.CHAINLOG); }
    /** Unsafe version of {@link #hashLog}. */
    public static int nhashLog(long struct) { return memGetInt(struct + ZSTDCompressionParameters.HASHLOG); }
    /** Unsafe version of {@link #searchLog}. */
    public static int nsearchLog(long struct) { return memGetInt(struct + ZSTDCompressionParameters.SEARCHLOG); }
    /** Unsafe version of {@link #searchLength}. */
    public static int nsearchLength(long struct) { return memGetInt(struct + ZSTDCompressionParameters.SEARCHLENGTH); }
    /** Unsafe version of {@link #targetLength}. */
    public static int ntargetLength(long struct) { return memGetInt(struct + ZSTDCompressionParameters.TARGETLENGTH); }
    /** Unsafe version of {@link #strategy}. */
    public static int nstrategy(long struct) { return memGetInt(struct + ZSTDCompressionParameters.STRATEGY); }

    /** Unsafe version of {@link #windowLog(int) windowLog}. */
    public static void nwindowLog(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.WINDOWLOG, value); }
    /** Unsafe version of {@link #chainLog(int) chainLog}. */
    public static void nchainLog(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.CHAINLOG, value); }
    /** Unsafe version of {@link #hashLog(int) hashLog}. */
    public static void nhashLog(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.HASHLOG, value); }
    /** Unsafe version of {@link #searchLog(int) searchLog}. */
    public static void nsearchLog(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.SEARCHLOG, value); }
    /** Unsafe version of {@link #searchLength(int) searchLength}. */
    public static void nsearchLength(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.SEARCHLENGTH, value); }
    /** Unsafe version of {@link #targetLength(int) targetLength}. */
    public static void ntargetLength(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.TARGETLENGTH, value); }
    /** Unsafe version of {@link #strategy(int) strategy}. */
    public static void nstrategy(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.STRATEGY, value); }

    // -----------------------------------

    /** An array of {@link ZSTDCompressionParameters} structs. */
    public static class Buffer extends StructBuffer<ZSTDCompressionParameters, Buffer> implements NativeResource {

        /**
         * Creates a new {@link ZSTDCompressionParameters.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDCompressionParameters#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDCompressionParameters newInstance(long address) {
            return new ZSTDCompressionParameters(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code windowLog} field. */
        @NativeType("unsigned")
        public int windowLog() { return ZSTDCompressionParameters.nwindowLog(address()); }
        /** Returns the value of the {@code chainLog} field. */
        @NativeType("unsigned")
        public int chainLog() { return ZSTDCompressionParameters.nchainLog(address()); }
        /** Returns the value of the {@code hashLog} field. */
        @NativeType("unsigned")
        public int hashLog() { return ZSTDCompressionParameters.nhashLog(address()); }
        /** Returns the value of the {@code searchLog} field. */
        @NativeType("unsigned")
        public int searchLog() { return ZSTDCompressionParameters.nsearchLog(address()); }
        /** Returns the value of the {@code searchLength} field. */
        @NativeType("unsigned")
        public int searchLength() { return ZSTDCompressionParameters.nsearchLength(address()); }
        /** Returns the value of the {@code targetLength} field. */
        @NativeType("unsigned")
        public int targetLength() { return ZSTDCompressionParameters.ntargetLength(address()); }
        /** Returns the value of the {@code strategy} field. */
        @NativeType("ZSTD_strategy")
        public int strategy() { return ZSTDCompressionParameters.nstrategy(address()); }

        /** Sets the specified value to the {@code windowLog} field. */
        public ZSTDCompressionParameters.Buffer windowLog(@NativeType("unsigned") int value) { ZSTDCompressionParameters.nwindowLog(address(), value); return this; }
        /** Sets the specified value to the {@code chainLog} field. */
        public ZSTDCompressionParameters.Buffer chainLog(@NativeType("unsigned") int value) { ZSTDCompressionParameters.nchainLog(address(), value); return this; }
        /** Sets the specified value to the {@code hashLog} field. */
        public ZSTDCompressionParameters.Buffer hashLog(@NativeType("unsigned") int value) { ZSTDCompressionParameters.nhashLog(address(), value); return this; }
        /** Sets the specified value to the {@code searchLog} field. */
        public ZSTDCompressionParameters.Buffer searchLog(@NativeType("unsigned") int value) { ZSTDCompressionParameters.nsearchLog(address(), value); return this; }
        /** Sets the specified value to the {@code searchLength} field. */
        public ZSTDCompressionParameters.Buffer searchLength(@NativeType("unsigned") int value) { ZSTDCompressionParameters.nsearchLength(address(), value); return this; }
        /** Sets the specified value to the {@code targetLength} field. */
        public ZSTDCompressionParameters.Buffer targetLength(@NativeType("unsigned") int value) { ZSTDCompressionParameters.ntargetLength(address(), value); return this; }
        /** Sets the specified value to the {@code strategy} field. */
        public ZSTDCompressionParameters.Buffer strategy(@NativeType("ZSTD_strategy") int value) { ZSTDCompressionParameters.nstrategy(address(), value); return this; }

    }

}