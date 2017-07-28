/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * rendering information for each eye. Computed by either {@link OVR#ovr_GetRenderDesc GetRenderDesc} based on the specified FOV. Note that the rendering viewport is not
 * included here as it can be specified separately and modified per frame by passing different viewport values in the layer structure.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Eye} &ndash; the eye index this instance corresponds to. One of:<br><table><tr><td>{@link OVR#ovrEye_Left Eye_Left}</td><td>{@link OVR#ovrEye_Right Eye_Right}</td></tr></table></li>
 * <li>{@code Fov} &ndash; the field of view</li>
 * <li>{@code DistortedViewport} &ndash; distortion viewport</li>
 * <li>{@code PixelsPerTanAngleAtCenter} &ndash; wow many display pixels will fit in tan(angle) = 1</li>
 * <li>{@code HmdToEyeOffset} &ndash; translation of each eye, in meters.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrEyeRenderDesc {
 *     ovrEyeType Eye;
 *     {@link OVRFovPort ovrFovPort} Fov;
 *     {@link OVRRecti ovrRecti} DistortedViewport;
 *     {@link OVRVector2f ovrVector2f} PixelsPerTanAngleAtCenter;
 *     {@link OVRVector3f ovrVector3f} HmdToEyeOffset;
 * }</pre></code>
 */
@NativeType("struct ovrEyeRenderDesc")
public class OVREyeRenderDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EYE,
        FOV,
        DISTORTEDVIEWPORT,
        PIXELSPERTANANGLEATCENTER,
        HMDTOEYEOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF),
            __member(OVRRecti.SIZEOF, OVRRecti.ALIGNOF),
            __member(OVRVector2f.SIZEOF, OVRVector2f.ALIGNOF),
            __member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EYE = layout.offsetof(0);
        FOV = layout.offsetof(1);
        DISTORTEDVIEWPORT = layout.offsetof(2);
        PIXELSPERTANANGLEATCENTER = layout.offsetof(3);
        HMDTOEYEOFFSET = layout.offsetof(4);
    }

    OVREyeRenderDesc(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVREyeRenderDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVREyeRenderDesc(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code Eye} field. */
    @NativeType("ovrEyeType")
    public int Eye() { return nEye(address()); }
    /** Returns a {@link OVRFovPort} view of the {@code Fov} field. */
    @NativeType("ovrFovPort")
    public OVRFovPort Fov() { return nFov(address()); }
    /** Returns a {@link OVRRecti} view of the {@code DistortedViewport} field. */
    @NativeType("ovrRecti")
    public OVRRecti DistortedViewport() { return nDistortedViewport(address()); }
    /** Returns a {@link OVRVector2f} view of the {@code PixelsPerTanAngleAtCenter} field. */
    @NativeType("ovrVector2f")
    public OVRVector2f PixelsPerTanAngleAtCenter() { return nPixelsPerTanAngleAtCenter(address()); }
    /** Returns a {@link OVRVector3f} view of the {@code HmdToEyeOffset} field. */
    @NativeType("ovrVector3f")
    public OVRVector3f HmdToEyeOffset() { return nHmdToEyeOffset(address()); }

    // -----------------------------------

    /** Returns a new {@link OVREyeRenderDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVREyeRenderDesc malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link OVREyeRenderDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVREyeRenderDesc calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link OVREyeRenderDesc} instance allocated with {@link BufferUtils}. */
    public static OVREyeRenderDesc create() {
        return new OVREyeRenderDesc(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVREyeRenderDesc} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static OVREyeRenderDesc create(long address) {
        return address == NULL ? null : new OVREyeRenderDesc(address, null);
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link OVREyeRenderDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVREyeRenderDesc} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVREyeRenderDesc mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVREyeRenderDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVREyeRenderDesc callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVREyeRenderDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVREyeRenderDesc mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVREyeRenderDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVREyeRenderDesc callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Eye}. */
    public static int nEye(long struct) { return memGetInt(struct + OVREyeRenderDesc.EYE); }
    /** Unsafe version of {@link #Fov}. */
    public static OVRFovPort nFov(long struct) { return OVRFovPort.create(struct + OVREyeRenderDesc.FOV); }
    /** Unsafe version of {@link #DistortedViewport}. */
    public static OVRRecti nDistortedViewport(long struct) { return OVRRecti.create(struct + OVREyeRenderDesc.DISTORTEDVIEWPORT); }
    /** Unsafe version of {@link #PixelsPerTanAngleAtCenter}. */
    public static OVRVector2f nPixelsPerTanAngleAtCenter(long struct) { return OVRVector2f.create(struct + OVREyeRenderDesc.PIXELSPERTANANGLEATCENTER); }
    /** Unsafe version of {@link #HmdToEyeOffset}. */
    public static OVRVector3f nHmdToEyeOffset(long struct) { return OVRVector3f.create(struct + OVREyeRenderDesc.HMDTOEYEOFFSET); }

    // -----------------------------------

    /** An array of {@link OVREyeRenderDesc} structs. */
    public static class Buffer extends StructBuffer<OVREyeRenderDesc, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVREyeRenderDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVREyeRenderDesc#SIZEOF}, and its mark will be undefined.
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
        protected OVREyeRenderDesc newInstance(long address) {
            return new OVREyeRenderDesc(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code Eye} field. */
        @NativeType("ovrEyeType")
        public int Eye() { return OVREyeRenderDesc.nEye(address()); }
        /** Returns a {@link OVRFovPort} view of the {@code Fov} field. */
        @NativeType("ovrFovPort")
        public OVRFovPort Fov() { return OVREyeRenderDesc.nFov(address()); }
        /** Returns a {@link OVRRecti} view of the {@code DistortedViewport} field. */
        @NativeType("ovrRecti")
        public OVRRecti DistortedViewport() { return OVREyeRenderDesc.nDistortedViewport(address()); }
        /** Returns a {@link OVRVector2f} view of the {@code PixelsPerTanAngleAtCenter} field. */
        @NativeType("ovrVector2f")
        public OVRVector2f PixelsPerTanAngleAtCenter() { return OVREyeRenderDesc.nPixelsPerTanAngleAtCenter(address()); }
        /** Returns a {@link OVRVector3f} view of the {@code HmdToEyeOffset} field. */
        @NativeType("ovrVector3f")
        public OVRVector3f HmdToEyeOffset() { return OVREyeRenderDesc.nHmdToEyeOffset(address()); }

    }

}