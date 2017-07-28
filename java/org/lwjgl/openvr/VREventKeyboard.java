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
 * Used for keyboard events.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code cNewInput} &ndash; up to 8 bytes of new input</li>
 * <li>{@code uUserValue} &ndash; possible flags about the new input</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Keyboard_t {
 *     char cNewInput[8];
 *     uint64_t uUserValue;
 * }</pre></code>
 */
@NativeType("struct VREvent_Keyboard_t")
public class VREventKeyboard extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CNEWINPUT,
        UUSERVALUE;

    static {
        Layout layout = __struct(
            __array(1, 8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CNEWINPUT = layout.offsetof(0);
        UUSERVALUE = layout.offsetof(1);
    }

    VREventKeyboard(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventKeyboard} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventKeyboard(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code cNewInput} field. */
    @NativeType("char[8]")
    public ByteBuffer cNewInput() { return ncNewInput(address()); }
    /** Returns the value at the specified index of the {@code cNewInput} field. */
    @NativeType("char")
    public byte cNewInput(int index) { return ncNewInput(address(), index); }
    /** Returns the value of the {@code uUserValue} field. */
    @NativeType("uint64_t")
    public long uUserValue() { return nuUserValue(address()); }

    /** Copies the specified {@link ByteBuffer} to the {@code cNewInput} field. */
    public VREventKeyboard cNewInput(@NativeType("char[8]") ByteBuffer value) { ncNewInput(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cNewInput} field. */
    public VREventKeyboard cNewInput(int index, @NativeType("char") byte value) { ncNewInput(address(), index, value); return this; }
    /** Sets the specified value to the {@code uUserValue} field. */
    public VREventKeyboard uUserValue(@NativeType("uint64_t") long value) { nuUserValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VREventKeyboard set(
        ByteBuffer cNewInput,
        long uUserValue
    ) {
        cNewInput(cNewInput);
        uUserValue(uUserValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventKeyboard set(VREventKeyboard src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventKeyboard} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventKeyboard malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventKeyboard} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventKeyboard calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventKeyboard} instance allocated with {@link BufferUtils}. */
    public static VREventKeyboard create() {
        return new VREventKeyboard(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventKeyboard} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventKeyboard create(long address) {
        return address == NULL ? null : new VREventKeyboard(address, null);
    }

    /**
     * Returns a new {@link VREventKeyboard.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventKeyboard.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventKeyboard.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VREventKeyboard.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VREventKeyboard} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventKeyboard mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventKeyboard} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventKeyboard callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventKeyboard} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventKeyboard mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventKeyboard} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventKeyboard callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventKeyboard.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventKeyboard.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventKeyboard.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventKeyboard.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cNewInput}. */
    public static ByteBuffer ncNewInput(long struct) { return memByteBuffer(struct + VREventKeyboard.CNEWINPUT, 8); }
    /** Unsafe version of {@link #cNewInput(int) cNewInput}. */
    public static byte ncNewInput(long struct, int index) {
        if (CHECKS) { check(index, 8); }
        return memGetByte(struct + VREventKeyboard.CNEWINPUT + index * 1);
    }
    /** Unsafe version of {@link #uUserValue}. */
    public static long nuUserValue(long struct) { return memGetLong(struct + VREventKeyboard.UUSERVALUE); }

    /** Unsafe version of {@link #cNewInput(ByteBuffer) cNewInput}. */
    public static void ncNewInput(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 8); }
        memCopy(memAddress(value), struct + VREventKeyboard.CNEWINPUT, value.remaining() * 1);
    }
    /** Unsafe version of {@link #cNewInput(int, byte) cNewInput}. */
    public static void ncNewInput(long struct, int index, byte value) {
        if (CHECKS) { check(index, 8); }
        memPutByte(struct + VREventKeyboard.CNEWINPUT + index * 1, value);
    }
    /** Unsafe version of {@link #uUserValue(long) uUserValue}. */
    public static void nuUserValue(long struct, long value) { memPutLong(struct + VREventKeyboard.UUSERVALUE, value); }

    // -----------------------------------

    /** An array of {@link VREventKeyboard} structs. */
    public static class Buffer extends StructBuffer<VREventKeyboard, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VREventKeyboard.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventKeyboard#SIZEOF}, and its mark will be undefined.
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
        protected VREventKeyboard newInstance(long address) {
            return new VREventKeyboard(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the {@code cNewInput} field. */
        @NativeType("char[8]")
        public ByteBuffer cNewInput() { return VREventKeyboard.ncNewInput(address()); }
        /** Returns the value at the specified index of the {@code cNewInput} field. */
        @NativeType("char")
        public byte cNewInput(int index) { return VREventKeyboard.ncNewInput(address(), index); }
        /** Returns the value of the {@code uUserValue} field. */
        @NativeType("uint64_t")
        public long uUserValue() { return VREventKeyboard.nuUserValue(address()); }

        /** Copies the specified {@link ByteBuffer} to the {@code cNewInput} field. */
        public VREventKeyboard.Buffer cNewInput(@NativeType("char[8]") ByteBuffer value) { VREventKeyboard.ncNewInput(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cNewInput} field. */
        public VREventKeyboard.Buffer cNewInput(int index, @NativeType("char") byte value) { VREventKeyboard.ncNewInput(address(), index, value); return this; }
        /** Sets the specified value to the {@code uUserValue} field. */
        public VREventKeyboard.Buffer uUserValue(@NativeType("uint64_t") long value) { VREventKeyboard.nuUserValue(address(), value); return this; }

    }

}