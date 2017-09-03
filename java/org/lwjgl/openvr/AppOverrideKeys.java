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
 * struct AppOverrideKeys_t {
 *     char * pchKey;
 *     char * pchValue;
 * }</pre></code>
 */
@NativeType("struct AppOverrideKeys_t")
public class AppOverrideKeys extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PCHKEY,
        PCHVALUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PCHKEY = layout.offsetof(0);
        PCHVALUE = layout.offsetof(1);
    }

    AppOverrideKeys(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AppOverrideKeys} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AppOverrideKeys(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pchKey} field. */
    @NativeType("char *")
    public ByteBuffer pchKey() { return npchKey(address()); }
    /** Decodes the null-terminated string pointed to by the {@code pchKey} field. */
    @NativeType("char *")
    public String pchKeyString() { return npchKeyString(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pchValue} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("char *")
    public ByteBuffer pchValue(int capacity) { return npchValue(address(), capacity); }

    /** Sets the address of the specified encoded string to the {@code pchKey} field. */
    public AppOverrideKeys pchKey(@NativeType("char *") ByteBuffer value) { npchKey(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pchValue} field. */
    public AppOverrideKeys pchValue(@NativeType("char *") ByteBuffer value) { npchValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AppOverrideKeys set(
        ByteBuffer pchKey,
        ByteBuffer pchValue
    ) {
        pchKey(pchKey);
        pchValue(pchValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AppOverrideKeys set(AppOverrideKeys src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AppOverrideKeys} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AppOverrideKeys malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link AppOverrideKeys} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AppOverrideKeys calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link AppOverrideKeys} instance allocated with {@link BufferUtils}. */
    public static AppOverrideKeys create() {
        return new AppOverrideKeys(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AppOverrideKeys} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AppOverrideKeys create(long address) {
        return address == NULL ? null : new AppOverrideKeys(address, null);
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link AppOverrideKeys.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AppOverrideKeys} instance allocated on the thread-local {@link MemoryStack}. */
    public static AppOverrideKeys mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AppOverrideKeys} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AppOverrideKeys callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AppOverrideKeys} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AppOverrideKeys mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AppOverrideKeys} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AppOverrideKeys callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pchKey}. */
    public static ByteBuffer npchKey(long struct) { return memByteBufferNT1(memGetAddress(struct + AppOverrideKeys.PCHKEY)); }
    /** Unsafe version of {@link #pchKeyString}. */
    public static String npchKeyString(long struct) { return memASCII(memGetAddress(struct + AppOverrideKeys.PCHKEY)); }
    /** Unsafe version of {@link #pchValue(int) pchValue}. */
    public static ByteBuffer npchValue(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + AppOverrideKeys.PCHVALUE), capacity); }

    /** Unsafe version of {@link #pchKey(ByteBuffer) pchKey}. */
    public static void npchKey(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + AppOverrideKeys.PCHKEY, memAddress(value));
    }
    /** Unsafe version of {@link #pchValue(ByteBuffer) pchValue}. */
    public static void npchValue(long struct, ByteBuffer value) { memPutAddress(struct + AppOverrideKeys.PCHVALUE, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AppOverrideKeys.PCHKEY));
        check(memGetAddress(struct + AppOverrideKeys.PCHVALUE));
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

    /** An array of {@link AppOverrideKeys} structs. */
    public static class Buffer extends StructBuffer<AppOverrideKeys, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AppOverrideKeys.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AppOverrideKeys#SIZEOF}, and its mark will be undefined.
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
        protected AppOverrideKeys newInstance(long address) {
            return new AppOverrideKeys(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pchKey} field. */
        @NativeType("char *")
        public ByteBuffer pchKey() { return AppOverrideKeys.npchKey(address()); }
        /** Decodes the null-terminated string pointed to by the {@code pchKey} field. */
        @NativeType("char *")
        public String pchKeyString() { return AppOverrideKeys.npchKeyString(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pchValue} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("char *")
        public ByteBuffer pchValue(int capacity) { return AppOverrideKeys.npchValue(address(), capacity); }

        /** Sets the address of the specified encoded string to the {@code pchKey} field. */
        public AppOverrideKeys.Buffer pchKey(@NativeType("char *") ByteBuffer value) { AppOverrideKeys.npchKey(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pchValue} field. */
        public AppOverrideKeys.Buffer pchValue(@NativeType("char *") ByteBuffer value) { AppOverrideKeys.npchValue(address(), value); return this; }

    }

}