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
 * Structure describing supported external fence handle features.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code handleType} is not supported by the implementation, then {@link VkExternalFencePropertiesKHR}{@code ::externalFenceFeatures} will be set to zero.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalFenceCapabilities#VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalFenceCapabilities#vkGetPhysicalDeviceExternalFencePropertiesKHR GetPhysicalDeviceExternalFencePropertiesKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code exportFromImportedHandleTypes} &ndash; a bitmask of {@code VkExternalFenceHandleTypeFlagBitsKHR} indicating which types of imported handle {@code handleType} <b>can</b> be exported from.</li>
 * <li>{@code compatibleHandleTypes} &ndash; a bitmask of {@code VkExternalFenceHandleTypeFlagBitsKHR} specifying handle types which <b>can</b> be specified at the same time as {@code handleType} when creating a fence.</li>
 * <li>{@code externalFenceFeatures} &ndash; a bitmask of {@code VkExternalFenceFeatureFlagBitsKHR} indicating the features of {@code handleType}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExternalFencePropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkExternalFenceHandleTypeFlagsKHR exportFromImportedHandleTypes;
 *     VkExternalFenceHandleTypeFlagsKHR compatibleHandleTypes;
 *     VkExternalFenceFeatureFlagsKHR externalFenceFeatures;
 * }</pre></code>
 */
public class VkExternalFencePropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXPORTFROMIMPORTEDHANDLETYPES,
        COMPATIBLEHANDLETYPES,
        EXTERNALFENCEFEATURES;

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
        EXTERNALFENCEFEATURES = layout.offsetof(4);
    }

    VkExternalFencePropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExternalFencePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalFencePropertiesKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
    @NativeType("VkExternalFenceHandleTypeFlagsKHR")
    public int exportFromImportedHandleTypes() { return nexportFromImportedHandleTypes(address()); }
    /** Returns the value of the {@code compatibleHandleTypes} field. */
    @NativeType("VkExternalFenceHandleTypeFlagsKHR")
    public int compatibleHandleTypes() { return ncompatibleHandleTypes(address()); }
    /** Returns the value of the {@code externalFenceFeatures} field. */
    @NativeType("VkExternalFenceFeatureFlagsKHR")
    public int externalFenceFeatures() { return nexternalFenceFeatures(address()); }

    // -----------------------------------

    /** Returns a new {@link VkExternalFencePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalFencePropertiesKHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkExternalFencePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalFencePropertiesKHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkExternalFencePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkExternalFencePropertiesKHR create() {
        return new VkExternalFencePropertiesKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkExternalFencePropertiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkExternalFencePropertiesKHR create(long address) {
        return address == NULL ? null : new VkExternalFencePropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkExternalFencePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalFencePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalFencePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkExternalFencePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkExternalFencePropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkExternalFencePropertiesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkExternalFencePropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkExternalFencePropertiesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkExternalFencePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalFencePropertiesKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalFencePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalFencePropertiesKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalFencePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalFencePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalFencePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalFencePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExternalFencePropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalFencePropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #exportFromImportedHandleTypes}. */
    public static int nexportFromImportedHandleTypes(long struct) { return memGetInt(struct + VkExternalFencePropertiesKHR.EXPORTFROMIMPORTEDHANDLETYPES); }
    /** Unsafe version of {@link #compatibleHandleTypes}. */
    public static int ncompatibleHandleTypes(long struct) { return memGetInt(struct + VkExternalFencePropertiesKHR.COMPATIBLEHANDLETYPES); }
    /** Unsafe version of {@link #externalFenceFeatures}. */
    public static int nexternalFenceFeatures(long struct) { return memGetInt(struct + VkExternalFencePropertiesKHR.EXTERNALFENCEFEATURES); }

    // -----------------------------------

    /** An array of {@link VkExternalFencePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkExternalFencePropertiesKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkExternalFencePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalFencePropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalFencePropertiesKHR newInstance(long address) {
            return new VkExternalFencePropertiesKHR(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalFencePropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkExternalFencePropertiesKHR.npNext(address()); }
        /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
        @NativeType("VkExternalFenceHandleTypeFlagsKHR")
        public int exportFromImportedHandleTypes() { return VkExternalFencePropertiesKHR.nexportFromImportedHandleTypes(address()); }
        /** Returns the value of the {@code compatibleHandleTypes} field. */
        @NativeType("VkExternalFenceHandleTypeFlagsKHR")
        public int compatibleHandleTypes() { return VkExternalFencePropertiesKHR.ncompatibleHandleTypes(address()); }
        /** Returns the value of the {@code externalFenceFeatures} field. */
        @NativeType("VkExternalFenceFeatureFlagsKHR")
        public int externalFenceFeatures() { return VkExternalFencePropertiesKHR.nexternalFenceFeatures(address()); }

    }

}