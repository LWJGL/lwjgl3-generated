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
 * A texture map for use on a render model.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code unHeight} &ndash; width and height of the texture map in pixels</li>
 * <li>{@code rubTextureMapData} &ndash; Map texture data. All textures are RGBA with 8 bits per channel per pixel. Data size is width * height * 4ub</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct RenderModel_TextureMap_t {
 *     uint16_t unWidth;
 *     uint16_t unHeight;
 *     uint8_t const * rubTextureMapData;
 * }</pre></code>
 */
@NativeType("struct RenderModel_TextureMap_t")
public class RenderModelTextureMap extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UNWIDTH,
        UNHEIGHT,
        RUBTEXTUREMAPDATA;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UNWIDTH = layout.offsetof(0);
        UNHEIGHT = layout.offsetof(1);
        RUBTEXTUREMAPDATA = layout.offsetof(2);
    }

    RenderModelTextureMap(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link RenderModelTextureMap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RenderModelTextureMap(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code unWidth} field. */
    @NativeType("uint16_t")
    public short unWidth() { return nunWidth(address()); }
    /** Returns the value of the {@code unHeight} field. */
    @NativeType("uint16_t")
    public short unHeight() { return nunHeight(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code rubTextureMapData} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("uint8_t const *")
    public ByteBuffer rubTextureMapData(int capacity) { return nrubTextureMapData(address(), capacity); }

    // -----------------------------------

    /** Returns a new {@link RenderModelTextureMap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RenderModelTextureMap malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link RenderModelTextureMap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RenderModelTextureMap calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link RenderModelTextureMap} instance allocated with {@link BufferUtils}. */
    public static RenderModelTextureMap create() {
        return new RenderModelTextureMap(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link RenderModelTextureMap} instance for the specified memory address. */
    public static RenderModelTextureMap create(long address) {
        return new RenderModelTextureMap(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModelTextureMap createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link RenderModelTextureMap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModelTextureMap.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link RenderModelTextureMap} instance allocated on the thread-local {@link MemoryStack}. */
    public static RenderModelTextureMap mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link RenderModelTextureMap} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static RenderModelTextureMap callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link RenderModelTextureMap} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModelTextureMap mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link RenderModelTextureMap} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModelTextureMap callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #unWidth}. */
    public static short nunWidth(long struct) { return memGetShort(struct + RenderModelTextureMap.UNWIDTH); }
    /** Unsafe version of {@link #unHeight}. */
    public static short nunHeight(long struct) { return memGetShort(struct + RenderModelTextureMap.UNHEIGHT); }
    /** Unsafe version of {@link #rubTextureMapData(int) rubTextureMapData}. */
    public static ByteBuffer nrubTextureMapData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + RenderModelTextureMap.RUBTEXTUREMAPDATA), capacity); }

    // -----------------------------------

    /** An array of {@link RenderModelTextureMap} structs. */
    public static class Buffer extends StructBuffer<RenderModelTextureMap, Buffer> implements NativeResource {

        /**
         * Creates a new {@link RenderModelTextureMap.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RenderModelTextureMap#SIZEOF}, and its mark will be undefined.
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
        protected RenderModelTextureMap newInstance(long address) {
            return new RenderModelTextureMap(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code unWidth} field. */
        @NativeType("uint16_t")
        public short unWidth() { return RenderModelTextureMap.nunWidth(address()); }
        /** Returns the value of the {@code unHeight} field. */
        @NativeType("uint16_t")
        public short unHeight() { return RenderModelTextureMap.nunHeight(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code rubTextureMapData} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint8_t const *")
        public ByteBuffer rubTextureMapData(int capacity) { return RenderModelTextureMap.nrubTextureMapData(address(), capacity); }

    }

}