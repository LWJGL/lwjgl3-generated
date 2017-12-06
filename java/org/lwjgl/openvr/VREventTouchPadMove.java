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
 * When in mouse input mode you can receive data from the touchpad, these events are only sent if the users finger is on the touchpad (or just released from
 * it). These events are sent to overlays with the {@link VR#VROverlayFlags_SendVRTouchpadEvents} flag set.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code bFingerDown} &ndash; true if the users finger is detected on the touch pad</li>
 * <li>{@code flSecondsFingerDown} &ndash; how long the finger has been down in seconds</li>
 * <li>{@code fValueXFirst} &ndash; these values indicate the starting finger position (so you can do some basic swipe stuff)</li>
 * <li>{@code fValueXRaw} &ndash; this is the raw sampled coordinate without deadzoning</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_TouchPadMove_t {
 *     bool bFingerDown;
 *     float flSecondsFingerDown;
 *     float fValueXFirst;
 *     float fValueYFirst;
 *     float fValueXRaw;
 *     float fValueYRaw;
 * }</pre></code>
 */
@NativeType("struct VREvent_TouchPadMove_t")
public class VREventTouchPadMove extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BFINGERDOWN,
        FLSECONDSFINGERDOWN,
        FVALUEXFIRST,
        FVALUEYFIRST,
        FVALUEXRAW,
        FVALUEYRAW;

    static {
        Layout layout = __struct(
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BFINGERDOWN = layout.offsetof(0);
        FLSECONDSFINGERDOWN = layout.offsetof(1);
        FVALUEXFIRST = layout.offsetof(2);
        FVALUEYFIRST = layout.offsetof(3);
        FVALUEXRAW = layout.offsetof(4);
        FVALUEYRAW = layout.offsetof(5);
    }

    VREventTouchPadMove(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventTouchPadMove} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventTouchPadMove(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code bFingerDown} field. */
    @NativeType("bool")
    public boolean bFingerDown() { return nbFingerDown(address()); }
    /** Returns the value of the {@code flSecondsFingerDown} field. */
    public float flSecondsFingerDown() { return nflSecondsFingerDown(address()); }
    /** Returns the value of the {@code fValueXFirst} field. */
    public float fValueXFirst() { return nfValueXFirst(address()); }
    /** Returns the value of the {@code fValueYFirst} field. */
    public float fValueYFirst() { return nfValueYFirst(address()); }
    /** Returns the value of the {@code fValueXRaw} field. */
    public float fValueXRaw() { return nfValueXRaw(address()); }
    /** Returns the value of the {@code fValueYRaw} field. */
    public float fValueYRaw() { return nfValueYRaw(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventTouchPadMove} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventTouchPadMove create(long address) {
        return address == NULL ? null : new VREventTouchPadMove(address, null);
    }

    /**
     * Create a {@link VREventTouchPadMove.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bFingerDown}. */
    public static boolean nbFingerDown(long struct) { return memGetByte(struct + VREventTouchPadMove.BFINGERDOWN) != 0; }
    /** Unsafe version of {@link #flSecondsFingerDown}. */
    public static float nflSecondsFingerDown(long struct) { return memGetFloat(struct + VREventTouchPadMove.FLSECONDSFINGERDOWN); }
    /** Unsafe version of {@link #fValueXFirst}. */
    public static float nfValueXFirst(long struct) { return memGetFloat(struct + VREventTouchPadMove.FVALUEXFIRST); }
    /** Unsafe version of {@link #fValueYFirst}. */
    public static float nfValueYFirst(long struct) { return memGetFloat(struct + VREventTouchPadMove.FVALUEYFIRST); }
    /** Unsafe version of {@link #fValueXRaw}. */
    public static float nfValueXRaw(long struct) { return memGetFloat(struct + VREventTouchPadMove.FVALUEXRAW); }
    /** Unsafe version of {@link #fValueYRaw}. */
    public static float nfValueYRaw(long struct) { return memGetFloat(struct + VREventTouchPadMove.FVALUEYRAW); }

    // -----------------------------------

    /** An array of {@link VREventTouchPadMove} structs. */
    public static class Buffer extends StructBuffer<VREventTouchPadMove, Buffer> {

        /**
         * Creates a new {@link VREventTouchPadMove.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventTouchPadMove#SIZEOF}, and its mark will be undefined.
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
        protected VREventTouchPadMove newInstance(long address) {
            return new VREventTouchPadMove(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code bFingerDown} field. */
        @NativeType("bool")
        public boolean bFingerDown() { return VREventTouchPadMove.nbFingerDown(address()); }
        /** Returns the value of the {@code flSecondsFingerDown} field. */
        public float flSecondsFingerDown() { return VREventTouchPadMove.nflSecondsFingerDown(address()); }
        /** Returns the value of the {@code fValueXFirst} field. */
        public float fValueXFirst() { return VREventTouchPadMove.nfValueXFirst(address()); }
        /** Returns the value of the {@code fValueYFirst} field. */
        public float fValueYFirst() { return VREventTouchPadMove.nfValueYFirst(address()); }
        /** Returns the value of the {@code fValueXRaw} field. */
        public float fValueXRaw() { return VREventTouchPadMove.nfValueXRaw(address()); }
        /** Returns the value of the {@code fValueYRaw} field. */
        public float fValueYRaw() { return VREventTouchPadMove.nfValueYRaw(address()); }

    }

}