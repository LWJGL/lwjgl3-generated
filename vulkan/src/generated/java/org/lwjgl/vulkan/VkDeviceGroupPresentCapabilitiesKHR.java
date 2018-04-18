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
import static org.lwjgl.vulkan.VK11.*;

/**
 * Present capabilities from other physical devices.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code modes} always has {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR} set.</p>
 * 
 * <p>The present mode flags are also used when presenting an image, in {@link VkDeviceGroupPresentInfoKHR}{@code ::mode}.</p>
 * 
 * <p>If a device group only includes a single physical device, then {@code modes} <b>must</b> equal {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSwapchain#VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRSwapchain#vkGetDeviceGroupPresentCapabilitiesKHR GetDeviceGroupPresentCapabilitiesKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code presentMask} &ndash; an array of masks, where the mask at element <code>i</code> is non-zero if physical device <code>i</code> has a presentation engine, and where bit <code>j</code> is set in element <code>i</code> if physical device <code>i</code> <b>can</b> present swapchain images from physical device <code>j</code>. If element <code>i</code> is non-zero, then bit <code>i</code> <b>must</b> be set.</li>
 * <li>{@code modes} &ndash; a bitmask of {@code VkDeviceGroupPresentModeFlagBitsKHR} indicating which device group presentation modes are supported.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDeviceGroupPresentCapabilitiesKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t presentMask[VK_MAX_DEVICE_GROUP_SIZE];
 *     VkDeviceGroupPresentModeFlagsKHR modes;
 * }</pre></code>
 */
public class VkDeviceGroupPresentCapabilitiesKHR extends Struct implements NativeResource {

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
            __array(4, VK_MAX_DEVICE_GROUP_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMASK = layout.offsetof(2);
        MODES = layout.offsetof(3);
    }

    VkDeviceGroupPresentCapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDeviceGroupPresentCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupPresentCapabilitiesKHR(ByteBuffer container) {
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
    /** Returns a {@link IntBuffer} view of the {@code presentMask} field. */
    @NativeType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]")
    public IntBuffer presentMask() { return npresentMask(address()); }
    /** Returns the value at the specified index of the {@code presentMask} field. */
    @NativeType("uint32_t")
    public int presentMask(int index) { return npresentMask(address(), index); }
    /** Returns the value of the {@code modes} field. */
    @NativeType("VkDeviceGroupPresentModeFlagsKHR")
    public int modes() { return nmodes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGroupPresentCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGroupPresentCapabilitiesKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupPresentCapabilitiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupPresentCapabilitiesKHR set(VkDeviceGroupPresentCapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupPresentCapabilitiesKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupPresentCapabilitiesKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupPresentCapabilitiesKHR create() {
        return new VkDeviceGroupPresentCapabilitiesKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR} instance for the specified memory address. */
    public static VkDeviceGroupPresentCapabilitiesKHR create(long address) {
        return new VkDeviceGroupPresentCapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupPresentCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceGroupPresentCapabilitiesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceGroupPresentCapabilitiesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupPresentCapabilitiesKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupPresentCapabilitiesKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupPresentCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupPresentCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #presentMask}. */
    public static IntBuffer npresentMask(long struct) { return memIntBuffer(struct + VkDeviceGroupPresentCapabilitiesKHR.PRESENTMASK, VK_MAX_DEVICE_GROUP_SIZE); }
    /** Unsafe version of {@link #presentMask(int) presentMask}. */
    public static int npresentMask(long struct, int index) {
        return memGetInt(struct + VkDeviceGroupPresentCapabilitiesKHR.PRESENTMASK + check(index, VK_MAX_DEVICE_GROUP_SIZE) * 4);
    }
    /** Unsafe version of {@link #modes}. */
    public static int nmodes(long struct) { return memGetInt(struct + VkDeviceGroupPresentCapabilitiesKHR.MODES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGroupPresentCapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupPresentCapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupPresentCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupPresentCapabilitiesKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupPresentCapabilitiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupPresentCapabilitiesKHR newInstance(long address) {
            return new VkDeviceGroupPresentCapabilitiesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupPresentCapabilitiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGroupPresentCapabilitiesKHR.npNext(address()); }
        /** Returns a {@link IntBuffer} view of the {@code presentMask} field. */
        @NativeType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]")
        public IntBuffer presentMask() { return VkDeviceGroupPresentCapabilitiesKHR.npresentMask(address()); }
        /** Returns the value at the specified index of the {@code presentMask} field. */
        @NativeType("uint32_t")
        public int presentMask(int index) { return VkDeviceGroupPresentCapabilitiesKHR.npresentMask(address(), index); }
        /** Returns the value of the {@code modes} field. */
        @NativeType("VkDeviceGroupPresentModeFlagsKHR")
        public int modes() { return VkDeviceGroupPresentCapabilitiesKHR.nmodes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGroupPresentCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupPresentCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGroupPresentCapabilitiesKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupPresentCapabilitiesKHR.npNext(address(), value); return this; }

    }

}