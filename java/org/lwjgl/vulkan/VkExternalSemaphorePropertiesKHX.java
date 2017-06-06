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
 * Structure describing supported external semaphore handle features.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code handleType} is not supported by the implementation, then {@link VkExternalSemaphorePropertiesKHX}{@code ::externalSemaphoreFeatures} will be set to zero.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHXExternalSemaphoreCapabilities#vkGetPhysicalDeviceExternalSemaphorePropertiesKHX GetPhysicalDeviceExternalSemaphorePropertiesKHX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code exportFromImportedHandleTypes} &ndash; a bitmask of {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} specifying which types of imported handle {@code handleType} <b>can</b> be exported from.</li>
 * <li>{@code compatibleHandleTypes} &ndash; a bitmask of {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} specifying handle types which <b>can</b> be specified at the same time as {@code handleType} when creating a semaphore.</li>
 * <li>{@code externalSemaphoreFeatures} &ndash; a bitmask of {@code VkExternalSemaphoreFeatureFlagBitsKHX} describing the features of {@code handleType}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExternalSemaphorePropertiesKHX {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkExternalSemaphoreHandleTypeFlagsKHX exportFromImportedHandleTypes;
 *     VkExternalSemaphoreHandleTypeFlagsKHX compatibleHandleTypes;
 *     VkExternalSemaphoreFeatureFlagsKHX externalSemaphoreFeatures;
 * }</pre></code>
 */
public class VkExternalSemaphorePropertiesKHX extends Struct implements NativeResource {

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

    VkExternalSemaphorePropertiesKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExternalSemaphorePropertiesKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalSemaphorePropertiesKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
    public int exportFromImportedHandleTypes() { return nexportFromImportedHandleTypes(address()); }
    /** Returns the value of the {@code compatibleHandleTypes} field. */
    public int compatibleHandleTypes() { return ncompatibleHandleTypes(address()); }
    /** Returns the value of the {@code externalSemaphoreFeatures} field. */
    public int externalSemaphoreFeatures() { return nexternalSemaphoreFeatures(address()); }

    // -----------------------------------

    /** Returns a new {@link VkExternalSemaphorePropertiesKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalSemaphorePropertiesKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkExternalSemaphorePropertiesKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalSemaphorePropertiesKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkExternalSemaphorePropertiesKHX} instance allocated with {@link BufferUtils}. */
    public static VkExternalSemaphorePropertiesKHX create() {
        return new VkExternalSemaphorePropertiesKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkExternalSemaphorePropertiesKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkExternalSemaphorePropertiesKHX create(long address) {
        return address == NULL ? null : new VkExternalSemaphorePropertiesKHX(address, null);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkExternalSemaphorePropertiesKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkExternalSemaphorePropertiesKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkExternalSemaphorePropertiesKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkExternalSemaphorePropertiesKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkExternalSemaphorePropertiesKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalSemaphorePropertiesKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalSemaphorePropertiesKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExternalSemaphorePropertiesKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalSemaphorePropertiesKHX.PNEXT); }
    /** Unsafe version of {@link #exportFromImportedHandleTypes}. */
    public static int nexportFromImportedHandleTypes(long struct) { return memGetInt(struct + VkExternalSemaphorePropertiesKHX.EXPORTFROMIMPORTEDHANDLETYPES); }
    /** Unsafe version of {@link #compatibleHandleTypes}. */
    public static int ncompatibleHandleTypes(long struct) { return memGetInt(struct + VkExternalSemaphorePropertiesKHX.COMPATIBLEHANDLETYPES); }
    /** Unsafe version of {@link #externalSemaphoreFeatures}. */
    public static int nexternalSemaphoreFeatures(long struct) { return memGetInt(struct + VkExternalSemaphorePropertiesKHX.EXTERNALSEMAPHOREFEATURES); }

    // -----------------------------------

    /** An array of {@link VkExternalSemaphorePropertiesKHX} structs. */
    public static class Buffer extends StructBuffer<VkExternalSemaphorePropertiesKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkExternalSemaphorePropertiesKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalSemaphorePropertiesKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalSemaphorePropertiesKHX newInstance(long address) {
            return new VkExternalSemaphorePropertiesKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkExternalSemaphorePropertiesKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkExternalSemaphorePropertiesKHX.npNext(address()); }
        /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
        public int exportFromImportedHandleTypes() { return VkExternalSemaphorePropertiesKHX.nexportFromImportedHandleTypes(address()); }
        /** Returns the value of the {@code compatibleHandleTypes} field. */
        public int compatibleHandleTypes() { return VkExternalSemaphorePropertiesKHX.ncompatibleHandleTypes(address()); }
        /** Returns the value of the {@code externalSemaphoreFeatures} field. */
        public int externalSemaphoreFeatures() { return VkExternalSemaphorePropertiesKHX.nexternalSemaphoreFeatures(address()); }

    }

}