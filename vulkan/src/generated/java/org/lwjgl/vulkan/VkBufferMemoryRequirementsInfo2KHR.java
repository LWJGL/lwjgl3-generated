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
 * See {@link VkBufferMemoryRequirementsInfo2}.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkBufferMemoryRequirementsInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer buffer;
 * }</pre></code>
 */
public class VkBufferMemoryRequirementsInfo2KHR extends VkBufferMemoryRequirementsInfo2 {

    VkBufferMemoryRequirementsInfo2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkBufferMemoryRequirementsInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferMemoryRequirementsInfo2KHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBufferMemoryRequirementsInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBufferMemoryRequirementsInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    @Override
    public VkBufferMemoryRequirementsInfo2KHR buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBufferMemoryRequirementsInfo2KHR set(
        int sType,
        long pNext,
        long buffer
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferMemoryRequirementsInfo2KHR set(VkBufferMemoryRequirementsInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkBufferMemoryRequirementsInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferMemoryRequirementsInfo2KHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkBufferMemoryRequirementsInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferMemoryRequirementsInfo2KHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkBufferMemoryRequirementsInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkBufferMemoryRequirementsInfo2KHR create() {
        return new VkBufferMemoryRequirementsInfo2KHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkBufferMemoryRequirementsInfo2KHR} instance for the specified memory address. */
    public static VkBufferMemoryRequirementsInfo2KHR create(long address) {
        return new VkBufferMemoryRequirementsInfo2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferMemoryRequirementsInfo2KHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkBufferMemoryRequirementsInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryRequirementsInfo2KHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryRequirementsInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryRequirementsInfo2KHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryRequirementsInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryRequirementsInfo2KHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkBufferMemoryRequirementsInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryRequirementsInfo2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferMemoryRequirementsInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkBufferMemoryRequirementsInfo2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBufferMemoryRequirementsInfo2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkBufferMemoryRequirementsInfo2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBufferMemoryRequirementsInfo2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkBufferMemoryRequirementsInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferMemoryRequirementsInfo2KHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferMemoryRequirementsInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferMemoryRequirementsInfo2KHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferMemoryRequirementsInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryRequirementsInfo2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferMemoryRequirementsInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryRequirementsInfo2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferMemoryRequirementsInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryRequirementsInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryRequirementsInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryRequirementsInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBufferMemoryRequirementsInfo2KHR} structs. */
    public static class Buffer extends VkBufferMemoryRequirementsInfo2.Buffer {

        /**
         * Creates a new {@link VkBufferMemoryRequirementsInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferMemoryRequirementsInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferMemoryRequirementsInfo2KHR newInstance(long address) {
            return new VkBufferMemoryRequirementsInfo2KHR(address, container);
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBufferMemoryRequirementsInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferMemoryRequirementsInfo2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBufferMemoryRequirementsInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkBufferMemoryRequirementsInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        @Override
        public VkBufferMemoryRequirementsInfo2KHR.Buffer buffer(@NativeType("VkBuffer") long value) { VkBufferMemoryRequirementsInfo2KHR.nbuffer(address(), value); return this; }

    }

}