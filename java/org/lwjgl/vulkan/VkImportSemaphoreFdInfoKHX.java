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
 * (no short description available).
 * 
 * <h5>Description</h5>
 * 
 * <p>The handle types supported by {@code handleType} are:</p>
 * 
 * <h6>Handle Type Permanence for VkImportSemaphoreFdInfoKHX</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Handle Type</th><th>Permanence</th></tr></thead>
 * <tbody>
 * <tr><td>VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHX</td><td>Permanent</td></tr>
 * <tr><td>VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHX</td><td>Temporary</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-handletypes-fd">Handle Type Permanence for VkImportSemaphoreFdInfoKHX</a> table.</li>
 * <li>The semaphore from which {@code handleType} was exported <b>must</b> have been created on the same underlying physical device as {@code semaphore}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXExternalSemaphoreFd#VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHX STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHXExternalSemaphoreFd#vkImportSemaphoreFdKHX ImportSemaphoreFdKHX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code semaphore} &ndash; the semaphore into which the state will be imported.</li>
 * <li>{@code handleType} &ndash; specifies the type of {@code fd}.</li>
 * <li>{@code fd} &ndash; the external handle to import.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImportSemaphoreFdInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkSemaphore semaphore;
 *     VkExternalSemaphoreHandleTypeFlagBitsKHX handleType;
 *     int fd;
 * }</pre></code>
 */
public class VkImportSemaphoreFdInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEMAPHORE,
        HANDLETYPE,
        FD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORE = layout.offsetof(2);
        HANDLETYPE = layout.offsetof(3);
        FD = layout.offsetof(4);
    }

    VkImportSemaphoreFdInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImportSemaphoreFdInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportSemaphoreFdInfoKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code semaphore} field. */
    public long semaphore() { return nsemaphore(address()); }
    /** Returns the value of the {@code handleType} field. */
    public int handleType() { return nhandleType(address()); }
    /** Returns the value of the {@code fd} field. */
    public int fd() { return nfd(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImportSemaphoreFdInfoKHX sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImportSemaphoreFdInfoKHX pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code semaphore} field. */
    public VkImportSemaphoreFdInfoKHX semaphore(long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkImportSemaphoreFdInfoKHX handleType(int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@code fd} field. */
    public VkImportSemaphoreFdInfoKHX fd(int value) { nfd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportSemaphoreFdInfoKHX set(
        int sType,
        long pNext,
        long semaphore,
        int handleType,
        int fd
    ) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
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
    public VkImportSemaphoreFdInfoKHX set(VkImportSemaphoreFdInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImportSemaphoreFdInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportSemaphoreFdInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkImportSemaphoreFdInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportSemaphoreFdInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkImportSemaphoreFdInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkImportSemaphoreFdInfoKHX create() {
        return new VkImportSemaphoreFdInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImportSemaphoreFdInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkImportSemaphoreFdInfoKHX create(long address) {
        return address == NULL ? null : new VkImportSemaphoreFdInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkImportSemaphoreFdInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImportSemaphoreFdInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImportSemaphoreFdInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImportSemaphoreFdInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImportSemaphoreFdInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportSemaphoreFdInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportSemaphoreFdInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImportSemaphoreFdInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportSemaphoreFdInfoKHX.PNEXT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return memGetLong(struct + VkImportSemaphoreFdInfoKHX.SEMAPHORE); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkImportSemaphoreFdInfoKHX.HANDLETYPE); }
    /** Unsafe version of {@link #fd}. */
    public static int nfd(long struct) { return memGetInt(struct + VkImportSemaphoreFdInfoKHX.FD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImportSemaphoreFdInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportSemaphoreFdInfoKHX.PNEXT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { memPutLong(struct + VkImportSemaphoreFdInfoKHX.SEMAPHORE, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkImportSemaphoreFdInfoKHX.HANDLETYPE, value); }
    /** Unsafe version of {@link #fd(int) fd}. */
    public static void nfd(long struct, int value) { memPutInt(struct + VkImportSemaphoreFdInfoKHX.FD, value); }

    // -----------------------------------

    /** An array of {@link VkImportSemaphoreFdInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkImportSemaphoreFdInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImportSemaphoreFdInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportSemaphoreFdInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkImportSemaphoreFdInfoKHX newInstance(long address) {
            return new VkImportSemaphoreFdInfoKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkImportSemaphoreFdInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkImportSemaphoreFdInfoKHX.npNext(address()); }
        /** Returns the value of the {@code semaphore} field. */
        public long semaphore() { return VkImportSemaphoreFdInfoKHX.nsemaphore(address()); }
        /** Returns the value of the {@code handleType} field. */
        public int handleType() { return VkImportSemaphoreFdInfoKHX.nhandleType(address()); }
        /** Returns the value of the {@code fd} field. */
        public int fd() { return VkImportSemaphoreFdInfoKHX.nfd(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImportSemaphoreFdInfoKHX.Buffer sType(int value) { VkImportSemaphoreFdInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImportSemaphoreFdInfoKHX.Buffer pNext(long value) { VkImportSemaphoreFdInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code semaphore} field. */
        public VkImportSemaphoreFdInfoKHX.Buffer semaphore(long value) { VkImportSemaphoreFdInfoKHX.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkImportSemaphoreFdInfoKHX.Buffer handleType(int value) { VkImportSemaphoreFdInfoKHX.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@code fd} field. */
        public VkImportSemaphoreFdInfoKHX.Buffer fd(int value) { VkImportSemaphoreFdInfoKHX.nfd(address(), value); return this; }

    }

}