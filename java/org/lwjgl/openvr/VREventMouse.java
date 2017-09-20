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
 * Used for simulated mouse events in overlay space.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; coords are in GL space, bottom left of the texture is 0,0</li>
 * <li>{@code button} &ndash; one of:<br><table><tr><td>{@link VR#EVRMouseButton_VRMouseButton_Left}</td><td>{@link VR#EVRMouseButton_VRMouseButton_Right}</td></tr><tr><td>{@link VR#EVRMouseButton_VRMouseButton_Middle}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Mouse_t {
 *     float x;
 *     float y;
 *     uint32_t button;
 * }</pre></code>
 */
@NativeType("struct VREvent_Mouse_t")
public class VREventMouse extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        BUTTON;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        BUTTON = layout.offsetof(2);
    }

    VREventMouse(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventMouse} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventMouse(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** Returns the value of the {@code button} field. */
    @NativeType("uint32_t")
    public int button() { return nbutton(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventMouse} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventMouse create(long address) {
        return address == NULL ? null : new VREventMouse(address, null);
    }

    /**
     * Create a {@link VREventMouse.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + VREventMouse.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + VREventMouse.Y); }
    /** Unsafe version of {@link #button}. */
    public static int nbutton(long struct) { return memGetInt(struct + VREventMouse.BUTTON); }

    // -----------------------------------

    /** An array of {@link VREventMouse} structs. */
    public static class Buffer extends StructBuffer<VREventMouse, Buffer> {

        /**
         * Creates a new {@link VREventMouse.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventMouse#SIZEOF}, and its mark will be undefined.
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
        protected VREventMouse newInstance(long address) {
            return new VREventMouse(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code x} field. */
        public float x() { return VREventMouse.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public float y() { return VREventMouse.ny(address()); }
        /** Returns the value of the {@code button} field. */
        @NativeType("uint32_t")
        public int button() { return VREventMouse.nbutton(address()); }

    }

}