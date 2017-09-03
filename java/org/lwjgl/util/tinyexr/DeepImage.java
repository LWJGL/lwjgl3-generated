/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code image} &ndash; image[channels][scanlines][samples]</li>
 * <li>{@code offset_table} &ndash; offset_table[scanline][offsets]</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct DeepImage {
 *     const char ** channel_names;
 *     float *** image;
 *     int ** offset_table;
 *     int num_channels;
 *     int width;
 *     int height;
 *     char[4];
 * }</pre></code>
 */
public class DeepImage extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CHANNEL_NAMES,
        IMAGE,
        OFFSET_TABLE,
        NUM_CHANNELS,
        WIDTH,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __padding(4, true)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CHANNEL_NAMES = layout.offsetof(0);
        IMAGE = layout.offsetof(1);
        OFFSET_TABLE = layout.offsetof(2);
        NUM_CHANNELS = layout.offsetof(3);
        WIDTH = layout.offsetof(4);
        HEIGHT = layout.offsetof(5);
    }

    DeepImage(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link DeepImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DeepImage(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code channel_names} field. */
    @NativeType("const char **")
    public PointerBuffer channel_names() { return nchannel_names(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code image} field. */
    @NativeType("float ***")
    public PointerBuffer image() { return nimage(address()); }
    /**
     * Returns a {@link PointerBuffer} view of the data pointed to by the {@code offset_table} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("int **")
    public PointerBuffer offset_table(int capacity) { return noffset_table(address(), capacity); }
    /** Returns the value of the {@code num_channels} field. */
    public int num_channels() { return nnum_channels(address()); }
    /** Returns the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    public int height() { return nheight(address()); }

    /** Sets the address of the specified {@link PointerBuffer} to the {@code channel_names} field. */
    public DeepImage channel_names(@NativeType("const char **") PointerBuffer value) { nchannel_names(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code image} field. */
    public DeepImage image(@NativeType("float ***") PointerBuffer value) { nimage(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code offset_table} field. */
    public DeepImage offset_table(@NativeType("int **") PointerBuffer value) { noffset_table(address(), value); return this; }
    /** Sets the specified value to the {@code num_channels} field. */
    public DeepImage num_channels(int value) { nnum_channels(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public DeepImage width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public DeepImage height(int value) { nheight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public DeepImage set(
        PointerBuffer channel_names,
        PointerBuffer image,
        PointerBuffer offset_table,
        int num_channels,
        int width,
        int height
    ) {
        channel_names(channel_names);
        image(image);
        offset_table(offset_table);
        num_channels(num_channels);
        width(width);
        height(height);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public DeepImage set(DeepImage src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link DeepImage} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DeepImage malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link DeepImage} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DeepImage calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link DeepImage} instance allocated with {@link BufferUtils}. */
    public static DeepImage create() {
        return new DeepImage(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link DeepImage} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static DeepImage create(long address) {
        return address == NULL ? null : new DeepImage(address, null);
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link DeepImage.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link DeepImage} instance allocated on the thread-local {@link MemoryStack}. */
    public static DeepImage mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link DeepImage} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static DeepImage callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link DeepImage} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DeepImage mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link DeepImage} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DeepImage callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #channel_names() channel_names}. */
    public static PointerBuffer nchannel_names(long struct) { return memPointerBuffer(memGetAddress(struct + DeepImage.CHANNEL_NAMES), nnum_channels(struct)); }
    /** Unsafe version of {@link #image() image}. */
    public static PointerBuffer nimage(long struct) { return memPointerBuffer(memGetAddress(struct + DeepImage.IMAGE), nnum_channels(struct)); }
    /** Unsafe version of {@link #offset_table(int) offset_table}. */
    public static PointerBuffer noffset_table(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + DeepImage.OFFSET_TABLE), capacity); }
    /** Unsafe version of {@link #num_channels}. */
    public static int nnum_channels(long struct) { return memGetInt(struct + DeepImage.NUM_CHANNELS); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + DeepImage.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + DeepImage.HEIGHT); }

    /** Unsafe version of {@link #channel_names(PointerBuffer) channel_names}. */
    public static void nchannel_names(long struct, PointerBuffer value) { memPutAddress(struct + DeepImage.CHANNEL_NAMES, memAddress(value)); }
    /** Unsafe version of {@link #image(PointerBuffer) image}. */
    public static void nimage(long struct, PointerBuffer value) { memPutAddress(struct + DeepImage.IMAGE, memAddress(value)); }
    /** Unsafe version of {@link #offset_table(PointerBuffer) offset_table}. */
    public static void noffset_table(long struct, PointerBuffer value) { memPutAddress(struct + DeepImage.OFFSET_TABLE, memAddress(value)); }
    /** Sets the specified value to the {@code num_channels} field of the specified {@code struct}. */
    public static void nnum_channels(long struct, int value) { memPutInt(struct + DeepImage.NUM_CHANNELS, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + DeepImage.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + DeepImage.HEIGHT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + DeepImage.CHANNEL_NAMES));
        check(memGetAddress(struct + DeepImage.IMAGE));
        check(memGetAddress(struct + DeepImage.OFFSET_TABLE));
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

    /** An array of {@link DeepImage} structs. */
    public static class Buffer extends StructBuffer<DeepImage, Buffer> implements NativeResource {

        /**
         * Creates a new {@link DeepImage.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DeepImage#SIZEOF}, and its mark will be undefined.
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
        protected DeepImage newInstance(long address) {
            return new DeepImage(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code channel_names} field. */
        @NativeType("const char **")
        public PointerBuffer channel_names() { return DeepImage.nchannel_names(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code image} field. */
        @NativeType("float ***")
        public PointerBuffer image() { return DeepImage.nimage(address()); }
        /**
         * Returns a {@link PointerBuffer} view of the data pointed to by the {@code offset_table} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("int **")
        public PointerBuffer offset_table(int capacity) { return DeepImage.noffset_table(address(), capacity); }
        /** Returns the value of the {@code num_channels} field. */
        public int num_channels() { return DeepImage.nnum_channels(address()); }
        /** Returns the value of the {@code width} field. */
        public int width() { return DeepImage.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        public int height() { return DeepImage.nheight(address()); }

        /** Sets the address of the specified {@link PointerBuffer} to the {@code channel_names} field. */
        public DeepImage.Buffer channel_names(@NativeType("const char **") PointerBuffer value) { DeepImage.nchannel_names(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code image} field. */
        public DeepImage.Buffer image(@NativeType("float ***") PointerBuffer value) { DeepImage.nimage(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code offset_table} field. */
        public DeepImage.Buffer offset_table(@NativeType("int **") PointerBuffer value) { DeepImage.noffset_table(address(), value); return this; }
        /** Sets the specified value to the {@code num_channels} field. */
        public DeepImage.Buffer num_channels(int value) { DeepImage.nnum_channels(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public DeepImage.Buffer width(int value) { DeepImage.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public DeepImage.Buffer height(int value) { DeepImage.nheight(address(), value); return this; }

    }

}