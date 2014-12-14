/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Image format struct. */
public final class CLImageFormat implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		IMAGE_CHANNEL_ORDER,
		IMAGE_CHANNEL_DATA_TYPE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		IMAGE_CHANNEL_ORDER = offsets.get(0);
		IMAGE_CHANNEL_DATA_TYPE = offsets.get(1);
	}

	private final ByteBuffer struct;

	public CLImageFormat() {
		this(malloc());
	}

	public CLImageFormat(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setImageChannelOrder(int image_channel_order) { image_channel_order(struct, image_channel_order); }
	public void setImageChannelDataType(int image_channel_data_type) { image_channel_data_type(struct, image_channel_data_type); }

	public int getImageChannelOrder() { return image_channel_order(struct); }
	public int getImageChannelDataType() { return image_channel_data_type(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int image_channel_order,
		int image_channel_data_type
	) {
		ByteBuffer cl_image_format = malloc();

		image_channel_order(cl_image_format, image_channel_order);
		image_channel_data_type(cl_image_format, image_channel_data_type);

		return cl_image_format;
	}

	public static void image_channel_order(ByteBuffer cl_image_format, int image_channel_order) { cl_image_format.putInt(cl_image_format.position() + IMAGE_CHANNEL_ORDER, image_channel_order); }
	public static void image_channel_data_type(ByteBuffer cl_image_format, int image_channel_data_type) { cl_image_format.putInt(cl_image_format.position() + IMAGE_CHANNEL_DATA_TYPE, image_channel_data_type); }

	public static int image_channel_order(ByteBuffer cl_image_format) { return cl_image_format.getInt(cl_image_format.position() + IMAGE_CHANNEL_ORDER); }
	public static int image_channel_data_type(ByteBuffer cl_image_format) { return cl_image_format.getInt(cl_image_format.position() + IMAGE_CHANNEL_DATA_TYPE); }

}