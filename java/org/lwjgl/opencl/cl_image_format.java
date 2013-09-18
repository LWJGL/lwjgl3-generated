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
public final class cl_image_format {

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

	private cl_image_format() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
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