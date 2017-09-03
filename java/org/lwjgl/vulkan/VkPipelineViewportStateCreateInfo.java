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
 * Structure specifying parameters of a newly created pipeline viewport state.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 1</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code scissorCount} <b>must</b> be 1</li>
 * <li>{@code viewportCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
 * <li>{@code scissorCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
 * <li>{@code scissorCount} and {@code viewportCount} <b>must</b> be identical</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkPipelineViewportSwizzleStateCreateInfoNV} or {@link VkPipelineViewportWScalingStateCreateInfoNV}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code viewportCount} <b>must</b> be greater than 0</li>
 * <li>{@code scissorCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsPipelineCreateInfo}, {@link VkRect2D}, {@link VkViewport}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code viewportCount} &ndash; the number of viewports used by the pipeline.</li>
 * <li>{@code pViewports} &ndash; a pointer to an array of {@link VkViewport} structures, defining the viewport transforms. If the viewport state is dynamic, this member is ignored.</li>
 * <li>{@code scissorCount} &ndash; the number of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fragops-scissor">scissors</a> and <b>must</b> match the number of viewports.</li>
 * <li>{@code pScissors} &ndash; a pointer to an array of {@link VkRect2D} structures which define the rectangular bounds of the scissor for the corresponding viewport. If the scissor state is dynamic, this member is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPipelineViewportStateCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineViewportStateCreateFlags flags;
 *     uint32_t viewportCount;
 *     const {@link VkViewport VkViewport} * pViewports;
 *     uint32_t scissorCount;
 *     const {@link VkRect2D VkRect2D} * pScissors;
 * }</pre></code>
 */
