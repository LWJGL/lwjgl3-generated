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
 * See {@link VkDescriptorUpdateTemplateCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDescriptorUpdateTemplateCreateInfoKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDescriptorUpdateTemplateCreateFlags flags;
 *     uint32_t descriptorUpdateEntryCount;
 *     {@link VkDescriptorUpdateTemplateEntry VkDescriptorUpdateTemplateEntry const} * pDescriptorUpdateEntries;
 *     VkDescriptorUpdateTemplateType templateType;
 *     VkDescriptorSetLayout descriptorSetLayout;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     VkPipelineLayout pipelineLayout;
 *     uint32_t set;
 * }</pre></code>
 */
public class VkDescriptorUpdateTemplateCreateInfoKHR extends VkDescriptorUpdateTemplateCreateInfo {

    VkDescriptorUpdateTemplateCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorUpdateTemplateCreateInfoKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDescriptorUpdateTemplateCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDescriptorUpdateTemplateCreateInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkDescriptorUpdateTemplateCreateInfoKHR flags(@NativeType("VkDescriptorUpdateTemplateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorUpdateTemplateEntry.Buffer} to the {@code pDescriptorUpdateEntries} field. */
    @Override
    public VkDescriptorUpdateTemplateCreateInfoKHR pDescriptorUpdateEntries(@NativeType("VkDescriptorUpdateTemplateEntry const *") VkDescriptorUpdateTemplateEntry.Buffer value) { npDescriptorUpdateEntries(address(), value); return this; }
    /** Sets the specified value to the {@code templateType} field. */
    @Override
    public VkDescriptorUpdateTemplateCreateInfoKHR templateType(@NativeType("VkDescriptorUpdateTemplateType") int value) { ntemplateType(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorSetLayout} field. */
    @Override
    public VkDescriptorUpdateTemplateCreateInfoKHR descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) { ndescriptorSetLayout(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    @Override
    public VkDescriptorUpdateTemplateCreateInfoKHR pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineLayout} field. */
    @Override
    public VkDescriptorUpdateTemplateCreateInfoKHR pipelineLayout(@NativeType("VkPipelineLayout") long value) { npipelineLayout(address(), value); return this; }
    /** Sets the specified value to the {@code set} field. */
    @Override
    public VkDescriptorUpdateTemplateCreateInfoKHR set(@NativeType("uint32_t") int value) { nset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDescriptorUpdateTemplateCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        VkDescriptorUpdateTemplateEntry.Buffer pDescriptorUpdateEntries,
        int templateType,
        long descriptorSetLayout,
        int pipelineBindPoint,
        long pipelineLayout,
        int set
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pDescriptorUpdateEntries(pDescriptorUpdateEntries);
        templateType(templateType);
        descriptorSetLayout(descriptorSetLayout);
        pipelineBindPoint(pipelineBindPoint);
        pipelineLayout(pipelineLayout);
        set(set);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorUpdateTemplateCreateInfoKHR set(VkDescriptorUpdateTemplateCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR create() {
        return new VkDescriptorUpdateTemplateCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance for the specified memory address. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR create(long address) {
        return new VkDescriptorUpdateTemplateCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorUpdateTemplateCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorUpdateTemplateCreateInfoKHR} structs. */
    public static class Buffer extends VkDescriptorUpdateTemplateCreateInfo.Buffer {

        /**
         * Creates a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorUpdateTemplateCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorUpdateTemplateCreateInfoKHR newInstance(long address) {
            return new VkDescriptorUpdateTemplateCreateInfoKHR(address, container);
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorUpdateTemplateCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkDescriptorUpdateTemplateCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer flags(@NativeType("VkDescriptorUpdateTemplateCreateFlags") int value) { VkDescriptorUpdateTemplateCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorUpdateTemplateEntry.Buffer} to the {@code pDescriptorUpdateEntries} field. */
        @Override
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pDescriptorUpdateEntries(@NativeType("VkDescriptorUpdateTemplateEntry const *") VkDescriptorUpdateTemplateEntry.Buffer value) { VkDescriptorUpdateTemplateCreateInfoKHR.npDescriptorUpdateEntries(address(), value); return this; }
        /** Sets the specified value to the {@code templateType} field. */
        @Override
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer templateType(@NativeType("VkDescriptorUpdateTemplateType") int value) { VkDescriptorUpdateTemplateCreateInfoKHR.ntemplateType(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorSetLayout} field. */
        @Override
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) { VkDescriptorUpdateTemplateCreateInfoKHR.ndescriptorSetLayout(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        @Override
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkDescriptorUpdateTemplateCreateInfoKHR.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineLayout} field. */
        @Override
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pipelineLayout(@NativeType("VkPipelineLayout") long value) { VkDescriptorUpdateTemplateCreateInfoKHR.npipelineLayout(address(), value); return this; }
        /** Sets the specified value to the {@code set} field. */
        @Override
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer set(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateCreateInfoKHR.nset(address(), value); return this; }

    }

}