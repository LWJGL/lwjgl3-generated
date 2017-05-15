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
 * <code><pre>
 * struct VROverlayIntersectionResults_t {
 *     {@link HmdVector3 HmdVector3_t} vPoint;
 *     {@link HmdVector3 HmdVector3_t} vNormal;
 *     {@link HmdVector2 HmdVector2_t} vUVs;
 *     float fDistance;
 * }</pre></code>
 */
public class VROverlayIntersectionResults extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VPOINT,
        VNORMAL,
        VUVS,
        FDISTANCE;

    static {
        Layout layout = __struct(
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(HmdVector2.SIZEOF, HmdVector2.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VPOINT = layout.offsetof(0);
        VNORMAL = layout.offsetof(1);
        VUVS = layout.offsetof(2);
        FDISTANCE = layout.offsetof(3);
    }

    VROverlayIntersectionResults(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VROverlayIntersectionResults} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VROverlayIntersectionResults(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdVector3} view of the {@code vPoint} field. */
    public HmdVector3 vPoint() { return nvPoint(address()); }
    /** Returns a {@link HmdVector3} view of the {@code vNormal} field. */
    public HmdVector3 vNormal() { return nvNormal(address()); }
    /** Returns a {@link HmdVector2} view of the {@code vUVs} field. */
    public HmdVector2 vUVs() { return nvUVs(address()); }
    /** Returns the value of the {@code fDistance} field. */
    public float fDistance() { return nfDistance(address()); }

    /** Copies the specified {@link HmdVector3} to the {@code vPoint} field. */
    public VROverlayIntersectionResults vPoint(HmdVector3 value) { nvPoint(address(), value); return this; }
    /** Copies the specified {@link HmdVector3} to the {@code vNormal} field. */
    public VROverlayIntersectionResults vNormal(HmdVector3 value) { nvNormal(address(), value); return this; }
    /** Copies the specified {@link HmdVector2} to the {@code vUVs} field. */
    public VROverlayIntersectionResults vUVs(HmdVector2 value) { nvUVs(address(), value); return this; }
    /** Sets the specified value to the {@code fDistance} field. */
    public VROverlayIntersectionResults fDistance(float value) { nfDistance(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VROverlayIntersectionResults set(
        HmdVector3 vPoint,
        HmdVector3 vNormal,
        HmdVector2 vUVs,
        float fDistance
    ) {
        vPoint(vPoint);
        vNormal(vNormal);
        vUVs(vUVs);
        fDistance(fDistance);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VROverlayIntersectionResults set(VROverlayIntersectionResults src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VROverlayIntersectionResults} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionResults malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VROverlayIntersectionResults} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionResults calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VROverlayIntersectionResults} instance allocated with {@link BufferUtils}. */
    public static VROverlayIntersectionResults create() {
        return new VROverlayIntersectionResults(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VROverlayIntersectionResults} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VROverlayIntersectionResults create(long address) {
        return address == NULL ? null : new VROverlayIntersectionResults(address, null);
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VROverlayIntersectionResults.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VROverlayIntersectionResults} instance allocated on the thread-local {@link MemoryStack}. */
    public static VROverlayIntersectionResults mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VROverlayIntersectionResults} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VROverlayIntersectionResults callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionResults mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionResults callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vPoint}. */
    public static HmdVector3 nvPoint(long struct) { return HmdVector3.create(struct + VROverlayIntersectionResults.VPOINT); }
    /** Unsafe version of {@link #vNormal}. */
    public static HmdVector3 nvNormal(long struct) { return HmdVector3.create(struct + VROverlayIntersectionResults.VNORMAL); }
    /** Unsafe version of {@link #vUVs}. */
    public static HmdVector2 nvUVs(long struct) { return HmdVector2.create(struct + VROverlayIntersectionResults.VUVS); }
    /** Unsafe version of {@link #fDistance}. */
    public static float nfDistance(long struct) { return memGetFloat(struct + VROverlayIntersectionResults.FDISTANCE); }

    /** Unsafe version of {@link #vPoint(HmdVector3) vPoint}. */
    public static void nvPoint(long struct, HmdVector3 value) { memCopy(value.address(), struct + VROverlayIntersectionResults.VPOINT, HmdVector3.SIZEOF); }
    /** Unsafe version of {@link #vNormal(HmdVector3) vNormal}. */
    public static void nvNormal(long struct, HmdVector3 value) { memCopy(value.address(), struct + VROverlayIntersectionResults.VNORMAL, HmdVector3.SIZEOF); }
    /** Unsafe version of {@link #vUVs(HmdVector2) vUVs}. */
    public static void nvUVs(long struct, HmdVector2 value) { memCopy(value.address(), struct + VROverlayIntersectionResults.VUVS, HmdVector2.SIZEOF); }
    /** Unsafe version of {@link #fDistance(float) fDistance}. */
    public static void nfDistance(long struct, float value) { memPutFloat(struct + VROverlayIntersectionResults.FDISTANCE, value); }

    // -----------------------------------

    /** An array of {@link VROverlayIntersectionResults} structs. */
    public static class Buffer extends StructBuffer<VROverlayIntersectionResults, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VROverlayIntersectionResults.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VROverlayIntersectionResults#SIZEOF}, and its mark will be undefined.
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
        protected VROverlayIntersectionResults newInstance(long address) {
            return new VROverlayIntersectionResults(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link HmdVector3} view of the {@code vPoint} field. */
        public HmdVector3 vPoint() { return VROverlayIntersectionResults.nvPoint(address()); }
        /** Returns a {@link HmdVector3} view of the {@code vNormal} field. */
        public HmdVector3 vNormal() { return VROverlayIntersectionResults.nvNormal(address()); }
        /** Returns a {@link HmdVector2} view of the {@code vUVs} field. */
        public HmdVector2 vUVs() { return VROverlayIntersectionResults.nvUVs(address()); }
        /** Returns the value of the {@code fDistance} field. */
        public float fDistance() { return VROverlayIntersectionResults.nfDistance(address()); }

        /** Copies the specified {@link HmdVector3} to the {@code vPoint} field. */
        public VROverlayIntersectionResults.Buffer vPoint(HmdVector3 value) { VROverlayIntersectionResults.nvPoint(address(), value); return this; }
        /** Copies the specified {@link HmdVector3} to the {@code vNormal} field. */
        public VROverlayIntersectionResults.Buffer vNormal(HmdVector3 value) { VROverlayIntersectionResults.nvNormal(address(), value); return this; }
        /** Copies the specified {@link HmdVector2} to the {@code vUVs} field. */
        public VROverlayIntersectionResults.Buffer vUVs(HmdVector2 value) { VROverlayIntersectionResults.nvUVs(address(), value); return this; }
        /** Sets the specified value to the {@code fDistance} field. */
        public VROverlayIntersectionResults.Buffer fDistance(float value) { VROverlayIntersectionResults.nfDistance(address(), value); return this; }

    }

}