/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Transient vertex buffer.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code data} &ndash; pointer to data</li>
 * <li>{@code size} &ndash; data size</li>
 * <li>{@code startVertex} &ndash; first vertex</li>
 * <li>{@code stride} &ndash; vertex stride</li>
 * <li>{@code handle} &ndash; vertex buffer handle</li>
 * <li>{@code decl} &ndash; vertex declaration handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_transient_vertex_buffer_t {
 *     uint8_t * data;
 *     uint32_t size;
 *     uint32_t startVertex;
 *     uint16_t stride;
 *     bgfx_vertex_buffer_handle_t handle;
 *     bgfx_vertex_decl_handle_t decl;
 * }</pre></code>
 */
public class BGFXTransientVertexBuffer extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA,
        SIZE,
        STARTVERTEX,
        STRIDE,
        HANDLE,
        DECL;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        STARTVERTEX = layout.offsetof(2);
        STRIDE = layout.offsetof(3);
        HANDLE = layout.offsetof(4);
        DECL = layout.offsetof(5);
    }

    BGFXTransientVertexBuffer(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXTransientVertexBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXTransientVertexBuffer(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
    public ByteBuffer data() { return ndata(address()); }
    /** Returns the value of the {@code size} field. */
    public int size() { return nsize(address()); }
    /** Returns the value of the {@code startVertex} field. */
    public int startVertex() { return nstartVertex(address()); }
    /** Returns the value of the {@code stride} field. */
    public short stride() { return nstride(address()); }
    /** Returns the value of the {@code handle} field. */
    public short handle() { return nhandle(address()); }
    /** Returns the value of the {@code decl} field. */
    public short decl() { return ndecl(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public BGFXTransientVertexBuffer data(ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code startVertex} field. */
    public BGFXTransientVertexBuffer startVertex(int value) { nstartVertex(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public BGFXTransientVertexBuffer stride(short value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@code handle} field. */
    public BGFXTransientVertexBuffer handle(short value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@code decl} field. */
    public BGFXTransientVertexBuffer decl(short value) { ndecl(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXTransientVertexBuffer set(
        ByteBuffer data,
        int startVertex,
        short stride,
        short handle,
        short decl
    ) {
        data(data);
        startVertex(startVertex);
        stride(stride);
        handle(handle);
        decl(decl);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXTransientVertexBuffer set(BGFXTransientVertexBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link BGFXTransientVertexBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXTransientVertexBuffer malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link BGFXTransientVertexBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXTransientVertexBuffer calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link BGFXTransientVertexBuffer} instance allocated with {@link BufferUtils}. */
    public static BGFXTransientVertexBuffer create() {
        return new BGFXTransientVertexBuffer(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link BGFXTransientVertexBuffer} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static BGFXTransientVertexBuffer create(long address) {
        return address == NULL ? null : new BGFXTransientVertexBuffer(address, null);
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link BGFXTransientVertexBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link BGFXTransientVertexBuffer} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXTransientVertexBuffer mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link BGFXTransientVertexBuffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXTransientVertexBuffer callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTransientVertexBuffer mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTransientVertexBuffer callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + BGFXTransientVertexBuffer.DATA), nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + BGFXTransientVertexBuffer.SIZE); }
    /** Unsafe version of {@link #startVertex}. */
    public static int nstartVertex(long struct) { return memGetInt(struct + BGFXTransientVertexBuffer.STARTVERTEX); }
    /** Unsafe version of {@link #stride}. */
    public static short nstride(long struct) { return memGetShort(struct + BGFXTransientVertexBuffer.STRIDE); }
    /** Unsafe version of {@link #handle}. */
    public static short nhandle(long struct) { return memGetShort(struct + BGFXTransientVertexBuffer.HANDLE); }
    /** Unsafe version of {@link #decl}. */
    public static short ndecl(long struct) { return memGetShort(struct + BGFXTransientVertexBuffer.DECL); }

    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + BGFXTransientVertexBuffer.DATA, memAddress(value)); nsize(struct, value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, int value) { memPutInt(struct + BGFXTransientVertexBuffer.SIZE, value); }
    /** Unsafe version of {@link #startVertex(int) startVertex}. */
    public static void nstartVertex(long struct, int value) { memPutInt(struct + BGFXTransientVertexBuffer.STARTVERTEX, value); }
    /** Unsafe version of {@link #stride(short) stride}. */
    public static void nstride(long struct, short value) { memPutShort(struct + BGFXTransientVertexBuffer.STRIDE, value); }
    /** Unsafe version of {@link #handle(short) handle}. */
    public static void nhandle(long struct, short value) { memPutShort(struct + BGFXTransientVertexBuffer.HANDLE, value); }
    /** Unsafe version of {@link #decl(short) decl}. */
    public static void ndecl(long struct, short value) { memPutShort(struct + BGFXTransientVertexBuffer.DECL, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + BGFXTransientVertexBuffer.DATA));
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

    /** An array of {@link BGFXTransientVertexBuffer} structs. */
    public static class Buffer extends StructBuffer<BGFXTransientVertexBuffer, Buffer> implements NativeResource {

        /**
         * Creates a new {@link BGFXTransientVertexBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXTransientVertexBuffer#SIZEOF}, and its mark will be undefined.
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
        protected BGFXTransientVertexBuffer newInstance(long address) {
            return new BGFXTransientVertexBuffer(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
        public ByteBuffer data() { return BGFXTransientVertexBuffer.ndata(address()); }
        /** Returns the value of the {@code size} field. */
        public int size() { return BGFXTransientVertexBuffer.nsize(address()); }
        /** Returns the value of the {@code startVertex} field. */
        public int startVertex() { return BGFXTransientVertexBuffer.nstartVertex(address()); }
        /** Returns the value of the {@code stride} field. */
        public short stride() { return BGFXTransientVertexBuffer.nstride(address()); }
        /** Returns the value of the {@code handle} field. */
        public short handle() { return BGFXTransientVertexBuffer.nhandle(address()); }
        /** Returns the value of the {@code decl} field. */
        public short decl() { return BGFXTransientVertexBuffer.ndecl(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public BGFXTransientVertexBuffer.Buffer data(ByteBuffer value) { BGFXTransientVertexBuffer.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code startVertex} field. */
        public BGFXTransientVertexBuffer.Buffer startVertex(int value) { BGFXTransientVertexBuffer.nstartVertex(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public BGFXTransientVertexBuffer.Buffer stride(short value) { BGFXTransientVertexBuffer.nstride(address(), value); return this; }
        /** Sets the specified value to the {@code handle} field. */
        public BGFXTransientVertexBuffer.Buffer handle(short value) { BGFXTransientVertexBuffer.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@code decl} field. */
        public BGFXTransientVertexBuffer.Buffer decl(short value) { BGFXTransientVertexBuffer.ndecl(address(), value); return this; }

    }

}