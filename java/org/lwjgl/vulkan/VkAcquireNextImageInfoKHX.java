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
 * Structure specifying parameters of the acquire.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@link KHRSwapchain#vkAcquireNextImageKHR AcquireNextImageKHR} is used, the device mask is considered to include all physical devices in the logical device.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> be unsignaled</li>
 * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> be unsignaled and <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
 * <li>{@code deviceMask} <b>must</b> be a valid device mask</li>
 * <li>{@code deviceMask} <b>must</b> not be zero</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHX STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
 * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
 * <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHXDeviceGroup#vkAcquireNextImage2KHX AcquireNextImage2KHX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code swapchain} &ndash; the swapchain from which an image is being acquired.</li>
 * <li>{@code timeout} &ndash; indicates how long the function waits, in nanoseconds, if no image is available.</li>
 * <li>{@code semaphore} &ndash; {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a semaphore to signal.</li>
 * <li>{@code fence} &ndash; {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a fence to signal.</li>
 * <li>{@code deviceMask} &ndash; a mask of physical devices for which the swapchain image will be ready to use when the semaphore or fence is signaled.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkAcquireNextImageInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkSwapchainKHR swapchain;
 *     uint64_t timeout;
 *     VkSemaphore semaphore;
 *     VkFence fence;
 *     uint32_t deviceMask;
 * }</pre></code>
 */
public class VkAcquireNextImageInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAIN,
        TIMEOUT,
        SEMAPHORE,
        FENCE,
        DEVICEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
        TIMEOUT = layout.offsetof(3);
        SEMAPHORE = layout.offsetof(4);
        FENCE = layout.offsetof(5);
        DEVICEMASK = layout.offsetof(6);
    }

    VkAcquireNextImageInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkAcquireNextImageInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAcquireNextImageInfoKHX(ByteBuffer container) {
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
    /** Returns the value of the {@code timeout} field. */
    public long timeout() { return ntimeout(address()); }
    /** Returns the value of the {@code semaphore} field. */
    public long semaphore() { return nsemaphore(address()); }
    /** Returns the value of the {@code fence} field. */
    public long fence() { return nfence(address()); }
    /** Returns the value of the {@code deviceMask} field. */
    public int deviceMask() { return ndeviceMask(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAcquireNextImageInfoKHX sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAcquireNextImageInfoKHX pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchain} field. */
    public VkAcquireNextImageInfoKHX swapchain(long value) { nswapchain(address(), value); return this; }
    /** Sets the specified value to the {@code timeout} field. */
    public VkAcquireNextImageInfoKHX timeout(long value) { ntimeout(address(), value); return this; }
    /** Sets the specified value to the {@code semaphore} field. */
    public VkAcquireNextImageInfoKHX semaphore(long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code fence} field. */
    public VkAcquireNextImageInfoKHX fence(long value) { nfence(address(), value); return this; }
    /** Sets the specified value to the {@code deviceMask} field. */
    public VkAcquireNextImageInfoKHX deviceMask(int value) { ndeviceMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAcquireNextImageInfoKHX set(
        int sType,
        long pNext,
        long swapchain,
        long timeout,
        long semaphore,
        long fence,
        int deviceMask
    ) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        timeout(timeout);
        semaphore(semaphore);
        fence(fence);
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
    public VkAcquireNextImageInfoKHX set(VkAcquireNextImageInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkAcquireNextImageInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAcquireNextImageInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkAcquireNextImageInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAcquireNextImageInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkAcquireNextImageInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkAcquireNextImageInfoKHX create() {
        return new VkAcquireNextImageInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkAcquireNextImageInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkAcquireNextImageInfoKHX create(long address) {
        return address == NULL ? null : new VkAcquireNextImageInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkAcquireNextImageInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkAcquireNextImageInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAcquireNextImageInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkAcquireNextImageInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAcquireNextImageInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAcquireNextImageInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAcquireNextImageInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAcquireNextImageInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAcquireNextImageInfoKHX.PNEXT); }
    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return memGetLong(struct + VkAcquireNextImageInfoKHX.SWAPCHAIN); }
    /** Unsafe version of {@link #timeout}. */
    public static long ntimeout(long struct) { return memGetLong(struct + VkAcquireNextImageInfoKHX.TIMEOUT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return memGetLong(struct + VkAcquireNextImageInfoKHX.SEMAPHORE); }
    /** Unsafe version of {@link #fence}. */
    public static long nfence(long struct) { return memGetLong(struct + VkAcquireNextImageInfoKHX.FENCE); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return memGetInt(struct + VkAcquireNextImageInfoKHX.DEVICEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAcquireNextImageInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAcquireNextImageInfoKHX.PNEXT, value); }
    /** Unsafe version of {@link #swapchain(long) swapchain}. */
    public static void nswapchain(long struct, long value) { memPutLong(struct + VkAcquireNextImageInfoKHX.SWAPCHAIN, value); }
    /** Unsafe version of {@link #timeout(long) timeout}. */
    public static void ntimeout(long struct, long value) { memPutLong(struct + VkAcquireNextImageInfoKHX.TIMEOUT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { memPutLong(struct + VkAcquireNextImageInfoKHX.SEMAPHORE, value); }
    /** Unsafe version of {@link #fence(long) fence}. */
    public static void nfence(long struct, long value) { memPutLong(struct + VkAcquireNextImageInfoKHX.FENCE, value); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { memPutInt(struct + VkAcquireNextImageInfoKHX.DEVICEMASK, value); }

    // -----------------------------------

    /** An array of {@link VkAcquireNextImageInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkAcquireNextImageInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkAcquireNextImageInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAcquireNextImageInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkAcquireNextImageInfoKHX newInstance(long address) {
            return new VkAcquireNextImageInfoKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkAcquireNextImageInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkAcquireNextImageInfoKHX.npNext(address()); }
        /** Returns the value of the {@code swapchain} field. */
        public long swapchain() { return VkAcquireNextImageInfoKHX.nswapchain(address()); }
        /** Returns the value of the {@code timeout} field. */
        public long timeout() { return VkAcquireNextImageInfoKHX.ntimeout(address()); }
        /** Returns the value of the {@code semaphore} field. */
        public long semaphore() { return VkAcquireNextImageInfoKHX.nsemaphore(address()); }
        /** Returns the value of the {@code fence} field. */
        public long fence() { return VkAcquireNextImageInfoKHX.nfence(address()); }
        /** Returns the value of the {@code deviceMask} field. */
        public int deviceMask() { return VkAcquireNextImageInfoKHX.ndeviceMask(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAcquireNextImageInfoKHX.Buffer sType(int value) { VkAcquireNextImageInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAcquireNextImageInfoKHX.Buffer pNext(long value) { VkAcquireNextImageInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchain} field. */
        public VkAcquireNextImageInfoKHX.Buffer swapchain(long value) { VkAcquireNextImageInfoKHX.nswapchain(address(), value); return this; }
        /** Sets the specified value to the {@code timeout} field. */
        public VkAcquireNextImageInfoKHX.Buffer timeout(long value) { VkAcquireNextImageInfoKHX.ntimeout(address(), value); return this; }
        /** Sets the specified value to the {@code semaphore} field. */
        public VkAcquireNextImageInfoKHX.Buffer semaphore(long value) { VkAcquireNextImageInfoKHX.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code fence} field. */
        public VkAcquireNextImageInfoKHX.Buffer fence(long value) { VkAcquireNextImageInfoKHX.nfence(address(), value); return this; }
        /** Sets the specified value to the {@code deviceMask} field. */
        public VkAcquireNextImageInfoKHX.Buffer deviceMask(int value) { VkAcquireNextImageInfoKHX.ndeviceMask(address(), value); return this; }

    }

}