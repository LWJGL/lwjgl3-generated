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
 * Specify exportable handle types for a device memory object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The bits in {@code handleTypes} <b>must</b> be supported and compatible, as reported by {@link VkExternalImageFormatPropertiesKHX} or {@link VkExternalBufferPropertiesKHX}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXExternalMemory#VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_KHX STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsKHX} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleTypes} &ndash; a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsKHX} specifying one or more memory handle types the application <b>can</b> export from the resulting allocation. The application <b>can</b> request multiple handle types for the same allocation.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExportMemoryAllocateInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkExternalMemoryHandleTypeFlagsKHX handleTypes;
 * }</pre></code>
 */
public class VkExportMemoryAllocateInfoKHX extends Struct implements NativeResource {

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

    VkExportMemoryAllocateInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExportMemoryAllocateInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMemoryAllocateInfoKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code handleTypes} field. */
    public int handleTypes() { return nhandleTypes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExportMemoryAllocateInfoKHX sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExportMemoryAllocateInfoKHX pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleTypes} field. */
    public VkExportMemoryAllocateInfoKHX handleTypes(int value) { nhandleTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMemoryAllocateInfoKHX set(
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
    public VkExportMemoryAllocateInfoKHX set(VkExportMemoryAllocateInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkExportMemoryAllocateInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMemoryAllocateInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkExportMemoryAllocateInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMemoryAllocateInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkExportMemoryAllocateInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkExportMemoryAllocateInfoKHX create() {
        return new VkExportMemoryAllocateInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkExportMemoryAllocateInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkExportMemoryAllocateInfoKHX create(long address) {
        return address == NULL ? null : new VkExportMemoryAllocateInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkExportMemoryAllocateInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkExportMemoryAllocateInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkExportMemoryAllocateInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkExportMemoryAllocateInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkExportMemoryAllocateInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryAllocateInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryAllocateInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExportMemoryAllocateInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMemoryAllocateInfoKHX.PNEXT); }
    /** Unsafe version of {@link #handleTypes}. */
    public static int nhandleTypes(long struct) { return memGetInt(struct + VkExportMemoryAllocateInfoKHX.HANDLETYPES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExportMemoryAllocateInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMemoryAllocateInfoKHX.PNEXT, value); }
    /** Unsafe version of {@link #handleTypes(int) handleTypes}. */
    public static void nhandleTypes(long struct, int value) { memPutInt(struct + VkExportMemoryAllocateInfoKHX.HANDLETYPES, value); }

    // -----------------------------------

    /** An array of {@link VkExportMemoryAllocateInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkExportMemoryAllocateInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkExportMemoryAllocateInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMemoryAllocateInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkExportMemoryAllocateInfoKHX newInstance(long address) {
            return new VkExportMemoryAllocateInfoKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkExportMemoryAllocateInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkExportMemoryAllocateInfoKHX.npNext(address()); }
        /** Returns the value of the {@code handleTypes} field. */
        public int handleTypes() { return VkExportMemoryAllocateInfoKHX.nhandleTypes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExportMemoryAllocateInfoKHX.Buffer sType(int value) { VkExportMemoryAllocateInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExportMemoryAllocateInfoKHX.Buffer pNext(long value) { VkExportMemoryAllocateInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleTypes} field. */
        public VkExportMemoryAllocateInfoKHX.Buffer handleTypes(int value) { VkExportMemoryAllocateInfoKHX.nhandleTypes(address(), value); return this; }

    }

}