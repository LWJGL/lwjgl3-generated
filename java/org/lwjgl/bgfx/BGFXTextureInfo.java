/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Texture info.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code format} &ndash; texture format. One of:<br><table><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link BGFX#BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link BGFX#BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table></li>
 * <li>{@code storageSize} &ndash; total amount of bytes required to store texture</li>
 * <li>{@code width} &ndash; texture width</li>
 * <li>{@code height} &ndash; texture height</li>
 * <li>{@code depth} &ndash; texture depth</li>
 * <li>{@code numLayers} &ndash; number of layers in texture array</li>
 * <li>{@code numMips} &ndash; number of MIP maps</li>
 * <li>{@code bitsPerPixel} &ndash; format bits per pixel</li>
 * <li>{@code cubeMap} &ndash; texture is cubemap</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_texture_info_t {
 *     bgfx_texture_format_t format;
 *     uint32_t storageSize;
 *     uint16_t width;
 *     uint16_t height;
 *     uint16_t depth;
 *     uint16_t numLayers;
 *     uint8_t numMips;
 *     uint8_t bitsPerPixel;
 *     bool cubeMap;
 * }</pre></code>
 */
@NativeType("struct bgfx_texture_info_t")
public class BGFXTextureInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        STORAGESIZE,
        WIDTH,
        HEIGHT,
        DEPTH,
        NUMLAYERS,
        NUMMIPS,
        BITSPERPIXEL,
        CUBEMAP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        STORAGESIZE = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        DEPTH = layout.offsetof(4);
        NUMLAYERS = layout.offsetof(5);
        NUMMIPS = layout.offsetof(6);
        BITSPERPIXEL = layout.offsetof(7);
        CUBEMAP = layout.offsetof(8);
    }

    BGFXTextureInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXTextureInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXTextureInfo(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code format} field. */
    @NativeType("bgfx_texture_format_t")
    public int format() { return nformat(address()); }
    /** Returns the value of the {@code storageSize} field. */
    @NativeType("uint32_t")
    public int storageSize() { return nstorageSize(address()); }
    /** Returns the value of the {@code width} field. */
    @NativeType("uint16_t")
    public short width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    @NativeType("uint16_t")
    public short height() { return nheight(address()); }
    /** Returns the value of the {@code depth} field. */
    @NativeType("uint16_t")
    public short depth() { return ndepth(address()); }
    /** Returns the value of the {@code numLayers} field. */
    @NativeType("uint16_t")
    public short numLayers() { return nnumLayers(address()); }
    /** Returns the value of the {@code numMips} field. */
    @NativeType("uint8_t")
    public byte numMips() { return nnumMips(address()); }
    /** Returns the value of the {@code bitsPerPixel} field. */
    @NativeType("uint8_t")
    public byte bitsPerPixel() { return nbitsPerPixel(address()); }
    /** Returns the value of the {@code cubeMap} field. */
    @NativeType("bool")
    public boolean cubeMap() { return ncubeMap(address()); }

    // -----------------------------------

    /** Returns a new {@link BGFXTextureInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXTextureInfo malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link BGFXTextureInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXTextureInfo calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link BGFXTextureInfo} instance allocated with {@link BufferUtils}. */
    public static BGFXTextureInfo create() {
        return new BGFXTextureInfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link BGFXTextureInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static BGFXTextureInfo create(long address) {
        return address == NULL ? null : new BGFXTextureInfo(address, null);
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link BGFXTextureInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link BGFXTextureInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXTextureInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link BGFXTextureInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXTextureInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link BGFXTextureInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTextureInfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXTextureInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTextureInfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + BGFXTextureInfo.FORMAT); }
    /** Unsafe version of {@link #storageSize}. */
    public static int nstorageSize(long struct) { return memGetInt(struct + BGFXTextureInfo.STORAGESIZE); }
    /** Unsafe version of {@link #width}. */
    public static short nwidth(long struct) { return memGetShort(struct + BGFXTextureInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static short nheight(long struct) { return memGetShort(struct + BGFXTextureInfo.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static short ndepth(long struct) { return memGetShort(struct + BGFXTextureInfo.DEPTH); }
    /** Unsafe version of {@link #numLayers}. */
    public static short nnumLayers(long struct) { return memGetShort(struct + BGFXTextureInfo.NUMLAYERS); }
    /** Unsafe version of {@link #numMips}. */
    public static byte nnumMips(long struct) { return memGetByte(struct + BGFXTextureInfo.NUMMIPS); }
    /** Unsafe version of {@link #bitsPerPixel}. */
    public static byte nbitsPerPixel(long struct) { return memGetByte(struct + BGFXTextureInfo.BITSPERPIXEL); }
    /** Unsafe version of {@link #cubeMap}. */
    public static boolean ncubeMap(long struct) { return memGetByte(struct + BGFXTextureInfo.CUBEMAP) != 0; }

    // -----------------------------------

    /** An array of {@link BGFXTextureInfo} structs. */
    public static class Buffer extends StructBuffer<BGFXTextureInfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link BGFXTextureInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXTextureInfo#SIZEOF}, and its mark will be undefined.
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
        protected BGFXTextureInfo newInstance(long address) {
            return new BGFXTextureInfo(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code format} field. */
        @NativeType("bgfx_texture_format_t")
        public int format() { return BGFXTextureInfo.nformat(address()); }
        /** Returns the value of the {@code storageSize} field. */
        @NativeType("uint32_t")
        public int storageSize() { return BGFXTextureInfo.nstorageSize(address()); }
        /** Returns the value of the {@code width} field. */
        @NativeType("uint16_t")
        public short width() { return BGFXTextureInfo.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        @NativeType("uint16_t")
        public short height() { return BGFXTextureInfo.nheight(address()); }
        /** Returns the value of the {@code depth} field. */
        @NativeType("uint16_t")
        public short depth() { return BGFXTextureInfo.ndepth(address()); }
        /** Returns the value of the {@code numLayers} field. */
        @NativeType("uint16_t")
        public short numLayers() { return BGFXTextureInfo.nnumLayers(address()); }
        /** Returns the value of the {@code numMips} field. */
        @NativeType("uint8_t")
        public byte numMips() { return BGFXTextureInfo.nnumMips(address()); }
        /** Returns the value of the {@code bitsPerPixel} field. */
        @NativeType("uint8_t")
        public byte bitsPerPixel() { return BGFXTextureInfo.nbitsPerPixel(address()); }
        /** Returns the value of the {@code cubeMap} field. */
        @NativeType("bool")
        public boolean cubeMap() { return BGFXTextureInfo.ncubeMap(address()); }

    }

}