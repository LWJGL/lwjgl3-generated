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
 * <h3>Layout</h3>
 * 
 * <pre><code>struct HmdMatrix34_t {
    float m[12];
}</code></pre>
 */
public class HmdMatrix34 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M;

    static {
        Layout layout = __struct(
            __array(4, 12)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M = layout.offsetof(0);
    }

    HmdMatrix34(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link HmdMatrix34} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdMatrix34(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FloatBuffer} view of the {@code m} field. */
    public FloatBuffer m() { return nm(address()); }
    /** Returns the value at the specified index of the {@code m} field. */
    public float m(int index) { return nm(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code m} field. */
    public HmdMatrix34 m(FloatBuffer value) { nm(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m} field. */
    public HmdMatrix34 m(int index, float value) { nm(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HmdMatrix34 set(HmdMatrix34 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link HmdMatrix34} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdMatrix34 malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link HmdMatrix34} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdMatrix34 calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link HmdMatrix34} instance allocated with {@link BufferUtils}. */
    public static HmdMatrix34 create() {
        return new HmdMatrix34(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link HmdMatrix34} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static HmdMatrix34 create(long address) {
        return address == NULL ? null : new HmdMatrix34(address, null);
    }

    /**
     * Returns a new {@link HmdMatrix34.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdMatrix34.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdMatrix34.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link HmdMatrix34.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link HmdMatrix34} instance allocated on the thread-local {@link MemoryStack}. */
    public static HmdMatrix34 mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link HmdMatrix34} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static HmdMatrix34 callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link HmdMatrix34} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdMatrix34 mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link HmdMatrix34} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdMatrix34 callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link HmdMatrix34.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdMatrix34.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdMatrix34.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdMatrix34.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m}. */
    public static FloatBuffer nm(long struct) { return memFloatBuffer(struct + HmdMatrix34.M, 12); }
    /** Unsafe version of {@link #m(int) m}. */
    public static float nm(long struct, int index) {
        if (CHECKS) { check(index, 12); }
        return memGetFloat(struct + HmdMatrix34.M + index * 4);
    }

    /** Unsafe version of {@link #m(FloatBuffer) m}. */
    public static void nm(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 12); }
        memCopy(memAddress(value), struct + HmdMatrix34.M, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m(int, float) m}. */
    public static void nm(long struct, int index, float value) {
        if (CHECKS) { check(index, 12); }
        memPutFloat(struct + HmdMatrix34.M + index * 4, value);
    }

    // -----------------------------------

    /** An array of {@link HmdMatrix34} structs. */
    public static class Buffer extends StructBuffer<HmdMatrix34, Buffer> implements NativeResource {

        /**
         * Creates a new {@link HmdMatrix34.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdMatrix34#SIZEOF}, and its mark will be undefined.
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
        protected HmdMatrix34 newInstance(long address) {
            return new HmdMatrix34(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link FloatBuffer} view of the {@code m} field. */
        public FloatBuffer m() { return HmdMatrix34.nm(address()); }
        /** Returns the value at the specified index of the {@code m} field. */
        public float m(int index) { return HmdMatrix34.nm(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code m} field. */
        public HmdMatrix34.Buffer m(FloatBuffer value) { HmdMatrix34.nm(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m} field. */
        public HmdMatrix34.Buffer m(int index, float value) { HmdMatrix34.nm(address(), index, value); return this; }

    }

}