/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Data structure for setting window attributes.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct XSetWindowAttributes {
 *     Pixmap background_pixmap;
 *     unsigned long background_pixel;
 *     Pixmap border_pixmap;
 *     unsigned long border_pixel;
 *     int bit_gravity;
 *     int win_gravity;
 *     int backing_store;
 *     unsigned long backing_planes;
 *     unsigned long backing_pixel;
 *     Bool save_under;
 *     long event_mask;
 *     long do_not_propagate_mask;
 *     Bool override_redirect;
 *     Colormap colormap;
 *     Cursor cursor;
 * }</pre></code>
 */
public class XSetWindowAttributes extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BACKGROUND_PIXMAP,
        BACKGROUND_PIXEL,
        BORDER_PIXMAP,
        BORDER_PIXEL,
        BIT_GRAVITY,
        WIN_GRAVITY,
        BACKING_STORE,
        BACKING_PLANES,
        BACKING_PIXEL,
        SAVE_UNDER,
        EVENT_MASK,
        DO_NOT_PROPAGATE_MASK,
        OVERRIDE_REDIRECT,
        COLORMAP,
        CURSOR;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BACKGROUND_PIXMAP = layout.offsetof(0);
        BACKGROUND_PIXEL = layout.offsetof(1);
        BORDER_PIXMAP = layout.offsetof(2);
        BORDER_PIXEL = layout.offsetof(3);
        BIT_GRAVITY = layout.offsetof(4);
        WIN_GRAVITY = layout.offsetof(5);
        BACKING_STORE = layout.offsetof(6);
        BACKING_PLANES = layout.offsetof(7);
        BACKING_PIXEL = layout.offsetof(8);
        SAVE_UNDER = layout.offsetof(9);
        EVENT_MASK = layout.offsetof(10);
        DO_NOT_PROPAGATE_MASK = layout.offsetof(11);
        OVERRIDE_REDIRECT = layout.offsetof(12);
        COLORMAP = layout.offsetof(13);
        CURSOR = layout.offsetof(14);
    }

    XSetWindowAttributes(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link XSetWindowAttributes} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XSetWindowAttributes(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code background_pixmap} field. */
    @NativeType("Pixmap")
    public long background_pixmap() { return nbackground_pixmap(address()); }
    /** Returns the value of the {@code background_pixel} field. */
    @NativeType("unsigned long")
    public long background_pixel() { return nbackground_pixel(address()); }
    /** Returns the value of the {@code border_pixmap} field. */
    @NativeType("Pixmap")
    public long border_pixmap() { return nborder_pixmap(address()); }
    /** Returns the value of the {@code border_pixel} field. */
    @NativeType("unsigned long")
    public long border_pixel() { return nborder_pixel(address()); }
    /** Returns the value of the {@code bit_gravity} field. */
    public int bit_gravity() { return nbit_gravity(address()); }
    /** Returns the value of the {@code win_gravity} field. */
    public int win_gravity() { return nwin_gravity(address()); }
    /** Returns the value of the {@code backing_store} field. */
    public int backing_store() { return nbacking_store(address()); }
    /** Returns the value of the {@code backing_planes} field. */
    @NativeType("unsigned long")
    public long backing_planes() { return nbacking_planes(address()); }
    /** Returns the value of the {@code backing_pixel} field. */
    @NativeType("unsigned long")
    public long backing_pixel() { return nbacking_pixel(address()); }
    /** Returns the value of the {@code save_under} field. */
    @NativeType("Bool")
    public boolean save_under() { return nsave_under(address()) != 0; }
    /** Returns the value of the {@code event_mask} field. */
    public long event_mask() { return nevent_mask(address()); }
    /** Returns the value of the {@code do_not_propagate_mask} field. */
    public long do_not_propagate_mask() { return ndo_not_propagate_mask(address()); }
    /** Returns the value of the {@code override_redirect} field. */
    @NativeType("Bool")
    public boolean override_redirect() { return noverride_redirect(address()) != 0; }
    /** Returns the value of the {@code colormap} field. */
    @NativeType("Colormap")
    public long colormap() { return ncolormap(address()); }
    /** Returns the value of the {@code cursor} field. */
    @NativeType("Cursor")
    public long cursor() { return ncursor(address()); }

    /** Sets the specified value to the {@code background_pixmap} field. */
    public XSetWindowAttributes background_pixmap(@NativeType("Pixmap") long value) { nbackground_pixmap(address(), value); return this; }
    /** Sets the specified value to the {@code background_pixel} field. */
    public XSetWindowAttributes background_pixel(@NativeType("unsigned long") long value) { nbackground_pixel(address(), value); return this; }
    /** Sets the specified value to the {@code border_pixmap} field. */
    public XSetWindowAttributes border_pixmap(@NativeType("Pixmap") long value) { nborder_pixmap(address(), value); return this; }
    /** Sets the specified value to the {@code border_pixel} field. */
    public XSetWindowAttributes border_pixel(@NativeType("unsigned long") long value) { nborder_pixel(address(), value); return this; }
    /** Sets the specified value to the {@code bit_gravity} field. */
    public XSetWindowAttributes bit_gravity(int value) { nbit_gravity(address(), value); return this; }
    /** Sets the specified value to the {@code win_gravity} field. */
    public XSetWindowAttributes win_gravity(int value) { nwin_gravity(address(), value); return this; }
    /** Sets the specified value to the {@code backing_store} field. */
    public XSetWindowAttributes backing_store(int value) { nbacking_store(address(), value); return this; }
    /** Sets the specified value to the {@code backing_planes} field. */
    public XSetWindowAttributes backing_planes(@NativeType("unsigned long") long value) { nbacking_planes(address(), value); return this; }
    /** Sets the specified value to the {@code backing_pixel} field. */
    public XSetWindowAttributes backing_pixel(@NativeType("unsigned long") long value) { nbacking_pixel(address(), value); return this; }
    /** Sets the specified value to the {@code save_under} field. */
    public XSetWindowAttributes save_under(@NativeType("Bool") boolean value) { nsave_under(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code event_mask} field. */
    public XSetWindowAttributes event_mask(long value) { nevent_mask(address(), value); return this; }
    /** Sets the specified value to the {@code do_not_propagate_mask} field. */
    public XSetWindowAttributes do_not_propagate_mask(long value) { ndo_not_propagate_mask(address(), value); return this; }
    /** Sets the specified value to the {@code override_redirect} field. */
    public XSetWindowAttributes override_redirect(@NativeType("Bool") boolean value) { noverride_redirect(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code colormap} field. */
    public XSetWindowAttributes colormap(@NativeType("Colormap") long value) { ncolormap(address(), value); return this; }
    /** Sets the specified value to the {@code cursor} field. */
    public XSetWindowAttributes cursor(@NativeType("Cursor") long value) { ncursor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XSetWindowAttributes set(
        long background_pixmap,
        long background_pixel,
        long border_pixmap,
        long border_pixel,
        int bit_gravity,
        int win_gravity,
        int backing_store,
        long backing_planes,
        long backing_pixel,
        boolean save_under,
        long event_mask,
        long do_not_propagate_mask,
        boolean override_redirect,
        long colormap,
        long cursor
    ) {
        background_pixmap(background_pixmap);
        background_pixel(background_pixel);
        border_pixmap(border_pixmap);
        border_pixel(border_pixel);
        bit_gravity(bit_gravity);
        win_gravity(win_gravity);
        backing_store(backing_store);
        backing_planes(backing_planes);
        backing_pixel(backing_pixel);
        save_under(save_under);
        event_mask(event_mask);
        do_not_propagate_mask(do_not_propagate_mask);
        override_redirect(override_redirect);
        colormap(colormap);
        cursor(cursor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XSetWindowAttributes set(XSetWindowAttributes src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link XSetWindowAttributes} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XSetWindowAttributes malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link XSetWindowAttributes} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XSetWindowAttributes calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link XSetWindowAttributes} instance allocated with {@link BufferUtils}. */
    public static XSetWindowAttributes create() {
        return new XSetWindowAttributes(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link XSetWindowAttributes} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static XSetWindowAttributes create(long address) {
        return address == NULL ? null : new XSetWindowAttributes(address, null);
    }

    /**
     * Returns a new {@link XSetWindowAttributes.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XSetWindowAttributes.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XSetWindowAttributes.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link XSetWindowAttributes.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link XSetWindowAttributes} instance allocated on the thread-local {@link MemoryStack}. */
    public static XSetWindowAttributes mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link XSetWindowAttributes} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XSetWindowAttributes callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link XSetWindowAttributes} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XSetWindowAttributes mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link XSetWindowAttributes} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XSetWindowAttributes callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XSetWindowAttributes.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XSetWindowAttributes.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XSetWindowAttributes.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XSetWindowAttributes.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #background_pixmap}. */
    public static long nbackground_pixmap(long struct) { return memGetAddress(struct + XSetWindowAttributes.BACKGROUND_PIXMAP); }
    /** Unsafe version of {@link #background_pixel}. */
    public static long nbackground_pixel(long struct) { return memGetAddress(struct + XSetWindowAttributes.BACKGROUND_PIXEL); }
    /** Unsafe version of {@link #border_pixmap}. */
    public static long nborder_pixmap(long struct) { return memGetAddress(struct + XSetWindowAttributes.BORDER_PIXMAP); }
    /** Unsafe version of {@link #border_pixel}. */
    public static long nborder_pixel(long struct) { return memGetAddress(struct + XSetWindowAttributes.BORDER_PIXEL); }
    /** Unsafe version of {@link #bit_gravity}. */
    public static int nbit_gravity(long struct) { return memGetInt(struct + XSetWindowAttributes.BIT_GRAVITY); }
    /** Unsafe version of {@link #win_gravity}. */
    public static int nwin_gravity(long struct) { return memGetInt(struct + XSetWindowAttributes.WIN_GRAVITY); }
    /** Unsafe version of {@link #backing_store}. */
    public static int nbacking_store(long struct) { return memGetInt(struct + XSetWindowAttributes.BACKING_STORE); }
    /** Unsafe version of {@link #backing_planes}. */
    public static long nbacking_planes(long struct) { return memGetAddress(struct + XSetWindowAttributes.BACKING_PLANES); }
    /** Unsafe version of {@link #backing_pixel}. */
    public static long nbacking_pixel(long struct) { return memGetAddress(struct + XSetWindowAttributes.BACKING_PIXEL); }
    /** Unsafe version of {@link #save_under}. */
    public static int nsave_under(long struct) { return memGetInt(struct + XSetWindowAttributes.SAVE_UNDER); }
    /** Unsafe version of {@link #event_mask}. */
    public static long nevent_mask(long struct) { return memGetAddress(struct + XSetWindowAttributes.EVENT_MASK); }
    /** Unsafe version of {@link #do_not_propagate_mask}. */
    public static long ndo_not_propagate_mask(long struct) { return memGetAddress(struct + XSetWindowAttributes.DO_NOT_PROPAGATE_MASK); }
    /** Unsafe version of {@link #override_redirect}. */
    public static int noverride_redirect(long struct) { return memGetInt(struct + XSetWindowAttributes.OVERRIDE_REDIRECT); }
    /** Unsafe version of {@link #colormap}. */
    public static long ncolormap(long struct) { return memGetAddress(struct + XSetWindowAttributes.COLORMAP); }
    /** Unsafe version of {@link #cursor}. */
    public static long ncursor(long struct) { return memGetAddress(struct + XSetWindowAttributes.CURSOR); }

    /** Unsafe version of {@link #background_pixmap(long) background_pixmap}. */
    public static void nbackground_pixmap(long struct, long value) { memPutAddress(struct + XSetWindowAttributes.BACKGROUND_PIXMAP, value); }
    /** Unsafe version of {@link #background_pixel(long) background_pixel}. */
    public static void nbackground_pixel(long struct, long value) { memPutAddress(struct + XSetWindowAttributes.BACKGROUND_PIXEL, value); }
    /** Unsafe version of {@link #border_pixmap(long) border_pixmap}. */
    public static void nborder_pixmap(long struct, long value) { memPutAddress(struct + XSetWindowAttributes.BORDER_PIXMAP, value); }
    /** Unsafe version of {@link #border_pixel(long) border_pixel}. */
    public static void nborder_pixel(long struct, long value) { memPutAddress(struct + XSetWindowAttributes.BORDER_PIXEL, value); }
    /** Unsafe version of {@link #bit_gravity(int) bit_gravity}. */
    public static void nbit_gravity(long struct, int value) { memPutInt(struct + XSetWindowAttributes.BIT_GRAVITY, value); }
    /** Unsafe version of {@link #win_gravity(int) win_gravity}. */
    public static void nwin_gravity(long struct, int value) { memPutInt(struct + XSetWindowAttributes.WIN_GRAVITY, value); }
    /** Unsafe version of {@link #backing_store(int) backing_store}. */
    public static void nbacking_store(long struct, int value) { memPutInt(struct + XSetWindowAttributes.BACKING_STORE, value); }
    /** Unsafe version of {@link #backing_planes(long) backing_planes}. */
    public static void nbacking_planes(long struct, long value) { memPutAddress(struct + XSetWindowAttributes.BACKING_PLANES, value); }
    /** Unsafe version of {@link #backing_pixel(long) backing_pixel}. */
    public static void nbacking_pixel(long struct, long value) { memPutAddress(struct + XSetWindowAttributes.BACKING_PIXEL, value); }
    /** Unsafe version of {@link #save_under(boolean) save_under}. */
    public static void nsave_under(long struct, int value) { memPutInt(struct + XSetWindowAttributes.SAVE_UNDER, value); }
    /** Unsafe version of {@link #event_mask(long) event_mask}. */
    public static void nevent_mask(long struct, long value) { memPutAddress(struct + XSetWindowAttributes.EVENT_MASK, value); }
    /** Unsafe version of {@link #do_not_propagate_mask(long) do_not_propagate_mask}. */
    public static void ndo_not_propagate_mask(long struct, long value) { memPutAddress(struct + XSetWindowAttributes.DO_NOT_PROPAGATE_MASK, value); }
    /** Unsafe version of {@link #override_redirect(boolean) override_redirect}. */
    public static void noverride_redirect(long struct, int value) { memPutInt(struct + XSetWindowAttributes.OVERRIDE_REDIRECT, value); }
    /** Unsafe version of {@link #colormap(long) colormap}. */
    public static void ncolormap(long struct, long value) { memPutAddress(struct + XSetWindowAttributes.COLORMAP, value); }
    /** Unsafe version of {@link #cursor(long) cursor}. */
    public static void ncursor(long struct, long value) { memPutAddress(struct + XSetWindowAttributes.CURSOR, value); }

    // -----------------------------------

    /** An array of {@link XSetWindowAttributes} structs. */
    public static class Buffer extends StructBuffer<XSetWindowAttributes, Buffer> implements NativeResource {

        /**
         * Creates a new {@link XSetWindowAttributes.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XSetWindowAttributes#SIZEOF}, and its mark will be undefined.
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
        protected XSetWindowAttributes newInstance(long address) {
            return new XSetWindowAttributes(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code background_pixmap} field. */
        @NativeType("Pixmap")
        public long background_pixmap() { return XSetWindowAttributes.nbackground_pixmap(address()); }
        /** Returns the value of the {@code background_pixel} field. */
        @NativeType("unsigned long")
        public long background_pixel() { return XSetWindowAttributes.nbackground_pixel(address()); }
        /** Returns the value of the {@code border_pixmap} field. */
        @NativeType("Pixmap")
        public long border_pixmap() { return XSetWindowAttributes.nborder_pixmap(address()); }
        /** Returns the value of the {@code border_pixel} field. */
        @NativeType("unsigned long")
        public long border_pixel() { return XSetWindowAttributes.nborder_pixel(address()); }
        /** Returns the value of the {@code bit_gravity} field. */
        public int bit_gravity() { return XSetWindowAttributes.nbit_gravity(address()); }
        /** Returns the value of the {@code win_gravity} field. */
        public int win_gravity() { return XSetWindowAttributes.nwin_gravity(address()); }
        /** Returns the value of the {@code backing_store} field. */
        public int backing_store() { return XSetWindowAttributes.nbacking_store(address()); }
        /** Returns the value of the {@code backing_planes} field. */
        @NativeType("unsigned long")
        public long backing_planes() { return XSetWindowAttributes.nbacking_planes(address()); }
        /** Returns the value of the {@code backing_pixel} field. */
        @NativeType("unsigned long")
        public long backing_pixel() { return XSetWindowAttributes.nbacking_pixel(address()); }
        /** Returns the value of the {@code save_under} field. */
        @NativeType("Bool")
        public boolean save_under() { return XSetWindowAttributes.nsave_under(address()) != 0; }
        /** Returns the value of the {@code event_mask} field. */
        public long event_mask() { return XSetWindowAttributes.nevent_mask(address()); }
        /** Returns the value of the {@code do_not_propagate_mask} field. */
        public long do_not_propagate_mask() { return XSetWindowAttributes.ndo_not_propagate_mask(address()); }
        /** Returns the value of the {@code override_redirect} field. */
        @NativeType("Bool")
        public boolean override_redirect() { return XSetWindowAttributes.noverride_redirect(address()) != 0; }
        /** Returns the value of the {@code colormap} field. */
        @NativeType("Colormap")
        public long colormap() { return XSetWindowAttributes.ncolormap(address()); }
        /** Returns the value of the {@code cursor} field. */
        @NativeType("Cursor")
        public long cursor() { return XSetWindowAttributes.ncursor(address()); }

        /** Sets the specified value to the {@code background_pixmap} field. */
        public XSetWindowAttributes.Buffer background_pixmap(@NativeType("Pixmap") long value) { XSetWindowAttributes.nbackground_pixmap(address(), value); return this; }
        /** Sets the specified value to the {@code background_pixel} field. */
        public XSetWindowAttributes.Buffer background_pixel(@NativeType("unsigned long") long value) { XSetWindowAttributes.nbackground_pixel(address(), value); return this; }
        /** Sets the specified value to the {@code border_pixmap} field. */
        public XSetWindowAttributes.Buffer border_pixmap(@NativeType("Pixmap") long value) { XSetWindowAttributes.nborder_pixmap(address(), value); return this; }
        /** Sets the specified value to the {@code border_pixel} field. */
        public XSetWindowAttributes.Buffer border_pixel(@NativeType("unsigned long") long value) { XSetWindowAttributes.nborder_pixel(address(), value); return this; }
        /** Sets the specified value to the {@code bit_gravity} field. */
        public XSetWindowAttributes.Buffer bit_gravity(int value) { XSetWindowAttributes.nbit_gravity(address(), value); return this; }
        /** Sets the specified value to the {@code win_gravity} field. */
        public XSetWindowAttributes.Buffer win_gravity(int value) { XSetWindowAttributes.nwin_gravity(address(), value); return this; }
        /** Sets the specified value to the {@code backing_store} field. */
        public XSetWindowAttributes.Buffer backing_store(int value) { XSetWindowAttributes.nbacking_store(address(), value); return this; }
        /** Sets the specified value to the {@code backing_planes} field. */
        public XSetWindowAttributes.Buffer backing_planes(@NativeType("unsigned long") long value) { XSetWindowAttributes.nbacking_planes(address(), value); return this; }
        /** Sets the specified value to the {@code backing_pixel} field. */
        public XSetWindowAttributes.Buffer backing_pixel(@NativeType("unsigned long") long value) { XSetWindowAttributes.nbacking_pixel(address(), value); return this; }
        /** Sets the specified value to the {@code save_under} field. */
        public XSetWindowAttributes.Buffer save_under(@NativeType("Bool") boolean value) { XSetWindowAttributes.nsave_under(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code event_mask} field. */
        public XSetWindowAttributes.Buffer event_mask(long value) { XSetWindowAttributes.nevent_mask(address(), value); return this; }
        /** Sets the specified value to the {@code do_not_propagate_mask} field. */
        public XSetWindowAttributes.Buffer do_not_propagate_mask(long value) { XSetWindowAttributes.ndo_not_propagate_mask(address(), value); return this; }
        /** Sets the specified value to the {@code override_redirect} field. */
        public XSetWindowAttributes.Buffer override_redirect(@NativeType("Bool") boolean value) { XSetWindowAttributes.noverride_redirect(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code colormap} field. */
        public XSetWindowAttributes.Buffer colormap(@NativeType("Colormap") long value) { XSetWindowAttributes.ncolormap(address(), value); return this; }
        /** Sets the specified value to the {@code cursor} field. */
        public XSetWindowAttributes.Buffer cursor(@NativeType("Cursor") long value) { XSetWindowAttributes.ncursor(address(), value); return this; }

    }

}