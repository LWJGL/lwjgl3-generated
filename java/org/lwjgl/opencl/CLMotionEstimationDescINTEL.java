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

/** Describes the configuration of the motion estimation algorithm. */
public final class CLMotionEstimationDescINTEL implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		MB_BLOCK_TYPE,
		SUBPIXEL_MODE,
		SAD_ADJUST_MODE,
		SEARCH_PATH_TYPE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		MB_BLOCK_TYPE = offsets.get(0);
		SUBPIXEL_MODE = offsets.get(1);
		SAD_ADJUST_MODE = offsets.get(2);
		SEARCH_PATH_TYPE = offsets.get(3);
	}

	private final ByteBuffer struct;

	public CLMotionEstimationDescINTEL() {
		this(malloc());
	}

	public CLMotionEstimationDescINTEL(ByteBuffer struct) {
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

	public void setMbBlockType(int mb_block_type) { mb_block_type(struct, mb_block_type); }
	public void setSubpixelMode(int subpixel_mode) { subpixel_mode(struct, subpixel_mode); }
	public void setSadAdjustMode(int sad_adjust_mode) { sad_adjust_mode(struct, sad_adjust_mode); }
	public void setSearchPathType(int search_path_type) { search_path_type(struct, search_path_type); }

	public int getMbBlockType() { return mb_block_type(struct); }
	public int getSubpixelMode() { return subpixel_mode(struct); }
	public int getSadAdjustMode() { return sad_adjust_mode(struct); }
	public int getSearchPathType() { return search_path_type(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int mb_block_type,
		int subpixel_mode,
		int sad_adjust_mode,
		int search_path_type
	) {
		ByteBuffer cl_motion_estimation_desc_intel = malloc();

		mb_block_type(cl_motion_estimation_desc_intel, mb_block_type);
		subpixel_mode(cl_motion_estimation_desc_intel, subpixel_mode);
		sad_adjust_mode(cl_motion_estimation_desc_intel, sad_adjust_mode);
		search_path_type(cl_motion_estimation_desc_intel, search_path_type);

		return cl_motion_estimation_desc_intel;
	}

	public static void mb_block_type(ByteBuffer cl_motion_estimation_desc_intel, int mb_block_type) { cl_motion_estimation_desc_intel.putInt(cl_motion_estimation_desc_intel.position() + MB_BLOCK_TYPE, mb_block_type); }
	public static void subpixel_mode(ByteBuffer cl_motion_estimation_desc_intel, int subpixel_mode) { cl_motion_estimation_desc_intel.putInt(cl_motion_estimation_desc_intel.position() + SUBPIXEL_MODE, subpixel_mode); }
	public static void sad_adjust_mode(ByteBuffer cl_motion_estimation_desc_intel, int sad_adjust_mode) { cl_motion_estimation_desc_intel.putInt(cl_motion_estimation_desc_intel.position() + SAD_ADJUST_MODE, sad_adjust_mode); }
	public static void search_path_type(ByteBuffer cl_motion_estimation_desc_intel, int search_path_type) { cl_motion_estimation_desc_intel.putInt(cl_motion_estimation_desc_intel.position() + SEARCH_PATH_TYPE, search_path_type); }

	public static int mb_block_type(ByteBuffer cl_motion_estimation_desc_intel) { return cl_motion_estimation_desc_intel.getInt(cl_motion_estimation_desc_intel.position() + MB_BLOCK_TYPE); }
	public static int subpixel_mode(ByteBuffer cl_motion_estimation_desc_intel) { return cl_motion_estimation_desc_intel.getInt(cl_motion_estimation_desc_intel.position() + SUBPIXEL_MODE); }
	public static int sad_adjust_mode(ByteBuffer cl_motion_estimation_desc_intel) { return cl_motion_estimation_desc_intel.getInt(cl_motion_estimation_desc_intel.position() + SAD_ADJUST_MODE); }
	public static int search_path_type(ByteBuffer cl_motion_estimation_desc_intel) { return cl_motion_estimation_desc_intel.getInt(cl_motion_estimation_desc_intel.position() + SEARCH_PATH_TYPE); }

}