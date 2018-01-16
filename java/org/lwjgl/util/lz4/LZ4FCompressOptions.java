/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code stableSrc} &ndash; {@code 1 == src} content will remain present on future calls to {@code LZ4F_compress()}; skip copying {@code src} content within {@code tmp} buffer</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct LZ4F_compressOptions_t {
 *     unsigned stableSrc;
 *     unsigned reserved[3];
 * }</pre></code>
 */
@NativeType("struct LZ4F_compressOptions_t")
public class LZ4FCompressOptions extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STABLESRC,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STABLESRC = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
    }

    LZ4FCompressOptions(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link LZ4FCompressOptions} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4FCompressOptions(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code stableSrc} field. */
    @NativeType("unsigned")
    public int stableSrc() { return nstableSrc(address()); }
    /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned[3]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** Returns the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Sets the specified value to the {@code stableSrc} field. */
    public LZ4FCompressOptions stableSrc(@NativeType("unsigned") int value) { nstableSrc(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public LZ4FCompressOptions reserved(@NativeType("unsigned[3]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public LZ4FCompressOptions reserved(int index, @NativeType("unsigned") int value) { nreserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public LZ4FCompressOptions set(
        int stableSrc,
        IntBuffer reserved
    ) {
        stableSrc(stableSrc);
        reserved(reserved);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LZ4FCompressOptions set(LZ4FCompressOptions src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link LZ4FCompressOptions} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LZ4FCompressOptions malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link LZ4FCompressOptions} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LZ4FCompressOptions calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link LZ4FCompressOptions} instance allocated with {@link BufferUtils}. */
    public static LZ4FCompressOptions create() {
        return new LZ4FCompressOptions(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link LZ4FCompressOptions} instance for the specified memory address. */
    public static LZ4FCompressOptions create(long address) {
        return new LZ4FCompressOptions(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4FCompressOptions createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link LZ4FCompressOptions.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FCompressOptions.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FCompressOptions.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FCompressOptions.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FCompressOptions.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FCompressOptions.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link LZ4FCompressOptions.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4FCompressOptions.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4FCompressOptions.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link LZ4FCompressOptions} instance allocated on the thread-local {@link MemoryStack}. */
    public static LZ4FCompressOptions mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link LZ4FCompressOptions} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static LZ4FCompressOptions callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link LZ4FCompressOptions} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FCompressOptions mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link LZ4FCompressOptions} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FCompressOptions callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LZ4FCompressOptions.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FCompressOptions.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link LZ4FCompressOptions.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FCompressOptions.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link LZ4FCompressOptions.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FCompressOptions.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FCompressOptions.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FCompressOptions.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #stableSrc}. */
    public static int nstableSrc(long struct) { return memGetInt(struct + LZ4FCompressOptions.STABLESRC); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + LZ4FCompressOptions.RESERVED, 3); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        if (CHECKS) { check(index, 3); }
        return memGetInt(struct + LZ4FCompressOptions.RESERVED + index * 4);
    }

    /** Unsafe version of {@link #stableSrc(int) stableSrc}. */
    public static void nstableSrc(long struct, int value) { memPutInt(struct + LZ4FCompressOptions.STABLESRC, value); }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + LZ4FCompressOptions.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        if (CHECKS) { check(index, 3); }
        memPutInt(struct + LZ4FCompressOptions.RESERVED + index * 4, value);
    }

    // -----------------------------------

    /** An array of {@link LZ4FCompressOptions} structs. */
    public static class Buffer extends StructBuffer<LZ4FCompressOptions, Buffer> implements NativeResource {

        /**
         * Creates a new {@link LZ4FCompressOptions.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4FCompressOptions#SIZEOF}, and its mark will be undefined.
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
        protected LZ4FCompressOptions newInstance(long address) {
            return new LZ4FCompressOptions(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code stableSrc} field. */
        @NativeType("unsigned")
        public int stableSrc() { return LZ4FCompressOptions.nstableSrc(address()); }
        /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned[3]")
        public IntBuffer reserved() { return LZ4FCompressOptions.nreserved(address()); }
        /** Returns the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned")
        public int reserved(int index) { return LZ4FCompressOptions.nreserved(address(), index); }

        /** Sets the specified value to the {@code stableSrc} field. */
        public LZ4FCompressOptions.Buffer stableSrc(@NativeType("unsigned") int value) { LZ4FCompressOptions.nstableSrc(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public LZ4FCompressOptions.Buffer reserved(@NativeType("unsigned[3]") IntBuffer value) { LZ4FCompressOptions.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public LZ4FCompressOptions.Buffer reserved(int index, @NativeType("unsigned") int value) { LZ4FCompressOptions.nreserved(address(), index, value); return this; }

    }

}