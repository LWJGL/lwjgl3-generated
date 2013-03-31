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

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int image_channel_order,
		int image_channel_data_type
	) {
		ByteBuffer struct = malloc();

		image_channel_orderSet(struct, image_channel_order);
		image_channel_data_typeSet(struct, image_channel_data_type);

		return struct;
	}

	public static void image_channel_orderSet(ByteBuffer struct, int image_channel_order) { struct.putInt(struct.position() + IMAGE_CHANNEL_ORDER, image_channel_order); }
	public static void image_channel_data_typeSet(ByteBuffer struct, int image_channel_data_type) { struct.putInt(struct.position() + IMAGE_CHANNEL_DATA_TYPE, image_channel_data_type); }

	public static int image_channel_orderGet(ByteBuffer struct) { return struct.getInt(struct.position() + IMAGE_CHANNEL_ORDER); }
	public static int image_channel_data_typeGet(ByteBuffer struct) { return struct.getInt(struct.position() + IMAGE_CHANNEL_DATA_TYPE); }

}