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

/** Image format struct. */
public class CLImageFormat extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		IMAGE_CHANNEL_ORDER,
		IMAGE_CHANNEL_DATA_TYPE;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		IMAGE_CHANNEL_ORDER = offsets.get(0);
		IMAGE_CHANNEL_DATA_TYPE = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	CLImageFormat(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link CLImageFormat} instance at the specified memory address. */
	public CLImageFormat(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link CLImageFormat} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLImageFormat(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getImageChannelOrder() { return ngetImageChannelOrder(address()); }
	public int getImageChannelDataType() { return ngetImageChannelDataType(address()); }

	public CLImageFormat setImageChannelOrder(int image_channel_order) { nsetImageChannelOrder(address(), image_channel_order); return this; }
	public CLImageFormat setImageChannelDataType(int image_channel_data_type) { nsetImageChannelDataType(address(), image_channel_data_type); return this; }

	/** Initializes this struct with the specified values. */
	public CLImageFormat set(
		int image_channel_order,
		int image_channel_data_type
	) {
		setImageChannelOrder(image_channel_order);
		setImageChannelDataType(image_channel_data_type);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public CLImageFormat nset(long struct) {
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
	public CLImageFormat set(CLImageFormat src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public CLImageFormat set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link CLImageFormat} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static CLImageFormat malloc() {
		return new CLImageFormat(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLImageFormat} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static CLImageFormat calloc() {
		return new CLImageFormat(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLImageFormat} instance allocated with {@link BufferUtils}. */
	public static CLImageFormat create() {
		return new CLImageFormat(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link CLImageFormat.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link CLImageFormat.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link CLImageFormat.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetImageChannelOrder(long struct) { return memGetInt(struct + IMAGE_CHANNEL_ORDER); }
	public static int getImageChannelOrder(ByteBuffer struct) { return ngetImageChannelOrder(memAddress(struct)); }
	public static int ngetImageChannelDataType(long struct) { return memGetInt(struct + IMAGE_CHANNEL_DATA_TYPE); }
	public static int getImageChannelDataType(ByteBuffer struct) { return ngetImageChannelDataType(memAddress(struct)); }

	public static void nsetImageChannelOrder(long struct, int image_channel_order) { memPutInt(struct + IMAGE_CHANNEL_ORDER, image_channel_order); }
	public static void setImageChannelOrder(ByteBuffer struct, int image_channel_order) { nsetImageChannelOrder(memAddress(struct), image_channel_order); }
	public static void nsetImageChannelDataType(long struct, int image_channel_data_type) { memPutInt(struct + IMAGE_CHANNEL_DATA_TYPE, image_channel_data_type); }
	public static void setImageChannelDataType(ByteBuffer struct, int image_channel_data_type) { nsetImageChannelDataType(memAddress(struct), image_channel_data_type); }

	// -----------------------------------

	/** An array of {@link CLImageFormat} structs. */
	public static final class Buffer extends StructBuffer<CLImageFormat, Buffer> {

		/**
		 * Creates a new {@link CLImageFormat.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link CLImageFormat#SIZEOF}, and its mark will be undefined.
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
		protected CLImageFormat newInstance(long address) {
			return new CLImageFormat(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getImageChannelOrder() { return ngetImageChannelOrder(address()); }
		public int getImageChannelDataType() { return ngetImageChannelDataType(address()); }

		public CLImageFormat.Buffer setImageChannelOrder(int image_channel_order) { nsetImageChannelOrder(address(), image_channel_order); return this; }
		public CLImageFormat.Buffer setImageChannelDataType(int image_channel_data_type) { nsetImageChannelDataType(address(), image_channel_data_type); return this; }

	}

}