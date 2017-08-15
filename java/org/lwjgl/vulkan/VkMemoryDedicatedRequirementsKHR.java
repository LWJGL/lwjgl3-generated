/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure describing dedicated allocation requirements of buffer and image resources.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkMemoryDedicatedRequirementsKHR} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2KHR} structure passed as the {@code pMemoryRequirements} parameter of a {@link KHRGetMemoryRequirements2#vkGetBufferMemoryRequirements2KHR GetBufferMemoryRequirements2KHR} call, {@code requiresDedicatedAllocation} <b>may</b> be {@link VK10#VK_TRUE TRUE} under one of the following conditions:</p>
 * 
 * <ul>
 * <li>The {@code pNext} chain of {@link VkBufferCreateInfo} for the call to {@link VK10#vkCreateBuffer CreateBuffer} used to create the buffer being queried contained an instance of {@link VkExternalMemoryBufferCreateInfoKHR}, and any of the handle types specified in {@link VkExternalMemoryBufferCreateInfoKHR}{@code ::handleTypes} requires dedicated allocation, as reported by {@link KHRExternalMemoryCapabilities#vkGetPhysicalDeviceExternalBufferPropertiesKHR GetPhysicalDeviceExternalBufferPropertiesKHR} in {@link VkExternalBufferPropertiesKHR}{@code ::externalMemoryProperties}{@code ::externalMemoryFeatures}, the {@code requiresDedicatedAllocation} field will be set to {@link VK10#VK_TRUE TRUE}.</li>
 * </ul>
 * 
 * <p>In all other cases, {@code requiresDedicatedAllocation} <b>must</b> be set to {@link VK10#VK_FALSE FALSE} by the implementation whenever a {@link VkMemoryDedicatedRequirementsKHR} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2KHR} structure passed to a call to {@link KHRGetMemoryRequirements2#vkGetBufferMemoryRequirements2KHR GetBufferMemoryRequirements2KHR}.</p>
 * 
 * <p>If the {@link VkMemoryDedicatedRequirementsKHR} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2KHR} structure passed as the {@code pMemoryRequirements} parameter of a {@link KHRGetMemoryRequirements2#vkGetBufferMemoryRequirements2KHR GetBufferMemoryRequirements2KHR} call and {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT} was set in {@link VkBufferCreateInfo}{@code ::flags} when {@code buffer} was created then the implementation <b>must</b> set both {@code prefersDedicatedAllocation} and {@code requiresDedicatedAllocation} to {@link VK10#VK_FALSE FALSE}.</p>
 * 
 * <p>If the {@link VkMemoryDedicatedRequirementsKHR} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2KHR} structure passed as the {@code pMemoryRequirements} parameter of a {@link KHRGetMemoryRequirements2#vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR} call, {@code requiresDedicatedAllocation} <b>may</b> be {@link VK10#VK_TRUE TRUE} under one of the following conditions:</p>
 * 
 * <ul>
 * <li>The {@code pNext} chain of {@link VkImageCreateInfo} for the call to {@link VK10#vkCreateImage CreateImage} used to create the image being queried contained an instance of {@link VkExternalMemoryImageCreateInfoKHR}, and any of the handle types specified in {@link VkExternalMemoryImageCreateInfoKHR}{@code ::handleTypes} requires dedicated allocation, as reported by {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR} in {@link VkExternalImageFormatPropertiesKHR}{@code ::externalMemoryProperties}{@code ::externalMemoryFeatures}, the {@code requiresDedicatedAllocation} field will be set to {@link VK10#VK_TRUE TRUE}.</li>
 * </ul>
 * 
 * <p>In all other cases, {@code requiresDedicatedAllocation} <b>must</b> be set to {@link VK10#VK_FALSE FALSE} by the implementation whenever a {@link VkMemoryDedicatedRequirementsKHR} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2KHR} structure passed to a call to {@link KHRGetMemoryRequirements2#vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR}.</p>
 * 
 * <p>If the {@link VkMemoryDedicatedRequirementsKHR} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2KHR} structure passed as the {@code pMemoryRequirements} parameter of a {@link KHRGetMemoryRequirements2#vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR} call and {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT} was set in {@link VkImageCreateInfo}{@code ::flags} when {@code image} was created then the implementation <b>must</b> set both {@code prefersDedicatedAllocation} and {@code requiresDedicatedAllocation} to {@link VK10#VK_FALSE FALSE}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDedicatedAllocation#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS_KHR STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code prefersDedicatedAllocation} &ndash; indicates that the implementation would prefer a dedicated allocation for this resource. The application is still free to suballocate the resource but it <b>may</b> get better performance if a dedicated allocation is used.</li>
 * <li>{@code requiresDedicatedAllocation} &ndash; indicates that a dedicated allocation is required for this resource.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkMemoryDedicatedRequirementsKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 prefersDedicatedAllocation;
 *     VkBool32 requiresDedicatedAllocation;
 * }</pre></code>
 */
public class VkMemoryDedicatedRequirementsKHR extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PREFERSDEDICATEDALLOCATION,
        REQUIRESDEDICATEDALLOCATION;

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
        PREFERSDEDICATEDALLOCATION = layout.offsetof(2);
        REQUIRESDEDICATEDALLOCATION = layout.offsetof(3);
    }

    VkMemoryDedicatedRequirementsKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkMemoryDedicatedRequirementsKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryDedicatedRequirementsKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code prefersDedicatedAllocation} field. */
    @NativeType("VkBool32")
    public boolean prefersDedicatedAllocation() { return nprefersDedicatedAllocation(address()) != 0; }
    /** Returns the value of the {@code requiresDedicatedAllocation} field. */
    @NativeType("VkBool32")
    public boolean requiresDedicatedAllocation() { return nrequiresDedicatedAllocation(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@link VkMemoryDedicatedRequirementsKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkMemoryDedicatedRequirementsKHR create(long address) {
        return address == NULL ? null : new VkMemoryDedicatedRequirementsKHR(address, null);
    }

    /**
     * Create a {@link VkMemoryDedicatedRequirementsKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryDedicatedRequirementsKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryDedicatedRequirementsKHR.PNEXT); }
    /** Unsafe version of {@link #prefersDedicatedAllocation}. */
    public static int nprefersDedicatedAllocation(long struct) { return memGetInt(struct + VkMemoryDedicatedRequirementsKHR.PREFERSDEDICATEDALLOCATION); }
    /** Unsafe version of {@link #requiresDedicatedAllocation}. */
    public static int nrequiresDedicatedAllocation(long struct) { return memGetInt(struct + VkMemoryDedicatedRequirementsKHR.REQUIRESDEDICATEDALLOCATION); }

    // -----------------------------------

    /** An array of {@link VkMemoryDedicatedRequirementsKHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryDedicatedRequirementsKHR, Buffer> {

        /**
         * Creates a new {@link VkMemoryDedicatedRequirementsKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryDedicatedRequirementsKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryDedicatedRequirementsKHR newInstance(long address) {
            return new VkMemoryDedicatedRequirementsKHR(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryDedicatedRequirementsKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkMemoryDedicatedRequirementsKHR.npNext(address()); }
        /** Returns the value of the {@code prefersDedicatedAllocation} field. */
        @NativeType("VkBool32")
        public boolean prefersDedicatedAllocation() { return VkMemoryDedicatedRequirementsKHR.nprefersDedicatedAllocation(address()) != 0; }
        /** Returns the value of the {@code requiresDedicatedAllocation} field. */
        @NativeType("VkBool32")
        public boolean requiresDedicatedAllocation() { return VkMemoryDedicatedRequirementsKHR.nrequiresDedicatedAllocation(address()) != 0; }

    }

}