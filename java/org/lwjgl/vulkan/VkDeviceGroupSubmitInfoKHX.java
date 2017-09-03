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

/**
 * Structure indicating which physical devices execute semaphore operations and command buffers.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, semaphore operations and command buffers execute on device index zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code waitSemaphoreCount} <b>must</b> equal {@link VkSubmitInfo}{@code ::waitSemaphoreCount}</li>
 * <li>{@code commandBufferCount} <b>must</b> equal {@link VkSubmitInfo}{@code ::commandBufferCount}</li>
 * <li>{@code signalSemaphoreCount} <b>must</b> equal {@link VkSubmitInfo}{@code ::signalSemaphoreCount}</li>
 * <li>All elements of {@code pWaitSemaphoreDeviceIndices} and {@code pSignalSemaphoreDeviceIndices} <b>must</b> be valid device indices</li>
 * <li>All elements of {@code pCommandBufferDeviceMasks} <b>must</b> be valid device masks</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHX}</li>
 * <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphoreDeviceIndices} <b>must</b> be a pointer to an array of {@code waitSemaphoreCount} {@code uint32_t} values</li>
 * <li>If {@code commandBufferCount} is not 0, {@code pCommandBufferDeviceMasks} <b>must</b> be a pointer to an array of {@code commandBufferCount} {@code uint32_t} values</li>
 * <li>If {@code signalSemaphoreCount} is not 0, {@code pSignalSemaphoreDeviceIndices} <b>must</b> be a pointer to an array of {@code signalSemaphoreCount} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code waitSemaphoreCount} &ndash; the number of elements in the {@code pWaitSemaphoreDeviceIndices} array.</li>
 * <li>{@code pWaitSemaphoreDeviceIndices} &ndash; an array of device indices indicating which physical device executes the semaphore wait operation in the corresponding element of {@link VkSubmitInfo}{@code ::pWaitSemaphores}.</li>
 * <li>{@code commandBufferCount} &ndash; the number of elements in the {@code pCommandBufferDeviceMasks} array.</li>
 * <li>{@code pCommandBufferDeviceMasks} &ndash; an array of device masks indicating which physical devices execute the command buffer in the corresponding element of {@link VkSubmitInfo}{@code ::pCommandBuffers}. A physical device executes the command buffer if the corresponding bit is set in the mask.</li>
 * <li>{@code signalSemaphoreCount} &ndash; the number of elements in the {@code pSignalSemaphoreDeviceIndices} array.</li>
 * <li>{@code pSignalSemaphoreDeviceIndices} &ndash; an array of device indices indicating which physical device executes the semaphore signal operation in the corresponding element of {@link VkSubmitInfo}{@code ::pSignalSemaphores}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDeviceGroupSubmitInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t waitSemaphoreCount;
 *     const uint32_t * pWaitSemaphoreDeviceIndices;
 *     uint32_t commandBufferCount;
 *     const uint32_t * pCommandBufferDeviceMasks;
 *     uint32_t signalSemaphoreCount;
 *     const uint32_t * pSignalSemaphoreDeviceIndices;
 * }</pre></code>
 */
public class VkDeviceGroupSubmitInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WAITSEMAPHORECOUNT,
        PWAITSEMAPHOREDEVICEINDICES,
        COMMANDBUFFERCOUNT,
        PCOMMANDBUFFERDEVICEMASKS,
        SIGNALSEMAPHORECOUNT,
        PSIGNALSEMAPHOREDEVICEINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHORECOUNT = layout.offsetof(2);
        PWAITSEMAPHOREDEVICEINDICES = layout.offsetof(3);
        COMMANDBUFFERCOUNT = layout.offsetof(4);
        PCOMMANDBUFFERDEVICEMASKS = layout.offsetof(5);
        SIGNALSEMAPHORECOUNT = layout.offsetof(6);
        PSIGNALSEMAPHOREDEVICEINDICES = layout.offsetof(7);
    }

    VkDeviceGroupSubmitInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDeviceGroupSubmitInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupSubmitInfoKHX(ByteBuffer container) {
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
    /** Returns the value of the {@code waitSemaphoreCount} field. */
    @NativeType("uint32_t")
    public int waitSemaphoreCount() { return nwaitSemaphoreCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pWaitSemaphoreDeviceIndices} field. */
    @NativeType("const uint32_t *")
    public IntBuffer pWaitSemaphoreDeviceIndices() { return npWaitSemaphoreDeviceIndices(address()); }
    /** Returns the value of the {@code commandBufferCount} field. */
    @NativeType("uint32_t")
    public int commandBufferCount() { return ncommandBufferCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pCommandBufferDeviceMasks} field. */
    @NativeType("const uint32_t *")
    public IntBuffer pCommandBufferDeviceMasks() { return npCommandBufferDeviceMasks(address()); }
    /** Returns the value of the {@code signalSemaphoreCount} field. */
    @NativeType("uint32_t")
    public int signalSemaphoreCount() { return nsignalSemaphoreCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pSignalSemaphoreDeviceIndices} field. */
    @NativeType("const uint32_t *")
    public IntBuffer pSignalSemaphoreDeviceIndices() { return npSignalSemaphoreDeviceIndices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGroupSubmitInfoKHX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGroupSubmitInfoKHX pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pWaitSemaphoreDeviceIndices} field. */
    public VkDeviceGroupSubmitInfoKHX pWaitSemaphoreDeviceIndices(@NativeType("const uint32_t *") IntBuffer value) { npWaitSemaphoreDeviceIndices(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCommandBufferDeviceMasks} field. */
    public VkDeviceGroupSubmitInfoKHX pCommandBufferDeviceMasks(@NativeType("const uint32_t *") IntBuffer value) { npCommandBufferDeviceMasks(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pSignalSemaphoreDeviceIndices} field. */
    public VkDeviceGroupSubmitInfoKHX pSignalSemaphoreDeviceIndices(@NativeType("const uint32_t *") IntBuffer value) { npSignalSemaphoreDeviceIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupSubmitInfoKHX set(
        int sType,
        long pNext,
        IntBuffer pWaitSemaphoreDeviceIndices,
        IntBuffer pCommandBufferDeviceMasks,
        IntBuffer pSignalSemaphoreDeviceIndices
    ) {
        sType(sType);
        pNext(pNext);
        pWaitSemaphoreDeviceIndices(pWaitSemaphoreDeviceIndices);
        pCommandBufferDeviceMasks(pCommandBufferDeviceMasks);
        pSignalSemaphoreDeviceIndices(pSignalSemaphoreDeviceIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupSubmitInfoKHX set(VkDeviceGroupSubmitInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupSubmitInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupSubmitInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupSubmitInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupSubmitInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupSubmitInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupSubmitInfoKHX create() {
        return new VkDeviceGroupSubmitInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupSubmitInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkDeviceGroupSubmitInfoKHX create(long address) {
        return address == NULL ? null : new VkDeviceGroupSubmitInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDeviceGroupSubmitInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupSubmitInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceGroupSubmitInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDeviceGroupSubmitInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceGroupSubmitInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupSubmitInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupSubmitInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupSubmitInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupSubmitInfoKHX.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreCount}. */
    public static int nwaitSemaphoreCount(long struct) { return memGetInt(struct + VkDeviceGroupSubmitInfoKHX.WAITSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphoreDeviceIndices() pWaitSemaphoreDeviceIndices}. */
    public static IntBuffer npWaitSemaphoreDeviceIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkDeviceGroupSubmitInfoKHX.PWAITSEMAPHOREDEVICEINDICES), nwaitSemaphoreCount(struct)); }
    /** Unsafe version of {@link #commandBufferCount}. */
    public static int ncommandBufferCount(long struct) { return memGetInt(struct + VkDeviceGroupSubmitInfoKHX.COMMANDBUFFERCOUNT); }
    /** Unsafe version of {@link #pCommandBufferDeviceMasks() pCommandBufferDeviceMasks}. */
    public static IntBuffer npCommandBufferDeviceMasks(long struct) { return memIntBuffer(memGetAddress(struct + VkDeviceGroupSubmitInfoKHX.PCOMMANDBUFFERDEVICEMASKS), ncommandBufferCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreCount}. */
    public static int nsignalSemaphoreCount(long struct) { return memGetInt(struct + VkDeviceGroupSubmitInfoKHX.SIGNALSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pSignalSemaphoreDeviceIndices() pSignalSemaphoreDeviceIndices}. */
    public static IntBuffer npSignalSemaphoreDeviceIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkDeviceGroupSubmitInfoKHX.PSIGNALSEMAPHOREDEVICEINDICES), nsignalSemaphoreCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGroupSubmitInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupSubmitInfoKHX.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreCount(long struct, int value) { memPutInt(struct + VkDeviceGroupSubmitInfoKHX.WAITSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphoreDeviceIndices(IntBuffer) pWaitSemaphoreDeviceIndices}. */
    public static void npWaitSemaphoreDeviceIndices(long struct, IntBuffer value) { memPutAddress(struct + VkDeviceGroupSubmitInfoKHX.PWAITSEMAPHOREDEVICEINDICES, memAddressSafe(value)); nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code commandBufferCount} field of the specified {@code struct}. */
    public static void ncommandBufferCount(long struct, int value) { memPutInt(struct + VkDeviceGroupSubmitInfoKHX.COMMANDBUFFERCOUNT, value); }
    /** Unsafe version of {@link #pCommandBufferDeviceMasks(IntBuffer) pCommandBufferDeviceMasks}. */
    public static void npCommandBufferDeviceMasks(long struct, IntBuffer value) { memPutAddress(struct + VkDeviceGroupSubmitInfoKHX.PCOMMANDBUFFERDEVICEMASKS, memAddressSafe(value)); ncommandBufferCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code signalSemaphoreCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreCount(long struct, int value) { memPutInt(struct + VkDeviceGroupSubmitInfoKHX.SIGNALSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphoreDeviceIndices(IntBuffer) pSignalSemaphoreDeviceIndices}. */
    public static void npSignalSemaphoreDeviceIndices(long struct, IntBuffer value) { memPutAddress(struct + VkDeviceGroupSubmitInfoKHX.PSIGNALSEMAPHOREDEVICEINDICES, memAddressSafe(value)); nsignalSemaphoreCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nwaitSemaphoreCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupSubmitInfoKHX.PWAITSEMAPHOREDEVICEINDICES));
        }
        if (ncommandBufferCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupSubmitInfoKHX.PCOMMANDBUFFERDEVICEMASKS));
        }
        if (nsignalSemaphoreCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupSubmitInfoKHX.PSIGNALSEMAPHOREDEVICEINDICES));
        }
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

    /** An array of {@link VkDeviceGroupSubmitInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupSubmitInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDeviceGroupSubmitInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupSubmitInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupSubmitInfoKHX newInstance(long address) {
            return new VkDeviceGroupSubmitInfoKHX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupSubmitInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkDeviceGroupSubmitInfoKHX.npNext(address()); }
        /** Returns the value of the {@code waitSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreCount() { return VkDeviceGroupSubmitInfoKHX.nwaitSemaphoreCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pWaitSemaphoreDeviceIndices} field. */
        @NativeType("const uint32_t *")
        public IntBuffer pWaitSemaphoreDeviceIndices() { return VkDeviceGroupSubmitInfoKHX.npWaitSemaphoreDeviceIndices(address()); }
        /** Returns the value of the {@code commandBufferCount} field. */
        @NativeType("uint32_t")
        public int commandBufferCount() { return VkDeviceGroupSubmitInfoKHX.ncommandBufferCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pCommandBufferDeviceMasks} field. */
        @NativeType("const uint32_t *")
        public IntBuffer pCommandBufferDeviceMasks() { return VkDeviceGroupSubmitInfoKHX.npCommandBufferDeviceMasks(address()); }
        /** Returns the value of the {@code signalSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreCount() { return VkDeviceGroupSubmitInfoKHX.nsignalSemaphoreCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pSignalSemaphoreDeviceIndices} field. */
        @NativeType("const uint32_t *")
        public IntBuffer pSignalSemaphoreDeviceIndices() { return VkDeviceGroupSubmitInfoKHX.npSignalSemaphoreDeviceIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGroupSubmitInfoKHX.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupSubmitInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGroupSubmitInfoKHX.Buffer pNext(@NativeType("const void *") long value) { VkDeviceGroupSubmitInfoKHX.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pWaitSemaphoreDeviceIndices} field. */
        public VkDeviceGroupSubmitInfoKHX.Buffer pWaitSemaphoreDeviceIndices(@NativeType("const uint32_t *") IntBuffer value) { VkDeviceGroupSubmitInfoKHX.npWaitSemaphoreDeviceIndices(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCommandBufferDeviceMasks} field. */
        public VkDeviceGroupSubmitInfoKHX.Buffer pCommandBufferDeviceMasks(@NativeType("const uint32_t *") IntBuffer value) { VkDeviceGroupSubmitInfoKHX.npCommandBufferDeviceMasks(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pSignalSemaphoreDeviceIndices} field. */
        public VkDeviceGroupSubmitInfoKHX.Buffer pSignalSemaphoreDeviceIndices(@NativeType("const uint32_t *") IntBuffer value) { VkDeviceGroupSubmitInfoKHX.npSignalSemaphoreDeviceIndices(address(), value); return this; }

    }

}