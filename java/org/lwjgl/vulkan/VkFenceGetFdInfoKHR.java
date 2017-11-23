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
 * Structure describing a POSIX FD fence export operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The properties of the file descriptor returned depend on the value of {@code handleType}. See {@code VkExternalFenceHandleTypeFlagBitsKHR} for a description of the properties of the defined external fence handle types.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportFenceCreateInfoKHR}{@code ::handleTypes} when {@code fence}&#8217;s current payload was created.</li>
 * <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code fence} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-fences-signaling">fence signal operation</a> pending execution.</li>
 * <li>{@code fence} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-fences-importing">Importing Fence Payloads</a> unless that imported payload&#8217;s handle type was included in {@link VkExternalFencePropertiesKHR}{@code ::exportFromImportedHandleTypes} for {@code handleType}.</li>
 * <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalFenceFd#VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalFenceHandleTypeFlagBitsKHR} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalFenceFd#vkGetFenceFdKHR GetFenceFdKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code fence} &ndash; the fence from which state will be exported.</li>
 * <li>{@code handleType} &ndash; the type of handle requested.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkFenceGetFdInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkFence fence;
 *     VkExternalFenceHandleTypeFlagBitsKHR handleType;
 * }</pre></code>
 */
public class VkFenceGetFdInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FENCE,
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
        FENCE = layout.offsetof(2);
        HANDLETYPE = layout.offsetof(3);
    }

    VkFenceGetFdInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkFenceGetFdInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFenceGetFdInfoKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code fence} field. */
    @NativeType("VkFence")
    public long fence() { return nfence(address()); }
    /** Returns the value of the {@code handleType} field. */
    @NativeType("VkExternalFenceHandleTypeFlagBitsKHR")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFenceGetFdInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFenceGetFdInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fence} field. */
    public VkFenceGetFdInfoKHR fence(@NativeType("VkFence") long value) { nfence(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkFenceGetFdInfoKHR handleType(@NativeType("VkExternalFenceHandleTypeFlagBitsKHR") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFenceGetFdInfoKHR set(
        int sType,
        long pNext,
        long fence,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        fence(fence);
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
    public VkFenceGetFdInfoKHR set(VkFenceGetFdInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkFenceGetFdInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFenceGetFdInfoKHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkFenceGetFdInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFenceGetFdInfoKHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkFenceGetFdInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkFenceGetFdInfoKHR create() {
        return new VkFenceGetFdInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkFenceGetFdInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkFenceGetFdInfoKHR create(long address) {
        return address == NULL ? null : new VkFenceGetFdInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkFenceGetFdInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkFenceGetFdInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkFenceGetFdInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkFenceGetFdInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkFenceGetFdInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFenceGetFdInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFenceGetFdInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkFenceGetFdInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFenceGetFdInfoKHR.PNEXT); }
    /** Unsafe version of {@link #fence}. */
    public static long nfence(long struct) { return memGetLong(struct + VkFenceGetFdInfoKHR.FENCE); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkFenceGetFdInfoKHR.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkFenceGetFdInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFenceGetFdInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #fence(long) fence}. */
    public static void nfence(long struct, long value) { memPutLong(struct + VkFenceGetFdInfoKHR.FENCE, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkFenceGetFdInfoKHR.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkFenceGetFdInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkFenceGetFdInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkFenceGetFdInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFenceGetFdInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkFenceGetFdInfoKHR newInstance(long address) {
            return new VkFenceGetFdInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFenceGetFdInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkFenceGetFdInfoKHR.npNext(address()); }
        /** Returns the value of the {@code fence} field. */
        @NativeType("VkFence")
        public long fence() { return VkFenceGetFdInfoKHR.nfence(address()); }
        /** Returns the value of the {@code handleType} field. */
        @NativeType("VkExternalFenceHandleTypeFlagBitsKHR")
        public int handleType() { return VkFenceGetFdInfoKHR.nhandleType(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFenceGetFdInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkFenceGetFdInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFenceGetFdInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkFenceGetFdInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fence} field. */
        public VkFenceGetFdInfoKHR.Buffer fence(@NativeType("VkFence") long value) { VkFenceGetFdInfoKHR.nfence(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkFenceGetFdInfoKHR.Buffer handleType(@NativeType("VkExternalFenceHandleTypeFlagBitsKHR") int value) { VkFenceGetFdInfoKHR.nhandleType(address(), value); return this; }

    }

}