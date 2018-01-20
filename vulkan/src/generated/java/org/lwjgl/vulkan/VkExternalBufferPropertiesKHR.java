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
 * Structure specifying supported external handle capabilities.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryCapabilities#VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHR STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExternalMemoryPropertiesKHR}, {@link KHRExternalMemoryCapabilities#vkGetPhysicalDeviceExternalBufferPropertiesKHR GetPhysicalDeviceExternalBufferPropertiesKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure</li>
 * <li>{@code pNext} &ndash; NULL or a pointer to an extension-specific structure.</li>
 * <li>{@code externalMemoryProperties} &ndash; an instance of the {@link VkExternalMemoryPropertiesKHR} structure specifying various capabilities of the external handle type when used with the specified buffer creation parameters.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExternalBufferPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkExternalMemoryPropertiesKHR VkExternalMemoryPropertiesKHR} externalMemoryProperties;
 * }</pre></code>
 */
public class VkExternalBufferPropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTERNALMEMORYPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExternalMemoryPropertiesKHR.SIZEOF, VkExternalMemoryPropertiesKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTERNALMEMORYPROPERTIES = layout.offsetof(2);
    }

    VkExternalBufferPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExternalBufferPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalBufferPropertiesKHR(ByteBuffer container) {
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
    /** Returns a {@link VkExternalMemoryPropertiesKHR} view of the {@code externalMemoryProperties} field. */
    public VkExternalMemoryPropertiesKHR externalMemoryProperties() { return nexternalMemoryProperties(address()); }

    // -----------------------------------

    /** Returns a new {@link VkExternalBufferPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalBufferPropertiesKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkExternalBufferPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalBufferPropertiesKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkExternalBufferPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkExternalBufferPropertiesKHR create() {
        return new VkExternalBufferPropertiesKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkExternalBufferPropertiesKHR} instance for the specified memory address. */
    public static VkExternalBufferPropertiesKHR create(long address) {
        return new VkExternalBufferPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalBufferPropertiesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkExternalBufferPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferPropertiesKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalBufferPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferPropertiesKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalBufferPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferPropertiesKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkExternalBufferPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalBufferPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkExternalBufferPropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkExternalBufferPropertiesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkExternalBufferPropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkExternalBufferPropertiesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkExternalBufferPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalBufferPropertiesKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalBufferPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalBufferPropertiesKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalBufferPropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferPropertiesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalBufferPropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferPropertiesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalBufferPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferPropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalBufferPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferPropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExternalBufferPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalBufferPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #externalMemoryProperties}. */
    public static VkExternalMemoryPropertiesKHR nexternalMemoryProperties(long struct) { return VkExternalMemoryPropertiesKHR.create(struct + VkExternalBufferPropertiesKHR.EXTERNALMEMORYPROPERTIES); }

    // -----------------------------------

    /** An array of {@link VkExternalBufferPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkExternalBufferPropertiesKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkExternalBufferPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalBufferPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalBufferPropertiesKHR newInstance(long address) {
            return new VkExternalBufferPropertiesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalBufferPropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkExternalBufferPropertiesKHR.npNext(address()); }
        /** Returns a {@link VkExternalMemoryPropertiesKHR} view of the {@code externalMemoryProperties} field. */
        public VkExternalMemoryPropertiesKHR externalMemoryProperties() { return VkExternalBufferPropertiesKHR.nexternalMemoryProperties(address()); }

    }

}