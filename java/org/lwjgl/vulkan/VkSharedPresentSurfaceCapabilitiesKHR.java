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
 * structure describing capabilities of a surface for shared presentation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSharedPresentableImage#VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code sharedPresentSupportedUsageFlags} &ndash; a bitmask of {@code VkImageUsageFlagBits} representing the ways the application <b>can</b> use the shared presentable image from a swapchain created with {@code VkPresentModeKHR} set to {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR} or {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR} for the surface on the specified device. {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} <b>must</b> be included in the set but implementations <b>may</b> support additional usages.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkSharedPresentSurfaceCapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkImageUsageFlags sharedPresentSupportedUsageFlags;
 * }</pre></code>
 */
public class VkSharedPresentSurfaceCapabilitiesKHR extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHAREDPRESENTSUPPORTEDUSAGEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHAREDPRESENTSUPPORTEDUSAGEFLAGS = layout.offsetof(2);
    }

    VkSharedPresentSurfaceCapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSharedPresentSurfaceCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSharedPresentSurfaceCapabilitiesKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code sharedPresentSupportedUsageFlags} field. */
    @NativeType("VkImageUsageFlags")
    public int sharedPresentSupportedUsageFlags() { return nsharedPresentSupportedUsageFlags(address()); }

    // -----------------------------------

    /** Returns a new {@link VkSharedPresentSurfaceCapabilitiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkSharedPresentSurfaceCapabilitiesKHR create(long address) {
        return address == NULL ? null : new VkSharedPresentSurfaceCapabilitiesKHR(address, null);
    }

    /**
     * Create a {@link VkSharedPresentSurfaceCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSharedPresentSurfaceCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSharedPresentSurfaceCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #sharedPresentSupportedUsageFlags}. */
    public static int nsharedPresentSupportedUsageFlags(long struct) { return memGetInt(struct + VkSharedPresentSurfaceCapabilitiesKHR.SHAREDPRESENTSUPPORTEDUSAGEFLAGS); }

    // -----------------------------------

    /** An array of {@link VkSharedPresentSurfaceCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkSharedPresentSurfaceCapabilitiesKHR, Buffer> {

        /**
         * Creates a new {@link VkSharedPresentSurfaceCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSharedPresentSurfaceCapabilitiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSharedPresentSurfaceCapabilitiesKHR newInstance(long address) {
            return new VkSharedPresentSurfaceCapabilitiesKHR(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSharedPresentSurfaceCapabilitiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSharedPresentSurfaceCapabilitiesKHR.npNext(address()); }
        /** Returns the value of the {@code sharedPresentSupportedUsageFlags} field. */
        @NativeType("VkImageUsageFlags")
        public int sharedPresentSupportedUsageFlags() { return VkSharedPresentSurfaceCapabilitiesKHR.nsharedPresentSupportedUsageFlags(address()); }

    }

}