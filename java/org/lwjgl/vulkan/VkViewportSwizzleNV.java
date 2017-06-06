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
 * Structure specifying a viewport swizzle.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code x} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
 * <li>{@code y} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
 * <li>{@code z} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
 * <li>{@code w} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineViewportSwizzleStateCreateInfoNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the x component of the primitive</li>
 * <li>{@code y} &ndash; a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the y component of the primitive</li>
 * <li>{@code z} &ndash; a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the z component of the primitive</li>
 * <li>{@code w} &ndash; a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the w component of the primitive</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkViewportSwizzleNV {
 *     VkViewportCoordinateSwizzleNV x;
 *     VkViewportCoordinateSwizzleNV y;
 *     VkViewportCoordinateSwizzleNV z;
 *     VkViewportCoordinateSwizzleNV w;
 * }</pre></code>
 */
public class VkViewportSwizzleNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        Z,
        W;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
        W = layout.offsetof(3);
    }

    VkViewportSwizzleNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkViewportSwizzleNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkViewportSwizzleNV(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    public int x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public int y() { return ny(address()); }
    /** Returns the value of the {@code z} field. */
    public int z() { return nz(address()); }
    /** Returns the value of the {@code w} field. */
    public int w() { return nw(address()); }

    /** Sets the specified value to the {@code x} field. */
    public VkViewportSwizzleNV x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public VkViewportSwizzleNV y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public VkViewportSwizzleNV z(int value) { nz(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public VkViewportSwizzleNV w(int value) { nw(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkViewportSwizzleNV set(
        int x,
        int y,
        int z,
        int w
    ) {
        x(x);
        y(y);
        z(z);
        w(w);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkViewportSwizzleNV set(VkViewportSwizzleNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkViewportSwizzleNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkViewportSwizzleNV malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkViewportSwizzleNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkViewportSwizzleNV calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkViewportSwizzleNV} instance allocated with {@link BufferUtils}. */
    public static VkViewportSwizzleNV create() {
        return new VkViewportSwizzleNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkViewportSwizzleNV} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkViewportSwizzleNV create(long address) {
        return address == NULL ? null : new VkViewportSwizzleNV(address, null);
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkViewportSwizzleNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkViewportSwizzleNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkViewportSwizzleNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkViewportSwizzleNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkViewportSwizzleNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkViewportSwizzleNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkViewportSwizzleNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return memGetInt(struct + VkViewportSwizzleNV.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return memGetInt(struct + VkViewportSwizzleNV.Y); }
    /** Unsafe version of {@link #z}. */
    public static int nz(long struct) { return memGetInt(struct + VkViewportSwizzleNV.Z); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return memGetInt(struct + VkViewportSwizzleNV.W); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { memPutInt(struct + VkViewportSwizzleNV.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { memPutInt(struct + VkViewportSwizzleNV.Y, value); }
    /** Unsafe version of {@link #z(int) z}. */
    public static void nz(long struct, int value) { memPutInt(struct + VkViewportSwizzleNV.Z, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { memPutInt(struct + VkViewportSwizzleNV.W, value); }

    // -----------------------------------

    /** An array of {@link VkViewportSwizzleNV} structs. */
    public static class Buffer extends StructBuffer<VkViewportSwizzleNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkViewportSwizzleNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkViewportSwizzleNV#SIZEOF}, and its mark will be undefined.
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
        protected VkViewportSwizzleNV newInstance(long address) {
            return new VkViewportSwizzleNV(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code x} field. */
        public int x() { return VkViewportSwizzleNV.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public int y() { return VkViewportSwizzleNV.ny(address()); }
        /** Returns the value of the {@code z} field. */
        public int z() { return VkViewportSwizzleNV.nz(address()); }
        /** Returns the value of the {@code w} field. */
        public int w() { return VkViewportSwizzleNV.nw(address()); }

        /** Sets the specified value to the {@code x} field. */
        public VkViewportSwizzleNV.Buffer x(int value) { VkViewportSwizzleNV.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public VkViewportSwizzleNV.Buffer y(int value) { VkViewportSwizzleNV.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public VkViewportSwizzleNV.Buffer z(int value) { VkViewportSwizzleNV.nz(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public VkViewportSwizzleNV.Buffer w(int value) { VkViewportSwizzleNV.nw(address(), value); return this; }

    }

}