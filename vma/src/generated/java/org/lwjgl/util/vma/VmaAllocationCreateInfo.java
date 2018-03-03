/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code flags} &ndash; use {@code VmaAllocationCreateFlagBits} enum. One or more of:<br><table><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}</td><td>{@link Vma#VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT ALLOCATION_CREATE_NEVER_ALLOCATE_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT}</td><td>{@link Vma#VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT}</td><td>{@link Vma#VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT}</td></tr></table></li>
 * <li>{@code usage} &ndash; intended usage of memory.
 * 
 * <p>You can leave {@link Vma#VMA_MEMORY_USAGE_UNKNOWN MEMORY_USAGE_UNKNOWN} if you specify memory requirements in other way. If {@code pool} is not null, this member is ignored. One of:<br></p><table><tr><td>{@link Vma#VMA_MEMORY_USAGE_UNKNOWN MEMORY_USAGE_UNKNOWN}</td><td>{@link Vma#VMA_MEMORY_USAGE_GPU_ONLY MEMORY_USAGE_GPU_ONLY}</td><td>{@link Vma#VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY}</td></tr><tr><td>{@link Vma#VMA_MEMORY_USAGE_CPU_TO_GPU MEMORY_USAGE_CPU_TO_GPU}</td><td>{@link Vma#VMA_MEMORY_USAGE_GPU_TO_CPU MEMORY_USAGE_GPU_TO_CPU}</td></tr></table></li>
 * <li>{@code requiredFlags} &ndash; 
 * flags that must be set in a Memory Type chosen for an allocation.
 * 
 * <p>Leave 0 if you specify memory requirements in other way. If {@code pool} is not null, this member is ignored.</p></li>
 * <li>{@code preferredFlags} &ndash; 
 * flags that preferably should be set in a memory type chosen for an allocation.
 * 
 * <p>Set to 0 if no additional flags are prefered. If {@code pool} is not null, this member is ignored.</p></li>
 * <li>{@code memoryTypeBits} &ndash; 
 * bitmask containing one bit set for every memory type acceptable for this allocation.
 * 
 * <p>Value 0 is equivalent to {@code UINT32_MAX} - it means any memory type is accepted if it meets other requirements specified by this structure, with no
 * further restrictions on memory type index. If {@code pool} is not null, this member is ignored.</p></li>
 * <li>{@code pool} &ndash; 
 * pool that this allocation should be created in.
 * 
 * <p>Leave {@code VK_NULL_HANDLE} to allocate from default pool. If not null, members: {@code usage}, {@code requiredFlags}, {@code preferredFlags},
 * {@code memoryTypeBits} are ignored.</p></li>
 * <li>{@code pUserData} &ndash; 
 * custom general-purpose pointer that will be stored in {@code VmaAllocation}, can be read as {@link VmaAllocationInfo}{@code ::pUserData} and changed using
 * {@link Vma#vmaSetAllocationUserData SetAllocationUserData}.
 * 
 * <p>If {@link Vma#VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT} is used, it must be either null or pointer to a null-terminated string. The string will be then copied
 * to internal buffer, so it doesn't need to be valid after allocation call.</p></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VmaAllocationCreateInfo {
 *     VmaAllocationCreateFlags flags;
 *     VmaMemoryUsage usage;
 *     VkMemoryPropertyFlags requiredFlags;
 *     VkMemoryPropertyFlags preferredFlags;
 *     uint32_t memoryTypeBits;
 *     VmaPool pool;
 *     void * pUserData;
 * }</pre></code>
 */
public class VmaAllocationCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        USAGE,
        REQUIREDFLAGS,
        PREFERREDFLAGS,
        MEMORYTYPEBITS,
        POOL,
        PUSERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        USAGE = layout.offsetof(1);
        REQUIREDFLAGS = layout.offsetof(2);
        PREFERREDFLAGS = layout.offsetof(3);
        MEMORYTYPEBITS = layout.offsetof(4);
        POOL = layout.offsetof(5);
        PUSERDATA = layout.offsetof(6);
    }

    VmaAllocationCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VmaAllocationCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaAllocationCreateInfo(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code flags} field. */
    @NativeType("VmaAllocationCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code usage} field. */
    @NativeType("VmaMemoryUsage")
    public int usage() { return nusage(address()); }
    /** Returns the value of the {@code requiredFlags} field. */
    @NativeType("VkMemoryPropertyFlags")
    public int requiredFlags() { return nrequiredFlags(address()); }
    /** Returns the value of the {@code preferredFlags} field. */
    @NativeType("VkMemoryPropertyFlags")
    public int preferredFlags() { return npreferredFlags(address()); }
    /** Returns the value of the {@code memoryTypeBits} field. */
    @NativeType("uint32_t")
    public int memoryTypeBits() { return nmemoryTypeBits(address()); }
    /** Returns the value of the {@code pool} field. */
    @NativeType("VmaPool")
    public long pool() { return npool(address()); }
    /** Returns the value of the {@code pUserData} field. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public VmaAllocationCreateInfo flags(@NativeType("VmaAllocationCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VmaAllocationCreateInfo usage(@NativeType("VmaMemoryUsage") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code requiredFlags} field. */
    public VmaAllocationCreateInfo requiredFlags(@NativeType("VkMemoryPropertyFlags") int value) { nrequiredFlags(address(), value); return this; }
    /** Sets the specified value to the {@code preferredFlags} field. */
    public VmaAllocationCreateInfo preferredFlags(@NativeType("VkMemoryPropertyFlags") int value) { npreferredFlags(address(), value); return this; }
    /** Sets the specified value to the {@code memoryTypeBits} field. */
    public VmaAllocationCreateInfo memoryTypeBits(@NativeType("uint32_t") int value) { nmemoryTypeBits(address(), value); return this; }
    /** Sets the specified value to the {@code pool} field. */
    public VmaAllocationCreateInfo pool(@NativeType("VmaPool") long value) { npool(address(), value); return this; }
    /** Sets the specified value to the {@code pUserData} field. */
    public VmaAllocationCreateInfo pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaAllocationCreateInfo set(
        int flags,
        int usage,
        int requiredFlags,
        int preferredFlags,
        int memoryTypeBits,
        long pool,
        long pUserData
    ) {
        flags(flags);
        usage(usage);
        requiredFlags(requiredFlags);
        preferredFlags(preferredFlags);
        memoryTypeBits(memoryTypeBits);
        pool(pool);
        pUserData(pUserData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaAllocationCreateInfo set(VmaAllocationCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VmaAllocationCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaAllocationCreateInfo malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VmaAllocationCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaAllocationCreateInfo calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VmaAllocationCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VmaAllocationCreateInfo create() {
        return new VmaAllocationCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VmaAllocationCreateInfo} instance for the specified memory address. */
    public static VmaAllocationCreateInfo create(long address) {
        return new VmaAllocationCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaAllocationCreateInfo createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VmaAllocationCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaAllocationCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VmaAllocationCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VmaAllocationCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VmaAllocationCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VmaAllocationCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocationCreateInfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocationCreateInfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VmaAllocationCreateInfo.FLAGS); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + VmaAllocationCreateInfo.USAGE); }
    /** Unsafe version of {@link #requiredFlags}. */
    public static int nrequiredFlags(long struct) { return memGetInt(struct + VmaAllocationCreateInfo.REQUIREDFLAGS); }
    /** Unsafe version of {@link #preferredFlags}. */
    public static int npreferredFlags(long struct) { return memGetInt(struct + VmaAllocationCreateInfo.PREFERREDFLAGS); }
    /** Unsafe version of {@link #memoryTypeBits}. */
    public static int nmemoryTypeBits(long struct) { return memGetInt(struct + VmaAllocationCreateInfo.MEMORYTYPEBITS); }
    /** Unsafe version of {@link #pool}. */
    public static long npool(long struct) { return memGetAddress(struct + VmaAllocationCreateInfo.POOL); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VmaAllocationCreateInfo.PUSERDATA); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VmaAllocationCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + VmaAllocationCreateInfo.USAGE, value); }
    /** Unsafe version of {@link #requiredFlags(int) requiredFlags}. */
    public static void nrequiredFlags(long struct, int value) { memPutInt(struct + VmaAllocationCreateInfo.REQUIREDFLAGS, value); }
    /** Unsafe version of {@link #preferredFlags(int) preferredFlags}. */
    public static void npreferredFlags(long struct, int value) { memPutInt(struct + VmaAllocationCreateInfo.PREFERREDFLAGS, value); }
    /** Unsafe version of {@link #memoryTypeBits(int) memoryTypeBits}. */
    public static void nmemoryTypeBits(long struct, int value) { memPutInt(struct + VmaAllocationCreateInfo.MEMORYTYPEBITS, value); }
    /** Unsafe version of {@link #pool(long) pool}. */
    public static void npool(long struct, long value) { memPutAddress(struct + VmaAllocationCreateInfo.POOL, check(value)); }
    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VmaAllocationCreateInfo.PUSERDATA, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VmaAllocationCreateInfo.POOL));
        check(memGetAddress(struct + VmaAllocationCreateInfo.PUSERDATA));
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

    /** An array of {@link VmaAllocationCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VmaAllocationCreateInfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VmaAllocationCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaAllocationCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VmaAllocationCreateInfo newInstance(long address) {
            return new VmaAllocationCreateInfo(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code flags} field. */
        @NativeType("VmaAllocationCreateFlags")
        public int flags() { return VmaAllocationCreateInfo.nflags(address()); }
        /** Returns the value of the {@code usage} field. */
        @NativeType("VmaMemoryUsage")
        public int usage() { return VmaAllocationCreateInfo.nusage(address()); }
        /** Returns the value of the {@code requiredFlags} field. */
        @NativeType("VkMemoryPropertyFlags")
        public int requiredFlags() { return VmaAllocationCreateInfo.nrequiredFlags(address()); }
        /** Returns the value of the {@code preferredFlags} field. */
        @NativeType("VkMemoryPropertyFlags")
        public int preferredFlags() { return VmaAllocationCreateInfo.npreferredFlags(address()); }
        /** Returns the value of the {@code memoryTypeBits} field. */
        @NativeType("uint32_t")
        public int memoryTypeBits() { return VmaAllocationCreateInfo.nmemoryTypeBits(address()); }
        /** Returns the value of the {@code pool} field. */
        @NativeType("VmaPool")
        public long pool() { return VmaAllocationCreateInfo.npool(address()); }
        /** Returns the value of the {@code pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VmaAllocationCreateInfo.npUserData(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public VmaAllocationCreateInfo.Buffer flags(@NativeType("VmaAllocationCreateFlags") int value) { VmaAllocationCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VmaAllocationCreateInfo.Buffer usage(@NativeType("VmaMemoryUsage") int value) { VmaAllocationCreateInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code requiredFlags} field. */
        public VmaAllocationCreateInfo.Buffer requiredFlags(@NativeType("VkMemoryPropertyFlags") int value) { VmaAllocationCreateInfo.nrequiredFlags(address(), value); return this; }
        /** Sets the specified value to the {@code preferredFlags} field. */
        public VmaAllocationCreateInfo.Buffer preferredFlags(@NativeType("VkMemoryPropertyFlags") int value) { VmaAllocationCreateInfo.npreferredFlags(address(), value); return this; }
        /** Sets the specified value to the {@code memoryTypeBits} field. */
        public VmaAllocationCreateInfo.Buffer memoryTypeBits(@NativeType("uint32_t") int value) { VmaAllocationCreateInfo.nmemoryTypeBits(address(), value); return this; }
        /** Sets the specified value to the {@code pool} field. */
        public VmaAllocationCreateInfo.Buffer pool(@NativeType("VmaPool") long value) { VmaAllocationCreateInfo.npool(address(), value); return this; }
        /** Sets the specified value to the {@code pUserData} field. */
        public VmaAllocationCreateInfo.Buffer pUserData(@NativeType("void *") long value) { VmaAllocationCreateInfo.npUserData(address(), value); return this; }

    }

}