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
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Ipd_t {
 *     float ipdMeters;
 * }</pre></code>
 */
@NativeType("struct VREvent_Ipd_t")
public class VREventIpd extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IPDMETERS;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IPDMETERS = layout.offsetof(0);
    }

    VREventIpd(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventIpd} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventIpd(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code ipdMeters} field. */
    public float ipdMeters() { return nipdMeters(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventIpd} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventIpd create(long address) {
        return address == NULL ? null : new VREventIpd(address, null);
    }

    /**
     * Create a {@link VREventIpd.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ipdMeters}. */
    public static float nipdMeters(long struct) { return memGetFloat(struct + VREventIpd.IPDMETERS); }

    // -----------------------------------

    /** An array of {@link VREventIpd} structs. */
    public static class Buffer extends StructBuffer<VREventIpd, Buffer> {

        /**
         * Creates a new {@link VREventIpd.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventIpd#SIZEOF}, and its mark will be undefined.
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
        protected VREventIpd newInstance(long address) {
            return new VREventIpd(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code ipdMeters} field. */
        public float ipdMeters() { return VREventIpd.nipdMeters(address()); }

    }

}