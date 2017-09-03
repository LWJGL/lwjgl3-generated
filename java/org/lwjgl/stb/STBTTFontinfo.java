/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/** An opaque structure that contains font information. */
@NativeType("struct stbtt_fontinfo")
public class STBTTFontinfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    static {
        LibSTB.initialize();

        try (MemoryStack stack = stackPush()) {
            IntBuffer offsets = stack.mallocInt(1);
            SIZEOF = offsets(memAddress(offsets));
            ALIGNOF = offsets.get(0);
        }
    }

    private static native int offsets(long buffer);

    STBTTFontinfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link STBTTFontinfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBTTFontinfo(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    // -----------------------------------

    /** Returns a new {@link STBTTFontinfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBTTFontinfo malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link STBTTFontinfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBTTFontinfo calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link STBTTFontinfo} instance allocated with {@link BufferUtils}. */
    public static STBTTFontinfo create() {
        return new STBTTFontinfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link STBTTFontinfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static STBTTFontinfo create(long address) {
        return address == NULL ? null : new STBTTFontinfo(address, null);
    }

    /**
     * Returns a new {@link STBTTFontinfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTFontinfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTFontinfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link STBTTFontinfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link STBTTFontinfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static STBTTFontinfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link STBTTFontinfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static STBTTFontinfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link STBTTFontinfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTFontinfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link STBTTFontinfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTFontinfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBTTFontinfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBTTFontinfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBTTFontinfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTFontinfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    // -----------------------------------

    /** An array of {@link STBTTFontinfo} structs. */
    public static class Buffer extends StructBuffer<STBTTFontinfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link STBTTFontinfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBTTFontinfo#SIZEOF}, and its mark will be undefined.
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
        protected STBTTFontinfo newInstance(long address) {
            return new STBTTFontinfo(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

    }

}