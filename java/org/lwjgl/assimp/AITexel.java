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
 * Helper structure to represent a texel in a ARGB8888 format. Used by aiTexture.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code b} &ndash; The blue color component</li>
 * <li>{@code g} &ndash; The green color component</li>
 * <li>{@code r} &ndash; The red color component</li>
 * <li>{@code a} &ndash; The alpha color component</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiTexel {
 *     unsigned char b;
 *     unsigned char g;
 *     unsigned char r;
 *     unsigned char a;
 * }</pre></code>
 */
@NativeType("struct aiTexel")
public class AITexel extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        B,
        G,
        R,
        A;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        B = layout.offsetof(0);
        G = layout.offsetof(1);
        R = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    AITexel(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AITexel} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AITexel(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code b} field. */
    @NativeType("unsigned char")
    public byte b() { return nb(address()); }
    /** Returns the value of the {@code g} field. */
    @NativeType("unsigned char")
    public byte g() { return ng(address()); }
    /** Returns the value of the {@code r} field. */
    @NativeType("unsigned char")
    public byte r() { return nr(address()); }
    /** Returns the value of the {@code a} field. */
    @NativeType("unsigned char")
    public byte a() { return na(address()); }

    // -----------------------------------

    /** Returns a new {@link AITexel} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AITexel create(long address) {
        return address == NULL ? null : new AITexel(address, null);
    }

    /**
     * Create a {@link AITexel.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #b}. */
    public static byte nb(long struct) { return memGetByte(struct + AITexel.B); }
    /** Unsafe version of {@link #g}. */
    public static byte ng(long struct) { return memGetByte(struct + AITexel.G); }
    /** Unsafe version of {@link #r}. */
    public static byte nr(long struct) { return memGetByte(struct + AITexel.R); }
    /** Unsafe version of {@link #a}. */
    public static byte na(long struct) { return memGetByte(struct + AITexel.A); }

    // -----------------------------------

    /** An array of {@link AITexel} structs. */
    public static class Buffer extends StructBuffer<AITexel, Buffer> {

        /**
         * Creates a new {@link AITexel.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AITexel#SIZEOF}, and its mark will be undefined.
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
        protected AITexel newInstance(long address) {
            return new AITexel(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code b} field. */
        @NativeType("unsigned char")
        public byte b() { return AITexel.nb(address()); }
        /** Returns the value of the {@code g} field. */
        @NativeType("unsigned char")
        public byte g() { return AITexel.ng(address()); }
        /** Returns the value of the {@code r} field. */
        @NativeType("unsigned char")
        public byte r() { return AITexel.nr(address()); }
        /** Returns the value of the {@code a} field. */
        @NativeType("unsigned char")
        public byte a() { return AITexel.na(address()); }

    }

}