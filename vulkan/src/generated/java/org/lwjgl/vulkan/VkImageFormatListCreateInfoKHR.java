/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImageFormatListCreateInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t viewFormatCount;
 *     const VkFormat * pViewFormats;
 * }</pre></code>
 */
public class VkImageFormatListCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIEWFORMATCOUNT,
        PVIEWFORMATS;

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
        VIEWFORMATCOUNT = layout.offsetof(2);
        PVIEWFORMATS = layout.offsetof(3);
    }

    VkImageFormatListCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImageFormatListCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageFormatListCreateInfoKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code viewFormatCount} field. */
    @NativeType("uint32_t")
    public int viewFormatCount() { return nviewFormatCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pViewFormats} field. */
    @Nullable
    @NativeType("const VkFormat *")
    public IntBuffer pViewFormats() { return npViewFormats(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageFormatListCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageFormatListCreateInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewFormats} field. */
    public VkImageFormatListCreateInfoKHR pViewFormats(@Nullable @NativeType("const VkFormat *") IntBuffer value) { npViewFormats(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageFormatListCreateInfoKHR set(
        int sType,
        long pNext,
        IntBuffer pViewFormats
    ) {
        sType(sType);
        pNext(pNext);
        pViewFormats(pViewFormats);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageFormatListCreateInfoKHR set(VkImageFormatListCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImageFormatListCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageFormatListCreateInfoKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkImageFormatListCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageFormatListCreateInfoKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkImageFormatListCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImageFormatListCreateInfoKHR create() {
        return new VkImageFormatListCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImageFormatListCreateInfoKHR} instance for the specified memory address. */
    public static VkImageFormatListCreateInfoKHR create(long address) {
        return new VkImageFormatListCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageFormatListCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfoKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfoKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfoKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkImageFormatListCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageFormatListCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImageFormatListCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageFormatListCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImageFormatListCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageFormatListCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatListCreateInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatListCreateInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageFormatListCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageFormatListCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #viewFormatCount}. */
    public static int nviewFormatCount(long struct) { return memGetInt(struct + VkImageFormatListCreateInfoKHR.VIEWFORMATCOUNT); }
    /** Unsafe version of {@link #pViewFormats() pViewFormats}. */
    @Nullable public static IntBuffer npViewFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + VkImageFormatListCreateInfoKHR.PVIEWFORMATS), nviewFormatCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageFormatListCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageFormatListCreateInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code viewFormatCount} field of the specified {@code struct}. */
    public static void nviewFormatCount(long struct, int value) { memPutInt(struct + VkImageFormatListCreateInfoKHR.VIEWFORMATCOUNT, value); }
    /** Unsafe version of {@link #pViewFormats(IntBuffer) pViewFormats}. */
    public static void npViewFormats(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkImageFormatListCreateInfoKHR.PVIEWFORMATS, memAddressSafe(value)); nviewFormatCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nviewFormatCount(struct) != 0) {
            check(memGetAddress(struct + VkImageFormatListCreateInfoKHR.PVIEWFORMATS));
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

    /** An array of {@link VkImageFormatListCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImageFormatListCreateInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImageFormatListCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageFormatListCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImageFormatListCreateInfoKHR newInstance(long address) {
            return new VkImageFormatListCreateInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageFormatListCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkImageFormatListCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code viewFormatCount} field. */
        @NativeType("uint32_t")
        public int viewFormatCount() { return VkImageFormatListCreateInfoKHR.nviewFormatCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pViewFormats} field. */
        @Nullable
        @NativeType("const VkFormat *")
        public IntBuffer pViewFormats() { return VkImageFormatListCreateInfoKHR.npViewFormats(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageFormatListCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImageFormatListCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageFormatListCreateInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkImageFormatListCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewFormats} field. */
        public VkImageFormatListCreateInfoKHR.Buffer pViewFormats(@Nullable @NativeType("const VkFormat *") IntBuffer value) { VkImageFormatListCreateInfoKHR.npViewFormats(address(), value); return this; }

    }

}