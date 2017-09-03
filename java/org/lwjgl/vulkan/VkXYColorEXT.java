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
 * structure to specify X,Y chromaticity coordinates.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkXYColorEXT {
 *     float x;
 *     float y;
 * }</pre></code>
 */
public class VkXYColorEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    VkXYColorEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkXYColorEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkXYColorEXT(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public float y() { return ny(address()); }

    /** Sets the specified value to the {@code x} field. */
    public VkXYColorEXT x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public VkXYColorEXT y(float value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkXYColorEXT set(
        float x,
        float y
    ) {
        x(x);
        y(y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkXYColorEXT set(VkXYColorEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkXYColorEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkXYColorEXT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkXYColorEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkXYColorEXT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkXYColorEXT} instance allocated with {@link BufferUtils}. */
    public static VkXYColorEXT create() {
        return new VkXYColorEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkXYColorEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkXYColorEXT create(long address) {
        return address == NULL ? null : new VkXYColorEXT(address, null);
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkXYColorEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkXYColorEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkXYColorEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkXYColorEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkXYColorEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkXYColorEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkXYColorEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkXYColorEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkXYColorEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + VkXYColorEXT.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + VkXYColorEXT.Y); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + VkXYColorEXT.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + VkXYColorEXT.Y, value); }

    // -----------------------------------

    /** An array of {@link VkXYColorEXT} structs. */
    public static class Buffer extends StructBuffer<VkXYColorEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkXYColorEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkXYColorEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkXYColorEXT newInstance(long address) {
            return new VkXYColorEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code x} field. */
        public float x() { return VkXYColorEXT.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public float y() { return VkXYColorEXT.ny(address()); }

        /** Sets the specified value to the {@code x} field. */
        public VkXYColorEXT.Buffer x(float value) { VkXYColorEXT.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public VkXYColorEXT.Buffer y(float value) { VkXYColorEXT.ny(address(), value); return this; }

    }

}