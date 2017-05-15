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
 * When in mouse input mode you can receive data from the touchpad, these events are only sent if the users finger is on the touchpad (or just released from
 * it).
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
public class VREventTouchPadMove extends Struct implements NativeResource {

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

    /** Sets the specified value to the {@code bFingerDown} field. */
    public VREventTouchPadMove bFingerDown(boolean value) { nbFingerDown(address(), value); return this; }
    /** Sets the specified value to the {@code flSecondsFingerDown} field. */
    public VREventTouchPadMove flSecondsFingerDown(float value) { nflSecondsFingerDown(address(), value); return this; }
    /** Sets the specified value to the {@code fValueXFirst} field. */
    public VREventTouchPadMove fValueXFirst(float value) { nfValueXFirst(address(), value); return this; }
    /** Sets the specified value to the {@code fValueYFirst} field. */
    public VREventTouchPadMove fValueYFirst(float value) { nfValueYFirst(address(), value); return this; }
    /** Sets the specified value to the {@code fValueXRaw} field. */
    public VREventTouchPadMove fValueXRaw(float value) { nfValueXRaw(address(), value); return this; }
    /** Sets the specified value to the {@code fValueYRaw} field. */
    public VREventTouchPadMove fValueYRaw(float value) { nfValueYRaw(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VREventTouchPadMove set(
        boolean bFingerDown,
        float flSecondsFingerDown,
        float fValueXFirst,
        float fValueYFirst,
        float fValueXRaw,
        float fValueYRaw
    ) {
        bFingerDown(bFingerDown);
        flSecondsFingerDown(flSecondsFingerDown);
        fValueXFirst(fValueXFirst);
        fValueYFirst(fValueYFirst);
        fValueXRaw(fValueXRaw);
        fValueYRaw(fValueYRaw);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventTouchPadMove set(VREventTouchPadMove src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventTouchPadMove} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventTouchPadMove malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventTouchPadMove} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventTouchPadMove calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventTouchPadMove} instance allocated with {@link BufferUtils}. */
    public static VREventTouchPadMove create() {
        return new VREventTouchPadMove(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventTouchPadMove} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventTouchPadMove create(long address) {
        return address == NULL ? null : new VREventTouchPadMove(address, null);
    }

    /**
     * Returns a new {@link VREventTouchPadMove.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventTouchPadMove.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventTouchPadMove.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
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

    /** Returns a new {@link VREventTouchPadMove} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventTouchPadMove mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventTouchPadMove} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventTouchPadMove callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventTouchPadMove} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventTouchPadMove mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventTouchPadMove} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventTouchPadMove callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventTouchPadMove.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventTouchPadMove.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventTouchPadMove.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventTouchPadMove.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

    /** Unsafe version of {@link #bFingerDown(boolean) bFingerDown}. */
    public static void nbFingerDown(long struct, boolean value) { memPutByte(struct + VREventTouchPadMove.BFINGERDOWN, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #flSecondsFingerDown(float) flSecondsFingerDown}. */
    public static void nflSecondsFingerDown(long struct, float value) { memPutFloat(struct + VREventTouchPadMove.FLSECONDSFINGERDOWN, value); }
    /** Unsafe version of {@link #fValueXFirst(float) fValueXFirst}. */
    public static void nfValueXFirst(long struct, float value) { memPutFloat(struct + VREventTouchPadMove.FVALUEXFIRST, value); }
    /** Unsafe version of {@link #fValueYFirst(float) fValueYFirst}. */
    public static void nfValueYFirst(long struct, float value) { memPutFloat(struct + VREventTouchPadMove.FVALUEYFIRST, value); }
    /** Unsafe version of {@link #fValueXRaw(float) fValueXRaw}. */
    public static void nfValueXRaw(long struct, float value) { memPutFloat(struct + VREventTouchPadMove.FVALUEXRAW, value); }
    /** Unsafe version of {@link #fValueYRaw(float) fValueYRaw}. */
    public static void nfValueYRaw(long struct, float value) { memPutFloat(struct + VREventTouchPadMove.FVALUEYRAW, value); }

    // -----------------------------------

    /** An array of {@link VREventTouchPadMove} structs. */
    public static class Buffer extends StructBuffer<VREventTouchPadMove, Buffer> implements NativeResource {

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
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code bFingerDown} field. */
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

        /** Sets the specified value to the {@code bFingerDown} field. */
        public VREventTouchPadMove.Buffer bFingerDown(boolean value) { VREventTouchPadMove.nbFingerDown(address(), value); return this; }
        /** Sets the specified value to the {@code flSecondsFingerDown} field. */
        public VREventTouchPadMove.Buffer flSecondsFingerDown(float value) { VREventTouchPadMove.nflSecondsFingerDown(address(), value); return this; }
        /** Sets the specified value to the {@code fValueXFirst} field. */
        public VREventTouchPadMove.Buffer fValueXFirst(float value) { VREventTouchPadMove.nfValueXFirst(address(), value); return this; }
        /** Sets the specified value to the {@code fValueYFirst} field. */
        public VREventTouchPadMove.Buffer fValueYFirst(float value) { VREventTouchPadMove.nfValueYFirst(address(), value); return this; }
        /** Sets the specified value to the {@code fValueXRaw} field. */
        public VREventTouchPadMove.Buffer fValueXRaw(float value) { VREventTouchPadMove.nfValueXRaw(address(), value); return this; }
        /** Sets the specified value to the {@code fValueYRaw} field. */
        public VREventTouchPadMove.Buffer fValueYRaw(float value) { VREventTouchPadMove.nfValueYRaw(address(), value); return this; }

    }

}