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
 * struct VREvent_Screenshot_t {
 *     uint32_t handle;
 *     uint32_t type;
 * }</pre></code>
 */
@NativeType("struct VREvent_Screenshot_t")
public class VREventScreenshot extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        TYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        TYPE = layout.offsetof(1);
    }

    VREventScreenshot(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventScreenshot} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventScreenshot(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code handle} field. */
    @NativeType("uint32_t")
    public int handle() { return nhandle(address()); }
    /** Returns the value of the {@code type} field. */
    @NativeType("uint32_t")
    public int type() { return ntype(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventScreenshot} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventScreenshot create(long address) {
        return address == NULL ? null : new VREventScreenshot(address, null);
    }

    /**
     * Create a {@link VREventScreenshot.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static int nhandle(long struct) { return memGetInt(struct + VREventScreenshot.HANDLE); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VREventScreenshot.TYPE); }

    // -----------------------------------

    /** An array of {@link VREventScreenshot} structs. */
    public static class Buffer extends StructBuffer<VREventScreenshot, Buffer> {

        /**
         * Creates a new {@link VREventScreenshot.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventScreenshot#SIZEOF}, and its mark will be undefined.
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
        protected VREventScreenshot newInstance(long address) {
            return new VREventScreenshot(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code handle} field. */
        @NativeType("uint32_t")
        public int handle() { return VREventScreenshot.nhandle(address()); }
        /** Returns the value of the {@code type} field. */
        @NativeType("uint32_t")
        public int type() { return VREventScreenshot.ntype(address()); }

    }

}