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
 * Structure specifying a sparse memory bind operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The <em>binding range</em></p><code>[resourceOffset, resourceOffset {plus} size)</code>
 * 
 * <p>has different constraints based on {@code flags}. If {@code flags} contains {@link VK10#VK_SPARSE_MEMORY_BIND_METADATA_BIT SPARSE_MEMORY_BIND_METADATA_BIT}, the binding range <b>must</b> be within the mip tail region of the metadata aspect. This metadata region is defined by:</p>
 * 
 * <dl>
 * <dd><code>metadataRegion = [base, base + imageMipTailSize)</code></dd>
 * <dd><code>base = imageMipTailOffset + imageMipTailStride × n</code></dd>
 * </dl>
 * 
 * <p>and {@code imageMipTailOffset}, {@code imageMipTailSize}, and {@code imageMipTailStride} values are from the {@link VkSparseImageMemoryRequirements} corresponding to the metadata aspect of the image, and</p><code>n</code>
 * 
 * <p>is a valid array layer index for the image,</p>
 * 
 * <p>{@code imageMipTailStride} is considered to be zero for aspects where {@link VkSparseImageMemoryRequirements}{@code ::formatProperties}.flags contains {@link VK10#VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT}.</p>
 * 
 * <p>If {@code flags} does not contain {@link VK10#VK_SPARSE_MEMORY_BIND_METADATA_BIT SPARSE_MEMORY_BIND_METADATA_BIT}, the binding range <b>must</b> be within the range</p><code>[0,{@link VkMemoryRequirements}::size)</code>
 * 
 * <p>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code memory} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code memory} and {@code memoryOffset} <b>must</b> match the memory requirements of the resource, as described in section <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#resources-association">the “Resource Memory Association” section</a></li>
 * <li>If {@code memory} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code memory} <b>must</b> not have been created with a memory type that reports {@link VK10#VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT} bit set</li>
 * <li>{@code size} <b>must</b> be greater than 0</li>
 * <li>{@code resourceOffset} <b>must</b> be less than the size of the resource</li>
 * <li>{@code size} <b>must</b> be less than or equal to the size of the resource minus {@code resourceOffset}</li>
 * <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
 * <li>{@code size} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>If {@code memory} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSparseMemoryBindFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSparseBufferMemoryBindInfo}, {@link VkSparseImageOpaqueMemoryBindInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code resourceOffset} &ndash; the offset into the resource.</li>
 * <li>{@code size} &ndash; the size of the memory region to be bound.</li>
 * <li>{@code memory} &ndash; the {@code VkDeviceMemory} object that the range of the resource is bound to. If {@code memory} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the range is unbound.</li>
 * <li>{@code memoryOffset} &ndash; the offset into the {@code VkDeviceMemory} object to bind the resource range to. If {@code memory} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, this value is ignored.</li>
 * <li>{@code flags} &ndash; a bitmask specifying usage of the binding operation. Bits which <b>can</b> be set include:
 * 
 * <code><pre>
 * typedef enum VkSparseMemoryBindFlagBits {
 *     VK_SPARSE_MEMORY_BIND_METADATA_BIT = 0x00000001,
 * } VkSparseMemoryBindFlagBits;</pre></code>
 * 
 * <ul>
 * <li>{@link VK10#VK_SPARSE_MEMORY_BIND_METADATA_BIT SPARSE_MEMORY_BIND_METADATA_BIT} indicates that the memory being bound is only for the metadata aspect.</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkSparseMemoryBind {
 *     VkDeviceSize resourceOffset;
 *     VkDeviceSize size;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     VkSparseMemoryBindFlags flags;
 * }</pre></code>
 */
