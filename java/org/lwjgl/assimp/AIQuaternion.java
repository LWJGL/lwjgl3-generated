/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Represents a quaternion in a 4D vector.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code w} &ndash; The w component</li>
 * <li>{@code x} &ndash; The x component</li>
 * <li>{@code y} &ndash; The y component</li>
 * <li>{@code z} &ndash; The z component</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiQuaternion {
 *     float w;
 *     float x;
 *     float y;
 *     float z;
 * }</pre></code>
 */
@NativeType("struct aiQuaternion")
public class AIQuaternion extends Struct implements NativeResource {

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
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        W = layout.offsetof(0);
        X = layout.offsetof(1);
        Y = layout.offsetof(2);
        Z = layout.offsetof(3);
    }

    AIQuaternion(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIQuaternion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIQuaternion(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code w} field. */
    public float w() { return nw(address()); }
    /** Returns the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** Returns the value of the {@code z} field. */
    public float z() { return nz(address()); }

    /** Sets the specified value to the {@code w} field. */
    public AIQuaternion w(float value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public AIQuaternion x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public AIQuaternion y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public AIQuaternion z(float value) { nz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIQuaternion set(
        float w,
        float x,
        float y,
        float z
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
    public AIQuaternion set(AIQuaternion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AIQuaternion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIQuaternion malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link AIQuaternion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIQuaternion calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link AIQuaternion} instance allocated with {@link BufferUtils}. */
    public static AIQuaternion create() {
        return new AIQuaternion(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIQuaternion} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AIQuaternion create(long address) {
        return address == NULL ? null : new AIQuaternion(address, null);
    }

    /**
     * Returns a new {@link AIQuaternion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIQuaternion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIQuaternion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link AIQuaternion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIQuaternion} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIQuaternion mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIQuaternion} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIQuaternion callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIQuaternion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIQuaternion mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIQuaternion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIQuaternion callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIQuaternion.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIQuaternion.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIQuaternion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIQuaternion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #w}. */
    public static float nw(long struct) { return memGetFloat(struct + AIQuaternion.W); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + AIQuaternion.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + AIQuaternion.Y); }
    /** Unsafe version of {@link #z}. */
    public static float nz(long struct) { return memGetFloat(struct + AIQuaternion.Z); }

    /** Unsafe version of {@link #w(float) w}. */
    public static void nw(long struct, float value) { memPutFloat(struct + AIQuaternion.W, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + AIQuaternion.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + AIQuaternion.Y, value); }
    /** Unsafe version of {@link #z(float) z}. */
    public static void nz(long struct, float value) { memPutFloat(struct + AIQuaternion.Z, value); }

    // -----------------------------------

    /** An array of {@link AIQuaternion} structs. */
    public static class Buffer extends StructBuffer<AIQuaternion, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIQuaternion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIQuaternion#SIZEOF}, and its mark will be undefined.
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
        protected AIQuaternion newInstance(long address) {
            return new AIQuaternion(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code w} field. */
        public float w() { return AIQuaternion.nw(address()); }
        /** Returns the value of the {@code x} field. */
        public float x() { return AIQuaternion.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public float y() { return AIQuaternion.ny(address()); }
        /** Returns the value of the {@code z} field. */
        public float z() { return AIQuaternion.nz(address()); }

        /** Sets the specified value to the {@code w} field. */
        public AIQuaternion.Buffer w(float value) { AIQuaternion.nw(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public AIQuaternion.Buffer x(float value) { AIQuaternion.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public AIQuaternion.Buffer y(float value) { AIQuaternion.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public AIQuaternion.Buffer z(float value) { AIQuaternion.nz(address(), value); return this; }

    }

}