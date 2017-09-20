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
 * struct VREvent_ApplicationLaunch_t {
 *     uint32_t pid;
 *     uint32_t unArgsHandle;
 * }</pre></code>
 */
@NativeType("struct VREvent_ApplicationLaunch_t")
public class VREventApplicationLaunch extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PID,
        UNARGSHANDLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PID = layout.offsetof(0);
        UNARGSHANDLE = layout.offsetof(1);
    }

    VREventApplicationLaunch(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventApplicationLaunch} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventApplicationLaunch(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code pid} field. */
    @NativeType("uint32_t")
    public int pid() { return npid(address()); }
    /** Returns the value of the {@code unArgsHandle} field. */
    @NativeType("uint32_t")
    public int unArgsHandle() { return nunArgsHandle(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventApplicationLaunch} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventApplicationLaunch create(long address) {
        return address == NULL ? null : new VREventApplicationLaunch(address, null);
    }

    /**
     * Create a {@link VREventApplicationLaunch.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pid}. */
    public static int npid(long struct) { return memGetInt(struct + VREventApplicationLaunch.PID); }
    /** Unsafe version of {@link #unArgsHandle}. */
    public static int nunArgsHandle(long struct) { return memGetInt(struct + VREventApplicationLaunch.UNARGSHANDLE); }

    // -----------------------------------

    /** An array of {@link VREventApplicationLaunch} structs. */
    public static class Buffer extends StructBuffer<VREventApplicationLaunch, Buffer> {

        /**
         * Creates a new {@link VREventApplicationLaunch.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventApplicationLaunch#SIZEOF}, and its mark will be undefined.
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
        protected VREventApplicationLaunch newInstance(long address) {
            return new VREventApplicationLaunch(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code pid} field. */
        @NativeType("uint32_t")
        public int pid() { return VREventApplicationLaunch.npid(address()); }
        /** Returns the value of the {@code unArgsHandle} field. */
        @NativeType("uint32_t")
        public int unArgsHandle() { return VREventApplicationLaunch.nunArgsHandle(address()); }

    }

}