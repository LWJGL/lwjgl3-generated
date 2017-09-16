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
 * View stats.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code name} &ndash; view name</li>
 * <li>{@code view} &ndash; view id</li>
 * <li>{@code cpuTimeElapsed} &ndash; CPU (submit) time elapsed</li>
 * <li>{@code gpuTimeElapsed} &ndash; GPU time elapsed</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_view_stats_t {
 *     char name[256];
 *     uint8_t view;
 *     uint64_t cpuTimeElapsed;
 *     uint64_t gpuTimeElapsed;
 * }</pre></code>
 */
@NativeType("struct bgfx_view_stats_t")
public class BGFXViewStats extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        VIEW,
        CPUTIMEELAPSED,
        GPUTIMEELAPSED;

    static {
        Layout layout = __struct(
            __array(1, 256),
            __member(1),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        VIEW = layout.offsetof(1);
        CPUTIMEELAPSED = layout.offsetof(2);
        GPUTIMEELAPSED = layout.offsetof(3);
    }

    BGFXViewStats(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXViewStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXViewStats(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[256]")
    public ByteBuffer name() { return nname(address()); }
    /** Decodes the null-terminated string stored in the {@code name} field. */
    @NativeType("char[256]")
    public String nameString() { return nnameString(address()); }
    /** Returns the value of the {@code view} field. */
    @NativeType("uint8_t")
    public byte view() { return nview(address()); }
    /** Returns the value of the {@code cpuTimeElapsed} field. */
    @NativeType("uint64_t")
    public long cpuTimeElapsed() { return ncpuTimeElapsed(address()); }
    /** Returns the value of the {@code gpuTimeElapsed} field. */
    @NativeType("uint64_t")
    public long gpuTimeElapsed() { return ngpuTimeElapsed(address()); }

    // -----------------------------------

    /** Returns a new {@link BGFXViewStats} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static BGFXViewStats create(long address) {
        return address == NULL ? null : new BGFXViewStats(address, null);
    }

    /**
     * Create a {@link BGFXViewStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + BGFXViewStats.NAME, 256); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(struct + BGFXViewStats.NAME); }
    /** Unsafe version of {@link #view}. */
    public static byte nview(long struct) { return memGetByte(struct + BGFXViewStats.VIEW); }
    /** Unsafe version of {@link #cpuTimeElapsed}. */
    public static long ncpuTimeElapsed(long struct) { return memGetLong(struct + BGFXViewStats.CPUTIMEELAPSED); }
    /** Unsafe version of {@link #gpuTimeElapsed}. */
    public static long ngpuTimeElapsed(long struct) { return memGetLong(struct + BGFXViewStats.GPUTIMEELAPSED); }

    // -----------------------------------

    /** An array of {@link BGFXViewStats} structs. */
    public static class Buffer extends StructBuffer<BGFXViewStats, Buffer> {

        /**
         * Creates a new {@link BGFXViewStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXViewStats#SIZEOF}, and its mark will be undefined.
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
        protected BGFXViewStats newInstance(long address) {
            return new BGFXViewStats(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[256]")
        public ByteBuffer name() { return BGFXViewStats.nname(address()); }
        /** Decodes the null-terminated string stored in the {@code name} field. */
        @NativeType("char[256]")
        public String nameString() { return BGFXViewStats.nnameString(address()); }
        /** Returns the value of the {@code view} field. */
        @NativeType("uint8_t")
        public byte view() { return BGFXViewStats.nview(address()); }
        /** Returns the value of the {@code cpuTimeElapsed} field. */
        @NativeType("uint64_t")
        public long cpuTimeElapsed() { return BGFXViewStats.ncpuTimeElapsed(address()); }
        /** Returns the value of the {@code gpuTimeElapsed} field. */
        @NativeType("uint64_t")
        public long gpuTimeElapsed() { return BGFXViewStats.ngpuTimeElapsed(address()); }

    }

}