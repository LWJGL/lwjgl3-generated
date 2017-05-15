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
 * Structure specifying values for Direct3D 12 fence-backed semaphores.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the semaphore in {@link VkSubmitInfo}{@code ::pWaitSemaphores} or {@link VkSubmitInfo}{@code ::pSignalSemaphore} corresponding to an entry in {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} respectively does not currently have state imported from a Direct3D 12 fence, the value in the {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} entry is ignored.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code waitSemaphoreValuesCount} <b>must</b> be the same value as {@link VkSubmitInfo}{@code ::waitSemaphoreCount}, where {@code SubmitInfo} is in the {@code pNext} chain of this {@link VkD3D12FenceSubmitInfoKHX} structure.</li>
 * <li>{@code signalSemaphoreValuesCount} <b>must</b> be the same value as {@link VkSubmitInfo}{@code ::signalSemaphoreCount}, where {@code SubmitInfo} is in the {@code pNext} chain of this {@link VkD3D12FenceSubmitInfoKHX} structure.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXExternalSemaphoreWin32#VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHX STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHX}</li>
 * <li>If {@code waitSemaphoreValuesCount} is not 0, and {@code pWaitSemaphoreValues} is not {@code NULL}, {@code pWaitSemaphoreValues} <b>must</b> be a pointer to an array of {@code waitSemaphoreValuesCount} {@code uint64_t} values</li>
 * <li>If {@code signalSemaphoreValuesCount} is not 0, and {@code pSignalSemaphoreValues} is not {@code NULL}, {@code pSignalSemaphoreValues} <b>must</b> be a pointer to an array of {@code signalSemaphoreValuesCount} {@code uint64_t} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code waitSemaphoreValuesCount} &ndash; the number of semaphore wait values specified in {@code pWaitSemaphoreValues}.</li>
 * <li>{@code pWaitSemaphoreValues} &ndash; an array of length {@code waitSemaphoreValuesCount} containing values for the corresponding semaphores in {@link VkSubmitInfo}{@code ::pWaitSemaphores} to wait for.</li>
 * <li>{@code signalSemaphoreValuesCount} &ndash; the number of semaphore signal values specified in {@code pSignalSemaphoreValues}.</li>
 * <li>{@code pSignalSemaphoreValues} &ndash; an array of length {@code signalSemaphoreValuesCount} containing values for the corresponding semaphores in {@link VkSubmitInfo}{@code ::pSignalSemaphores} to set when signaled.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkD3D12FenceSubmitInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t waitSemaphoreValuesCount;
 *     const uint64_t * pWaitSemaphoreValues;
 *     uint32_t signalSemaphoreValuesCount;
 *     const uint64_t * pSignalSemaphoreValues;
 * }</pre></code>
 */
