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
 * Structure describing a Win32 handle semaphore export operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalMemoryHandleTypeFlagBitsKHR} for a description of the properties of the defined external memory handle types.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportMemoryAllocateInfoKHR}{@code ::handleTypes} when {@code memory} was created.</li>
 * <li>If {@code handleType} is defined as an NT handle, {@link KHRExternalMemoryWin32#vkGetMemoryWin32HandleKHR GetMemoryWin32HandleKHR} <b>must</b> be called no more than once for each valid unique combination of {@code memory} and {@code handleType}.</li>
 * <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHR} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalMemoryWin32#vkGetMemoryWin32HandleKHR GetMemoryWin32HandleKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code memory} &ndash; the memory object from which the handle will be exported.</li>
 * <li>{@code handleType} &ndash; the type of handle requested.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkMemoryGetWin32HandleInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDeviceMemory memory;
 *     VkExternalMemoryHandleTypeFlagBitsKHR handleType;
 * }</pre></code>
 */
public class VkMemoryGetWin32HandleInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORY,
        HANDLETYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        HANDLETYPE = layout.offsetof(3);
    }

    VkMemoryGetWin32HandleInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkMemoryGetWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryGetWin32HandleInfoKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** Returns the value of the {@code handleType} field. */
    @NativeType("VkExternalMemoryHandleTypeFlagBitsKHR")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryGetWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryGetWin32HandleInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkMemoryGetWin32HandleInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkMemoryGetWin32HandleInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBitsKHR") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryGetWin32HandleInfoKHR set(
        int sType,
        long pNext,
        long memory,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        memory(memory);
        handleType(handleType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryGetWin32HandleInfoKHR set(VkMemoryGetWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryGetWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryGetWin32HandleInfoKHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkMemoryGetWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryGetWin32HandleInfoKHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkMemoryGetWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryGetWin32HandleInfoKHR create() {
        return new VkMemoryGetWin32HandleInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkMemoryGetWin32HandleInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkMemoryGetWin32HandleInfoKHR create(long address) {
        return address == NULL ? null : new VkMemoryGetWin32HandleInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryGetWin32HandleInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMemoryGetWin32HandleInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkMemoryGetWin32HandleInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMemoryGetWin32HandleInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetWin32HandleInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetWin32HandleInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryGetWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryGetWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkMemoryGetWin32HandleInfoKHR.MEMORY); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkMemoryGetWin32HandleInfoKHR.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryGetWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryGetWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkMemoryGetWin32HandleInfoKHR.MEMORY, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkMemoryGetWin32HandleInfoKHR.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryGetWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryGetWin32HandleInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryGetWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryGetWin32HandleInfoKHR newInstance(long address) {
            return new VkMemoryGetWin32HandleInfoKHR(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryGetWin32HandleInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkMemoryGetWin32HandleInfoKHR.npNext(address()); }
        /** Returns the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMemoryGetWin32HandleInfoKHR.nmemory(address()); }
        /** Returns the value of the {@code handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBitsKHR")
        public int handleType() { return VkMemoryGetWin32HandleInfoKHR.nhandleType(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryGetWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkMemoryGetWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryGetWin32HandleInfoKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBitsKHR") int value) { VkMemoryGetWin32HandleInfoKHR.nhandleType(address(), value); return this; }

    }

}