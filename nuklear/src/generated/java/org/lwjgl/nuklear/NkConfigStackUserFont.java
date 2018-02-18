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

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_config_stack_user_font {
 *     int head;
 *     {@link NkConfigStackUserFontElement struct nk_config_stack_user_font_element} elements[8];
 * }</pre></code>
 */
@NativeType("struct nk_config_stack_user_font")
class NkConfigStackUserFont extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEAD,
        ELEMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __array(NkConfigStackUserFontElement.SIZEOF, NkConfigStackUserFontElement.ALIGNOF, 8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        ELEMENTS = layout.offsetof(1);
    }

    NkConfigStackUserFont(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkConfigStackUserFont} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    NkConfigStackUserFont(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code head} field. */
    public int head() { return nhead(address()); }
    /** Returns a {@link NkConfigStackUserFontElement}.Buffer view of the {@code elements} field. */
    @NativeType("struct nk_config_stack_user_font_element[8]")
    public NkConfigStackUserFontElement.Buffer elements() { return nelements(address()); }
    /** Returns a {@link NkConfigStackUserFontElement} view of the struct at the specified index of the {@code elements} field. */
    @NativeType("struct nk_config_stack_user_font_element")
    public NkConfigStackUserFontElement elements(int index) { return nelements(address(), index); }

    // -----------------------------------

    /** Returns a new {@link NkConfigStackUserFont} instance for the specified memory address. */
    public static NkConfigStackUserFont create(long address) {
        return new NkConfigStackUserFont(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigStackUserFont createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link NkConfigStackUserFont.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkConfigStackUserFont.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigStackUserFont.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #head}. */
    public static int nhead(long struct) { return memGetInt(struct + NkConfigStackUserFont.HEAD); }
    /** Unsafe version of {@link #elements}. */
    public static NkConfigStackUserFontElement.Buffer nelements(long struct) { return NkConfigStackUserFontElement.create(struct + NkConfigStackUserFont.ELEMENTS, 8); }
    /** Unsafe version of {@link #elements(int) elements}. */
    public static NkConfigStackUserFontElement nelements(long struct, int index) {
        return NkConfigStackUserFontElement.create(struct + NkConfigStackUserFont.ELEMENTS + check(index, 8) * NkConfigStackUserFontElement.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link NkConfigStackUserFont} structs. */
    public static class Buffer extends StructBuffer<NkConfigStackUserFont, Buffer> {

        /**
         * Creates a new {@link NkConfigStackUserFont.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkConfigStackUserFont#SIZEOF}, and its mark will be undefined.
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
        protected NkConfigStackUserFont newInstance(long address) {
            return new NkConfigStackUserFont(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code head} field. */
        public int head() { return NkConfigStackUserFont.nhead(address()); }
        /** Returns a {@link NkConfigStackUserFontElement}.Buffer view of the {@code elements} field. */
        @NativeType("struct nk_config_stack_user_font_element[8]")
        public NkConfigStackUserFontElement.Buffer elements() { return NkConfigStackUserFont.nelements(address()); }
        /** Returns a {@link NkConfigStackUserFontElement} view of the struct at the specified index of the {@code elements} field. */
        @NativeType("struct nk_config_stack_user_font_element")
        public NkConfigStackUserFontElement elements(int index) { return NkConfigStackUserFont.nelements(address(), index); }

    }

}