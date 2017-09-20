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
 * Used for a few events about overlays.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code overlayHandle} &ndash; one of:<br><table><tr><td>{@link VR#EVRState_VRState_Undefined}</td><td>{@link VR#EVRState_VRState_Off}</td><td>{@link VR#EVRState_VRState_Searching}</td></tr><tr><td>{@link VR#EVRState_VRState_Searching_Alert}</td><td>{@link VR#EVRState_VRState_Ready}</td><td>{@link VR#EVRState_VRState_Ready_Alert}</td></tr><tr><td>{@link VR#EVRState_VRState_NotReady}</td><td>{@link VR#EVRState_VRState_Standby}</td><td>{@link VR#EVRState_VRState_Ready_Alert_Low}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Overlay_t {
 *     uint64_t overlayHandle;
 * }</pre></code>
 */
@NativeType("struct VREvent_Overlay_t")
public class VREventOverlay extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OVERLAYHANDLE;

    static {
        Layout layout = __struct(
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OVERLAYHANDLE = layout.offsetof(0);
    }

    VREventOverlay(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventOverlay} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventOverlay(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code overlayHandle} field. */
    @NativeType("uint64_t")
    public long overlayHandle() { return noverlayHandle(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventOverlay} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventOverlay create(long address) {
        return address == NULL ? null : new VREventOverlay(address, null);
    }

    /**
     * Create a {@link VREventOverlay.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #overlayHandle}. */
    public static long noverlayHandle(long struct) { return memGetLong(struct + VREventOverlay.OVERLAYHANDLE); }

    // -----------------------------------

    /** An array of {@link VREventOverlay} structs. */
    public static class Buffer extends StructBuffer<VREventOverlay, Buffer> {

        /**
         * Creates a new {@link VREventOverlay.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventOverlay#SIZEOF}, and its mark will be undefined.
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
        protected VREventOverlay newInstance(long address) {
            return new VREventOverlay(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code overlayHandle} field. */
        @NativeType("uint64_t")
        public long overlayHandle() { return VREventOverlay.noverlayHandle(address()); }

    }

}