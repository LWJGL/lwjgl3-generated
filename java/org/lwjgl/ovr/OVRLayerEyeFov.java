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

import static org.lwjgl.ovr.OVR.ovrEye_Count;

/**
 * Describes a layer that specifies a monoscopic or stereoscopic view. This is the kind of layer that's typically used as layer 0 to
 * {@link OVR#ovr_SubmitFrame SubmitFrame}, as it is the kind of layer used to render a 3D stereoscopic view.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Header} &ndash; {@code Header.Type} must be {@link OVR#ovrLayerType_EyeFov LayerType_EyeFov}</li>
 * <li>{@code ColorTexture} &ndash; {@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be {@code NULL}.</li>
 * <li>{@code Viewport} &ndash; specifies the ColorTexture sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid.</li>
 * <li>{@code Fov} &ndash; the viewport field of view</li>
 * <li>{@code RenderPose} &ndash; 
 * specifies the position and orientation of each eye view, with the position specified in meters. RenderPose will typically be the value returned from
 * {@link OVRUtil#ovr_CalcEyePoses _CalcEyePoses}, but can be different in special cases if a different head pose is used for rendering.</li>
 * <li>{@code SensorSampleTime} &ndash; 
 * specifies the timestamp when the source {@link OVRPosef} (used in calculating RenderPose) was sampled from the SDK. Typically retrieved by calling
 * {@link OVR#ovr_GetTimeInSeconds GetTimeInSeconds} around the instant the application calls {@link OVR#ovr_GetTrackingState GetTrackingState}. The main purpose for this is to accurately track app
 * tracking latency.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrLayerEyeFov {
 *     {@link OVRLayerHeader ovrLayerHeader} Header;
 *     ovrTextureSwapChain ColorTexture[ovrEye_Count];
 *     {@link OVRRecti ovrRecti} Viewport[ovrEye_Count];
 *     {@link OVRFovPort ovrFovPort} Fov[ovrEye_Count];
 *     {@link OVRPosef ovrPosef} RenderPose[ovrEye_Count];
 *     double SensorSampleTime;
 * }</pre></code>
 */
