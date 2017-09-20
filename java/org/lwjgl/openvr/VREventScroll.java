/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Used for simulated mouse wheel scroll in overlay space.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code xdelta} &ndash; movement in fraction of the pad traversed since last delta, 1.0 for a full swipe</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Scroll_t {
 *     float xdelta;
 *     float ydelta;
 *     uint32_t repeatCount;
 * }</pre></code>
 */
@NativeType("struct VREvent_Scroll_t")
public class VREventScroll extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        XDELTA,
        YDELTA,
        REPEATCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        XDELTA = layout.offsetof(0);
        YDELTA = layout.offsetof(1);
        REPEATCOUNT = layout.offsetof(2);
    }

    VREventScroll(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventScroll} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventScroll(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code xdelta} field. */
    public float xdelta() { return nxdelta(address()); }
    /** Returns the value of the {@code ydelta} field. */
    public float ydelta() { return nydelta(address()); }
    /** Returns the value of the {@code repeatCount} field. */
    @NativeType("uint32_t")
    public int repeatCount() { return nrepeatCount(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventScroll} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventScroll create(long address) {
        return address == NULL ? null : new VREventScroll(address, null);
    }

    /**
     * Create a {@link VREventScroll.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #xdelta}. */
    public static float nxdelta(long struct) { return memGetFloat(struct + VREventScroll.XDELTA); }
    /** Unsafe version of {@link #ydelta}. */
    public static float nydelta(long struct) { return memGetFloat(struct + VREventScroll.YDELTA); }
    /** Unsafe version of {@link #repeatCount}. */
    public static int nrepeatCount(long struct) { return memGetInt(struct + VREventScroll.REPEATCOUNT); }

    // -----------------------------------

    /** An array of {@link VREventScroll} structs. */
    public static class Buffer extends StructBuffer<VREventScroll, Buffer> {

        /**
         * Creates a new {@link VREventScroll.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventScroll#SIZEOF}, and its mark will be undefined.
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
        protected VREventScroll newInstance(long address) {
            return new VREventScroll(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code xdelta} field. */
        public float xdelta() { return VREventScroll.nxdelta(address()); }
        /** Returns the value of the {@code ydelta} field. */
        public float ydelta() { return VREventScroll.nydelta(address()); }
        /** Returns the value of the {@code repeatCount} field. */
        @NativeType("uint32_t")
        public int repeatCount() { return VREventScroll.nrepeatCount(address()); }

    }

}