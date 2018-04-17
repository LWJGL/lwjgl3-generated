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
 * See {@link VkDescriptorUpdateTemplateEntry}.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDescriptorUpdateTemplateEntryKHR {
 *     uint32_t dstBinding;
 *     uint32_t dstArrayElement;
 *     uint32_t descriptorCount;
 *     VkDescriptorType descriptorType;
 *     size_t offset;
 *     size_t stride;
 * }</pre></code>
 */
public class VkDescriptorUpdateTemplateEntryKHR extends VkDescriptorUpdateTemplateEntry {

    VkDescriptorUpdateTemplateEntryKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDescriptorUpdateTemplateEntryKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorUpdateTemplateEntryKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    /** Sets the specified value to the {@code dstBinding} field. */
    @Override
    public VkDescriptorUpdateTemplateEntryKHR dstBinding(@NativeType("uint32_t") int value) { ndstBinding(address(), value); return this; }
    /** Sets the specified value to the {@code dstArrayElement} field. */
    @Override
    public VkDescriptorUpdateTemplateEntryKHR dstArrayElement(@NativeType("uint32_t") int value) { ndstArrayElement(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorCount} field. */
    @Override
    public VkDescriptorUpdateTemplateEntryKHR descriptorCount(@NativeType("uint32_t") int value) { ndescriptorCount(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorType} field. */
    @Override
    public VkDescriptorUpdateTemplateEntryKHR descriptorType(@NativeType("VkDescriptorType") int value) { ndescriptorType(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    @Override
    public VkDescriptorUpdateTemplateEntryKHR offset(@NativeType("size_t") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    @Override
    public VkDescriptorUpdateTemplateEntryKHR stride(@NativeType("size_t") long value) { nstride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDescriptorUpdateTemplateEntryKHR set(
        int dstBinding,
        int dstArrayElement,
        int descriptorCount,
        int descriptorType,
        long offset,
        long stride
    ) {
        dstBinding(dstBinding);
        dstArrayElement(dstArrayElement);
        descriptorCount(descriptorCount);
        descriptorType(descriptorType);
        offset(offset);
        stride(stride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorUpdateTemplateEntryKHR set(VkDescriptorUpdateTemplateEntryKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateEntryKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateEntryKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorUpdateTemplateEntryKHR create() {
        return new VkDescriptorUpdateTemplateEntryKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance for the specified memory address. */
    public static VkDescriptorUpdateTemplateEntryKHR create(long address) {
        return new VkDescriptorUpdateTemplateEntryKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorUpdateTemplateEntryKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDescriptorUpdateTemplateEntryKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDescriptorUpdateTemplateEntryKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateEntryKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateEntryKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorUpdateTemplateEntryKHR} structs. */
    public static class Buffer extends VkDescriptorUpdateTemplateEntry.Buffer {

        /**
         * Creates a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorUpdateTemplateEntryKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorUpdateTemplateEntryKHR newInstance(long address) {
            return new VkDescriptorUpdateTemplateEntryKHR(address, container);
        }

        /** Sets the specified value to the {@code dstBinding} field. */
        @Override
        public VkDescriptorUpdateTemplateEntryKHR.Buffer dstBinding(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntryKHR.ndstBinding(address(), value); return this; }
        /** Sets the specified value to the {@code dstArrayElement} field. */
        @Override
        public VkDescriptorUpdateTemplateEntryKHR.Buffer dstArrayElement(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntryKHR.ndstArrayElement(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorCount} field. */
        @Override
        public VkDescriptorUpdateTemplateEntryKHR.Buffer descriptorCount(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntryKHR.ndescriptorCount(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorType} field. */
        @Override
        public VkDescriptorUpdateTemplateEntryKHR.Buffer descriptorType(@NativeType("VkDescriptorType") int value) { VkDescriptorUpdateTemplateEntryKHR.ndescriptorType(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        @Override
        public VkDescriptorUpdateTemplateEntryKHR.Buffer offset(@NativeType("size_t") long value) { VkDescriptorUpdateTemplateEntryKHR.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        @Override
        public VkDescriptorUpdateTemplateEntryKHR.Buffer stride(@NativeType("size_t") long value) { VkDescriptorUpdateTemplateEntryKHR.nstride(address(), value); return this; }

    }

}