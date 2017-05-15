/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct Texture_t {
 *     void * handle;
 *     ETextureType eType;
 *     EColorSpace eColorSpace;
 * }</pre></code>
 */
public class Texture extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        ETYPE,
        ECOLORSPACE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        ETYPE = layout.offsetof(1);
        ECOLORSPACE = layout.offsetof(2);
    }

    Texture(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link Texture} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public Texture(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code handle} field. */
    public long handle() { return nhandle(address()); }
    /** Returns the value of the {@code eType} field. */
    public int eType() { return neType(address()); }
    /** Returns the value of the {@code eColorSpace} field. */
    public int eColorSpace() { return neColorSpace(address()); }

    /** Sets the specified value to the {@code handle} field. */
    public Texture handle(long value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@code eType} field. */
    public Texture eType(int value) { neType(address(), value); return this; }
    /** Sets the specified value to the {@code eColorSpace} field. */
    public Texture eColorSpace(int value) { neColorSpace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public Texture set(
        long handle,
        int eType,
        int eColorSpace
    ) {
        handle(handle);
        eType(eType);
        eColorSpace(eColorSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public Texture set(Texture src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link Texture} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static Texture malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link Texture} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static Texture calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link Texture} instance allocated with {@link BufferUtils}. */
    public static Texture create() {
        return new Texture(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link Texture} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static Texture create(long address) {
        return address == NULL ? null : new Texture(address, null);
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link Texture.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link Texture} instance allocated on the thread-local {@link MemoryStack}. */
    public static Texture mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link Texture} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static Texture callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link Texture} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static Texture mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link Texture} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static Texture callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + Texture.HANDLE); }
    /** Unsafe version of {@link #eType}. */
    public static int neType(long struct) { return memGetInt(struct + Texture.ETYPE); }
    /** Unsafe version of {@link #eColorSpace}. */
    public static int neColorSpace(long struct) { return memGetInt(struct + Texture.ECOLORSPACE); }

    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + Texture.HANDLE, check(value)); }
    /** Unsafe version of {@link #eType(int) eType}. */
    public static void neType(long struct, int value) { memPutInt(struct + Texture.ETYPE, value); }
    /** Unsafe version of {@link #eColorSpace(int) eColorSpace}. */
    public static void neColorSpace(long struct, int value) { memPutInt(struct + Texture.ECOLORSPACE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + Texture.HANDLE));
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

    /** An array of {@link Texture} structs. */
    public static class Buffer extends StructBuffer<Texture, Buffer> implements NativeResource {

        /**
         * Creates a new {@link Texture.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link Texture#SIZEOF}, and its mark will be undefined.
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
        protected Texture newInstance(long address) {
            return new Texture(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code handle} field. */
        public long handle() { return Texture.nhandle(address()); }
        /** Returns the value of the {@code eType} field. */
        public int eType() { return Texture.neType(address()); }
        /** Returns the value of the {@code eColorSpace} field. */
        public int eColorSpace() { return Texture.neColorSpace(address()); }

        /** Sets the specified value to the {@code handle} field. */
        public Texture.Buffer handle(long value) { Texture.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@code eType} field. */
        public Texture.Buffer eType(int value) { Texture.neType(address(), value); return this; }
        /** Sets the specified value to the {@code eColorSpace} field. */
        public Texture.Buffer eColorSpace(int value) { Texture.neColorSpace(address(), value); return this; }

    }

}