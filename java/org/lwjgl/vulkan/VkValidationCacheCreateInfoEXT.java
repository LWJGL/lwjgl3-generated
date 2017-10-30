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
 * Structure specifying parameters of a newly created validation cache.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code initialDataSize} is not 0, it <b>must</b> be equal to the size of {@code pInitialData}, as returned by {@link EXTValidationCache#vkGetValidationCacheDataEXT GetValidationCacheDataEXT} when {@code pInitialData} was originally retrieved</li>
 * <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> have been retrieved from a previous call to {@link EXTValidationCache#vkGetValidationCacheDataEXT GetValidationCacheDataEXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTValidationCache#VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> be a valid pointer to an array of {@code initialDataSize} bytes</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTValidationCache#vkCreateValidationCacheEXT CreateValidationCacheEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code initialDataSize} &ndash; the number of bytes in {@code pInitialData}. If {@code initialDataSize} is zero, the validation cache will initially be empty.</li>
 * <li>{@code pInitialData} &ndash; a pointer to previously retrieved validation cache data. If the validation cache data is incompatible (as defined below) with the device, the validation cache will be initially empty. If {@code initialDataSize} is zero, {@code pInitialData} is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkValidationCacheCreateInfoEXT {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkValidationCacheCreateFlagsEXT flags;
 *     size_t initialDataSize;
 *     const void * pInitialData;
 * }</pre></code>
 */
public class VkValidationCacheCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        INITIALDATASIZE,
        PINITIALDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        INITIALDATASIZE = layout.offsetof(3);
        PINITIALDATA = layout.offsetof(4);
    }

    VkValidationCacheCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkValidationCacheCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkValidationCacheCreateInfoEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkValidationCacheCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code initialDataSize} field. */
    @NativeType("size_t")
    public long initialDataSize() { return ninitialDataSize(address()); }
    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pInitialData} field. */
    @NativeType("const void *")
    public ByteBuffer pInitialData() { return npInitialData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkValidationCacheCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkValidationCacheCreateInfoEXT pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkValidationCacheCreateInfoEXT flags(@NativeType("VkValidationCacheCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pInitialData} field. */
    public VkValidationCacheCreateInfoEXT pInitialData(@NativeType("const void *") ByteBuffer value) { npInitialData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkValidationCacheCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        ByteBuffer pInitialData
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pInitialData(pInitialData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkValidationCacheCreateInfoEXT set(VkValidationCacheCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkValidationCacheCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkValidationCacheCreateInfoEXT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkValidationCacheCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkValidationCacheCreateInfoEXT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkValidationCacheCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkValidationCacheCreateInfoEXT create() {
        return new VkValidationCacheCreateInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkValidationCacheCreateInfoEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkValidationCacheCreateInfoEXT create(long address) {
        return address == NULL ? null : new VkValidationCacheCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkValidationCacheCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkValidationCacheCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkValidationCacheCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkValidationCacheCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkValidationCacheCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkValidationCacheCreateInfoEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkValidationCacheCreateInfoEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkValidationCacheCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkValidationCacheCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkValidationCacheCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #initialDataSize}. */
    public static long ninitialDataSize(long struct) { return memGetAddress(struct + VkValidationCacheCreateInfoEXT.INITIALDATASIZE); }
    /** Unsafe version of {@link #pInitialData() pInitialData}. */
    public static ByteBuffer npInitialData(long struct) { return memByteBuffer(memGetAddress(struct + VkValidationCacheCreateInfoEXT.PINITIALDATA), (int)ninitialDataSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkValidationCacheCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkValidationCacheCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkValidationCacheCreateInfoEXT.FLAGS, value); }
    /** Sets the specified value to the {@code initialDataSize} field of the specified {@code struct}. */
    public static void ninitialDataSize(long struct, long value) { memPutAddress(struct + VkValidationCacheCreateInfoEXT.INITIALDATASIZE, value); }
    /** Unsafe version of {@link #pInitialData(ByteBuffer) pInitialData}. */
    public static void npInitialData(long struct, ByteBuffer value) { memPutAddress(struct + VkValidationCacheCreateInfoEXT.PINITIALDATA, memAddressSafe(value)); ninitialDataSize(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ninitialDataSize(struct) != 0) {
            check(memGetAddress(struct + VkValidationCacheCreateInfoEXT.PINITIALDATA));
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

    /** An array of {@link VkValidationCacheCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkValidationCacheCreateInfoEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkValidationCacheCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkValidationCacheCreateInfoEXT newInstance(long address) {
            return new VkValidationCacheCreateInfoEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkValidationCacheCreateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkValidationCacheCreateInfoEXT.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkValidationCacheCreateFlagsEXT")
        public int flags() { return VkValidationCacheCreateInfoEXT.nflags(address()); }
        /** Returns the value of the {@code initialDataSize} field. */
        @NativeType("size_t")
        public long initialDataSize() { return VkValidationCacheCreateInfoEXT.ninitialDataSize(address()); }
        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pInitialData} field. */
        @NativeType("const void *")
        public ByteBuffer pInitialData() { return VkValidationCacheCreateInfoEXT.npInitialData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkValidationCacheCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkValidationCacheCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkValidationCacheCreateInfoEXT.Buffer pNext(@NativeType("const void *") long value) { VkValidationCacheCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkValidationCacheCreateInfoEXT.Buffer flags(@NativeType("VkValidationCacheCreateFlagsEXT") int value) { VkValidationCacheCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pInitialData} field. */
        public VkValidationCacheCreateInfoEXT.Buffer pInitialData(@NativeType("const void *") ByteBuffer value) { VkValidationCacheCreateInfoEXT.npInitialData(address(), value); return this; }

    }

}