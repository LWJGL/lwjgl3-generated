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
 * Describes the type and dimensions of the image or image array.
 * 
 * <h3>cl_image_desc members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>image_type</td><td class="nw">cl_mem_object_type</td><td>describes the image type</td></tr>
 * <tr><td>image_width</td><td class="nw">size_t</td><td>the width of the image in pixels. For a 2D image and image array, the image width must be &le; {@link CL10#CL_DEVICE_IMAGE2D_MAX_WIDTH}. For a 3D image, the
 * image width must be &le; {@link CL10#CL_DEVICE_IMAGE3D_MAX_WIDTH}. For a 1D image buffer, the image width must be &le; {@link CL10#CL_DEVICE_IMAGE_MAX_BUFFER_SIZE}.
 * For a 1D image and 1D image array, the image width must be &le; {@link CL10#CL_DEVICE_IMAGE2D_MAX_WIDTH}.</td></tr>
 * <tr><td>image_height</td><td class="nw">size_t</td><td>the height of the image in pixels. This is only used if the image is a 2D, 3D or 2D image array. For a 2D image or image array, the image height must
 * be &le; {@link CL10#CL_DEVICE_IMAGE2D_MAX_HEIGHT}. For a 3D image, the image height must be &le; {@link CL10#CL_DEVICE_IMAGE3D_MAX_HEIGHT}.</td></tr>
 * <tr><td>image_depth</td><td class="nw">size_t</td><td>the depth of the image in pixels. This is only used if the image is a 3D image and must be a value &ge; 1 and &le; {@link CL10#CL_DEVICE_IMAGE3D_MAX_DEPTH}.</td></tr>
 * <tr><td>image_array_size</td><td class="nw">size_t</td><td>the number of images in the image array. This is only used if the image is a 1D or 2D image array. The values for {@code image_array_size}, if
 * specified, must be a value &ge; 1 and &le; {@link CL10#CL_DEVICE_IMAGE_MAX_ARRAY_SIZE}.
 * 
 * <p>Note that reading and writing 2D image arrays from a kernel with {@code image_array_size = 1} may be lower performance than 2D images.</td></tr>
 * <tr><td>image_row_pitch</td><td class="nw">size_t</td><td>the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &ge; {@code image_width * size} of element in bytes if
 * {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch = 0}, {@code image_row_pitch} is calculated as
 * {@code image_width * size} of element in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.</td></tr>
 * <tr><td>image_slice_pitch</td><td class="nw">size_t</td><td>the size in bytes of each 2D slice in the 3D image or the size in bytes of each image in a 1D or 2D image array. This must be 0 if {@code host_ptr} is
 * {@code NULL}. If {@code host_ptr} is not {@code NULL}, {@code image_slice_pitch} can be either 0 or &ge; {@code image_row_pitch * image_height} for a 2D image array
 * or 3D image and can be either 0 or &ge; {@code image_row_pitch} for a 1D image array. If {@code host_ptr} is not {@code NULL} and
 * {@code image_slice_pitch = 0}, {@code image_slice_pitch} is calculated as {@code image_row_pitch * image_height} for a 2D image array or 3D image and
 * {@code image_row_pitch} for a 1D image array. If {@code image_slice_pitch} is not 0, it must be a multiple of the {@code image_row_pitch}.</td></tr>
 * <tr><td>num_mip_levels</td><td class="nw">cl_uint</td><td>must be 0</td></tr>
 * <tr><td>num_samples</td><td class="nw">cl_uint</td><td>must be 0</td></tr>
 * <tr><td>buffer</td><td class="nw">cl_mem</td><td>refers to a valid buffer memory object if {@code image_type} is {@link CL10#CL_MEM_OBJECT_IMAGE1D_BUFFER}. Otherwise it must be {@code NULL}. For a 1D image buffer
 * object, the image pixels are taken from the buffer object's data store. When the contents of a buffer object's data store are modified, those changes
 * are reflected in the contents of the 1D image buffer object and vice-versa at corresponding sychronization points. The {@code image_width * size} of
 * element in bytes must be &le; size of buffer object data store.</td></tr>
 * </table></p>
 */
public class CLImageDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		Layout layout = __struct(
			__member(4),
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(4),
			__member(4),
			__member(Pointer.POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		IMAGE_TYPE = layout.offsetof(0);
		IMAGE_WIDTH = layout.offsetof(1);
		IMAGE_HEIGHT = layout.offsetof(2);
		IMAGE_DEPTH = layout.offsetof(3);
		IMAGE_ARRAY_SIZE = layout.offsetof(4);
		IMAGE_ROW_PITCH = layout.offsetof(5);
		IMAGE_SLICE_PITCH = layout.offsetof(6);
		NUM_MIP_LEVELS = layout.offsetof(7);
		NUM_SAMPLES = layout.offsetof(8);
		BUFFER = layout.offsetof(9);
	}

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

	/** Returns the value of the {@code image_type} field. */
	public int image_type() { return nimage_type(address()); }
	/** Returns the value of the {@code image_width} field. */
	public long image_width() { return nimage_width(address()); }
	/** Returns the value of the {@code image_height} field. */
	public long image_height() { return nimage_height(address()); }
	/** Returns the value of the {@code image_depth} field. */
	public long image_depth() { return nimage_depth(address()); }
	/** Returns the value of the {@code image_array_size} field. */
	public long image_array_size() { return nimage_array_size(address()); }
	/** Returns the value of the {@code image_row_pitch} field. */
	public long image_row_pitch() { return nimage_row_pitch(address()); }
	/** Returns the value of the {@code image_slice_pitch} field. */
	public long image_slice_pitch() { return nimage_slice_pitch(address()); }
	/** Returns the value of the {@code num_mip_levels} field. */
	public int num_mip_levels() { return nnum_mip_levels(address()); }
	/** Returns the value of the {@code num_samples} field. */
	public int num_samples() { return nnum_samples(address()); }
	/** Returns the value of the {@code buffer} field. */
	public long buffer() { return nbuffer(address()); }

	/** Sets the specified value to the {@code image_type} field. */
	public CLImageDesc image_type(int value) { nimage_type(address(), value); return this; }
	/** Sets the specified value to the {@code image_width} field. */
	public CLImageDesc image_width(long value) { nimage_width(address(), value); return this; }
	/** Sets the specified value to the {@code image_height} field. */
	public CLImageDesc image_height(long value) { nimage_height(address(), value); return this; }
	/** Sets the specified value to the {@code image_depth} field. */
	public CLImageDesc image_depth(long value) { nimage_depth(address(), value); return this; }
	/** Sets the specified value to the {@code image_array_size} field. */
	public CLImageDesc image_array_size(long value) { nimage_array_size(address(), value); return this; }
	/** Sets the specified value to the {@code image_row_pitch} field. */
	public CLImageDesc image_row_pitch(long value) { nimage_row_pitch(address(), value); return this; }
	/** Sets the specified value to the {@code image_slice_pitch} field. */
	public CLImageDesc image_slice_pitch(long value) { nimage_slice_pitch(address(), value); return this; }
	/** Sets the specified value to the {@code num_mip_levels} field. */
	public CLImageDesc num_mip_levels(int value) { nnum_mip_levels(address(), value); return this; }
	/** Sets the specified value to the {@code num_samples} field. */
	public CLImageDesc num_samples(int value) { nnum_samples(address(), value); return this; }
	/** Sets the specified value to the {@code buffer} field. */
	public CLImageDesc buffer(long value) { nbuffer(address(), value); return this; }

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
		image_type(image_type);
		image_width(image_width);
		image_height(image_height);
		image_depth(image_depth);
		image_array_size(image_array_size);
		image_row_pitch(image_row_pitch);
		image_slice_pitch(image_slice_pitch);
		num_mip_levels(num_mip_levels);
		num_samples(num_samples);
		buffer(buffer);

		return this;
	}

	/** Unsafe version of {@link #set(CLImageDesc) set}. */
	public CLImageDesc nset(long struct) {
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
	public CLImageDesc set(CLImageDesc src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(CLImageDesc) set}. */
	public CLImageDesc set(ByteBuffer struct) {
		if ( CHECKS )
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

	/**
	 * Create a {@link CLImageDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #image_type}. */
	public static int nimage_type(long struct) { return memGetInt(struct + CLImageDesc.IMAGE_TYPE); }
	/** Unsafe version of {@link #image_width}. */
	public static long nimage_width(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_WIDTH); }
	/** Unsafe version of {@link #image_height}. */
	public static long nimage_height(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_HEIGHT); }
	/** Unsafe version of {@link #image_depth}. */
	public static long nimage_depth(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_DEPTH); }
	/** Unsafe version of {@link #image_array_size}. */
	public static long nimage_array_size(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_ARRAY_SIZE); }
	/** Unsafe version of {@link #image_row_pitch}. */
	public static long nimage_row_pitch(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_ROW_PITCH); }
	/** Unsafe version of {@link #image_slice_pitch}. */
	public static long nimage_slice_pitch(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_SLICE_PITCH); }
	/** Unsafe version of {@link #num_mip_levels}. */
	public static int nnum_mip_levels(long struct) { return memGetInt(struct + CLImageDesc.NUM_MIP_LEVELS); }
	/** Unsafe version of {@link #num_samples}. */
	public static int nnum_samples(long struct) { return memGetInt(struct + CLImageDesc.NUM_SAMPLES); }
	/** Unsafe version of {@link #buffer}. */
	public static long nbuffer(long struct) { return memGetAddress(struct + CLImageDesc.BUFFER); }

	/** Unsafe version of {@link #image_type(int) image_type}. */
	public static void nimage_type(long struct, int value) { memPutInt(struct + CLImageDesc.IMAGE_TYPE, value); }
	/** Unsafe version of {@link #image_width(long) image_width}. */
	public static void nimage_width(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_WIDTH, value); }
	/** Unsafe version of {@link #image_height(long) image_height}. */
	public static void nimage_height(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_HEIGHT, value); }
	/** Unsafe version of {@link #image_depth(long) image_depth}. */
	public static void nimage_depth(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_DEPTH, value); }
	/** Unsafe version of {@link #image_array_size(long) image_array_size}. */
	public static void nimage_array_size(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_ARRAY_SIZE, value); }
	/** Unsafe version of {@link #image_row_pitch(long) image_row_pitch}. */
	public static void nimage_row_pitch(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_ROW_PITCH, value); }
	/** Unsafe version of {@link #image_slice_pitch(long) image_slice_pitch}. */
	public static void nimage_slice_pitch(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_SLICE_PITCH, value); }
	/** Unsafe version of {@link #num_mip_levels(int) num_mip_levels}. */
	public static void nnum_mip_levels(long struct, int value) { memPutInt(struct + CLImageDesc.NUM_MIP_LEVELS, value); }
	/** Unsafe version of {@link #num_samples(int) num_samples}. */
	public static void nnum_samples(long struct, int value) { memPutInt(struct + CLImageDesc.NUM_SAMPLES, value); }
	/** Unsafe version of {@link #buffer(long) buffer}. */
	public static void nbuffer(long struct, long value) { memPutAddress(struct + CLImageDesc.BUFFER, value); }

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

		/** Returns the value of the {@code image_type} field. */
		public int image_type() { return nimage_type(address()); }
		/** Returns the value of the {@code image_width} field. */
		public long image_width() { return nimage_width(address()); }
		/** Returns the value of the {@code image_height} field. */
		public long image_height() { return nimage_height(address()); }
		/** Returns the value of the {@code image_depth} field. */
		public long image_depth() { return nimage_depth(address()); }
		/** Returns the value of the {@code image_array_size} field. */
		public long image_array_size() { return nimage_array_size(address()); }
		/** Returns the value of the {@code image_row_pitch} field. */
		public long image_row_pitch() { return nimage_row_pitch(address()); }
		/** Returns the value of the {@code image_slice_pitch} field. */
		public long image_slice_pitch() { return nimage_slice_pitch(address()); }
		/** Returns the value of the {@code num_mip_levels} field. */
		public int num_mip_levels() { return nnum_mip_levels(address()); }
		/** Returns the value of the {@code num_samples} field. */
		public int num_samples() { return nnum_samples(address()); }
		/** Returns the value of the {@code buffer} field. */
		public long buffer() { return nbuffer(address()); }

		/** Sets the specified value to the {@code image_type} field. */
		public CLImageDesc.Buffer image_type(int value) { nimage_type(address(), value); return this; }
		/** Sets the specified value to the {@code image_width} field. */
		public CLImageDesc.Buffer image_width(long value) { nimage_width(address(), value); return this; }
		/** Sets the specified value to the {@code image_height} field. */
		public CLImageDesc.Buffer image_height(long value) { nimage_height(address(), value); return this; }
		/** Sets the specified value to the {@code image_depth} field. */
		public CLImageDesc.Buffer image_depth(long value) { nimage_depth(address(), value); return this; }
		/** Sets the specified value to the {@code image_array_size} field. */
		public CLImageDesc.Buffer image_array_size(long value) { nimage_array_size(address(), value); return this; }
		/** Sets the specified value to the {@code image_row_pitch} field. */
		public CLImageDesc.Buffer image_row_pitch(long value) { nimage_row_pitch(address(), value); return this; }
		/** Sets the specified value to the {@code image_slice_pitch} field. */
		public CLImageDesc.Buffer image_slice_pitch(long value) { nimage_slice_pitch(address(), value); return this; }
		/** Sets the specified value to the {@code num_mip_levels} field. */
		public CLImageDesc.Buffer num_mip_levels(int value) { nnum_mip_levels(address(), value); return this; }
		/** Sets the specified value to the {@code num_samples} field. */
		public CLImageDesc.Buffer num_samples(int value) { nnum_samples(address(), value); return this; }
		/** Sets the specified value to the {@code buffer} field. */
		public CLImageDesc.Buffer buffer(long value) { nbuffer(address(), value); return this; }

	}

}