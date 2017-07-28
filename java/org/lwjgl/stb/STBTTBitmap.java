/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Bitmap data.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code w} &ndash; the bitmap width</li>
 * <li>{@code h} &ndash; the bitmap height</li>
 * <li>{@code stride} &ndash; the row stride, in bytes</li>
 * <li>{@code pixels} &ndash; the bitmap data</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct stbtt__bitmap {
 *     int w;
 *     int h;
 *     int stride;
 *     unsigned char * pixels;
 * }</pre></code>
 */
@NativeType("struct stbtt__bitmap")
public class STBTTBitmap extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        W,
        H,
        STRIDE,
        PIXELS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        W = layout.offsetof(0);
        H = layout.offsetof(1);
        STRIDE = layout.offsetof(2);
        PIXELS = layout.offsetof(3);
    }

    STBTTBitmap(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link STBTTBitmap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBTTBitmap(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code w} field. */
    public int w() { return nw(address()); }
    /** Returns the value of the {@code h} field. */
    public int h() { return nh(address()); }
    /** Returns the value of the {@code stride} field. */
    public int stride() { return nstride(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pixels} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned char *")
    public ByteBuffer pixels(int capacity) { return npixels(address(), capacity); }

    /** Sets the specified value to the {@code w} field. */
    public STBTTBitmap w(int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public STBTTBitmap h(int value) { nh(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public STBTTBitmap stride(int value) { nstride(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pixels} field. */
    public STBTTBitmap pixels(@NativeType("unsigned char *") ByteBuffer value) { npixels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public STBTTBitmap set(
        int w,
        int h,
        int stride,
        ByteBuffer pixels
    ) {
        w(w);
        h(h);
        stride(stride);
        pixels(pixels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public STBTTBitmap set(STBTTBitmap src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link STBTTBitmap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBTTBitmap malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link STBTTBitmap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBTTBitmap calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link STBTTBitmap} instance allocated with {@link BufferUtils}. */
    public static STBTTBitmap create() {
        return new STBTTBitmap(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link STBTTBitmap} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static STBTTBitmap create(long address) {
        return address == NULL ? null : new STBTTBitmap(address, null);
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link STBTTBitmap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link STBTTBitmap} instance allocated on the thread-local {@link MemoryStack}. */
    public static STBTTBitmap mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link STBTTBitmap} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static STBTTBitmap callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link STBTTBitmap} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTBitmap mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link STBTTBitmap} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTBitmap callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return memGetInt(struct + STBTTBitmap.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return memGetInt(struct + STBTTBitmap.H); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return memGetInt(struct + STBTTBitmap.STRIDE); }
    /** Unsafe version of {@link #pixels(int) pixels}. */
    public static ByteBuffer npixels(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + STBTTBitmap.PIXELS), capacity); }

    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { memPutInt(struct + STBTTBitmap.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { memPutInt(struct + STBTTBitmap.H, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { memPutInt(struct + STBTTBitmap.STRIDE, value); }
    /** Unsafe version of {@link #pixels(ByteBuffer) pixels}. */
    public static void npixels(long struct, ByteBuffer value) { memPutAddress(struct + STBTTBitmap.PIXELS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + STBTTBitmap.PIXELS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link STBTTBitmap} structs. */
    public static class Buffer extends StructBuffer<STBTTBitmap, Buffer> implements NativeResource {

        /**
         * Creates a new {@link STBTTBitmap.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBTTBitmap#SIZEOF}, and its mark will be undefined.
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
        protected STBTTBitmap newInstance(long address) {
            return new STBTTBitmap(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code w} field. */
        public int w() { return STBTTBitmap.nw(address()); }
        /** Returns the value of the {@code h} field. */
        public int h() { return STBTTBitmap.nh(address()); }
        /** Returns the value of the {@code stride} field. */
        public int stride() { return STBTTBitmap.nstride(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pixels} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned char *")
        public ByteBuffer pixels(int capacity) { return STBTTBitmap.npixels(address(), capacity); }

        /** Sets the specified value to the {@code w} field. */
        public STBTTBitmap.Buffer w(int value) { STBTTBitmap.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public STBTTBitmap.Buffer h(int value) { STBTTBitmap.nh(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public STBTTBitmap.Buffer stride(int value) { STBTTBitmap.nstride(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pixels} field. */
        public STBTTBitmap.Buffer pixels(@NativeType("unsigned char *") ByteBuffer value) { STBTTBitmap.npixels(address(), value); return this; }

    }

}