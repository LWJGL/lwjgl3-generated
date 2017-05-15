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
 * Structure specifying semaphore creation parameters.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Applications <b>must</b> not perform operations on handles of type {@link KHXExternalSemaphoreCapabilities#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHX EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHX} that are specific to only one of Linux Fences or Android Fences. Implementations are free to return either type of file descriptor using this handle type. While most userspace functions accepting a fence FD are compatible with either type of fence, attempting to use the file descriptors directly with system calls compatible with only one of the fence types <b>may</b> result in undefined behavior.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXExternalSemaphoreCapabilities#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHX STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHXExternalSemaphoreCapabilities#vkGetPhysicalDeviceExternalSemaphorePropertiesKHX GetPhysicalDeviceExternalSemaphorePropertiesKHX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure</li>
 * <li>{@code pNext} &ndash; NULL or a pointer to an extension-specific structure.</li>
 * <li>{@code handleType} &ndash; a bit indicating an external semaphore handle type for which capabilities will be returned. Bits which can be set include:
 * 
 * <code><pre>
 * typedef enum VkExternalSemaphoreHandleTypeFlagBitsKHX {
 *     VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHX = 0x00000001,
 *     VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX = 0x00000002,
 *     VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX = 0x00000004,
 *     VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHX = 0x00000008,
 *     VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHX = 0x00000010,
 * } VkExternalSemaphoreHandleTypeFlagBitsKHX;</pre></code>
 * 
 * <ul>
 * <li>{@link KHXExternalSemaphoreCapabilities#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHX EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHX} is a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls fname:dup, fname:dup2, fname:close, and the non-standard system call fname:dup3. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying synchronization primitive represented by its Vulkan semaphore object.</li>
 * <li>{@link #EXTERNAL_SEMAPHORE_HANDLE_TYPE_WIN32_BIT_KHX} is an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions fname:DuplicateHandle, fname:CloseHandle, fname:CompareObjectHandles, fname:GetHandleInformation, and fname:SetHandleInformation. It owns a reference to the underlying synchronization primitive represented by its Vulkan semaphore object.</li>
 * <li>{@link KHXExternalSemaphoreCapabilities#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX} is a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own own a reference to the underlying synchronization primitive represented its Vulkan semaphore object, and will therefore become invalid when all Vulkan semaphore objects associated with it are destroyed.</li>
 * <li>{@link KHXExternalSemaphoreCapabilities#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHX EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHX} is an NT handle returned by {@code ID3D12Device}::fname:CreateSharedHandle referring to a Direct3D 12 fence. It owns a reference to the underlying synchronization primitive associated with the Direct3D fence.</li>
 * <li>{@link KHXExternalSemaphoreCapabilities#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHX EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHX} is a POSIX file descriptor handle to a Linux or Android Fence object. It can be used with any native API accepting a valid fence object file descriptor as input. It owns a reference to the underlying synchronization primitive associated with the file descriptor. Implementations which support importing this handle type <b>must</b> accept any type of fence FD supported by the native system they are running on.</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceExternalSemaphoreInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkExternalSemaphoreHandleTypeFlagBitsKHX handleType;
 * }</pre></code>
 */
public class VkPhysicalDeviceExternalSemaphoreInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPE;

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
        HANDLETYPE = layout.offsetof(2);
    }

    VkPhysicalDeviceExternalSemaphoreInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExternalSemaphoreInfoKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code handleType} field. */
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceExternalSemaphoreInfoKHX sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceExternalSemaphoreInfoKHX pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkPhysicalDeviceExternalSemaphoreInfoKHX handleType(int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExternalSemaphoreInfoKHX set(
        int sType,
        long pNext,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExternalSemaphoreInfoKHX set(VkPhysicalDeviceExternalSemaphoreInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalSemaphoreInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalSemaphoreInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExternalSemaphoreInfoKHX create() {
        return new VkPhysicalDeviceExternalSemaphoreInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPhysicalDeviceExternalSemaphoreInfoKHX create(long address) {
        return address == NULL ? null : new VkPhysicalDeviceExternalSemaphoreInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceExternalSemaphoreInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceExternalSemaphoreInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalSemaphoreInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalSemaphoreInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceExternalSemaphoreInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExternalSemaphoreInfoKHX.PNEXT); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkPhysicalDeviceExternalSemaphoreInfoKHX.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExternalSemaphoreInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExternalSemaphoreInfoKHX.PNEXT, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExternalSemaphoreInfoKHX.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExternalSemaphoreInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalSemaphoreInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExternalSemaphoreInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceExternalSemaphoreInfoKHX newInstance(long address) {
            return new VkPhysicalDeviceExternalSemaphoreInfoKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkPhysicalDeviceExternalSemaphoreInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkPhysicalDeviceExternalSemaphoreInfoKHX.npNext(address()); }
        /** Returns the value of the {@code handleType} field. */
        public int handleType() { return VkPhysicalDeviceExternalSemaphoreInfoKHX.nhandleType(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer sType(int value) { VkPhysicalDeviceExternalSemaphoreInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer pNext(long value) { VkPhysicalDeviceExternalSemaphoreInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkPhysicalDeviceExternalSemaphoreInfoKHX.Buffer handleType(int value) { VkPhysicalDeviceExternalSemaphoreInfoKHX.nhandleType(address(), value); return this; }

    }

}