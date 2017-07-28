/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct HmdQuaternion_t {
 *     double w;
 *     double x;
 *     double y;
 *     double z;
 * }</pre></code>
 */
@NativeType("struct HmdQuaternion_t")
public class HmdQuaternion extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        W,
        X,
        Y,
        Z;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        W = layout.offsetof(0);
        X = layout.offsetof(1);
        Y = layout.offsetof(2);
        Z = layout.offsetof(3);
    }

    HmdQuaternion(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link HmdQuaternion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdQuaternion(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code w} field. */
    public double w() { return nw(address()); }
    /** Returns the value of the {@code x} field. */
    public double x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public double y() { return ny(address()); }
    /** Returns the value of the {@code z} field. */
    public double z() { return nz(address()); }

    /** Sets the specified value to the {@code w} field. */
    public HmdQuaternion w(double value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public HmdQuaternion x(double value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public HmdQuaternion y(double value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public HmdQuaternion z(double value) { nz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public HmdQuaternion set(
        double w,
        double x,
        double y,
        double z
    ) {
        w(w);
        x(x);
        y(y);
        z(z);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HmdQuaternion set(HmdQuaternion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link HmdQuaternion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdQuaternion malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link HmdQuaternion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdQuaternion calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link HmdQuaternion} instance allocated with {@link BufferUtils}. */
    public static HmdQuaternion create() {
        return new HmdQuaternion(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link HmdQuaternion} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static HmdQuaternion create(long address) {
        return address == NULL ? null : new HmdQuaternion(address, null);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link HmdQuaternion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link HmdQuaternion} instance allocated on the thread-local {@link MemoryStack}. */
    public static HmdQuaternion mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link HmdQuaternion} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static HmdQuaternion callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link HmdQuaternion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdQuaternion mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link HmdQuaternion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdQuaternion callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #w}. */
    public static double nw(long struct) { return memGetDouble(struct + HmdQuaternion.W); }
    /** Unsafe version of {@link #x}. */
    public static double nx(long struct) { return memGetDouble(struct + HmdQuaternion.X); }
    /** Unsafe version of {@link #y}. */
    public static double ny(long struct) { return memGetDouble(struct + HmdQuaternion.Y); }
    /** Unsafe version of {@link #z}. */
    public static double nz(long struct) { return memGetDouble(struct + HmdQuaternion.Z); }

    /** Unsafe version of {@link #w(double) w}. */
    public static void nw(long struct, double value) { memPutDouble(struct + HmdQuaternion.W, value); }
    /** Unsafe version of {@link #x(double) x}. */
    public static void nx(long struct, double value) { memPutDouble(struct + HmdQuaternion.X, value); }
    /** Unsafe version of {@link #y(double) y}. */
    public static void ny(long struct, double value) { memPutDouble(struct + HmdQuaternion.Y, value); }
    /** Unsafe version of {@link #z(double) z}. */
    public static void nz(long struct, double value) { memPutDouble(struct + HmdQuaternion.Z, value); }

    // -----------------------------------

    /** An array of {@link HmdQuaternion} structs. */
    public static class Buffer extends StructBuffer<HmdQuaternion, Buffer> implements NativeResource {

        /**
         * Creates a new {@link HmdQuaternion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdQuaternion#SIZEOF}, and its mark will be undefined.
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
        protected HmdQuaternion newInstance(long address) {
            return new HmdQuaternion(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code w} field. */
        public double w() { return HmdQuaternion.nw(address()); }
        /** Returns the value of the {@code x} field. */
        public double x() { return HmdQuaternion.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public double y() { return HmdQuaternion.ny(address()); }
        /** Returns the value of the {@code z} field. */
        public double z() { return HmdQuaternion.nz(address()); }

        /** Sets the specified value to the {@code w} field. */
        public HmdQuaternion.Buffer w(double value) { HmdQuaternion.nw(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public HmdQuaternion.Buffer x(double value) { HmdQuaternion.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public HmdQuaternion.Buffer y(double value) { HmdQuaternion.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public HmdQuaternion.Buffer z(double value) { HmdQuaternion.nz(address(), value); return this; }

    }

}