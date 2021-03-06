/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Allocator virtual table
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code realloc} &ndash; the reallocation callback</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_allocator_vtbl_t {
 *     void * (*{@link BGFXReallocCallbackI realloc}) (bgfx_allocator_interface_t *_this, void *_ptr, size_t _size, size_t _align, char *_file, uint32_t _line);
 * }</pre></code>
 */
@NativeType("struct bgfx_allocator_vtbl_t")
public class BGFXAllocatorVtbl extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        REALLOC;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        REALLOC = layout.offsetof(0);
    }

    BGFXAllocatorVtbl(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXAllocatorVtbl} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXAllocatorVtbl(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code realloc} field. */
    @NativeType("void * (*) (bgfx_allocator_interface_t *, void *, size_t, size_t, char *, uint32_t)")
    public BGFXReallocCallback realloc() { return nrealloc(address()); }

    /** Sets the specified value to the {@code realloc} field. */
    public BGFXAllocatorVtbl realloc(@NativeType("void * (*) (bgfx_allocator_interface_t *, void *, size_t, size_t, char *, uint32_t)") BGFXReallocCallbackI value) { nrealloc(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXAllocatorVtbl set(BGFXAllocatorVtbl src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link BGFXAllocatorVtbl} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXAllocatorVtbl malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link BGFXAllocatorVtbl} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXAllocatorVtbl calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link BGFXAllocatorVtbl} instance allocated with {@link BufferUtils}. */
    public static BGFXAllocatorVtbl create() {
        return new BGFXAllocatorVtbl(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link BGFXAllocatorVtbl} instance for the specified memory address. */
    public static BGFXAllocatorVtbl create(long address) {
        return new BGFXAllocatorVtbl(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXAllocatorVtbl createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link BGFXAllocatorVtbl.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXAllocatorVtbl.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link BGFXAllocatorVtbl} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXAllocatorVtbl mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link BGFXAllocatorVtbl} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXAllocatorVtbl callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAllocatorVtbl mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAllocatorVtbl callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #realloc}. */
    public static BGFXReallocCallback nrealloc(long struct) { return BGFXReallocCallback.create(memGetAddress(struct + BGFXAllocatorVtbl.REALLOC)); }

    /** Unsafe version of {@link #realloc(BGFXReallocCallbackI) realloc}. */
    public static void nrealloc(long struct, BGFXReallocCallbackI value) { memPutAddress(struct + BGFXAllocatorVtbl.REALLOC, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + BGFXAllocatorVtbl.REALLOC));
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

    /** An array of {@link BGFXAllocatorVtbl} structs. */
    public static class Buffer extends StructBuffer<BGFXAllocatorVtbl, Buffer> implements NativeResource {

        /**
         * Creates a new {@link BGFXAllocatorVtbl.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXAllocatorVtbl#SIZEOF}, and its mark will be undefined.
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
        protected BGFXAllocatorVtbl newInstance(long address) {
            return new BGFXAllocatorVtbl(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code realloc} field. */
        @NativeType("void * (*) (bgfx_allocator_interface_t *, void *, size_t, size_t, char *, uint32_t)")
        public BGFXReallocCallback realloc() { return BGFXAllocatorVtbl.nrealloc(address()); }

        /** Sets the specified value to the {@code realloc} field. */
        public BGFXAllocatorVtbl.Buffer realloc(@NativeType("void * (*) (bgfx_allocator_interface_t *, void *, size_t, size_t, char *, uint32_t)") BGFXReallocCallbackI value) { BGFXAllocatorVtbl.nrealloc(address(), value); return this; }

    }

}