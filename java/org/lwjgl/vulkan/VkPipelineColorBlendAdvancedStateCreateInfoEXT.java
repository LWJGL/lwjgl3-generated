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
 * Structure specifying parameters that affect advanced blend operations.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, {@code srcPremultiplied} and {@code dstPremultiplied} are both considered to be {@link VK10#VK_TRUE TRUE}, and {@code blendOverlap} is considered to be {@link EXTBlendOperationAdvanced#VK_BLEND_OVERLAP_UNCORRELATED_EXT BLEND_OVERLAP_UNCORRELATED_EXT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-limits-advancedBlendNonPremultipliedSrcColor">non-premultiplied source color</a> property is not supported, {@code srcPremultiplied} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-limits-advancedBlendNonPremultipliedDstColor">non-premultiplied destination color</a> property is not supported, {@code dstPremultiplied} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-limits-advancedBlendCorrelatedOverlap">correlated overlap</a> property is not supported, {@code blendOverlap} <b>must</b> be {@link EXTBlendOperationAdvanced#VK_BLEND_OVERLAP_UNCORRELATED_EXT BLEND_OVERLAP_UNCORRELATED_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code blendOverlap} <b>must</b> be a valid {@code VkBlendOverlapEXT} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code srcPremultiplied} &ndash; specifies whether the source color of the blend operation is treated as premultiplied.</li>
 * <li>{@code dstPremultiplied} &ndash; specifies whether the destination color of the blend operation is treated as premultiplied.</li>
 * <li>{@code blendOverlap} &ndash; a {@code VkBlendOverlapEXT} value specifying how the source and destination sample&#8217;s coverage is correlated.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPipelineColorBlendAdvancedStateCreateInfoEXT {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkBool32 srcPremultiplied;
 *     VkBool32 dstPremultiplied;
 *     VkBlendOverlapEXT blendOverlap;
 * }</pre></code>
 */
public class VkPipelineColorBlendAdvancedStateCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCPREMULTIPLIED,
        DSTPREMULTIPLIED,
        BLENDOVERLAP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCPREMULTIPLIED = layout.offsetof(2);
        DSTPREMULTIPLIED = layout.offsetof(3);
        BLENDOVERLAP = layout.offsetof(4);
    }

    VkPipelineColorBlendAdvancedStateCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code srcPremultiplied} field. */
    public boolean srcPremultiplied() { return nsrcPremultiplied(address()) != 0; }
    /** Returns the value of the {@code dstPremultiplied} field. */
    public boolean dstPremultiplied() { return ndstPremultiplied(address()) != 0; }
    /** Returns the value of the {@code blendOverlap} field. */
    public int blendOverlap() { return nblendOverlap(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcPremultiplied} field. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT srcPremultiplied(boolean value) { nsrcPremultiplied(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dstPremultiplied} field. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT dstPremultiplied(boolean value) { ndstPremultiplied(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code blendOverlap} field. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT blendOverlap(int value) { nblendOverlap(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT set(
        int sType,
        long pNext,
        boolean srcPremultiplied,
        boolean dstPremultiplied,
        int blendOverlap
    ) {
        sType(sType);
        pNext(pNext);
        srcPremultiplied(srcPremultiplied);
        dstPremultiplied(dstPremultiplied);
        blendOverlap(blendOverlap);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT set(VkPipelineColorBlendAdvancedStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT create() {
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT create(long address) {
        return address == NULL ? null : new VkPipelineColorBlendAdvancedStateCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #srcPremultiplied}. */
    public static int nsrcPremultiplied(long struct) { return memGetInt(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.SRCPREMULTIPLIED); }
    /** Unsafe version of {@link #dstPremultiplied}. */
    public static int ndstPremultiplied(long struct) { return memGetInt(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.DSTPREMULTIPLIED); }
    /** Unsafe version of {@link #blendOverlap}. */
    public static int nblendOverlap(long struct) { return memGetInt(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.BLENDOVERLAP); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #srcPremultiplied(boolean) srcPremultiplied}. */
    public static void nsrcPremultiplied(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.SRCPREMULTIPLIED, value); }
    /** Unsafe version of {@link #dstPremultiplied(boolean) dstPremultiplied}. */
    public static void ndstPremultiplied(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.DSTPREMULTIPLIED, value); }
    /** Unsafe version of {@link #blendOverlap(int) blendOverlap}. */
    public static void nblendOverlap(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.BLENDOVERLAP, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineColorBlendAdvancedStateCreateInfoEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineColorBlendAdvancedStateCreateInfoEXT newInstance(long address) {
            return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.npNext(address()); }
        /** Returns the value of the {@code srcPremultiplied} field. */
        public boolean srcPremultiplied() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsrcPremultiplied(address()) != 0; }
        /** Returns the value of the {@code dstPremultiplied} field. */
        public boolean dstPremultiplied() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.ndstPremultiplied(address()) != 0; }
        /** Returns the value of the {@code blendOverlap} field. */
        public int blendOverlap() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.nblendOverlap(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer sType(int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer pNext(long value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcPremultiplied} field. */
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer srcPremultiplied(boolean value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsrcPremultiplied(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dstPremultiplied} field. */
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer dstPremultiplied(boolean value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.ndstPremultiplied(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code blendOverlap} field. */
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer blendOverlap(int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.nblendOverlap(address(), value); return this; }

    }

}