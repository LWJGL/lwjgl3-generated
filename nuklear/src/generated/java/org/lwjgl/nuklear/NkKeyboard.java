/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.nuklear.Nuklear.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_keyboard {
 *     {@link NkKey struct nk_key} keys[NK_KEY_MAX];
 *     char text[NK_INPUT_MAX];
 *     int text_len;
 * }</pre></code>
 */
@NativeType("struct nk_keyboard")
public class NkKeyboard extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        KEYS,
        TEXT,
        TEXT_LEN;

    static {
        Layout layout = __struct(
            __array(NkKey.SIZEOF, NkKey.ALIGNOF, NK_KEY_MAX),
            __array(1, NK_INPUT_MAX),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KEYS = layout.offsetof(0);
        TEXT = layout.offsetof(1);
        TEXT_LEN = layout.offsetof(2);
    }

    NkKeyboard(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkKeyboard} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkKeyboard(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkKey}.Buffer view of the {@code keys} field. */
    @NativeType("struct nk_key[NK_KEY_MAX]")
    public NkKey.Buffer keys() { return nkeys(address()); }
    /** Returns a {@link NkKey} view of the struct at the specified index of the {@code keys} field. */
    @NativeType("struct nk_key")
    public NkKey keys(int index) { return nkeys(address(), index); }
    /** Returns a {@link ByteBuffer} view of the {@code text} field. */
    @NativeType("char[NK_INPUT_MAX]")
    public ByteBuffer text() { return ntext(address()); }
    /** Returns the value at the specified index of the {@code text} field. */
    @NativeType("char")
    public byte text(int index) { return ntext(address(), index); }
    /** Returns the value of the {@code text_len} field. */
    public int text_len() { return ntext_len(address()); }

    // -----------------------------------

    /** Returns a new {@link NkKeyboard} instance for the specified memory address. */
    public static NkKeyboard create(long address) {
        return new NkKeyboard(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkKeyboard createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link NkKeyboard.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkKeyboard.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkKeyboard.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #keys}. */
    public static NkKey.Buffer nkeys(long struct) { return NkKey.create(struct + NkKeyboard.KEYS, NK_KEY_MAX); }
    /** Unsafe version of {@link #keys(int) keys}. */
    public static NkKey nkeys(long struct, int index) {
        if (CHECKS) { check(index, NK_KEY_MAX); }
        return NkKey.create(struct + NkKeyboard.KEYS + index * NkKey.SIZEOF);
    }
    /** Unsafe version of {@link #text}. */
    public static ByteBuffer ntext(long struct) { return memByteBuffer(struct + NkKeyboard.TEXT, NK_INPUT_MAX); }
    /** Unsafe version of {@link #text(int) text}. */
    public static byte ntext(long struct, int index) {
        if (CHECKS) { check(index, NK_INPUT_MAX); }
        return memGetByte(struct + NkKeyboard.TEXT + index * 1);
    }
    /** Unsafe version of {@link #text_len}. */
    public static int ntext_len(long struct) { return memGetInt(struct + NkKeyboard.TEXT_LEN); }

    // -----------------------------------

    /** An array of {@link NkKeyboard} structs. */
    public static class Buffer extends StructBuffer<NkKeyboard, Buffer> {

        /**
         * Creates a new {@link NkKeyboard.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkKeyboard#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected NkKeyboard newInstance(long address) {
            return new NkKeyboard(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link NkKey}.Buffer view of the {@code keys} field. */
        @NativeType("struct nk_key[NK_KEY_MAX]")
        public NkKey.Buffer keys() { return NkKeyboard.nkeys(address()); }
        /** Returns a {@link NkKey} view of the struct at the specified index of the {@code keys} field. */
        @NativeType("struct nk_key")
        public NkKey keys(int index) { return NkKeyboard.nkeys(address(), index); }
        /** Returns a {@link ByteBuffer} view of the {@code text} field. */
        @NativeType("char[NK_INPUT_MAX]")
        public ByteBuffer text() { return NkKeyboard.ntext(address()); }
        /** Returns the value at the specified index of the {@code text} field. */
        @NativeType("char")
        public byte text(int index) { return NkKeyboard.ntext(address(), index); }
        /** Returns the value of the {@code text_len} field. */
        public int text_len() { return NkKeyboard.ntext_len(address()); }

    }

}