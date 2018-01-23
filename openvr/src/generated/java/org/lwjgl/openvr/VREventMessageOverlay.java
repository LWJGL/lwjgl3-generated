/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code unVRMessageOverlayResponse} &ndash; one of:<br><table><tr><td>{@link VR#VRMessageOverlayResponse_ButtonPress_0}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_ButtonPress_1}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_ButtonPress_2}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_ButtonPress_3}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_CouldntFindSystemOverlay}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_CouldntFindOrCreateClientOverlay}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_ApplicationQuit}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_MessageOverlay_t {
 *     uint32_t unVRMessageOverlayResponse;
 * }</pre></code>
 */
@NativeType("struct VREvent_MessageOverlay_t")
public class VREventMessageOverlay extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UNVRMESSAGEOVERLAYRESPONSE;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UNVRMESSAGEOVERLAYRESPONSE = layout.offsetof(0);
    }

    VREventMessageOverlay(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventMessageOverlay} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventMessageOverlay(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code unVRMessageOverlayResponse} field. */
    @NativeType("uint32_t")
    public int unVRMessageOverlayResponse() { return nunVRMessageOverlayResponse(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventMessageOverlay} instance for the specified memory address. */
    public static VREventMessageOverlay create(long address) {
        return new VREventMessageOverlay(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventMessageOverlay createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VREventMessageOverlay.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventMessageOverlay.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventMessageOverlay.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #unVRMessageOverlayResponse}. */
    public static int nunVRMessageOverlayResponse(long struct) { return memGetInt(struct + VREventMessageOverlay.UNVRMESSAGEOVERLAYRESPONSE); }

    // -----------------------------------

    /** An array of {@link VREventMessageOverlay} structs. */
    public static class Buffer extends StructBuffer<VREventMessageOverlay, Buffer> {

        /**
         * Creates a new {@link VREventMessageOverlay.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventMessageOverlay#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VREventMessageOverlay newInstance(long address) {
            return new VREventMessageOverlay(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code unVRMessageOverlayResponse} field. */
        @NativeType("uint32_t")
        public int unVRMessageOverlayResponse() { return VREventMessageOverlay.nunVRMessageOverlayResponse(address()); }

    }

}