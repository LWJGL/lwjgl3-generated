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
 * Structure describing supported external semaphore handle features.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code handleType} is not supported by the implementation, then {@link VkExternalSemaphorePropertiesKHR}{@code ::externalSemaphoreFeatures} will be set to zero.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalSemaphoreCapabilities#VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHR STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalSemaphoreCapabilities#vkGetPhysicalDeviceExternalSemaphorePropertiesKHR GetPhysicalDeviceExternalSemaphorePropertiesKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code exportFromImportedHandleTypes} &ndash; a bitmask of {@code VkExternalSemaphoreHandleTypeFlagBitsKHR} specifying which types of imported handle {@code handleType} <b>can</b> be exported from.</li>
 * <li>{@code compatibleHandleTypes} &ndash; a bitmask of {@code VkExternalSemaphoreHandleTypeFlagBitsKHR} specifying handle types which <b>can</b> be specified at the same time as {@code handleType} when creating a semaphore.</li>
 * <li>{@code externalSemaphoreFeatures} &ndash; a bitmask of {@code VkExternalSemaphoreFeatureFlagBitsKHR} describing the features of {@code handleType}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExternalSemaphorePropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkExternalSemaphoreHandleTypeFlagsKHR exportFromImportedHandleTypes;
 *     VkExternalSemaphoreHandleTypeFlagsKHR compatibleHandleTypes;
 *     VkExternalSemaphoreFeatureFlagsKHR externalSemaphoreFeatures;
 * }</pre></code>
 */
public class VkExternalSemaphorePropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXPORTFROMIMPORTEDHANDLETYPES,
        COMPATIBLEHANDLETYPES,
        EXTERNALSEMAPHOREFEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXPORTFROMIMPORTEDHANDLETYPES = layout.offsetof(2);
        COMPATIBLEHANDLETYPES = layout.offsetof(3);
        EXTERNALSEMAPHOREFEATURES = layout.offsetof(4);
    }

    VkExternalSemaphorePropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExternalSemaphorePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalSemaphorePropertiesKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
    @NativeType("VkExternalSemaphoreHandleTypeFlagsKHR")
    public int exportFromImportedHandleTypes() { return nexportFromImportedHandleTypes(address()); }
    /** Returns the value of the {@code compatibleHandleTypes} field. */
    @NativeType("VkExternalSemaphoreHandleTypeFlagsKHR")
    public int compatibleHandleTypes() { return ncompatibleHandleTypes(address()); }
    /** Returns the value of the {@code externalSemaphoreFeatures} field. */
    @NativeType("VkExternalSemaphoreFeatureFlagsKHR")
    public int externalSemaphoreFeatures() { return nexternalSemaphoreFeatures(address()); }

    // -----------------------------------

    /** Returns a new {@link VkExternalSemaphorePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalSemaphorePropertiesKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkExternalSemaphorePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalSemaphorePropertiesKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkExternalSemaphorePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkExternalSemaphorePropertiesKHR create() {
        return new VkExternalSemaphorePropertiesKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkExternalSemaphorePropertiesKHR} instance for the specified memory address. */
    public static VkExternalSemaphorePropertiesKHR create(long address) {
        return new VkExternalSemaphorePropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalSemaphorePropertiesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkExternalSemaphorePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalSemaphorePropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkExternalSemaphorePropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkExternalSemaphorePropertiesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkExternalSemaphorePropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkExternalSemaphorePropertiesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalSemaphorePropertiesKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalSemaphorePropertiesKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExternalSemaphorePropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalSemaphorePropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #exportFromImportedHandleTypes}. */
    public static int nexportFromImportedHandleTypes(long struct) { return memGetInt(struct + VkExternalSemaphorePropertiesKHR.EXPORTFROMIMPORTEDHANDLETYPES); }
    /** Unsafe version of {@link #compatibleHandleTypes}. */
    public static int ncompatibleHandleTypes(long struct) { return memGetInt(struct + VkExternalSemaphorePropertiesKHR.COMPATIBLEHANDLETYPES); }
    /** Unsafe version of {@link #externalSemaphoreFeatures}. */
    public static int nexternalSemaphoreFeatures(long struct) { return memGetInt(struct + VkExternalSemaphorePropertiesKHR.EXTERNALSEMAPHOREFEATURES); }

    // -----------------------------------

    /** An array of {@link VkExternalSemaphorePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkExternalSemaphorePropertiesKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalSemaphorePropertiesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
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
        protected VkExternalSemaphorePropertiesKHR newInstance(long address) {
            return new VkExternalSemaphorePropertiesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalSemaphorePropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkExternalSemaphorePropertiesKHR.npNext(address()); }
        /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
        @NativeType("VkExternalSemaphoreHandleTypeFlagsKHR")
        public int exportFromImportedHandleTypes() { return VkExternalSemaphorePropertiesKHR.nexportFromImportedHandleTypes(address()); }
        /** Returns the value of the {@code compatibleHandleTypes} field. */
        @NativeType("VkExternalSemaphoreHandleTypeFlagsKHR")
        public int compatibleHandleTypes() { return VkExternalSemaphorePropertiesKHR.ncompatibleHandleTypes(address()); }
        /** Returns the value of the {@code externalSemaphoreFeatures} field. */
        @NativeType("VkExternalSemaphoreFeatureFlagsKHR")
        public int externalSemaphoreFeatures() { return VkExternalSemaphorePropertiesKHR.nexternalSemaphoreFeatures(address()); }

    }

}