/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Image description struct. */
public class CLImageDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		IMAGE_TYPE,
		IMAGE_WIDTH,
		IMAGE_HEIGHT,
		IMAGE_DEPTH,
		IMAGE_ARRAY_SIZE,
		IMAGE_ROW_PITCH,
		IMAGE_SLICE_PITCH,
		NUM_MIP_LEVELS,
		NUM_SAMPLES,
		BUFFER;

	static {
		IntBuffer offsets = memAllocInt(10);

		SIZEOF = offsets(memAddress(offsets));

		IMAGE_TYPE = offsets.get(0);
		IMAGE_WIDTH = offsets.get(1);
		IMAGE_HEIGHT = offsets.get(2);
		IMAGE_DEPTH = offsets.get(3);
		IMAGE_ARRAY_SIZE = offsets.get(4);
		IMAGE_ROW_PITCH = offsets.get(5);
		IMAGE_SLICE_PITCH = offsets.get(6);
		NUM_MIP_LEVELS = offsets.get(7);
		NUM_SAMPLES = offsets.get(8);
		BUFFER = offsets.get(9);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	CLImageDesc(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link CLImageDesc} instance at the specified memory address. */
	public CLImageDesc(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link CLImageDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLImageDesc(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getImageType() { return ngetImageType(address()); }
	public long getImageWidth() { return ngetImageWidth(address()); }
	public long getImageHeight() { return ngetImageHeight(address()); }
	public long getImageDepth() { return ngetImageDepth(address()); }
	public long getImageArraySize() { return ngetImageArraySize(address()); }
	public long getImageRowPitch() { return ngetImageRowPitch(address()); }
	public long getImageSlicePitch() { return ngetImageSlicePitch(address()); }
	public int getNumMipLevels() { return ngetNumMipLevels(address()); }
	public int getNumSamples() { return ngetNumSamples(address()); }
	public long getBuffer() { return ngetBuffer(address()); }

	public CLImageDesc setImageType(int image_type) { nsetImageType(address(), image_type); return this; }
	public CLImageDesc setImageWidth(long image_width) { nsetImageWidth(address(), image_width); return this; }
	public CLImageDesc setImageHeight(long image_height) { nsetImageHeight(address(), image_height); return this; }
	public CLImageDesc setImageDepth(long image_depth) { nsetImageDepth(address(), image_depth); return this; }
	public CLImageDesc setImageArraySize(long image_array_size) { nsetImageArraySize(address(), image_array_size); return this; }
	public CLImageDesc setImageRowPitch(long image_row_pitch) { nsetImageRowPitch(address(), image_row_pitch); return this; }
	public CLImageDesc setImageSlicePitch(long image_slice_pitch) { nsetImageSlicePitch(address(), image_slice_pitch); return this; }
	public CLImageDesc setNumMipLevels(int num_mip_levels) { nsetNumMipLevels(address(), num_mip_levels); return this; }
	public CLImageDesc setNumSamples(int num_samples) { nsetNumSamples(address(), num_samples); return this; }
	public CLImageDesc setBuffer(long buffer) { nsetBuffer(address(), buffer); return this; }

	/** Initializes this struct with the specified values. */
	public CLImageDesc set(
		int image_type,
		long image_width,
		long image_height,
		long image_depth,
		long image_array_size,
		long image_row_pitch,
		long image_slice_pitch,
		int num_mip_levels,
		int num_samples,
		long buffer
	) {
		setImageType(image_type);
		setImageWidth(image_width);
		setImageHeight(image_height);
		setImageDepth(image_depth);
		setImageArraySize(image_array_size);
		setImageRowPitch(image_row_pitch);
		setImageSlicePitch(image_slice_pitch);
		setNumMipLevels(num_mip_levels);
		setNumSamples(num_samples);
		setBuffer(buffer);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public CLImageDesc nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public CLImageDesc set(CLImageDesc src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public CLImageDesc set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link CLImageDesc} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static CLImageDesc malloc() {
		return new CLImageDesc(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLImageDesc} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static CLImageDesc calloc() {
		return new CLImageDesc(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLImageDesc} instance allocated with {@link BufferUtils}. */
	public static CLImageDesc create() {
		return new CLImageDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link CLImageDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link CLImageDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link CLImageDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetImageType(long struct) { return memGetInt(struct + IMAGE_TYPE); }
	public static int getImageType(ByteBuffer struct) { return ngetImageType(memAddress(struct)); }
	public static long ngetImageWidth(long struct) { return memGetAddress(struct + IMAGE_WIDTH); }
	public static long getImageWidth(ByteBuffer struct) { return ngetImageWidth(memAddress(struct)); }
	public static long ngetImageHeight(long struct) { return memGetAddress(struct + IMAGE_HEIGHT); }
	public static long getImageHeight(ByteBuffer struct) { return ngetImageHeight(memAddress(struct)); }
	public static long ngetImageDepth(long struct) { return memGetAddress(struct + IMAGE_DEPTH); }
	public static long getImageDepth(ByteBuffer struct) { return ngetImageDepth(memAddress(struct)); }
	public static long ngetImageArraySize(long struct) { return memGetAddress(struct + IMAGE_ARRAY_SIZE); }
	public static long getImageArraySize(ByteBuffer struct) { return ngetImageArraySize(memAddress(struct)); }
	public static long ngetImageRowPitch(long struct) { return memGetAddress(struct + IMAGE_ROW_PITCH); }
	public static long getImageRowPitch(ByteBuffer struct) { return ngetImageRowPitch(memAddress(struct)); }
	public static long ngetImageSlicePitch(long struct) { return memGetAddress(struct + IMAGE_SLICE_PITCH); }
	public static long getImageSlicePitch(ByteBuffer struct) { return ngetImageSlicePitch(memAddress(struct)); }
	public static int ngetNumMipLevels(long struct) { return memGetInt(struct + NUM_MIP_LEVELS); }
	public static int getNumMipLevels(ByteBuffer struct) { return ngetNumMipLevels(memAddress(struct)); }
	public static int ngetNumSamples(long struct) { return memGetInt(struct + NUM_SAMPLES); }
	public static int getNumSamples(ByteBuffer struct) { return ngetNumSamples(memAddress(struct)); }
	public static long ngetBuffer(long struct) { return memGetAddress(struct + BUFFER); }
	public static long getBuffer(ByteBuffer struct) { return ngetBuffer(memAddress(struct)); }

	public static void nsetImageType(long struct, int image_type) { memPutInt(struct + IMAGE_TYPE, image_type); }
	public static void setImageType(ByteBuffer struct, int image_type) { nsetImageType(memAddress(struct), image_type); }
	public static void nsetImageWidth(long struct, long image_width) { memPutAddress(struct + IMAGE_WIDTH, image_width); }
	public static void setImageWidth(ByteBuffer struct, long image_width) { nsetImageWidth(memAddress(struct), image_width); }
	public static void nsetImageHeight(long struct, long image_height) { memPutAddress(struct + IMAGE_HEIGHT, image_height); }
	public static void setImageHeight(ByteBuffer struct, long image_height) { nsetImageHeight(memAddress(struct), image_height); }
	public static void nsetImageDepth(long struct, long image_depth) { memPutAddress(struct + IMAGE_DEPTH, image_depth); }
	public static void setImageDepth(ByteBuffer struct, long image_depth) { nsetImageDepth(memAddress(struct), image_depth); }
	public static void nsetImageArraySize(long struct, long image_array_size) { memPutAddress(struct + IMAGE_ARRAY_SIZE, image_array_size); }
	public static void setImageArraySize(ByteBuffer struct, long image_array_size) { nsetImageArraySize(memAddress(struct), image_array_size); }
	public static void nsetImageRowPitch(long struct, long image_row_pitch) { memPutAddress(struct + IMAGE_ROW_PITCH, image_row_pitch); }
	public static void setImageRowPitch(ByteBuffer struct, long image_row_pitch) { nsetImageRowPitch(memAddress(struct), image_row_pitch); }
	public static void nsetImageSlicePitch(long struct, long image_slice_pitch) { memPutAddress(struct + IMAGE_SLICE_PITCH, image_slice_pitch); }
	public static void setImageSlicePitch(ByteBuffer struct, long image_slice_pitch) { nsetImageSlicePitch(memAddress(struct), image_slice_pitch); }
	public static void nsetNumMipLevels(long struct, int num_mip_levels) { memPutInt(struct + NUM_MIP_LEVELS, num_mip_levels); }
	public static void setNumMipLevels(ByteBuffer struct, int num_mip_levels) { nsetNumMipLevels(memAddress(struct), num_mip_levels); }
	public static void nsetNumSamples(long struct, int num_samples) { memPutInt(struct + NUM_SAMPLES, num_samples); }
	public static void setNumSamples(ByteBuffer struct, int num_samples) { nsetNumSamples(memAddress(struct), num_samples); }
	public static void nsetBuffer(long struct, long buffer) { memPutAddress(struct + BUFFER, buffer); }
	public static void setBuffer(ByteBuffer struct, long buffer) { nsetBuffer(memAddress(struct), buffer); }

	// -----------------------------------

	/** An array of {@link CLImageDesc} structs. */
	public static final class Buffer extends StructBuffer<CLImageDesc, Buffer> {

		/**
		 * Creates a new {@link CLImageDesc.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link CLImageDesc#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected CLImageDesc newInstance(long address) {
			return new CLImageDesc(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getImageType() { return ngetImageType(address()); }
		public long getImageWidth() { return ngetImageWidth(address()); }
		public long getImageHeight() { return ngetImageHeight(address()); }
		public long getImageDepth() { return ngetImageDepth(address()); }
		public long getImageArraySize() { return ngetImageArraySize(address()); }
		public long getImageRowPitch() { return ngetImageRowPitch(address()); }
		public long getImageSlicePitch() { return ngetImageSlicePitch(address()); }
		public int getNumMipLevels() { return ngetNumMipLevels(address()); }
		public int getNumSamples() { return ngetNumSamples(address()); }
		public long getBuffer() { return ngetBuffer(address()); }

		public CLImageDesc.Buffer setImageType(int image_type) { nsetImageType(address(), image_type); return this; }
		public CLImageDesc.Buffer setImageWidth(long image_width) { nsetImageWidth(address(), image_width); return this; }
		public CLImageDesc.Buffer setImageHeight(long image_height) { nsetImageHeight(address(), image_height); return this; }
		public CLImageDesc.Buffer setImageDepth(long image_depth) { nsetImageDepth(address(), image_depth); return this; }
		public CLImageDesc.Buffer setImageArraySize(long image_array_size) { nsetImageArraySize(address(), image_array_size); return this; }
		public CLImageDesc.Buffer setImageRowPitch(long image_row_pitch) { nsetImageRowPitch(address(), image_row_pitch); return this; }
		public CLImageDesc.Buffer setImageSlicePitch(long image_slice_pitch) { nsetImageSlicePitch(address(), image_slice_pitch); return this; }
		public CLImageDesc.Buffer setNumMipLevels(int num_mip_levels) { nsetNumMipLevels(address(), num_mip_levels); return this; }
		public CLImageDesc.Buffer setNumSamples(int num_samples) { nsetNumSamples(address(), num_samples); return this; }
		public CLImageDesc.Buffer setBuffer(long buffer) { nsetBuffer(address(), buffer); return this; }

	}

}