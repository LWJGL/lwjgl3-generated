/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VRTextureWithDepth_t {
 *     {@link VRTextureDepthInfo VRTextureDepthInfo_t} depth;
 * }</pre></code>
 */
@NativeType("struct VRTextureWithDepth_t")
public class VRTextureWithDepth extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DEPTH;

    static {
        Layout layout = __struct(
            __member(VRTextureDepthInfo.SIZEOF, VRTextureDepthInfo.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DEPTH = layout.offsetof(0);
    }

    VRTextureWithDepth(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VRTextureWithDepth} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRTextureWithDepth(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VRTextureDepthInfo} view of the {@code depth} field. */
    @NativeType("VRTextureDepthInfo_t")
    public VRTextureDepthInfo depth() { return ndepth(address()); }

    /** Copies the specified {@link VRTextureDepthInfo} to the {@code depth} field. */
    public VRTextureWithDepth depth(@NativeType("VRTextureDepthInfo_t") VRTextureDepthInfo value) { ndepth(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRTextureWithDepth set(VRTextureWithDepth src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VRTextureWithDepth} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRTextureWithDepth malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VRTextureWithDepth} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRTextureWithDepth calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VRTextureWithDepth} instance allocated with {@link BufferUtils}. */
    public static VRTextureWithDepth create() {
        return new VRTextureWithDepth(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VRTextureWithDepth} instance for the specified memory address. */
    public static VRTextureWithDepth create(long address) {
        return new VRTextureWithDepth(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRTextureWithDepth createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VRTextureWithDepth.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRTextureWithDepth.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VRTextureWithDepth} instance allocated on the thread-local {@link MemoryStack}. */
    public static VRTextureWithDepth mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VRTextureWithDepth} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VRTextureWithDepth callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VRTextureWithDepth} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithDepth mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VRTextureWithDepth} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithDepth callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #depth}. */
    public static VRTextureDepthInfo ndepth(long struct) { return VRTextureDepthInfo.create(struct + VRTextureWithDepth.DEPTH); }

    /** Unsafe version of {@link #depth(VRTextureDepthInfo) depth}. */
    public static void ndepth(long struct, VRTextureDepthInfo value) { memCopy(value.address(), struct + VRTextureWithDepth.DEPTH, VRTextureDepthInfo.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        VRTextureDepthInfo.validate(struct + VRTextureWithDepth.DEPTH);
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

    /** An array of {@link VRTextureWithDepth} structs. */
    public static class Buffer extends StructBuffer<VRTextureWithDepth, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VRTextureWithDepth.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRTextureWithDepth#SIZEOF}, and its mark will be undefined.
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
        protected VRTextureWithDepth newInstance(long address) {
            return new VRTextureWithDepth(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link VRTextureDepthInfo} view of the {@code depth} field. */
        @NativeType("VRTextureDepthInfo_t")
        public VRTextureDepthInfo depth() { return VRTextureWithDepth.ndepth(address()); }

        /** Copies the specified {@link VRTextureDepthInfo} to the {@code depth} field. */
        public VRTextureWithDepth.Buffer depth(@NativeType("VRTextureDepthInfo_t") VRTextureDepthInfo value) { VRTextureWithDepth.ndepth(address(), value); return this; }

    }

}