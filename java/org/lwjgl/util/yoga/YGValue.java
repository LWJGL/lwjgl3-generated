/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct YGValue {
 *     float value;
 *     YGUnit unit;
 * }</pre></code>
 */
public class YGValue extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VALUE,
        UNIT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VALUE = layout.offsetof(0);
        UNIT = layout.offsetof(1);
    }

    YGValue(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link YGValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGValue(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code value} field. */
    public float value() { return nvalue(address()); }
    /** Returns the value of the {@code unit} field. */
    @NativeType("YGUnit")
    public int unit() { return nunit(address()); }

    /** Sets the specified value to the {@code value} field. */
    public YGValue value(float value) { nvalue(address(), value); return this; }
    /** Sets the specified value to the {@code unit} field. */
    public YGValue unit(@NativeType("YGUnit") int value) { nunit(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public YGValue set(
        float value,
        int unit
    ) {
        value(value);
        unit(unit);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public YGValue set(YGValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link YGValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static YGValue malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link YGValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static YGValue calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link YGValue} instance allocated with {@link BufferUtils}. */
    public static YGValue create() {
        return new YGValue(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link YGValue} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static YGValue create(long address) {
        return address == NULL ? null : new YGValue(address, null);
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link YGValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link YGValue} instance allocated on the thread-local {@link MemoryStack}. */
    public static YGValue mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link YGValue} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static YGValue callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link YGValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static YGValue mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link YGValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static YGValue callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #value}. */
    public static float nvalue(long struct) { return memGetFloat(struct + YGValue.VALUE); }
    /** Unsafe version of {@link #unit}. */
    public static int nunit(long struct) { return memGetInt(struct + YGValue.UNIT); }

    /** Unsafe version of {@link #value(float) value}. */
    public static void nvalue(long struct, float value) { memPutFloat(struct + YGValue.VALUE, value); }
    /** Unsafe version of {@link #unit(int) unit}. */
    public static void nunit(long struct, int value) { memPutInt(struct + YGValue.UNIT, value); }

    // -----------------------------------

    /** An array of {@link YGValue} structs. */
    public static class Buffer extends StructBuffer<YGValue, Buffer> implements NativeResource {

        /**
         * Creates a new {@link YGValue.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGValue#SIZEOF}, and its mark will be undefined.
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
        protected YGValue newInstance(long address) {
            return new YGValue(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code value} field. */
        public float value() { return YGValue.nvalue(address()); }
        /** Returns the value of the {@code unit} field. */
        @NativeType("YGUnit")
        public int unit() { return YGValue.nunit(address()); }

        /** Sets the specified value to the {@code value} field. */
        public YGValue.Buffer value(float value) { YGValue.nvalue(address(), value); return this; }
        /** Sets the specified value to the {@code unit} field. */
        public YGValue.Buffer unit(@NativeType("YGUnit") int value) { YGValue.nunit(address(), value); return this; }

    }

}