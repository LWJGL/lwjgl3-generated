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
 * Structure specifying parameters of a newly created swapchain object.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, {@code modes} is considered to be {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHX}</li>
 * <li>{@code modes} <b>must</b> be a valid combination of {@code VkDeviceGroupPresentModeFlagBitsKHX} values</li>
 * <li>{@code modes} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code modes} &ndash; a bitfield of modes that the swapchain <b>can</b> be used with.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDeviceGroupSwapchainCreateInfoKHX {
    VkStructureType sType;
    const void * pNext;
    VkDeviceGroupPresentModeFlagsKHX modes;
}</code></pre>
 */
public class VkDeviceGroupSwapchainCreateInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MODES;

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
        MODES = layout.offsetof(2);
    }

    VkDeviceGroupSwapchainCreateInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDeviceGroupSwapchainCreateInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupSwapchainCreateInfoKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code modes} field. */
    public int modes() { return nmodes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGroupSwapchainCreateInfoKHX sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGroupSwapchainCreateInfoKHX pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code modes} field. */
    public VkDeviceGroupSwapchainCreateInfoKHX modes(int value) { nmodes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupSwapchainCreateInfoKHX set(
        int sType,
        long pNext,
        int modes
    ) {
        sType(sType);
        pNext(pNext);
        modes(modes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupSwapchainCreateInfoKHX set(VkDeviceGroupSwapchainCreateInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupSwapchainCreateInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupSwapchainCreateInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupSwapchainCreateInfoKHX create() {
        return new VkDeviceGroupSwapchainCreateInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkDeviceGroupSwapchainCreateInfoKHX create(long address) {
        return address == NULL ? null : new VkDeviceGroupSwapchainCreateInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkDeviceGroupSwapchainCreateInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceGroupSwapchainCreateInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceGroupSwapchainCreateInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupSwapchainCreateInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupSwapchainCreateInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupSwapchainCreateInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupSwapchainCreateInfoKHX.PNEXT); }
    /** Unsafe version of {@link #modes}. */
    public static int nmodes(long struct) { return memGetInt(struct + VkDeviceGroupSwapchainCreateInfoKHX.MODES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGroupSwapchainCreateInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupSwapchainCreateInfoKHX.PNEXT, value); }
    /** Unsafe version of {@link #modes(int) modes}. */
    public static void nmodes(long struct, int value) { memPutInt(struct + VkDeviceGroupSwapchainCreateInfoKHX.MODES, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupSwapchainCreateInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupSwapchainCreateInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDeviceGroupSwapchainCreateInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupSwapchainCreateInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupSwapchainCreateInfoKHX newInstance(long address) {
            return new VkDeviceGroupSwapchainCreateInfoKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkDeviceGroupSwapchainCreateInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkDeviceGroupSwapchainCreateInfoKHX.npNext(address()); }
        /** Returns the value of the {@code modes} field. */
        public int modes() { return VkDeviceGroupSwapchainCreateInfoKHX.nmodes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGroupSwapchainCreateInfoKHX.Buffer sType(int value) { VkDeviceGroupSwapchainCreateInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGroupSwapchainCreateInfoKHX.Buffer pNext(long value) { VkDeviceGroupSwapchainCreateInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code modes} field. */
        public VkDeviceGroupSwapchainCreateInfoKHX.Buffer modes(int value) { VkDeviceGroupSwapchainCreateInfoKHX.nmodes(address(), value); return this; }

    }

}