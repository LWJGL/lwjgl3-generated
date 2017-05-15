/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code version} &ndash; this must be 2</li>
 * <li>{@code tiled} &ndash; tile format image</li>
 * <li>{@code long_name} &ndash; long name attribute</li>
 * <li>{@code non_image} &ndash; deep image(EXR 2.0)</li>
 * <li>{@code multipart} &ndash; multi-part(EXR 2.0)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct EXRVersion {
 *     int version;
 *     int tiled;
 *     int long_name;
 *     int non_image;
 *     int multipart;
 * }</pre></code>
 */
public class EXRVersion extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        TILED,
        LONG_NAME,
        NON_IMAGE,
        MULTIPART;

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

        VERSION = layout.offsetof(0);
        TILED = layout.offsetof(1);
        LONG_NAME = layout.offsetof(2);
        NON_IMAGE = layout.offsetof(3);
        MULTIPART = layout.offsetof(4);
    }

    EXRVersion(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link EXRVersion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EXRVersion(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code version} field. */
    public int version() { return nversion(address()); }
    /** Returns the value of the {@code tiled} field. */
    public boolean tiled() { return ntiled(address()) != 0; }
    /** Returns the value of the {@code long_name} field. */
    public boolean long_name() { return nlong_name(address()) != 0; }
    /** Returns the value of the {@code non_image} field. */
    public boolean non_image() { return nnon_image(address()) != 0; }
    /** Returns the value of the {@code multipart} field. */
    public boolean multipart() { return nmultipart(address()) != 0; }

    /** Sets the specified value to the {@code version} field. */
    public EXRVersion version(int value) { nversion(address(), value); return this; }
    /** Sets the specified value to the {@code tiled} field. */
    public EXRVersion tiled(boolean value) { ntiled(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code long_name} field. */
    public EXRVersion long_name(boolean value) { nlong_name(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code non_image} field. */
    public EXRVersion non_image(boolean value) { nnon_image(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multipart} field. */
    public EXRVersion multipart(boolean value) { nmultipart(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public EXRVersion set(
        int version,
        boolean tiled,
        boolean long_name,
        boolean non_image,
        boolean multipart
    ) {
        version(version);
        tiled(tiled);
        long_name(long_name);
        non_image(non_image);
        multipart(multipart);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public EXRVersion set(EXRVersion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link EXRVersion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EXRVersion malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link EXRVersion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EXRVersion calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link EXRVersion} instance allocated with {@link BufferUtils}. */
    public static EXRVersion create() {
        return new EXRVersion(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link EXRVersion} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static EXRVersion create(long address) {
        return address == NULL ? null : new EXRVersion(address, null);
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link EXRVersion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link EXRVersion} instance allocated on the thread-local {@link MemoryStack}. */
    public static EXRVersion mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link EXRVersion} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static EXRVersion callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link EXRVersion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRVersion mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link EXRVersion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRVersion callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return memGetInt(struct + EXRVersion.VERSION); }
    /** Unsafe version of {@link #tiled}. */
    public static int ntiled(long struct) { return memGetInt(struct + EXRVersion.TILED); }
    /** Unsafe version of {@link #long_name}. */
    public static int nlong_name(long struct) { return memGetInt(struct + EXRVersion.LONG_NAME); }
    /** Unsafe version of {@link #non_image}. */
    public static int nnon_image(long struct) { return memGetInt(struct + EXRVersion.NON_IMAGE); }
    /** Unsafe version of {@link #multipart}. */
    public static int nmultipart(long struct) { return memGetInt(struct + EXRVersion.MULTIPART); }

    /** Unsafe version of {@link #version(int) version}. */
    public static void nversion(long struct, int value) { memPutInt(struct + EXRVersion.VERSION, value); }
    /** Unsafe version of {@link #tiled(boolean) tiled}. */
    public static void ntiled(long struct, int value) { memPutInt(struct + EXRVersion.TILED, value); }
    /** Unsafe version of {@link #long_name(boolean) long_name}. */
    public static void nlong_name(long struct, int value) { memPutInt(struct + EXRVersion.LONG_NAME, value); }
    /** Unsafe version of {@link #non_image(boolean) non_image}. */
    public static void nnon_image(long struct, int value) { memPutInt(struct + EXRVersion.NON_IMAGE, value); }
    /** Unsafe version of {@link #multipart(boolean) multipart}. */
    public static void nmultipart(long struct, int value) { memPutInt(struct + EXRVersion.MULTIPART, value); }

    // -----------------------------------

    /** An array of {@link EXRVersion} structs. */
    public static class Buffer extends StructBuffer<EXRVersion, Buffer> implements NativeResource {

        /**
         * Creates a new {@link EXRVersion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EXRVersion#SIZEOF}, and its mark will be undefined.
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
        protected EXRVersion newInstance(long address) {
            return new EXRVersion(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code version} field. */
        public int version() { return EXRVersion.nversion(address()); }
        /** Returns the value of the {@code tiled} field. */
        public boolean tiled() { return EXRVersion.ntiled(address()) != 0; }
        /** Returns the value of the {@code long_name} field. */
        public boolean long_name() { return EXRVersion.nlong_name(address()) != 0; }
        /** Returns the value of the {@code non_image} field. */
        public boolean non_image() { return EXRVersion.nnon_image(address()) != 0; }
        /** Returns the value of the {@code multipart} field. */
        public boolean multipart() { return EXRVersion.nmultipart(address()) != 0; }

        /** Sets the specified value to the {@code version} field. */
        public EXRVersion.Buffer version(int value) { EXRVersion.nversion(address(), value); return this; }
        /** Sets the specified value to the {@code tiled} field. */
        public EXRVersion.Buffer tiled(boolean value) { EXRVersion.ntiled(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code long_name} field. */
        public EXRVersion.Buffer long_name(boolean value) { EXRVersion.nlong_name(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code non_image} field. */
        public EXRVersion.Buffer non_image(boolean value) { EXRVersion.nnon_image(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multipart} field. */
        public EXRVersion.Buffer multipart(boolean value) { EXRVersion.nmultipart(address(), value ? 1 : 0); return this; }

    }

}