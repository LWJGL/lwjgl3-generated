/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure describing descriptor set properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMaintenance3Properties} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code maxPerSetDescriptors} &ndash; a maximum number of descriptors (summed over all descriptor types) in a single descriptor set that is guaranteed to satisfy any implementation-dependent constraints on the size of a descriptor set itself. Applications <b>can</b> query whether a descriptor set that goes beyond this limit is supported using {@link VK11#vkGetDescriptorSetLayoutSupport GetDescriptorSetLayoutSupport}.</li>
 * <li>{@code maxMemoryAllocationSize} &ndash; the maximum size of a memory allocation that <b>can</b> be created, even if there is more space available in the heap.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceMaintenance3Properties {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxPerSetDescriptors;
 *     VkDeviceSize maxMemoryAllocationSize;
 * }</pre></code>
 */
public class VkPhysicalDeviceMaintenance3Properties extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXPERSETDESCRIPTORS,
        MAXMEMORYALLOCATIONSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXPERSETDESCRIPTORS = layout.offsetof(2);
        MAXMEMORYALLOCATIONSIZE = layout.offsetof(3);
    }

    VkPhysicalDeviceMaintenance3Properties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceMaintenance3Properties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance3Properties(ByteBuffer container) {
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
    /** Returns the value of the {@code maxPerSetDescriptors} field. */
    @NativeType("uint32_t")
    public int maxPerSetDescriptors() { return nmaxPerSetDescriptors(address()); }
    /** Returns the value of the {@code maxMemoryAllocationSize} field. */
    @NativeType("VkDeviceSize")
    public long maxMemoryAllocationSize() { return nmaxMemoryAllocationSize(address()); }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceMaintenance3Properties} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance3Properties create(long address) {
        return new VkPhysicalDeviceMaintenance3Properties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance3Properties createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance3Properties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance3Properties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance3Properties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance3Properties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance3Properties.PNEXT); }
    /** Unsafe version of {@link #maxPerSetDescriptors}. */
    public static int nmaxPerSetDescriptors(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance3Properties.MAXPERSETDESCRIPTORS); }
    /** Unsafe version of {@link #maxMemoryAllocationSize}. */
    public static long nmaxMemoryAllocationSize(long struct) { return memGetLong(struct + VkPhysicalDeviceMaintenance3Properties.MAXMEMORYALLOCATIONSIZE); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance3Properties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance3Properties, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceMaintenance3Properties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance3Properties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMaintenance3Properties newInstance(long address) {
            return new VkPhysicalDeviceMaintenance3Properties(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance3Properties.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance3Properties.npNext(address()); }
        /** Returns the value of the {@code maxPerSetDescriptors} field. */
        @NativeType("uint32_t")
        public int maxPerSetDescriptors() { return VkPhysicalDeviceMaintenance3Properties.nmaxPerSetDescriptors(address()); }
        /** Returns the value of the {@code maxMemoryAllocationSize} field. */
        @NativeType("VkDeviceSize")
        public long maxMemoryAllocationSize() { return VkPhysicalDeviceMaintenance3Properties.nmaxMemoryAllocationSize(address()); }

    }

}