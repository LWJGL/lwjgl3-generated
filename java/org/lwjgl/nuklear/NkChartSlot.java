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
 * <code><pre>
 * struct nk_chart_slot {
 *     enum nk_chart_type type;
 *     {@link NkColor struct nk_color} color;
 *     {@link NkColor struct nk_color} highlight;
 *     float min;
 *     float max;
 *     float range;
 *     int count;
 *     {@link NkVec2 struct nk_vec2} last;
 *     int index;
 * }</pre></code>
 */
public class NkChartSlot extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        COLOR,
        HIGHLIGHT,
        MIN,
        MAX,
        RANGE,
        COUNT,
        LAST,
        INDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        COLOR = layout.offsetof(1);
        HIGHLIGHT = layout.offsetof(2);
        MIN = layout.offsetof(3);
        MAX = layout.offsetof(4);
        RANGE = layout.offsetof(5);
        COUNT = layout.offsetof(6);
        LAST = layout.offsetof(7);
        INDEX = layout.offsetof(8);
    }

    NkChartSlot(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkChartSlot} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkChartSlot(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** Returns a {@link NkColor} view of the {@code color} field. */
    public NkColor color() { return ncolor(address()); }
    /** Returns a {@link NkColor} view of the {@code highlight} field. */
    public NkColor highlight() { return nhighlight(address()); }
    /** Returns the value of the {@code min} field. */
    public float min() { return nmin(address()); }
    /** Returns the value of the {@code max} field. */
    public float max() { return nmax(address()); }
    /** Returns the value of the {@code range} field. */
    public float range() { return nrange(address()); }
    /** Returns the value of the {@code count} field. */
    public int count() { return ncount(address()); }
    /** Returns a {@link NkVec2} view of the {@code last} field. */
    public NkVec2 last() { return nlast(address()); }
    /** Returns the value of the {@code index} field. */
    public int index() { return nindex(address()); }

    // -----------------------------------

    /** Returns a new {@link NkChartSlot} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static NkChartSlot create(long address) {
        return address == NULL ? null : new NkChartSlot(address, null);
    }

    /**
     * Create a {@link NkChartSlot.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + NkChartSlot.TYPE); }
    /** Unsafe version of {@link #color}. */
    public static NkColor ncolor(long struct) { return NkColor.create(struct + NkChartSlot.COLOR); }
    /** Unsafe version of {@link #highlight}. */
    public static NkColor nhighlight(long struct) { return NkColor.create(struct + NkChartSlot.HIGHLIGHT); }
    /** Unsafe version of {@link #min}. */
    public static float nmin(long struct) { return memGetFloat(struct + NkChartSlot.MIN); }
    /** Unsafe version of {@link #max}. */
    public static float nmax(long struct) { return memGetFloat(struct + NkChartSlot.MAX); }
    /** Unsafe version of {@link #range}. */
    public static float nrange(long struct) { return memGetFloat(struct + NkChartSlot.RANGE); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return memGetInt(struct + NkChartSlot.COUNT); }
    /** Unsafe version of {@link #last}. */
    public static NkVec2 nlast(long struct) { return NkVec2.create(struct + NkChartSlot.LAST); }
    /** Unsafe version of {@link #index}. */
    public static int nindex(long struct) { return memGetInt(struct + NkChartSlot.INDEX); }

    // -----------------------------------

    /** An array of {@link NkChartSlot} structs. */
    public static class Buffer extends StructBuffer<NkChartSlot, Buffer> {

        /**
         * Creates a new {@link NkChartSlot.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkChartSlot#SIZEOF}, and its mark will be undefined.
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
        protected NkChartSlot newInstance(long address) {
            return new NkChartSlot(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return NkChartSlot.ntype(address()); }
        /** Returns a {@link NkColor} view of the {@code color} field. */
        public NkColor color() { return NkChartSlot.ncolor(address()); }
        /** Returns a {@link NkColor} view of the {@code highlight} field. */
        public NkColor highlight() { return NkChartSlot.nhighlight(address()); }
        /** Returns the value of the {@code min} field. */
        public float min() { return NkChartSlot.nmin(address()); }
        /** Returns the value of the {@code max} field. */
        public float max() { return NkChartSlot.nmax(address()); }
        /** Returns the value of the {@code range} field. */
        public float range() { return NkChartSlot.nrange(address()); }
        /** Returns the value of the {@code count} field. */
        public int count() { return NkChartSlot.ncount(address()); }
        /** Returns a {@link NkVec2} view of the {@code last} field. */
        public NkVec2 last() { return NkChartSlot.nlast(address()); }
        /** Returns the value of the {@code index} field. */
        public int index() { return NkChartSlot.nindex(address()); }

    }

}