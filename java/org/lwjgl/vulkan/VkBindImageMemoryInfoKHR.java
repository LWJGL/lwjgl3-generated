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
 * Structure specifying how to bind an image to memory.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code image} <b>must</b> not already be backed by a memory object</li>
 * <li>{@code image} <b>must</b> not have been created with any sparse memory binding flags</li>
 * <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
 * <li>If the {@code pNext} chain does not include an instance of the {@link VkBindImagePlaneMemoryInfoKHR} structure, {@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the {@link VkMemoryRequirements} structure returned from a call to {@link KHRGetMemoryRequirements2#vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR} with {@code image}</li>
 * <li>If the {@code pNext} chain does not include an instance of the {@link VkBindImagePlaneMemoryInfoKHR} structure, {@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the {@link VkMemoryRequirements} structure returned from a call to {@link KHRGetMemoryRequirements2#vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR} with {@code image}</li>
 * <li>If the {@code pNext} chain does not include an instance of the {@link VkBindImagePlaneMemoryInfoKHR} structure, the difference of the size of {@code memory} and {@code memoryOffset} <b>must</b> be greater than or equal to the {@code size} member of the {@link VkMemoryRequirements} structure returned from a call to {@link KHRGetMemoryRequirements2#vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR} with the same {@code image}</li>
 * <li>If the {@code pNext} chain includes an instance of the {@link VkBindImagePlaneMemoryInfoKHR} structure, {@code image} <b>must</b> have been created with the {@link KHRSamplerYcbcrConversion#VK_IMAGE_CREATE_DISJOINT_BIT_KHR IMAGE_CREATE_DISJOINT_BIT_KHR} bit set.</li>
 * <li>If the {@code pNext} chain includes an instance of the {@link VkBindImagePlaneMemoryInfoKHR} structure, {@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the {@link VkMemoryRequirements} structure returned from a call to {@link KHRGetMemoryRequirements2#vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR} with {@code image} and the correct {@code planeAspect} for this plane in the {@link VkImagePlaneMemoryRequirementsInfoKHR} structure attached to the {@link VkImageMemoryRequirementsInfo2KHR}&#8217;s {@code pNext} chain</li>
 * <li>If the {@code pNext} chain includes an instance of the {@link VkBindImagePlaneMemoryInfoKHR} structure, {@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the {@link VkMemoryRequirements} structure returned from a call to {@link KHRGetMemoryRequirements2#vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR} with {@code image} and the correct {@code planeAspect} for this plane in the {@link VkImagePlaneMemoryRequirementsInfoKHR} structure attached to the {@link VkImageMemoryRequirementsInfo2KHR}&#8217;s {@code pNext} chain</li>
 * <li>If the {@code pNext} chain includes an instance of the {@link VkBindImagePlaneMemoryInfoKHR} structure, the difference of the size of {@code memory} and {@code memoryOffset} <b>must</b> be greater than or equal to the {@code size} member of the {@link VkMemoryRequirements} structure returned from a call to {@link KHRGetMemoryRequirements2#vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR} with the same {@code image} and the correct {@code planeAspect} for this plane in the {@link VkImagePlaneMemoryRequirementsInfoKHR} structure attached to the {@link VkImageMemoryRequirementsInfo2KHR}&#8217;s {@code pNext} chain</li>
 * <li>If {@code image} requires a dedicated allocation (as reported by {@link KHRGetMemoryRequirements2#vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR} in {@link VkMemoryDedicatedRequirementsKHR}::requiresDedicatedAllocation for {@code image}), {@code memory} <b>must</b> have been created with {@link VkMemoryDedicatedAllocateInfoKHR}{@code ::image} equal to {@code image} and {@code memoryOffset} <b>must</b> be zero</li>
 * <li>If {@code image} was created with {@link VkDedicatedAllocationImageCreateInfoNV}{@code ::dedicatedAllocation} equal to {@link VK10#VK_TRUE TRUE}, {@code memory} <b>must</b> have been created with {@link VkDedicatedAllocationMemoryAllocateInfoNV}{@code ::image} equal to {@code image} and {@code memoryOffset} <b>must</b> be zero</li>
 * <li>If the {@code pNext} chain includes {@link VkBindImageMemoryDeviceGroupInfoKHX}, all instances of {@code memory} specified by {@link VkBindImageMemoryDeviceGroupInfoKHX}{@code ::pDeviceIndices} <b>must</b> have been allocated</li>
 * <li>If the {@code pNext} chain includes {@link VkBindImageMemoryDeviceGroupInfoKHX}, and {@link VkBindImageMemoryDeviceGroupInfoKHX}{@code ::SFRRectCount} is not zero, then {@code image} <b>must</b> have been created with the {@link KHXDeviceGroup#VK_IMAGE_CREATE_BIND_SFR_BIT_KHX IMAGE_CREATE_BIND_SFR_BIT_KHX} bit set</li>
 * <li>If the {@code pNext} chain includes {@link VkBindImageMemoryDeviceGroupInfoKHX}, all elements of {@link VkBindImageMemoryDeviceGroupInfoKHX}{@code ::pSFRRects} <b>must</b> be valid rectangles contained within the dimensions of {@code image}</li>
 * <li>If the {@code pNext} chain includes {@link VkBindImageMemoryDeviceGroupInfoKHX}, the union of the areas of all elements of {@link VkBindImageMemoryDeviceGroupInfoKHX}{@code ::pSFRRects} that correspond to the same instance of {@code image} <b>must</b> cover the entire image.</li>
 * <li>If {@code image} was created with a valid swapchain handle in {@link VkImageSwapchainCreateInfoKHX}{@code ::swapchain}, then the {@code pNext} chain <b>must</b> include a valid instance of {@link VkBindImageMemorySwapchainInfoKHX}</li>
 * <li>If the {@code pNext} chain includes an instance of {@link VkBindImageMemorySwapchainInfoKHX}, {@code memory} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If the {@code pNext} chain does not include an instance of {@link VkBindImageMemorySwapchainInfoKHX}, {@code memory} <b>must</b> be a valid dname:VkDeviceMemory handle</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRBindMemory2#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkBindImageMemoryDeviceGroupInfoKHX}, {@link VkBindImageMemorySwapchainInfoKHX}, or {@link VkBindImagePlaneMemoryInfoKHR}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>Both of {@code image}, and {@code memory} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRBindMemory2#vkBindImageMemory2KHR BindImageMemory2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code image} &ndash; the image to be attached to memory.</li>
 * <li>{@code memory} &ndash; a {@code VkDeviceMemory} object describing the device memory to attach.</li>
 * <li>{@code memoryOffset} &ndash; the start offset of the region of {@code memory} which is to be bound to the image. The number of bytes returned in the {@link VkMemoryRequirements}{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified image.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkBindImageMemoryInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkImage image;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 * }</pre></code>
 */
public class VkBindImageMemoryInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE,
        MEMORY,
        MEMORYOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
    }

    VkBindImageMemoryInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkBindImageMemoryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindImageMemoryInfoKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** Returns the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** Returns the value of the {@code memoryOffset} field. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindImageMemoryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindImageMemoryInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public VkBindImageMemoryInfoKHR image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkBindImageMemoryInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    public VkBindImageMemoryInfoKHR memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindImageMemoryInfoKHR set(
        int sType,
        long pNext,
        long image,
        long memory,
        long memoryOffset
    ) {
        sType(sType);
        pNext(pNext);
        image(image);
        memory(memory);
        memoryOffset(memoryOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindImageMemoryInfoKHR set(VkBindImageMemoryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkBindImageMemoryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryInfoKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkBindImageMemoryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryInfoKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkBindImageMemoryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindImageMemoryInfoKHR create() {
        return new VkBindImageMemoryInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkBindImageMemoryInfoKHR} instance for the specified memory address. */
    public static VkBindImageMemoryInfoKHR create(long address) {
        return new VkBindImageMemoryInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryInfoKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkBindImageMemoryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkBindImageMemoryInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindImageMemoryInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkBindImageMemoryInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindImageMemoryInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindImageMemoryInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindImageMemoryInfoKHR.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + VkBindImageMemoryInfoKHR.IMAGE); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkBindImageMemoryInfoKHR.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return memGetLong(struct + VkBindImageMemoryInfoKHR.MEMORYOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindImageMemoryInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindImageMemoryInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutLong(struct + VkBindImageMemoryInfoKHR.IMAGE, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkBindImageMemoryInfoKHR.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkBindImageMemoryInfoKHR.MEMORYOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkBindImageMemoryInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkBindImageMemoryInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkBindImageMemoryInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindImageMemoryInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBindImageMemoryInfoKHR newInstance(long address) {
            return new VkBindImageMemoryInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindImageMemoryInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkBindImageMemoryInfoKHR.npNext(address()); }
        /** Returns the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return VkBindImageMemoryInfoKHR.nimage(address()); }
        /** Returns the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkBindImageMemoryInfoKHR.nmemory(address()); }
        /** Returns the value of the {@code memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkBindImageMemoryInfoKHR.nmemoryOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindImageMemoryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindImageMemoryInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindImageMemoryInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkBindImageMemoryInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public VkBindImageMemoryInfoKHR.Buffer image(@NativeType("VkImage") long value) { VkBindImageMemoryInfoKHR.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkBindImageMemoryInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindImageMemoryInfoKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        public VkBindImageMemoryInfoKHR.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindImageMemoryInfoKHR.nmemoryOffset(address(), value); return this; }

    }

}