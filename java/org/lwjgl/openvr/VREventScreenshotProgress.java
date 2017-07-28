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
 * struct VREvent_ScreenshotProgress_t {
 *     float progress;
 * }</pre></code>
 */
@NativeType("struct VREvent_ScreenshotProgress_t")
public class VREventScreenshotProgress extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROGRESS;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROGRESS = layout.offsetof(0);
    }

    VREventScreenshotProgress(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventScreenshotProgress} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventScreenshotProgress(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code progress} field. */
    public float progress() { return nprogress(address()); }

    /** Sets the specified value to the {@code progress} field. */
    public VREventScreenshotProgress progress(float value) { nprogress(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventScreenshotProgress set(VREventScreenshotProgress src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventScreenshotProgress} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventScreenshotProgress malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventScreenshotProgress} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventScreenshotProgress calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventScreenshotProgress} instance allocated with {@link BufferUtils}. */
    public static VREventScreenshotProgress create() {
        return new VREventScreenshotProgress(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventScreenshotProgress} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventScreenshotProgress create(long address) {
        return address == NULL ? null : new VREventScreenshotProgress(address, null);
    }

    /**
     * Returns a new {@link VREventScreenshotProgress.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventScreenshotProgress.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventScreenshotProgress.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VREventScreenshotProgress.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VREventScreenshotProgress} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventScreenshotProgress mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventScreenshotProgress} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventScreenshotProgress callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventScreenshotProgress} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventScreenshotProgress mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventScreenshotProgress} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventScreenshotProgress callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventScreenshotProgress.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventScreenshotProgress.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventScreenshotProgress.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventScreenshotProgress.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #progress}. */
    public static float nprogress(long struct) { return memGetFloat(struct + VREventScreenshotProgress.PROGRESS); }

    /** Unsafe version of {@link #progress(float) progress}. */
    public static void nprogress(long struct, float value) { memPutFloat(struct + VREventScreenshotProgress.PROGRESS, value); }

    // -----------------------------------

    /** An array of {@link VREventScreenshotProgress} structs. */
    public static class Buffer extends StructBuffer<VREventScreenshotProgress, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VREventScreenshotProgress.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventScreenshotProgress#SIZEOF}, and its mark will be undefined.
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
        protected VREventScreenshotProgress newInstance(long address) {
            return new VREventScreenshotProgress(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code progress} field. */
        public float progress() { return VREventScreenshotProgress.nprogress(address()); }

        /** Sets the specified value to the {@code progress} field. */
        public VREventScreenshotProgress.Buffer progress(float value) { VREventScreenshotProgress.nprogress(address(), value); return this; }

    }

}