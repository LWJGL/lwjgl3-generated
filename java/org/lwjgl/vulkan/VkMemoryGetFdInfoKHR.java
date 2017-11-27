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
 * Structure describing a POSIX FD semaphore export operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The properties of the file descriptor exported depend on the value of {@code handleType}. See {@code VkExternalMemoryHandleTypeFlagBitsKHR} for a description of the properties of the defined external memory handle types.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The size of the exported file <b>may</b> be larger than the size requested by {@link VkMemoryAllocateInfo}::allocationSize. If {@code handleType} is {@link EXTExternalMemoryDmaBuf#VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT}, then the application <b>can</b> query the file's actual size with link:man:lseek(2)[lseek(2)].</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportMemoryAllocateInfoKHR}{@code ::handleTypes} when {@code memory} was created.</li>
 * <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryFd#VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHR} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalMemoryFd#vkGetMemoryFdKHR GetMemoryFdKHR}</p>
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
 * struct VkMemoryGetFdInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDeviceMemory memory;
 *     VkExternalMemoryHandleTypeFlagBitsKHR handleType;
 * }</pre></code>
 */
public class VkMemoryGetFdInfoKHR extends Struct implements NativeResource {

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

    VkMemoryGetFdInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkMemoryGetFdInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryGetFdInfoKHR(ByteBuffer container) {
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
    public VkMemoryGetFdInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryGetFdInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkMemoryGetFdInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkMemoryGetFdInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBitsKHR") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryGetFdInfoKHR set(
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
    public VkMemoryGetFdInfoKHR set(VkMemoryGetFdInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryGetFdInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryGetFdInfoKHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkMemoryGetFdInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryGetFdInfoKHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkMemoryGetFdInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryGetFdInfoKHR create() {
        return new VkMemoryGetFdInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkMemoryGetFdInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkMemoryGetFdInfoKHR create(long address) {
        return address == NULL ? null : new VkMemoryGetFdInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkMemoryGetFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetFdInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkMemoryGetFdInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryGetFdInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMemoryGetFdInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkMemoryGetFdInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMemoryGetFdInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkMemoryGetFdInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetFdInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryGetFdInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetFdInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryGetFdInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryGetFdInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryGetFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryGetFdInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryGetFdInfoKHR.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkMemoryGetFdInfoKHR.MEMORY); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkMemoryGetFdInfoKHR.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryGetFdInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryGetFdInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkMemoryGetFdInfoKHR.MEMORY, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkMemoryGetFdInfoKHR.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryGetFdInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryGetFdInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkMemoryGetFdInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryGetFdInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryGetFdInfoKHR newInstance(long address) {
            return new VkMemoryGetFdInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryGetFdInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkMemoryGetFdInfoKHR.npNext(address()); }
        /** Returns the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMemoryGetFdInfoKHR.nmemory(address()); }
        /** Returns the value of the {@code handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBitsKHR")
        public int handleType() { return VkMemoryGetFdInfoKHR.nhandleType(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryGetFdInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryGetFdInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryGetFdInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkMemoryGetFdInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkMemoryGetFdInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryGetFdInfoKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkMemoryGetFdInfoKHR.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBitsKHR") int value) { VkMemoryGetFdInfoKHR.nhandleType(address(), value); return this; }

    }

}