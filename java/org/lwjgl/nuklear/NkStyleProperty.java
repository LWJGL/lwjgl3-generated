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
 * <li>{@code sym_left} &ndash; one of:<br><table><tr><td>{@link Nuklear#NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link Nuklear#NK_SYMBOL_X SYMBOL_X}</td><td>{@link Nuklear#NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link Nuklear#NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link Nuklear#NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link Nuklear#NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link Nuklear#NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link Nuklear#NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link Nuklear#NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link Nuklear#NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table></li>
 * <li>{@code sym_right} &ndash; see {@code sym_left}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_style_property {
    {@link NkStyleItem struct nk_style_item} normal;
    {@link NkStyleItem struct nk_style_item} hover;
    {@link NkStyleItem struct nk_style_item} active;
    {@link NkColor struct nk_color} border_color;
    {@link NkColor struct nk_color} label_normal;
    {@link NkColor struct nk_color} label_hover;
    {@link NkColor struct nk_color} label_active;
    enum nk_symbol_type sym_left;
    enum nk_symbol_type sym_right;
    float border;
    float rounding;
    {@link NkVec2 struct nk_vec2} padding;
    {@link NkStyleEdit struct nk_style_edit} edit;
    {@link NkStyleButton struct nk_style_button} inc_button;
    {@link NkStyleButton struct nk_style_button} dec_button;
    {@link NkHandle nk_handle} userdata;
    {@link NkDrawBeginCallbackI nk_draw_begin} draw_begin;
    {@link NkDrawEndCallbackI nk_draw_end} draw_end;
}</code></pre>
 */
public class NkStyleProperty extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NORMAL,
        HOVER,
        ACTIVE,
        BORDER_COLOR,
        LABEL_NORMAL,
        LABEL_HOVER,
        LABEL_ACTIVE,
        SYM_LEFT,
        SYM_RIGHT,
        BORDER,
        ROUNDING,
        PADDING,
        EDIT,
        INC_BUTTON,
        DEC_BUTTON,
        USERDATA,
        DRAW_BEGIN,
        DRAW_END;

    static {
        Layout layout = __struct(
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkStyleEdit.SIZEOF, NkStyleEdit.ALIGNOF),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NORMAL = layout.offsetof(0);
        HOVER = layout.offsetof(1);
        ACTIVE = layout.offsetof(2);
        BORDER_COLOR = layout.offsetof(3);
        LABEL_NORMAL = layout.offsetof(4);
        LABEL_HOVER = layout.offsetof(5);
        LABEL_ACTIVE = layout.offsetof(6);
        SYM_LEFT = layout.offsetof(7);
        SYM_RIGHT = layout.offsetof(8);
        BORDER = layout.offsetof(9);
        ROUNDING = layout.offsetof(10);
        PADDING = layout.offsetof(11);
        EDIT = layout.offsetof(12);
        INC_BUTTON = layout.offsetof(13);
        DEC_BUTTON = layout.offsetof(14);
        USERDATA = layout.offsetof(15);
        DRAW_BEGIN = layout.offsetof(16);
        DRAW_END = layout.offsetof(17);
    }

    NkStyleProperty(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkStyleProperty} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleProperty(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkStyleItem} view of the {@code normal} field. */
    public NkStyleItem normal() { return nnormal(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code hover} field. */
    public NkStyleItem hover() { return nhover(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code active} field. */
    public NkStyleItem active() { return nactive(address()); }
    /** Returns a {@link NkColor} view of the {@code border_color} field. */
    public NkColor border_color() { return nborder_color(address()); }
    /** Returns a {@link NkColor} view of the {@code label_normal} field. */
    public NkColor label_normal() { return nlabel_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code label_hover} field. */
    public NkColor label_hover() { return nlabel_hover(address()); }
    /** Returns a {@link NkColor} view of the {@code label_active} field. */
    public NkColor label_active() { return nlabel_active(address()); }
    /** Returns the value of the {@code sym_left} field. */
    public int sym_left() { return nsym_left(address()); }
    /** Returns the value of the {@code sym_right} field. */
    public int sym_right() { return nsym_right(address()); }
    /** Returns the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** Returns the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** Returns a {@link NkVec2} view of the {@code padding} field. */
    public NkVec2 padding() { return npadding(address()); }
    /** Returns a {@link NkStyleEdit} view of the {@code edit} field. */
    public NkStyleEdit edit() { return nedit(address()); }
    /** Returns a {@link NkStyleButton} view of the {@code inc_button} field. */
    public NkStyleButton inc_button() { return ninc_button(address()); }
    /** Returns a {@link NkStyleButton} view of the {@code dec_button} field. */
    public NkStyleButton dec_button() { return ndec_button(address()); }
    /** Returns a {@link NkHandle} view of the {@code userdata} field. */
    public NkHandle userdata() { return nuserdata(address()); }
    /** Returns the value of the {@code draw_begin} field. */
    public NkDrawBeginCallback draw_begin() { return ndraw_begin(address()); }
    /** Returns the value of the {@code draw_end} field. */
    public NkDrawEndCallback draw_end() { return ndraw_end(address()); }

    /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
    public NkStyleProperty normal(NkStyleItem value) { nnormal(address(), value); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
    public NkStyleProperty hover(NkStyleItem value) { nhover(address(), value); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
    public NkStyleProperty active(NkStyleItem value) { nactive(address(), value); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleProperty border_color(NkColor value) { nborder_color(address(), value); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_normal} field. */
    public NkStyleProperty label_normal(NkColor value) { nlabel_normal(address(), value); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_hover} field. */
    public NkStyleProperty label_hover(NkColor value) { nlabel_hover(address(), value); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_active} field. */
    public NkStyleProperty label_active(NkColor value) { nlabel_active(address(), value); return this; }
    /** Sets the specified value to the {@code sym_left} field. */
    public NkStyleProperty sym_left(int value) { nsym_left(address(), value); return this; }
    /** Sets the specified value to the {@code sym_right} field. */
    public NkStyleProperty sym_right(int value) { nsym_right(address(), value); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleProperty border(float value) { nborder(address(), value); return this; }
    /** Sets the specified value to the {@code rounding} field. */
    public NkStyleProperty rounding(float value) { nrounding(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleProperty padding(NkVec2 value) { npadding(address(), value); return this; }
    /** Copies the specified {@link NkStyleEdit} to the {@code edit} field. */
    public NkStyleProperty edit(NkStyleEdit value) { nedit(address(), value); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code inc_button} field. */
    public NkStyleProperty inc_button(NkStyleButton value) { ninc_button(address(), value); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code dec_button} field. */
    public NkStyleProperty dec_button(NkStyleButton value) { ndec_button(address(), value); return this; }
    /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
    public NkStyleProperty userdata(NkHandle value) { nuserdata(address(), value); return this; }
    /** Sets the specified value to the {@code draw_begin} field. */
    public NkStyleProperty draw_begin(NkDrawBeginCallbackI value) { ndraw_begin(address(), value); return this; }
    /** Sets the specified value to the {@code draw_end} field. */
    public NkStyleProperty draw_end(NkDrawEndCallbackI value) { ndraw_end(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleProperty set(
        NkStyleItem normal,
        NkStyleItem hover,
        NkStyleItem active,
        NkColor border_color,
        NkColor label_normal,
        NkColor label_hover,
        NkColor label_active,
        int sym_left,
        int sym_right,
        float border,
        float rounding,
        NkVec2 padding,
        NkStyleEdit edit,
        NkStyleButton inc_button,
        NkStyleButton dec_button,
        NkHandle userdata,
        NkDrawBeginCallbackI draw_begin,
        NkDrawEndCallbackI draw_end
    ) {
        normal(normal);
        hover(hover);
        active(active);
        border_color(border_color);
        label_normal(label_normal);
        label_hover(label_hover);
        label_active(label_active);
        sym_left(sym_left);
        sym_right(sym_right);
        border(border);
        rounding(rounding);
        padding(padding);
        edit(edit);
        inc_button(inc_button);
        dec_button(dec_button);
        userdata(userdata);
        draw_begin(draw_begin);
        draw_end(draw_end);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkStyleProperty set(NkStyleProperty src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link NkStyleProperty} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleProperty malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link NkStyleProperty} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleProperty calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link NkStyleProperty} instance allocated with {@link BufferUtils}. */
    public static NkStyleProperty create() {
        return new NkStyleProperty(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link NkStyleProperty} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static NkStyleProperty create(long address) {
        return address == NULL ? null : new NkStyleProperty(address, null);
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link NkStyleProperty.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link NkStyleProperty} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleProperty mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link NkStyleProperty} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleProperty callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link NkStyleProperty} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleProperty mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleProperty} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleProperty callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #normal}. */
    public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleProperty.NORMAL); }
    /** Unsafe version of {@link #hover}. */
    public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleProperty.HOVER); }
    /** Unsafe version of {@link #active}. */
    public static NkStyleItem nactive(long struct) { return NkStyleItem.create(struct + NkStyleProperty.ACTIVE); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleProperty.BORDER_COLOR); }
    /** Unsafe version of {@link #label_normal}. */
    public static NkColor nlabel_normal(long struct) { return NkColor.create(struct + NkStyleProperty.LABEL_NORMAL); }
    /** Unsafe version of {@link #label_hover}. */
    public static NkColor nlabel_hover(long struct) { return NkColor.create(struct + NkStyleProperty.LABEL_HOVER); }
    /** Unsafe version of {@link #label_active}. */
    public static NkColor nlabel_active(long struct) { return NkColor.create(struct + NkStyleProperty.LABEL_ACTIVE); }
    /** Unsafe version of {@link #sym_left}. */
    public static int nsym_left(long struct) { return memGetInt(struct + NkStyleProperty.SYM_LEFT); }
    /** Unsafe version of {@link #sym_right}. */
    public static int nsym_right(long struct) { return memGetInt(struct + NkStyleProperty.SYM_RIGHT); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return memGetFloat(struct + NkStyleProperty.BORDER); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return memGetFloat(struct + NkStyleProperty.ROUNDING); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleProperty.PADDING); }
    /** Unsafe version of {@link #edit}. */
    public static NkStyleEdit nedit(long struct) { return NkStyleEdit.create(struct + NkStyleProperty.EDIT); }
    /** Unsafe version of {@link #inc_button}. */
    public static NkStyleButton ninc_button(long struct) { return NkStyleButton.create(struct + NkStyleProperty.INC_BUTTON); }
    /** Unsafe version of {@link #dec_button}. */
    public static NkStyleButton ndec_button(long struct) { return NkStyleButton.create(struct + NkStyleProperty.DEC_BUTTON); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkStyleProperty.USERDATA); }
    /** Unsafe version of {@link #draw_begin}. */
    public static NkDrawBeginCallback ndraw_begin(long struct) { return NkDrawBeginCallback.create(memGetAddress(struct + NkStyleProperty.DRAW_BEGIN)); }
    /** Unsafe version of {@link #draw_end}. */
    public static NkDrawEndCallback ndraw_end(long struct) { return NkDrawEndCallback.create(memGetAddress(struct + NkStyleProperty.DRAW_END)); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProperty.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProperty.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #active(NkStyleItem) active}. */
    public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProperty.ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleProperty.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #label_normal(NkColor) label_normal}. */
    public static void nlabel_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleProperty.LABEL_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #label_hover(NkColor) label_hover}. */
    public static void nlabel_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleProperty.LABEL_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #label_active(NkColor) label_active}. */
    public static void nlabel_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleProperty.LABEL_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #sym_left(int) sym_left}. */
    public static void nsym_left(long struct, int value) { memPutInt(struct + NkStyleProperty.SYM_LEFT, value); }
    /** Unsafe version of {@link #sym_right(int) sym_right}. */
    public static void nsym_right(long struct, int value) { memPutInt(struct + NkStyleProperty.SYM_RIGHT, value); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { memPutFloat(struct + NkStyleProperty.BORDER, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { memPutFloat(struct + NkStyleProperty.ROUNDING, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleProperty.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #edit(NkStyleEdit) edit}. */
    public static void nedit(long struct, NkStyleEdit value) { memCopy(value.address(), struct + NkStyleProperty.EDIT, NkStyleEdit.SIZEOF); }
    /** Unsafe version of {@link #inc_button(NkStyleButton) inc_button}. */
    public static void ninc_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleProperty.INC_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #dec_button(NkStyleButton) dec_button}. */
    public static void ndec_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleProperty.DEC_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkStyleProperty.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #draw_begin(NkDrawBeginCallbackI) draw_begin}. */
    public static void ndraw_begin(long struct, NkDrawBeginCallbackI value) { memPutAddress(struct + NkStyleProperty.DRAW_BEGIN, addressSafe(value)); }
    /** Unsafe version of {@link #draw_end(NkDrawEndCallbackI) draw_end}. */
    public static void ndraw_end(long struct, NkDrawEndCallbackI value) { memPutAddress(struct + NkStyleProperty.DRAW_END, addressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkStyleProperty} structs. */
    public static class Buffer extends StructBuffer<NkStyleProperty, Buffer> implements NativeResource {

        /**
         * Creates a new {@link NkStyleProperty.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleProperty#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleProperty newInstance(long address) {
            return new NkStyleProperty(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link NkStyleItem} view of the {@code normal} field. */
        public NkStyleItem normal() { return NkStyleProperty.nnormal(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code hover} field. */
        public NkStyleItem hover() { return NkStyleProperty.nhover(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code active} field. */
        public NkStyleItem active() { return NkStyleProperty.nactive(address()); }
        /** Returns a {@link NkColor} view of the {@code border_color} field. */
        public NkColor border_color() { return NkStyleProperty.nborder_color(address()); }
        /** Returns a {@link NkColor} view of the {@code label_normal} field. */
        public NkColor label_normal() { return NkStyleProperty.nlabel_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code label_hover} field. */
        public NkColor label_hover() { return NkStyleProperty.nlabel_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code label_active} field. */
        public NkColor label_active() { return NkStyleProperty.nlabel_active(address()); }
        /** Returns the value of the {@code sym_left} field. */
        public int sym_left() { return NkStyleProperty.nsym_left(address()); }
        /** Returns the value of the {@code sym_right} field. */
        public int sym_right() { return NkStyleProperty.nsym_right(address()); }
        /** Returns the value of the {@code border} field. */
        public float border() { return NkStyleProperty.nborder(address()); }
        /** Returns the value of the {@code rounding} field. */
        public float rounding() { return NkStyleProperty.nrounding(address()); }
        /** Returns a {@link NkVec2} view of the {@code padding} field. */
        public NkVec2 padding() { return NkStyleProperty.npadding(address()); }
        /** Returns a {@link NkStyleEdit} view of the {@code edit} field. */
        public NkStyleEdit edit() { return NkStyleProperty.nedit(address()); }
        /** Returns a {@link NkStyleButton} view of the {@code inc_button} field. */
        public NkStyleButton inc_button() { return NkStyleProperty.ninc_button(address()); }
        /** Returns a {@link NkStyleButton} view of the {@code dec_button} field. */
        public NkStyleButton dec_button() { return NkStyleProperty.ndec_button(address()); }
        /** Returns a {@link NkHandle} view of the {@code userdata} field. */
        public NkHandle userdata() { return NkStyleProperty.nuserdata(address()); }
        /** Returns the value of the {@code draw_begin} field. */
        public NkDrawBeginCallback draw_begin() { return NkStyleProperty.ndraw_begin(address()); }
        /** Returns the value of the {@code draw_end} field. */
        public NkDrawEndCallback draw_end() { return NkStyleProperty.ndraw_end(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
        public NkStyleProperty.Buffer normal(NkStyleItem value) { NkStyleProperty.nnormal(address(), value); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
        public NkStyleProperty.Buffer hover(NkStyleItem value) { NkStyleProperty.nhover(address(), value); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
        public NkStyleProperty.Buffer active(NkStyleItem value) { NkStyleProperty.nactive(address(), value); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleProperty.Buffer border_color(NkColor value) { NkStyleProperty.nborder_color(address(), value); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_normal} field. */
        public NkStyleProperty.Buffer label_normal(NkColor value) { NkStyleProperty.nlabel_normal(address(), value); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_hover} field. */
        public NkStyleProperty.Buffer label_hover(NkColor value) { NkStyleProperty.nlabel_hover(address(), value); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_active} field. */
        public NkStyleProperty.Buffer label_active(NkColor value) { NkStyleProperty.nlabel_active(address(), value); return this; }
        /** Sets the specified value to the {@code sym_left} field. */
        public NkStyleProperty.Buffer sym_left(int value) { NkStyleProperty.nsym_left(address(), value); return this; }
        /** Sets the specified value to the {@code sym_right} field. */
        public NkStyleProperty.Buffer sym_right(int value) { NkStyleProperty.nsym_right(address(), value); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleProperty.Buffer border(float value) { NkStyleProperty.nborder(address(), value); return this; }
        /** Sets the specified value to the {@code rounding} field. */
        public NkStyleProperty.Buffer rounding(float value) { NkStyleProperty.nrounding(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleProperty.Buffer padding(NkVec2 value) { NkStyleProperty.npadding(address(), value); return this; }
        /** Copies the specified {@link NkStyleEdit} to the {@code edit} field. */
        public NkStyleProperty.Buffer edit(NkStyleEdit value) { NkStyleProperty.nedit(address(), value); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code inc_button} field. */
        public NkStyleProperty.Buffer inc_button(NkStyleButton value) { NkStyleProperty.ninc_button(address(), value); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code dec_button} field. */
        public NkStyleProperty.Buffer dec_button(NkStyleButton value) { NkStyleProperty.ndec_button(address(), value); return this; }
        /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
        public NkStyleProperty.Buffer userdata(NkHandle value) { NkStyleProperty.nuserdata(address(), value); return this; }
        /** Sets the specified value to the {@code draw_begin} field. */
        public NkStyleProperty.Buffer draw_begin(NkDrawBeginCallbackI value) { NkStyleProperty.ndraw_begin(address(), value); return this; }
        /** Sets the specified value to the {@code draw_end} field. */
        public NkStyleProperty.Buffer draw_end(NkDrawEndCallbackI value) { NkStyleProperty.ndraw_end(address(), value); return this; }

    }

}