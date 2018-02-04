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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Specify that an image may be backed by external memory.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVExternalMemory#VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleTypes} &ndash; a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} specifying one or more external memory handle types.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExternalMemoryImageCreateInfoNV {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkExternalMemoryHandleTypeFlagsNV handleTypes;
 * }</pre></code>
 */
public class VkExternalMemoryImageCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPES;

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
        HANDLETYPES = layout.offsetof(2);
    }

    VkExternalMemoryImageCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExternalMemoryImageCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalMemoryImageCreateInfoNV(ByteBuffer container) {
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
    /** Returns the value of the {@code handleTypes} field. */
    @NativeType("VkExternalMemoryHandleTypeFlagsNV")
    public int handleTypes() { return nhandleTypes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExternalMemoryImageCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExternalMemoryImageCreateInfoNV pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleTypes} field. */
    public VkExternalMemoryImageCreateInfoNV handleTypes(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) { nhandleTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalMemoryImageCreateInfoNV set(
        int sType,
        long pNext,
        int handleTypes
    ) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExternalMemoryImageCreateInfoNV set(VkExternalMemoryImageCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkExternalMemoryImageCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalMemoryImageCreateInfoNV malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkExternalMemoryImageCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalMemoryImageCreateInfoNV calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkExternalMemoryImageCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkExternalMemoryImageCreateInfoNV create() {
        return new VkExternalMemoryImageCreateInfoNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkExternalMemoryImageCreateInfoNV} instance for the specified memory address. */
    public static VkExternalMemoryImageCreateInfoNV create(long address) {
        return new VkExternalMemoryImageCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalMemoryImageCreateInfoNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkExternalMemoryImageCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryImageCreateInfoNV.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryImageCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryImageCreateInfoNV.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryImageCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryImageCreateInfoNV.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkExternalMemoryImageCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryImageCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalMemoryImageCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkExternalMemoryImageCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkExternalMemoryImageCreateInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkExternalMemoryImageCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkExternalMemoryImageCreateInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkExternalMemoryImageCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalMemoryImageCreateInfoNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalMemoryImageCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalMemoryImageCreateInfoNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalMemoryImageCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryImageCreateInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalMemoryImageCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryImageCreateInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalMemoryImageCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryImageCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryImageCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryImageCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExternalMemoryImageCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalMemoryImageCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #handleTypes}. */
    public static int nhandleTypes(long struct) { return memGetInt(struct + VkExternalMemoryImageCreateInfoNV.HANDLETYPES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExternalMemoryImageCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalMemoryImageCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #handleTypes(int) handleTypes}. */
    public static void nhandleTypes(long struct, int value) { memPutInt(struct + VkExternalMemoryImageCreateInfoNV.HANDLETYPES, value); }

    // -----------------------------------

    /** An array of {@link VkExternalMemoryImageCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkExternalMemoryImageCreateInfoNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkExternalMemoryImageCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalMemoryImageCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalMemoryImageCreateInfoNV newInstance(long address) {
            return new VkExternalMemoryImageCreateInfoNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalMemoryImageCreateInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkExternalMemoryImageCreateInfoNV.npNext(address()); }
        /** Returns the value of the {@code handleTypes} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagsNV")
        public int handleTypes() { return VkExternalMemoryImageCreateInfoNV.nhandleTypes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExternalMemoryImageCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalMemoryImageCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExternalMemoryImageCreateInfoNV.Buffer pNext(@NativeType("const void *") long value) { VkExternalMemoryImageCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleTypes} field. */
        public VkExternalMemoryImageCreateInfoNV.Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) { VkExternalMemoryImageCreateInfoNV.nhandleTypes(address(), value); return this; }

    }

}