@NativeType("struct ovrLayerEyeFov")
public class OVRLayerEyeFov extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER,
        COLORTEXTURE,
        VIEWPORT,
        FOV,
        RENDERPOSE,
        SENSORSAMPLETIME;

    static {
        Layout layout = __struct(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF),
            __array(POINTER_SIZE, ovrEye_Count),
            __array(OVRRecti.SIZEOF, OVRRecti.ALIGNOF, ovrEye_Count),
            __array(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF, ovrEye_Count),
            __array(OVRPosef.SIZEOF, OVRPosef.ALIGNOF, ovrEye_Count),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        COLORTEXTURE = layout.offsetof(1);
        VIEWPORT = layout.offsetof(2);
        FOV = layout.offsetof(3);
        RENDERPOSE = layout.offsetof(4);
        SENSORSAMPLETIME = layout.offsetof(5);
    }

    OVRLayerEyeFov(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRLayerEyeFov} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerEyeFov(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
    @NativeType("ovrLayerHeader")
    public OVRLayerHeader Header() { return nHeader(address()); }
    /** Returns a {@link PointerBuffer} view of the {@code ColorTexture} field. */
    @NativeType("ovrTextureSwapChain[ovrEye_Count]")
    public PointerBuffer ColorTexture() { return nColorTexture(address()); }
    /** Returns the value at the specified index of the {@code ColorTexture} field. */
    @NativeType("ovrTextureSwapChain")
    public long ColorTexture(int index) { return nColorTexture(address(), index); }
    /** Returns a {@link OVRRecti}.Buffer view of the {@code Viewport} field. */
    @NativeType("ovrRecti[ovrEye_Count]")
    public OVRRecti.Buffer Viewport() { return nViewport(address()); }
    /** Returns a {@link OVRRecti} view of the struct at the specified index of the {@code Viewport} field. */
    @NativeType("ovrRecti")
    public OVRRecti Viewport(int index) { return nViewport(address(), index); }
    /** Returns a {@link OVRFovPort}.Buffer view of the {@code Fov} field. */
    @NativeType("ovrFovPort[ovrEye_Count]")
    public OVRFovPort.Buffer Fov() { return nFov(address()); }
    /** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code Fov} field. */
    @NativeType("ovrFovPort")
    public OVRFovPort Fov(int index) { return nFov(address(), index); }
    /** Returns a {@link OVRPosef}.Buffer view of the {@code RenderPose} field. */
    @NativeType("ovrPosef[ovrEye_Count]")
    public OVRPosef.Buffer RenderPose() { return nRenderPose(address()); }
    /** Returns a {@link OVRPosef} view of the struct at the specified index of the {@code RenderPose} field. */
    @NativeType("ovrPosef")
    public OVRPosef RenderPose(int index) { return nRenderPose(address(), index); }
    /** Returns the value of the {@code SensorSampleTime} field. */
    public double SensorSampleTime() { return nSensorSampleTime(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
    public OVRLayerEyeFov Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@code ColorTexture} field. */
    public OVRLayerEyeFov ColorTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { nColorTexture(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ColorTexture} field. */
    public OVRLayerEyeFov ColorTexture(int index, @NativeType("ovrTextureSwapChain") long value) { nColorTexture(address(), index, value); return this; }
    /** Copies the specified {@link OVRRecti.Buffer} to the {@code Viewport} field. */
    public OVRLayerEyeFov Viewport(@NativeType("ovrRecti[ovrEye_Count]") OVRRecti.Buffer value) { nViewport(address(), value); return this; }
    /** Copies the specified {@link OVRRecti} at the specified index of the {@code Viewport} field. */
    public OVRLayerEyeFov Viewport(int index, @NativeType("ovrRecti") OVRRecti value) { nViewport(address(), index, value); return this; }
    /** Copies the specified {@link OVRFovPort.Buffer} to the {@code Fov} field. */
    public OVRLayerEyeFov Fov(@NativeType("ovrFovPort[ovrEye_Count]") OVRFovPort.Buffer value) { nFov(address(), value); return this; }
    /** Copies the specified {@link OVRFovPort} at the specified index of the {@code Fov} field. */
    public OVRLayerEyeFov Fov(int index, @NativeType("ovrFovPort") OVRFovPort value) { nFov(address(), index, value); return this; }
    /** Copies the specified {@link OVRPosef.Buffer} to the {@code RenderPose} field. */
    public OVRLayerEyeFov RenderPose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { nRenderPose(address(), value); return this; }
    /** Copies the specified {@link OVRPosef} at the specified index of the {@code RenderPose} field. */
    public OVRLayerEyeFov RenderPose(int index, @NativeType("ovrPosef") OVRPosef value) { nRenderPose(address(), index, value); return this; }
    /** Sets the specified value to the {@code SensorSampleTime} field. */
    public OVRLayerEyeFov SensorSampleTime(double value) { nSensorSampleTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRLayerEyeFov set(
        OVRLayerHeader Header,
        PointerBuffer ColorTexture,
        OVRRecti.Buffer Viewport,
        OVRFovPort.Buffer Fov,
        OVRPosef.Buffer RenderPose,
        double SensorSampleTime
    ) {
        Header(Header);
        ColorTexture(ColorTexture);
        Viewport(Viewport);
        Fov(Fov);
        RenderPose(RenderPose);
        SensorSampleTime(SensorSampleTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerEyeFov set(OVRLayerEyeFov src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link OVRLayerEyeFov} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerEyeFov malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link OVRLayerEyeFov} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerEyeFov calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link OVRLayerEyeFov} instance allocated with {@link BufferUtils}. */
    public static OVRLayerEyeFov create() {
        return new OVRLayerEyeFov(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRLayerEyeFov} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static OVRLayerEyeFov create(long address) {
        return address == NULL ? null : new OVRLayerEyeFov(address, null);
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRLayerEyeFov.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRLayerEyeFov} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRLayerEyeFov mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRLayerEyeFov} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRLayerEyeFov callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRLayerEyeFov} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerEyeFov mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerEyeFov} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerEyeFov callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerEyeFov.HEADER); }
    /** Unsafe version of {@link #ColorTexture}. */
    public static PointerBuffer nColorTexture(long struct) { return memPointerBuffer(struct + OVRLayerEyeFov.COLORTEXTURE, ovrEye_Count); }
    /** Unsafe version of {@link #ColorTexture(int) ColorTexture}. */
    public static long nColorTexture(long struct, int index) {
        if (CHECKS) { check(index, ovrEye_Count); }
        return memGetAddress(struct + OVRLayerEyeFov.COLORTEXTURE + index * POINTER_SIZE);
    }
    /** Unsafe version of {@link #Viewport}. */
    public static OVRRecti.Buffer nViewport(long struct) { return OVRRecti.create(struct + OVRLayerEyeFov.VIEWPORT, ovrEye_Count); }
    /** Unsafe version of {@link #Viewport(int) Viewport}. */
    public static OVRRecti nViewport(long struct, int index) {
        if (CHECKS) { check(index, ovrEye_Count); }
        return OVRRecti.create(struct + OVRLayerEyeFov.VIEWPORT + index * OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Fov}. */
    public static OVRFovPort.Buffer nFov(long struct) { return OVRFovPort.create(struct + OVRLayerEyeFov.FOV, ovrEye_Count); }
    /** Unsafe version of {@link #Fov(int) Fov}. */
    public static OVRFovPort nFov(long struct, int index) {
        if (CHECKS) { check(index, ovrEye_Count); }
        return OVRFovPort.create(struct + OVRLayerEyeFov.FOV + index * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose}. */
    public static OVRPosef.Buffer nRenderPose(long struct) { return OVRPosef.create(struct + OVRLayerEyeFov.RENDERPOSE, ovrEye_Count); }
    /** Unsafe version of {@link #RenderPose(int) RenderPose}. */
    public static OVRPosef nRenderPose(long struct, int index) {
        if (CHECKS) { check(index, ovrEye_Count); }
        return OVRPosef.create(struct + OVRLayerEyeFov.RENDERPOSE + index * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #SensorSampleTime}. */
    public static double nSensorSampleTime(long struct) { return memGetDouble(struct + OVRLayerEyeFov.SENSORSAMPLETIME); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerEyeFov.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #ColorTexture(PointerBuffer) ColorTexture}. */
    public static void nColorTexture(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(memAddress(value), struct + OVRLayerEyeFov.COLORTEXTURE, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #ColorTexture(int, long) ColorTexture}. */
    public static void nColorTexture(long struct, int index, long value) {
        if (CHECKS) { check(index, ovrEye_Count); }
        memPutAddress(struct + OVRLayerEyeFov.COLORTEXTURE + index * POINTER_SIZE, value);
    }
    /** Unsafe version of {@link #Viewport(OVRRecti.Buffer) Viewport}. */
    public static void nViewport(long struct, OVRRecti.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFov.VIEWPORT, value.remaining() * OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Viewport(int, OVRRecti) Viewport}. */
    public static void nViewport(long struct, int index, OVRRecti value) {
        if (CHECKS) { check(index, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFov.VIEWPORT + index * OVRRecti.SIZEOF, OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Fov(OVRFovPort.Buffer) Fov}. */
    public static void nFov(long struct, OVRFovPort.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFov.FOV, value.remaining() * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #Fov(int, OVRFovPort) Fov}. */
    public static void nFov(long struct, int index, OVRFovPort value) {
        if (CHECKS) { check(index, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFov.FOV + index * OVRFovPort.SIZEOF, OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose(OVRPosef.Buffer) RenderPose}. */
    public static void nRenderPose(long struct, OVRPosef.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFov.RENDERPOSE, value.remaining() * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose(int, OVRPosef) RenderPose}. */
    public static void nRenderPose(long struct, int index, OVRPosef value) {
        if (CHECKS) { check(index, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFov.RENDERPOSE + index * OVRPosef.SIZEOF, OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #SensorSampleTime(double) SensorSampleTime}. */
    public static void nSensorSampleTime(long struct, double value) { memPutDouble(struct + OVRLayerEyeFov.SENSORSAMPLETIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRLayerEyeFov.COLORTEXTURE));
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

    /** An array of {@link OVRLayerEyeFov} structs. */
    public static class Buffer extends StructBuffer<OVRLayerEyeFov, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRLayerEyeFov.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerEyeFov#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerEyeFov newInstance(long address) {
            return new OVRLayerEyeFov(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerEyeFov.nHeader(address()); }
        /** Returns a {@link PointerBuffer} view of the {@code ColorTexture} field. */
        @NativeType("ovrTextureSwapChain[ovrEye_Count]")
        public PointerBuffer ColorTexture() { return OVRLayerEyeFov.nColorTexture(address()); }
        /** Returns the value at the specified index of the {@code ColorTexture} field. */
        @NativeType("ovrTextureSwapChain")
        public long ColorTexture(int index) { return OVRLayerEyeFov.nColorTexture(address(), index); }
        /** Returns a {@link OVRRecti}.Buffer view of the {@code Viewport} field. */
        @NativeType("ovrRecti[ovrEye_Count]")
        public OVRRecti.Buffer Viewport() { return OVRLayerEyeFov.nViewport(address()); }
        /** Returns a {@link OVRRecti} view of the struct at the specified index of the {@code Viewport} field. */
        @NativeType("ovrRecti")
        public OVRRecti Viewport(int index) { return OVRLayerEyeFov.nViewport(address(), index); }
        /** Returns a {@link OVRFovPort}.Buffer view of the {@code Fov} field. */
        @NativeType("ovrFovPort[ovrEye_Count]")
        public OVRFovPort.Buffer Fov() { return OVRLayerEyeFov.nFov(address()); }
        /** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code Fov} field. */
        @NativeType("ovrFovPort")
        public OVRFovPort Fov(int index) { return OVRLayerEyeFov.nFov(address(), index); }
        /** Returns a {@link OVRPosef}.Buffer view of the {@code RenderPose} field. */
        @NativeType("ovrPosef[ovrEye_Count]")
        public OVRPosef.Buffer RenderPose() { return OVRLayerEyeFov.nRenderPose(address()); }
        /** Returns a {@link OVRPosef} view of the struct at the specified index of the {@code RenderPose} field. */
        @NativeType("ovrPosef")
        public OVRPosef RenderPose(int index) { return OVRLayerEyeFov.nRenderPose(address(), index); }
        /** Returns the value of the {@code SensorSampleTime} field. */
        public double SensorSampleTime() { return OVRLayerEyeFov.nSensorSampleTime(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
        public OVRLayerEyeFov.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerEyeFov.nHeader(address(), value); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@code ColorTexture} field. */
        public OVRLayerEyeFov.Buffer ColorTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { OVRLayerEyeFov.nColorTexture(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ColorTexture} field. */
        public OVRLayerEyeFov.Buffer ColorTexture(int index, @NativeType("ovrTextureSwapChain") long value) { OVRLayerEyeFov.nColorTexture(address(), index, value); return this; }
        /** Copies the specified {@link OVRRecti.Buffer} to the {@code Viewport} field. */
        public OVRLayerEyeFov.Buffer Viewport(@NativeType("ovrRecti[ovrEye_Count]") OVRRecti.Buffer value) { OVRLayerEyeFov.nViewport(address(), value); return this; }
        /** Copies the specified {@link OVRRecti} at the specified index of the {@code Viewport} field. */
        public OVRLayerEyeFov.Buffer Viewport(int index, @NativeType("ovrRecti") OVRRecti value) { OVRLayerEyeFov.nViewport(address(), index, value); return this; }
        /** Copies the specified {@link OVRFovPort.Buffer} to the {@code Fov} field. */
        public OVRLayerEyeFov.Buffer Fov(@NativeType("ovrFovPort[ovrEye_Count]") OVRFovPort.Buffer value) { OVRLayerEyeFov.nFov(address(), value); return this; }
        /** Copies the specified {@link OVRFovPort} at the specified index of the {@code Fov} field. */
        public OVRLayerEyeFov.Buffer Fov(int index, @NativeType("ovrFovPort") OVRFovPort value) { OVRLayerEyeFov.nFov(address(), index, value); return this; }
        /** Copies the specified {@link OVRPosef.Buffer} to the {@code RenderPose} field. */
        public OVRLayerEyeFov.Buffer RenderPose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { OVRLayerEyeFov.nRenderPose(address(), value); return this; }
        /** Copies the specified {@link OVRPosef} at the specified index of the {@code RenderPose} field. */
        public OVRLayerEyeFov.Buffer RenderPose(int index, @NativeType("ovrPosef") OVRPosef value) { OVRLayerEyeFov.nRenderPose(address(), index, value); return this; }
        /** Sets the specified value to the {@code SensorSampleTime} field. */
        public OVRLayerEyeFov.Buffer SensorSampleTime(double value) { OVRLayerEyeFov.nSensorSampleTime(address(), value); return this; }

    }

}