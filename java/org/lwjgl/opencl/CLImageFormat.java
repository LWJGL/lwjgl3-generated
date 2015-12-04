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

/**
 * The image format descriptor struct.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct cl_image_format {
 *     cl_channel_order image_channel_order;
 *     cl_channel_type image_channel_data_type;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>image_channel_order</td><td>specifies the number of channels and the channel layout i.e. the memory layout in which channels are stored in the image</td></tr>
 * <tr><td>image_channel_data_type</td><td>describes the size of the channel data type. The number of bits per element determined by the {@code image_channel_data_type} and
 * {@code image_channel_order} must be a power of two.</td></tr>
 * </table>
 */
public class CLImageFormat extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		IMAGE_CHANNEL_ORDER,
		IMAGE_CHANNEL_DATA_TYPE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		IMAGE_CHANNEL_ORDER = layout.offsetof(0);
		IMAGE_CHANNEL_DATA_TYPE = layout.offsetof(1);
	}

	CLImageFormat(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link CLImageFormat} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLImageFormat(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code image_channel_order} field. */
	public int image_channel_order() { return nimage_channel_order(address()); }
	/** Returns the value of the {@code image_channel_data_type} field. */
	public int image_channel_data_type() { return nimage_channel_data_type(address()); }

	/** Sets the specified value to the {@code image_channel_order} field. */
	public CLImageFormat image_channel_order(int value) { nimage_channel_order(address(), value); return this; }
	/** Sets the specified value to the {@code image_channel_data_type} field. */
	public CLImageFormat image_channel_data_type(int value) { nimage_channel_data_type(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public CLImageFormat set(
		int image_channel_order,
		int image_channel_data_type
	) {
		image_channel_order(image_channel_order);
		image_channel_data_type(image_channel_data_type);

		return this;
	}

	/** Unsafe version of {@link #set(CLImageFormat) set}. */
	public CLImageFormat nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public CLImageFormat set(CLImageFormat src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(CLImageFormat) set}. */
	public CLImageFormat set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link CLImageFormat} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static CLImageFormat malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLImageFormat} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static CLImageFormat calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLImageFormat} instance allocated with {@link BufferUtils}. */
	public static CLImageFormat create() {
		return new CLImageFormat(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link CLImageFormat} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static CLImageFormat create(long address) {
		return address == NULL ? null : new CLImageFormat(address, null);
	}

	/**
	 * Returns a new {@link CLImageFormat.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CLImageFormat.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CLImageFormat.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link CLImageFormat.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #image_channel_order}. */
	public static int nimage_channel_order(long struct) { return memGetInt(struct + CLImageFormat.IMAGE_CHANNEL_ORDER); }
	/** Unsafe version of {@link #image_channel_data_type}. */
	public static int nimage_channel_data_type(long struct) { return memGetInt(struct + CLImageFormat.IMAGE_CHANNEL_DATA_TYPE); }

	/** Unsafe version of {@link #image_channel_order(int) image_channel_order}. */
	public static void nimage_channel_order(long struct, int value) { memPutInt(struct + CLImageFormat.IMAGE_CHANNEL_ORDER, value); }
	/** Unsafe version of {@link #image_channel_data_type(int) image_channel_data_type}. */
	public static void nimage_channel_data_type(long struct, int value) { memPutInt(struct + CLImageFormat.IMAGE_CHANNEL_DATA_TYPE, value); }

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
		protected CLImageFormat newInstance(long address) {
			return new CLImageFormat(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code image_channel_order} field. */
		public int image_channel_order() { return CLImageFormat.nimage_channel_order(address()); }
		/** Returns the value of the {@code image_channel_data_type} field. */
		public int image_channel_data_type() { return CLImageFormat.nimage_channel_data_type(address()); }

		/** Sets the specified value to the {@code image_channel_order} field. */
		public CLImageFormat.Buffer image_channel_order(int value) { CLImageFormat.nimage_channel_order(address(), value); return this; }
		/** Sets the specified value to the {@code image_channel_data_type} field. */
		public CLImageFormat.Buffer image_channel_data_type(int value) { CLImageFormat.nimage_channel_data_type(address(), value); return this; }

	}

}