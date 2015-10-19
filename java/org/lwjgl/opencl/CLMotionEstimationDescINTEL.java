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

/** Describes the configuration of the motion estimation algorithm. */
public class CLMotionEstimationDescINTEL extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		MB_BLOCK_TYPE,
		SUBPIXEL_MODE,
		SAD_ADJUST_MODE,
		SEARCH_PATH_TYPE;

	static {
		IntBuffer offsets = memAllocInt(4);

		SIZEOF = offsets(memAddress(offsets));

		MB_BLOCK_TYPE = offsets.get(0);
		SUBPIXEL_MODE = offsets.get(1);
		SAD_ADJUST_MODE = offsets.get(2);
		SEARCH_PATH_TYPE = offsets.get(3);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	CLMotionEstimationDescINTEL(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link CLMotionEstimationDescINTEL} instance at the specified memory address. */
	public CLMotionEstimationDescINTEL(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link CLMotionEstimationDescINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLMotionEstimationDescINTEL(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getMbBlockType() { return ngetMbBlockType(address()); }
	public int getSubpixelMode() { return ngetSubpixelMode(address()); }
	public int getSadAdjustMode() { return ngetSadAdjustMode(address()); }
	public int getSearchPathType() { return ngetSearchPathType(address()); }

	public CLMotionEstimationDescINTEL setMbBlockType(int mb_block_type) { nsetMbBlockType(address(), mb_block_type); return this; }
	public CLMotionEstimationDescINTEL setSubpixelMode(int subpixel_mode) { nsetSubpixelMode(address(), subpixel_mode); return this; }
	public CLMotionEstimationDescINTEL setSadAdjustMode(int sad_adjust_mode) { nsetSadAdjustMode(address(), sad_adjust_mode); return this; }
	public CLMotionEstimationDescINTEL setSearchPathType(int search_path_type) { nsetSearchPathType(address(), search_path_type); return this; }

	/** Initializes this struct with the specified values. */
	public CLMotionEstimationDescINTEL set(
		int mb_block_type,
		int subpixel_mode,
		int sad_adjust_mode,
		int search_path_type
	) {
		setMbBlockType(mb_block_type);
		setSubpixelMode(subpixel_mode);
		setSadAdjustMode(sad_adjust_mode);
		setSearchPathType(search_path_type);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public CLMotionEstimationDescINTEL nset(long struct) {
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
	public CLMotionEstimationDescINTEL set(CLMotionEstimationDescINTEL src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public CLMotionEstimationDescINTEL set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link CLMotionEstimationDescINTEL} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static CLMotionEstimationDescINTEL malloc() {
		return new CLMotionEstimationDescINTEL(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLMotionEstimationDescINTEL} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static CLMotionEstimationDescINTEL calloc() {
		return new CLMotionEstimationDescINTEL(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLMotionEstimationDescINTEL} instance allocated with {@link BufferUtils}. */
	public static CLMotionEstimationDescINTEL create() {
		return new CLMotionEstimationDescINTEL(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link CLMotionEstimationDescINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link CLMotionEstimationDescINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link CLMotionEstimationDescINTEL.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link CLMotionEstimationDescINTEL.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static int ngetMbBlockType(long struct) { return memGetInt(struct + MB_BLOCK_TYPE); }
	public static int getMbBlockType(ByteBuffer struct) { return ngetMbBlockType(memAddress(struct)); }
	public static int ngetSubpixelMode(long struct) { return memGetInt(struct + SUBPIXEL_MODE); }
	public static int getSubpixelMode(ByteBuffer struct) { return ngetSubpixelMode(memAddress(struct)); }
	public static int ngetSadAdjustMode(long struct) { return memGetInt(struct + SAD_ADJUST_MODE); }
	public static int getSadAdjustMode(ByteBuffer struct) { return ngetSadAdjustMode(memAddress(struct)); }
	public static int ngetSearchPathType(long struct) { return memGetInt(struct + SEARCH_PATH_TYPE); }
	public static int getSearchPathType(ByteBuffer struct) { return ngetSearchPathType(memAddress(struct)); }

	public static void nsetMbBlockType(long struct, int mb_block_type) { memPutInt(struct + MB_BLOCK_TYPE, mb_block_type); }
	public static void setMbBlockType(ByteBuffer struct, int mb_block_type) { nsetMbBlockType(memAddress(struct), mb_block_type); }
	public static void nsetSubpixelMode(long struct, int subpixel_mode) { memPutInt(struct + SUBPIXEL_MODE, subpixel_mode); }
	public static void setSubpixelMode(ByteBuffer struct, int subpixel_mode) { nsetSubpixelMode(memAddress(struct), subpixel_mode); }
	public static void nsetSadAdjustMode(long struct, int sad_adjust_mode) { memPutInt(struct + SAD_ADJUST_MODE, sad_adjust_mode); }
	public static void setSadAdjustMode(ByteBuffer struct, int sad_adjust_mode) { nsetSadAdjustMode(memAddress(struct), sad_adjust_mode); }
	public static void nsetSearchPathType(long struct, int search_path_type) { memPutInt(struct + SEARCH_PATH_TYPE, search_path_type); }
	public static void setSearchPathType(ByteBuffer struct, int search_path_type) { nsetSearchPathType(memAddress(struct), search_path_type); }

	// -----------------------------------

	/** An array of {@link CLMotionEstimationDescINTEL} structs. */
	public static final class Buffer extends StructBuffer<CLMotionEstimationDescINTEL, Buffer> {

		/**
		 * Creates a new {@link CLMotionEstimationDescINTEL.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link CLMotionEstimationDescINTEL#SIZEOF}, and its mark will be undefined.
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
		protected CLMotionEstimationDescINTEL newInstance(long address) {
			return new CLMotionEstimationDescINTEL(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getMbBlockType() { return ngetMbBlockType(address()); }
		public int getSubpixelMode() { return ngetSubpixelMode(address()); }
		public int getSadAdjustMode() { return ngetSadAdjustMode(address()); }
		public int getSearchPathType() { return ngetSearchPathType(address()); }

		public CLMotionEstimationDescINTEL.Buffer setMbBlockType(int mb_block_type) { nsetMbBlockType(address(), mb_block_type); return this; }
		public CLMotionEstimationDescINTEL.Buffer setSubpixelMode(int subpixel_mode) { nsetSubpixelMode(address(), subpixel_mode); return this; }
		public CLMotionEstimationDescINTEL.Buffer setSadAdjustMode(int sad_adjust_mode) { nsetSadAdjustMode(address(), sad_adjust_mode); return this; }
		public CLMotionEstimationDescINTEL.Buffer setSearchPathType(int search_path_type) { nsetSearchPathType(address(), search_path_type); return this; }

	}

}