public class VkD3D12FenceSubmitInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WAITSEMAPHOREVALUESCOUNT,
        PWAITSEMAPHOREVALUES,
        SIGNALSEMAPHOREVALUESCOUNT,
        PSIGNALSEMAPHOREVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHOREVALUESCOUNT = layout.offsetof(2);
        PWAITSEMAPHOREVALUES = layout.offsetof(3);
        SIGNALSEMAPHOREVALUESCOUNT = layout.offsetof(4);
        PSIGNALSEMAPHOREVALUES = layout.offsetof(5);
    }

    VkD3D12FenceSubmitInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkD3D12FenceSubmitInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkD3D12FenceSubmitInfoKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code waitSemaphoreValuesCount} field. */
    public int waitSemaphoreValuesCount() { return nwaitSemaphoreValuesCount(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphoreValues} field. */
    public LongBuffer pWaitSemaphoreValues() { return npWaitSemaphoreValues(address()); }
    /** Returns the value of the {@code signalSemaphoreValuesCount} field. */
    public int signalSemaphoreValuesCount() { return nsignalSemaphoreValuesCount(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphoreValues} field. */
    public LongBuffer pSignalSemaphoreValues() { return npSignalSemaphoreValues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkD3D12FenceSubmitInfoKHX sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkD3D12FenceSubmitInfoKHX pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code waitSemaphoreValuesCount} field. */
    public VkD3D12FenceSubmitInfoKHX waitSemaphoreValuesCount(int value) { nwaitSemaphoreValuesCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphoreValues} field. */
    public VkD3D12FenceSubmitInfoKHX pWaitSemaphoreValues(LongBuffer value) { npWaitSemaphoreValues(address(), value); return this; }
    /** Sets the specified value to the {@code signalSemaphoreValuesCount} field. */
    public VkD3D12FenceSubmitInfoKHX signalSemaphoreValuesCount(int value) { nsignalSemaphoreValuesCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphoreValues} field. */
    public VkD3D12FenceSubmitInfoKHX pSignalSemaphoreValues(LongBuffer value) { npSignalSemaphoreValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkD3D12FenceSubmitInfoKHX set(
        int sType,
        long pNext,
        int waitSemaphoreValuesCount,
        LongBuffer pWaitSemaphoreValues,
        int signalSemaphoreValuesCount,
        LongBuffer pSignalSemaphoreValues
    ) {
        sType(sType);
        pNext(pNext);
        waitSemaphoreValuesCount(waitSemaphoreValuesCount);
        pWaitSemaphoreValues(pWaitSemaphoreValues);
        signalSemaphoreValuesCount(signalSemaphoreValuesCount);
        pSignalSemaphoreValues(pSignalSemaphoreValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkD3D12FenceSubmitInfoKHX set(VkD3D12FenceSubmitInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkD3D12FenceSubmitInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkD3D12FenceSubmitInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkD3D12FenceSubmitInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkD3D12FenceSubmitInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkD3D12FenceSubmitInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkD3D12FenceSubmitInfoKHX create() {
        return new VkD3D12FenceSubmitInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkD3D12FenceSubmitInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkD3D12FenceSubmitInfoKHX create(long address) {
        return address == NULL ? null : new VkD3D12FenceSubmitInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkD3D12FenceSubmitInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkD3D12FenceSubmitInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkD3D12FenceSubmitInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkD3D12FenceSubmitInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkD3D12FenceSubmitInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkD3D12FenceSubmitInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkD3D12FenceSubmitInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkD3D12FenceSubmitInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkD3D12FenceSubmitInfoKHX.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreValuesCount}. */
    public static int nwaitSemaphoreValuesCount(long struct) { return memGetInt(struct + VkD3D12FenceSubmitInfoKHX.WAITSEMAPHOREVALUESCOUNT); }
    /** Unsafe version of {@link #pWaitSemaphoreValues() pWaitSemaphoreValues}. */
    public static LongBuffer npWaitSemaphoreValues(long struct) { return memLongBuffer(memGetAddress(struct + VkD3D12FenceSubmitInfoKHX.PWAITSEMAPHOREVALUES), nwaitSemaphoreValuesCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreValuesCount}. */
    public static int nsignalSemaphoreValuesCount(long struct) { return memGetInt(struct + VkD3D12FenceSubmitInfoKHX.SIGNALSEMAPHOREVALUESCOUNT); }
    /** Unsafe version of {@link #pSignalSemaphoreValues() pSignalSemaphoreValues}. */
    public static LongBuffer npSignalSemaphoreValues(long struct) { return memLongBuffer(memGetAddress(struct + VkD3D12FenceSubmitInfoKHX.PSIGNALSEMAPHOREVALUES), nsignalSemaphoreValuesCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkD3D12FenceSubmitInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkD3D12FenceSubmitInfoKHX.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreValuesCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreValuesCount(long struct, int value) { memPutInt(struct + VkD3D12FenceSubmitInfoKHX.WAITSEMAPHOREVALUESCOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphoreValues(LongBuffer) pWaitSemaphoreValues}. */
    public static void npWaitSemaphoreValues(long struct, LongBuffer value) { memPutAddress(struct + VkD3D12FenceSubmitInfoKHX.PWAITSEMAPHOREVALUES, memAddressSafe(value)); if (value != null) { nwaitSemaphoreValuesCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code signalSemaphoreValuesCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreValuesCount(long struct, int value) { memPutInt(struct + VkD3D12FenceSubmitInfoKHX.SIGNALSEMAPHOREVALUESCOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphoreValues(LongBuffer) pSignalSemaphoreValues}. */
    public static void npSignalSemaphoreValues(long struct, LongBuffer value) { memPutAddress(struct + VkD3D12FenceSubmitInfoKHX.PSIGNALSEMAPHOREVALUES, memAddressSafe(value)); if (value != null) { nsignalSemaphoreValuesCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkD3D12FenceSubmitInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkD3D12FenceSubmitInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkD3D12FenceSubmitInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkD3D12FenceSubmitInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkD3D12FenceSubmitInfoKHX newInstance(long address) {
            return new VkD3D12FenceSubmitInfoKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkD3D12FenceSubmitInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkD3D12FenceSubmitInfoKHX.npNext(address()); }
        /** Returns the value of the {@code waitSemaphoreValuesCount} field. */
        public int waitSemaphoreValuesCount() { return VkD3D12FenceSubmitInfoKHX.nwaitSemaphoreValuesCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphoreValues} field. */
        public LongBuffer pWaitSemaphoreValues() { return VkD3D12FenceSubmitInfoKHX.npWaitSemaphoreValues(address()); }
        /** Returns the value of the {@code signalSemaphoreValuesCount} field. */
        public int signalSemaphoreValuesCount() { return VkD3D12FenceSubmitInfoKHX.nsignalSemaphoreValuesCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphoreValues} field. */
        public LongBuffer pSignalSemaphoreValues() { return VkD3D12FenceSubmitInfoKHX.npSignalSemaphoreValues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkD3D12FenceSubmitInfoKHX.Buffer sType(int value) { VkD3D12FenceSubmitInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkD3D12FenceSubmitInfoKHX.Buffer pNext(long value) { VkD3D12FenceSubmitInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code waitSemaphoreValuesCount} field. */
        public VkD3D12FenceSubmitInfoKHX.Buffer waitSemaphoreValuesCount(int value) { VkD3D12FenceSubmitInfoKHX.nwaitSemaphoreValuesCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphoreValues} field. */
        public VkD3D12FenceSubmitInfoKHX.Buffer pWaitSemaphoreValues(LongBuffer value) { VkD3D12FenceSubmitInfoKHX.npWaitSemaphoreValues(address(), value); return this; }
        /** Sets the specified value to the {@code signalSemaphoreValuesCount} field. */
        public VkD3D12FenceSubmitInfoKHX.Buffer signalSemaphoreValuesCount(int value) { VkD3D12FenceSubmitInfoKHX.nsignalSemaphoreValuesCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphoreValues} field. */
        public VkD3D12FenceSubmitInfoKHX.Buffer pSignalSemaphoreValues(LongBuffer value) { VkD3D12FenceSubmitInfoKHX.npSignalSemaphoreValues(address(), value); return this; }

    }

}