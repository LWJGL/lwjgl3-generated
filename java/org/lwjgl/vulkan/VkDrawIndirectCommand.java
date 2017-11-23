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
 * Structure specifying a draw indirect command.
 * 
 * <h5>Description</h5>
 * 
 * <p>The members of {@link VkDrawIndirectCommand} have the same meaning as the similarly named parameters of {@link VK10#vkCmdDraw CmdDraw}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#fxvertex-input">the “Vertex Input Description” section</a></li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, {@code firstInstance} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCmdDrawIndirect CmdDrawIndirect}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code vertexCount} &ndash; the number of vertices to draw.</li>
 * <li>{@code instanceCount} &ndash; the number of instances to draw.</li>
 * <li>{@code firstVertex} &ndash; the index of the first vertex to draw.</li>
 * <li>{@code firstInstance} &ndash; the instance ID of the first instance to draw.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDrawIndirectCommand {
 *     uint32_t vertexCount;
 *     uint32_t instanceCount;
 *     uint32_t firstVertex;
 *     uint32_t firstInstance;
 * }</pre></code>
 */
public class VkDrawIndirectCommand extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERTEXCOUNT,
        INSTANCECOUNT,
        FIRSTVERTEX,
        FIRSTINSTANCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERTEXCOUNT = layout.offsetof(0);
        INSTANCECOUNT = layout.offsetof(1);
        FIRSTVERTEX = layout.offsetof(2);
        FIRSTINSTANCE = layout.offsetof(3);
    }

    VkDrawIndirectCommand(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDrawIndirectCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrawIndirectCommand(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code vertexCount} field. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }
    /** Returns the value of the {@code instanceCount} field. */
    @NativeType("uint32_t")
    public int instanceCount() { return ninstanceCount(address()); }
    /** Returns the value of the {@code firstVertex} field. */
    @NativeType("uint32_t")
    public int firstVertex() { return nfirstVertex(address()); }
    /** Returns the value of the {@code firstInstance} field. */
    @NativeType("uint32_t")
    public int firstInstance() { return nfirstInstance(address()); }

    /** Sets the specified value to the {@code vertexCount} field. */
    public VkDrawIndirectCommand vertexCount(@NativeType("uint32_t") int value) { nvertexCount(address(), value); return this; }
    /** Sets the specified value to the {@code instanceCount} field. */
    public VkDrawIndirectCommand instanceCount(@NativeType("uint32_t") int value) { ninstanceCount(address(), value); return this; }
    /** Sets the specified value to the {@code firstVertex} field. */
    public VkDrawIndirectCommand firstVertex(@NativeType("uint32_t") int value) { nfirstVertex(address(), value); return this; }
    /** Sets the specified value to the {@code firstInstance} field. */
    public VkDrawIndirectCommand firstInstance(@NativeType("uint32_t") int value) { nfirstInstance(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrawIndirectCommand set(
        int vertexCount,
        int instanceCount,
        int firstVertex,
        int firstInstance
    ) {
        vertexCount(vertexCount);
        instanceCount(instanceCount);
        firstVertex(firstVertex);
        firstInstance(firstInstance);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDrawIndirectCommand set(VkDrawIndirectCommand src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDrawIndirectCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrawIndirectCommand malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkDrawIndirectCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrawIndirectCommand calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkDrawIndirectCommand} instance allocated with {@link BufferUtils}. */
    public static VkDrawIndirectCommand create() {
        return new VkDrawIndirectCommand(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDrawIndirectCommand} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkDrawIndirectCommand create(long address) {
        return address == NULL ? null : new VkDrawIndirectCommand(address, null);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDrawIndirectCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDrawIndirectCommand} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDrawIndirectCommand mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDrawIndirectCommand} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDrawIndirectCommand callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndirectCommand mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndirectCommand callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertexCount}. */
    public static int nvertexCount(long struct) { return memGetInt(struct + VkDrawIndirectCommand.VERTEXCOUNT); }
    /** Unsafe version of {@link #instanceCount}. */
    public static int ninstanceCount(long struct) { return memGetInt(struct + VkDrawIndirectCommand.INSTANCECOUNT); }
    /** Unsafe version of {@link #firstVertex}. */
    public static int nfirstVertex(long struct) { return memGetInt(struct + VkDrawIndirectCommand.FIRSTVERTEX); }
    /** Unsafe version of {@link #firstInstance}. */
    public static int nfirstInstance(long struct) { return memGetInt(struct + VkDrawIndirectCommand.FIRSTINSTANCE); }

    /** Unsafe version of {@link #vertexCount(int) vertexCount}. */
    public static void nvertexCount(long struct, int value) { memPutInt(struct + VkDrawIndirectCommand.VERTEXCOUNT, value); }
    /** Unsafe version of {@link #instanceCount(int) instanceCount}. */
    public static void ninstanceCount(long struct, int value) { memPutInt(struct + VkDrawIndirectCommand.INSTANCECOUNT, value); }
    /** Unsafe version of {@link #firstVertex(int) firstVertex}. */
    public static void nfirstVertex(long struct, int value) { memPutInt(struct + VkDrawIndirectCommand.FIRSTVERTEX, value); }
    /** Unsafe version of {@link #firstInstance(int) firstInstance}. */
    public static void nfirstInstance(long struct, int value) { memPutInt(struct + VkDrawIndirectCommand.FIRSTINSTANCE, value); }

    // -----------------------------------

    /** An array of {@link VkDrawIndirectCommand} structs. */
    public static class Buffer extends StructBuffer<VkDrawIndirectCommand, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDrawIndirectCommand.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrawIndirectCommand#SIZEOF}, and its mark will be undefined.
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
        protected VkDrawIndirectCommand newInstance(long address) {
            return new VkDrawIndirectCommand(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return VkDrawIndirectCommand.nvertexCount(address()); }
        /** Returns the value of the {@code instanceCount} field. */
        @NativeType("uint32_t")
        public int instanceCount() { return VkDrawIndirectCommand.ninstanceCount(address()); }
        /** Returns the value of the {@code firstVertex} field. */
        @NativeType("uint32_t")
        public int firstVertex() { return VkDrawIndirectCommand.nfirstVertex(address()); }
        /** Returns the value of the {@code firstInstance} field. */
        @NativeType("uint32_t")
        public int firstInstance() { return VkDrawIndirectCommand.nfirstInstance(address()); }

        /** Sets the specified value to the {@code vertexCount} field. */
        public VkDrawIndirectCommand.Buffer vertexCount(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.nvertexCount(address(), value); return this; }
        /** Sets the specified value to the {@code instanceCount} field. */
        public VkDrawIndirectCommand.Buffer instanceCount(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.ninstanceCount(address(), value); return this; }
        /** Sets the specified value to the {@code firstVertex} field. */
        public VkDrawIndirectCommand.Buffer firstVertex(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.nfirstVertex(address(), value); return this; }
        /** Sets the specified value to the {@code firstInstance} field. */
        public VkDrawIndirectCommand.Buffer firstInstance(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.nfirstInstance(address(), value); return this; }

    }

}