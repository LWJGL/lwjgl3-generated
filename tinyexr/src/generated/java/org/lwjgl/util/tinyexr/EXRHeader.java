/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.util.tinyexr.TinyEXR.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code custom_attributes} &ndash; custom attributes (excludes required attributes, e.g. `channels`, `compression`, etc)</li>
 * <li>{@code pixel_types} &ndash; loaded pixel type (TINYEXR_PIXELTYPE_*) of {@code images} for each channel. This is overwritten with {@code requested_pixel_types} when loading.</li>
 * <li>{@code compression_type} &ndash; compression type (TINYEXR_COMPRESSIONTYPE_*)</li>
 * <li>{@code requested_pixel_types} &ndash; filled initially by {@code ParseEXRHeaderFrom(Memory|File)}, then users can edit it (only valid for HALF pixel type channel)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct EXRHeader {
 *     float pixel_aspect_ratio;
 *     int line_order;
 *     int data_window[4];
 *     int display_window[4];
 *     float screen_window_center[2];
 *     float screen_window_width;
 *     int chunk_count;
 *     int tiled;
 *     int tile_size_x;
 *     int tile_size_y;
 *     int tile_level_mode;
 *     int tile_rounding_mode;
 *     int long_name;
 *     int non_image;
 *     int multipart;
 *     unsigned int header_len;
 *     int num_custom_attributes;
 *     {@link EXRAttribute EXRAttribute} custom_attributes[TINYEXR_MAX_ATTRIBUTES];
 *     {@link EXRChannelInfo EXRChannelInfo} * channels;
 *     int * pixel_types;
 *     int num_channels;
 *     int compression_type;
 *     int * requested_pixel_types;
 * }</pre></code>
 */
