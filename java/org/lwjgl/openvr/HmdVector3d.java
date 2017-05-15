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
 * <code><pre>
 * struct HmdVector3d_t {
 *     double v[3];
 * }</pre></code>
 */
public class HmdVector3d extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        V;

    static {
        Layout layout = __struct(
            __array(8, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        V = layout.offsetof(0);
    }

    HmdVector3d(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link HmdVector3d} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdVector3d(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link DoubleBuffer} view of the {@code v} field. */
    public DoubleBuffer v() { return nv(address()); }
    /** Returns the value at the specified index of the {@code v} field. */
    public double v(int index) { return nv(address(), index); }

    /** Copies the specified {@link DoubleBuffer} to the {@code v} field. */
    public HmdVector3d v(DoubleBuffer value) { nv(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code v} field. */
    public HmdVector3d v(int index, double value) { nv(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HmdVector3d set(HmdVector3d src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link HmdVector3d} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdVector3d malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link HmdVector3d} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdVector3d calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link HmdVector3d} instance allocated with {@link BufferUtils}. */
    public static HmdVector3d create() {
        return new HmdVector3d(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link HmdVector3d} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static HmdVector3d create(long address) {
        return address == NULL ? null : new HmdVector3d(address, null);
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link HmdVector3d.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link HmdVector3d} instance allocated on the thread-local {@link MemoryStack}. */
    public static HmdVector3d mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link HmdVector3d} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static HmdVector3d callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link HmdVector3d} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdVector3d mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link HmdVector3d} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdVector3d callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #v}. */
    public static DoubleBuffer nv(long struct) { return memDoubleBuffer(struct + HmdVector3d.V, 3); }
    /** Unsafe version of {@link #v(int) v}. */
    public static double nv(long struct, int index) {
        if (CHECKS) { check(index, 3); }
        return memGetDouble(struct + HmdVector3d.V + index * 8);
    }

    /** Unsafe version of {@link #v(DoubleBuffer) v}. */
    public static void nv(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + HmdVector3d.V, value.remaining() * 8);
    }
    /** Unsafe version of {@link #v(int, double) v}. */
    public static void nv(long struct, int index, double value) {
        if (CHECKS) { check(index, 3); }
        memPutDouble(struct + HmdVector3d.V + index * 8, value);
    }

    // -----------------------------------

    /** An array of {@link HmdVector3d} structs. */
    public static class Buffer extends StructBuffer<HmdVector3d, Buffer> implements NativeResource {

        /**
         * Creates a new {@link HmdVector3d.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdVector3d#SIZEOF}, and its mark will be undefined.
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
        protected HmdVector3d newInstance(long address) {
            return new HmdVector3d(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link DoubleBuffer} view of the {@code v} field. */
        public DoubleBuffer v() { return HmdVector3d.nv(address()); }
        /** Returns the value at the specified index of the {@code v} field. */
        public double v(int index) { return HmdVector3d.nv(address(), index); }

        /** Copies the specified {@link DoubleBuffer} to the {@code v} field. */
        public HmdVector3d.Buffer v(DoubleBuffer value) { HmdVector3d.nv(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code v} field. */
        public HmdVector3d.Buffer v(int index, double value) { HmdVector3d.nv(address(), index, value); return this; }

    }

}