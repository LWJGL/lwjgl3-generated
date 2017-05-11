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
 * Specify the surface counters desired.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The bits in {@code surfaceCounters} <b>must</b> be supported by {@link VkSwapchainCreateInfoKHR}{@code ::surface}, as reported by {@link EXTDisplaySurfaceCounter#vkGetPhysicalDeviceSurfaceCapabilities2EXT GetPhysicalDeviceSurfaceCapabilities2EXT}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDisplayControl#VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code surfaceCounters} <b>must</b> be a valid combination of {@code VkSurfaceCounterFlagBitsEXT} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code surfaceCounters} &ndash; a bitmask containing a bit set for each surface counter to enable for the swapchain.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSwapchainCounterCreateInfoEXT {
    VkStructureType sType;
    const void * pNext;
    VkSurfaceCounterFlagsEXT surfaceCounters;
}</code></pre>
 */
public class VkSwapchainCounterCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SURFACECOUNTERS;

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
        SURFACECOUNTERS = layout.offsetof(2);
    }

    VkSwapchainCounterCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSwapchainCounterCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainCounterCreateInfoEXT(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code surfaceCounters} field. */
    public int surfaceCounters() { return nsurfaceCounters(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSwapchainCounterCreateInfoEXT sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainCounterCreateInfoEXT pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code surfaceCounters} field. */
    public VkSwapchainCounterCreateInfoEXT surfaceCounters(int value) { nsurfaceCounters(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainCounterCreateInfoEXT set(
        int sType,
        long pNext,
        int surfaceCounters
    ) {
        sType(sType);
        pNext(pNext);
        surfaceCounters(surfaceCounters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainCounterCreateInfoEXT set(VkSwapchainCounterCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkSwapchainCounterCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainCounterCreateInfoEXT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkSwapchainCounterCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainCounterCreateInfoEXT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkSwapchainCounterCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainCounterCreateInfoEXT create() {
        return new VkSwapchainCounterCreateInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkSwapchainCounterCreateInfoEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkSwapchainCounterCreateInfoEXT create(long address) {
        return address == NULL ? null : new VkSwapchainCounterCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkSwapchainCounterCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSwapchainCounterCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkSwapchainCounterCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSwapchainCounterCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCounterCreateInfoEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCounterCreateInfoEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSwapchainCounterCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainCounterCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #surfaceCounters}. */
    public static int nsurfaceCounters(long struct) { return memGetInt(struct + VkSwapchainCounterCreateInfoEXT.SURFACECOUNTERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainCounterCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainCounterCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #surfaceCounters(int) surfaceCounters}. */
    public static void nsurfaceCounters(long struct, int value) { memPutInt(struct + VkSwapchainCounterCreateInfoEXT.SURFACECOUNTERS, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainCounterCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainCounterCreateInfoEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainCounterCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkSwapchainCounterCreateInfoEXT newInstance(long address) {
            return new VkSwapchainCounterCreateInfoEXT(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkSwapchainCounterCreateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkSwapchainCounterCreateInfoEXT.npNext(address()); }
        /** Returns the value of the {@code surfaceCounters} field. */
        public int surfaceCounters() { return VkSwapchainCounterCreateInfoEXT.nsurfaceCounters(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainCounterCreateInfoEXT.Buffer sType(int value) { VkSwapchainCounterCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainCounterCreateInfoEXT.Buffer pNext(long value) { VkSwapchainCounterCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code surfaceCounters} field. */
        public VkSwapchainCounterCreateInfoEXT.Buffer surfaceCounters(int value) { VkSwapchainCounterCreateInfoEXT.nsurfaceCounters(address(), value); return this; }

    }

}