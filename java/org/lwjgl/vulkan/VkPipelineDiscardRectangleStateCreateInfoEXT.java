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
 * Structure specifying discard rectangle.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code discardRectangleCount} <b>must</b> be between 0 and {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT}{@code ::maxDiscardRectangles}, inclusive</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDiscardRectangles#VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code discardRectangleMode} <b>must</b> be a valid {@code VkDiscardRectangleModeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code discardRectangleMode} &ndash; the mode used to determine whether fragments that lie within the discard rectangle are discarded or not.</li>
 * <li>{@code discardRectangleCount} &ndash; the number of discard rectangles used by the pipeline.</li>
 * <li>{@code pDiscardRectangles} &ndash; a pointer to an array of {@link VkRect2D} structures, defining the discard rectangles. If the discard rectangle state is dynamic, this member is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPipelineDiscardRectangleStateCreateInfoEXT {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineDiscardRectangleStateCreateFlagsEXT flags;
 *     VkDiscardRectangleModeEXT discardRectangleMode;
 *     uint32_t discardRectangleCount;
 *     const {@link VkRect2D VkRect2D} * pDiscardRectangles;
 * }</pre></code>
 */
public class VkPipelineDiscardRectangleStateCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DISCARDRECTANGLEMODE,
        DISCARDRECTANGLECOUNT,
        PDISCARDRECTANGLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DISCARDRECTANGLEMODE = layout.offsetof(3);
        DISCARDRECTANGLECOUNT = layout.offsetof(4);
        PDISCARDRECTANGLES = layout.offsetof(5);
    }

    VkPipelineDiscardRectangleStateCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPipelineDiscardRectangleStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineDiscardRectangleStateCreateInfoEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code discardRectangleMode} field. */
    @NativeType("VkDiscardRectangleModeEXT")
    public int discardRectangleMode() { return ndiscardRectangleMode(address()); }
    /** Returns the value of the {@code discardRectangleCount} field. */
    @NativeType("uint32_t")
    public int discardRectangleCount() { return ndiscardRectangleCount(address()); }
    /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pDiscardRectangles} field. */
    @NativeType("const VkRect2D *")
    public VkRect2D.Buffer pDiscardRectangles() { return npDiscardRectangles(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT flags(@NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code discardRectangleMode} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleMode(@NativeType("VkDiscardRectangleModeEXT") int value) { ndiscardRectangleMode(address(), value); return this; }
    /** Sets the specified value to the {@code discardRectangleCount} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleCount(@NativeType("uint32_t") int value) { ndiscardRectangleCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDiscardRectangles} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT pDiscardRectangles(@NativeType("const VkRect2D *") VkRect2D.Buffer value) { npDiscardRectangles(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        int discardRectangleMode,
        int discardRectangleCount,
        VkRect2D.Buffer pDiscardRectangles
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        discardRectangleMode(discardRectangleMode);
        discardRectangleCount(discardRectangleCount);
        pDiscardRectangles(pDiscardRectangles);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineDiscardRectangleStateCreateInfoEXT set(VkPipelineDiscardRectangleStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT create() {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT create(long address) {
        return address == NULL ? null : new VkPipelineDiscardRectangleStateCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #discardRectangleMode}. */
    public static int ndiscardRectangleMode(long struct) { return memGetInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLEMODE); }
    /** Unsafe version of {@link #discardRectangleCount}. */
    public static int ndiscardRectangleCount(long struct) { return memGetInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLECOUNT); }
    /** Unsafe version of {@link #pDiscardRectangles}. */
    public static VkRect2D.Buffer npDiscardRectangles(long struct) { return VkRect2D.create(memGetAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PDISCARDRECTANGLES), ndiscardRectangleCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #discardRectangleMode(int) discardRectangleMode}. */
    public static void ndiscardRectangleMode(long struct, int value) { memPutInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLEMODE, value); }
    /** Sets the specified value to the {@code discardRectangleCount} field of the specified {@code struct}. */
    public static void ndiscardRectangleCount(long struct, int value) { memPutInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLECOUNT, value); }
    /** Unsafe version of {@link #pDiscardRectangles(VkRect2D.Buffer) pDiscardRectangles}. */
    public static void npDiscardRectangles(long struct, VkRect2D.Buffer value) { memPutAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PDISCARDRECTANGLES, memAddressSafe(value)); if (value != null) { ndiscardRectangleCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPipelineDiscardRectangleStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineDiscardRectangleStateCreateInfoEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineDiscardRectangleStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineDiscardRectangleStateCreateInfoEXT newInstance(long address) {
            return new VkPipelineDiscardRectangleStateCreateInfoEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineDiscardRectangleStateCreateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkPipelineDiscardRectangleStateCreateInfoEXT.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT")
        public int flags() { return VkPipelineDiscardRectangleStateCreateInfoEXT.nflags(address()); }
        /** Returns the value of the {@code discardRectangleMode} field. */
        @NativeType("VkDiscardRectangleModeEXT")
        public int discardRectangleMode() { return VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleMode(address()); }
        /** Returns the value of the {@code discardRectangleCount} field. */
        @NativeType("uint32_t")
        public int discardRectangleCount() { return VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleCount(address()); }
        /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pDiscardRectangles} field. */
        @NativeType("const VkRect2D *")
        public VkRect2D.Buffer pDiscardRectangles() { return VkPipelineDiscardRectangleStateCreateInfoEXT.npDiscardRectangles(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer pNext(@NativeType("const void *") long value) { VkPipelineDiscardRectangleStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer flags(@NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code discardRectangleMode} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer discardRectangleMode(@NativeType("VkDiscardRectangleModeEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleMode(address(), value); return this; }
        /** Sets the specified value to the {@code discardRectangleCount} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer discardRectangleCount(@NativeType("uint32_t") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDiscardRectangles} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer pDiscardRectangles(@NativeType("const VkRect2D *") VkRect2D.Buffer value) { VkPipelineDiscardRectangleStateCreateInfoEXT.npDiscardRectangles(address(), value); return this; }

    }

}