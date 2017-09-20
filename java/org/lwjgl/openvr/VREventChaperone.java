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
 * struct VREvent_Chaperone_t {
 *     uint64_t m_nPreviousUniverse;
 *     uint64_t m_nCurrentUniverse;
 * }</pre></code>
 */
@NativeType("struct VREvent_Chaperone_t")
public class VREventChaperone extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NPREVIOUSUNIVERSE,
        M_NCURRENTUNIVERSE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NPREVIOUSUNIVERSE = layout.offsetof(0);
        M_NCURRENTUNIVERSE = layout.offsetof(1);
    }

    VREventChaperone(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventChaperone} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventChaperone(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_nPreviousUniverse} field. */
    @NativeType("uint64_t")
    public long m_nPreviousUniverse() { return nm_nPreviousUniverse(address()); }
    /** Returns the value of the {@code m_nCurrentUniverse} field. */
    @NativeType("uint64_t")
    public long m_nCurrentUniverse() { return nm_nCurrentUniverse(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventChaperone} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventChaperone create(long address) {
        return address == NULL ? null : new VREventChaperone(address, null);
    }

    /**
     * Create a {@link VREventChaperone.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_nPreviousUniverse}. */
    public static long nm_nPreviousUniverse(long struct) { return memGetLong(struct + VREventChaperone.M_NPREVIOUSUNIVERSE); }
    /** Unsafe version of {@link #m_nCurrentUniverse}. */
    public static long nm_nCurrentUniverse(long struct) { return memGetLong(struct + VREventChaperone.M_NCURRENTUNIVERSE); }

    // -----------------------------------

    /** An array of {@link VREventChaperone} structs. */
    public static class Buffer extends StructBuffer<VREventChaperone, Buffer> {

        /**
         * Creates a new {@link VREventChaperone.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventChaperone#SIZEOF}, and its mark will be undefined.
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
        protected VREventChaperone newInstance(long address) {
            return new VREventChaperone(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code m_nPreviousUniverse} field. */
        @NativeType("uint64_t")
        public long m_nPreviousUniverse() { return VREventChaperone.nm_nPreviousUniverse(address()); }
        /** Returns the value of the {@code m_nCurrentUniverse} field. */
        @NativeType("uint64_t")
        public long m_nCurrentUniverse() { return VREventChaperone.nm_nCurrentUniverse(address()); }

    }

}