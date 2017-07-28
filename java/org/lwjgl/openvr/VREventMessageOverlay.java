/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

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
public class VREventMessageOverlay extends Struct implements NativeResource {

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

    VREventMessageOverlay(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventMessageOverlay} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventMessageOverlay(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code unVRMessageOverlayResponse} field. */
    @NativeType("uint32_t")
    public int unVRMessageOverlayResponse() { return nunVRMessageOverlayResponse(address()); }

    /** Sets the specified value to the {@code unVRMessageOverlayResponse} field. */
    public VREventMessageOverlay unVRMessageOverlayResponse(@NativeType("uint32_t") int value) { nunVRMessageOverlayResponse(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventMessageOverlay set(VREventMessageOverlay src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventMessageOverlay} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventMessageOverlay malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventMessageOverlay} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventMessageOverlay calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventMessageOverlay} instance allocated with {@link BufferUtils}. */
    public static VREventMessageOverlay create() {
        return new VREventMessageOverlay(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventMessageOverlay} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventMessageOverlay create(long address) {
        return address == NULL ? null : new VREventMessageOverlay(address, null);
    }

    /**
     * Returns a new {@link VREventMessageOverlay.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventMessageOverlay.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventMessageOverlay.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VREventMessageOverlay.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VREventMessageOverlay} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventMessageOverlay mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventMessageOverlay} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventMessageOverlay callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventMessageOverlay} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventMessageOverlay mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventMessageOverlay} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventMessageOverlay callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventMessageOverlay.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventMessageOverlay.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventMessageOverlay.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventMessageOverlay.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #unVRMessageOverlayResponse}. */
    public static int nunVRMessageOverlayResponse(long struct) { return memGetInt(struct + VREventMessageOverlay.UNVRMESSAGEOVERLAYRESPONSE); }

    /** Unsafe version of {@link #unVRMessageOverlayResponse(int) unVRMessageOverlayResponse}. */
    public static void nunVRMessageOverlayResponse(long struct, int value) { memPutInt(struct + VREventMessageOverlay.UNVRMESSAGEOVERLAYRESPONSE, value); }

    // -----------------------------------

    /** An array of {@link VREventMessageOverlay} structs. */
    public static class Buffer extends StructBuffer<VREventMessageOverlay, Buffer> implements NativeResource {

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
        protected VREventMessageOverlay newInstance(long address) {
            return new VREventMessageOverlay(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code unVRMessageOverlayResponse} field. */
        @NativeType("uint32_t")
        public int unVRMessageOverlayResponse() { return VREventMessageOverlay.nunVRMessageOverlayResponse(address()); }

        /** Sets the specified value to the {@code unVRMessageOverlayResponse} field. */
        public VREventMessageOverlay.Buffer unVRMessageOverlayResponse(@NativeType("uint32_t") int value) { VREventMessageOverlay.nunVRMessageOverlayResponse(address(), value); return this; }

    }

}