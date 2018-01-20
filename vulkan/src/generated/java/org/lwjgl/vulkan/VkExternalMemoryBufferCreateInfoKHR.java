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
 * Specify that a buffer may be backed by external memory.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemory#VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHR STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsKHR} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleTypes} &ndash; a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsKHR} specifying one or more external memory handle types.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExternalMemoryBufferCreateInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkExternalMemoryHandleTypeFlagsKHR handleTypes;
 * }</pre></code>
 */
public class VkExternalMemoryBufferCreateInfoKHR extends Struct implements NativeResource {

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

    VkExternalMemoryBufferCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExternalMemoryBufferCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalMemoryBufferCreateInfoKHR(ByteBuffer container) {
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
    @NativeType("VkExternalMemoryHandleTypeFlagsKHR")
    public int handleTypes() { return nhandleTypes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExternalMemoryBufferCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExternalMemoryBufferCreateInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleTypes} field. */
    public VkExternalMemoryBufferCreateInfoKHR handleTypes(@NativeType("VkExternalMemoryHandleTypeFlagsKHR") int value) { nhandleTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalMemoryBufferCreateInfoKHR set(
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
    public VkExternalMemoryBufferCreateInfoKHR set(VkExternalMemoryBufferCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkExternalMemoryBufferCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalMemoryBufferCreateInfoKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkExternalMemoryBufferCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalMemoryBufferCreateInfoKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkExternalMemoryBufferCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkExternalMemoryBufferCreateInfoKHR create() {
        return new VkExternalMemoryBufferCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkExternalMemoryBufferCreateInfoKHR} instance for the specified memory address. */
    public static VkExternalMemoryBufferCreateInfoKHR create(long address) {
        return new VkExternalMemoryBufferCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalMemoryBufferCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkExternalMemoryBufferCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkExternalMemoryBufferCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkExternalMemoryBufferCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkExternalMemoryBufferCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalMemoryBufferCreateInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalMemoryBufferCreateInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExternalMemoryBufferCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalMemoryBufferCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #handleTypes}. */
    public static int nhandleTypes(long struct) { return memGetInt(struct + VkExternalMemoryBufferCreateInfoKHR.HANDLETYPES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExternalMemoryBufferCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalMemoryBufferCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #handleTypes(int) handleTypes}. */
    public static void nhandleTypes(long struct, int value) { memPutInt(struct + VkExternalMemoryBufferCreateInfoKHR.HANDLETYPES, value); }

    // -----------------------------------

    /** An array of {@link VkExternalMemoryBufferCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkExternalMemoryBufferCreateInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalMemoryBufferCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalMemoryBufferCreateInfoKHR newInstance(long address) {
            return new VkExternalMemoryBufferCreateInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalMemoryBufferCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkExternalMemoryBufferCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code handleTypes} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagsKHR")
        public int handleTypes() { return VkExternalMemoryBufferCreateInfoKHR.nhandleTypes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExternalMemoryBufferCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalMemoryBufferCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExternalMemoryBufferCreateInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkExternalMemoryBufferCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleTypes} field. */
        public VkExternalMemoryBufferCreateInfoKHR.Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlagsKHR") int value) { VkExternalMemoryBufferCreateInfoKHR.nhandleTypes(address(), value); return this; }

    }

}