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
 * struct VREvent_SeatedZeroPoseReset_t {
 *     bool bResetBySystemMenu;
 * }</pre></code>
 */
@NativeType("struct VREvent_SeatedZeroPoseReset_t")
public class VREventSeatedZeroPoseReset extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BRESETBYSYSTEMMENU;

    static {
        Layout layout = __struct(
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BRESETBYSYSTEMMENU = layout.offsetof(0);
    }

    VREventSeatedZeroPoseReset(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventSeatedZeroPoseReset} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventSeatedZeroPoseReset(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code bResetBySystemMenu} field. */
    @NativeType("bool")
    public boolean bResetBySystemMenu() { return nbResetBySystemMenu(address()); }

    /** Sets the specified value to the {@code bResetBySystemMenu} field. */
    public VREventSeatedZeroPoseReset bResetBySystemMenu(@NativeType("bool") boolean value) { nbResetBySystemMenu(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventSeatedZeroPoseReset set(VREventSeatedZeroPoseReset src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventSeatedZeroPoseReset} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventSeatedZeroPoseReset malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventSeatedZeroPoseReset} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventSeatedZeroPoseReset calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventSeatedZeroPoseReset} instance allocated with {@link BufferUtils}. */
    public static VREventSeatedZeroPoseReset create() {
        return new VREventSeatedZeroPoseReset(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventSeatedZeroPoseReset} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventSeatedZeroPoseReset create(long address) {
        return address == NULL ? null : new VREventSeatedZeroPoseReset(address, null);
    }

    /**
     * Returns a new {@link VREventSeatedZeroPoseReset.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventSeatedZeroPoseReset.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventSeatedZeroPoseReset.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VREventSeatedZeroPoseReset.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VREventSeatedZeroPoseReset} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventSeatedZeroPoseReset mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventSeatedZeroPoseReset} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventSeatedZeroPoseReset callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventSeatedZeroPoseReset} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventSeatedZeroPoseReset mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventSeatedZeroPoseReset} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventSeatedZeroPoseReset callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventSeatedZeroPoseReset.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventSeatedZeroPoseReset.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventSeatedZeroPoseReset.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventSeatedZeroPoseReset.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bResetBySystemMenu}. */
    public static boolean nbResetBySystemMenu(long struct) { return memGetByte(struct + VREventSeatedZeroPoseReset.BRESETBYSYSTEMMENU) != 0; }

    /** Unsafe version of {@link #bResetBySystemMenu(boolean) bResetBySystemMenu}. */
    public static void nbResetBySystemMenu(long struct, boolean value) { memPutByte(struct + VREventSeatedZeroPoseReset.BRESETBYSYSTEMMENU, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link VREventSeatedZeroPoseReset} structs. */
    public static class Buffer extends StructBuffer<VREventSeatedZeroPoseReset, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VREventSeatedZeroPoseReset.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventSeatedZeroPoseReset#SIZEOF}, and its mark will be undefined.
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
        protected VREventSeatedZeroPoseReset newInstance(long address) {
            return new VREventSeatedZeroPoseReset(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code bResetBySystemMenu} field. */
        @NativeType("bool")
        public boolean bResetBySystemMenu() { return VREventSeatedZeroPoseReset.nbResetBySystemMenu(address()); }

        /** Sets the specified value to the {@code bResetBySystemMenu} field. */
        public VREventSeatedZeroPoseReset.Buffer bResetBySystemMenu(@NativeType("bool") boolean value) { VREventSeatedZeroPoseReset.nbResetBySystemMenu(address(), value); return this; }

    }

}