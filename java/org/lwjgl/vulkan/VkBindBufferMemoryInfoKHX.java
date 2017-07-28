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
 * Structure specifying how to bind a buffer to memory.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code deviceIndexCount} is greater than zero, then on device index</p><code>i</code>
 * 
 * <p>the buffer is attached to the instance of memory on the physical device with device index</p><code>pDeviceIndices[i]</code>
 * 
 * <p>.</p>
 * 
 * <p>If {@code deviceIndexCount} is zero and the memory comes from a memory heap with the {@link KHXDeviceGroupCreation#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX} bit set, then it is as if {@code pDeviceIndices} contains consecutive indices from zero to the number of physical devices in the logical device, minus one. In other words, by default each physical device attaches to its own instance of the memory.</p>
 * 
 * <p>If {@code deviceIndexCount} is zero and the memory comes from a memory heap without the {@link KHXDeviceGroupCreation#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX} bit set, then it is as if {@code pDeviceIndices} contains an array of zeros. In other words, by default each physical device attaches to instance zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>All valid usage rules from {@link VK10#vkBindBufferMemory BindBufferMemory} apply to the identically named members of {@link VkBindBufferMemoryInfoKHX}</li>
 * <li>{@code deviceIndexCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device</li>
 * <li>All elements of {@code pDeviceIndices} <b>must</b> be valid device indices</li>
 * <li>All instances of memory that are bound to <b>must</b> have been allocated</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHX STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>If {@code deviceIndexCount} is not 0, {@code pDeviceIndices} <b>must</b> be a pointer to an array of {@code deviceIndexCount} {@code uint32_t} values</li>
 * <li>Both of {@code buffer}, and {@code memory} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHXDeviceGroup#vkBindBufferMemory2KHX BindBufferMemory2KHX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code buffer} &ndash; the buffer to be attached to memory.</li>
 * <li>{@code memory} &ndash; a {@code VkDeviceMemory} object describing the device memory to attach.</li>
 * <li>{@code memoryOffset} &ndash; the start offset of the region of {@code memory} which is to be bound to the buffer. The number of bytes returned in the {@link VkMemoryRequirements}{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified buffer.</li>
 * <li>{@code deviceIndexCount} &ndash; the number of elements in {@code pDeviceIndices}.</li>
 * <li>{@code pDeviceIndices} &ndash; a pointer to an array of device indices.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkBindBufferMemoryInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkBuffer buffer;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     uint32_t deviceIndexCount;
 *     const uint32_t * pDeviceIndices;
 * }</pre></code>
 */
public class VkBindBufferMemoryInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BUFFER,
        MEMORY,
        MEMORYOFFSET,
        DEVICEINDEXCOUNT,
        PDEVICEINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
        DEVICEINDEXCOUNT = layout.offsetof(5);
        PDEVICEINDICES = layout.offsetof(6);
    }

    VkBindBufferMemoryInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkBindBufferMemoryInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindBufferMemoryInfoKHX(ByteBuffer container) {
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
    /** Returns the value of the {@code buffer} field. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** Returns the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** Returns the value of the {@code memoryOffset} field. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }
    /** Returns the value of the {@code deviceIndexCount} field. */
    @NativeType("uint32_t")
    public int deviceIndexCount() { return ndeviceIndexCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
    @NativeType("const uint32_t *")
    public IntBuffer pDeviceIndices() { return npDeviceIndices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindBufferMemoryInfoKHX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindBufferMemoryInfoKHX pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkBindBufferMemoryInfoKHX buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkBindBufferMemoryInfoKHX memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    public VkBindBufferMemoryInfoKHX memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    public VkBindBufferMemoryInfoKHX pDeviceIndices(@NativeType("const uint32_t *") IntBuffer value) { npDeviceIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindBufferMemoryInfoKHX set(
        int sType,
        long pNext,
        long buffer,
        long memory,
        long memoryOffset,
        IntBuffer pDeviceIndices
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        memory(memory);
        memoryOffset(memoryOffset);
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
    public VkBindBufferMemoryInfoKHX set(VkBindBufferMemoryInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkBindBufferMemoryInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkBindBufferMemoryInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkBindBufferMemoryInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkBindBufferMemoryInfoKHX create() {
        return new VkBindBufferMemoryInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkBindBufferMemoryInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkBindBufferMemoryInfoKHX create(long address) {
        return address == NULL ? null : new VkBindBufferMemoryInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkBindBufferMemoryInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkBindBufferMemoryInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindBufferMemoryInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkBindBufferMemoryInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindBufferMemoryInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindBufferMemoryInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindBufferMemoryInfoKHX.PNEXT); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetLong(struct + VkBindBufferMemoryInfoKHX.BUFFER); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkBindBufferMemoryInfoKHX.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return memGetLong(struct + VkBindBufferMemoryInfoKHX.MEMORYOFFSET); }
    /** Unsafe version of {@link #deviceIndexCount}. */
    public static int ndeviceIndexCount(long struct) { return memGetInt(struct + VkBindBufferMemoryInfoKHX.DEVICEINDEXCOUNT); }
    /** Unsafe version of {@link #pDeviceIndices() pDeviceIndices}. */
    public static IntBuffer npDeviceIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkBindBufferMemoryInfoKHX.PDEVICEINDICES), ndeviceIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindBufferMemoryInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindBufferMemoryInfoKHX.PNEXT, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutLong(struct + VkBindBufferMemoryInfoKHX.BUFFER, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkBindBufferMemoryInfoKHX.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkBindBufferMemoryInfoKHX.MEMORYOFFSET, value); }
    /** Sets the specified value to the {@code deviceIndexCount} field of the specified {@code struct}. */
    public static void ndeviceIndexCount(long struct, int value) { memPutInt(struct + VkBindBufferMemoryInfoKHX.DEVICEINDEXCOUNT, value); }
    /** Unsafe version of {@link #pDeviceIndices(IntBuffer) pDeviceIndices}. */
    public static void npDeviceIndices(long struct, IntBuffer value) { memPutAddress(struct + VkBindBufferMemoryInfoKHX.PDEVICEINDICES, memAddressSafe(value)); ndeviceIndexCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndeviceIndexCount(struct) != 0) {
            check(memGetAddress(struct + VkBindBufferMemoryInfoKHX.PDEVICEINDICES));
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

    /** An array of {@link VkBindBufferMemoryInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkBindBufferMemoryInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkBindBufferMemoryInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindBufferMemoryInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkBindBufferMemoryInfoKHX newInstance(long address) {
            return new VkBindBufferMemoryInfoKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindBufferMemoryInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkBindBufferMemoryInfoKHX.npNext(address()); }
        /** Returns the value of the {@code buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkBindBufferMemoryInfoKHX.nbuffer(address()); }
        /** Returns the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkBindBufferMemoryInfoKHX.nmemory(address()); }
        /** Returns the value of the {@code memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkBindBufferMemoryInfoKHX.nmemoryOffset(address()); }
        /** Returns the value of the {@code deviceIndexCount} field. */
        @NativeType("uint32_t")
        public int deviceIndexCount() { return VkBindBufferMemoryInfoKHX.ndeviceIndexCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
        @NativeType("const uint32_t *")
        public IntBuffer pDeviceIndices() { return VkBindBufferMemoryInfoKHX.npDeviceIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindBufferMemoryInfoKHX.Buffer sType(@NativeType("VkStructureType") int value) { VkBindBufferMemoryInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindBufferMemoryInfoKHX.Buffer pNext(@NativeType("const void *") long value) { VkBindBufferMemoryInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkBindBufferMemoryInfoKHX.Buffer buffer(@NativeType("VkBuffer") long value) { VkBindBufferMemoryInfoKHX.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkBindBufferMemoryInfoKHX.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindBufferMemoryInfoKHX.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        public VkBindBufferMemoryInfoKHX.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindBufferMemoryInfoKHX.nmemoryOffset(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        public VkBindBufferMemoryInfoKHX.Buffer pDeviceIndices(@NativeType("const uint32_t *") IntBuffer value) { VkBindBufferMemoryInfoKHX.npDeviceIndices(address(), value); return this; }

    }

}