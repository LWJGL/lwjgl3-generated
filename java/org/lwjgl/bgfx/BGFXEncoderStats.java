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
 * Encoder stats.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code cpuTimeBegin} &ndash; encoder thread CPU submit begin time</li>
 * <li>{@code cpuTimeEnd} &ndash; encoder thread CPU submit end time</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_encoder_stats_t {
 *     int64_t cpuTimeBegin;
 *     int64_t cpuTimeEnd;
 * }</pre></code>
 */
@NativeType("struct bgfx_encoder_stats_t")
public class BGFXEncoderStats extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CPUTIMEBEGIN,
        CPUTIMEEND;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CPUTIMEBEGIN = layout.offsetof(0);
        CPUTIMEEND = layout.offsetof(1);
    }

    BGFXEncoderStats(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXEncoderStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXEncoderStats(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code cpuTimeBegin} field. */
    @NativeType("int64_t")
    public long cpuTimeBegin() { return ncpuTimeBegin(address()); }
    /** Returns the value of the {@code cpuTimeEnd} field. */
    @NativeType("int64_t")
    public long cpuTimeEnd() { return ncpuTimeEnd(address()); }

    // -----------------------------------

    /** Returns a new {@link BGFXEncoderStats} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static BGFXEncoderStats create(long address) {
        return address == NULL ? null : new BGFXEncoderStats(address, null);
    }

    /**
     * Create a {@link BGFXEncoderStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cpuTimeBegin}. */
    public static long ncpuTimeBegin(long struct) { return memGetLong(struct + BGFXEncoderStats.CPUTIMEBEGIN); }
    /** Unsafe version of {@link #cpuTimeEnd}. */
    public static long ncpuTimeEnd(long struct) { return memGetLong(struct + BGFXEncoderStats.CPUTIMEEND); }

    // -----------------------------------

    /** An array of {@link BGFXEncoderStats} structs. */
    public static class Buffer extends StructBuffer<BGFXEncoderStats, Buffer> {

        /**
         * Creates a new {@link BGFXEncoderStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXEncoderStats#SIZEOF}, and its mark will be undefined.
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
        protected BGFXEncoderStats newInstance(long address) {
            return new BGFXEncoderStats(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code cpuTimeBegin} field. */
        @NativeType("int64_t")
        public long cpuTimeBegin() { return BGFXEncoderStats.ncpuTimeBegin(address()); }
        /** Returns the value of the {@code cpuTimeEnd} field. */
        @NativeType("int64_t")
        public long cpuTimeEnd() { return BGFXEncoderStats.ncpuTimeEnd(address()); }

    }

}