/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Data required for passing Vulkan textures to {@link VRCompositor#VRCompositor_Submit Submit}. Be sure to call {@link VR#VR_ShutdownInternal ShutdownInternal} before destroying these resources.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code m_nImage} &ndash; VkImage</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VRVulkanTextureData_t {
 *     uint64_t m_nImage;
 *     VkDevice_T * m_pDevice;
 *     VkPhysicalDevice_T * m_pPhysicalDevice;
 *     VkInstance_T * m_pInstance;
 *     VkQueue_T * m_pQueue;
 *     uint32_t m_nQueueFamilyIndex;
 *     uint32_t m_nWidth;
 *     uint32_t m_nHeight;
 *     uint32_t m_nFormat;
 *     uint32_t m_nSampleCount;
 * }</pre></code>
 */
public class VRVulkanTextureData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NIMAGE,
        M_PDEVICE,
        M_PPHYSICALDEVICE,
        M_PINSTANCE,
        M_PQUEUE,
        M_NQUEUEFAMILYINDEX,
        M_NWIDTH,
        M_NHEIGHT,
        M_NFORMAT,
        M_NSAMPLECOUNT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NIMAGE = layout.offsetof(0);
        M_PDEVICE = layout.offsetof(1);
        M_PPHYSICALDEVICE = layout.offsetof(2);
        M_PINSTANCE = layout.offsetof(3);
        M_PQUEUE = layout.offsetof(4);
        M_NQUEUEFAMILYINDEX = layout.offsetof(5);
        M_NWIDTH = layout.offsetof(6);
        M_NHEIGHT = layout.offsetof(7);
        M_NFORMAT = layout.offsetof(8);
        M_NSAMPLECOUNT = layout.offsetof(9);
    }

    VRVulkanTextureData(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VRVulkanTextureData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRVulkanTextureData(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_nImage} field. */
    public long m_nImage() { return nm_nImage(address()); }
    /**
     * Returns a {@link PointerBuffer} view of the data pointed to by the {@code m_pDevice} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    public PointerBuffer m_pDevice(int capacity) { return nm_pDevice(address(), capacity); }
    /**
     * Returns a {@link PointerBuffer} view of the data pointed to by the {@code m_pPhysicalDevice} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    public PointerBuffer m_pPhysicalDevice(int capacity) { return nm_pPhysicalDevice(address(), capacity); }
    /**
     * Returns a {@link PointerBuffer} view of the data pointed to by the {@code m_pInstance} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    public PointerBuffer m_pInstance(int capacity) { return nm_pInstance(address(), capacity); }
    /**
     * Returns a {@link PointerBuffer} view of the data pointed to by the {@code m_pQueue} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    public PointerBuffer m_pQueue(int capacity) { return nm_pQueue(address(), capacity); }
    /** Returns the value of the {@code m_nQueueFamilyIndex} field. */
    public int m_nQueueFamilyIndex() { return nm_nQueueFamilyIndex(address()); }
    /** Returns the value of the {@code m_nWidth} field. */
    public int m_nWidth() { return nm_nWidth(address()); }
    /** Returns the value of the {@code m_nHeight} field. */
    public int m_nHeight() { return nm_nHeight(address()); }
    /** Returns the value of the {@code m_nFormat} field. */
    public int m_nFormat() { return nm_nFormat(address()); }
    /** Returns the value of the {@code m_nSampleCount} field. */
    public int m_nSampleCount() { return nm_nSampleCount(address()); }

    /** Sets the specified value to the {@code m_nImage} field. */
    public VRVulkanTextureData m_nImage(long value) { nm_nImage(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code m_pDevice} field. */
    public VRVulkanTextureData m_pDevice(PointerBuffer value) { nm_pDevice(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code m_pPhysicalDevice} field. */
    public VRVulkanTextureData m_pPhysicalDevice(PointerBuffer value) { nm_pPhysicalDevice(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code m_pInstance} field. */
    public VRVulkanTextureData m_pInstance(PointerBuffer value) { nm_pInstance(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code m_pQueue} field. */
    public VRVulkanTextureData m_pQueue(PointerBuffer value) { nm_pQueue(address(), value); return this; }
    /** Sets the specified value to the {@code m_nQueueFamilyIndex} field. */
    public VRVulkanTextureData m_nQueueFamilyIndex(int value) { nm_nQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_nWidth} field. */
    public VRVulkanTextureData m_nWidth(int value) { nm_nWidth(address(), value); return this; }
    /** Sets the specified value to the {@code m_nHeight} field. */
    public VRVulkanTextureData m_nHeight(int value) { nm_nHeight(address(), value); return this; }
    /** Sets the specified value to the {@code m_nFormat} field. */
    public VRVulkanTextureData m_nFormat(int value) { nm_nFormat(address(), value); return this; }
    /** Sets the specified value to the {@code m_nSampleCount} field. */
    public VRVulkanTextureData m_nSampleCount(int value) { nm_nSampleCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VRVulkanTextureData set(
        long m_nImage,
        PointerBuffer m_pDevice,
        PointerBuffer m_pPhysicalDevice,
        PointerBuffer m_pInstance,
        PointerBuffer m_pQueue,
        int m_nQueueFamilyIndex,
        int m_nWidth,
        int m_nHeight,
        int m_nFormat,
        int m_nSampleCount
    ) {
        m_nImage(m_nImage);
        m_pDevice(m_pDevice);
        m_pPhysicalDevice(m_pPhysicalDevice);
        m_pInstance(m_pInstance);
        m_pQueue(m_pQueue);
        m_nQueueFamilyIndex(m_nQueueFamilyIndex);
        m_nWidth(m_nWidth);
        m_nHeight(m_nHeight);
        m_nFormat(m_nFormat);
        m_nSampleCount(m_nSampleCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRVulkanTextureData set(VRVulkanTextureData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VRVulkanTextureData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRVulkanTextureData malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VRVulkanTextureData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRVulkanTextureData calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VRVulkanTextureData} instance allocated with {@link BufferUtils}. */
    public static VRVulkanTextureData create() {
        return new VRVulkanTextureData(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VRVulkanTextureData} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VRVulkanTextureData create(long address) {
        return address == NULL ? null : new VRVulkanTextureData(address, null);
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VRVulkanTextureData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VRVulkanTextureData} instance allocated on the thread-local {@link MemoryStack}. */
    public static VRVulkanTextureData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VRVulkanTextureData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VRVulkanTextureData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VRVulkanTextureData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRVulkanTextureData mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VRVulkanTextureData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRVulkanTextureData callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_nImage}. */
    public static long nm_nImage(long struct) { return memGetLong(struct + VRVulkanTextureData.M_NIMAGE); }
    /** Unsafe version of {@link #m_pDevice(int) m_pDevice}. */
    public static PointerBuffer nm_pDevice(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + VRVulkanTextureData.M_PDEVICE), capacity); }
    /** Unsafe version of {@link #m_pPhysicalDevice(int) m_pPhysicalDevice}. */
    public static PointerBuffer nm_pPhysicalDevice(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + VRVulkanTextureData.M_PPHYSICALDEVICE), capacity); }
    /** Unsafe version of {@link #m_pInstance(int) m_pInstance}. */
    public static PointerBuffer nm_pInstance(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + VRVulkanTextureData.M_PINSTANCE), capacity); }
    /** Unsafe version of {@link #m_pQueue(int) m_pQueue}. */
    public static PointerBuffer nm_pQueue(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + VRVulkanTextureData.M_PQUEUE), capacity); }
    /** Unsafe version of {@link #m_nQueueFamilyIndex}. */
    public static int nm_nQueueFamilyIndex(long struct) { return memGetInt(struct + VRVulkanTextureData.M_NQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #m_nWidth}. */
    public static int nm_nWidth(long struct) { return memGetInt(struct + VRVulkanTextureData.M_NWIDTH); }
    /** Unsafe version of {@link #m_nHeight}. */
    public static int nm_nHeight(long struct) { return memGetInt(struct + VRVulkanTextureData.M_NHEIGHT); }
    /** Unsafe version of {@link #m_nFormat}. */
    public static int nm_nFormat(long struct) { return memGetInt(struct + VRVulkanTextureData.M_NFORMAT); }
    /** Unsafe version of {@link #m_nSampleCount}. */
    public static int nm_nSampleCount(long struct) { return memGetInt(struct + VRVulkanTextureData.M_NSAMPLECOUNT); }

    /** Unsafe version of {@link #m_nImage(long) m_nImage}. */
    public static void nm_nImage(long struct, long value) { memPutLong(struct + VRVulkanTextureData.M_NIMAGE, value); }
    /** Unsafe version of {@link #m_pDevice(PointerBuffer) m_pDevice}. */
    public static void nm_pDevice(long struct, PointerBuffer value) { memPutAddress(struct + VRVulkanTextureData.M_PDEVICE, memAddress(value)); }
    /** Unsafe version of {@link #m_pPhysicalDevice(PointerBuffer) m_pPhysicalDevice}. */
    public static void nm_pPhysicalDevice(long struct, PointerBuffer value) { memPutAddress(struct + VRVulkanTextureData.M_PPHYSICALDEVICE, memAddress(value)); }
    /** Unsafe version of {@link #m_pInstance(PointerBuffer) m_pInstance}. */
    public static void nm_pInstance(long struct, PointerBuffer value) { memPutAddress(struct + VRVulkanTextureData.M_PINSTANCE, memAddress(value)); }
    /** Unsafe version of {@link #m_pQueue(PointerBuffer) m_pQueue}. */
    public static void nm_pQueue(long struct, PointerBuffer value) { memPutAddress(struct + VRVulkanTextureData.M_PQUEUE, memAddress(value)); }
    /** Unsafe version of {@link #m_nQueueFamilyIndex(int) m_nQueueFamilyIndex}. */
    public static void nm_nQueueFamilyIndex(long struct, int value) { memPutInt(struct + VRVulkanTextureData.M_NQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #m_nWidth(int) m_nWidth}. */
    public static void nm_nWidth(long struct, int value) { memPutInt(struct + VRVulkanTextureData.M_NWIDTH, value); }
    /** Unsafe version of {@link #m_nHeight(int) m_nHeight}. */
    public static void nm_nHeight(long struct, int value) { memPutInt(struct + VRVulkanTextureData.M_NHEIGHT, value); }
    /** Unsafe version of {@link #m_nFormat(int) m_nFormat}. */
    public static void nm_nFormat(long struct, int value) { memPutInt(struct + VRVulkanTextureData.M_NFORMAT, value); }
    /** Unsafe version of {@link #m_nSampleCount(int) m_nSampleCount}. */
    public static void nm_nSampleCount(long struct, int value) { memPutInt(struct + VRVulkanTextureData.M_NSAMPLECOUNT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VRVulkanTextureData.M_PDEVICE));
        check(memGetAddress(struct + VRVulkanTextureData.M_PPHYSICALDEVICE));
        check(memGetAddress(struct + VRVulkanTextureData.M_PINSTANCE));
        check(memGetAddress(struct + VRVulkanTextureData.M_PQUEUE));
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

    /** An array of {@link VRVulkanTextureData} structs. */
    public static class Buffer extends StructBuffer<VRVulkanTextureData, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VRVulkanTextureData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRVulkanTextureData#SIZEOF}, and its mark will be undefined.
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
        protected VRVulkanTextureData newInstance(long address) {
            return new VRVulkanTextureData(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code m_nImage} field. */
        public long m_nImage() { return VRVulkanTextureData.nm_nImage(address()); }
        /**
         * Returns a {@link PointerBuffer} view of the data pointed to by the {@code m_pDevice} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        public PointerBuffer m_pDevice(int capacity) { return VRVulkanTextureData.nm_pDevice(address(), capacity); }
        /**
         * Returns a {@link PointerBuffer} view of the data pointed to by the {@code m_pPhysicalDevice} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        public PointerBuffer m_pPhysicalDevice(int capacity) { return VRVulkanTextureData.nm_pPhysicalDevice(address(), capacity); }
        /**
         * Returns a {@link PointerBuffer} view of the data pointed to by the {@code m_pInstance} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        public PointerBuffer m_pInstance(int capacity) { return VRVulkanTextureData.nm_pInstance(address(), capacity); }
        /**
         * Returns a {@link PointerBuffer} view of the data pointed to by the {@code m_pQueue} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        public PointerBuffer m_pQueue(int capacity) { return VRVulkanTextureData.nm_pQueue(address(), capacity); }
        /** Returns the value of the {@code m_nQueueFamilyIndex} field. */
        public int m_nQueueFamilyIndex() { return VRVulkanTextureData.nm_nQueueFamilyIndex(address()); }
        /** Returns the value of the {@code m_nWidth} field. */
        public int m_nWidth() { return VRVulkanTextureData.nm_nWidth(address()); }
        /** Returns the value of the {@code m_nHeight} field. */
        public int m_nHeight() { return VRVulkanTextureData.nm_nHeight(address()); }
        /** Returns the value of the {@code m_nFormat} field. */
        public int m_nFormat() { return VRVulkanTextureData.nm_nFormat(address()); }
        /** Returns the value of the {@code m_nSampleCount} field. */
        public int m_nSampleCount() { return VRVulkanTextureData.nm_nSampleCount(address()); }

        /** Sets the specified value to the {@code m_nImage} field. */
        public VRVulkanTextureData.Buffer m_nImage(long value) { VRVulkanTextureData.nm_nImage(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code m_pDevice} field. */
        public VRVulkanTextureData.Buffer m_pDevice(PointerBuffer value) { VRVulkanTextureData.nm_pDevice(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code m_pPhysicalDevice} field. */
        public VRVulkanTextureData.Buffer m_pPhysicalDevice(PointerBuffer value) { VRVulkanTextureData.nm_pPhysicalDevice(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code m_pInstance} field. */
        public VRVulkanTextureData.Buffer m_pInstance(PointerBuffer value) { VRVulkanTextureData.nm_pInstance(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code m_pQueue} field. */
        public VRVulkanTextureData.Buffer m_pQueue(PointerBuffer value) { VRVulkanTextureData.nm_pQueue(address(), value); return this; }
        /** Sets the specified value to the {@code m_nQueueFamilyIndex} field. */
        public VRVulkanTextureData.Buffer m_nQueueFamilyIndex(int value) { VRVulkanTextureData.nm_nQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_nWidth} field. */
        public VRVulkanTextureData.Buffer m_nWidth(int value) { VRVulkanTextureData.nm_nWidth(address(), value); return this; }
        /** Sets the specified value to the {@code m_nHeight} field. */
        public VRVulkanTextureData.Buffer m_nHeight(int value) { VRVulkanTextureData.nm_nHeight(address(), value); return this; }
        /** Sets the specified value to the {@code m_nFormat} field. */
        public VRVulkanTextureData.Buffer m_nFormat(int value) { VRVulkanTextureData.nm_nFormat(address(), value); return this; }
        /** Sets the specified value to the {@code m_nSampleCount} field. */
        public VRVulkanTextureData.Buffer m_nSampleCount(int value) { VRVulkanTextureData.nm_nSampleCount(address(), value); return this; }

    }

}