/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Renderer statistics data.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code cpuTimeBegin} &ndash; CPU frame begin time</li>
 * <li>{@code cpuTimeEnd} &ndash; CPU frame end time</li>
 * <li>{@code cpuTimerFreq} &ndash; CPU timer frequency</li>
 * <li>{@code gpuTimeBegin} &ndash; GPU frame begin time</li>
 * <li>{@code gpuTimeEnd} &ndash; GPU frame end time</li>
 * <li>{@code gpuTimerFreq} &ndash; GPU timer frequency</li>
 * <li>{@code waitRender} &ndash; time spent waiting for render backend thread to finish issuing draw commands to underlying graphics API</li>
 * <li>{@code waitSubmit} &ndash; time spent waiting for submit thread to advance to next frame</li>
 * <li>{@code numDraw} &ndash; number of draw calls submitted</li>
 * <li>{@code numCompute} &ndash; number of compute calls submitted</li>
 * <li>{@code maxGpuLatency} &ndash; GPU driver latency</li>
 * <li>{@code width} &ndash; backbuffer width in pixels</li>
 * <li>{@code height} &ndash; backbuffer height in pixels</li>
 * <li>{@code textWidth} &ndash; debug text width in characters</li>
 * <li>{@code textHeight} &ndash; debug text height in characters</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_stats_t {
 *     uint64_t cpuTimeBegin;
 *     uint64_t cpuTimeEnd;
 *     uint64_t cpuTimerFreq;
 *     uint64_t gpuTimeBegin;
 *     uint64_t gpuTimeEnd;
 *     uint64_t gpuTimerFreq;
 *     int64_t waitRender;
 *     int64_t waitSubmit;
 *     uint32_t numDraw;
 *     uint32_t numCompute;
 *     uint32_t maxGpuLatency;
 *     uint16_t width;
 *     uint16_t height;
 *     uint16_t textWidth;
 *     uint16_t textHeight;
 * }</pre></code>
 */
