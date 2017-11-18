/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes a layer of type {@link OVR#ovrLayerType_Cylinder LayerType_Cylinder} which is a single cylinder relative to the recentered origin. This type of layer represents a single
 * object placed in the world and not a stereo view of the world itself.
 * 
 * <code><pre>
 *                -Z                                       +Y
 *         U=0  +--+--+  U=1
 *          +---+  |  +---+            +-----------------+  - V=0
 *       +--+ \    |    / +--+         |                 |  |
 *     +-+     \       /     +-+       |                 |  |
 *    ++        \  A  /        ++      |                 |  |
 *   ++          \---/          ++     |                 |  |
 *   |            \ /            |     |              +X |  |
 *   +-------------C------R------+ +X  +--------C--------+  | <--- Height
 *       (+Y is out of screen)         |                 |  |
 *                                     |                 |  |
 *   R = Radius                        |                 |  |
 *   A = Angle (0,2*Pi)                |                 |  |
 *   C = CylinderPoseCenter            |                 |  |
 *   U/V = UV Coordinates              +-----------------+  - V=1</pre></code>
 * 
 * <p>An identity {@code CylinderPoseCenter} places the center of the cylinder at the recentered origin unless the headlocked flag is set.</p>
 * 
 * <p>Does not utilize {@code HmdSpaceToWorldScaleInMeters}. If necessary, adjust translation and radius.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Only the interior surface of the cylinder is visible. Use cylinder layers when the user cannot leave the extents of the cylinder. Artifacts may appear
 * when viewing the cylinder's exterior surface. Additionally, while the interface supports an Angle that ranges from {@code [0,2*Pi]} the angle should
 * remain less than {@code 1.9*PI} to avoid artifacts where the cylinder edges converge.</p></div>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Header} &ndash; {@code Header.Type} must be {@link OVR#ovrLayerType_Cylinder LayerType_Cylinder}</li>
 * <li>{@code ColorTexture} &ndash; contains a single image, never with any stereo view</li>
 * <li>{@code Viewport} &ndash; specifies the ColorTexture sub-rect UV coordinates</li>
 * <li>{@code CylinderPoseCenter} &ndash; 
 * specifies the orientation and position of the center point of a cylinder layer type. The position is in real-world meters not the application's virtual
 * world, but the physical world the user is in. It is relative to the "zero" position set by {@link OVR#ovr_RecenterTrackingOrigin RecenterTrackingOrigin} unless the
 * {@link OVR#ovrLayerFlag_HeadLocked LayerFlag_HeadLocked} flag is used.</li>
 * <li>{@code CylinderRadius} &ndash; radius of the cylinder in meters</li>
 * <li>{@code CylinderAngle} &ndash; angle in radians. Range is from 0 to {@code 2*Pi} exclusive covering the entire cylinder (see diagram and note above).</li>
 * <li>{@code CylinderAspectRatio} &ndash; 
 * custom aspect ratio presumably set based on {@code Viewport}. Used to calculate the height of the cylinder based on the arc-length
 * ({@code CylinderAngle}) and radius ({@code CylinderRadius}) given above. The height of the cylinder is given by:
 * {@code height = (CylinderRadius * CylinderAngle) / CylinderAspectRatio}. Aspect ratio is {@code width / height}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrLayerCylinder {
 *     {@link OVRLayerHeader ovrLayerHeader} Header;
 *     ovrTextureSwapChain ColorTexture;
 *     {@link OVRRecti ovrRecti} Viewport;
 *     {@link OVRPosef ovrPosef} CylinderPoseCenter;
 *     float CylinderRadius;
 *     float CylinderAngle;
 *     float CylinderAspectRatio;
 * }</pre></code>
 */
@NativeType("struct ovrLayerCylinder")
public class OVRLayerCylinder extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER,
        COLORTEXTURE,
        VIEWPORT,
        CYLINDERPOSECENTER,
        CYLINDERRADIUS,
        CYLINDERANGLE,
        CYLINDERASPECTRATIO;

    static {
        Layout layout = __struct(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF),
            __member(POINTER_SIZE),
            __member(OVRRecti.SIZEOF, OVRRecti.ALIGNOF),
            __member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        COLORTEXTURE = layout.offsetof(1);
        VIEWPORT = layout.offsetof(2);
        CYLINDERPOSECENTER = layout.offsetof(3);
        CYLINDERRADIUS = layout.offsetof(4);
        CYLINDERANGLE = layout.offsetof(5);
        CYLINDERASPECTRATIO = layout.offsetof(6);
    }

    OVRLayerCylinder(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRLayerCylinder} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerCylinder(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
    @NativeType("ovrLayerHeader")
    public OVRLayerHeader Header() { return nHeader(address()); }
    /** Returns the value of the {@code ColorTexture} field. */
    @NativeType("ovrTextureSwapChain")
    public long ColorTexture() { return nColorTexture(address()); }
    /** Returns a {@link OVRRecti} view of the {@code Viewport} field. */
    @NativeType("ovrRecti")
    public OVRRecti Viewport() { return nViewport(address()); }
    /** Returns a {@link OVRPosef} view of the {@code CylinderPoseCenter} field. */
    @NativeType("ovrPosef")
    public OVRPosef CylinderPoseCenter() { return nCylinderPoseCenter(address()); }
    /** Returns the value of the {@code CylinderRadius} field. */
    public float CylinderRadius() { return nCylinderRadius(address()); }
    /** Returns the value of the {@code CylinderAngle} field. */
    public float CylinderAngle() { return nCylinderAngle(address()); }
    /** Returns the value of the {@code CylinderAspectRatio} field. */
    public float CylinderAspectRatio() { return nCylinderAspectRatio(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
    public OVRLayerCylinder Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Sets the specified value to the {@code ColorTexture} field. */
    public OVRLayerCylinder ColorTexture(@NativeType("ovrTextureSwapChain") long value) { nColorTexture(address(), value); return this; }
    /** Copies the specified {@link OVRRecti} to the {@code Viewport} field. */
    public OVRLayerCylinder Viewport(@NativeType("ovrRecti") OVRRecti value) { nViewport(address(), value); return this; }
    /** Copies the specified {@link OVRPosef} to the {@code CylinderPoseCenter} field. */
    public OVRLayerCylinder CylinderPoseCenter(@NativeType("ovrPosef") OVRPosef value) { nCylinderPoseCenter(address(), value); return this; }
    /** Sets the specified value to the {@code CylinderRadius} field. */
    public OVRLayerCylinder CylinderRadius(float value) { nCylinderRadius(address(), value); return this; }
    /** Sets the specified value to the {@code CylinderAngle} field. */
    public OVRLayerCylinder CylinderAngle(float value) { nCylinderAngle(address(), value); return this; }
    /** Sets the specified value to the {@code CylinderAspectRatio} field. */
    public OVRLayerCylinder CylinderAspectRatio(float value) { nCylinderAspectRatio(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRLayerCylinder set(
        OVRLayerHeader Header,
        long ColorTexture,
        OVRRecti Viewport,
        OVRPosef CylinderPoseCenter,
        float CylinderRadius,
        float CylinderAngle,
        float CylinderAspectRatio
    ) {
        Header(Header);
        ColorTexture(ColorTexture);
        Viewport(Viewport);
        CylinderPoseCenter(CylinderPoseCenter);
        CylinderRadius(CylinderRadius);
        CylinderAngle(CylinderAngle);
        CylinderAspectRatio(CylinderAspectRatio);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerCylinder set(OVRLayerCylinder src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link OVRLayerCylinder} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerCylinder malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link OVRLayerCylinder} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerCylinder calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link OVRLayerCylinder} instance allocated with {@link BufferUtils}. */
    public static OVRLayerCylinder create() {
        return new OVRLayerCylinder(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRLayerCylinder} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static OVRLayerCylinder create(long address) {
        return address == NULL ? null : new OVRLayerCylinder(address, null);
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRLayerCylinder.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRLayerCylinder} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRLayerCylinder mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRLayerCylinder} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRLayerCylinder callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRLayerCylinder} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerCylinder mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerCylinder} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerCylinder callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerCylinder.HEADER); }
    /** Unsafe version of {@link #ColorTexture}. */
    public static long nColorTexture(long struct) { return memGetAddress(struct + OVRLayerCylinder.COLORTEXTURE); }
    /** Unsafe version of {@link #Viewport}. */
    public static OVRRecti nViewport(long struct) { return OVRRecti.create(struct + OVRLayerCylinder.VIEWPORT); }
    /** Unsafe version of {@link #CylinderPoseCenter}. */
    public static OVRPosef nCylinderPoseCenter(long struct) { return OVRPosef.create(struct + OVRLayerCylinder.CYLINDERPOSECENTER); }
    /** Unsafe version of {@link #CylinderRadius}. */
    public static float nCylinderRadius(long struct) { return memGetFloat(struct + OVRLayerCylinder.CYLINDERRADIUS); }
    /** Unsafe version of {@link #CylinderAngle}. */
    public static float nCylinderAngle(long struct) { return memGetFloat(struct + OVRLayerCylinder.CYLINDERANGLE); }
    /** Unsafe version of {@link #CylinderAspectRatio}. */
    public static float nCylinderAspectRatio(long struct) { return memGetFloat(struct + OVRLayerCylinder.CYLINDERASPECTRATIO); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerCylinder.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #ColorTexture(long) ColorTexture}. */
    public static void nColorTexture(long struct, long value) { memPutAddress(struct + OVRLayerCylinder.COLORTEXTURE, check(value)); }
    /** Unsafe version of {@link #Viewport(OVRRecti) Viewport}. */
    public static void nViewport(long struct, OVRRecti value) { memCopy(value.address(), struct + OVRLayerCylinder.VIEWPORT, OVRRecti.SIZEOF); }
    /** Unsafe version of {@link #CylinderPoseCenter(OVRPosef) CylinderPoseCenter}. */
    public static void nCylinderPoseCenter(long struct, OVRPosef value) { memCopy(value.address(), struct + OVRLayerCylinder.CYLINDERPOSECENTER, OVRPosef.SIZEOF); }
    /** Unsafe version of {@link #CylinderRadius(float) CylinderRadius}. */
    public static void nCylinderRadius(long struct, float value) { memPutFloat(struct + OVRLayerCylinder.CYLINDERRADIUS, value); }
    /** Unsafe version of {@link #CylinderAngle(float) CylinderAngle}. */
    public static void nCylinderAngle(long struct, float value) { memPutFloat(struct + OVRLayerCylinder.CYLINDERANGLE, value); }
    /** Unsafe version of {@link #CylinderAspectRatio(float) CylinderAspectRatio}. */
    public static void nCylinderAspectRatio(long struct, float value) { memPutFloat(struct + OVRLayerCylinder.CYLINDERASPECTRATIO, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRLayerCylinder.COLORTEXTURE));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link OVRLayerCylinder} structs. */
    public static class Buffer extends StructBuffer<OVRLayerCylinder, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRLayerCylinder.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerCylinder#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerCylinder newInstance(long address) {
            return new OVRLayerCylinder(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerCylinder.nHeader(address()); }
        /** Returns the value of the {@code ColorTexture} field. */
        @NativeType("ovrTextureSwapChain")
        public long ColorTexture() { return OVRLayerCylinder.nColorTexture(address()); }
        /** Returns a {@link OVRRecti} view of the {@code Viewport} field. */
        @NativeType("ovrRecti")
        public OVRRecti Viewport() { return OVRLayerCylinder.nViewport(address()); }
        /** Returns a {@link OVRPosef} view of the {@code CylinderPoseCenter} field. */
        @NativeType("ovrPosef")
        public OVRPosef CylinderPoseCenter() { return OVRLayerCylinder.nCylinderPoseCenter(address()); }
        /** Returns the value of the {@code CylinderRadius} field. */
        public float CylinderRadius() { return OVRLayerCylinder.nCylinderRadius(address()); }
        /** Returns the value of the {@code CylinderAngle} field. */
        public float CylinderAngle() { return OVRLayerCylinder.nCylinderAngle(address()); }
        /** Returns the value of the {@code CylinderAspectRatio} field. */
        public float CylinderAspectRatio() { return OVRLayerCylinder.nCylinderAspectRatio(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
        public OVRLayerCylinder.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerCylinder.nHeader(address(), value); return this; }
        /** Sets the specified value to the {@code ColorTexture} field. */
        public OVRLayerCylinder.Buffer ColorTexture(@NativeType("ovrTextureSwapChain") long value) { OVRLayerCylinder.nColorTexture(address(), value); return this; }
        /** Copies the specified {@link OVRRecti} to the {@code Viewport} field. */
        public OVRLayerCylinder.Buffer Viewport(@NativeType("ovrRecti") OVRRecti value) { OVRLayerCylinder.nViewport(address(), value); return this; }
        /** Copies the specified {@link OVRPosef} to the {@code CylinderPoseCenter} field. */
        public OVRLayerCylinder.Buffer CylinderPoseCenter(@NativeType("ovrPosef") OVRPosef value) { OVRLayerCylinder.nCylinderPoseCenter(address(), value); return this; }
        /** Sets the specified value to the {@code CylinderRadius} field. */
        public OVRLayerCylinder.Buffer CylinderRadius(float value) { OVRLayerCylinder.nCylinderRadius(address(), value); return this; }
        /** Sets the specified value to the {@code CylinderAngle} field. */
        public OVRLayerCylinder.Buffer CylinderAngle(float value) { OVRLayerCylinder.nCylinderAngle(address(), value); return this; }
        /** Sets the specified value to the {@code CylinderAspectRatio} field. */
        public OVRLayerCylinder.Buffer CylinderAspectRatio(float value) { OVRLayerCylinder.nCylinderAspectRatio(address(), value); return this; }

    }

}