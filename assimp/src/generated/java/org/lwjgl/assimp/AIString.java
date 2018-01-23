/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Represents an UTF-8 string, zero byte terminated.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code length} &ndash; Binary length of the string excluding the terminal 0.</li>
 * <li>{@code data} &ndash; String buffer.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiString {
 *     size_t length;
 *     char data[Assimp.MAXLEN];
 * }</pre></code>
 */
@NativeType("struct aiString")
public class AIString extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LENGTH,
        DATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __array(1, Assimp.MAXLEN)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LENGTH = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    AIString(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIString} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIString(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code length} field. */
    @NativeType("size_t")
    public long length() { return nlength(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code data} field. */
    @NativeType("char[Assimp.MAXLEN]")
    public ByteBuffer data() { return ndata(address()); }
    /** Decodes the null-terminated string stored in the {@code data} field. */
    @NativeType("char[Assimp.MAXLEN]")
    public String dataString() { return ndataString(address()); }

    /** Copies the specified encoded string to the {@code data} field. */
    public AIString data(@NativeType("char[Assimp.MAXLEN]") ByteBuffer value) { ndata(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIString set(AIString src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AIString} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIString malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link AIString} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIString calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link AIString} instance allocated with {@link BufferUtils}. */
    public static AIString create() {
        return new AIString(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIString} instance for the specified memory address. */
    public static AIString create(long address) {
        return new AIString(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIString createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link AIString.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIString.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIString} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIString mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIString} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIString callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIString} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIString mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIString} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIString callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #length}. */
    public static long nlength(long struct) { return memGetAddress(struct + AIString.LENGTH); }
    /** Unsafe version of {@link #data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(struct + AIString.DATA, (int)nlength(struct)); }
    /** Unsafe version of {@link #dataString}. */
    public static String ndataString(long struct) { return memUTF8(ndata(struct)); }

    /** Sets the specified value to the {@code length} field of the specified {@code struct}. */
    public static void nlength(long struct, long value) { memPutAddress(struct + AIString.LENGTH, value); }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, Assimp.MAXLEN);
        }
        memCopy(memAddress(value), struct + AIString.DATA, value.remaining());
        nlength(struct, value.remaining() - 1);
    }

    // -----------------------------------

    /** An array of {@link AIString} structs. */
    public static class Buffer extends StructBuffer<AIString, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIString.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIString#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected AIString newInstance(long address) {
            return new AIString(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code length} field. */
        @NativeType("size_t")
        public long length() { return AIString.nlength(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code data} field. */
        @NativeType("char[Assimp.MAXLEN]")
        public ByteBuffer data() { return AIString.ndata(address()); }
        /** Decodes the null-terminated string stored in the {@code data} field. */
        @NativeType("char[Assimp.MAXLEN]")
        public String dataString() { return AIString.ndataString(address()); }

        /** Copies the specified encoded string to the {@code data} field. */
        public AIString.Buffer data(@NativeType("char[Assimp.MAXLEN]") ByteBuffer value) { AIString.ndata(address(), value); return this; }

    }

}