/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A single vertex in a render model.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code vPosition} &ndash; position in meters in device space</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct RenderModel_Vertex_t {
 *     {@link HmdVector3 HmdVector3_t} vPosition;
 *     {@link HmdVector3 HmdVector3_t} vNormal;
 *     float rfTextureCoord[2];
 * }</pre></code>
 */
@NativeType("struct RenderModel_Vertex_t")
public class RenderModelVertex extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VPOSITION,
        VNORMAL,
        RFTEXTURECOORD;

    static {
        Layout layout = __struct(
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __array(4, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VPOSITION = layout.offsetof(0);
        VNORMAL = layout.offsetof(1);
        RFTEXTURECOORD = layout.offsetof(2);
    }

    RenderModelVertex(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link RenderModelVertex} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RenderModelVertex(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdVector3} view of the {@code vPosition} field. */
    @NativeType("HmdVector3_t")
    public HmdVector3 vPosition() { return nvPosition(address()); }
    /** Returns a {@link HmdVector3} view of the {@code vNormal} field. */
    @NativeType("HmdVector3_t")
    public HmdVector3 vNormal() { return nvNormal(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code rfTextureCoord} field. */
    @NativeType("float[2]")
    public FloatBuffer rfTextureCoord() { return nrfTextureCoord(address()); }
    /** Returns the value at the specified index of the {@code rfTextureCoord} field. */
    public float rfTextureCoord(int index) { return nrfTextureCoord(address(), index); }

    // -----------------------------------

    /** Returns a new {@link RenderModelVertex} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RenderModelVertex malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link RenderModelVertex} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RenderModelVertex calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link RenderModelVertex} instance allocated with {@link BufferUtils}. */
    public static RenderModelVertex create() {
        return new RenderModelVertex(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link RenderModelVertex} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static RenderModelVertex create(long address) {
        return address == NULL ? null : new RenderModelVertex(address, null);
    }

    /**
     * Returns a new {@link RenderModelVertex.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelVertex.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelVertex.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link RenderModelVertex.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link RenderModelVertex} instance allocated on the thread-local {@link MemoryStack}. */
    public static RenderModelVertex mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link RenderModelVertex} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static RenderModelVertex callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link RenderModelVertex} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModelVertex mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link RenderModelVertex} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModelVertex callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RenderModelVertex.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModelVertex.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModelVertex.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelVertex.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vPosition}. */
    public static HmdVector3 nvPosition(long struct) { return HmdVector3.create(struct + RenderModelVertex.VPOSITION); }
    /** Unsafe version of {@link #vNormal}. */
    public static HmdVector3 nvNormal(long struct) { return HmdVector3.create(struct + RenderModelVertex.VNORMAL); }
    /** Unsafe version of {@link #rfTextureCoord}. */
    public static FloatBuffer nrfTextureCoord(long struct) { return memFloatBuffer(struct + RenderModelVertex.RFTEXTURECOORD, 2); }
    /** Unsafe version of {@link #rfTextureCoord(int) rfTextureCoord}. */
    public static float nrfTextureCoord(long struct, int index) {
        if (CHECKS) { check(index, 2); }
        return memGetFloat(struct + RenderModelVertex.RFTEXTURECOORD + index * 4);
    }

    // -----------------------------------

    /** An array of {@link RenderModelVertex} structs. */
    public static class Buffer extends StructBuffer<RenderModelVertex, Buffer> implements NativeResource {

        /**
         * Creates a new {@link RenderModelVertex.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RenderModelVertex#SIZEOF}, and its mark will be undefined.
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
        protected RenderModelVertex newInstance(long address) {
            return new RenderModelVertex(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link HmdVector3} view of the {@code vPosition} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vPosition() { return RenderModelVertex.nvPosition(address()); }
        /** Returns a {@link HmdVector3} view of the {@code vNormal} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vNormal() { return RenderModelVertex.nvNormal(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code rfTextureCoord} field. */
        @NativeType("float[2]")
        public FloatBuffer rfTextureCoord() { return RenderModelVertex.nrfTextureCoord(address()); }
        /** Returns the value at the specified index of the {@code rfTextureCoord} field. */
        public float rfTextureCoord(int index) { return RenderModelVertex.nrfTextureCoord(address(), index); }

    }

}