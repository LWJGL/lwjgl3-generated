/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct NSVGgradientStop {
 *     unsigned int color;
 *     float offset;
 * }</pre></code>
 */
@NativeType("struct NSVGgradientStop")
public class NSVGGradientStop extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLOR,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLOR = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
    }

    NSVGGradientStop(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NSVGGradientStop} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NSVGGradientStop(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code color} field. */
    @NativeType("unsigned int")
    public int color() { return ncolor(address()); }
    /** Returns the value of the {@code offset} field. */
    public float offset() { return noffset(address()); }

    // -----------------------------------

    /** Returns a new {@link NSVGGradientStop} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static NSVGGradientStop create(long address) {
        return address == NULL ? null : new NSVGGradientStop(address, null);
    }

    /**
     * Create a {@link NSVGGradientStop.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #color}. */
    public static int ncolor(long struct) { return memGetInt(struct + NSVGGradientStop.COLOR); }
    /** Unsafe version of {@link #offset}. */
    public static float noffset(long struct) { return memGetFloat(struct + NSVGGradientStop.OFFSET); }

    // -----------------------------------

    /** An array of {@link NSVGGradientStop} structs. */
    public static class Buffer extends StructBuffer<NSVGGradientStop, Buffer> {

        /**
         * Creates a new {@link NSVGGradientStop.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NSVGGradientStop#SIZEOF}, and its mark will be undefined.
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
        protected NSVGGradientStop newInstance(long address) {
            return new NSVGGradientStop(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code color} field. */
        @NativeType("unsigned int")
        public int color() { return NSVGGradientStop.ncolor(address()); }
        /** Returns the value of the {@code offset} field. */
        public float offset() { return NSVGGradientStop.noffset(address()); }

    }

}