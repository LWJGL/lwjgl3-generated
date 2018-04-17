/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkMemoryAllocateFlagsInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkMemoryAllocateFlagsInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkMemoryAllocateFlags flags;
 *     uint32_t deviceMask;
 * }</pre></code>
 */
public class VkMemoryAllocateFlagsInfoKHR extends VkMemoryAllocateFlagsInfo {

    VkMemoryAllocateFlagsInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkMemoryAllocateFlagsInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryAllocateFlagsInfoKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkMemoryAllocateFlagsInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkMemoryAllocateFlagsInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkMemoryAllocateFlagsInfoKHR flags(@NativeType("VkMemoryAllocateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code deviceMask} field. */
    @Override
    public VkMemoryAllocateFlagsInfoKHR deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkMemoryAllocateFlagsInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int deviceMask
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        deviceMask(deviceMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryAllocateFlagsInfoKHR set(VkMemoryAllocateFlagsInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateFlagsInfoKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateFlagsInfoKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryAllocateFlagsInfoKHR create() {
        return new VkMemoryAllocateFlagsInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHR} instance for the specified memory address. */
    public static VkMemoryAllocateFlagsInfoKHR create(long address) {
        return new VkMemoryAllocateFlagsInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryAllocateFlagsInfoKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfoKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfoKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfoKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkMemoryAllocateFlagsInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryAllocateFlagsInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMemoryAllocateFlagsInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMemoryAllocateFlagsInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateFlagsInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateFlagsInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkMemoryAllocateFlagsInfoKHR} structs. */
    public static class Buffer extends VkMemoryAllocateFlagsInfo.Buffer {

        /**
         * Creates a new {@link VkMemoryAllocateFlagsInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryAllocateFlagsInfoKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkMemoryAllocateFlagsInfoKHR newInstance(long address) {
            return new VkMemoryAllocateFlagsInfoKHR(address, container);
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkMemoryAllocateFlagsInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryAllocateFlagsInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkMemoryAllocateFlagsInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryAllocateFlagsInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkMemoryAllocateFlagsInfoKHR.Buffer flags(@NativeType("VkMemoryAllocateFlags") int value) { VkMemoryAllocateFlagsInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code deviceMask} field. */
        @Override
        public VkMemoryAllocateFlagsInfoKHR.Buffer deviceMask(@NativeType("uint32_t") int value) { VkMemoryAllocateFlagsInfoKHR.ndeviceMask(address(), value); return this; }

    }

}