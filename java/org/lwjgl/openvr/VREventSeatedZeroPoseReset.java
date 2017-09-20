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
 * struct VREvent_SeatedZeroPoseReset_t {
 *     bool bResetBySystemMenu;
 * }</pre></code>
 */
@NativeType("struct VREvent_SeatedZeroPoseReset_t")
public class VREventSeatedZeroPoseReset extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BRESETBYSYSTEMMENU;

    static {
        Layout layout = __struct(
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BRESETBYSYSTEMMENU = layout.offsetof(0);
    }

    VREventSeatedZeroPoseReset(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventSeatedZeroPoseReset} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventSeatedZeroPoseReset(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code bResetBySystemMenu} field. */
    @NativeType("bool")
    public boolean bResetBySystemMenu() { return nbResetBySystemMenu(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventSeatedZeroPoseReset} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventSeatedZeroPoseReset create(long address) {
        return address == NULL ? null : new VREventSeatedZeroPoseReset(address, null);
    }

    /**
     * Create a {@link VREventSeatedZeroPoseReset.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bResetBySystemMenu}. */
    public static boolean nbResetBySystemMenu(long struct) { return memGetByte(struct + VREventSeatedZeroPoseReset.BRESETBYSYSTEMMENU) != 0; }

    // -----------------------------------

    /** An array of {@link VREventSeatedZeroPoseReset} structs. */
    public static class Buffer extends StructBuffer<VREventSeatedZeroPoseReset, Buffer> {

        /**
         * Creates a new {@link VREventSeatedZeroPoseReset.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventSeatedZeroPoseReset#SIZEOF}, and its mark will be undefined.
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
        protected VREventSeatedZeroPoseReset newInstance(long address) {
            return new VREventSeatedZeroPoseReset(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code bResetBySystemMenu} field. */
        @NativeType("bool")
        public boolean bResetBySystemMenu() { return VREventSeatedZeroPoseReset.nbResetBySystemMenu(address()); }

    }

}