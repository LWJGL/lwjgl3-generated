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
 * Not actually used for any events.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Reserved_t {
 *     uint64_t reserved0;
 *     uint64_t reserved1;
 * }</pre></code>
 */
@NativeType("struct VREvent_Reserved_t")
public class VREventReserved extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESERVED0,
        RESERVED1;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESERVED0 = layout.offsetof(0);
        RESERVED1 = layout.offsetof(1);
    }

    VREventReserved(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventReserved} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventReserved(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code reserved0} field. */
    @NativeType("uint64_t")
    public long reserved0() { return nreserved0(address()); }
    /** Returns the value of the {@code reserved1} field. */
    @NativeType("uint64_t")
    public long reserved1() { return nreserved1(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventReserved} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventReserved create(long address) {
        return address == NULL ? null : new VREventReserved(address, null);
    }

    /**
     * Create a {@link VREventReserved.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #reserved0}. */
    public static long nreserved0(long struct) { return memGetLong(struct + VREventReserved.RESERVED0); }
    /** Unsafe version of {@link #reserved1}. */
    public static long nreserved1(long struct) { return memGetLong(struct + VREventReserved.RESERVED1); }

    // -----------------------------------

    /** An array of {@link VREventReserved} structs. */
    public static class Buffer extends StructBuffer<VREventReserved, Buffer> {

        /**
         * Creates a new {@link VREventReserved.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventReserved#SIZEOF}, and its mark will be undefined.
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
        protected VREventReserved newInstance(long address) {
            return new VREventReserved(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code reserved0} field. */
        @NativeType("uint64_t")
        public long reserved0() { return VREventReserved.nreserved0(address()); }
        /** Returns the value of the {@code reserved1} field. */
        @NativeType("uint64_t")
        public long reserved1() { return VREventReserved.nreserved1(address()); }

    }

}