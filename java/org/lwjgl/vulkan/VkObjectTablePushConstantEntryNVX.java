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
 * Parameters of an object table push constant entry.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be a valid {@code VkObjectEntryTypeNVX} value</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * <li>{@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * <li>{@code stageFlags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code pipelineLayout} &ndash; specifies the {@code VkPipelineLayout} that the pushconstants are used with</li>
 * <li>{@code stageFlags} &ndash; specifies the {@code VkShaderStageFlags} that the pushconstants are used with</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkObjectTablePushConstantEntryNVX {
 *     VkObjectEntryTypeNVX type;
 *     VkObjectEntryUsageFlagsNVX flags;
 *     VkPipelineLayout pipelineLayout;
 *     VkShaderStageFlags stageFlags;
 * }</pre></code>
 */
public class VkObjectTablePushConstantEntryNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        FLAGS,
        PIPELINELAYOUT,
        STAGEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        PIPELINELAYOUT = layout.offsetof(2);
        STAGEFLAGS = layout.offsetof(3);
    }

    VkObjectTablePushConstantEntryNVX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkObjectTablePushConstantEntryNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkObjectTablePushConstantEntryNVX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("VkObjectEntryTypeNVX")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkObjectEntryUsageFlagsNVX")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code pipelineLayout} field. */
    @NativeType("VkPipelineLayout")
    public long pipelineLayout() { return npipelineLayout(address()); }
    /** Returns the value of the {@code stageFlags} field. */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public VkObjectTablePushConstantEntryNVX type(@NativeType("VkObjectEntryTypeNVX") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkObjectTablePushConstantEntryNVX flags(@NativeType("VkObjectEntryUsageFlagsNVX") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineLayout} field. */
    public VkObjectTablePushConstantEntryNVX pipelineLayout(@NativeType("VkPipelineLayout") long value) { npipelineLayout(address(), value); return this; }
    /** Sets the specified value to the {@code stageFlags} field. */
    public VkObjectTablePushConstantEntryNVX stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkObjectTablePushConstantEntryNVX set(
        int type,
        int flags,
        long pipelineLayout,
        int stageFlags
    ) {
        type(type);
        flags(flags);
        pipelineLayout(pipelineLayout);
        stageFlags(stageFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkObjectTablePushConstantEntryNVX set(VkObjectTablePushConstantEntryNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkObjectTablePushConstantEntryNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkObjectTablePushConstantEntryNVX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkObjectTablePushConstantEntryNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkObjectTablePushConstantEntryNVX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkObjectTablePushConstantEntryNVX} instance allocated with {@link BufferUtils}. */
    public static VkObjectTablePushConstantEntryNVX create() {
        return new VkObjectTablePushConstantEntryNVX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkObjectTablePushConstantEntryNVX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkObjectTablePushConstantEntryNVX create(long address) {
        return address == NULL ? null : new VkObjectTablePushConstantEntryNVX(address, null);
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkObjectTablePushConstantEntryNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkObjectTablePushConstantEntryNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkObjectTablePushConstantEntryNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkObjectTablePushConstantEntryNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkObjectTablePushConstantEntryNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkObjectTablePushConstantEntryNVX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkObjectTablePushConstantEntryNVX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkObjectTablePushConstantEntryNVX.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkObjectTablePushConstantEntryNVX.FLAGS); }
    /** Unsafe version of {@link #pipelineLayout}. */
    public static long npipelineLayout(long struct) { return memGetLong(struct + VkObjectTablePushConstantEntryNVX.PIPELINELAYOUT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return memGetInt(struct + VkObjectTablePushConstantEntryNVX.STAGEFLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkObjectTablePushConstantEntryNVX.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkObjectTablePushConstantEntryNVX.FLAGS, value); }
    /** Unsafe version of {@link #pipelineLayout(long) pipelineLayout}. */
    public static void npipelineLayout(long struct, long value) { memPutLong(struct + VkObjectTablePushConstantEntryNVX.PIPELINELAYOUT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { memPutInt(struct + VkObjectTablePushConstantEntryNVX.STAGEFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkObjectTablePushConstantEntryNVX} structs. */
    public static class Buffer extends StructBuffer<VkObjectTablePushConstantEntryNVX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkObjectTablePushConstantEntryNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkObjectTablePushConstantEntryNVX newInstance(long address) {
            return new VkObjectTablePushConstantEntryNVX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("VkObjectEntryTypeNVX")
        public int type() { return VkObjectTablePushConstantEntryNVX.ntype(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkObjectEntryUsageFlagsNVX")
        public int flags() { return VkObjectTablePushConstantEntryNVX.nflags(address()); }
        /** Returns the value of the {@code pipelineLayout} field. */
        @NativeType("VkPipelineLayout")
        public long pipelineLayout() { return VkObjectTablePushConstantEntryNVX.npipelineLayout(address()); }
        /** Returns the value of the {@code stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkObjectTablePushConstantEntryNVX.nstageFlags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public VkObjectTablePushConstantEntryNVX.Buffer type(@NativeType("VkObjectEntryTypeNVX") int value) { VkObjectTablePushConstantEntryNVX.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkObjectTablePushConstantEntryNVX.Buffer flags(@NativeType("VkObjectEntryUsageFlagsNVX") int value) { VkObjectTablePushConstantEntryNVX.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineLayout} field. */
        public VkObjectTablePushConstantEntryNVX.Buffer pipelineLayout(@NativeType("VkPipelineLayout") long value) { VkObjectTablePushConstantEntryNVX.npipelineLayout(address(), value); return this; }
        /** Sets the specified value to the {@code stageFlags} field. */
        public VkObjectTablePushConstantEntryNVX.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkObjectTablePushConstantEntryNVX.nstageFlags(address(), value); return this; }

    }

}