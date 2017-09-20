/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;
import static org.lwjgl.vulkan.KHXDeviceGroupCreation.*;

/**
 * Present capabilities from other physical devices.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code modes} always has {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX} set.</p>
 * 
 * <p>The present mode flags are also used when presenting an image, in {@link VkDeviceGroupPresentInfoKHX}{@code ::mode}.</p>
 * 
 * <p>If a device group only includes a single physical device, then {@code modes} <b>must</b> equal {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHX STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHXDeviceGroup#vkGetDeviceGroupPresentCapabilitiesKHX GetDeviceGroupPresentCapabilitiesKHX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code presentMask} &ndash; an array of masks, where the mask at element <code>i</code> is non-zero if physical device <code>i</code> has a presentation engine, and where bit <code>j</code> is set in element <code>i</code> if physical device <code>i</code> <b>can</b> present swapchain images from physical device <code>j</code>. If element <code>i</code> is non-zero, then bit <code>i</code> <b>must</b> be set.</li>
 * <li>{@code modes} &ndash; a bitmask of {@code VkDeviceGroupPresentModeFlagBitsKHX} indicating which device group presentation modes are supported.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDeviceGroupPresentCapabilitiesKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t presentMask[VK_MAX_DEVICE_GROUP_SIZE_KHX];
 *     VkDeviceGroupPresentModeFlagsKHX modes;
 * }</pre></code>
 */
public class VkDeviceGroupPresentCapabilitiesKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTMASK,
        MODES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(4, VK_MAX_DEVICE_GROUP_SIZE_KHX),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMASK = layout.offsetof(2);
        MODES = layout.offsetof(3);
    }

    VkDeviceGroupPresentCapabilitiesKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDeviceGroupPresentCapabilitiesKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupPresentCapabilitiesKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link IntBuffer} view of the {@code presentMask} field. */
    @NativeType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE_KHX]")
    public IntBuffer presentMask() { return npresentMask(address()); }
    /** Returns the value at the specified index of the {@code presentMask} field. */
    @NativeType("uint32_t")
    public int presentMask(int index) { return npresentMask(address(), index); }
    /** Returns the value of the {@code modes} field. */
    @NativeType("VkDeviceGroupPresentModeFlagsKHX")
    public int modes() { return nmodes(address()); }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupPresentCapabilitiesKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupPresentCapabilitiesKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupPresentCapabilitiesKHX create() {
        return new VkDeviceGroupPresentCapabilitiesKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkDeviceGroupPresentCapabilitiesKHX create(long address) {
        return address == NULL ? null : new VkDeviceGroupPresentCapabilitiesKHX(address, null);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDeviceGroupPresentCapabilitiesKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceGroupPresentCapabilitiesKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceGroupPresentCapabilitiesKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupPresentCapabilitiesKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupPresentCapabilitiesKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupPresentCapabilitiesKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupPresentCapabilitiesKHX.PNEXT); }
    /** Unsafe version of {@link #presentMask}. */
    public static IntBuffer npresentMask(long struct) { return memIntBuffer(struct + VkDeviceGroupPresentCapabilitiesKHX.PRESENTMASK, VK_MAX_DEVICE_GROUP_SIZE_KHX); }
    /** Unsafe version of {@link #presentMask(int) presentMask}. */
    public static int npresentMask(long struct, int index) {
        if (CHECKS) { check(index, VK_MAX_DEVICE_GROUP_SIZE_KHX); }
        return memGetInt(struct + VkDeviceGroupPresentCapabilitiesKHX.PRESENTMASK + index * 4);
    }
    /** Unsafe version of {@link #modes}. */
    public static int nmodes(long struct) { return memGetInt(struct + VkDeviceGroupPresentCapabilitiesKHX.MODES); }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupPresentCapabilitiesKHX} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupPresentCapabilitiesKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDeviceGroupPresentCapabilitiesKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupPresentCapabilitiesKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupPresentCapabilitiesKHX newInstance(long address) {
            return new VkDeviceGroupPresentCapabilitiesKHX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupPresentCapabilitiesKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkDeviceGroupPresentCapabilitiesKHX.npNext(address()); }
        /** Returns a {@link IntBuffer} view of the {@code presentMask} field. */
        @NativeType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE_KHX]")
        public IntBuffer presentMask() { return VkDeviceGroupPresentCapabilitiesKHX.npresentMask(address()); }
        /** Returns the value at the specified index of the {@code presentMask} field. */
        @NativeType("uint32_t")
        public int presentMask(int index) { return VkDeviceGroupPresentCapabilitiesKHX.npresentMask(address(), index); }
        /** Returns the value of the {@code modes} field. */
        @NativeType("VkDeviceGroupPresentModeFlagsKHX")
        public int modes() { return VkDeviceGroupPresentCapabilitiesKHX.nmodes(address()); }

    }

}