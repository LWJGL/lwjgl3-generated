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
 * Create a logical device from multiple physical devices.
 * 
 * <h5>Description</h5>
 * 
 * <p>The elements of the {@code pPhysicalDevices} array are an ordered list of the physical devices that the logical device represents. These <b>must</b> be a subset of a single device group, and need not be in the same order as they were enumerated. The order of the physical devices in the {@code pPhysicalDevices} array determines the <em>device index</em> of each physical device, with element <code>i</code> being assigned a device index of <code>i</code>. Certain commands and structures refer to one or more physical devices by using device indices or <em>device masks</em> formed using device indices.</p>
 * 
 * <p>A logical device created without using {@link VkDeviceGroupDeviceCreateInfoKHX}, or with {@code physicalDeviceCount} equal to zero, is equivalent to a {@code physicalDeviceCount} of one and {@code pPhysicalDevices} pointing to the {@code physicalDevice} parameter to {@link VK10#vkCreateDevice CreateDevice}. In particular, the device index of that physical device is zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each element of {@code pPhysicalDevices} <b>must</b> be unique</li>
 * <li>All elements of {@code pPhysicalDevices} <b>must</b> be in the same device group as enumerated by {@link KHXDeviceGroupCreation#vkEnumeratePhysicalDeviceGroupsKHX EnumeratePhysicalDeviceGroupsKHX}</li>
 * <li>If {@code physicalDeviceCount} is not 0, the {@code physicalDevice} parameter of {@link VK10#vkCreateDevice CreateDevice} <b>must</b> be an element of {@code pPhysicalDevices}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroupCreation#VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHX}</li>
 * <li>If {@code physicalDeviceCount} is not 0, {@code pPhysicalDevices} <b>must</b> be a valid pointer to an array of {@code physicalDeviceCount} valid {@code VkPhysicalDevice} handles</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code physicalDeviceCount} &ndash; the number of elements in the {@code pPhysicalDevices} array.</li>
 * <li>{@code pPhysicalDevices} &ndash; an array of physical device handles belonging to the same device group.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDeviceGroupDeviceCreateInfoKHX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t physicalDeviceCount;
 *     VkPhysicalDevice const * pPhysicalDevices;
 * }</pre></code>
 */
public class VkDeviceGroupDeviceCreateInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PHYSICALDEVICECOUNT,
        PPHYSICALDEVICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PHYSICALDEVICECOUNT = layout.offsetof(2);
        PPHYSICALDEVICES = layout.offsetof(3);
    }

    VkDeviceGroupDeviceCreateInfoKHX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDeviceGroupDeviceCreateInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupDeviceCreateInfoKHX(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code physicalDeviceCount} field. */
    @NativeType("uint32_t")
    public int physicalDeviceCount() { return nphysicalDeviceCount(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code pPhysicalDevices} field. */
    @Nullable
    @NativeType("VkPhysicalDevice const *")
    public PointerBuffer pPhysicalDevices() { return npPhysicalDevices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGroupDeviceCreateInfoKHX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGroupDeviceCreateInfoKHX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code pPhysicalDevices} field. */
    public VkDeviceGroupDeviceCreateInfoKHX pPhysicalDevices(@Nullable @NativeType("VkPhysicalDevice const *") PointerBuffer value) { npPhysicalDevices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupDeviceCreateInfoKHX set(
        int sType,
        long pNext,
        @Nullable PointerBuffer pPhysicalDevices
    ) {
        sType(sType);
        pNext(pNext);
        pPhysicalDevices(pPhysicalDevices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupDeviceCreateInfoKHX set(VkDeviceGroupDeviceCreateInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupDeviceCreateInfoKHX malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupDeviceCreateInfoKHX calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupDeviceCreateInfoKHX create() {
        return new VkDeviceGroupDeviceCreateInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX} instance for the specified memory address. */
    public static VkDeviceGroupDeviceCreateInfoKHX create(long address) {
        return new VkDeviceGroupDeviceCreateInfoKHX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupDeviceCreateInfoKHX createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfoKHX.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfoKHX.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfoKHX.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDeviceGroupDeviceCreateInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfoKHX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupDeviceCreateInfoKHX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceGroupDeviceCreateInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceGroupDeviceCreateInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupDeviceCreateInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupDeviceCreateInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfoKHX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfoKHX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfoKHX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfoKHX.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupDeviceCreateInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupDeviceCreateInfoKHX.PNEXT); }
    /** Unsafe version of {@link #physicalDeviceCount}. */
    public static int nphysicalDeviceCount(long struct) { return memGetInt(struct + VkDeviceGroupDeviceCreateInfoKHX.PHYSICALDEVICECOUNT); }
    /** Unsafe version of {@link #pPhysicalDevices() pPhysicalDevices}. */
    @Nullable public static PointerBuffer npPhysicalDevices(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkDeviceGroupDeviceCreateInfoKHX.PPHYSICALDEVICES), nphysicalDeviceCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGroupDeviceCreateInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupDeviceCreateInfoKHX.PNEXT, value); }
    /** Sets the specified value to the {@code physicalDeviceCount} field of the specified {@code struct}. */
    public static void nphysicalDeviceCount(long struct, int value) { memPutInt(struct + VkDeviceGroupDeviceCreateInfoKHX.PHYSICALDEVICECOUNT, value); }
    /** Unsafe version of {@link #pPhysicalDevices(PointerBuffer) pPhysicalDevices}. */
    public static void npPhysicalDevices(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkDeviceGroupDeviceCreateInfoKHX.PPHYSICALDEVICES, memAddressSafe(value)); nphysicalDeviceCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nphysicalDeviceCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupDeviceCreateInfoKHX.PPHYSICALDEVICES));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupDeviceCreateInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupDeviceCreateInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDeviceGroupDeviceCreateInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupDeviceCreateInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupDeviceCreateInfoKHX newInstance(long address) {
            return new VkDeviceGroupDeviceCreateInfoKHX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupDeviceCreateInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGroupDeviceCreateInfoKHX.npNext(address()); }
        /** Returns the value of the {@code physicalDeviceCount} field. */
        @NativeType("uint32_t")
        public int physicalDeviceCount() { return VkDeviceGroupDeviceCreateInfoKHX.nphysicalDeviceCount(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code pPhysicalDevices} field. */
        @Nullable
        @NativeType("VkPhysicalDevice const *")
        public PointerBuffer pPhysicalDevices() { return VkDeviceGroupDeviceCreateInfoKHX.npPhysicalDevices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGroupDeviceCreateInfoKHX.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupDeviceCreateInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGroupDeviceCreateInfoKHX.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupDeviceCreateInfoKHX.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code pPhysicalDevices} field. */
        public VkDeviceGroupDeviceCreateInfoKHX.Buffer pPhysicalDevices(@Nullable @NativeType("VkPhysicalDevice const *") PointerBuffer value) { VkDeviceGroupDeviceCreateInfoKHX.npPhysicalDevices(address(), value); return this; }

    }

}