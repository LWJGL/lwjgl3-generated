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
 * Structure specifying device within a group to bind to.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link VkBindBufferMemoryDeviceGroupInfoKHX} structure is defined as:</p>
 * 
 * <ul>
 * <li>{@code sType} is the type of this structure.</li>
 * <li>{@code pNext} is {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code deviceIndexCount} is the number of elements in {@code pDeviceIndices}.</li>
 * <li>{@code pDeviceIndices} is a pointer to an array of device indices.</li>
 * </ul>
 * 
 * <p>If {@code deviceIndexCount} is greater than zero, then on device index <code>i</code> the buffer is attached to the instance of {@code memory} on the physical device with device index <code>pDeviceIndices[i]</code>.</p>
 * 
 * <p>If {@code deviceIndexCount} is zero and {@code memory} comes from a memory heap with the {@link KHXDeviceGroupCreation#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX} bit set, then it is as if {@code pDeviceIndices} contains consecutive indices from zero to the number of physical devices in the logical device, minus one. In other words, by default each physical device attaches to its own instance of {@code memory}.</p>
 * 
 * <p>If {@code deviceIndexCount} is zero and {@code memory} comes from a memory heap without the {@link KHXDeviceGroupCreation#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX} bit set, then it is as if {@code pDeviceIndices} contains an array of zeros. In other words, by default each physical device attaches to instance zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code deviceIndexCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device</li>
 * <li>All elements of {@code pDeviceIndices} <b>must</b> be valid device indices</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHX STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code deviceIndexCount} is not 0, {@code pDeviceIndices} <b>must</b> be a valid pointer to an array of {@code deviceIndexCount} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkBindBufferMemoryDeviceGroupInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t deviceIndexCount;
 *     const uint32_t * pDeviceIndices;
 * }</pre></code>
 */
public class VkBindBufferMemoryDeviceGroupInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEINDEXCOUNT,
        PDEVICEINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEINDEXCOUNT = layout.offsetof(2);
        PDEVICEINDICES = layout.offsetof(3);
    }

    VkBindBufferMemoryDeviceGroupInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkBindBufferMemoryDeviceGroupInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindBufferMemoryDeviceGroupInfoKHX(ByteBuffer container) {
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
    /** Returns the value of the {@code deviceIndexCount} field. */
    @NativeType("uint32_t")
    public int deviceIndexCount() { return ndeviceIndexCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
    @NativeType("const uint32_t *")
    public IntBuffer pDeviceIndices() { return npDeviceIndices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindBufferMemoryDeviceGroupInfoKHX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindBufferMemoryDeviceGroupInfoKHX pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    public VkBindBufferMemoryDeviceGroupInfoKHX pDeviceIndices(@NativeType("const uint32_t *") IntBuffer value) { npDeviceIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindBufferMemoryDeviceGroupInfoKHX set(
        int sType,
        long pNext,
        IntBuffer pDeviceIndices
    ) {
        sType(sType);
        pNext(pNext);
        pDeviceIndices(pDeviceIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindBufferMemoryDeviceGroupInfoKHX set(VkBindBufferMemoryDeviceGroupInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryDeviceGroupInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryDeviceGroupInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkBindBufferMemoryDeviceGroupInfoKHX create() {
        return new VkBindBufferMemoryDeviceGroupInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkBindBufferMemoryDeviceGroupInfoKHX create(long address) {
        return address == NULL ? null : new VkBindBufferMemoryDeviceGroupInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkBindBufferMemoryDeviceGroupInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindBufferMemoryDeviceGroupInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindBufferMemoryDeviceGroupInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindBufferMemoryDeviceGroupInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindBufferMemoryDeviceGroupInfoKHX.PNEXT); }
    /** Unsafe version of {@link #deviceIndexCount}. */
    public static int ndeviceIndexCount(long struct) { return memGetInt(struct + VkBindBufferMemoryDeviceGroupInfoKHX.DEVICEINDEXCOUNT); }
    /** Unsafe version of {@link #pDeviceIndices() pDeviceIndices}. */
    public static IntBuffer npDeviceIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkBindBufferMemoryDeviceGroupInfoKHX.PDEVICEINDICES), ndeviceIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindBufferMemoryDeviceGroupInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindBufferMemoryDeviceGroupInfoKHX.PNEXT, value); }
    /** Sets the specified value to the {@code deviceIndexCount} field of the specified {@code struct}. */
    public static void ndeviceIndexCount(long struct, int value) { memPutInt(struct + VkBindBufferMemoryDeviceGroupInfoKHX.DEVICEINDEXCOUNT, value); }
    /** Unsafe version of {@link #pDeviceIndices(IntBuffer) pDeviceIndices}. */
    public static void npDeviceIndices(long struct, IntBuffer value) { memPutAddress(struct + VkBindBufferMemoryDeviceGroupInfoKHX.PDEVICEINDICES, memAddressSafe(value)); ndeviceIndexCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndeviceIndexCount(struct) != 0) {
            check(memGetAddress(struct + VkBindBufferMemoryDeviceGroupInfoKHX.PDEVICEINDICES));
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

    /** An array of {@link VkBindBufferMemoryDeviceGroupInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkBindBufferMemoryDeviceGroupInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkBindBufferMemoryDeviceGroupInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindBufferMemoryDeviceGroupInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkBindBufferMemoryDeviceGroupInfoKHX newInstance(long address) {
            return new VkBindBufferMemoryDeviceGroupInfoKHX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindBufferMemoryDeviceGroupInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkBindBufferMemoryDeviceGroupInfoKHX.npNext(address()); }
        /** Returns the value of the {@code deviceIndexCount} field. */
        @NativeType("uint32_t")
        public int deviceIndexCount() { return VkBindBufferMemoryDeviceGroupInfoKHX.ndeviceIndexCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
        @NativeType("const uint32_t *")
        public IntBuffer pDeviceIndices() { return VkBindBufferMemoryDeviceGroupInfoKHX.npDeviceIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindBufferMemoryDeviceGroupInfoKHX.Buffer sType(@NativeType("VkStructureType") int value) { VkBindBufferMemoryDeviceGroupInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindBufferMemoryDeviceGroupInfoKHX.Buffer pNext(@NativeType("const void *") long value) { VkBindBufferMemoryDeviceGroupInfoKHX.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        public VkBindBufferMemoryDeviceGroupInfoKHX.Buffer pDeviceIndices(@NativeType("const uint32_t *") IntBuffer value) { VkBindBufferMemoryDeviceGroupInfoKHX.npDeviceIndices(address(), value); return this; }

    }

}