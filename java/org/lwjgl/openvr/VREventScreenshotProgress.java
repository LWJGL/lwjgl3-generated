/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_ScreenshotProgress_t {
 *     float progress;
 * }</pre></code>
 */
@NativeType("struct VREvent_ScreenshotProgress_t")
public class VREventScreenshotProgress extends Struct {

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

    // -----------------------------------

    /** Returns a new {@link VREventScreenshotProgress} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventScreenshotProgress create(long address) {
        return address == NULL ? null : new VREventScreenshotProgress(address, null);
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

    /** Unsafe version of {@link #progress}. */
    public static float nprogress(long struct) { return memGetFloat(struct + VREventScreenshotProgress.PROGRESS); }

    // -----------------------------------

    /** An array of {@link VREventScreenshotProgress} structs. */
    public static class Buffer extends StructBuffer<VREventScreenshotProgress, Buffer> {

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
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code progress} field. */
        public float progress() { return VREventScreenshotProgress.nprogress(address()); }

    }

}