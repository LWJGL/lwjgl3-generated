/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ZSTD_customMem {
 *     {@link ZSTDAllocFunctionI ZSTD_allocFunction} customAlloc;
 *     {@link ZSTDFreeFunctionI ZSTD_freeFunction} customFree;
 *     void * opaque;
 * }</pre></code>
 */
@NativeType("struct ZSTD_customMem")
public class ZSTDCustomMem extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CUSTOMALLOC,
        CUSTOMFREE,
        OPAQUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CUSTOMALLOC = layout.offsetof(0);
        CUSTOMFREE = layout.offsetof(1);
        OPAQUE = layout.offsetof(2);
    }

    ZSTDCustomMem(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link ZSTDCustomMem} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDCustomMem(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code customAlloc} field. */
    @NativeType("ZSTD_allocFunction")
    public ZSTDAllocFunction customAlloc() { return ncustomAlloc(address()); }
    /** Returns the value of the {@code customFree} field. */
    @NativeType("ZSTD_freeFunction")
    public ZSTDFreeFunction customFree() { return ncustomFree(address()); }
    /** Returns the value of the {@code opaque} field. */
    @NativeType("void *")
    public long opaque() { return nopaque(address()); }

    /** Sets the specified value to the {@code customAlloc} field. */
    public ZSTDCustomMem customAlloc(@NativeType("ZSTD_allocFunction") ZSTDAllocFunctionI value) { ncustomAlloc(address(), value); return this; }
    /** Sets the specified value to the {@code customFree} field. */
    public ZSTDCustomMem customFree(@NativeType("ZSTD_freeFunction") ZSTDFreeFunctionI value) { ncustomFree(address(), value); return this; }
    /** Sets the specified value to the {@code opaque} field. */
    public ZSTDCustomMem opaque(@NativeType("void *") long value) { nopaque(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ZSTDCustomMem set(
        ZSTDAllocFunctionI customAlloc,
        ZSTDFreeFunctionI customFree,
        long opaque
    ) {
        customAlloc(customAlloc);
        customFree(customFree);
        opaque(opaque);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ZSTDCustomMem set(ZSTDCustomMem src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link ZSTDCustomMem} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDCustomMem malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link ZSTDCustomMem} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDCustomMem calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link ZSTDCustomMem} instance allocated with {@link BufferUtils}. */
    public static ZSTDCustomMem create() {
        return new ZSTDCustomMem(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link ZSTDCustomMem} instance for the specified memory address. */
    public static ZSTDCustomMem create(long address) {
        return new ZSTDCustomMem(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDCustomMem createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link ZSTDCustomMem.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDCustomMem.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link ZSTDCustomMem} instance allocated on the thread-local {@link MemoryStack}. */
    public static ZSTDCustomMem mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link ZSTDCustomMem} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ZSTDCustomMem callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link ZSTDCustomMem} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDCustomMem mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDCustomMem} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDCustomMem callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #customAlloc}. */
    public static ZSTDAllocFunction ncustomAlloc(long struct) { return ZSTDAllocFunction.create(memGetAddress(struct + ZSTDCustomMem.CUSTOMALLOC)); }
    /** Unsafe version of {@link #customFree}. */
    public static ZSTDFreeFunction ncustomFree(long struct) { return ZSTDFreeFunction.create(memGetAddress(struct + ZSTDCustomMem.CUSTOMFREE)); }
    /** Unsafe version of {@link #opaque}. */
    public static long nopaque(long struct) { return memGetAddress(struct + ZSTDCustomMem.OPAQUE); }

    /** Unsafe version of {@link #customAlloc(ZSTDAllocFunctionI) customAlloc}. */
    public static void ncustomAlloc(long struct, ZSTDAllocFunctionI value) { memPutAddress(struct + ZSTDCustomMem.CUSTOMALLOC, value.address()); }
    /** Unsafe version of {@link #customFree(ZSTDFreeFunctionI) customFree}. */
    public static void ncustomFree(long struct, ZSTDFreeFunctionI value) { memPutAddress(struct + ZSTDCustomMem.CUSTOMFREE, value.address()); }
    /** Unsafe version of {@link #opaque(long) opaque}. */
    public static void nopaque(long struct, long value) { memPutAddress(struct + ZSTDCustomMem.OPAQUE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ZSTDCustomMem.CUSTOMALLOC));
        check(memGetAddress(struct + ZSTDCustomMem.CUSTOMFREE));
        check(memGetAddress(struct + ZSTDCustomMem.OPAQUE));
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

    /** An array of {@link ZSTDCustomMem} structs. */
    public static class Buffer extends StructBuffer<ZSTDCustomMem, Buffer> implements NativeResource {

        /**
         * Creates a new {@link ZSTDCustomMem.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDCustomMem#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDCustomMem newInstance(long address) {
            return new ZSTDCustomMem(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code customAlloc} field. */
        @NativeType("ZSTD_allocFunction")
        public ZSTDAllocFunction customAlloc() { return ZSTDCustomMem.ncustomAlloc(address()); }
        /** Returns the value of the {@code customFree} field. */
        @NativeType("ZSTD_freeFunction")
        public ZSTDFreeFunction customFree() { return ZSTDCustomMem.ncustomFree(address()); }
        /** Returns the value of the {@code opaque} field. */
        @NativeType("void *")
        public long opaque() { return ZSTDCustomMem.nopaque(address()); }

        /** Sets the specified value to the {@code customAlloc} field. */
        public ZSTDCustomMem.Buffer customAlloc(@NativeType("ZSTD_allocFunction") ZSTDAllocFunctionI value) { ZSTDCustomMem.ncustomAlloc(address(), value); return this; }
        /** Sets the specified value to the {@code customFree} field. */
        public ZSTDCustomMem.Buffer customFree(@NativeType("ZSTD_freeFunction") ZSTDFreeFunctionI value) { ZSTDCustomMem.ncustomFree(address(), value); return this; }
        /** Sets the specified value to the {@code opaque} field. */
        public ZSTDCustomMem.Buffer opaque(@NativeType("void *") long value) { ZSTDCustomMem.nopaque(address(), value); return this; }

    }

}