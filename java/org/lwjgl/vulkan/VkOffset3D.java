/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a three-dimensional offset.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; the x offset.</li>
 * <li>{@code y} &ndash; the y offset.</li>
 * <li>{@code z} &ndash; the z offset.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkOffset3D {
 *     int32_t x;
 *     int32_t y;
 *     int32_t z;
 * }</pre></code>
 */
public class VkOffset3D extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        Z;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
    }

    VkOffset3D(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkOffset3D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkOffset3D(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    @NativeType("int32_t")
    public int x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    @NativeType("int32_t")
    public int y() { return ny(address()); }
    /** Returns the value of the {@code z} field. */
    @NativeType("int32_t")
    public int z() { return nz(address()); }

    /** Sets the specified value to the {@code x} field. */
    public VkOffset3D x(@NativeType("int32_t") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public VkOffset3D y(@NativeType("int32_t") int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public VkOffset3D z(@NativeType("int32_t") int value) { nz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkOffset3D set(
        int x,
        int y,
        int z
    ) {
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
    public VkOffset3D set(VkOffset3D src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkOffset3D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkOffset3D malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkOffset3D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkOffset3D calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkOffset3D} instance allocated with {@link BufferUtils}. */
    public static VkOffset3D create() {
        return new VkOffset3D(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkOffset3D} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkOffset3D create(long address) {
        return address == NULL ? null : new VkOffset3D(address, null);
    }

    /**
     * Returns a new {@link VkOffset3D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOffset3D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOffset3D.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkOffset3D.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkOffset3D} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkOffset3D mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkOffset3D} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkOffset3D callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkOffset3D} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOffset3D mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkOffset3D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOffset3D callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkOffset3D.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkOffset3D.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkOffset3D.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOffset3D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return memGetInt(struct + VkOffset3D.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return memGetInt(struct + VkOffset3D.Y); }
    /** Unsafe version of {@link #z}. */
    public static int nz(long struct) { return memGetInt(struct + VkOffset3D.Z); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { memPutInt(struct + VkOffset3D.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { memPutInt(struct + VkOffset3D.Y, value); }
    /** Unsafe version of {@link #z(int) z}. */
    public static void nz(long struct, int value) { memPutInt(struct + VkOffset3D.Z, value); }

    // -----------------------------------

    /** An array of {@link VkOffset3D} structs. */
    public static class Buffer extends StructBuffer<VkOffset3D, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkOffset3D.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkOffset3D#SIZEOF}, and its mark will be undefined.
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
        protected VkOffset3D newInstance(long address) {
            return new VkOffset3D(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code x} field. */
        @NativeType("int32_t")
        public int x() { return VkOffset3D.nx(address()); }
        /** Returns the value of the {@code y} field. */
        @NativeType("int32_t")
        public int y() { return VkOffset3D.ny(address()); }
        /** Returns the value of the {@code z} field. */
        @NativeType("int32_t")
        public int z() { return VkOffset3D.nz(address()); }

        /** Sets the specified value to the {@code x} field. */
        public VkOffset3D.Buffer x(@NativeType("int32_t") int value) { VkOffset3D.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public VkOffset3D.Buffer y(@NativeType("int32_t") int value) { VkOffset3D.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public VkOffset3D.Buffer z(@NativeType("int32_t") int value) { VkOffset3D.nz(address(), value); return this; }

    }

}