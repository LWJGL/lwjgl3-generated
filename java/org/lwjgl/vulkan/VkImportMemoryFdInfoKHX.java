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
 * import memory created on the same physical device from a file descriptor.
 * 
 * <h5>Description</h5>
 * 
 * <p>Importing memory from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported by {@link VkExternalImageFormatPropertiesKHX} or {@link VkExternalBufferPropertiesKHX}.</li>
 * <li>The memory from which {@code fd} was exported <b>must</b> have been created on the same underlying physical device as {@code device}.</li>
 * <li>If {@code handleType} is not 0, it <b>must</b> be defined as a POSIX file descriptor handle.</li>
 * <li>If {@code handleType} is not 0, {@code fd} <b>must</b> be a valid handle of the type specified by {@code handleType}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXExternalMemoryFd#VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHX STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleType} &ndash; specifies the handle type of {@code fd}.</li>
 * <li>{@code fd} &ndash; the external handle to import.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImportMemoryFdInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkExternalMemoryHandleTypeFlagBitsKHX handleType;
 *     int fd;
 * }</pre></code>
 */
public class VkImportMemoryFdInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPE,
        FD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPE = layout.offsetof(2);
        FD = layout.offsetof(3);
    }

    VkImportMemoryFdInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImportMemoryFdInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMemoryFdInfoKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code handleType} field. */
    public int handleType() { return nhandleType(address()); }
    /** Returns the value of the {@code fd} field. */
    public int fd() { return nfd(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImportMemoryFdInfoKHX sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImportMemoryFdInfoKHX pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkImportMemoryFdInfoKHX handleType(int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@code fd} field. */
    public VkImportMemoryFdInfoKHX fd(int value) { nfd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMemoryFdInfoKHX set(
        int sType,
        long pNext,
        int handleType,
        int fd
    ) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        fd(fd);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportMemoryFdInfoKHX set(VkImportMemoryFdInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImportMemoryFdInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMemoryFdInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkImportMemoryFdInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMemoryFdInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkImportMemoryFdInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkImportMemoryFdInfoKHX create() {
        return new VkImportMemoryFdInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImportMemoryFdInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkImportMemoryFdInfoKHX create(long address) {
        return address == NULL ? null : new VkImportMemoryFdInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkImportMemoryFdInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImportMemoryFdInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImportMemoryFdInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImportMemoryFdInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImportMemoryFdInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryFdInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryFdInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImportMemoryFdInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMemoryFdInfoKHX.PNEXT); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkImportMemoryFdInfoKHX.HANDLETYPE); }
    /** Unsafe version of {@link #fd}. */
    public static int nfd(long struct) { return memGetInt(struct + VkImportMemoryFdInfoKHX.FD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImportMemoryFdInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMemoryFdInfoKHX.PNEXT, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkImportMemoryFdInfoKHX.HANDLETYPE, value); }
    /** Unsafe version of {@link #fd(int) fd}. */
    public static void nfd(long struct, int value) { memPutInt(struct + VkImportMemoryFdInfoKHX.FD, value); }

    // -----------------------------------

    /** An array of {@link VkImportMemoryFdInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkImportMemoryFdInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImportMemoryFdInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMemoryFdInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkImportMemoryFdInfoKHX newInstance(long address) {
            return new VkImportMemoryFdInfoKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkImportMemoryFdInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkImportMemoryFdInfoKHX.npNext(address()); }
        /** Returns the value of the {@code handleType} field. */
        public int handleType() { return VkImportMemoryFdInfoKHX.nhandleType(address()); }
        /** Returns the value of the {@code fd} field. */
        public int fd() { return VkImportMemoryFdInfoKHX.nfd(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImportMemoryFdInfoKHX.Buffer sType(int value) { VkImportMemoryFdInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImportMemoryFdInfoKHX.Buffer pNext(long value) { VkImportMemoryFdInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkImportMemoryFdInfoKHX.Buffer handleType(int value) { VkImportMemoryFdInfoKHX.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@code fd} field. */
        public VkImportMemoryFdInfoKHX.Buffer fd(int value) { VkImportMemoryFdInfoKHX.nfd(address(), value); return this; }

    }

}