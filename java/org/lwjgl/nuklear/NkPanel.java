/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code type} &ndash; one of:<br><table><tr><td>{@link Nuklear#NK_PANEL_WINDOW PANEL_WINDOW}</td><td>{@link Nuklear#NK_PANEL_GROUP PANEL_GROUP}</td><td>{@link Nuklear#NK_PANEL_POPUP PANEL_POPUP}</td><td>{@link Nuklear#NK_PANEL_CONTEXTUAL PANEL_CONTEXTUAL}</td><td>{@link Nuklear#NK_PANEL_COMBO PANEL_COMBO}</td><td>{@link Nuklear#NK_PANEL_MENU PANEL_MENU}</td></tr><tr><td>{@link Nuklear#NK_PANEL_TOOLTIP PANEL_TOOLTIP}</td><td>{@link Nuklear#NK_PANEL_SET_NONBLOCK PANEL_SET_NONBLOCK}</td><td>{@link Nuklear#NK_PANEL_SET_POPUP PANEL_SET_POPUP}</td><td>{@link Nuklear#NK_PANEL_SET_SUB PANEL_SET_SUB}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_panel {
 *     enum nk_panel_type type;
 *     nk_flags flags;
 *     {@link NkRect struct nk_rect} bounds;
 *     nk_uint * offset_x;
 *     nk_uint * offset_y;
 *     float at_x;
 *     float at_y;
 *     float max_x;
 *     float footer_height;
 *     float header_height;
 *     float border;
 *     unsigned int has_scrolling;
 *     {@link NkRect struct nk_rect} clip;
 *     {@link NkMenuState struct nk_menu_state} menu;
 *     {@link NkRowLayout struct nk_row_layout} row;
 *     {@link NkChart struct nk_chart} chart;
 *     {@link NkCommandBuffer struct nk_command_buffer} * buffer;
 *     {@link NkPanel struct nk_panel} * parent;
 * }</pre></code>
 */
