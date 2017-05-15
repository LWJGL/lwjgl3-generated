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
 *     const uint8_t * rubTextureMapData;
 * }</pre></code>
 */
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

    RenderModelTextureMap(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link RenderModelTextureMap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RenderModelTextureMap(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code unWidth} field. */
    public short unWidth() { return nunWidth(address()); }
    /** Returns the value of the {@code unHeight} field. */
    public short unHeight() { return nunHeight(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code rubTextureMapData} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    public ByteBuffer rubTextureMapData(int capacity) { return nrubTextureMapData(address(), capacity); }

    /** Sets the specified value to the {@code unWidth} field. */
    public RenderModelTextureMap unWidth(short value) { nunWidth(address(), value); return this; }
    /** Sets the specified value to the {@code unHeight} field. */
    public RenderModelTextureMap unHeight(short value) { nunHeight(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code rubTextureMapData} field. */
    public RenderModelTextureMap rubTextureMapData(ByteBuffer value) { nrubTextureMapData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public RenderModelTextureMap set(
        short unWidth,
        short unHeight,
        ByteBuffer rubTextureMapData
    ) {
        unWidth(unWidth);
        unHeight(unHeight);
        rubTextureMapData(rubTextureMapData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public RenderModelTextureMap set(RenderModelTextureMap src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link RenderModelTextureMap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RenderModelTextureMap malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link RenderModelTextureMap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RenderModelTextureMap calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link RenderModelTextureMap} instance allocated with {@link BufferUtils}. */
    public static RenderModelTextureMap create() {
        return new RenderModelTextureMap(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link RenderModelTextureMap} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static RenderModelTextureMap create(long address) {
        return address == NULL ? null : new RenderModelTextureMap(address, null);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link RenderModelTextureMap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
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
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #unWidth}. */
    public static short nunWidth(long struct) { return memGetShort(struct + RenderModelTextureMap.UNWIDTH); }
    /** Unsafe version of {@link #unHeight}. */
    public static short nunHeight(long struct) { return memGetShort(struct + RenderModelTextureMap.UNHEIGHT); }
    /** Unsafe version of {@link #rubTextureMapData(int) rubTextureMapData}. */
    public static ByteBuffer nrubTextureMapData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + RenderModelTextureMap.RUBTEXTUREMAPDATA), capacity); }

    /** Unsafe version of {@link #unWidth(short) unWidth}. */
    public static void nunWidth(long struct, short value) { memPutShort(struct + RenderModelTextureMap.UNWIDTH, value); }
    /** Unsafe version of {@link #unHeight(short) unHeight}. */
    public static void nunHeight(long struct, short value) { memPutShort(struct + RenderModelTextureMap.UNHEIGHT, value); }
    /** Unsafe version of {@link #rubTextureMapData(ByteBuffer) rubTextureMapData}. */
    public static void nrubTextureMapData(long struct, ByteBuffer value) { memPutAddress(struct + RenderModelTextureMap.RUBTEXTUREMAPDATA, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + RenderModelTextureMap.RUBTEXTUREMAPDATA));
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
        protected RenderModelTextureMap newInstance(long address) {
            return new RenderModelTextureMap(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code unWidth} field. */
        public short unWidth() { return RenderModelTextureMap.nunWidth(address()); }
        /** Returns the value of the {@code unHeight} field. */
        public short unHeight() { return RenderModelTextureMap.nunHeight(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code rubTextureMapData} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        public ByteBuffer rubTextureMapData(int capacity) { return RenderModelTextureMap.nrubTextureMapData(address(), capacity); }

        /** Sets the specified value to the {@code unWidth} field. */
        public RenderModelTextureMap.Buffer unWidth(short value) { RenderModelTextureMap.nunWidth(address(), value); return this; }
        /** Sets the specified value to the {@code unHeight} field. */
        public RenderModelTextureMap.Buffer unHeight(short value) { RenderModelTextureMap.nunHeight(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code rubTextureMapData} field. */
        public RenderModelTextureMap.Buffer rubTextureMapData(ByteBuffer value) { RenderModelTextureMap.nrubTextureMapData(address(), value); return this; }

    }

}