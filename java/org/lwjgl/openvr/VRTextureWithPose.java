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
 * Allows specifying pose used to render provided scene texture (if different from value returned by {@link VRCompositor#VRCompositor_WaitGetPoses WaitGetPoses}).
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mDeviceToAbsoluteTracking} &ndash; actual pose used to render scene textures</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VRTextureWithPose_t {
 *     {@link HmdMatrix34 HmdMatrix34_t} mDeviceToAbsoluteTracking;
 * }</pre></code>
 */
@NativeType("struct VRTextureWithPose_t")
public class VRTextureWithPose extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MDEVICETOABSOLUTETRACKING;

    static {
        Layout layout = __struct(
            __member(HmdMatrix34.SIZEOF, HmdMatrix34.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MDEVICETOABSOLUTETRACKING = layout.offsetof(0);
    }

    VRTextureWithPose(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VRTextureWithPose} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRTextureWithPose(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdMatrix34} view of the {@code mDeviceToAbsoluteTracking} field. */
    @NativeType("HmdMatrix34_t")
    public HmdMatrix34 mDeviceToAbsoluteTracking() { return nmDeviceToAbsoluteTracking(address()); }

    /** Copies the specified {@link HmdMatrix34} to the {@code mDeviceToAbsoluteTracking} field. */
    public VRTextureWithPose mDeviceToAbsoluteTracking(@NativeType("HmdMatrix34_t") HmdMatrix34 value) { nmDeviceToAbsoluteTracking(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRTextureWithPose set(VRTextureWithPose src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VRTextureWithPose} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRTextureWithPose malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VRTextureWithPose} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRTextureWithPose calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VRTextureWithPose} instance allocated with {@link BufferUtils}. */
    public static VRTextureWithPose create() {
        return new VRTextureWithPose(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VRTextureWithPose} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VRTextureWithPose create(long address) {
        return address == NULL ? null : new VRTextureWithPose(address, null);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VRTextureWithPose.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VRTextureWithPose} instance allocated on the thread-local {@link MemoryStack}. */
    public static VRTextureWithPose mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VRTextureWithPose} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VRTextureWithPose callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VRTextureWithPose} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithPose mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VRTextureWithPose} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithPose callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mDeviceToAbsoluteTracking}. */
    public static HmdMatrix34 nmDeviceToAbsoluteTracking(long struct) { return HmdMatrix34.create(struct + VRTextureWithPose.MDEVICETOABSOLUTETRACKING); }

    /** Unsafe version of {@link #mDeviceToAbsoluteTracking(HmdMatrix34) mDeviceToAbsoluteTracking}. */
    public static void nmDeviceToAbsoluteTracking(long struct, HmdMatrix34 value) { memCopy(value.address(), struct + VRTextureWithPose.MDEVICETOABSOLUTETRACKING, HmdMatrix34.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VRTextureWithPose} structs. */
    public static class Buffer extends StructBuffer<VRTextureWithPose, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VRTextureWithPose.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRTextureWithPose#SIZEOF}, and its mark will be undefined.
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
        protected VRTextureWithPose newInstance(long address) {
            return new VRTextureWithPose(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link HmdMatrix34} view of the {@code mDeviceToAbsoluteTracking} field. */
        @NativeType("HmdMatrix34_t")
        public HmdMatrix34 mDeviceToAbsoluteTracking() { return VRTextureWithPose.nmDeviceToAbsoluteTracking(address()); }

        /** Copies the specified {@link HmdMatrix34} to the {@code mDeviceToAbsoluteTracking} field. */
        public VRTextureWithPose.Buffer mDeviceToAbsoluteTracking(@NativeType("HmdMatrix34_t") HmdMatrix34 value) { VRTextureWithPose.nmDeviceToAbsoluteTracking(address(), value); return this; }

    }

}