public class NkPanel extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        FLAGS,
        BOUNDS,
        OFFSET_X,
        OFFSET_Y,
        AT_X,
        AT_Y,
        MAX_X,
        FOOTER_HEIGHT,
        HEADER_HEIGHT,
        BORDER,
        HAS_SCROLLING,
        CLIP,
        MENU,
        ROW,
        CHART,
        BUFFER,
        PARENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(NkRect.SIZEOF, NkRect.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkRect.SIZEOF, NkRect.ALIGNOF),
            __member(NkMenuState.SIZEOF, NkMenuState.ALIGNOF),
            __member(NkRowLayout.SIZEOF, NkRowLayout.ALIGNOF),
            __member(NkChart.SIZEOF, NkChart.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        BOUNDS = layout.offsetof(2);
        OFFSET_X = layout.offsetof(3);
        OFFSET_Y = layout.offsetof(4);
        AT_X = layout.offsetof(5);
        AT_Y = layout.offsetof(6);
        MAX_X = layout.offsetof(7);
        FOOTER_HEIGHT = layout.offsetof(8);
        HEADER_HEIGHT = layout.offsetof(9);
        BORDER = layout.offsetof(10);
        HAS_SCROLLING = layout.offsetof(11);
        CLIP = layout.offsetof(12);
        MENU = layout.offsetof(13);
        ROW = layout.offsetof(14);
        CHART = layout.offsetof(15);
        BUFFER = layout.offsetof(16);
        PARENT = layout.offsetof(17);
    }

    NkPanel(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkPanel} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkPanel(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code flags} field. */
    public int flags() { return nflags(address()); }
    /** Returns a {@link NkRect} view of the {@code bounds} field. */
    public NkRect bounds() { return nbounds(address()); }
    /**
     * Returns a {@link IntBuffer} view of the data pointed to by the {@code offset_x} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    public IntBuffer offset_x(int capacity) { return noffset_x(address(), capacity); }
    /**
     * Returns a {@link IntBuffer} view of the data pointed to by the {@code offset_y} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    public IntBuffer offset_y(int capacity) { return noffset_y(address(), capacity); }
    /** Returns the value of the {@code at_x} field. */
    public float at_x() { return nat_x(address()); }
    /** Returns the value of the {@code at_y} field. */
    public float at_y() { return nat_y(address()); }
    /** Returns the value of the {@code max_x} field. */
    public float max_x() { return nmax_x(address()); }
    /** Returns the value of the {@code footer_height} field. */
    public float footer_height() { return nfooter_height(address()); }
    /** Returns the value of the {@code header_height} field. */
    public float header_height() { return nheader_height(address()); }
    /** Returns the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** Returns the value of the {@code has_scrolling} field. */
    public int has_scrolling() { return nhas_scrolling(address()); }
    /** Returns a {@link NkRect} view of the {@code clip} field. */
    public NkRect clip() { return nclip(address()); }
    /** Returns a {@link NkMenuState} view of the {@code menu} field. */
    public NkMenuState menu() { return nmenu(address()); }
    /** Returns a {@link NkRowLayout} view of the {@code row} field. */
    public NkRowLayout row() { return nrow(address()); }
    /** Returns a {@link NkChart} view of the {@code chart} field. */
    public NkChart chart() { return nchart(address()); }
    /** Returns a {@link NkCommandBuffer} view of the struct pointed to by the {@code buffer} field. */
    public NkCommandBuffer buffer() { return nbuffer(address()); }
    /** Returns a {@link NkPanel} view of the struct pointed to by the {@code parent} field. */
    public NkPanel parent() { return nparent(address()); }

    // -----------------------------------

    /** Returns a new {@link NkPanel} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkPanel malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link NkPanel} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkPanel calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link NkPanel} instance allocated with {@link BufferUtils}. */
    public static NkPanel create() {
        return new NkPanel(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link NkPanel} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static NkPanel create(long address) {
        return address == NULL ? null : new NkPanel(address, null);
    }

    /**
     * Returns a new {@link NkPanel.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkPanel.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkPanel.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link NkPanel.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link NkPanel} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkPanel mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link NkPanel} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkPanel callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link NkPanel} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkPanel mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link NkPanel} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkPanel callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkPanel.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkPanel.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkPanel.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkPanel.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + NkPanel.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + NkPanel.FLAGS); }
    /** Unsafe version of {@link #bounds}. */
    public static NkRect nbounds(long struct) { return NkRect.create(struct + NkPanel.BOUNDS); }
    /** Unsafe version of {@link #offset_x(int) offset_x}. */
    public static IntBuffer noffset_x(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + NkPanel.OFFSET_X), capacity); }
    /** Unsafe version of {@link #offset_y(int) offset_y}. */
    public static IntBuffer noffset_y(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + NkPanel.OFFSET_Y), capacity); }
    /** Unsafe version of {@link #at_x}. */
    public static float nat_x(long struct) { return memGetFloat(struct + NkPanel.AT_X); }
    /** Unsafe version of {@link #at_y}. */
    public static float nat_y(long struct) { return memGetFloat(struct + NkPanel.AT_Y); }
    /** Unsafe version of {@link #max_x}. */
    public static float nmax_x(long struct) { return memGetFloat(struct + NkPanel.MAX_X); }
    /** Unsafe version of {@link #footer_height}. */
    public static float nfooter_height(long struct) { return memGetFloat(struct + NkPanel.FOOTER_HEIGHT); }
    /** Unsafe version of {@link #header_height}. */
    public static float nheader_height(long struct) { return memGetFloat(struct + NkPanel.HEADER_HEIGHT); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return memGetFloat(struct + NkPanel.BORDER); }
    /** Unsafe version of {@link #has_scrolling}. */
    public static int nhas_scrolling(long struct) { return memGetInt(struct + NkPanel.HAS_SCROLLING); }
    /** Unsafe version of {@link #clip}. */
    public static NkRect nclip(long struct) { return NkRect.create(struct + NkPanel.CLIP); }
    /** Unsafe version of {@link #menu}. */
    public static NkMenuState nmenu(long struct) { return NkMenuState.create(struct + NkPanel.MENU); }
    /** Unsafe version of {@link #row}. */
    public static NkRowLayout nrow(long struct) { return NkRowLayout.create(struct + NkPanel.ROW); }
    /** Unsafe version of {@link #chart}. */
    public static NkChart nchart(long struct) { return NkChart.create(struct + NkPanel.CHART); }
    /** Unsafe version of {@link #buffer}. */
    public static NkCommandBuffer nbuffer(long struct) { return NkCommandBuffer.create(memGetAddress(struct + NkPanel.BUFFER)); }
    /** Unsafe version of {@link #parent}. */
    public static NkPanel nparent(long struct) { return NkPanel.create(memGetAddress(struct + NkPanel.PARENT)); }

    // -----------------------------------

    /** An array of {@link NkPanel} structs. */
    public static class Buffer extends StructBuffer<NkPanel, Buffer> implements NativeResource {

        /**
         * Creates a new {@link NkPanel.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkPanel#SIZEOF}, and its mark will be undefined.
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
        protected NkPanel newInstance(long address) {
            return new NkPanel(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return NkPanel.ntype(address()); }
        /** Returns the value of the {@code flags} field. */
        public int flags() { return NkPanel.nflags(address()); }
        /** Returns a {@link NkRect} view of the {@code bounds} field. */
        public NkRect bounds() { return NkPanel.nbounds(address()); }
        /**
         * Returns a {@link IntBuffer} view of the data pointed to by the {@code offset_x} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        public IntBuffer offset_x(int capacity) { return NkPanel.noffset_x(address(), capacity); }
        /**
         * Returns a {@link IntBuffer} view of the data pointed to by the {@code offset_y} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        public IntBuffer offset_y(int capacity) { return NkPanel.noffset_y(address(), capacity); }
        /** Returns the value of the {@code at_x} field. */
        public float at_x() { return NkPanel.nat_x(address()); }
        /** Returns the value of the {@code at_y} field. */
        public float at_y() { return NkPanel.nat_y(address()); }
        /** Returns the value of the {@code max_x} field. */
        public float max_x() { return NkPanel.nmax_x(address()); }
        /** Returns the value of the {@code footer_height} field. */
        public float footer_height() { return NkPanel.nfooter_height(address()); }
        /** Returns the value of the {@code header_height} field. */
        public float header_height() { return NkPanel.nheader_height(address()); }
        /** Returns the value of the {@code border} field. */
        public float border() { return NkPanel.nborder(address()); }
        /** Returns the value of the {@code has_scrolling} field. */
        public int has_scrolling() { return NkPanel.nhas_scrolling(address()); }
        /** Returns a {@link NkRect} view of the {@code clip} field. */
        public NkRect clip() { return NkPanel.nclip(address()); }
        /** Returns a {@link NkMenuState} view of the {@code menu} field. */
        public NkMenuState menu() { return NkPanel.nmenu(address()); }
        /** Returns a {@link NkRowLayout} view of the {@code row} field. */
        public NkRowLayout row() { return NkPanel.nrow(address()); }
        /** Returns a {@link NkChart} view of the {@code chart} field. */
        public NkChart chart() { return NkPanel.nchart(address()); }
        /** Returns a {@link NkCommandBuffer} view of the struct pointed to by the {@code buffer} field. */
        public NkCommandBuffer buffer() { return NkPanel.nbuffer(address()); }
        /** Returns a {@link NkPanel} view of the struct pointed to by the {@code parent} field. */
        public NkPanel parent() { return NkPanel.nparent(address()); }

    }

}