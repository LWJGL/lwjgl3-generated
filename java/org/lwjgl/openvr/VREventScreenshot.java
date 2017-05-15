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
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Screenshot_t {
 *     uint32_t handle;
 *     uint32_t type;
 * }</pre></code>
 */
public class VREventScreenshot extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        TYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        TYPE = layout.offsetof(1);
    }

    VREventScreenshot(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventScreenshot} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventScreenshot(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code handle} field. */
    public int handle() { return nhandle(address()); }
    /** Returns the value of the {@code type} field. */
    public int type() { return ntype(address()); }

    /** Sets the specified value to the {@code handle} field. */
    public VREventScreenshot handle(int value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VREventScreenshot type(int value) { ntype(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VREventScreenshot set(
        int handle,
        int type
    ) {
        handle(handle);
        type(type);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventScreenshot set(VREventScreenshot src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventScreenshot} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventScreenshot malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventScreenshot} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventScreenshot calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventScreenshot} instance allocated with {@link BufferUtils}. */
    public static VREventScreenshot create() {
        return new VREventScreenshot(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventScreenshot} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventScreenshot create(long address) {
        return address == NULL ? null : new VREventScreenshot(address, null);
    }

    /**
     * Returns a new {@link VREventScreenshot.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventScreenshot.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventScreenshot.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VREventScreenshot.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VREventScreenshot} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventScreenshot mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventScreenshot} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventScreenshot callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventScreenshot} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventScreenshot mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventScreenshot} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventScreenshot callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventScreenshot.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventScreenshot.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventScreenshot.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventScreenshot.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static int nhandle(long struct) { return memGetInt(struct + VREventScreenshot.HANDLE); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VREventScreenshot.TYPE); }

    /** Unsafe version of {@link #handle(int) handle}. */
    public static void nhandle(long struct, int value) { memPutInt(struct + VREventScreenshot.HANDLE, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VREventScreenshot.TYPE, value); }

    // -----------------------------------

    /** An array of {@link VREventScreenshot} structs. */
    public static class Buffer extends StructBuffer<VREventScreenshot, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VREventScreenshot.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventScreenshot#SIZEOF}, and its mark will be undefined.
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
        protected VREventScreenshot newInstance(long address) {
            return new VREventScreenshot(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code handle} field. */
        public int handle() { return VREventScreenshot.nhandle(address()); }
        /** Returns the value of the {@code type} field. */
        public int type() { return VREventScreenshot.ntype(address()); }

        /** Sets the specified value to the {@code handle} field. */
        public VREventScreenshot.Buffer handle(int value) { VREventScreenshot.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VREventScreenshot.Buffer type(int value) { VREventScreenshot.ntype(address(), value); return this; }

    }

}