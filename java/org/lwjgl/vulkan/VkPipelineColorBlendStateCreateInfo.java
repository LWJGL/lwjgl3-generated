/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created pipeline color blend state.
 * 
 * <h5>Description</h5>
 * 
 * <p>Each element of the {@code pAttachments} array is a {@link VkPipelineColorBlendAttachmentState} structure specifying per-target blending state for each individual color attachment. If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-independentBlend">independent blending</a> feature is not enabled on the device, all {@link VkPipelineColorBlendAttachmentState} elements in the {@code pAttachments} array <b>must</b> be identical.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-independentBlend">independent blending</a> feature is not enabled, all elements of {@code pAttachments} <b>must</b> be identical</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-logicOp">logic operations</a> feature is not enabled, {@code logicOpEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code logicOpEnable} is {@link VK10#VK_TRUE TRUE}, {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a pointer to an array of {@code attachmentCount} valid {@link VkPipelineColorBlendAttachmentState} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsPipelineCreateInfo}, {@link VkPipelineColorBlendAttachmentState}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code logicOpEnable} &ndash; controls whether to apply <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#framebuffer-logicop">Logical Operations</a>.</li>
 * <li>{@code logicOp} &ndash; selects which logical operation to apply.</li>
 * <li>{@code attachmentCount} &ndash; the number of {@link VkPipelineColorBlendAttachmentState} elements in {@code pAttachments}. This value <b>must</b> equal the {@code colorAttachmentCount} for the subpass in which this pipeline is used.</li>
 * <li>{@code pAttachments} &ndash; a pointer to array of per target attachment states.</li>
 * <li>{@code blendConstants} &ndash; an array of four values used as the R, G, B, and A components of the blend constant that are used in blending, depending on the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#framebuffer-blendfactors">blend factor</a>.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPipelineColorBlendStateCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineColorBlendStateCreateFlags flags;
 *     VkBool32 logicOpEnable;
 *     VkLogicOp logicOp;
 *     uint32_t attachmentCount;
 *     const {@link VkPipelineColorBlendAttachmentState VkPipelineColorBlendAttachmentState} * pAttachments;
 *     float blendConstants[4];
 * }</pre></code>
 */
public class VkPipelineColorBlendStateCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        LOGICOPENABLE,
        LOGICOP,
        ATTACHMENTCOUNT,
        PATTACHMENTS,
        BLENDCONSTANTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        LOGICOPENABLE = layout.offsetof(3);
        LOGICOP = layout.offsetof(4);
        ATTACHMENTCOUNT = layout.offsetof(5);
        PATTACHMENTS = layout.offsetof(6);
        BLENDCONSTANTS = layout.offsetof(7);
    }

    VkPipelineColorBlendStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPipelineColorBlendStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineColorBlendStateCreateInfo(ByteBuffer container) {
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
    /** Returns the value of the {@code logicOpEnable} field. */
    public boolean logicOpEnable() { return nlogicOpEnable(address()) != 0; }
    /** Returns the value of the {@code logicOp} field. */
    public int logicOp() { return nlogicOp(address()); }
    /** Returns the value of the {@code attachmentCount} field. */
    public int attachmentCount() { return nattachmentCount(address()); }
    /** Returns a {@link VkPipelineColorBlendAttachmentState.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
    public VkPipelineColorBlendAttachmentState.Buffer pAttachments() { return npAttachments(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code blendConstants} field. */
    public FloatBuffer blendConstants() { return nblendConstants(address()); }
    /** Returns the value at the specified index of the {@code blendConstants} field. */
    public float blendConstants(int index) { return nblendConstants(address(), index); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineColorBlendStateCreateInfo sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineColorBlendStateCreateInfo pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineColorBlendStateCreateInfo flags(int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code logicOpEnable} field. */
    public VkPipelineColorBlendStateCreateInfo logicOpEnable(boolean value) { nlogicOpEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code logicOp} field. */
    public VkPipelineColorBlendStateCreateInfo logicOp(int value) { nlogicOp(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineColorBlendAttachmentState.Buffer} to the {@code pAttachments} field. */
    public VkPipelineColorBlendStateCreateInfo pAttachments(VkPipelineColorBlendAttachmentState.Buffer value) { npAttachments(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code blendConstants} field. */
    public VkPipelineColorBlendStateCreateInfo blendConstants(FloatBuffer value) { nblendConstants(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code blendConstants} field. */
    public VkPipelineColorBlendStateCreateInfo blendConstants(int index, float value) { nblendConstants(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineColorBlendStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        boolean logicOpEnable,
        int logicOp,
        VkPipelineColorBlendAttachmentState.Buffer pAttachments,
        FloatBuffer blendConstants
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        logicOpEnable(logicOpEnable);
        logicOp(logicOp);
        pAttachments(pAttachments);
        blendConstants(blendConstants);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineColorBlendStateCreateInfo set(VkPipelineColorBlendStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineColorBlendStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendStateCreateInfo malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkPipelineColorBlendStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendStateCreateInfo calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkPipelineColorBlendStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineColorBlendStateCreateInfo create() {
        return new VkPipelineColorBlendStateCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPipelineColorBlendStateCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPipelineColorBlendStateCreateInfo create(long address) {
        return address == NULL ? null : new VkPipelineColorBlendStateCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineColorBlendStateCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineColorBlendStateCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPipelineColorBlendStateCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineColorBlendStateCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendStateCreateInfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendStateCreateInfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineColorBlendStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineColorBlendStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineColorBlendStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #logicOpEnable}. */
    public static int nlogicOpEnable(long struct) { return memGetInt(struct + VkPipelineColorBlendStateCreateInfo.LOGICOPENABLE); }
    /** Unsafe version of {@link #logicOp}. */
    public static int nlogicOp(long struct) { return memGetInt(struct + VkPipelineColorBlendStateCreateInfo.LOGICOP); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return memGetInt(struct + VkPipelineColorBlendStateCreateInfo.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments}. */
    public static VkPipelineColorBlendAttachmentState.Buffer npAttachments(long struct) { return VkPipelineColorBlendAttachmentState.create(memGetAddress(struct + VkPipelineColorBlendStateCreateInfo.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #blendConstants}. */
    public static FloatBuffer nblendConstants(long struct) { return memFloatBuffer(struct + VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS, 4); }
    /** Unsafe version of {@link #blendConstants(int) blendConstants}. */
    public static float nblendConstants(long struct, int index) {
        if (CHECKS) { check(index, 4); }
        return memGetFloat(struct + VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS + index * 4);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineColorBlendStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineColorBlendStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineColorBlendStateCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #logicOpEnable(boolean) logicOpEnable}. */
    public static void nlogicOpEnable(long struct, int value) { memPutInt(struct + VkPipelineColorBlendStateCreateInfo.LOGICOPENABLE, value); }
    /** Unsafe version of {@link #logicOp(int) logicOp}. */
    public static void nlogicOp(long struct, int value) { memPutInt(struct + VkPipelineColorBlendStateCreateInfo.LOGICOP, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkPipelineColorBlendStateCreateInfo.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(VkPipelineColorBlendAttachmentState.Buffer) pAttachments}. */
    public static void npAttachments(long struct, VkPipelineColorBlendAttachmentState.Buffer value) { memPutAddress(struct + VkPipelineColorBlendStateCreateInfo.PATTACHMENTS, addressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #blendConstants(FloatBuffer) blendConstants}. */
    public static void nblendConstants(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #blendConstants(int, float) blendConstants}. */
    public static void nblendConstants(long struct, int index, float value) {
        if (CHECKS) { check(index, 4); }
        memPutFloat(struct + VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS + index * 4, value);
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineColorBlendStateCreateInfo.PATTACHMENTS));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineColorBlendStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineColorBlendStateCreateInfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineColorBlendStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineColorBlendStateCreateInfo newInstance(long address) {
            return new VkPipelineColorBlendStateCreateInfo(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkPipelineColorBlendStateCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkPipelineColorBlendStateCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        public int flags() { return VkPipelineColorBlendStateCreateInfo.nflags(address()); }
        /** Returns the value of the {@code logicOpEnable} field. */
        public boolean logicOpEnable() { return VkPipelineColorBlendStateCreateInfo.nlogicOpEnable(address()) != 0; }
        /** Returns the value of the {@code logicOp} field. */
        public int logicOp() { return VkPipelineColorBlendStateCreateInfo.nlogicOp(address()); }
        /** Returns the value of the {@code attachmentCount} field. */
        public int attachmentCount() { return VkPipelineColorBlendStateCreateInfo.nattachmentCount(address()); }
        /** Returns a {@link VkPipelineColorBlendAttachmentState.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
        public VkPipelineColorBlendAttachmentState.Buffer pAttachments() { return VkPipelineColorBlendStateCreateInfo.npAttachments(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code blendConstants} field. */
        public FloatBuffer blendConstants() { return VkPipelineColorBlendStateCreateInfo.nblendConstants(address()); }
        /** Returns the value at the specified index of the {@code blendConstants} field. */
        public float blendConstants(int index) { return VkPipelineColorBlendStateCreateInfo.nblendConstants(address(), index); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer sType(int value) { VkPipelineColorBlendStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer pNext(long value) { VkPipelineColorBlendStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer flags(int value) { VkPipelineColorBlendStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code logicOpEnable} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer logicOpEnable(boolean value) { VkPipelineColorBlendStateCreateInfo.nlogicOpEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code logicOp} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer logicOp(int value) { VkPipelineColorBlendStateCreateInfo.nlogicOp(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineColorBlendAttachmentState.Buffer} to the {@code pAttachments} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer pAttachments(VkPipelineColorBlendAttachmentState.Buffer value) { VkPipelineColorBlendStateCreateInfo.npAttachments(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code blendConstants} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer blendConstants(FloatBuffer value) { VkPipelineColorBlendStateCreateInfo.nblendConstants(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code blendConstants} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer blendConstants(int index, float value) { VkPipelineColorBlendStateCreateInfo.nblendConstants(address(), index, value); return this; }

    }

}