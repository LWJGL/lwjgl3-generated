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
 * Specify that an image will be bound to swapchain memory.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code swapchain} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the fields of {@link VkImageCreateInfo} <b>must</b> match the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#swapchain-wsi-image-create-info">implied image creation parameters</a> of the swapchain</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHX STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHX}</li>
 * <li>If {@code swapchain} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code swapchain} &ndash; {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a handle of a swapchain that the image will be bound to.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImageSwapchainCreateInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkSwapchainKHR swapchain;
 * }</pre></code>
 */
public class VkImageSwapchainCreateInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
    }

    VkImageSwapchainCreateInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImageSwapchainCreateInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageSwapchainCreateInfoKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code swapchain} field. */
    public long swapchain() { return nswapchain(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageSwapchainCreateInfoKHX sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageSwapchainCreateInfoKHX pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchain} field. */
    public VkImageSwapchainCreateInfoKHX swapchain(long value) { nswapchain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageSwapchainCreateInfoKHX set(
        int sType,
        long pNext,
        long swapchain
    ) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageSwapchainCreateInfoKHX set(VkImageSwapchainCreateInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImageSwapchainCreateInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageSwapchainCreateInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkImageSwapchainCreateInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageSwapchainCreateInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkImageSwapchainCreateInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkImageSwapchainCreateInfoKHX create() {
        return new VkImageSwapchainCreateInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImageSwapchainCreateInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkImageSwapchainCreateInfoKHX create(long address) {
        return address == NULL ? null : new VkImageSwapchainCreateInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkImageSwapchainCreateInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImageSwapchainCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageSwapchainCreateInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImageSwapchainCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageSwapchainCreateInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSwapchainCreateInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSwapchainCreateInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageSwapchainCreateInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageSwapchainCreateInfoKHX.PNEXT); }
    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return memGetLong(struct + VkImageSwapchainCreateInfoKHX.SWAPCHAIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageSwapchainCreateInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageSwapchainCreateInfoKHX.PNEXT, value); }
    /** Unsafe version of {@link #swapchain(long) swapchain}. */
    public static void nswapchain(long struct, long value) { memPutLong(struct + VkImageSwapchainCreateInfoKHX.SWAPCHAIN, value); }

    // -----------------------------------

    /** An array of {@link VkImageSwapchainCreateInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkImageSwapchainCreateInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImageSwapchainCreateInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageSwapchainCreateInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkImageSwapchainCreateInfoKHX newInstance(long address) {
            return new VkImageSwapchainCreateInfoKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkImageSwapchainCreateInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkImageSwapchainCreateInfoKHX.npNext(address()); }
        /** Returns the value of the {@code swapchain} field. */
        public long swapchain() { return VkImageSwapchainCreateInfoKHX.nswapchain(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageSwapchainCreateInfoKHX.Buffer sType(int value) { VkImageSwapchainCreateInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageSwapchainCreateInfoKHX.Buffer pNext(long value) { VkImageSwapchainCreateInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchain} field. */
        public VkImageSwapchainCreateInfoKHX.Buffer swapchain(long value) { VkImageSwapchainCreateInfoKHX.nswapchain(address(), value); return this; }

    }

}