/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_config_stack_float_element {
 *     float * pValues;
 *     float old_value;
 * }</pre></code>
 */
@NativeType("struct nk_config_stack_float_element")
class NkConfigStackFloatElement extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PVALUES,
        OLD_VALUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PVALUES = layout.offsetof(0);
        OLD_VALUE = layout.offsetof(1);
    }

    NkConfigStackFloatElement(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkConfigStackFloatElement} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    NkConfigStackFloatElement(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * Returns a {@link FloatBuffer} view of the data pointed to by the {@code pValues} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("float *")
    public FloatBuffer pValues(int capacity) { return npValues(address(), capacity); }
    /** Returns the value of the {@code old_value} field. */
    public float old_value() { return nold_value(address()); }

    // -----------------------------------

    /** Returns a new {@link NkConfigStackFloatElement} instance for the specified memory address. */
    public static NkConfigStackFloatElement create(long address) {
        return new NkConfigStackFloatElement(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigStackFloatElement createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link NkConfigStackFloatElement.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkConfigStackFloatElement.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigStackFloatElement.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pValues(int) pValues}. */
    public static FloatBuffer npValues(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + NkConfigStackFloatElement.PVALUES), capacity); }
    /** Unsafe version of {@link #old_value}. */
    public static float nold_value(long struct) { return memGetFloat(struct + NkConfigStackFloatElement.OLD_VALUE); }

    // -----------------------------------

    /** An array of {@link NkConfigStackFloatElement} structs. */
    public static class Buffer extends StructBuffer<NkConfigStackFloatElement, Buffer> {

        /**
         * Creates a new {@link NkConfigStackFloatElement.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkConfigStackFloatElement#SIZEOF}, and its mark will be undefined.
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
        protected NkConfigStackFloatElement newInstance(long address) {
            return new NkConfigStackFloatElement(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /**
         * Returns a {@link FloatBuffer} view of the data pointed to by the {@code pValues} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("float *")
        public FloatBuffer pValues(int capacity) { return NkConfigStackFloatElement.npValues(address(), capacity); }
        /** Returns the value of the {@code old_value} field. */
        public float old_value() { return NkConfigStackFloatElement.nold_value(address()); }

    }

}