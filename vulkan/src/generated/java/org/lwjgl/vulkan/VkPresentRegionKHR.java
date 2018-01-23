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
 * Structure containing rectangular region changed by vkQueuePresentKHR for a given VkImage.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>If {@code rectangleCount} is not 0, and {@code pRectangles} is not {@code NULL}, {@code pRectangles} <b>must</b> be a valid pointer to an array of {@code rectangleCount} {@link VkRectLayerKHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPresentRegionsKHR}, {@link VkRectLayerKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code rectangleCount} &ndash; the number of rectangles in {@code pRectangles}, or zero if the entire image has changed and should be presented.</li>
 * <li>{@code pRectangles} &ndash; either {@code NULL} or a pointer to an array of {@link VkRectLayerKHR} structures. The {@link VkRectLayerKHR} structure is the framebuffer coordinates, plus layer, of a portion of a presentable image that has changed and <b>must</b> be presented. If non-{@code NULL}, each entry in {@code pRectangles} is a rectangle of the given image that has changed since the last image was presented to the given swapchain.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPresentRegionKHR {
 *     uint32_t rectangleCount;
 *     const {@link VkRectLayerKHR VkRectLayerKHR} * pRectangles;
 * }</pre></code>
 */
public class VkPresentRegionKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RECTANGLECOUNT,
        PRECTANGLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RECTANGLECOUNT = layout.offsetof(0);
        PRECTANGLES = layout.offsetof(1);
    }

    VkPresentRegionKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPresentRegionKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentRegionKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code rectangleCount} field. */
    @NativeType("uint32_t")
    public int rectangleCount() { return nrectangleCount(address()); }
    /** Returns a {@link VkRectLayerKHR.Buffer} view of the struct array pointed to by the {@code pRectangles} field. */
    @Nullable
    @NativeType("const VkRectLayerKHR *")
    public VkRectLayerKHR.Buffer pRectangles() { return npRectangles(address()); }

    /** Sets the specified value to the {@code rectangleCount} field. */
    public VkPresentRegionKHR rectangleCount(@NativeType("uint32_t") int value) { nrectangleCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkRectLayerKHR.Buffer} to the {@code pRectangles} field. */
    public VkPresentRegionKHR pRectangles(@Nullable @NativeType("const VkRectLayerKHR *") VkRectLayerKHR.Buffer value) { npRectangles(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentRegionKHR set(
        int rectangleCount,
        VkRectLayerKHR.Buffer pRectangles
    ) {
        rectangleCount(rectangleCount);
        pRectangles(pRectangles);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentRegionKHR set(VkPresentRegionKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPresentRegionKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentRegionKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPresentRegionKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentRegionKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPresentRegionKHR} instance allocated with {@link BufferUtils}. */
    public static VkPresentRegionKHR create() {
        return new VkPresentRegionKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPresentRegionKHR} instance for the specified memory address. */
    public static VkPresentRegionKHR create(long address) {
        return new VkPresentRegionKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentRegionKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPresentRegionKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentRegionKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPresentRegionKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPresentRegionKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPresentRegionKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPresentRegionKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPresentRegionKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentRegionKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPresentRegionKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentRegionKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rectangleCount}. */
    public static int nrectangleCount(long struct) { return memGetInt(struct + VkPresentRegionKHR.RECTANGLECOUNT); }
    /** Unsafe version of {@link #pRectangles}. */
    @Nullable public static VkRectLayerKHR.Buffer npRectangles(long struct) { return VkRectLayerKHR.createSafe(memGetAddress(struct + VkPresentRegionKHR.PRECTANGLES), nrectangleCount(struct)); }

    /** Sets the specified value to the {@code rectangleCount} field of the specified {@code struct}. */
    public static void nrectangleCount(long struct, int value) { memPutInt(struct + VkPresentRegionKHR.RECTANGLECOUNT, value); }
    /** Unsafe version of {@link #pRectangles(VkRectLayerKHR.Buffer) pRectangles}. */
    public static void npRectangles(long struct, @Nullable VkRectLayerKHR.Buffer value) { memPutAddress(struct + VkPresentRegionKHR.PRECTANGLES, memAddressSafe(value)); if (value != null) { nrectangleCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPresentRegionKHR} structs. */
    public static class Buffer extends StructBuffer<VkPresentRegionKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPresentRegionKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentRegionKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPresentRegionKHR newInstance(long address) {
            return new VkPresentRegionKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code rectangleCount} field. */
        @NativeType("uint32_t")
        public int rectangleCount() { return VkPresentRegionKHR.nrectangleCount(address()); }
        /** Returns a {@link VkRectLayerKHR.Buffer} view of the struct array pointed to by the {@code pRectangles} field. */
        @Nullable
        @NativeType("const VkRectLayerKHR *")
        public VkRectLayerKHR.Buffer pRectangles() { return VkPresentRegionKHR.npRectangles(address()); }

        /** Sets the specified value to the {@code rectangleCount} field. */
        public VkPresentRegionKHR.Buffer rectangleCount(@NativeType("uint32_t") int value) { VkPresentRegionKHR.nrectangleCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkRectLayerKHR.Buffer} to the {@code pRectangles} field. */
        public VkPresentRegionKHR.Buffer pRectangles(@Nullable @NativeType("const VkRectLayerKHR *") VkRectLayerKHR.Buffer value) { VkPresentRegionKHR.npRectangles(address(), value); return this; }

    }

}