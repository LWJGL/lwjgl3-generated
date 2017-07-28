/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * An RGBA color with normalized float components.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code r} &ndash; the R component</li>
 * <li>{@code g} &ndash; the G component</li>
 * <li>{@code b} &ndash; the B component</li>
 * <li>{@code a} &ndash; the A component</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrColorf {
 *     float r;
 *     float g;
 *     float b;
 *     float a;
 * }</pre></code>
 */
@NativeType("struct ovrColorf")
public class OVRColorf extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        R,
        G,
        B,
        A;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    OVRColorf(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRColorf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRColorf(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code r} field. */
    public float r() { return nr(address()); }
    /** Returns the value of the {@code g} field. */
    public float g() { return ng(address()); }
    /** Returns the value of the {@code b} field. */
    public float b() { return nb(address()); }
    /** Returns the value of the {@code a} field. */
    public float a() { return na(address()); }

    /** Sets the specified value to the {@code r} field. */
    public OVRColorf r(float value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    public OVRColorf g(float value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public OVRColorf b(float value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@code a} field. */
    public OVRColorf a(float value) { na(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRColorf set(
        float r,
        float g,
        float b,
        float a
    ) {
        r(r);
        g(g);
        b(b);
        a(a);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRColorf set(OVRColorf src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link OVRColorf} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRColorf malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link OVRColorf} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRColorf calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link OVRColorf} instance allocated with {@link BufferUtils}. */
    public static OVRColorf create() {
        return new OVRColorf(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRColorf} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static OVRColorf create(long address) {
        return address == NULL ? null : new OVRColorf(address, null);
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link OVRColorf.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRColorf} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRColorf mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRColorf} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRColorf callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRColorf} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRColorf mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRColorf} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRColorf callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static float nr(long struct) { return memGetFloat(struct + OVRColorf.R); }
    /** Unsafe version of {@link #g}. */
    public static float ng(long struct) { return memGetFloat(struct + OVRColorf.G); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return memGetFloat(struct + OVRColorf.B); }
    /** Unsafe version of {@link #a}. */
    public static float na(long struct) { return memGetFloat(struct + OVRColorf.A); }

    /** Unsafe version of {@link #r(float) r}. */
    public static void nr(long struct, float value) { memPutFloat(struct + OVRColorf.R, value); }
    /** Unsafe version of {@link #g(float) g}. */
    public static void ng(long struct, float value) { memPutFloat(struct + OVRColorf.G, value); }
    /** Unsafe version of {@link #b(float) b}. */
    public static void nb(long struct, float value) { memPutFloat(struct + OVRColorf.B, value); }
    /** Unsafe version of {@link #a(float) a}. */
    public static void na(long struct, float value) { memPutFloat(struct + OVRColorf.A, value); }

    // -----------------------------------

    /** An array of {@link OVRColorf} structs. */
    public static class Buffer extends StructBuffer<OVRColorf, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRColorf.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRColorf#SIZEOF}, and its mark will be undefined.
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
        protected OVRColorf newInstance(long address) {
            return new OVRColorf(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code r} field. */
        public float r() { return OVRColorf.nr(address()); }
        /** Returns the value of the {@code g} field. */
        public float g() { return OVRColorf.ng(address()); }
        /** Returns the value of the {@code b} field. */
        public float b() { return OVRColorf.nb(address()); }
        /** Returns the value of the {@code a} field. */
        public float a() { return OVRColorf.na(address()); }

        /** Sets the specified value to the {@code r} field. */
        public OVRColorf.Buffer r(float value) { OVRColorf.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        public OVRColorf.Buffer g(float value) { OVRColorf.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public OVRColorf.Buffer b(float value) { OVRColorf.nb(address(), value); return this; }
        /** Sets the specified value to the {@code a} field. */
        public OVRColorf.Buffer a(float value) { OVRColorf.na(address(), value); return this; }

    }

}