public class EXRHeader extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PIXEL_ASPECT_RATIO,
        LINE_ORDER,
        DATA_WINDOW,
        DISPLAY_WINDOW,
        SCREEN_WINDOW_CENTER,
        SCREEN_WINDOW_WIDTH,
        CHUNK_COUNT,
        TILED,
        TILE_SIZE_X,
        TILE_SIZE_Y,
        TILE_LEVEL_MODE,
        TILE_ROUNDING_MODE,
        LONG_NAME,
        NON_IMAGE,
        MULTIPART,
        HEADER_LEN,
        NUM_CUSTOM_ATTRIBUTES,
        CUSTOM_ATTRIBUTES,
        CHANNELS,
        PIXEL_TYPES,
        NUM_CHANNELS,
        COMPRESSION_TYPE,
        REQUESTED_PIXEL_TYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(4, 4),
            __array(4, 4),
            __array(4, 2),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(EXRAttribute.SIZEOF, EXRAttribute.ALIGNOF, TINYEXR_MAX_ATTRIBUTES),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PIXEL_ASPECT_RATIO = layout.offsetof(0);
        LINE_ORDER = layout.offsetof(1);
        DATA_WINDOW = layout.offsetof(2);
        DISPLAY_WINDOW = layout.offsetof(3);
        SCREEN_WINDOW_CENTER = layout.offsetof(4);
        SCREEN_WINDOW_WIDTH = layout.offsetof(5);
        CHUNK_COUNT = layout.offsetof(6);
        TILED = layout.offsetof(7);
        TILE_SIZE_X = layout.offsetof(8);
        TILE_SIZE_Y = layout.offsetof(9);
        TILE_LEVEL_MODE = layout.offsetof(10);
        TILE_ROUNDING_MODE = layout.offsetof(11);
        LONG_NAME = layout.offsetof(12);
        NON_IMAGE = layout.offsetof(13);
        MULTIPART = layout.offsetof(14);
        HEADER_LEN = layout.offsetof(15);
        NUM_CUSTOM_ATTRIBUTES = layout.offsetof(16);
        CUSTOM_ATTRIBUTES = layout.offsetof(17);
        CHANNELS = layout.offsetof(18);
        PIXEL_TYPES = layout.offsetof(19);
        NUM_CHANNELS = layout.offsetof(20);
        COMPRESSION_TYPE = layout.offsetof(21);
        REQUESTED_PIXEL_TYPES = layout.offsetof(22);
    }

    EXRHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link EXRHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EXRHeader(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code pixel_aspect_ratio} field. */
    public float pixel_aspect_ratio() { return npixel_aspect_ratio(address()); }
    /** Returns the value of the {@code line_order} field. */
    public int line_order() { return nline_order(address()); }
    /** Returns a {@link IntBuffer} view of the {@code data_window} field. */
    @NativeType("int[4]")
    public IntBuffer data_window() { return ndata_window(address()); }
    /** Returns the value at the specified index of the {@code data_window} field. */
    public int data_window(int index) { return ndata_window(address(), index); }
    /** Returns a {@link IntBuffer} view of the {@code display_window} field. */
    @NativeType("int[4]")
    public IntBuffer display_window() { return ndisplay_window(address()); }
    /** Returns the value at the specified index of the {@code display_window} field. */
    public int display_window(int index) { return ndisplay_window(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code screen_window_center} field. */
    @NativeType("float[2]")
    public FloatBuffer screen_window_center() { return nscreen_window_center(address()); }
    /** Returns the value at the specified index of the {@code screen_window_center} field. */
    public float screen_window_center(int index) { return nscreen_window_center(address(), index); }
    /** Returns the value of the {@code screen_window_width} field. */
    public float screen_window_width() { return nscreen_window_width(address()); }
    /** Returns the value of the {@code chunk_count} field. */
    public int chunk_count() { return nchunk_count(address()); }
    /** Returns the value of the {@code tiled} field. */
    @NativeType("int")
    public boolean tiled() { return ntiled(address()) != 0; }
    /** Returns the value of the {@code tile_size_x} field. */
    public int tile_size_x() { return ntile_size_x(address()); }
    /** Returns the value of the {@code tile_size_y} field. */
    public int tile_size_y() { return ntile_size_y(address()); }
    /** Returns the value of the {@code tile_level_mode} field. */
    public int tile_level_mode() { return ntile_level_mode(address()); }
    /** Returns the value of the {@code tile_rounding_mode} field. */
    public int tile_rounding_mode() { return ntile_rounding_mode(address()); }
    /** Returns the value of the {@code long_name} field. */
    @NativeType("int")
    public boolean long_name() { return nlong_name(address()) != 0; }
    /** Returns the value of the {@code non_image} field. */
    @NativeType("int")
    public boolean non_image() { return nnon_image(address()) != 0; }
    /** Returns the value of the {@code multipart} field. */
    @NativeType("int")
    public boolean multipart() { return nmultipart(address()) != 0; }
    /** Returns the value of the {@code header_len} field. */
    @NativeType("unsigned int")
    public int header_len() { return nheader_len(address()); }
    /** Returns the value of the {@code num_custom_attributes} field. */
    public int num_custom_attributes() { return nnum_custom_attributes(address()); }
    /** Returns a {@link EXRAttribute}.Buffer view of the {@code custom_attributes} field. */
    @NativeType("EXRAttribute[TINYEXR_MAX_ATTRIBUTES]")
    public EXRAttribute.Buffer custom_attributes() { return ncustom_attributes(address()); }
    /** Returns a {@link EXRAttribute} view of the struct at the specified index of the {@code custom_attributes} field. */
    public EXRAttribute custom_attributes(int index) { return ncustom_attributes(address(), index); }
    /** Returns a {@link EXRChannelInfo.Buffer} view of the struct array pointed to by the {@code channels} field. */
    @NativeType("EXRChannelInfo *")
    public EXRChannelInfo.Buffer channels() { return nchannels(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pixel_types} field. */
    @NativeType("int *")
    public IntBuffer pixel_types() { return npixel_types(address()); }
    /** Returns the value of the {@code num_channels} field. */
    public int num_channels() { return nnum_channels(address()); }
    /** Returns the value of the {@code compression_type} field. */
    public int compression_type() { return ncompression_type(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code requested_pixel_types} field. */
    @NativeType("int *")
    public IntBuffer requested_pixel_types() { return nrequested_pixel_types(address()); }

    /** Sets the specified value to the {@code pixel_aspect_ratio} field. */
    public EXRHeader pixel_aspect_ratio(float value) { npixel_aspect_ratio(address(), value); return this; }
    /** Sets the specified value to the {@code line_order} field. */
    public EXRHeader line_order(int value) { nline_order(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code data_window} field. */
    public EXRHeader data_window(@NativeType("int[4]") IntBuffer value) { ndata_window(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code data_window} field. */
    public EXRHeader data_window(int index, int value) { ndata_window(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code display_window} field. */
    public EXRHeader display_window(@NativeType("int[4]") IntBuffer value) { ndisplay_window(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code display_window} field. */
    public EXRHeader display_window(int index, int value) { ndisplay_window(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code screen_window_center} field. */
    public EXRHeader screen_window_center(@NativeType("float[2]") FloatBuffer value) { nscreen_window_center(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code screen_window_center} field. */
    public EXRHeader screen_window_center(int index, float value) { nscreen_window_center(address(), index, value); return this; }
    /** Sets the specified value to the {@code screen_window_width} field. */
    public EXRHeader screen_window_width(float value) { nscreen_window_width(address(), value); return this; }
    /** Sets the specified value to the {@code chunk_count} field. */
    public EXRHeader chunk_count(int value) { nchunk_count(address(), value); return this; }
    /** Sets the specified value to the {@code tiled} field. */
    public EXRHeader tiled(@NativeType("int") boolean value) { ntiled(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tile_size_x} field. */
    public EXRHeader tile_size_x(int value) { ntile_size_x(address(), value); return this; }
    /** Sets the specified value to the {@code tile_size_y} field. */
    public EXRHeader tile_size_y(int value) { ntile_size_y(address(), value); return this; }
    /** Sets the specified value to the {@code tile_level_mode} field. */
    public EXRHeader tile_level_mode(int value) { ntile_level_mode(address(), value); return this; }
    /** Sets the specified value to the {@code tile_rounding_mode} field. */
    public EXRHeader tile_rounding_mode(int value) { ntile_rounding_mode(address(), value); return this; }
    /** Sets the specified value to the {@code long_name} field. */
    public EXRHeader long_name(@NativeType("int") boolean value) { nlong_name(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code non_image} field. */
    public EXRHeader non_image(@NativeType("int") boolean value) { nnon_image(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multipart} field. */
    public EXRHeader multipart(@NativeType("int") boolean value) { nmultipart(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code header_len} field. */
    public EXRHeader header_len(@NativeType("unsigned int") int value) { nheader_len(address(), value); return this; }
    /** Copies the specified {@link EXRAttribute.Buffer} to the {@code custom_attributes} field. */
    public EXRHeader custom_attributes(@NativeType("EXRAttribute[TINYEXR_MAX_ATTRIBUTES]") EXRAttribute.Buffer value) { ncustom_attributes(address(), value); return this; }
    /** Copies the specified {@link EXRAttribute} at the specified index of the {@code custom_attributes} field. */
    public EXRHeader custom_attributes(int index, EXRAttribute value) { ncustom_attributes(address(), index, value); return this; }
    /** Sets the address of the specified {@link EXRChannelInfo.Buffer} to the {@code channels} field. */
    public EXRHeader channels(@NativeType("EXRChannelInfo *") EXRChannelInfo.Buffer value) { nchannels(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pixel_types} field. */
    public EXRHeader pixel_types(@NativeType("int *") IntBuffer value) { npixel_types(address(), value); return this; }
    /** Sets the specified value to the {@code num_channels} field. */
    public EXRHeader num_channels(int value) { nnum_channels(address(), value); return this; }
    /** Sets the specified value to the {@code compression_type} field. */
    public EXRHeader compression_type(int value) { ncompression_type(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code requested_pixel_types} field. */
    public EXRHeader requested_pixel_types(@NativeType("int *") IntBuffer value) { nrequested_pixel_types(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public EXRHeader set(
        float pixel_aspect_ratio,
        int line_order,
        IntBuffer data_window,
        IntBuffer display_window,
        FloatBuffer screen_window_center,
        float screen_window_width,
        int chunk_count,
        boolean tiled,
        int tile_size_x,
        int tile_size_y,
        int tile_level_mode,
        int tile_rounding_mode,
        boolean long_name,
        boolean non_image,
        boolean multipart,
        int header_len,
        EXRAttribute.Buffer custom_attributes,
        EXRChannelInfo.Buffer channels,
        IntBuffer pixel_types,
        int num_channels,
        int compression_type,
        IntBuffer requested_pixel_types
    ) {
        pixel_aspect_ratio(pixel_aspect_ratio);
        line_order(line_order);
        data_window(data_window);
        display_window(display_window);
        screen_window_center(screen_window_center);
        screen_window_width(screen_window_width);
        chunk_count(chunk_count);
        tiled(tiled);
        tile_size_x(tile_size_x);
        tile_size_y(tile_size_y);
        tile_level_mode(tile_level_mode);
        tile_rounding_mode(tile_rounding_mode);
        long_name(long_name);
        non_image(non_image);
        multipart(multipart);
        header_len(header_len);
        custom_attributes(custom_attributes);
        channels(channels);
        pixel_types(pixel_types);
        num_channels(num_channels);
        compression_type(compression_type);
        requested_pixel_types(requested_pixel_types);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public EXRHeader set(EXRHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link EXRHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EXRHeader malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link EXRHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EXRHeader calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link EXRHeader} instance allocated with {@link BufferUtils}. */
    public static EXRHeader create() {
        return new EXRHeader(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link EXRHeader} instance for the specified memory address. */
    public static EXRHeader create(long address) {
        return new EXRHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRHeader createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link EXRHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link EXRHeader} instance allocated on the thread-local {@link MemoryStack}. */
    public static EXRHeader mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link EXRHeader} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static EXRHeader callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link EXRHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRHeader mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link EXRHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRHeader callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pixel_aspect_ratio}. */
    public static float npixel_aspect_ratio(long struct) { return memGetFloat(struct + EXRHeader.PIXEL_ASPECT_RATIO); }
    /** Unsafe version of {@link #line_order}. */
    public static int nline_order(long struct) { return memGetInt(struct + EXRHeader.LINE_ORDER); }
    /** Unsafe version of {@link #data_window}. */
    public static IntBuffer ndata_window(long struct) { return memIntBuffer(struct + EXRHeader.DATA_WINDOW, 4); }
    /** Unsafe version of {@link #data_window(int) data_window}. */
    public static int ndata_window(long struct, int index) {
        if (CHECKS) { check(index, 4); }
        return memGetInt(struct + EXRHeader.DATA_WINDOW + index * 4);
    }
    /** Unsafe version of {@link #display_window}. */
    public static IntBuffer ndisplay_window(long struct) { return memIntBuffer(struct + EXRHeader.DISPLAY_WINDOW, 4); }
    /** Unsafe version of {@link #display_window(int) display_window}. */
    public static int ndisplay_window(long struct, int index) {
        if (CHECKS) { check(index, 4); }
        return memGetInt(struct + EXRHeader.DISPLAY_WINDOW + index * 4);
    }
    /** Unsafe version of {@link #screen_window_center}. */
    public static FloatBuffer nscreen_window_center(long struct) { return memFloatBuffer(struct + EXRHeader.SCREEN_WINDOW_CENTER, 2); }
    /** Unsafe version of {@link #screen_window_center(int) screen_window_center}. */
    public static float nscreen_window_center(long struct, int index) {
        if (CHECKS) { check(index, 2); }
        return memGetFloat(struct + EXRHeader.SCREEN_WINDOW_CENTER + index * 4);
    }
    /** Unsafe version of {@link #screen_window_width}. */
    public static float nscreen_window_width(long struct) { return memGetFloat(struct + EXRHeader.SCREEN_WINDOW_WIDTH); }
    /** Unsafe version of {@link #chunk_count}. */
    public static int nchunk_count(long struct) { return memGetInt(struct + EXRHeader.CHUNK_COUNT); }
    /** Unsafe version of {@link #tiled}. */
    public static int ntiled(long struct) { return memGetInt(struct + EXRHeader.TILED); }
    /** Unsafe version of {@link #tile_size_x}. */
    public static int ntile_size_x(long struct) { return memGetInt(struct + EXRHeader.TILE_SIZE_X); }
    /** Unsafe version of {@link #tile_size_y}. */
    public static int ntile_size_y(long struct) { return memGetInt(struct + EXRHeader.TILE_SIZE_Y); }
    /** Unsafe version of {@link #tile_level_mode}. */
    public static int ntile_level_mode(long struct) { return memGetInt(struct + EXRHeader.TILE_LEVEL_MODE); }
    /** Unsafe version of {@link #tile_rounding_mode}. */
    public static int ntile_rounding_mode(long struct) { return memGetInt(struct + EXRHeader.TILE_ROUNDING_MODE); }
    /** Unsafe version of {@link #long_name}. */
    public static int nlong_name(long struct) { return memGetInt(struct + EXRHeader.LONG_NAME); }
    /** Unsafe version of {@link #non_image}. */
    public static int nnon_image(long struct) { return memGetInt(struct + EXRHeader.NON_IMAGE); }
    /** Unsafe version of {@link #multipart}. */
    public static int nmultipart(long struct) { return memGetInt(struct + EXRHeader.MULTIPART); }
    /** Unsafe version of {@link #header_len}. */
    public static int nheader_len(long struct) { return memGetInt(struct + EXRHeader.HEADER_LEN); }
    /** Unsafe version of {@link #num_custom_attributes}. */
    public static int nnum_custom_attributes(long struct) { return memGetInt(struct + EXRHeader.NUM_CUSTOM_ATTRIBUTES); }
    /** Unsafe version of {@link #custom_attributes}. */
    public static EXRAttribute.Buffer ncustom_attributes(long struct) { return EXRAttribute.create(struct + EXRHeader.CUSTOM_ATTRIBUTES, nnum_custom_attributes(struct)); }
    /** Unsafe version of {@link #custom_attributes(int) custom_attributes}. */
    public static EXRAttribute ncustom_attributes(long struct, int index) {
        if (CHECKS) { check(index, nnum_custom_attributes(struct)); }
        return EXRAttribute.create(struct + EXRHeader.CUSTOM_ATTRIBUTES + index * EXRAttribute.SIZEOF);
    }
    /** Unsafe version of {@link #channels}. */
    public static EXRChannelInfo.Buffer nchannels(long struct) { return EXRChannelInfo.create(memGetAddress(struct + EXRHeader.CHANNELS), nnum_channels(struct)); }
    /** Unsafe version of {@link #pixel_types() pixel_types}. */
    public static IntBuffer npixel_types(long struct) { return memIntBuffer(memGetAddress(struct + EXRHeader.PIXEL_TYPES), nnum_channels(struct)); }
    /** Unsafe version of {@link #num_channels}. */
    public static int nnum_channels(long struct) { return memGetInt(struct + EXRHeader.NUM_CHANNELS); }
    /** Unsafe version of {@link #compression_type}. */
    public static int ncompression_type(long struct) { return memGetInt(struct + EXRHeader.COMPRESSION_TYPE); }
    /** Unsafe version of {@link #requested_pixel_types() requested_pixel_types}. */
    public static IntBuffer nrequested_pixel_types(long struct) { return memIntBuffer(memGetAddress(struct + EXRHeader.REQUESTED_PIXEL_TYPES), nnum_channels(struct)); }

    /** Unsafe version of {@link #pixel_aspect_ratio(float) pixel_aspect_ratio}. */
    public static void npixel_aspect_ratio(long struct, float value) { memPutFloat(struct + EXRHeader.PIXEL_ASPECT_RATIO, value); }
    /** Unsafe version of {@link #line_order(int) line_order}. */
    public static void nline_order(long struct, int value) { memPutInt(struct + EXRHeader.LINE_ORDER, value); }
    /** Unsafe version of {@link #data_window(IntBuffer) data_window}. */
    public static void ndata_window(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + EXRHeader.DATA_WINDOW, value.remaining() * 4);
    }
    /** Unsafe version of {@link #data_window(int, int) data_window}. */
    public static void ndata_window(long struct, int index, int value) {
        if (CHECKS) { check(index, 4); }
        memPutInt(struct + EXRHeader.DATA_WINDOW + index * 4, value);
    }
    /** Unsafe version of {@link #display_window(IntBuffer) display_window}. */
    public static void ndisplay_window(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + EXRHeader.DISPLAY_WINDOW, value.remaining() * 4);
    }
    /** Unsafe version of {@link #display_window(int, int) display_window}. */
    public static void ndisplay_window(long struct, int index, int value) {
        if (CHECKS) { check(index, 4); }
        memPutInt(struct + EXRHeader.DISPLAY_WINDOW + index * 4, value);
    }
    /** Unsafe version of {@link #screen_window_center(FloatBuffer) screen_window_center}. */
    public static void nscreen_window_center(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + EXRHeader.SCREEN_WINDOW_CENTER, value.remaining() * 4);
    }
    /** Unsafe version of {@link #screen_window_center(int, float) screen_window_center}. */
    public static void nscreen_window_center(long struct, int index, float value) {
        if (CHECKS) { check(index, 2); }
        memPutFloat(struct + EXRHeader.SCREEN_WINDOW_CENTER + index * 4, value);
    }
    /** Unsafe version of {@link #screen_window_width(float) screen_window_width}. */
    public static void nscreen_window_width(long struct, float value) { memPutFloat(struct + EXRHeader.SCREEN_WINDOW_WIDTH, value); }
    /** Unsafe version of {@link #chunk_count(int) chunk_count}. */
    public static void nchunk_count(long struct, int value) { memPutInt(struct + EXRHeader.CHUNK_COUNT, value); }
    /** Unsafe version of {@link #tiled(boolean) tiled}. */
    public static void ntiled(long struct, int value) { memPutInt(struct + EXRHeader.TILED, value); }
    /** Unsafe version of {@link #tile_size_x(int) tile_size_x}. */
    public static void ntile_size_x(long struct, int value) { memPutInt(struct + EXRHeader.TILE_SIZE_X, value); }
    /** Unsafe version of {@link #tile_size_y(int) tile_size_y}. */
    public static void ntile_size_y(long struct, int value) { memPutInt(struct + EXRHeader.TILE_SIZE_Y, value); }
    /** Unsafe version of {@link #tile_level_mode(int) tile_level_mode}. */
    public static void ntile_level_mode(long struct, int value) { memPutInt(struct + EXRHeader.TILE_LEVEL_MODE, value); }
    /** Unsafe version of {@link #tile_rounding_mode(int) tile_rounding_mode}. */
    public static void ntile_rounding_mode(long struct, int value) { memPutInt(struct + EXRHeader.TILE_ROUNDING_MODE, value); }
    /** Unsafe version of {@link #long_name(boolean) long_name}. */
    public static void nlong_name(long struct, int value) { memPutInt(struct + EXRHeader.LONG_NAME, value); }
    /** Unsafe version of {@link #non_image(boolean) non_image}. */
    public static void nnon_image(long struct, int value) { memPutInt(struct + EXRHeader.NON_IMAGE, value); }
    /** Unsafe version of {@link #multipart(boolean) multipart}. */
    public static void nmultipart(long struct, int value) { memPutInt(struct + EXRHeader.MULTIPART, value); }
    /** Unsafe version of {@link #header_len(int) header_len}. */
    public static void nheader_len(long struct, int value) { memPutInt(struct + EXRHeader.HEADER_LEN, value); }
    /** Sets the specified value to the {@code num_custom_attributes} field of the specified {@code struct}. */
    public static void nnum_custom_attributes(long struct, int value) { memPutInt(struct + EXRHeader.NUM_CUSTOM_ATTRIBUTES, value); }
    /** Unsafe version of {@link #custom_attributes(EXRAttribute.Buffer) custom_attributes}. */
    public static void ncustom_attributes(long struct, EXRAttribute.Buffer value) {
        if (CHECKS) { checkGT(value, TINYEXR_MAX_ATTRIBUTES); }
        memCopy(value.address(), struct + EXRHeader.CUSTOM_ATTRIBUTES, value.remaining() * EXRAttribute.SIZEOF);
        nnum_custom_attributes(struct, value.remaining());
    }
    /** Unsafe version of {@link #custom_attributes(int, EXRAttribute) custom_attributes}. */
    public static void ncustom_attributes(long struct, int index, EXRAttribute value) {
        if (CHECKS) { check(index, TINYEXR_MAX_ATTRIBUTES); }
        memCopy(value.address(), struct + EXRHeader.CUSTOM_ATTRIBUTES + index * EXRAttribute.SIZEOF, EXRAttribute.SIZEOF);
    }
    /** Unsafe version of {@link #channels(EXRChannelInfo.Buffer) channels}. */
    public static void nchannels(long struct, EXRChannelInfo.Buffer value) { memPutAddress(struct + EXRHeader.CHANNELS, value.address()); }
    /** Unsafe version of {@link #pixel_types(IntBuffer) pixel_types}. */
    public static void npixel_types(long struct, IntBuffer value) { memPutAddress(struct + EXRHeader.PIXEL_TYPES, memAddress(value)); }
    /** Sets the specified value to the {@code num_channels} field of the specified {@code struct}. */
    public static void nnum_channels(long struct, int value) { memPutInt(struct + EXRHeader.NUM_CHANNELS, value); }
    /** Unsafe version of {@link #compression_type(int) compression_type}. */
    public static void ncompression_type(long struct, int value) { memPutInt(struct + EXRHeader.COMPRESSION_TYPE, value); }
    /** Unsafe version of {@link #requested_pixel_types(IntBuffer) requested_pixel_types}. */
    public static void nrequested_pixel_types(long struct, IntBuffer value) { memPutAddress(struct + EXRHeader.REQUESTED_PIXEL_TYPES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int num_custom_attributes = nnum_custom_attributes(struct);
        long custom_attributes = struct + EXRHeader.CUSTOM_ATTRIBUTES;
        for (int i = 0; i < num_custom_attributes; i++) {
           EXRAttribute.validate(custom_attributes);
           custom_attributes += POINTER_SIZE;
        }
        check(memGetAddress(struct + EXRHeader.CHANNELS));
        check(memGetAddress(struct + EXRHeader.PIXEL_TYPES));
        check(memGetAddress(struct + EXRHeader.REQUESTED_PIXEL_TYPES));
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

    /** An array of {@link EXRHeader} structs. */
    public static class Buffer extends StructBuffer<EXRHeader, Buffer> implements NativeResource {

        /**
         * Creates a new {@link EXRHeader.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EXRHeader#SIZEOF}, and its mark will be undefined.
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
        protected EXRHeader newInstance(long address) {
            return new EXRHeader(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code pixel_aspect_ratio} field. */
        public float pixel_aspect_ratio() { return EXRHeader.npixel_aspect_ratio(address()); }
        /** Returns the value of the {@code line_order} field. */
        public int line_order() { return EXRHeader.nline_order(address()); }
        /** Returns a {@link IntBuffer} view of the {@code data_window} field. */
        @NativeType("int[4]")
        public IntBuffer data_window() { return EXRHeader.ndata_window(address()); }
        /** Returns the value at the specified index of the {@code data_window} field. */
        public int data_window(int index) { return EXRHeader.ndata_window(address(), index); }
        /** Returns a {@link IntBuffer} view of the {@code display_window} field. */
        @NativeType("int[4]")
        public IntBuffer display_window() { return EXRHeader.ndisplay_window(address()); }
        /** Returns the value at the specified index of the {@code display_window} field. */
        public int display_window(int index) { return EXRHeader.ndisplay_window(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code screen_window_center} field. */
        @NativeType("float[2]")
        public FloatBuffer screen_window_center() { return EXRHeader.nscreen_window_center(address()); }
        /** Returns the value at the specified index of the {@code screen_window_center} field. */
        public float screen_window_center(int index) { return EXRHeader.nscreen_window_center(address(), index); }
        /** Returns the value of the {@code screen_window_width} field. */
        public float screen_window_width() { return EXRHeader.nscreen_window_width(address()); }
        /** Returns the value of the {@code chunk_count} field. */
        public int chunk_count() { return EXRHeader.nchunk_count(address()); }
        /** Returns the value of the {@code tiled} field. */
        @NativeType("int")
        public boolean tiled() { return EXRHeader.ntiled(address()) != 0; }
        /** Returns the value of the {@code tile_size_x} field. */
        public int tile_size_x() { return EXRHeader.ntile_size_x(address()); }
        /** Returns the value of the {@code tile_size_y} field. */
        public int tile_size_y() { return EXRHeader.ntile_size_y(address()); }
        /** Returns the value of the {@code tile_level_mode} field. */
        public int tile_level_mode() { return EXRHeader.ntile_level_mode(address()); }
        /** Returns the value of the {@code tile_rounding_mode} field. */
        public int tile_rounding_mode() { return EXRHeader.ntile_rounding_mode(address()); }
        /** Returns the value of the {@code long_name} field. */
        @NativeType("int")
        public boolean long_name() { return EXRHeader.nlong_name(address()) != 0; }
        /** Returns the value of the {@code non_image} field. */
        @NativeType("int")
        public boolean non_image() { return EXRHeader.nnon_image(address()) != 0; }
        /** Returns the value of the {@code multipart} field. */
        @NativeType("int")
        public boolean multipart() { return EXRHeader.nmultipart(address()) != 0; }
        /** Returns the value of the {@code header_len} field. */
        @NativeType("unsigned int")
        public int header_len() { return EXRHeader.nheader_len(address()); }
        /** Returns the value of the {@code num_custom_attributes} field. */
        public int num_custom_attributes() { return EXRHeader.nnum_custom_attributes(address()); }
        /** Returns a {@link EXRAttribute}.Buffer view of the {@code custom_attributes} field. */
        @NativeType("EXRAttribute[TINYEXR_MAX_ATTRIBUTES]")
        public EXRAttribute.Buffer custom_attributes() { return EXRHeader.ncustom_attributes(address()); }
        /** Returns a {@link EXRAttribute} view of the struct at the specified index of the {@code custom_attributes} field. */
        public EXRAttribute custom_attributes(int index) { return EXRHeader.ncustom_attributes(address(), index); }
        /** Returns a {@link EXRChannelInfo.Buffer} view of the struct array pointed to by the {@code channels} field. */
        @NativeType("EXRChannelInfo *")
        public EXRChannelInfo.Buffer channels() { return EXRHeader.nchannels(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pixel_types} field. */
        @NativeType("int *")
        public IntBuffer pixel_types() { return EXRHeader.npixel_types(address()); }
        /** Returns the value of the {@code num_channels} field. */
        public int num_channels() { return EXRHeader.nnum_channels(address()); }
        /** Returns the value of the {@code compression_type} field. */
        public int compression_type() { return EXRHeader.ncompression_type(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code requested_pixel_types} field. */
        @NativeType("int *")
        public IntBuffer requested_pixel_types() { return EXRHeader.nrequested_pixel_types(address()); }

        /** Sets the specified value to the {@code pixel_aspect_ratio} field. */
        public EXRHeader.Buffer pixel_aspect_ratio(float value) { EXRHeader.npixel_aspect_ratio(address(), value); return this; }
        /** Sets the specified value to the {@code line_order} field. */
        public EXRHeader.Buffer line_order(int value) { EXRHeader.nline_order(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code data_window} field. */
        public EXRHeader.Buffer data_window(@NativeType("int[4]") IntBuffer value) { EXRHeader.ndata_window(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code data_window} field. */
        public EXRHeader.Buffer data_window(int index, int value) { EXRHeader.ndata_window(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code display_window} field. */
        public EXRHeader.Buffer display_window(@NativeType("int[4]") IntBuffer value) { EXRHeader.ndisplay_window(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code display_window} field. */
        public EXRHeader.Buffer display_window(int index, int value) { EXRHeader.ndisplay_window(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code screen_window_center} field. */
        public EXRHeader.Buffer screen_window_center(@NativeType("float[2]") FloatBuffer value) { EXRHeader.nscreen_window_center(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code screen_window_center} field. */
        public EXRHeader.Buffer screen_window_center(int index, float value) { EXRHeader.nscreen_window_center(address(), index, value); return this; }
        /** Sets the specified value to the {@code screen_window_width} field. */
        public EXRHeader.Buffer screen_window_width(float value) { EXRHeader.nscreen_window_width(address(), value); return this; }
        /** Sets the specified value to the {@code chunk_count} field. */
        public EXRHeader.Buffer chunk_count(int value) { EXRHeader.nchunk_count(address(), value); return this; }
        /** Sets the specified value to the {@code tiled} field. */
        public EXRHeader.Buffer tiled(@NativeType("int") boolean value) { EXRHeader.ntiled(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tile_size_x} field. */
        public EXRHeader.Buffer tile_size_x(int value) { EXRHeader.ntile_size_x(address(), value); return this; }
        /** Sets the specified value to the {@code tile_size_y} field. */
        public EXRHeader.Buffer tile_size_y(int value) { EXRHeader.ntile_size_y(address(), value); return this; }
        /** Sets the specified value to the {@code tile_level_mode} field. */
        public EXRHeader.Buffer tile_level_mode(int value) { EXRHeader.ntile_level_mode(address(), value); return this; }
        /** Sets the specified value to the {@code tile_rounding_mode} field. */
        public EXRHeader.Buffer tile_rounding_mode(int value) { EXRHeader.ntile_rounding_mode(address(), value); return this; }
        /** Sets the specified value to the {@code long_name} field. */
        public EXRHeader.Buffer long_name(@NativeType("int") boolean value) { EXRHeader.nlong_name(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code non_image} field. */
        public EXRHeader.Buffer non_image(@NativeType("int") boolean value) { EXRHeader.nnon_image(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multipart} field. */
        public EXRHeader.Buffer multipart(@NativeType("int") boolean value) { EXRHeader.nmultipart(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code header_len} field. */
        public EXRHeader.Buffer header_len(@NativeType("unsigned int") int value) { EXRHeader.nheader_len(address(), value); return this; }
        /** Copies the specified {@link EXRAttribute.Buffer} to the {@code custom_attributes} field. */
        public EXRHeader.Buffer custom_attributes(@NativeType("EXRAttribute[TINYEXR_MAX_ATTRIBUTES]") EXRAttribute.Buffer value) { EXRHeader.ncustom_attributes(address(), value); return this; }
        /** Copies the specified {@link EXRAttribute} at the specified index of the {@code custom_attributes} field. */
        public EXRHeader.Buffer custom_attributes(int index, EXRAttribute value) { EXRHeader.ncustom_attributes(address(), index, value); return this; }
        /** Sets the address of the specified {@link EXRChannelInfo.Buffer} to the {@code channels} field. */
        public EXRHeader.Buffer channels(@NativeType("EXRChannelInfo *") EXRChannelInfo.Buffer value) { EXRHeader.nchannels(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pixel_types} field. */
        public EXRHeader.Buffer pixel_types(@NativeType("int *") IntBuffer value) { EXRHeader.npixel_types(address(), value); return this; }
        /** Sets the specified value to the {@code num_channels} field. */
        public EXRHeader.Buffer num_channels(int value) { EXRHeader.nnum_channels(address(), value); return this; }
        /** Sets the specified value to the {@code compression_type} field. */
        public EXRHeader.Buffer compression_type(int value) { EXRHeader.ncompression_type(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code requested_pixel_types} field. */
        public EXRHeader.Buffer requested_pixel_types(@NativeType("int *") IntBuffer value) { EXRHeader.nrequested_pixel_types(address(), value); return this; }

    }

}