public class VkSparseMemoryBind extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESOURCEOFFSET,
        SIZE,
        MEMORY,
        MEMORYOFFSET,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESOURCEOFFSET = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        MEMORYOFFSET = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    VkSparseMemoryBind(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSparseMemoryBind} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSparseMemoryBind(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code resourceOffset} field. */
    public long resourceOffset() { return nresourceOffset(address()); }
    /** Returns the value of the {@code size} field. */
    public long size() { return nsize(address()); }
    /** Returns the value of the {@code memory} field. */
    public long memory() { return nmemory(address()); }
    /** Returns the value of the {@code memoryOffset} field. */
    public long memoryOffset() { return nmemoryOffset(address()); }
    /** Returns the value of the {@code flags} field. */
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code resourceOffset} field. */
    public VkSparseMemoryBind resourceOffset(long value) { nresourceOffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkSparseMemoryBind size(long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkSparseMemoryBind memory(long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    public VkSparseMemoryBind memoryOffset(long value) { nmemoryOffset(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkSparseMemoryBind flags(int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSparseMemoryBind set(
        long resourceOffset,
        long size,
        long memory,
        long memoryOffset,
        int flags
    ) {
        resourceOffset(resourceOffset);
        size(size);
        memory(memory);
        memoryOffset(memoryOffset);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSparseMemoryBind set(VkSparseMemoryBind src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkSparseMemoryBind} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseMemoryBind malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkSparseMemoryBind} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseMemoryBind calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkSparseMemoryBind} instance allocated with {@link BufferUtils}. */
    public static VkSparseMemoryBind create() {
        return new VkSparseMemoryBind(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkSparseMemoryBind} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkSparseMemoryBind create(long address) {
        return address == NULL ? null : new VkSparseMemoryBind(address, null);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkSparseMemoryBind.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkSparseMemoryBind} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSparseMemoryBind mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkSparseMemoryBind} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSparseMemoryBind callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkSparseMemoryBind} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseMemoryBind mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkSparseMemoryBind} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseMemoryBind callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #resourceOffset}. */
    public static long nresourceOffset(long struct) { return memGetLong(struct + VkSparseMemoryBind.RESOURCEOFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkSparseMemoryBind.SIZE); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkSparseMemoryBind.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return memGetLong(struct + VkSparseMemoryBind.MEMORYOFFSET); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSparseMemoryBind.FLAGS); }

    /** Unsafe version of {@link #resourceOffset(long) resourceOffset}. */
    public static void nresourceOffset(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.RESOURCEOFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.SIZE, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.MEMORYOFFSET, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSparseMemoryBind.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkSparseMemoryBind} structs. */
    public static class Buffer extends StructBuffer<VkSparseMemoryBind, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkSparseMemoryBind.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseMemoryBind#SIZEOF}, and its mark will be undefined.
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
        protected VkSparseMemoryBind newInstance(long address) {
            return new VkSparseMemoryBind(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code resourceOffset} field. */
        public long resourceOffset() { return VkSparseMemoryBind.nresourceOffset(address()); }
        /** Returns the value of the {@code size} field. */
        public long size() { return VkSparseMemoryBind.nsize(address()); }
        /** Returns the value of the {@code memory} field. */
        public long memory() { return VkSparseMemoryBind.nmemory(address()); }
        /** Returns the value of the {@code memoryOffset} field. */
        public long memoryOffset() { return VkSparseMemoryBind.nmemoryOffset(address()); }
        /** Returns the value of the {@code flags} field. */
        public int flags() { return VkSparseMemoryBind.nflags(address()); }

        /** Sets the specified value to the {@code resourceOffset} field. */
        public VkSparseMemoryBind.Buffer resourceOffset(long value) { VkSparseMemoryBind.nresourceOffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkSparseMemoryBind.Buffer size(long value) { VkSparseMemoryBind.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkSparseMemoryBind.Buffer memory(long value) { VkSparseMemoryBind.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        public VkSparseMemoryBind.Buffer memoryOffset(long value) { VkSparseMemoryBind.nmemoryOffset(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkSparseMemoryBind.Buffer flags(int value) { VkSparseMemoryBind.nflags(address(), value); return this; }

    }

}