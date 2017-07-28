/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct YGCachedMeasurement {
 *     float availableWidth;
 *     float availableHeight;
 *     YGMeasureMode widthMeasureMode;
 *     YGMeasureMode heightMeasureMode;
 *     float computedWidth;
 *     float computedHeight;
 * }</pre></code>
 */
public class YGCachedMeasurement extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        AVAILABLEWIDTH,
        AVAILABLEHEIGHT,
        WIDTHMEASUREMODE,
        HEIGHTMEASUREMODE,
        COMPUTEDWIDTH,
        COMPUTEDHEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        AVAILABLEWIDTH = layout.offsetof(0);
        AVAILABLEHEIGHT = layout.offsetof(1);
        WIDTHMEASUREMODE = layout.offsetof(2);
        HEIGHTMEASUREMODE = layout.offsetof(3);
        COMPUTEDWIDTH = layout.offsetof(4);
        COMPUTEDHEIGHT = layout.offsetof(5);
    }

    YGCachedMeasurement(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link YGCachedMeasurement} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGCachedMeasurement(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code availableWidth} field. */
    public float availableWidth() { return navailableWidth(address()); }
    /** Returns the value of the {@code availableHeight} field. */
    public float availableHeight() { return navailableHeight(address()); }
    /** Returns the value of the {@code widthMeasureMode} field. */
    @NativeType("YGMeasureMode")
    public int widthMeasureMode() { return nwidthMeasureMode(address()); }
    /** Returns the value of the {@code heightMeasureMode} field. */
    @NativeType("YGMeasureMode")
    public int heightMeasureMode() { return nheightMeasureMode(address()); }
    /** Returns the value of the {@code computedWidth} field. */
    public float computedWidth() { return ncomputedWidth(address()); }
    /** Returns the value of the {@code computedHeight} field. */
    public float computedHeight() { return ncomputedHeight(address()); }

    // -----------------------------------

    /** Returns a new {@link YGCachedMeasurement} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static YGCachedMeasurement create(long address) {
        return address == NULL ? null : new YGCachedMeasurement(address, null);
    }

    /**
     * Create a {@link YGCachedMeasurement.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #availableWidth}. */
    public static float navailableWidth(long struct) { return memGetFloat(struct + YGCachedMeasurement.AVAILABLEWIDTH); }
    /** Unsafe version of {@link #availableHeight}. */
    public static float navailableHeight(long struct) { return memGetFloat(struct + YGCachedMeasurement.AVAILABLEHEIGHT); }
    /** Unsafe version of {@link #widthMeasureMode}. */
    public static int nwidthMeasureMode(long struct) { return memGetInt(struct + YGCachedMeasurement.WIDTHMEASUREMODE); }
    /** Unsafe version of {@link #heightMeasureMode}. */
    public static int nheightMeasureMode(long struct) { return memGetInt(struct + YGCachedMeasurement.HEIGHTMEASUREMODE); }
    /** Unsafe version of {@link #computedWidth}. */
    public static float ncomputedWidth(long struct) { return memGetFloat(struct + YGCachedMeasurement.COMPUTEDWIDTH); }
    /** Unsafe version of {@link #computedHeight}. */
    public static float ncomputedHeight(long struct) { return memGetFloat(struct + YGCachedMeasurement.COMPUTEDHEIGHT); }

    // -----------------------------------

    /** An array of {@link YGCachedMeasurement} structs. */
    public static class Buffer extends StructBuffer<YGCachedMeasurement, Buffer> {

        /**
         * Creates a new {@link YGCachedMeasurement.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGCachedMeasurement#SIZEOF}, and its mark will be undefined.
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
        protected YGCachedMeasurement newInstance(long address) {
            return new YGCachedMeasurement(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code availableWidth} field. */
        public float availableWidth() { return YGCachedMeasurement.navailableWidth(address()); }
        /** Returns the value of the {@code availableHeight} field. */
        public float availableHeight() { return YGCachedMeasurement.navailableHeight(address()); }
        /** Returns the value of the {@code widthMeasureMode} field. */
        @NativeType("YGMeasureMode")
        public int widthMeasureMode() { return YGCachedMeasurement.nwidthMeasureMode(address()); }
        /** Returns the value of the {@code heightMeasureMode} field. */
        @NativeType("YGMeasureMode")
        public int heightMeasureMode() { return YGCachedMeasurement.nheightMeasureMode(address()); }
        /** Returns the value of the {@code computedWidth} field. */
        public float computedWidth() { return YGCachedMeasurement.ncomputedWidth(address()); }
        /** Returns the value of the {@code computedHeight} field. */
        public float computedHeight() { return YGCachedMeasurement.ncomputedHeight(address()); }

    }

}