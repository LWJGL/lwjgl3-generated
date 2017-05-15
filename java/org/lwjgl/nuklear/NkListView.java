/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_list_view {
 *     int begin;
 *     int end;
 *     int count;
 *     int total_height;
 *     {@link NkContext struct nk_context} * ctx;
 *     nk_uint * scroll_pointer;
 *     nk_uint scroll_value;
 * }</pre></code>
 */
public class NkListView extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BEGIN,
        END,
        COUNT,
        TOTAL_HEIGHT,
        CTX,
        SCROLL_POINTER,
        SCROLL_VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BEGIN = layout.offsetof(0);
        END = layout.offsetof(1);
        COUNT = layout.offsetof(2);
        TOTAL_HEIGHT = layout.offsetof(3);
        CTX = layout.offsetof(4);
        SCROLL_POINTER = layout.offsetof(5);
        SCROLL_VALUE = layout.offsetof(6);
    }

    NkListView(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkListView} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkListView(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code begin} field. */
    public int begin() { return nbegin(address()); }
    /** Returns the value of the {@code end} field. */
    public int end() { return nend(address()); }
    /** Returns the value of the {@code count} field. */
    public int count() { return ncount(address()); }

    // -----------------------------------

    /** Returns a new {@link NkListView} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkListView malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link NkListView} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkListView calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link NkListView} instance allocated with {@link BufferUtils}. */
    public static NkListView create() {
        return new NkListView(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link NkListView} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static NkListView create(long address) {
        return address == NULL ? null : new NkListView(address, null);
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link NkListView.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link NkListView} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkListView mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link NkListView} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkListView callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link NkListView} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkListView mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link NkListView} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkListView callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #begin}. */
    public static int nbegin(long struct) { return memGetInt(struct + NkListView.BEGIN); }
    /** Unsafe version of {@link #end}. */
    public static int nend(long struct) { return memGetInt(struct + NkListView.END); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return memGetInt(struct + NkListView.COUNT); }
    public static int ntotal_height(long struct) { return memGetInt(struct + NkListView.TOTAL_HEIGHT); }
    public static NkContext nctx(long struct) { return NkContext.create(memGetAddress(struct + NkListView.CTX)); }
    public static IntBuffer nscroll_pointer(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + NkListView.SCROLL_POINTER), capacity); }
    public static int nscroll_value(long struct) { return memGetInt(struct + NkListView.SCROLL_VALUE); }

    // -----------------------------------

    /** An array of {@link NkListView} structs. */
    public static class Buffer extends StructBuffer<NkListView, Buffer> implements NativeResource {

        /**
         * Creates a new {@link NkListView.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkListView#SIZEOF}, and its mark will be undefined.
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
        protected NkListView newInstance(long address) {
            return new NkListView(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code begin} field. */
        public int begin() { return NkListView.nbegin(address()); }
        /** Returns the value of the {@code end} field. */
        public int end() { return NkListView.nend(address()); }
        /** Returns the value of the {@code count} field. */
        public int count() { return NkListView.ncount(address()); }

    }

}