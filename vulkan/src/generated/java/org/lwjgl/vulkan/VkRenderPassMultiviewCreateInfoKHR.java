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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkRenderPassMultiviewCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkRenderPassMultiviewCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t subpassCount;
 *     uint32_t const * pViewMasks;
 *     uint32_t dependencyCount;
 *     int32_t const * pViewOffsets;
 *     uint32_t correlationMaskCount;
 *     uint32_t const * pCorrelationMasks;
 * }</pre></code>
 */
public class VkRenderPassMultiviewCreateInfoKHR extends VkRenderPassMultiviewCreateInfo {

    VkRenderPassMultiviewCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkRenderPassMultiviewCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassMultiviewCreateInfoKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewMasks} field. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR pViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npViewMasks(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewOffsets} field. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR pViewOffsets(@Nullable @NativeType("int32_t const *") IntBuffer value) { npViewOffsets(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelationMasks} field. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR pCorrelationMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCorrelationMasks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR set(
        int sType,
        long pNext,
        @Nullable IntBuffer pViewMasks,
        @Nullable IntBuffer pViewOffsets,
        @Nullable IntBuffer pCorrelationMasks
    ) {
        sType(sType);
        pNext(pNext);
        pViewMasks(pViewMasks);
        pViewOffsets(pViewOffsets);
        pCorrelationMasks(pCorrelationMasks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassMultiviewCreateInfoKHR set(VkRenderPassMultiviewCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassMultiviewCreateInfoKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassMultiviewCreateInfoKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassMultiviewCreateInfoKHR create() {
        return new VkRenderPassMultiviewCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHR} instance for the specified memory address. */
    public static VkRenderPassMultiviewCreateInfoKHR create(long address) {
        return new VkRenderPassMultiviewCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassMultiviewCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRenderPassMultiviewCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRenderPassMultiviewCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassMultiviewCreateInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassMultiviewCreateInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassMultiviewCreateInfoKHR} structs. */
    public static class Buffer extends VkRenderPassMultiviewCreateInfo.Buffer {

        /**
         * Creates a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassMultiviewCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassMultiviewCreateInfoKHR newInstance(long address) {
            return new VkRenderPassMultiviewCreateInfoKHR(address, container);
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkRenderPassMultiviewCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassMultiviewCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkRenderPassMultiviewCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassMultiviewCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewMasks} field. */
        @Override
        public VkRenderPassMultiviewCreateInfoKHR.Buffer pViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassMultiviewCreateInfoKHR.npViewMasks(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewOffsets} field. */
        @Override
        public VkRenderPassMultiviewCreateInfoKHR.Buffer pViewOffsets(@Nullable @NativeType("int32_t const *") IntBuffer value) { VkRenderPassMultiviewCreateInfoKHR.npViewOffsets(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelationMasks} field. */
        @Override
        public VkRenderPassMultiviewCreateInfoKHR.Buffer pCorrelationMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassMultiviewCreateInfoKHR.npCorrelationMasks(address(), value); return this; }

    }

}