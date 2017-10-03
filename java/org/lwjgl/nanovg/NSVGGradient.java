/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct NSVGgradient {
 *     float xform[6];
 *     char spread;
 *     float fx;
 *     float fy;
 *     int nstops;
 *     {@link NSVGGradientStop NSVGgradientStop} pstops[1];
 * }</pre></code>
 */
@NativeType("struct NSVGgradient")
public class NSVGGradient extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        XFORM,
        SPREAD,
        FX,
        FY,
        NSTOPS,
        PSTOPS;

    static {
        Layout layout = __struct(
            __array(4, 6),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __array(NSVGGradientStop.SIZEOF, NSVGGradientStop.ALIGNOF, 1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        XFORM = layout.offsetof(0);
        SPREAD = layout.offsetof(1);
        FX = layout.offsetof(2);
        FY = layout.offsetof(3);
        NSTOPS = layout.offsetof(4);
        PSTOPS = layout.offsetof(5);
    }

    NSVGGradient(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NSVGGradient} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NSVGGradient(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FloatBuffer} view of the {@code xform} field. */
    @NativeType("float[6]")
    public FloatBuffer xform() { return nxform(address()); }
    /** Returns the value at the specified index of the {@code xform} field. */
    public float xform(int index) { return nxform(address(), index); }
    /** Returns the value of the {@code spread} field. */
    @NativeType("char")
    public byte spread() { return nspread(address()); }
    /** Returns the value of the {@code fx} field. */
    public float fx() { return nfx(address()); }
    /** Returns the value of the {@code fy} field. */
    public float fy() { return nfy(address()); }
    /** Returns the value of the {@code nstops} field. */
    public int nstops() { return nnstops(address()); }
    /** Returns a {@link NSVGGradientStop}.Buffer view of the {@code pstops} field. */
    @NativeType("NSVGgradientStop[1]")
    public NSVGGradientStop.Buffer pstops() { return npstops(address()); }
    /** Returns a {@link NSVGGradientStop} view of the struct at the specified index of the {@code pstops} field. */
    @NativeType("NSVGgradientStop")
    public NSVGGradientStop pstops(int index) { return npstops(address(), index); }

    // -----------------------------------

    /** Returns a new {@link NSVGGradient} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static NSVGGradient create(long address) {
        return address == NULL ? null : new NSVGGradient(address, null);
    }

    /**
     * Create a {@link NSVGGradient.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #xform}. */
    public static FloatBuffer nxform(long struct) { return memFloatBuffer(struct + NSVGGradient.XFORM, 6); }
    /** Unsafe version of {@link #xform(int) xform}. */
    public static float nxform(long struct, int index) {
        if (CHECKS) { check(index, 6); }
        return memGetFloat(struct + NSVGGradient.XFORM + index * 4);
    }
    /** Unsafe version of {@link #spread}. */
    public static byte nspread(long struct) { return memGetByte(struct + NSVGGradient.SPREAD); }
    /** Unsafe version of {@link #fx}. */
    public static float nfx(long struct) { return memGetFloat(struct + NSVGGradient.FX); }
    /** Unsafe version of {@link #fy}. */
    public static float nfy(long struct) { return memGetFloat(struct + NSVGGradient.FY); }
    /** Unsafe version of {@link #nstops}. */
    public static int nnstops(long struct) { return memGetInt(struct + NSVGGradient.NSTOPS); }
    /** Unsafe version of {@link #pstops}. */
    public static NSVGGradientStop.Buffer npstops(long struct) { return NSVGGradientStop.create(struct + NSVGGradient.PSTOPS, nnstops(struct)); }
    /** Unsafe version of {@link #pstops(int) pstops}. */
    public static NSVGGradientStop npstops(long struct, int index) {
        if (CHECKS) { check(index, nnstops(struct)); }
        return NSVGGradientStop.create(struct + NSVGGradient.PSTOPS + index * NSVGGradientStop.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link NSVGGradient} structs. */
    public static class Buffer extends StructBuffer<NSVGGradient, Buffer> {

        /**
         * Creates a new {@link NSVGGradient.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NSVGGradient#SIZEOF}, and its mark will be undefined.
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
        protected NSVGGradient newInstance(long address) {
            return new NSVGGradient(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link FloatBuffer} view of the {@code xform} field. */
        @NativeType("float[6]")
        public FloatBuffer xform() { return NSVGGradient.nxform(address()); }
        /** Returns the value at the specified index of the {@code xform} field. */
        public float xform(int index) { return NSVGGradient.nxform(address(), index); }
        /** Returns the value of the {@code spread} field. */
        @NativeType("char")
        public byte spread() { return NSVGGradient.nspread(address()); }
        /** Returns the value of the {@code fx} field. */
        public float fx() { return NSVGGradient.nfx(address()); }
        /** Returns the value of the {@code fy} field. */
        public float fy() { return NSVGGradient.nfy(address()); }
        /** Returns the value of the {@code nstops} field. */
        public int nstops() { return NSVGGradient.nnstops(address()); }
        /** Returns a {@link NSVGGradientStop}.Buffer view of the {@code pstops} field. */
        @NativeType("NSVGgradientStop[1]")
        public NSVGGradientStop.Buffer pstops() { return NSVGGradient.npstops(address()); }
        /** Returns a {@link NSVGGradientStop} view of the struct at the specified index of the {@code pstops} field. */
        @NativeType("NSVGgradientStop")
        public NSVGGradientStop pstops(int index) { return NSVGGradient.npstops(address(), index); }

    }

}