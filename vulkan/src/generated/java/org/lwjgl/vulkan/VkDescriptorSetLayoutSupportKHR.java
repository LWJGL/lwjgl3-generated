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
 * See {@link VkDescriptorSetLayoutSupport}.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDescriptorSetLayoutSupportKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 supported;
 * }</pre></code>
 */
public class VkDescriptorSetLayoutSupportKHR extends VkDescriptorSetLayoutSupport {

    VkDescriptorSetLayoutSupportKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDescriptorSetLayoutSupportKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutSupportKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDescriptorSetLayoutSupportKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDescriptorSetLayoutSupportKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDescriptorSetLayoutSupportKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetLayoutSupportKHR set(VkDescriptorSetLayoutSupportKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorSetLayoutSupportKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutSupportKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorSetLayoutSupportKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutSupportKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDescriptorSetLayoutSupportKHR} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetLayoutSupportKHR create() {
        return new VkDescriptorSetLayoutSupportKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorSetLayoutSupportKHR} instance for the specified memory address. */
    public static VkDescriptorSetLayoutSupportKHR create(long address) {
        return new VkDescriptorSetLayoutSupportKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutSupportKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutSupportKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorSetLayoutSupportKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDescriptorSetLayoutSupportKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDescriptorSetLayoutSupportKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDescriptorSetLayoutSupportKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutSupportKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutSupportKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetLayoutSupportKHR} structs. */
    public static class Buffer extends VkDescriptorSetLayoutSupport.Buffer {

        /**
         * Creates a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutSupportKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetLayoutSupportKHR newInstance(long address) {
            return new VkDescriptorSetLayoutSupportKHR(address, container);
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDescriptorSetLayoutSupportKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetLayoutSupportKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDescriptorSetLayoutSupportKHR.Buffer pNext(@NativeType("void *") long value) { VkDescriptorSetLayoutSupportKHR.npNext(address(), value); return this; }

    }

}