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
 * (no short description available).
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@link KHXDeviceGroup#VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX} is not set, the number of instances allocated depends on whether {@link KHXDeviceGroupCreation#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX} is set in the memory heap. If {@link KHXDeviceGroupCreation#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX} is set, then memory is allocated for every physical device in the logical device (as if {@code deviceMask} has bits set for all device indices). If {@link KHXDeviceGroupCreation#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX} is not set, then a single instance of memory is allocated (as if {@code deviceMask} is set to one).</p>
 * 
 * <p>On some implementations, allocations from a multi-instance heap <b>may</b> consume memory on all physical devices even if the {@code deviceMask} excludes some devices. If {@link VkPhysicalDeviceGroupPropertiesKHX}{@code ::subsetAllocation} is {@link VK10#VK_TRUE TRUE} then memory is only consumed for the devices in the device mask.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>In practice, most allocations on a multi-instance heap will be allocated across all physical devices. Unicast allocation support is an optional optimization for a minority of allocations.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@link KHXDeviceGroup#VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX} is set, {@code deviceMask} <b>must</b> be a valid device mask.</li>
 * <li>If {@link KHXDeviceGroup#VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX} is set, {@code deviceMask} <b>must</b> not be zero</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHX STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHX}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkMemoryAllocateFlagBitsKHX} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of flags controlling the allocation. The bits specified in {@code flags} are:
 * 
 * <code><pre>
 * typedef enum VkMemoryAllocateFlagBitsKHX {
 *     VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX = 0x00000001,
 * } VkMemoryAllocateFlagBitsKHX;</pre></code>
 * 
 * <ul>
 * <li>if {@code flags} contains {@link KHXDeviceGroup#VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX}, memory will be allocated for the devices in {@code deviceMask}.</li>
 * </ul></li>
 * <li>{@code deviceMask} &ndash; a mask of physical devices in the logical device, indicating that memory <b>must</b> be allocated on each device in the mask, if {@link KHXDeviceGroup#VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX} is set.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkMemoryAllocateFlagsInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkMemoryAllocateFlagsKHX flags;
 *     uint32_t deviceMask;
 * }</pre></code>
 */
public class VkMemoryAllocateFlagsInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DEVICEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DEVICEMASK = layout.offsetof(3);
    }

    VkMemoryAllocateFlagsInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkMemoryAllocateFlagsInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryAllocateFlagsInfoKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code deviceMask} field. */
    public int deviceMask() { return ndeviceMask(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryAllocateFlagsInfoKHX sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryAllocateFlagsInfoKHX pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkMemoryAllocateFlagsInfoKHX flags(int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code deviceMask} field. */
    public VkMemoryAllocateFlagsInfoKHX deviceMask(int value) { ndeviceMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryAllocateFlagsInfoKHX set(
        int sType,
        long pNext,
        int flags,
        int deviceMask
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        deviceMask(deviceMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryAllocateFlagsInfoKHX set(VkMemoryAllocateFlagsInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateFlagsInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateFlagsInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkMemoryAllocateFlagsInfoKHX create() {
        return new VkMemoryAllocateFlagsInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkMemoryAllocateFlagsInfoKHX create(long address) {
        return address == NULL ? null : new VkMemoryAllocateFlagsInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkMemoryAllocateFlagsInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMemoryAllocateFlagsInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkMemoryAllocateFlagsInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMemoryAllocateFlagsInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateFlagsInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateFlagsInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryAllocateFlagsInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryAllocateFlagsInfoKHX.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkMemoryAllocateFlagsInfoKHX.FLAGS); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return memGetInt(struct + VkMemoryAllocateFlagsInfoKHX.DEVICEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryAllocateFlagsInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryAllocateFlagsInfoKHX.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkMemoryAllocateFlagsInfoKHX.FLAGS, value); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { memPutInt(struct + VkMemoryAllocateFlagsInfoKHX.DEVICEMASK, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryAllocateFlagsInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkMemoryAllocateFlagsInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkMemoryAllocateFlagsInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryAllocateFlagsInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryAllocateFlagsInfoKHX newInstance(long address) {
            return new VkMemoryAllocateFlagsInfoKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkMemoryAllocateFlagsInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkMemoryAllocateFlagsInfoKHX.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        public int flags() { return VkMemoryAllocateFlagsInfoKHX.nflags(address()); }
        /** Returns the value of the {@code deviceMask} field. */
        public int deviceMask() { return VkMemoryAllocateFlagsInfoKHX.ndeviceMask(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryAllocateFlagsInfoKHX.Buffer sType(int value) { VkMemoryAllocateFlagsInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryAllocateFlagsInfoKHX.Buffer pNext(long value) { VkMemoryAllocateFlagsInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkMemoryAllocateFlagsInfoKHX.Buffer flags(int value) { VkMemoryAllocateFlagsInfoKHX.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code deviceMask} field. */
        public VkMemoryAllocateFlagsInfoKHX.Buffer deviceMask(int value) { VkMemoryAllocateFlagsInfoKHX.ndeviceMask(address(), value); return this; }

    }

}