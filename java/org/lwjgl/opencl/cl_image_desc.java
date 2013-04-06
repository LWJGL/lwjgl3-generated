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

/** Image description struct. */
public final class cl_image_desc {

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
		IntBuffer offsets = BufferUtils.createIntBuffer(10);

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
	}

	private cl_image_desc() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
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
		ByteBuffer cl_image_desc = malloc();

		image_typeSet(cl_image_desc, image_type);
		image_widthSet(cl_image_desc, image_width);
		image_heightSet(cl_image_desc, image_height);
		image_depthSet(cl_image_desc, image_depth);
		image_array_sizeSet(cl_image_desc, image_array_size);
		image_row_pitchSet(cl_image_desc, image_row_pitch);
		image_slice_pitchSet(cl_image_desc, image_slice_pitch);
		num_mip_levelsSet(cl_image_desc, num_mip_levels);
		num_samplesSet(cl_image_desc, num_samples);
		bufferSet(cl_image_desc, buffer);

		return cl_image_desc;
	}

	public static void image_typeSet(ByteBuffer cl_image_desc, int image_type) { cl_image_desc.putInt(cl_image_desc.position() + IMAGE_TYPE, image_type); }
	public static void image_widthSet(ByteBuffer cl_image_desc, long image_width) { PointerBuffer.put(cl_image_desc, cl_image_desc.position() + IMAGE_WIDTH, image_width); }
	public static void image_heightSet(ByteBuffer cl_image_desc, long image_height) { PointerBuffer.put(cl_image_desc, cl_image_desc.position() + IMAGE_HEIGHT, image_height); }
	public static void image_depthSet(ByteBuffer cl_image_desc, long image_depth) { PointerBuffer.put(cl_image_desc, cl_image_desc.position() + IMAGE_DEPTH, image_depth); }
	public static void image_array_sizeSet(ByteBuffer cl_image_desc, long image_array_size) { PointerBuffer.put(cl_image_desc, cl_image_desc.position() + IMAGE_ARRAY_SIZE, image_array_size); }
	public static void image_row_pitchSet(ByteBuffer cl_image_desc, long image_row_pitch) { PointerBuffer.put(cl_image_desc, cl_image_desc.position() + IMAGE_ROW_PITCH, image_row_pitch); }
	public static void image_slice_pitchSet(ByteBuffer cl_image_desc, long image_slice_pitch) { PointerBuffer.put(cl_image_desc, cl_image_desc.position() + IMAGE_SLICE_PITCH, image_slice_pitch); }
	public static void num_mip_levelsSet(ByteBuffer cl_image_desc, int num_mip_levels) { cl_image_desc.putInt(cl_image_desc.position() + NUM_MIP_LEVELS, num_mip_levels); }
	public static void num_samplesSet(ByteBuffer cl_image_desc, int num_samples) { cl_image_desc.putInt(cl_image_desc.position() + NUM_SAMPLES, num_samples); }
	public static void bufferSet(ByteBuffer cl_image_desc, long buffer) { PointerBuffer.put(cl_image_desc, cl_image_desc.position() + BUFFER, buffer); }

	public static int image_typeGet(ByteBuffer cl_image_desc) { return cl_image_desc.getInt(cl_image_desc.position() + IMAGE_TYPE); }
	public static long image_widthGet(ByteBuffer cl_image_desc) { return PointerBuffer.get(cl_image_desc, cl_image_desc.position() + IMAGE_WIDTH); }
	public static long image_heightGet(ByteBuffer cl_image_desc) { return PointerBuffer.get(cl_image_desc, cl_image_desc.position() + IMAGE_HEIGHT); }
	public static long image_depthGet(ByteBuffer cl_image_desc) { return PointerBuffer.get(cl_image_desc, cl_image_desc.position() + IMAGE_DEPTH); }
	public static long image_array_sizeGet(ByteBuffer cl_image_desc) { return PointerBuffer.get(cl_image_desc, cl_image_desc.position() + IMAGE_ARRAY_SIZE); }
	public static long image_row_pitchGet(ByteBuffer cl_image_desc) { return PointerBuffer.get(cl_image_desc, cl_image_desc.position() + IMAGE_ROW_PITCH); }
	public static long image_slice_pitchGet(ByteBuffer cl_image_desc) { return PointerBuffer.get(cl_image_desc, cl_image_desc.position() + IMAGE_SLICE_PITCH); }
	public static int num_mip_levelsGet(ByteBuffer cl_image_desc) { return cl_image_desc.getInt(cl_image_desc.position() + NUM_MIP_LEVELS); }
	public static int num_samplesGet(ByteBuffer cl_image_desc) { return cl_image_desc.getInt(cl_image_desc.position() + NUM_SAMPLES); }
	public static long bufferGet(ByteBuffer cl_image_desc) { return PointerBuffer.get(cl_image_desc, cl_image_desc.position() + BUFFER); }

}