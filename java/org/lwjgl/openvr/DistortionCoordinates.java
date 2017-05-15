/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Used to return the post-distortion UVs for each color channel.
 * 
 * <p>UVs range from 0 to 1 with 0,0 in the upper left corner of the source render target. The 0,0 to 1,1 range covers a single eye.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code rfRed} &ndash; the UVs for the red channel</li>
 * <li>{@code rfGreen} &ndash; the UVs for the green channel</li>
 * <li>{@code rfBlue} &ndash; the UVs for the blue channel</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct DistortionCoordinates_t {
 *     float rfRed[2];
 *     float rfGreen[2];
 *     float rfBlue[2];
 * }</pre></code>
 */
public class DistortionCoordinates extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RFRED,
        RFGREEN,
        RFBLUE;

    static {
        Layout layout = __struct(
            __array(4, 2),
            __array(4, 2),
            __array(4, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RFRED = layout.offsetof(0);
        RFGREEN = layout.offsetof(1);
        RFBLUE = layout.offsetof(2);
    }

    DistortionCoordinates(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link DistortionCoordinates} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DistortionCoordinates(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FloatBuffer} view of the {@code rfRed} field. */
    public FloatBuffer rfRed() { return nrfRed(address()); }
    /** Returns the value at the specified index of the {@code rfRed} field. */
    public float rfRed(int index) { return nrfRed(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code rfGreen} field. */
    public FloatBuffer rfGreen() { return nrfGreen(address()); }
    /** Returns the value at the specified index of the {@code rfGreen} field. */
    public float rfGreen(int index) { return nrfGreen(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code rfBlue} field. */
    public FloatBuffer rfBlue() { return nrfBlue(address()); }
    /** Returns the value at the specified index of the {@code rfBlue} field. */
    public float rfBlue(int index) { return nrfBlue(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code rfRed} field. */
    public DistortionCoordinates rfRed(FloatBuffer value) { nrfRed(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code rfRed} field. */
    public DistortionCoordinates rfRed(int index, float value) { nrfRed(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code rfGreen} field. */
    public DistortionCoordinates rfGreen(FloatBuffer value) { nrfGreen(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code rfGreen} field. */
    public DistortionCoordinates rfGreen(int index, float value) { nrfGreen(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code rfBlue} field. */
    public DistortionCoordinates rfBlue(FloatBuffer value) { nrfBlue(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code rfBlue} field. */
    public DistortionCoordinates rfBlue(int index, float value) { nrfBlue(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public DistortionCoordinates set(
        FloatBuffer rfRed,
        FloatBuffer rfGreen,
        FloatBuffer rfBlue
    ) {
        rfRed(rfRed);
        rfGreen(rfGreen);
        rfBlue(rfBlue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public DistortionCoordinates set(DistortionCoordinates src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link DistortionCoordinates} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DistortionCoordinates malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link DistortionCoordinates} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DistortionCoordinates calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link DistortionCoordinates} instance allocated with {@link BufferUtils}. */
    public static DistortionCoordinates create() {
        return new DistortionCoordinates(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link DistortionCoordinates} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static DistortionCoordinates create(long address) {
        return address == NULL ? null : new DistortionCoordinates(address, null);
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link DistortionCoordinates.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link DistortionCoordinates} instance allocated on the thread-local {@link MemoryStack}. */
    public static DistortionCoordinates mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link DistortionCoordinates} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static DistortionCoordinates callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link DistortionCoordinates} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DistortionCoordinates mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link DistortionCoordinates} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DistortionCoordinates callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rfRed}. */
    public static FloatBuffer nrfRed(long struct) { return memFloatBuffer(struct + DistortionCoordinates.RFRED, 2); }
    /** Unsafe version of {@link #rfRed(int) rfRed}. */
    public static float nrfRed(long struct, int index) {
        if (CHECKS) { check(index, 2); }
        return memGetFloat(struct + DistortionCoordinates.RFRED + index * 4);
    }
    /** Unsafe version of {@link #rfGreen}. */
    public static FloatBuffer nrfGreen(long struct) { return memFloatBuffer(struct + DistortionCoordinates.RFGREEN, 2); }
    /** Unsafe version of {@link #rfGreen(int) rfGreen}. */
    public static float nrfGreen(long struct, int index) {
        if (CHECKS) { check(index, 2); }
        return memGetFloat(struct + DistortionCoordinates.RFGREEN + index * 4);
    }
    /** Unsafe version of {@link #rfBlue}. */
    public static FloatBuffer nrfBlue(long struct) { return memFloatBuffer(struct + DistortionCoordinates.RFBLUE, 2); }
    /** Unsafe version of {@link #rfBlue(int) rfBlue}. */
    public static float nrfBlue(long struct, int index) {
        if (CHECKS) { check(index, 2); }
        return memGetFloat(struct + DistortionCoordinates.RFBLUE + index * 4);
    }

    /** Unsafe version of {@link #rfRed(FloatBuffer) rfRed}. */
    public static void nrfRed(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + DistortionCoordinates.RFRED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #rfRed(int, float) rfRed}. */
    public static void nrfRed(long struct, int index, float value) {
        if (CHECKS) { check(index, 2); }
        memPutFloat(struct + DistortionCoordinates.RFRED + index * 4, value);
    }
    /** Unsafe version of {@link #rfGreen(FloatBuffer) rfGreen}. */
    public static void nrfGreen(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + DistortionCoordinates.RFGREEN, value.remaining() * 4);
    }
    /** Unsafe version of {@link #rfGreen(int, float) rfGreen}. */
    public static void nrfGreen(long struct, int index, float value) {
        if (CHECKS) { check(index, 2); }
        memPutFloat(struct + DistortionCoordinates.RFGREEN + index * 4, value);
    }
    /** Unsafe version of {@link #rfBlue(FloatBuffer) rfBlue}. */
    public static void nrfBlue(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + DistortionCoordinates.RFBLUE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #rfBlue(int, float) rfBlue}. */
    public static void nrfBlue(long struct, int index, float value) {
        if (CHECKS) { check(index, 2); }
        memPutFloat(struct + DistortionCoordinates.RFBLUE + index * 4, value);
    }

    // -----------------------------------

    /** An array of {@link DistortionCoordinates} structs. */
    public static class Buffer extends StructBuffer<DistortionCoordinates, Buffer> implements NativeResource {

        /**
         * Creates a new {@link DistortionCoordinates.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DistortionCoordinates#SIZEOF}, and its mark will be undefined.
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
        protected DistortionCoordinates newInstance(long address) {
            return new DistortionCoordinates(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link FloatBuffer} view of the {@code rfRed} field. */
        public FloatBuffer rfRed() { return DistortionCoordinates.nrfRed(address()); }
        /** Returns the value at the specified index of the {@code rfRed} field. */
        public float rfRed(int index) { return DistortionCoordinates.nrfRed(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code rfGreen} field. */
        public FloatBuffer rfGreen() { return DistortionCoordinates.nrfGreen(address()); }
        /** Returns the value at the specified index of the {@code rfGreen} field. */
        public float rfGreen(int index) { return DistortionCoordinates.nrfGreen(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code rfBlue} field. */
        public FloatBuffer rfBlue() { return DistortionCoordinates.nrfBlue(address()); }
        /** Returns the value at the specified index of the {@code rfBlue} field. */
        public float rfBlue(int index) { return DistortionCoordinates.nrfBlue(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code rfRed} field. */
        public DistortionCoordinates.Buffer rfRed(FloatBuffer value) { DistortionCoordinates.nrfRed(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code rfRed} field. */
        public DistortionCoordinates.Buffer rfRed(int index, float value) { DistortionCoordinates.nrfRed(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code rfGreen} field. */
        public DistortionCoordinates.Buffer rfGreen(FloatBuffer value) { DistortionCoordinates.nrfGreen(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code rfGreen} field. */
        public DistortionCoordinates.Buffer rfGreen(int index, float value) { DistortionCoordinates.nrfGreen(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code rfBlue} field. */
        public DistortionCoordinates.Buffer rfBlue(FloatBuffer value) { DistortionCoordinates.nrfBlue(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code rfBlue} field. */
        public DistortionCoordinates.Buffer rfBlue(int index, float value) { DistortionCoordinates.nrfBlue(address(), index, value); return this; }

    }

}