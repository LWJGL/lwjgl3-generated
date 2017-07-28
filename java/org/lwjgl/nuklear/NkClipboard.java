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
 * struct nk_clipboard {
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkPluginPasteI nk_plugin_paste} paste;
 *     {@link NkPluginCopyI nk_plugin_copy} copy;
 * }</pre></code>
 */
@NativeType("struct nk_clipboard")
public class NkClipboard extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USERDATA,
        PASTE,
        COPY;

    static {
        Layout layout = __struct(
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USERDATA = layout.offsetof(0);
        PASTE = layout.offsetof(1);
        COPY = layout.offsetof(2);
    }

    NkClipboard(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkClipboard} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkClipboard(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkHandle} view of the {@code userdata} field. */
    @NativeType("nk_handle")
    public NkHandle userdata() { return nuserdata(address()); }
    /** Returns the value of the {@code paste} field. */
    @NativeType("nk_plugin_paste")
    public NkPluginPaste paste() { return npaste(address()); }
    /** Returns the value of the {@code copy} field. */
    @NativeType("nk_plugin_copy")
    public NkPluginCopy copy() { return ncopy(address()); }

    /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
    public NkClipboard userdata(@NativeType("nk_handle") NkHandle value) { nuserdata(address(), value); return this; }
    /** Sets the specified value to the {@code paste} field. */
    public NkClipboard paste(@NativeType("nk_plugin_paste") NkPluginPasteI value) { npaste(address(), value); return this; }
    /** Sets the specified value to the {@code copy} field. */
    public NkClipboard copy(@NativeType("nk_plugin_copy") NkPluginCopyI value) { ncopy(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkClipboard set(
        NkHandle userdata,
        NkPluginPasteI paste,
        NkPluginCopyI copy
    ) {
        userdata(userdata);
        paste(paste);
        copy(copy);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkClipboard set(NkClipboard src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link NkClipboard} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkClipboard malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link NkClipboard} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkClipboard calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link NkClipboard} instance allocated with {@link BufferUtils}. */
    public static NkClipboard create() {
        return new NkClipboard(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link NkClipboard} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static NkClipboard create(long address) {
        return address == NULL ? null : new NkClipboard(address, null);
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link NkClipboard.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link NkClipboard} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkClipboard mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link NkClipboard} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkClipboard callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link NkClipboard} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkClipboard mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link NkClipboard} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkClipboard callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkClipboard.USERDATA); }
    /** Unsafe version of {@link #paste}. */
    public static NkPluginPaste npaste(long struct) { return NkPluginPaste.create(memGetAddress(struct + NkClipboard.PASTE)); }
    /** Unsafe version of {@link #copy}. */
    public static NkPluginCopy ncopy(long struct) { return NkPluginCopy.create(memGetAddress(struct + NkClipboard.COPY)); }

    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkClipboard.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #paste(NkPluginPasteI) paste}. */
    public static void npaste(long struct, NkPluginPasteI value) { memPutAddress(struct + NkClipboard.PASTE, addressSafe(value)); }
    /** Unsafe version of {@link #copy(NkPluginCopyI) copy}. */
    public static void ncopy(long struct, NkPluginCopyI value) { memPutAddress(struct + NkClipboard.COPY, addressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkClipboard} structs. */
    public static class Buffer extends StructBuffer<NkClipboard, Buffer> implements NativeResource {

        /**
         * Creates a new {@link NkClipboard.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkClipboard#SIZEOF}, and its mark will be undefined.
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
        protected NkClipboard newInstance(long address) {
            return new NkClipboard(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkClipboard.nuserdata(address()); }
        /** Returns the value of the {@code paste} field. */
        @NativeType("nk_plugin_paste")
        public NkPluginPaste paste() { return NkClipboard.npaste(address()); }
        /** Returns the value of the {@code copy} field. */
        @NativeType("nk_plugin_copy")
        public NkPluginCopy copy() { return NkClipboard.ncopy(address()); }

        /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
        public NkClipboard.Buffer userdata(@NativeType("nk_handle") NkHandle value) { NkClipboard.nuserdata(address(), value); return this; }
        /** Sets the specified value to the {@code paste} field. */
        public NkClipboard.Buffer paste(@NativeType("nk_plugin_paste") NkPluginPasteI value) { NkClipboard.npaste(address(), value); return this; }
        /** Sets the specified value to the {@code copy} field. */
        public NkClipboard.Buffer copy(@NativeType("nk_plugin_copy") NkPluginCopyI value) { NkClipboard.ncopy(address(), value); return this; }

    }

}