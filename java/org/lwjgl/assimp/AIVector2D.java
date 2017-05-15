/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiVector2D {
 *     float x;
 *     float y;
 * }</pre></code>
 */
public class AIVector2D extends Struct {

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

    AIVector2D(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIVector2D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIVector2D(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public float y() { return ny(address()); }

    // -----------------------------------

    /** Returns a new {@link AIVector2D} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AIVector2D create(long address) {
        return address == NULL ? null : new AIVector2D(address, null);
    }

    /**
     * Create a {@link AIVector2D.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + AIVector2D.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + AIVector2D.Y); }

    // -----------------------------------

    /** An array of {@link AIVector2D} structs. */
    public static class Buffer extends StructBuffer<AIVector2D, Buffer> {

        /**
         * Creates a new {@link AIVector2D.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIVector2D#SIZEOF}, and its mark will be undefined.
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
        protected AIVector2D newInstance(long address) {
            return new AIVector2D(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code x} field. */
        public float x() { return AIVector2D.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public float y() { return AIVector2D.ny(address()); }

    }

}