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
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VROverlayIntersectionParams_t {
    {@link HmdVector3 HmdVector3_t} vSource;
    {@link HmdVector3 HmdVector3_t} vDirection;
    ETrackingUniverseOrigin eOrigin;
}</code></pre>
 */
public class VROverlayIntersectionParams extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VSOURCE,
        VDIRECTION,
        EORIGIN;

    static {
        Layout layout = __struct(
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VSOURCE = layout.offsetof(0);
        VDIRECTION = layout.offsetof(1);
        EORIGIN = layout.offsetof(2);
    }

    VROverlayIntersectionParams(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VROverlayIntersectionParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VROverlayIntersectionParams(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdVector3} view of the {@code vSource} field. */
    public HmdVector3 vSource() { return nvSource(address()); }
    /** Returns a {@link HmdVector3} view of the {@code vDirection} field. */
    public HmdVector3 vDirection() { return nvDirection(address()); }
    /** Returns the value of the {@code eOrigin} field. */
    public int eOrigin() { return neOrigin(address()); }

    /** Copies the specified {@link HmdVector3} to the {@code vSource} field. */
    public VROverlayIntersectionParams vSource(HmdVector3 value) { nvSource(address(), value); return this; }
    /** Copies the specified {@link HmdVector3} to the {@code vDirection} field. */
    public VROverlayIntersectionParams vDirection(HmdVector3 value) { nvDirection(address(), value); return this; }
    /** Sets the specified value to the {@code eOrigin} field. */
    public VROverlayIntersectionParams eOrigin(int value) { neOrigin(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VROverlayIntersectionParams set(
        HmdVector3 vSource,
        HmdVector3 vDirection,
        int eOrigin
    ) {
        vSource(vSource);
        vDirection(vDirection);
        eOrigin(eOrigin);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VROverlayIntersectionParams set(VROverlayIntersectionParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VROverlayIntersectionParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionParams malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VROverlayIntersectionParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionParams calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VROverlayIntersectionParams} instance allocated with {@link BufferUtils}. */
    public static VROverlayIntersectionParams create() {
        return new VROverlayIntersectionParams(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VROverlayIntersectionParams} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VROverlayIntersectionParams create(long address) {
        return address == NULL ? null : new VROverlayIntersectionParams(address, null);
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VROverlayIntersectionParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VROverlayIntersectionParams} instance allocated on the thread-local {@link MemoryStack}. */
    public static VROverlayIntersectionParams mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VROverlayIntersectionParams} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VROverlayIntersectionParams callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionParams mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionParams callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vSource}. */
    public static HmdVector3 nvSource(long struct) { return HmdVector3.create(struct + VROverlayIntersectionParams.VSOURCE); }
    /** Unsafe version of {@link #vDirection}. */
    public static HmdVector3 nvDirection(long struct) { return HmdVector3.create(struct + VROverlayIntersectionParams.VDIRECTION); }
    /** Unsafe version of {@link #eOrigin}. */
    public static int neOrigin(long struct) { return memGetInt(struct + VROverlayIntersectionParams.EORIGIN); }

    /** Unsafe version of {@link #vSource(HmdVector3) vSource}. */
    public static void nvSource(long struct, HmdVector3 value) { memCopy(value.address(), struct + VROverlayIntersectionParams.VSOURCE, HmdVector3.SIZEOF); }
    /** Unsafe version of {@link #vDirection(HmdVector3) vDirection}. */
    public static void nvDirection(long struct, HmdVector3 value) { memCopy(value.address(), struct + VROverlayIntersectionParams.VDIRECTION, HmdVector3.SIZEOF); }
    /** Unsafe version of {@link #eOrigin(int) eOrigin}. */
    public static void neOrigin(long struct, int value) { memPutInt(struct + VROverlayIntersectionParams.EORIGIN, value); }

    // -----------------------------------

    /** An array of {@link VROverlayIntersectionParams} structs. */
    public static class Buffer extends StructBuffer<VROverlayIntersectionParams, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VROverlayIntersectionParams.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VROverlayIntersectionParams#SIZEOF}, and its mark will be undefined.
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
        protected VROverlayIntersectionParams newInstance(long address) {
            return new VROverlayIntersectionParams(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link HmdVector3} view of the {@code vSource} field. */
        public HmdVector3 vSource() { return VROverlayIntersectionParams.nvSource(address()); }
        /** Returns a {@link HmdVector3} view of the {@code vDirection} field. */
        public HmdVector3 vDirection() { return VROverlayIntersectionParams.nvDirection(address()); }
        /** Returns the value of the {@code eOrigin} field. */
        public int eOrigin() { return VROverlayIntersectionParams.neOrigin(address()); }

        /** Copies the specified {@link HmdVector3} to the {@code vSource} field. */
        public VROverlayIntersectionParams.Buffer vSource(HmdVector3 value) { VROverlayIntersectionParams.nvSource(address(), value); return this; }
        /** Copies the specified {@link HmdVector3} to the {@code vDirection} field. */
        public VROverlayIntersectionParams.Buffer vDirection(HmdVector3 value) { VROverlayIntersectionParams.nvDirection(address(), value); return this; }
        /** Sets the specified value to the {@code eOrigin} field. */
        public VROverlayIntersectionParams.Buffer eOrigin(int value) { VROverlayIntersectionParams.neOrigin(address(), value); return this; }

    }

}