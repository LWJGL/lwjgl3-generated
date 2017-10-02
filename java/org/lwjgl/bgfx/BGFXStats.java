/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Renderer statistics data.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code cpuTimeFrame} &ndash; CPU time between two {@link BGFX#bgfx_frame frame} calls</li>
 * <li>{@code cpuTimeBegin} &ndash; Render thread CPU submit begin time</li>
 * <li>{@code cpuTimeEnd} &ndash; Render thread CPU submit end time</li>
 * <li>{@code cpuTimerFreq} &ndash; CPU timer frequency</li>
 * <li>{@code gpuTimeBegin} &ndash; GPU frame begin time</li>
 * <li>{@code gpuTimeEnd} &ndash; GPU frame end time</li>
 * <li>{@code gpuTimerFreq} &ndash; GPU timer frequency</li>
 * <li>{@code waitRender} &ndash; time spent waiting for render backend thread to finish issuing draw commands to underlying graphics API</li>
 * <li>{@code waitSubmit} &ndash; time spent waiting for submit thread to advance to next frame</li>
 * <li>{@code numDraw} &ndash; number of draw calls submitted</li>
 * <li>{@code numCompute} &ndash; number of compute calls submitted</li>
 * <li>{@code maxGpuLatency} &ndash; GPU driver latency</li>
 * <li>{@code gpuMemoryMax} &ndash; maximum available GPU memory</li>
 * <li>{@code gpuMemoryUsed} &ndash; available GPU memory</li>
 * <li>{@code width} &ndash; backbuffer width in pixels</li>
 * <li>{@code height} &ndash; backbuffer height in pixels</li>
 * <li>{@code textWidth} &ndash; debug text width in characters</li>
 * <li>{@code textHeight} &ndash; debug text height in characters</li>
 * <li>{@code numViews} &ndash; number of view stats</li>
 * <li>{@code viewStats} &ndash; view stats</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_stats_t {
 *     int64_t cpuTimeFrame;
 *     int64_t cpuTimeBegin;
 *     int64_t cpuTimeEnd;
 *     int64_t cpuTimerFreq;
 *     int64_t gpuTimeBegin;
 *     int64_t gpuTimeEnd;
 *     int64_t gpuTimerFreq;
 *     int64_t waitRender;
 *     int64_t waitSubmit;
 *     uint32_t numDraw;
 *     uint32_t numCompute;
 *     uint32_t maxGpuLatency;
 *     int64_t gpuMemoryMax;
 *     int64_t gpuMemoryUsed;
 *     uint16_t width;
 *     uint16_t height;
 *     uint16_t textWidth;
 *     uint16_t textHeight;
 *     uint16_t numViews;
 *     {@link BGFXViewStats bgfx_view_stats_t} viewStats[256];
 * }</pre></code>
 */
@NativeType("struct bgfx_stats_t")
public class BGFXStats extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CPUTIMEFRAME,
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
        GPUMEMORYMAX,
        GPUMEMORYUSED,
        WIDTH,
        HEIGHT,
        TEXTWIDTH,
        TEXTHEIGHT,
        NUMVIEWS,
        VIEWSTATS;

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
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __array(BGFXViewStats.SIZEOF, BGFXViewStats.ALIGNOF, 256)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CPUTIMEFRAME = layout.offsetof(0);
        CPUTIMEBEGIN = layout.offsetof(1);
        CPUTIMEEND = layout.offsetof(2);
        CPUTIMERFREQ = layout.offsetof(3);
        GPUTIMEBEGIN = layout.offsetof(4);
        GPUTIMEEND = layout.offsetof(5);
        GPUTIMERFREQ = layout.offsetof(6);
        WAITRENDER = layout.offsetof(7);
        WAITSUBMIT = layout.offsetof(8);
        NUMDRAW = layout.offsetof(9);
        NUMCOMPUTE = layout.offsetof(10);
        MAXGPULATENCY = layout.offsetof(11);
        GPUMEMORYMAX = layout.offsetof(12);
        GPUMEMORYUSED = layout.offsetof(13);
        WIDTH = layout.offsetof(14);
        HEIGHT = layout.offsetof(15);
        TEXTWIDTH = layout.offsetof(16);
        TEXTHEIGHT = layout.offsetof(17);
        NUMVIEWS = layout.offsetof(18);
        VIEWSTATS = layout.offsetof(19);
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

    /** Returns the value of the {@code cpuTimeFrame} field. */
    @NativeType("int64_t")
    public long cpuTimeFrame() { return ncpuTimeFrame(address()); }
    /** Returns the value of the {@code cpuTimeBegin} field. */
    @NativeType("int64_t")
    public long cpuTimeBegin() { return ncpuTimeBegin(address()); }
    /** Returns the value of the {@code cpuTimeEnd} field. */
    @NativeType("int64_t")
    public long cpuTimeEnd() { return ncpuTimeEnd(address()); }
    /** Returns the value of the {@code cpuTimerFreq} field. */
    @NativeType("int64_t")
    public long cpuTimerFreq() { return ncpuTimerFreq(address()); }
    /** Returns the value of the {@code gpuTimeBegin} field. */
    @NativeType("int64_t")
    public long gpuTimeBegin() { return ngpuTimeBegin(address()); }
    /** Returns the value of the {@code gpuTimeEnd} field. */
    @NativeType("int64_t")
    public long gpuTimeEnd() { return ngpuTimeEnd(address()); }
    /** Returns the value of the {@code gpuTimerFreq} field. */
    @NativeType("int64_t")
    public long gpuTimerFreq() { return ngpuTimerFreq(address()); }
    /** Returns the value of the {@code waitRender} field. */
    @NativeType("int64_t")
    public long waitRender() { return nwaitRender(address()); }
    /** Returns the value of the {@code waitSubmit} field. */
    @NativeType("int64_t")
    public long waitSubmit() { return nwaitSubmit(address()); }
    /** Returns the value of the {@code numDraw} field. */
    @NativeType("uint32_t")
    public int numDraw() { return nnumDraw(address()); }
    /** Returns the value of the {@code numCompute} field. */
    @NativeType("uint32_t")
    public int numCompute() { return nnumCompute(address()); }
    /** Returns the value of the {@code maxGpuLatency} field. */
    @NativeType("uint32_t")
    public int maxGpuLatency() { return nmaxGpuLatency(address()); }
    /** Returns the value of the {@code gpuMemoryMax} field. */
    @NativeType("int64_t")
    public long gpuMemoryMax() { return ngpuMemoryMax(address()); }
    /** Returns the value of the {@code gpuMemoryUsed} field. */
    @NativeType("int64_t")
    public long gpuMemoryUsed() { return ngpuMemoryUsed(address()); }
    /** Returns the value of the {@code width} field. */
    @NativeType("uint16_t")
    public short width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    @NativeType("uint16_t")
    public short height() { return nheight(address()); }
    /** Returns the value of the {@code textWidth} field. */
    @NativeType("uint16_t")
    public short textWidth() { return ntextWidth(address()); }
    /** Returns the value of the {@code textHeight} field. */
    @NativeType("uint16_t")
    public short textHeight() { return ntextHeight(address()); }
    /** Returns the value of the {@code numViews} field. */
    @NativeType("uint16_t")
    public short numViews() { return nnumViews(address()); }
    /** Returns a {@link BGFXViewStats}.Buffer view of the {@code viewStats} field. */
    @NativeType("bgfx_view_stats_t[256]")
    public BGFXViewStats.Buffer viewStats() { return nviewStats(address()); }
    /** Returns a {@link BGFXViewStats} view of the struct at the specified index of the {@code viewStats} field. */
    @NativeType("bgfx_view_stats_t")
    public BGFXViewStats viewStats(int index) { return nviewStats(address(), index); }

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

    /** Unsafe version of {@link #cpuTimeFrame}. */
    public static long ncpuTimeFrame(long struct) { return memGetLong(struct + BGFXStats.CPUTIMEFRAME); }
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
    /** Unsafe version of {@link #gpuMemoryMax}. */
    public static long ngpuMemoryMax(long struct) { return memGetLong(struct + BGFXStats.GPUMEMORYMAX); }
    /** Unsafe version of {@link #gpuMemoryUsed}. */
    public static long ngpuMemoryUsed(long struct) { return memGetLong(struct + BGFXStats.GPUMEMORYUSED); }
    /** Unsafe version of {@link #width}. */
    public static short nwidth(long struct) { return memGetShort(struct + BGFXStats.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static short nheight(long struct) { return memGetShort(struct + BGFXStats.HEIGHT); }
    /** Unsafe version of {@link #textWidth}. */
    public static short ntextWidth(long struct) { return memGetShort(struct + BGFXStats.TEXTWIDTH); }
    /** Unsafe version of {@link #textHeight}. */
    public static short ntextHeight(long struct) { return memGetShort(struct + BGFXStats.TEXTHEIGHT); }
    /** Unsafe version of {@link #numViews}. */
    public static short nnumViews(long struct) { return memGetShort(struct + BGFXStats.NUMVIEWS); }
    /** Unsafe version of {@link #viewStats}. */
    public static BGFXViewStats.Buffer nviewStats(long struct) { return BGFXViewStats.create(struct + BGFXStats.VIEWSTATS, Short.toUnsignedInt(nnumViews(struct))); }
    /** Unsafe version of {@link #viewStats(int) viewStats}. */
    public static BGFXViewStats nviewStats(long struct, int index) {
        if (CHECKS) { check(index, Short.toUnsignedInt(nnumViews(struct))); }
        return BGFXViewStats.create(struct + BGFXStats.VIEWSTATS + index * BGFXViewStats.SIZEOF);
    }

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
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code cpuTimeFrame} field. */
        @NativeType("int64_t")
        public long cpuTimeFrame() { return BGFXStats.ncpuTimeFrame(address()); }
        /** Returns the value of the {@code cpuTimeBegin} field. */
        @NativeType("int64_t")
        public long cpuTimeBegin() { return BGFXStats.ncpuTimeBegin(address()); }
        /** Returns the value of the {@code cpuTimeEnd} field. */
        @NativeType("int64_t")
        public long cpuTimeEnd() { return BGFXStats.ncpuTimeEnd(address()); }
        /** Returns the value of the {@code cpuTimerFreq} field. */
        @NativeType("int64_t")
        public long cpuTimerFreq() { return BGFXStats.ncpuTimerFreq(address()); }
        /** Returns the value of the {@code gpuTimeBegin} field. */
        @NativeType("int64_t")
        public long gpuTimeBegin() { return BGFXStats.ngpuTimeBegin(address()); }
        /** Returns the value of the {@code gpuTimeEnd} field. */
        @NativeType("int64_t")
        public long gpuTimeEnd() { return BGFXStats.ngpuTimeEnd(address()); }
        /** Returns the value of the {@code gpuTimerFreq} field. */
        @NativeType("int64_t")
        public long gpuTimerFreq() { return BGFXStats.ngpuTimerFreq(address()); }
        /** Returns the value of the {@code waitRender} field. */
        @NativeType("int64_t")
        public long waitRender() { return BGFXStats.nwaitRender(address()); }
        /** Returns the value of the {@code waitSubmit} field. */
        @NativeType("int64_t")
        public long waitSubmit() { return BGFXStats.nwaitSubmit(address()); }
        /** Returns the value of the {@code numDraw} field. */
        @NativeType("uint32_t")
        public int numDraw() { return BGFXStats.nnumDraw(address()); }
        /** Returns the value of the {@code numCompute} field. */
        @NativeType("uint32_t")
        public int numCompute() { return BGFXStats.nnumCompute(address()); }
        /** Returns the value of the {@code maxGpuLatency} field. */
        @NativeType("uint32_t")
        public int maxGpuLatency() { return BGFXStats.nmaxGpuLatency(address()); }
        /** Returns the value of the {@code gpuMemoryMax} field. */
        @NativeType("int64_t")
        public long gpuMemoryMax() { return BGFXStats.ngpuMemoryMax(address()); }
        /** Returns the value of the {@code gpuMemoryUsed} field. */
        @NativeType("int64_t")
        public long gpuMemoryUsed() { return BGFXStats.ngpuMemoryUsed(address()); }
        /** Returns the value of the {@code width} field. */
        @NativeType("uint16_t")
        public short width() { return BGFXStats.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        @NativeType("uint16_t")
        public short height() { return BGFXStats.nheight(address()); }
        /** Returns the value of the {@code textWidth} field. */
        @NativeType("uint16_t")
        public short textWidth() { return BGFXStats.ntextWidth(address()); }
        /** Returns the value of the {@code textHeight} field. */
        @NativeType("uint16_t")
        public short textHeight() { return BGFXStats.ntextHeight(address()); }
        /** Returns the value of the {@code numViews} field. */
        @NativeType("uint16_t")
        public short numViews() { return BGFXStats.nnumViews(address()); }
        /** Returns a {@link BGFXViewStats}.Buffer view of the {@code viewStats} field. */
        @NativeType("bgfx_view_stats_t[256]")
        public BGFXViewStats.Buffer viewStats() { return BGFXStats.nviewStats(address()); }
        /** Returns a {@link BGFXViewStats} view of the struct at the specified index of the {@code viewStats} field. */
        @NativeType("bgfx_view_stats_t")
        public BGFXViewStats viewStats(int index) { return BGFXStats.nviewStats(address(), index); }

    }

}