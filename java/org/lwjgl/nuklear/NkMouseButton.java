/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_mouse_button {
    int down;
    unsigned int clicked;
    {@link NkVec2 struct nk_vec2} clicked_pos;
}</code></pre>
 */
public class NkMouseButton extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DOWN,
        CLICKED,
        CLICKED_POS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DOWN = layout.offsetof(0);
        CLICKED = layout.offsetof(1);
        CLICKED_POS = layout.offsetof(2);
    }

    NkMouseButton(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkMouseButton} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkMouseButton(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code down} field. */
    public int down() { return ndown(address()); }
    /** Returns the value of the {@code clicked} field. */
    public int clicked() { return nclicked(address()); }
    /** Returns a {@link NkVec2} view of the {@code clicked_pos} field. */
    public NkVec2 clicked_pos() { return nclicked_pos(address()); }

    // -----------------------------------

    /** Returns a new {@link NkMouseButton} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static NkMouseButton create(long address) {
        return address == NULL ? null : new NkMouseButton(address, null);
    }

    /**
     * Create a {@link NkMouseButton.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #down}. */
    public static int ndown(long struct) { return memGetInt(struct + NkMouseButton.DOWN); }
    /** Unsafe version of {@link #clicked}. */
    public static int nclicked(long struct) { return memGetInt(struct + NkMouseButton.CLICKED); }
    /** Unsafe version of {@link #clicked_pos}. */
    public static NkVec2 nclicked_pos(long struct) { return NkVec2.create(struct + NkMouseButton.CLICKED_POS); }

    // -----------------------------------

    /** An array of {@link NkMouseButton} structs. */
    public static class Buffer extends StructBuffer<NkMouseButton, Buffer> {

        /**
         * Creates a new {@link NkMouseButton.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkMouseButton#SIZEOF}, and its mark will be undefined.
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
        protected NkMouseButton newInstance(long address) {
            return new NkMouseButton(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code down} field. */
        public int down() { return NkMouseButton.ndown(address()); }
        /** Returns the value of the {@code clicked} field. */
        public int clicked() { return NkMouseButton.nclicked(address()); }
        /** Returns a {@link NkVec2} view of the {@code clicked_pos} field. */
        public NkVec2 clicked_pos() { return NkMouseButton.nclicked_pos(address()); }

    }

}