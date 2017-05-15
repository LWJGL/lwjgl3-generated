/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Properties of External Memory Windows Handles.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code memoryTypeBits} &ndash; a bitmask containing one bit set for every memory type which the specified windows handle <b>can</b> be imported as.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkMemoryWin32HandlePropertiesKHX {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t memoryTypeBits;
 * }</pre></code>
 */
public class VkMemoryWin32HandlePropertiesKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYTYPEBITS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYTYPEBITS = layout.offsetof(2);
    }

    VkMemoryWin32HandlePropertiesKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkMemoryWin32HandlePropertiesKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryWin32HandlePropertiesKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code memoryTypeBits} field. */
    public int memoryTypeBits() { return nmemoryTypeBits(address()); }

    // -----------------------------------

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryWin32HandlePropertiesKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryWin32HandlePropertiesKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHX} instance allocated with {@link BufferUtils}. */
    public static VkMemoryWin32HandlePropertiesKHX create() {
        return new VkMemoryWin32HandlePropertiesKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkMemoryWin32HandlePropertiesKHX create(long address) {
        return address == NULL ? null : new VkMemoryWin32HandlePropertiesKHX(address, null);
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkMemoryWin32HandlePropertiesKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMemoryWin32HandlePropertiesKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMemoryWin32HandlePropertiesKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryWin32HandlePropertiesKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryWin32HandlePropertiesKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryWin32HandlePropertiesKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryWin32HandlePropertiesKHX.PNEXT); }
    /** Unsafe version of {@link #memoryTypeBits}. */
    public static int nmemoryTypeBits(long struct) { return memGetInt(struct + VkMemoryWin32HandlePropertiesKHX.MEMORYTYPEBITS); }

    // -----------------------------------

    /** An array of {@link VkMemoryWin32HandlePropertiesKHX} structs. */
    public static class Buffer extends StructBuffer<VkMemoryWin32HandlePropertiesKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkMemoryWin32HandlePropertiesKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryWin32HandlePropertiesKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryWin32HandlePropertiesKHX newInstance(long address) {
            return new VkMemoryWin32HandlePropertiesKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkMemoryWin32HandlePropertiesKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkMemoryWin32HandlePropertiesKHX.npNext(address()); }
        /** Returns the value of the {@code memoryTypeBits} field. */
        public int memoryTypeBits() { return VkMemoryWin32HandlePropertiesKHX.nmemoryTypeBits(address()); }

    }

}