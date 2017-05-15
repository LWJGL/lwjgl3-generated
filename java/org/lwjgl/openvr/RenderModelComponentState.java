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
 * Describes state information about a render-model component, including transforms and other dynamic properties.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mTrackingToComponentRenderModel} &ndash; Transform required when drawing the component render model</li>
 * <li>{@code mTrackingToComponentLocal} &ndash; Transform available for attaching to a local component coordinate system (-Z out from surface )</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct RenderModel_ComponentState_t {
 *     {@link HmdMatrix34 HmdMatrix34_t} mTrackingToComponentRenderModel;
 *     {@link HmdMatrix34 HmdMatrix34_t} mTrackingToComponentLocal;
 *     VRComponentProperties uProperties;
 * }</pre></code>
 */
public class RenderModelComponentState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MTRACKINGTOCOMPONENTRENDERMODEL,
        MTRACKINGTOCOMPONENTLOCAL,
        UPROPERTIES;

    static {
        Layout layout = __struct(
            __member(HmdMatrix34.SIZEOF, HmdMatrix34.ALIGNOF),
            __member(HmdMatrix34.SIZEOF, HmdMatrix34.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MTRACKINGTOCOMPONENTRENDERMODEL = layout.offsetof(0);
        MTRACKINGTOCOMPONENTLOCAL = layout.offsetof(1);
        UPROPERTIES = layout.offsetof(2);
    }

    RenderModelComponentState(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link RenderModelComponentState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RenderModelComponentState(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdMatrix34} view of the {@code mTrackingToComponentRenderModel} field. */
    public HmdMatrix34 mTrackingToComponentRenderModel() { return nmTrackingToComponentRenderModel(address()); }
    /** Returns a {@link HmdMatrix34} view of the {@code mTrackingToComponentLocal} field. */
    public HmdMatrix34 mTrackingToComponentLocal() { return nmTrackingToComponentLocal(address()); }
    /** Returns the value of the {@code uProperties} field. */
    public int uProperties() { return nuProperties(address()); }

    /** Copies the specified {@link HmdMatrix34} to the {@code mTrackingToComponentRenderModel} field. */
    public RenderModelComponentState mTrackingToComponentRenderModel(HmdMatrix34 value) { nmTrackingToComponentRenderModel(address(), value); return this; }
    /** Copies the specified {@link HmdMatrix34} to the {@code mTrackingToComponentLocal} field. */
    public RenderModelComponentState mTrackingToComponentLocal(HmdMatrix34 value) { nmTrackingToComponentLocal(address(), value); return this; }
    /** Sets the specified value to the {@code uProperties} field. */
    public RenderModelComponentState uProperties(int value) { nuProperties(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public RenderModelComponentState set(
        HmdMatrix34 mTrackingToComponentRenderModel,
        HmdMatrix34 mTrackingToComponentLocal,
        int uProperties
    ) {
        mTrackingToComponentRenderModel(mTrackingToComponentRenderModel);
        mTrackingToComponentLocal(mTrackingToComponentLocal);
        uProperties(uProperties);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public RenderModelComponentState set(RenderModelComponentState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link RenderModelComponentState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RenderModelComponentState malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link RenderModelComponentState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RenderModelComponentState calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link RenderModelComponentState} instance allocated with {@link BufferUtils}. */
    public static RenderModelComponentState create() {
        return new RenderModelComponentState(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link RenderModelComponentState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static RenderModelComponentState create(long address) {
        return address == NULL ? null : new RenderModelComponentState(address, null);
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link RenderModelComponentState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link RenderModelComponentState} instance allocated on the thread-local {@link MemoryStack}. */
    public static RenderModelComponentState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link RenderModelComponentState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static RenderModelComponentState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link RenderModelComponentState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModelComponentState mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link RenderModelComponentState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModelComponentState callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mTrackingToComponentRenderModel}. */
    public static HmdMatrix34 nmTrackingToComponentRenderModel(long struct) { return HmdMatrix34.create(struct + RenderModelComponentState.MTRACKINGTOCOMPONENTRENDERMODEL); }
    /** Unsafe version of {@link #mTrackingToComponentLocal}. */
    public static HmdMatrix34 nmTrackingToComponentLocal(long struct) { return HmdMatrix34.create(struct + RenderModelComponentState.MTRACKINGTOCOMPONENTLOCAL); }
    /** Unsafe version of {@link #uProperties}. */
    public static int nuProperties(long struct) { return memGetInt(struct + RenderModelComponentState.UPROPERTIES); }

    /** Unsafe version of {@link #mTrackingToComponentRenderModel(HmdMatrix34) mTrackingToComponentRenderModel}. */
    public static void nmTrackingToComponentRenderModel(long struct, HmdMatrix34 value) { memCopy(value.address(), struct + RenderModelComponentState.MTRACKINGTOCOMPONENTRENDERMODEL, HmdMatrix34.SIZEOF); }
    /** Unsafe version of {@link #mTrackingToComponentLocal(HmdMatrix34) mTrackingToComponentLocal}. */
    public static void nmTrackingToComponentLocal(long struct, HmdMatrix34 value) { memCopy(value.address(), struct + RenderModelComponentState.MTRACKINGTOCOMPONENTLOCAL, HmdMatrix34.SIZEOF); }
    /** Unsafe version of {@link #uProperties(int) uProperties}. */
    public static void nuProperties(long struct, int value) { memPutInt(struct + RenderModelComponentState.UPROPERTIES, value); }

    // -----------------------------------

    /** An array of {@link RenderModelComponentState} structs. */
    public static class Buffer extends StructBuffer<RenderModelComponentState, Buffer> implements NativeResource {

        /**
         * Creates a new {@link RenderModelComponentState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RenderModelComponentState#SIZEOF}, and its mark will be undefined.
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
        protected RenderModelComponentState newInstance(long address) {
            return new RenderModelComponentState(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link HmdMatrix34} view of the {@code mTrackingToComponentRenderModel} field. */
        public HmdMatrix34 mTrackingToComponentRenderModel() { return RenderModelComponentState.nmTrackingToComponentRenderModel(address()); }
        /** Returns a {@link HmdMatrix34} view of the {@code mTrackingToComponentLocal} field. */
        public HmdMatrix34 mTrackingToComponentLocal() { return RenderModelComponentState.nmTrackingToComponentLocal(address()); }
        /** Returns the value of the {@code uProperties} field. */
        public int uProperties() { return RenderModelComponentState.nuProperties(address()); }

        /** Copies the specified {@link HmdMatrix34} to the {@code mTrackingToComponentRenderModel} field. */
        public RenderModelComponentState.Buffer mTrackingToComponentRenderModel(HmdMatrix34 value) { RenderModelComponentState.nmTrackingToComponentRenderModel(address(), value); return this; }
        /** Copies the specified {@link HmdMatrix34} to the {@code mTrackingToComponentLocal} field. */
        public RenderModelComponentState.Buffer mTrackingToComponentLocal(HmdMatrix34 value) { RenderModelComponentState.nmTrackingToComponentLocal(address(), value); return this; }
        /** Sets the specified value to the {@code uProperties} field. */
        public RenderModelComponentState.Buffer uProperties(int value) { RenderModelComponentState.nuProperties(address(), value); return this; }

    }

}