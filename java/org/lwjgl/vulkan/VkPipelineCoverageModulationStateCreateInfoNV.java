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
 * Structure specifying parameters controlling coverage modulation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code coverageModulationTableEnable} is {@link VK10#VK_FALSE FALSE}, then for each color sample the associated bits of the fragment's coverage are counted and divided by the number of associated bits to produce a modulation factor</p><code>R</code>
 * 
 * <p>in the range</p><code>(0,1]</code>
 * 
 * <p>(a value of zero would have been killed due to a color coverage of 0). Specifically:</p>
 * 
 * <ul>
 * <li><code>N</code>
 * 
 * <p>= value of {@code rasterizationSamples}</p></li>
 * <li><code>M</code>
 * 
 * <p>= value of {@link VkAttachmentDescription}{@code ::samples} for any color attachments</p></li>
 * <li><code>R = popcount(associated coverage bits) / (N / M)</code></li>
 * </ul>
 * 
 * <p>If {@code coverageModulationTableEnable} is {@link VK10#VK_TRUE TRUE}, the value</p><code>R</code>
 * 
 * <p>is computed using a programmable lookup table. The lookup table has</p><code>N / M</code>
 * 
 * <p>elements, and the element of the table is selected by:</p>
 * 
 * <ul>
 * <li><code>R = pCoverageModulationTable[popcount(associated coverage bits)-1]</code></li>
 * </ul>
 * 
 * <p>Note that the table does not have an entry for</p><code>popcount(associated coverage bits) = 0</code>
 * 
 * <p>, because such samples would have been killed.</p>
 * 
 * <p>The values of {@code pCoverageModulationTable} <b>may</b> be rounded to an implementation-dependent precision, which is at least as fine as</p><code>1 / N</code>
 * 
 * <p>, and clamped to</p><code>[0,1]</code>
 * 
 * <p>.</p>
 * 
 * <p>For each color attachment with a floating point or normalized color format, each fragment output color value is replicated to</p><code>M</code>
 * 
 * <p>values which <b>can</b> each be modulated (multiplied) by that color sample's associated value of</p><code>R</code>
 * 
 * <p>. Which components are modulated is controlled by {@code coverageModulationMode}.</p>
 * 
 * <p>If this structure is not present, it is as if coverageModulationMode is {@link NVFramebufferMixedSamples#VK_COVERAGE_MODULATION_MODE_NONE_NV COVERAGE_MODULATION_MODE_NONE_NV}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code coverageModulationTableEnable} is {@link VK10#VK_TRUE TRUE}, {@code coverageModulationTableCount} <b>must</b> be equal to the number of rasterization samples divided by the number of color samples in the subpass.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVFramebufferMixedSamples#VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code coverageModulationMode} <b>must</b> be a valid {@code VkCoverageModulationModeNV} value</li>
 * <li>{@code coverageModulationTableCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code coverageModulationMode} &ndash; controls which color components are modulated and is of type {@code VkCoverageModulationModeNV}.</li>
 * <li>{@code coverageModulationTableEnable} &ndash; controls whether the modulation factor is looked up from a table in {@code pCoverageModulationTable}.</li>
 * <li>{@code coverageModulationTableCount} &ndash; the number of elements in {@code pCoverageModulationTable}.</li>
 * <li>{@code pCoverageModulationTable} &ndash; a table of modulation factors containing a value for each number of covered samples.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPipelineCoverageModulationStateCreateInfoNV {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineCoverageModulationStateCreateFlagsNV flags;
 *     VkCoverageModulationModeNV coverageModulationMode;
 *     VkBool32 coverageModulationTableEnable;
 *     uint32_t coverageModulationTableCount;
 *     const float * pCoverageModulationTable;
 * }</pre></code>
 */
public class VkPipelineCoverageModulationStateCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        COVERAGEMODULATIONMODE,
        COVERAGEMODULATIONTABLEENABLE,
        COVERAGEMODULATIONTABLECOUNT,
        PCOVERAGEMODULATIONTABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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
        COVERAGEMODULATIONMODE = layout.offsetof(3);
        COVERAGEMODULATIONTABLEENABLE = layout.offsetof(4);
        COVERAGEMODULATIONTABLECOUNT = layout.offsetof(5);
        PCOVERAGEMODULATIONTABLE = layout.offsetof(6);
    }

    VkPipelineCoverageModulationStateCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPipelineCoverageModulationStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCoverageModulationStateCreateInfoNV(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code coverageModulationMode} field. */
    public int coverageModulationMode() { return ncoverageModulationMode(address()); }
    /** Returns the value of the {@code coverageModulationTableEnable} field. */
    public boolean coverageModulationTableEnable() { return ncoverageModulationTableEnable(address()) != 0; }
    /** Returns the value of the {@code coverageModulationTableCount} field. */
    public int coverageModulationTableCount() { return ncoverageModulationTableCount(address()); }
    /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code pCoverageModulationTable} field. */
    public FloatBuffer pCoverageModulationTable() { return npCoverageModulationTable(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV flags(int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code coverageModulationMode} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationMode(int value) { ncoverageModulationMode(address(), value); return this; }
    /** Sets the specified value to the {@code coverageModulationTableEnable} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableEnable(boolean value) { ncoverageModulationTableEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code coverageModulationTableCount} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableCount(int value) { ncoverageModulationTableCount(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code pCoverageModulationTable} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV pCoverageModulationTable(FloatBuffer value) { npCoverageModulationTable(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCoverageModulationStateCreateInfoNV set(
        int sType,
        long pNext,
        int flags,
        int coverageModulationMode,
        boolean coverageModulationTableEnable,
        int coverageModulationTableCount,
        FloatBuffer pCoverageModulationTable
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        coverageModulationMode(coverageModulationMode);
        coverageModulationTableEnable(coverageModulationTableEnable);
        coverageModulationTableCount(coverageModulationTableCount);
        pCoverageModulationTable(pCoverageModulationTable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCoverageModulationStateCreateInfoNV set(VkPipelineCoverageModulationStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCoverageModulationStateCreateInfoNV malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCoverageModulationStateCreateInfoNV calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCoverageModulationStateCreateInfoNV create() {
        return new VkPipelineCoverageModulationStateCreateInfoNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPipelineCoverageModulationStateCreateInfoNV create(long address) {
        return address == NULL ? null : new VkPipelineCoverageModulationStateCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineCoverageModulationStateCreateInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineCoverageModulationStateCreateInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCoverageModulationStateCreateInfoNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCoverageModulationStateCreateInfoNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineCoverageModulationStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCoverageModulationStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineCoverageModulationStateCreateInfoNV.FLAGS); }
    /** Unsafe version of {@link #coverageModulationMode}. */
    public static int ncoverageModulationMode(long struct) { return memGetInt(struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONMODE); }
    /** Unsafe version of {@link #coverageModulationTableEnable}. */
    public static int ncoverageModulationTableEnable(long struct) { return memGetInt(struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONTABLEENABLE); }
    /** Unsafe version of {@link #coverageModulationTableCount}. */
    public static int ncoverageModulationTableCount(long struct) { return memGetInt(struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONTABLECOUNT); }
    /** Unsafe version of {@link #pCoverageModulationTable() pCoverageModulationTable}. */
    public static FloatBuffer npCoverageModulationTable(long struct) { return memFloatBuffer(memGetAddress(struct + VkPipelineCoverageModulationStateCreateInfoNV.PCOVERAGEMODULATIONTABLE), ncoverageModulationTableCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineCoverageModulationStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCoverageModulationStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineCoverageModulationStateCreateInfoNV.FLAGS, value); }
    /** Unsafe version of {@link #coverageModulationMode(int) coverageModulationMode}. */
    public static void ncoverageModulationMode(long struct, int value) { memPutInt(struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONMODE, value); }
    /** Unsafe version of {@link #coverageModulationTableEnable(boolean) coverageModulationTableEnable}. */
    public static void ncoverageModulationTableEnable(long struct, int value) { memPutInt(struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONTABLEENABLE, value); }
    /** Sets the specified value to the {@code coverageModulationTableCount} field of the specified {@code struct}. */
    public static void ncoverageModulationTableCount(long struct, int value) { memPutInt(struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONTABLECOUNT, value); }
    /** Unsafe version of {@link #pCoverageModulationTable(FloatBuffer) pCoverageModulationTable}. */
    public static void npCoverageModulationTable(long struct, FloatBuffer value) { memPutAddress(struct + VkPipelineCoverageModulationStateCreateInfoNV.PCOVERAGEMODULATIONTABLE, memAddressSafe(value)); if (value != null) { ncoverageModulationTableCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPipelineCoverageModulationStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCoverageModulationStateCreateInfoNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCoverageModulationStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineCoverageModulationStateCreateInfoNV newInstance(long address) {
            return new VkPipelineCoverageModulationStateCreateInfoNV(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkPipelineCoverageModulationStateCreateInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkPipelineCoverageModulationStateCreateInfoNV.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        public int flags() { return VkPipelineCoverageModulationStateCreateInfoNV.nflags(address()); }
        /** Returns the value of the {@code coverageModulationMode} field. */
        public int coverageModulationMode() { return VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationMode(address()); }
        /** Returns the value of the {@code coverageModulationTableEnable} field. */
        public boolean coverageModulationTableEnable() { return VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableEnable(address()) != 0; }
        /** Returns the value of the {@code coverageModulationTableCount} field. */
        public int coverageModulationTableCount() { return VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableCount(address()); }
        /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code pCoverageModulationTable} field. */
        public FloatBuffer pCoverageModulationTable() { return VkPipelineCoverageModulationStateCreateInfoNV.npCoverageModulationTable(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer sType(int value) { VkPipelineCoverageModulationStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer pNext(long value) { VkPipelineCoverageModulationStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer flags(int value) { VkPipelineCoverageModulationStateCreateInfoNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code coverageModulationMode} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer coverageModulationMode(int value) { VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationMode(address(), value); return this; }
        /** Sets the specified value to the {@code coverageModulationTableEnable} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer coverageModulationTableEnable(boolean value) { VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code coverageModulationTableCount} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer coverageModulationTableCount(int value) { VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableCount(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code pCoverageModulationTable} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer pCoverageModulationTable(FloatBuffer value) { VkPipelineCoverageModulationStateCreateInfoNV.npCoverageModulationTable(address(), value); return this; }

    }

}