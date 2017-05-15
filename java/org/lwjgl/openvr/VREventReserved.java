/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Not actually used for any events.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Reserved_t {
 *     uint64_t reserved0;
 *     uint64_t reserved1;
 * }</pre></code>
 */
public class VREventReserved extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESERVED0,
        RESERVED1;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESERVED0 = layout.offsetof(0);
        RESERVED1 = layout.offsetof(1);
    }

    VREventReserved(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventReserved} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventReserved(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code reserved0} field. */
    public long reserved0() { return nreserved0(address()); }
    /** Returns the value of the {@code reserved1} field. */
    public long reserved1() { return nreserved1(address()); }

    /** Sets the specified value to the {@code reserved0} field. */
    public VREventReserved reserved0(long value) { nreserved0(address(), value); return this; }
    /** Sets the specified value to the {@code reserved1} field. */
    public VREventReserved reserved1(long value) { nreserved1(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VREventReserved set(
        long reserved0,
        long reserved1
    ) {
        reserved0(reserved0);
        reserved1(reserved1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventReserved set(VREventReserved src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventReserved} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventReserved malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventReserved} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventReserved calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventReserved} instance allocated with {@link BufferUtils}. */
    public static VREventReserved create() {
        return new VREventReserved(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventReserved} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventReserved create(long address) {
        return address == NULL ? null : new VREventReserved(address, null);
    }

    /**
     * Returns a new {@link VREventReserved.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventReserved.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventReserved.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VREventReserved.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VREventReserved} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventReserved mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventReserved} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventReserved callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventReserved} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventReserved mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventReserved} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventReserved callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventReserved.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventReserved.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventReserved.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventReserved.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #reserved0}. */
    public static long nreserved0(long struct) { return memGetLong(struct + VREventReserved.RESERVED0); }
    /** Unsafe version of {@link #reserved1}. */
    public static long nreserved1(long struct) { return memGetLong(struct + VREventReserved.RESERVED1); }

    /** Unsafe version of {@link #reserved0(long) reserved0}. */
    public static void nreserved0(long struct, long value) { memPutLong(struct + VREventReserved.RESERVED0, value); }
    /** Unsafe version of {@link #reserved1(long) reserved1}. */
    public static void nreserved1(long struct, long value) { memPutLong(struct + VREventReserved.RESERVED1, value); }

    // -----------------------------------

    /** An array of {@link VREventReserved} structs. */
    public static class Buffer extends StructBuffer<VREventReserved, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VREventReserved.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventReserved#SIZEOF}, and its mark will be undefined.
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
        protected VREventReserved newInstance(long address) {
            return new VREventReserved(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code reserved0} field. */
        public long reserved0() { return VREventReserved.nreserved0(address()); }
        /** Returns the value of the {@code reserved1} field. */
        public long reserved1() { return VREventReserved.nreserved1(address()); }

        /** Sets the specified value to the {@code reserved0} field. */
        public VREventReserved.Buffer reserved0(long value) { VREventReserved.nreserved0(address(), value); return this; }
        /** Sets the specified value to the {@code reserved1} field. */
        public VREventReserved.Buffer reserved1(long value) { VREventReserved.nreserved1(address(), value); return this; }

    }

}