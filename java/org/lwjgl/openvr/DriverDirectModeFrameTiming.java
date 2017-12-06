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
 * Frame timing data provided by direct mode drivers.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code m_nSize} &ndash; sSet to {@code sizeof( DriverDirectMode_FrameTiming )}</li>
 * <li>{@code m_nNumFramePresents} &ndash; number of times frame was presented</li>
 * <li>{@code m_nNumMisPresented} &ndash; number of times frame was presented on a vsync other than it was originally predicted to</li>
 * <li>{@code m_nNumDroppedFrames} &ndash; number of additional times previous frame was scanned out (i.e. compositor missed vsync)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct DriverDirectMode_FrameTiming {
 *     uint32_t m_nSize;
 *     uint32_t m_nNumFramePresents;
 *     uint32_t m_nNumMisPresented;
 *     uint32_t m_nNumDroppedFrames;
 *     uint32_t m_nReprojectionFlags;
 * }</pre></code>
 */
@NativeType("struct DriverDirectMode_FrameTiming")
public class DriverDirectModeFrameTiming extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NSIZE,
        M_NNUMFRAMEPRESENTS,
        M_NNUMMISPRESENTED,
        M_NNUMDROPPEDFRAMES,
        M_NREPROJECTIONFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NSIZE = layout.offsetof(0);
        M_NNUMFRAMEPRESENTS = layout.offsetof(1);
        M_NNUMMISPRESENTED = layout.offsetof(2);
        M_NNUMDROPPEDFRAMES = layout.offsetof(3);
        M_NREPROJECTIONFLAGS = layout.offsetof(4);
    }

    DriverDirectModeFrameTiming(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link DriverDirectModeFrameTiming} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DriverDirectModeFrameTiming(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_nSize} field. */
    @NativeType("uint32_t")
    public int m_nSize() { return nm_nSize(address()); }
    /** Returns the value of the {@code m_nNumFramePresents} field. */
    @NativeType("uint32_t")
    public int m_nNumFramePresents() { return nm_nNumFramePresents(address()); }
    /** Returns the value of the {@code m_nNumMisPresented} field. */
    @NativeType("uint32_t")
    public int m_nNumMisPresented() { return nm_nNumMisPresented(address()); }
    /** Returns the value of the {@code m_nNumDroppedFrames} field. */
    @NativeType("uint32_t")
    public int m_nNumDroppedFrames() { return nm_nNumDroppedFrames(address()); }
    /** Returns the value of the {@code m_nReprojectionFlags} field. */
    @NativeType("uint32_t")
    public int m_nReprojectionFlags() { return nm_nReprojectionFlags(address()); }

    // -----------------------------------

    /** Returns a new {@link DriverDirectModeFrameTiming} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static DriverDirectModeFrameTiming create(long address) {
        return address == NULL ? null : new DriverDirectModeFrameTiming(address, null);
    }

    /**
     * Create a {@link DriverDirectModeFrameTiming.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_nSize}. */
    public static int nm_nSize(long struct) { return memGetInt(struct + DriverDirectModeFrameTiming.M_NSIZE); }
    /** Unsafe version of {@link #m_nNumFramePresents}. */
    public static int nm_nNumFramePresents(long struct) { return memGetInt(struct + DriverDirectModeFrameTiming.M_NNUMFRAMEPRESENTS); }
    /** Unsafe version of {@link #m_nNumMisPresented}. */
    public static int nm_nNumMisPresented(long struct) { return memGetInt(struct + DriverDirectModeFrameTiming.M_NNUMMISPRESENTED); }
    /** Unsafe version of {@link #m_nNumDroppedFrames}. */
    public static int nm_nNumDroppedFrames(long struct) { return memGetInt(struct + DriverDirectModeFrameTiming.M_NNUMDROPPEDFRAMES); }
    /** Unsafe version of {@link #m_nReprojectionFlags}. */
    public static int nm_nReprojectionFlags(long struct) { return memGetInt(struct + DriverDirectModeFrameTiming.M_NREPROJECTIONFLAGS); }

    // -----------------------------------

    /** An array of {@link DriverDirectModeFrameTiming} structs. */
    public static class Buffer extends StructBuffer<DriverDirectModeFrameTiming, Buffer> {

        /**
         * Creates a new {@link DriverDirectModeFrameTiming.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DriverDirectModeFrameTiming#SIZEOF}, and its mark will be undefined.
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
        protected DriverDirectModeFrameTiming newInstance(long address) {
            return new DriverDirectModeFrameTiming(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code m_nSize} field. */
        @NativeType("uint32_t")
        public int m_nSize() { return DriverDirectModeFrameTiming.nm_nSize(address()); }
        /** Returns the value of the {@code m_nNumFramePresents} field. */
        @NativeType("uint32_t")
        public int m_nNumFramePresents() { return DriverDirectModeFrameTiming.nm_nNumFramePresents(address()); }
        /** Returns the value of the {@code m_nNumMisPresented} field. */
        @NativeType("uint32_t")
        public int m_nNumMisPresented() { return DriverDirectModeFrameTiming.nm_nNumMisPresented(address()); }
        /** Returns the value of the {@code m_nNumDroppedFrames} field. */
        @NativeType("uint32_t")
        public int m_nNumDroppedFrames() { return DriverDirectModeFrameTiming.nm_nNumDroppedFrames(address()); }
        /** Returns the value of the {@code m_nReprojectionFlags} field. */
        @NativeType("uint32_t")
        public int m_nReprojectionFlags() { return DriverDirectModeFrameTiming.nm_nReprojectionFlags(address()); }

    }

}