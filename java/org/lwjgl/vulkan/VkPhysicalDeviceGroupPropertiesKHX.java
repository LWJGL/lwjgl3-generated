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

import static org.lwjgl.vulkan.VK10.*;
import static org.lwjgl.vulkan.KHXDeviceGroupCreation.*;

/**
 * Structure specifying physical device group properties.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code physicalDeviceCount} &ndash; the number of physical devices in the group.</li>
 * <li>{@code physicalDevices} &ndash; an array of physical device handles representing all physical devices in the group. The first {@code physicalDeviceCount} elements of the array will be valid.</li>
 * <li>{@code subsetAllocation} &ndash; indicates whether logical devices created from the group support allocating device memory on a subset of devices, via the {@code deviceMask} member of the {@link VkMemoryAllocateFlagsInfoKHX}. If this is {@link VK10#VK_FALSE FALSE}, then all device memory allocations are made across all physical devices in the group. If {@code physicalDeviceCount} is 1, then {@code subsetAllocation} <b>must</b> be {@link VK10#VK_FALSE FALSE}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceGroupPropertiesKHX {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t physicalDeviceCount;
 *     VkPhysicalDevice physicalDevices[VK_MAX_DEVICE_GROUP_SIZE_KHX];
 *     VkBool32 subsetAllocation;
 * }</pre></code>
 */
public class VkPhysicalDeviceGroupPropertiesKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PHYSICALDEVICECOUNT,
        PHYSICALDEVICES,
        SUBSETALLOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(POINTER_SIZE, VK_MAX_DEVICE_GROUP_SIZE_KHX),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PHYSICALDEVICECOUNT = layout.offsetof(2);
        PHYSICALDEVICES = layout.offsetof(3);
        SUBSETALLOCATION = layout.offsetof(4);
    }

    VkPhysicalDeviceGroupPropertiesKHX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceGroupPropertiesKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceGroupPropertiesKHX(ByteBuffer container) {
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
    /** Returns the value of the {@code physicalDeviceCount} field. */
    @NativeType("uint32_t")
    public int physicalDeviceCount() { return nphysicalDeviceCount(address()); }
    /** Returns a {@link PointerBuffer} view of the {@code physicalDevices} field. */
    @NativeType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE_KHX]")
    public PointerBuffer physicalDevices() { return nphysicalDevices(address()); }
    /** Returns the value at the specified index of the {@code physicalDevices} field. */
    @NativeType("VkPhysicalDevice")
    public long physicalDevices(int index) { return nphysicalDevices(address(), index); }
    /** Returns the value of the {@code subsetAllocation} field. */
    @NativeType("VkBool32")
    public boolean subsetAllocation() { return nsubsetAllocation(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGroupPropertiesKHX malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGroupPropertiesKHX calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceGroupPropertiesKHX create() {
        return new VkPhysicalDeviceGroupPropertiesKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX} instance for the specified memory address. */
    public static VkPhysicalDeviceGroupPropertiesKHX create(long address) {
        return new VkPhysicalDeviceGroupPropertiesKHX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceGroupPropertiesKHX createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupPropertiesKHX.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupPropertiesKHX.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupPropertiesKHX.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceGroupPropertiesKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupPropertiesKHX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceGroupPropertiesKHX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceGroupPropertiesKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceGroupPropertiesKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGroupPropertiesKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGroupPropertiesKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupPropertiesKHX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupPropertiesKHX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupPropertiesKHX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupPropertiesKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupPropertiesKHX.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceGroupPropertiesKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceGroupPropertiesKHX.PNEXT); }
    /** Unsafe version of {@link #physicalDeviceCount}. */
    public static int nphysicalDeviceCount(long struct) { return memGetInt(struct + VkPhysicalDeviceGroupPropertiesKHX.PHYSICALDEVICECOUNT); }
    /** Unsafe version of {@link #physicalDevices}. */
    public static PointerBuffer nphysicalDevices(long struct) { return memPointerBuffer(struct + VkPhysicalDeviceGroupPropertiesKHX.PHYSICALDEVICES, VK_MAX_DEVICE_GROUP_SIZE_KHX); }
    /** Unsafe version of {@link #physicalDevices(int) physicalDevices}. */
    public static long nphysicalDevices(long struct, int index) {
        if (CHECKS) { check(index, VK_MAX_DEVICE_GROUP_SIZE_KHX); }
        return memGetAddress(struct + VkPhysicalDeviceGroupPropertiesKHX.PHYSICALDEVICES + index * POINTER_SIZE);
    }
    /** Unsafe version of {@link #subsetAllocation}. */
    public static int nsubsetAllocation(long struct) { return memGetInt(struct + VkPhysicalDeviceGroupPropertiesKHX.SUBSETALLOCATION); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceGroupPropertiesKHX} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGroupPropertiesKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceGroupPropertiesKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceGroupPropertiesKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceGroupPropertiesKHX newInstance(long address) {
            return new VkPhysicalDeviceGroupPropertiesKHX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceGroupPropertiesKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceGroupPropertiesKHX.npNext(address()); }
        /** Returns the value of the {@code physicalDeviceCount} field. */
        @NativeType("uint32_t")
        public int physicalDeviceCount() { return VkPhysicalDeviceGroupPropertiesKHX.nphysicalDeviceCount(address()); }
        /** Returns a {@link PointerBuffer} view of the {@code physicalDevices} field. */
        @NativeType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE_KHX]")
        public PointerBuffer physicalDevices() { return VkPhysicalDeviceGroupPropertiesKHX.nphysicalDevices(address()); }
        /** Returns the value at the specified index of the {@code physicalDevices} field. */
        @NativeType("VkPhysicalDevice")
        public long physicalDevices(int index) { return VkPhysicalDeviceGroupPropertiesKHX.nphysicalDevices(address(), index); }
        /** Returns the value of the {@code subsetAllocation} field. */
        @NativeType("VkBool32")
        public boolean subsetAllocation() { return VkPhysicalDeviceGroupPropertiesKHX.nsubsetAllocation(address()) != 0; }

    }

}