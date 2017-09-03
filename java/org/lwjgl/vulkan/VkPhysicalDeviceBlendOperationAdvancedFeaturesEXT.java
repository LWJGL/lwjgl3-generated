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
 * Structure describing advanced blending features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <ul>
 * <li>{@code advancedBlendCoherentOperations} indicates whether blending using <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#framebuffer-blend-advanced">advanced blend operations</a> is guaranteed to execute atomically and in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#drawing-primitive-order">primitive order</a>. If this is {@link VK10#VK_TRUE TRUE}, {@code VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT} is treated the same as VK_ACCESS_COLOR_ATTACHMENT_READ_BIT and advanced blending needs no additional synchronization over basic blending. If this is {@link VK10#VK_FALSE FALSE}, then memory dependencies are required to guarantee order between two advanced blending operations that occur on the same sample.</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2KHR}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} <b>can</b> also be used in {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 advancedBlendCoherentOperations;
 * }</pre></code>
 */
public class VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADVANCEDBLENDCOHERENTOPERATIONS;

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
        ADVANCEDBLENDCOHERENTOPERATIONS = layout.offsetof(2);
    }

    VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code advancedBlendCoherentOperations} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendCoherentOperations() { return nadvancedBlendCoherentOperations(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code advancedBlendCoherentOperations} field. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT advancedBlendCoherentOperations(@NativeType("VkBool32") boolean value) { nadvancedBlendCoherentOperations(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT set(
        int sType,
        long pNext,
        boolean advancedBlendCoherentOperations
    ) {
        sType(sType);
        pNext(pNext);
        advancedBlendCoherentOperations(advancedBlendCoherentOperations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT set(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT create() {
        return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT create(long address) {
        return address == NULL ? null : new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #advancedBlendCoherentOperations}. */
    public static int nadvancedBlendCoherentOperations(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.ADVANCEDBLENDCOHERENTOPERATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #advancedBlendCoherentOperations(boolean) advancedBlendCoherentOperations}. */
    public static void nadvancedBlendCoherentOperations(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.ADVANCEDBLENDCOHERENTOPERATIONS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT newInstance(long address) {
            return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.npNext(address()); }
        /** Returns the value of the {@code advancedBlendCoherentOperations} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendCoherentOperations() { return VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nadvancedBlendCoherentOperations(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code advancedBlendCoherentOperations} field. */
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer advancedBlendCoherentOperations(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nadvancedBlendCoherentOperations(address(), value ? 1 : 0); return this; }

    }

}