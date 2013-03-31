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
		ByteBuffer struct = malloc();

		image_typeSet(struct, image_type);
		image_widthSet(struct, image_width);
		image_heightSet(struct, image_height);
		image_depthSet(struct, image_depth);
		image_array_sizeSet(struct, image_array_size);
		image_row_pitchSet(struct, image_row_pitch);
		image_slice_pitchSet(struct, image_slice_pitch);
		num_mip_levelsSet(struct, num_mip_levels);
		num_samplesSet(struct, num_samples);
		bufferSet(struct, buffer);

		return struct;
	}

	public static void image_typeSet(ByteBuffer struct, int image_type) { struct.putInt(struct.position() + IMAGE_TYPE, image_type); }
	public static void image_widthSet(ByteBuffer struct, long image_width) { PointerBuffer.put(struct, struct.position() + IMAGE_WIDTH, image_width); }
	public static void image_heightSet(ByteBuffer struct, long image_height) { PointerBuffer.put(struct, struct.position() + IMAGE_HEIGHT, image_height); }
	public static void image_depthSet(ByteBuffer struct, long image_depth) { PointerBuffer.put(struct, struct.position() + IMAGE_DEPTH, image_depth); }
	public static void image_array_sizeSet(ByteBuffer struct, long image_array_size) { PointerBuffer.put(struct, struct.position() + IMAGE_ARRAY_SIZE, image_array_size); }
	public static void image_row_pitchSet(ByteBuffer struct, long image_row_pitch) { PointerBuffer.put(struct, struct.position() + IMAGE_ROW_PITCH, image_row_pitch); }
	public static void image_slice_pitchSet(ByteBuffer struct, long image_slice_pitch) { PointerBuffer.put(struct, struct.position() + IMAGE_SLICE_PITCH, image_slice_pitch); }
	public static void num_mip_levelsSet(ByteBuffer struct, int num_mip_levels) { struct.putInt(struct.position() + NUM_MIP_LEVELS, num_mip_levels); }
	public static void num_samplesSet(ByteBuffer struct, int num_samples) { struct.putInt(struct.position() + NUM_SAMPLES, num_samples); }
	public static void bufferSet(ByteBuffer struct, long buffer) { PointerBuffer.put(struct, struct.position() + BUFFER, buffer); }

	public static int image_typeGet(ByteBuffer struct) { return struct.getInt(struct.position() + IMAGE_TYPE); }
	public static long image_widthGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + IMAGE_WIDTH); }
	public static long image_heightGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + IMAGE_HEIGHT); }
	public static long image_depthGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + IMAGE_DEPTH); }
	public static long image_array_sizeGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + IMAGE_ARRAY_SIZE); }
	public static long image_row_pitchGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + IMAGE_ROW_PITCH); }
	public static long image_slice_pitchGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + IMAGE_SLICE_PITCH); }
	public static int num_mip_levelsGet(ByteBuffer struct) { return struct.getInt(struct.position() + NUM_MIP_LEVELS); }
	public static int num_samplesGet(ByteBuffer struct) { return struct.getInt(struct.position() + NUM_SAMPLES); }
	public static long bufferGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + BUFFER); }

}