public class VkPipelineViewportStateCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        VIEWPORTCOUNT,
        PVIEWPORTS,
        SCISSORCOUNT,
        PSCISSORS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIEWPORTCOUNT = layout.offsetof(3);
        PVIEWPORTS = layout.offsetof(4);
        SCISSORCOUNT = layout.offsetof(5);
        PSCISSORS = layout.offsetof(6);
    }

    VkPipelineViewportStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPipelineViewportStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportStateCreateInfo(ByteBuffer container) {
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
    @NativeType("VkPipelineViewportStateCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code viewportCount} field. */
    @NativeType("uint32_t")
    public int viewportCount() { return nviewportCount(address()); }
    /** Returns a {@link VkViewport.Buffer} view of the struct array pointed to by the {@code pViewports} field. */
    @NativeType("const VkViewport *")
    public VkViewport.Buffer pViewports() { return npViewports(address()); }
    /** Returns the value of the {@code scissorCount} field. */
    @NativeType("uint32_t")
    public int scissorCount() { return nscissorCount(address()); }
    /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pScissors} field. */
    @NativeType("const VkRect2D *")
    public VkRect2D.Buffer pScissors() { return npScissors(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineViewportStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineViewportStateCreateInfo pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineViewportStateCreateInfo flags(@NativeType("VkPipelineViewportStateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code viewportCount} field. */
    public VkPipelineViewportStateCreateInfo viewportCount(@NativeType("uint32_t") int value) { nviewportCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkViewport.Buffer} to the {@code pViewports} field. */
    public VkPipelineViewportStateCreateInfo pViewports(@NativeType("const VkViewport *") VkViewport.Buffer value) { npViewports(address(), value); return this; }
    /** Sets the specified value to the {@code scissorCount} field. */
    public VkPipelineViewportStateCreateInfo scissorCount(@NativeType("uint32_t") int value) { nscissorCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pScissors} field. */
    public VkPipelineViewportStateCreateInfo pScissors(@NativeType("const VkRect2D *") VkRect2D.Buffer value) { npScissors(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int viewportCount,
        VkViewport.Buffer pViewports,
        int scissorCount,
        VkRect2D.Buffer pScissors
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        viewportCount(viewportCount);
        pViewports(pViewports);
        scissorCount(scissorCount);
        pScissors(pScissors);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportStateCreateInfo set(VkPipelineViewportStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineViewportStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportStateCreateInfo malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkPipelineViewportStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportStateCreateInfo calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkPipelineViewportStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportStateCreateInfo create() {
        return new VkPipelineViewportStateCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPipelineViewportStateCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPipelineViewportStateCreateInfo create(long address) {
        return address == NULL ? null : new VkPipelineViewportStateCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPipelineViewportStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineViewportStateCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineViewportStateCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPipelineViewportStateCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineViewportStateCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportStateCreateInfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportStateCreateInfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineViewportStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineViewportStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #viewportCount}. */
    public static int nviewportCount(long struct) { return memGetInt(struct + VkPipelineViewportStateCreateInfo.VIEWPORTCOUNT); }
    /** Unsafe version of {@link #pViewports}. */
    public static VkViewport.Buffer npViewports(long struct) { return VkViewport.create(memGetAddress(struct + VkPipelineViewportStateCreateInfo.PVIEWPORTS), nviewportCount(struct)); }
    /** Unsafe version of {@link #scissorCount}. */
    public static int nscissorCount(long struct) { return memGetInt(struct + VkPipelineViewportStateCreateInfo.SCISSORCOUNT); }
    /** Unsafe version of {@link #pScissors}. */
    public static VkRect2D.Buffer npScissors(long struct) { return VkRect2D.create(memGetAddress(struct + VkPipelineViewportStateCreateInfo.PSCISSORS), nscissorCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineViewportStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineViewportStateCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code viewportCount} field of the specified {@code struct}. */
    public static void nviewportCount(long struct, int value) { memPutInt(struct + VkPipelineViewportStateCreateInfo.VIEWPORTCOUNT, value); }
    /** Unsafe version of {@link #pViewports(VkViewport.Buffer) pViewports}. */
    public static void npViewports(long struct, VkViewport.Buffer value) { memPutAddress(struct + VkPipelineViewportStateCreateInfo.PVIEWPORTS, memAddressSafe(value)); if (value != null) { nviewportCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code scissorCount} field of the specified {@code struct}. */
    public static void nscissorCount(long struct, int value) { memPutInt(struct + VkPipelineViewportStateCreateInfo.SCISSORCOUNT, value); }
    /** Unsafe version of {@link #pScissors(VkRect2D.Buffer) pScissors}. */
    public static void npScissors(long struct, VkRect2D.Buffer value) { memPutAddress(struct + VkPipelineViewportStateCreateInfo.PSCISSORS, memAddressSafe(value)); if (value != null) { nscissorCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportStateCreateInfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineViewportStateCreateInfo newInstance(long address) {
            return new VkPipelineViewportStateCreateInfo(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportStateCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkPipelineViewportStateCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkPipelineViewportStateCreateFlags")
        public int flags() { return VkPipelineViewportStateCreateInfo.nflags(address()); }
        /** Returns the value of the {@code viewportCount} field. */
        @NativeType("uint32_t")
        public int viewportCount() { return VkPipelineViewportStateCreateInfo.nviewportCount(address()); }
        /** Returns a {@link VkViewport.Buffer} view of the struct array pointed to by the {@code pViewports} field. */
        @NativeType("const VkViewport *")
        public VkViewport.Buffer pViewports() { return VkPipelineViewportStateCreateInfo.npViewports(address()); }
        /** Returns the value of the {@code scissorCount} field. */
        @NativeType("uint32_t")
        public int scissorCount() { return VkPipelineViewportStateCreateInfo.nscissorCount(address()); }
        /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pScissors} field. */
        @NativeType("const VkRect2D *")
        public VkRect2D.Buffer pScissors() { return VkPipelineViewportStateCreateInfo.npScissors(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineViewportStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineViewportStateCreateInfo.Buffer pNext(@NativeType("const void *") long value) { VkPipelineViewportStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineViewportStateCreateInfo.Buffer flags(@NativeType("VkPipelineViewportStateCreateFlags") int value) { VkPipelineViewportStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code viewportCount} field. */
        public VkPipelineViewportStateCreateInfo.Buffer viewportCount(@NativeType("uint32_t") int value) { VkPipelineViewportStateCreateInfo.nviewportCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkViewport.Buffer} to the {@code pViewports} field. */
        public VkPipelineViewportStateCreateInfo.Buffer pViewports(@NativeType("const VkViewport *") VkViewport.Buffer value) { VkPipelineViewportStateCreateInfo.npViewports(address(), value); return this; }
        /** Sets the specified value to the {@code scissorCount} field. */
        public VkPipelineViewportStateCreateInfo.Buffer scissorCount(@NativeType("uint32_t") int value) { VkPipelineViewportStateCreateInfo.nscissorCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pScissors} field. */
        public VkPipelineViewportStateCreateInfo.Buffer pScissors(@NativeType("const VkRect2D *") VkRect2D.Buffer value) { VkPipelineViewportStateCreateInfo.npScissors(address(), value); return this; }

    }

}