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
 * Represents an opaque set of settings to be used during importing.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiPropertyStore {
 *     char sentinel;
 * }</pre></code>
 */
public class AIPropertyStore extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SENTINEL;

    static {
        Layout layout = __struct(
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SENTINEL = layout.offsetof(0);
    }

    AIPropertyStore(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIPropertyStore} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIPropertyStore(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sentinel} field. */
    public byte sentinel() { return nsentinel(address()); }

    /** Sets the specified value to the {@code sentinel} field. */
    public AIPropertyStore sentinel(byte value) { nsentinel(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIPropertyStore set(AIPropertyStore src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AIPropertyStore} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIPropertyStore malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link AIPropertyStore} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIPropertyStore calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link AIPropertyStore} instance allocated with {@link BufferUtils}. */
    public static AIPropertyStore create() {
        return new AIPropertyStore(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIPropertyStore} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AIPropertyStore create(long address) {
        return address == NULL ? null : new AIPropertyStore(address, null);
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link AIPropertyStore.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIPropertyStore} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIPropertyStore mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIPropertyStore} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIPropertyStore callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIPropertyStore} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIPropertyStore mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIPropertyStore} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIPropertyStore callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sentinel}. */
    public static byte nsentinel(long struct) { return memGetByte(struct + AIPropertyStore.SENTINEL); }

    /** Unsafe version of {@link #sentinel(byte) sentinel}. */
    public static void nsentinel(long struct, byte value) { memPutByte(struct + AIPropertyStore.SENTINEL, value); }

    // -----------------------------------

    /** An array of {@link AIPropertyStore} structs. */
    public static class Buffer extends StructBuffer<AIPropertyStore, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIPropertyStore.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIPropertyStore#SIZEOF}, and its mark will be undefined.
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
        protected AIPropertyStore newInstance(long address) {
            return new AIPropertyStore(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sentinel} field. */
        public byte sentinel() { return AIPropertyStore.nsentinel(address()); }

        /** Sets the specified value to the {@code sentinel} field. */
        public AIPropertyStore.Buffer sentinel(byte value) { AIPropertyStore.nsentinel(address(), value); return this; }

    }

}