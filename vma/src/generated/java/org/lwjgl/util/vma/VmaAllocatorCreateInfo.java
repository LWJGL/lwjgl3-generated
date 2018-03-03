/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Description of an Allocator to be created.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code flags} &ndash; flags for created allocator. Use {@code VmaAllocatorCreateFlagBits} enum. One of:<br><table><tr><td>{@link Vma#VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT}</td></tr></table></li>
 * <li>{@code physicalDevice} &ndash; Vulkan physical device. It must be valid throughout whole lifetime of created allocator.</li>
 * <li>{@code device} &ndash; Vulkan device. It must be valid throughout whole lifetime of created allocator.</li>
 * <li>{@code preferredLargeHeapBlockSize} &ndash; 
 * preferred size of a single {@code VkDeviceMemory} block to be allocated from large heaps &gt; 1 GiB. Set to 0 to use default, which is currently 256
 * MiB.</li>
 * <li>{@code pAllocationCallbacks} &ndash; custom CPU memory allocation callbacks. Optional, can be null. When specified, will also be used for all CPU-side memory allocations.</li>
 * <li>{@code pDeviceMemoryCallbacks} &ndash; informative callbacks for {@code vkAllocateMemory}, {@code vkFreeMemory}. Optional, can be null.</li>
 * <li>{@code frameInUseCount} &ndash; 
 * Maximum number of additional frames that are in use at the same time as current frame.
 * 
 * <p>This value is used only when you make allocations with {@link Vma#VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT} flag. Such allocation cannot become lost if
 * {@code allocation.lastUseFrameIndex >= allocator.currentFrameIndex - frameInUseCount}.</p>
 * 
 * <p>For example, if you double-buffer your command buffers, so resources used for rendering in previous frame may still be in use by the GPU at the moment
 * you allocate resources needed for the current frame, set this value to 1.</p>
 * 
 * <p>If you want to allow any allocations other than used in the current frame to become lost, set this value to 0.</p></li>
 * <li>{@code pHeapSizeLimit} &ndash; 
 * Either {@code NULL} or a pointer to an array of limits on maximum number of bytes that can be allocated out of particular Vulkan memory heap.
 * 
 * <p>If not {@code NULL}, it must be a pointer to an array of {@code VkPhysicalDeviceMemoryProperties::memoryHeapCount} elements, defining limit on maximum number
 * of bytes that can be allocated out of particular Vulkan memory heap.</p>
 * 
 * <p>Any of the elements may be equal to {@code VK_WHOLE_SIZE}, which means no limit on that heap. This is also the default in case of
 * {@code pHeapSizeLimit = NULL}.</p>
 * 
 * <p>If there is a limit defined for a heap:</p>
 * 
 * <ul>
 * <li>If user tries to allocate more memory from that heap using this allocator, the allocation fails with {@code VK_ERROR_OUT_OF_DEVICE_MEMORY}.</li>
 * <li>If the limit is smaller than heap size reported in {@code VkMemoryHeap::size}, the value of this limit will be reported instead when using
 * {@link Vma#vmaGetMemoryProperties GetMemoryProperties}.</li>
 * </ul>
 * 
 * <p>Warning! Using this feature may not be equivalent to installing a GPU with smaller amount of memory, because graphics driver doesn't necessary fail new
 * allocations with {@code VK_ERROR_OUT_OF_DEVICE_MEMORY} result when memory capacity is exceeded. It may return success and just silently migrate some
 * device memory blocks to system RAM.</p></li>
 * <li>{@code pVulkanFunctions} &ndash; pointers to Vulkan functions</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VmaAllocatorCreateInfo {
 *     VmaAllocatorCreateFlags flags;
 *     VkPhysicalDevice physicalDevice;
 *     VkDevice device;
 *     VkDeviceSize preferredLargeHeapBlockSize;
 *     {@link VkAllocationCallbacks VkAllocationCallbacks const} * pAllocationCallbacks;
 *     {@link VmaDeviceMemoryCallbacks VmaDeviceMemoryCallbacks const} * pDeviceMemoryCallbacks;
 *     uint32_t frameInUseCount;
 *     VkDeviceSize const * pHeapSizeLimit;
 *     {@link VmaVulkanFunctions VmaVulkanFunctions const} * pVulkanFunctions;
 * }</pre></code>
 */
public class VmaAllocatorCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        PHYSICALDEVICE,
        DEVICE,
        PREFERREDLARGEHEAPBLOCKSIZE,
        PALLOCATIONCALLBACKS,
        PDEVICEMEMORYCALLBACKS,
        FRAMEINUSECOUNT,
        PHEAPSIZELIMIT,
        PVULKANFUNCTIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        PHYSICALDEVICE = layout.offsetof(1);
        DEVICE = layout.offsetof(2);
        PREFERREDLARGEHEAPBLOCKSIZE = layout.offsetof(3);
        PALLOCATIONCALLBACKS = layout.offsetof(4);
        PDEVICEMEMORYCALLBACKS = layout.offsetof(5);
        FRAMEINUSECOUNT = layout.offsetof(6);
        PHEAPSIZELIMIT = layout.offsetof(7);
        PVULKANFUNCTIONS = layout.offsetof(8);
    }

    VmaAllocatorCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VmaAllocatorCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaAllocatorCreateInfo(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code flags} field. */
    @NativeType("VmaAllocatorCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code physicalDevice} field. */
    @NativeType("VkPhysicalDevice")
    public long physicalDevice() { return nphysicalDevice(address()); }
    /** Returns the value of the {@code device} field. */
    @NativeType("VkDevice")
    public long device() { return ndevice(address()); }
    /** Returns the value of the {@code preferredLargeHeapBlockSize} field. */
    @NativeType("VkDeviceSize")
    public long preferredLargeHeapBlockSize() { return npreferredLargeHeapBlockSize(address()); }
    /** Returns a {@link VkAllocationCallbacks} view of the struct pointed to by the {@code pAllocationCallbacks} field. */
    @Nullable
    @NativeType("VkAllocationCallbacks const *")
    public VkAllocationCallbacks pAllocationCallbacks() { return npAllocationCallbacks(address()); }
    /** Returns a {@link VmaDeviceMemoryCallbacks} view of the struct pointed to by the {@code pDeviceMemoryCallbacks} field. */
    @Nullable
    @NativeType("VmaDeviceMemoryCallbacks const *")
    public VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks() { return npDeviceMemoryCallbacks(address()); }
    /** Returns the value of the {@code frameInUseCount} field. */
    @NativeType("uint32_t")
    public int frameInUseCount() { return nframeInUseCount(address()); }
    /**
     * Returns a {@link LongBuffer} view of the data pointed to by the {@code pHeapSizeLimit} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("VkDeviceSize const *")
    public LongBuffer pHeapSizeLimit(int capacity) { return npHeapSizeLimit(address(), capacity); }
    /** Returns a {@link VmaVulkanFunctions} view of the struct pointed to by the {@code pVulkanFunctions} field. */
    @NativeType("VmaVulkanFunctions const *")
    public VmaVulkanFunctions pVulkanFunctions() { return npVulkanFunctions(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public VmaAllocatorCreateInfo flags(@NativeType("VmaAllocatorCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code physicalDevice} field. */
    public VmaAllocatorCreateInfo physicalDevice(VkPhysicalDevice value) { nphysicalDevice(address(), value); return this; }
    /** Sets the specified value to the {@code device} field. */
    public VmaAllocatorCreateInfo device(VkDevice value) { ndevice(address(), value); return this; }
    /** Sets the specified value to the {@code preferredLargeHeapBlockSize} field. */
    public VmaAllocatorCreateInfo preferredLargeHeapBlockSize(@NativeType("VkDeviceSize") long value) { npreferredLargeHeapBlockSize(address(), value); return this; }
    /** Sets the address of the specified {@link VkAllocationCallbacks} to the {@code pAllocationCallbacks} field. */
    public VmaAllocatorCreateInfo pAllocationCallbacks(@Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) { npAllocationCallbacks(address(), value); return this; }
    /** Sets the address of the specified {@link VmaDeviceMemoryCallbacks} to the {@code pDeviceMemoryCallbacks} field. */
    public VmaAllocatorCreateInfo pDeviceMemoryCallbacks(@Nullable @NativeType("VmaDeviceMemoryCallbacks const *") VmaDeviceMemoryCallbacks value) { npDeviceMemoryCallbacks(address(), value); return this; }
    /** Sets the specified value to the {@code frameInUseCount} field. */
    public VmaAllocatorCreateInfo frameInUseCount(@NativeType("uint32_t") int value) { nframeInUseCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pHeapSizeLimit} field. */
    public VmaAllocatorCreateInfo pHeapSizeLimit(@Nullable @NativeType("VkDeviceSize const *") LongBuffer value) { npHeapSizeLimit(address(), value); return this; }
    /** Sets the address of the specified {@link VmaVulkanFunctions} to the {@code pVulkanFunctions} field. */
    public VmaAllocatorCreateInfo pVulkanFunctions(@NativeType("VmaVulkanFunctions const *") VmaVulkanFunctions value) { npVulkanFunctions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaAllocatorCreateInfo set(
        int flags,
        VkPhysicalDevice physicalDevice,
        VkDevice device,
        long preferredLargeHeapBlockSize,
        VkAllocationCallbacks pAllocationCallbacks,
        VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks,
        int frameInUseCount,
        LongBuffer pHeapSizeLimit,
        VmaVulkanFunctions pVulkanFunctions
    ) {
        flags(flags);
        physicalDevice(physicalDevice);
        device(device);
        preferredLargeHeapBlockSize(preferredLargeHeapBlockSize);
        pAllocationCallbacks(pAllocationCallbacks);
        pDeviceMemoryCallbacks(pDeviceMemoryCallbacks);
        frameInUseCount(frameInUseCount);
        pHeapSizeLimit(pHeapSizeLimit);
        pVulkanFunctions(pVulkanFunctions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaAllocatorCreateInfo set(VmaAllocatorCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VmaAllocatorCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaAllocatorCreateInfo malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VmaAllocatorCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaAllocatorCreateInfo calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VmaAllocatorCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VmaAllocatorCreateInfo create() {
        return new VmaAllocatorCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VmaAllocatorCreateInfo} instance for the specified memory address. */
    public static VmaAllocatorCreateInfo create(long address) {
        return new VmaAllocatorCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaAllocatorCreateInfo createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VmaAllocatorCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorCreateInfo.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocatorCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorCreateInfo.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocatorCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorCreateInfo.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VmaAllocatorCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaAllocatorCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VmaAllocatorCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VmaAllocatorCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VmaAllocatorCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VmaAllocatorCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VmaAllocatorCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocatorCreateInfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VmaAllocatorCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocatorCreateInfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaAllocatorCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaAllocatorCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaAllocatorCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocatorCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VmaAllocatorCreateInfo.FLAGS); }
    /** Unsafe version of {@link #physicalDevice}. */
    public static long nphysicalDevice(long struct) { return memGetAddress(struct + VmaAllocatorCreateInfo.PHYSICALDEVICE); }
    /** Unsafe version of {@link #device}. */
    public static long ndevice(long struct) { return memGetAddress(struct + VmaAllocatorCreateInfo.DEVICE); }
    /** Unsafe version of {@link #preferredLargeHeapBlockSize}. */
    public static long npreferredLargeHeapBlockSize(long struct) { return memGetLong(struct + VmaAllocatorCreateInfo.PREFERREDLARGEHEAPBLOCKSIZE); }
    /** Unsafe version of {@link #pAllocationCallbacks}. */
    @Nullable public static VkAllocationCallbacks npAllocationCallbacks(long struct) { return VkAllocationCallbacks.createSafe(memGetAddress(struct + VmaAllocatorCreateInfo.PALLOCATIONCALLBACKS)); }
    /** Unsafe version of {@link #pDeviceMemoryCallbacks}. */
    @Nullable public static VmaDeviceMemoryCallbacks npDeviceMemoryCallbacks(long struct) { return VmaDeviceMemoryCallbacks.createSafe(memGetAddress(struct + VmaAllocatorCreateInfo.PDEVICEMEMORYCALLBACKS)); }
    /** Unsafe version of {@link #frameInUseCount}. */
    public static int nframeInUseCount(long struct) { return memGetInt(struct + VmaAllocatorCreateInfo.FRAMEINUSECOUNT); }
    /** Unsafe version of {@link #pHeapSizeLimit(int) pHeapSizeLimit}. */
    @Nullable public static LongBuffer npHeapSizeLimit(long struct, int capacity) { return memLongBufferSafe(memGetAddress(struct + VmaAllocatorCreateInfo.PHEAPSIZELIMIT), capacity); }
    /** Unsafe version of {@link #pVulkanFunctions}. */
    public static VmaVulkanFunctions npVulkanFunctions(long struct) { return VmaVulkanFunctions.create(memGetAddress(struct + VmaAllocatorCreateInfo.PVULKANFUNCTIONS)); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VmaAllocatorCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #physicalDevice(VkPhysicalDevice) physicalDevice}. */
    public static void nphysicalDevice(long struct, VkPhysicalDevice value) { memPutAddress(struct + VmaAllocatorCreateInfo.PHYSICALDEVICE, value.address()); }
    /** Unsafe version of {@link #device(VkDevice) device}. */
    public static void ndevice(long struct, VkDevice value) { memPutAddress(struct + VmaAllocatorCreateInfo.DEVICE, value.address()); }
    /** Unsafe version of {@link #preferredLargeHeapBlockSize(long) preferredLargeHeapBlockSize}. */
    public static void npreferredLargeHeapBlockSize(long struct, long value) { memPutLong(struct + VmaAllocatorCreateInfo.PREFERREDLARGEHEAPBLOCKSIZE, value); }
    /** Unsafe version of {@link #pAllocationCallbacks(VkAllocationCallbacks) pAllocationCallbacks}. */
    public static void npAllocationCallbacks(long struct, @Nullable VkAllocationCallbacks value) { memPutAddress(struct + VmaAllocatorCreateInfo.PALLOCATIONCALLBACKS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDeviceMemoryCallbacks(VmaDeviceMemoryCallbacks) pDeviceMemoryCallbacks}. */
    public static void npDeviceMemoryCallbacks(long struct, @Nullable VmaDeviceMemoryCallbacks value) { memPutAddress(struct + VmaAllocatorCreateInfo.PDEVICEMEMORYCALLBACKS, memAddressSafe(value)); }
    /** Unsafe version of {@link #frameInUseCount(int) frameInUseCount}. */
    public static void nframeInUseCount(long struct, int value) { memPutInt(struct + VmaAllocatorCreateInfo.FRAMEINUSECOUNT, value); }
    /** Unsafe version of {@link #pHeapSizeLimit(LongBuffer) pHeapSizeLimit}. */
    public static void npHeapSizeLimit(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VmaAllocatorCreateInfo.PHEAPSIZELIMIT, memAddressSafe(value)); }
    /** Unsafe version of {@link #pVulkanFunctions(VmaVulkanFunctions) pVulkanFunctions}. */
    public static void npVulkanFunctions(long struct, VmaVulkanFunctions value) { memPutAddress(struct + VmaAllocatorCreateInfo.PVULKANFUNCTIONS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VmaAllocatorCreateInfo.PHYSICALDEVICE));
        check(memGetAddress(struct + VmaAllocatorCreateInfo.DEVICE));
        long pAllocationCallbacks = memGetAddress(struct + VmaAllocatorCreateInfo.PALLOCATIONCALLBACKS);
        if (pAllocationCallbacks != NULL) {
            VkAllocationCallbacks.validate(pAllocationCallbacks);
        }
        long pVulkanFunctions = memGetAddress(struct + VmaAllocatorCreateInfo.PVULKANFUNCTIONS);
        check(pVulkanFunctions);
        VmaVulkanFunctions.validate(pVulkanFunctions);
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

    /** An array of {@link VmaAllocatorCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VmaAllocatorCreateInfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VmaAllocatorCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaAllocatorCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VmaAllocatorCreateInfo newInstance(long address) {
            return new VmaAllocatorCreateInfo(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code flags} field. */
        @NativeType("VmaAllocatorCreateFlags")
        public int flags() { return VmaAllocatorCreateInfo.nflags(address()); }
        /** Returns the value of the {@code physicalDevice} field. */
        @NativeType("VkPhysicalDevice")
        public long physicalDevice() { return VmaAllocatorCreateInfo.nphysicalDevice(address()); }
        /** Returns the value of the {@code device} field. */
        @NativeType("VkDevice")
        public long device() { return VmaAllocatorCreateInfo.ndevice(address()); }
        /** Returns the value of the {@code preferredLargeHeapBlockSize} field. */
        @NativeType("VkDeviceSize")
        public long preferredLargeHeapBlockSize() { return VmaAllocatorCreateInfo.npreferredLargeHeapBlockSize(address()); }
        /** Returns a {@link VkAllocationCallbacks} view of the struct pointed to by the {@code pAllocationCallbacks} field. */
        @Nullable
        @NativeType("VkAllocationCallbacks const *")
        public VkAllocationCallbacks pAllocationCallbacks() { return VmaAllocatorCreateInfo.npAllocationCallbacks(address()); }
        /** Returns a {@link VmaDeviceMemoryCallbacks} view of the struct pointed to by the {@code pDeviceMemoryCallbacks} field. */
        @Nullable
        @NativeType("VmaDeviceMemoryCallbacks const *")
        public VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks() { return VmaAllocatorCreateInfo.npDeviceMemoryCallbacks(address()); }
        /** Returns the value of the {@code frameInUseCount} field. */
        @NativeType("uint32_t")
        public int frameInUseCount() { return VmaAllocatorCreateInfo.nframeInUseCount(address()); }
        /**
         * Returns a {@link LongBuffer} view of the data pointed to by the {@code pHeapSizeLimit} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("VkDeviceSize const *")
        public LongBuffer pHeapSizeLimit(int capacity) { return VmaAllocatorCreateInfo.npHeapSizeLimit(address(), capacity); }
        /** Returns a {@link VmaVulkanFunctions} view of the struct pointed to by the {@code pVulkanFunctions} field. */
        @NativeType("VmaVulkanFunctions const *")
        public VmaVulkanFunctions pVulkanFunctions() { return VmaAllocatorCreateInfo.npVulkanFunctions(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public VmaAllocatorCreateInfo.Buffer flags(@NativeType("VmaAllocatorCreateFlags") int value) { VmaAllocatorCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code physicalDevice} field. */
        public VmaAllocatorCreateInfo.Buffer physicalDevice(VkPhysicalDevice value) { VmaAllocatorCreateInfo.nphysicalDevice(address(), value); return this; }
        /** Sets the specified value to the {@code device} field. */
        public VmaAllocatorCreateInfo.Buffer device(VkDevice value) { VmaAllocatorCreateInfo.ndevice(address(), value); return this; }
        /** Sets the specified value to the {@code preferredLargeHeapBlockSize} field. */
        public VmaAllocatorCreateInfo.Buffer preferredLargeHeapBlockSize(@NativeType("VkDeviceSize") long value) { VmaAllocatorCreateInfo.npreferredLargeHeapBlockSize(address(), value); return this; }
        /** Sets the address of the specified {@link VkAllocationCallbacks} to the {@code pAllocationCallbacks} field. */
        public VmaAllocatorCreateInfo.Buffer pAllocationCallbacks(@Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) { VmaAllocatorCreateInfo.npAllocationCallbacks(address(), value); return this; }
        /** Sets the address of the specified {@link VmaDeviceMemoryCallbacks} to the {@code pDeviceMemoryCallbacks} field. */
        public VmaAllocatorCreateInfo.Buffer pDeviceMemoryCallbacks(@Nullable @NativeType("VmaDeviceMemoryCallbacks const *") VmaDeviceMemoryCallbacks value) { VmaAllocatorCreateInfo.npDeviceMemoryCallbacks(address(), value); return this; }
        /** Sets the specified value to the {@code frameInUseCount} field. */
        public VmaAllocatorCreateInfo.Buffer frameInUseCount(@NativeType("uint32_t") int value) { VmaAllocatorCreateInfo.nframeInUseCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pHeapSizeLimit} field. */
        public VmaAllocatorCreateInfo.Buffer pHeapSizeLimit(@Nullable @NativeType("VkDeviceSize const *") LongBuffer value) { VmaAllocatorCreateInfo.npHeapSizeLimit(address(), value); return this; }
        /** Sets the address of the specified {@link VmaVulkanFunctions} to the {@code pVulkanFunctions} field. */
        public VmaAllocatorCreateInfo.Buffer pVulkanFunctions(@NativeType("VmaVulkanFunctions const *") VmaVulkanFunctions value) { VmaAllocatorCreateInfo.npVulkanFunctions(address(), value); return this; }

    }

}