public class BGFXStats extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CPUTIMEBEGIN,
        CPUTIMEEND,
        CPUTIMERFREQ,
        GPUTIMEBEGIN,
        GPUTIMEEND,
        GPUTIMERFREQ,
        WAITRENDER,
        WAITSUBMIT,
        NUMDRAW,
        NUMCOMPUTE,
        MAXGPULATENCY,
        WIDTH,
        HEIGHT,
        TEXTWIDTH,
        TEXTHEIGHT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CPUTIMEBEGIN = layout.offsetof(0);
        CPUTIMEEND = layout.offsetof(1);
        CPUTIMERFREQ = layout.offsetof(2);
        GPUTIMEBEGIN = layout.offsetof(3);
        GPUTIMEEND = layout.offsetof(4);
        GPUTIMERFREQ = layout.offsetof(5);
        WAITRENDER = layout.offsetof(6);
        WAITSUBMIT = layout.offsetof(7);
        NUMDRAW = layout.offsetof(8);
        NUMCOMPUTE = layout.offsetof(9);
        MAXGPULATENCY = layout.offsetof(10);
        WIDTH = layout.offsetof(11);
        HEIGHT = layout.offsetof(12);
        TEXTWIDTH = layout.offsetof(13);
        TEXTHEIGHT = layout.offsetof(14);
    }

    BGFXStats(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXStats(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code cpuTimeBegin} field. */
    public long cpuTimeBegin() { return ncpuTimeBegin(address()); }
    /** Returns the value of the {@code cpuTimeEnd} field. */
    public long cpuTimeEnd() { return ncpuTimeEnd(address()); }
    /** Returns the value of the {@code cpuTimerFreq} field. */
    public long cpuTimerFreq() { return ncpuTimerFreq(address()); }
    /** Returns the value of the {@code gpuTimeBegin} field. */
    public long gpuTimeBegin() { return ngpuTimeBegin(address()); }
    /** Returns the value of the {@code gpuTimeEnd} field. */
    public long gpuTimeEnd() { return ngpuTimeEnd(address()); }
    /** Returns the value of the {@code gpuTimerFreq} field. */
    public long gpuTimerFreq() { return ngpuTimerFreq(address()); }
    /** Returns the value of the {@code waitRender} field. */
    public long waitRender() { return nwaitRender(address()); }
    /** Returns the value of the {@code waitSubmit} field. */
    public long waitSubmit() { return nwaitSubmit(address()); }
    /** Returns the value of the {@code numDraw} field. */
    public int numDraw() { return nnumDraw(address()); }
    /** Returns the value of the {@code numCompute} field. */
    public int numCompute() { return nnumCompute(address()); }
    /** Returns the value of the {@code maxGpuLatency} field. */
    public int maxGpuLatency() { return nmaxGpuLatency(address()); }
    /** Returns the value of the {@code width} field. */
    public short width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    public short height() { return nheight(address()); }
    /** Returns the value of the {@code textWidth} field. */
    public short textWidth() { return ntextWidth(address()); }
    /** Returns the value of the {@code textHeight} field. */
    public short textHeight() { return ntextHeight(address()); }

    // -----------------------------------

    /** Returns a new {@link BGFXStats} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static BGFXStats create(long address) {
        return address == NULL ? null : new BGFXStats(address, null);
    }

    /**
     * Create a {@link BGFXStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cpuTimeBegin}. */
    public static long ncpuTimeBegin(long struct) { return memGetLong(struct + BGFXStats.CPUTIMEBEGIN); }
    /** Unsafe version of {@link #cpuTimeEnd}. */
    public static long ncpuTimeEnd(long struct) { return memGetLong(struct + BGFXStats.CPUTIMEEND); }
    /** Unsafe version of {@link #cpuTimerFreq}. */
    public static long ncpuTimerFreq(long struct) { return memGetLong(struct + BGFXStats.CPUTIMERFREQ); }
    /** Unsafe version of {@link #gpuTimeBegin}. */
    public static long ngpuTimeBegin(long struct) { return memGetLong(struct + BGFXStats.GPUTIMEBEGIN); }
    /** Unsafe version of {@link #gpuTimeEnd}. */
    public static long ngpuTimeEnd(long struct) { return memGetLong(struct + BGFXStats.GPUTIMEEND); }
    /** Unsafe version of {@link #gpuTimerFreq}. */
    public static long ngpuTimerFreq(long struct) { return memGetLong(struct + BGFXStats.GPUTIMERFREQ); }
    /** Unsafe version of {@link #waitRender}. */
    public static long nwaitRender(long struct) { return memGetLong(struct + BGFXStats.WAITRENDER); }
    /** Unsafe version of {@link #waitSubmit}. */
    public static long nwaitSubmit(long struct) { return memGetLong(struct + BGFXStats.WAITSUBMIT); }
    /** Unsafe version of {@link #numDraw}. */
    public static int nnumDraw(long struct) { return memGetInt(struct + BGFXStats.NUMDRAW); }
    /** Unsafe version of {@link #numCompute}. */
    public static int nnumCompute(long struct) { return memGetInt(struct + BGFXStats.NUMCOMPUTE); }
    /** Unsafe version of {@link #maxGpuLatency}. */
    public static int nmaxGpuLatency(long struct) { return memGetInt(struct + BGFXStats.MAXGPULATENCY); }
    /** Unsafe version of {@link #width}. */
    public static short nwidth(long struct) { return memGetShort(struct + BGFXStats.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static short nheight(long struct) { return memGetShort(struct + BGFXStats.HEIGHT); }
    /** Unsafe version of {@link #textWidth}. */
    public static short ntextWidth(long struct) { return memGetShort(struct + BGFXStats.TEXTWIDTH); }
    /** Unsafe version of {@link #textHeight}. */
    public static short ntextHeight(long struct) { return memGetShort(struct + BGFXStats.TEXTHEIGHT); }

    // -----------------------------------

    /** An array of {@link BGFXStats} structs. */
    public static class Buffer extends StructBuffer<BGFXStats, Buffer> {

        /**
         * Creates a new {@link BGFXStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXStats#SIZEOF}, and its mark will be undefined.
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
        protected BGFXStats newInstance(long address) {
            return new BGFXStats(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code cpuTimeBegin} field. */
        public long cpuTimeBegin() { return BGFXStats.ncpuTimeBegin(address()); }
        /** Returns the value of the {@code cpuTimeEnd} field. */
        public long cpuTimeEnd() { return BGFXStats.ncpuTimeEnd(address()); }
        /** Returns the value of the {@code cpuTimerFreq} field. */
        public long cpuTimerFreq() { return BGFXStats.ncpuTimerFreq(address()); }
        /** Returns the value of the {@code gpuTimeBegin} field. */
        public long gpuTimeBegin() { return BGFXStats.ngpuTimeBegin(address()); }
        /** Returns the value of the {@code gpuTimeEnd} field. */
        public long gpuTimeEnd() { return BGFXStats.ngpuTimeEnd(address()); }
        /** Returns the value of the {@code gpuTimerFreq} field. */
        public long gpuTimerFreq() { return BGFXStats.ngpuTimerFreq(address()); }
        /** Returns the value of the {@code waitRender} field. */
        public long waitRender() { return BGFXStats.nwaitRender(address()); }
        /** Returns the value of the {@code waitSubmit} field. */
        public long waitSubmit() { return BGFXStats.nwaitSubmit(address()); }
        /** Returns the value of the {@code numDraw} field. */
        public int numDraw() { return BGFXStats.nnumDraw(address()); }
        /** Returns the value of the {@code numCompute} field. */
        public int numCompute() { return BGFXStats.nnumCompute(address()); }
        /** Returns the value of the {@code maxGpuLatency} field. */
        public int maxGpuLatency() { return BGFXStats.nmaxGpuLatency(address()); }
        /** Returns the value of the {@code width} field. */
        public short width() { return BGFXStats.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        public short height() { return BGFXStats.nheight(address()); }
        /** Returns the value of the {@code textWidth} field. */
        public short textWidth() { return BGFXStats.ntextWidth(address()); }
        /** Returns the value of the {@code textHeight} field. */
        public short textHeight() { return BGFXStats.ntextHeight(address()); }

    }

}