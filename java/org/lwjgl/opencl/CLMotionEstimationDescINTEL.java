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
 * Describes the configuration of the motion estimation algorithm.
 * 
 * <h3>cl_motion_estimation_desc_intel members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>mb_block_type</td><td class="nw">cl_uint</td><td>describes the size of the blocks described by the motion estimator</td></tr>
 * <tr><td>subpixel_mode</td><td class="nw">cl_uint</td><td>defines the search precision (and hence, the precision of the returned motion vectors)</td></tr>
 * <tr><td>sad_adjust_mode</td><td class="nw">cl_uint</td><td>specifies distortion measure adjustment used for the motion search SAD comparison</td></tr>
 * <tr><td>search_path_type</td><td class="nw">cl_uint</td><td>specifies the search path and search radius when matching blocks in the neighborhood of each pixel block (optionally offset by the predicted motion
 * vector). Currently, all search algorithms match the source block with pixel blocks in the reference area exhaustively within a {@code [Rx, Ry]}
 * radius from the current source pixel block location (optionally offset by the predicted motion vector)</td></tr>
 * </table>
 */
public class CLMotionEstimationDescINTEL extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		MB_BLOCK_TYPE,
		SUBPIXEL_MODE,
		SAD_ADJUST_MODE,
		SEARCH_PATH_TYPE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		MB_BLOCK_TYPE = layout.offsetof(0);
		SUBPIXEL_MODE = layout.offsetof(1);
		SAD_ADJUST_MODE = layout.offsetof(2);
		SEARCH_PATH_TYPE = layout.offsetof(3);
	}

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

	/** Returns the value of the {@code mb_block_type} field. */
	public int mb_block_type() { return nmb_block_type(address()); }
	/** Returns the value of the {@code subpixel_mode} field. */
	public int subpixel_mode() { return nsubpixel_mode(address()); }
	/** Returns the value of the {@code sad_adjust_mode} field. */
	public int sad_adjust_mode() { return nsad_adjust_mode(address()); }
	/** Returns the value of the {@code search_path_type} field. */
	public int search_path_type() { return nsearch_path_type(address()); }

	/** Sets the specified value to the {@code mb_block_type} field. */
	public CLMotionEstimationDescINTEL mb_block_type(int value) { nmb_block_type(address(), value); return this; }
	/** Sets the specified value to the {@code subpixel_mode} field. */
	public CLMotionEstimationDescINTEL subpixel_mode(int value) { nsubpixel_mode(address(), value); return this; }
	/** Sets the specified value to the {@code sad_adjust_mode} field. */
	public CLMotionEstimationDescINTEL sad_adjust_mode(int value) { nsad_adjust_mode(address(), value); return this; }
	/** Sets the specified value to the {@code search_path_type} field. */
	public CLMotionEstimationDescINTEL search_path_type(int value) { nsearch_path_type(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public CLMotionEstimationDescINTEL set(
		int mb_block_type,
		int subpixel_mode,
		int sad_adjust_mode,
		int search_path_type
	) {
		mb_block_type(mb_block_type);
		subpixel_mode(subpixel_mode);
		sad_adjust_mode(sad_adjust_mode);
		search_path_type(search_path_type);

		return this;
	}

	/** Unsafe version of {@link #set(CLMotionEstimationDescINTEL) set}. */
	public CLMotionEstimationDescINTEL nset(long struct) {
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
	public CLMotionEstimationDescINTEL set(CLMotionEstimationDescINTEL src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(CLMotionEstimationDescINTEL) set}. */
	public CLMotionEstimationDescINTEL set(ByteBuffer struct) {
		if ( CHECKS )
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

	/** Unsafe version of {@link #mb_block_type}. */
	public static int nmb_block_type(long struct) { return memGetInt(struct + CLMotionEstimationDescINTEL.MB_BLOCK_TYPE); }
	/** Unsafe version of {@link #subpixel_mode}. */
	public static int nsubpixel_mode(long struct) { return memGetInt(struct + CLMotionEstimationDescINTEL.SUBPIXEL_MODE); }
	/** Unsafe version of {@link #sad_adjust_mode}. */
	public static int nsad_adjust_mode(long struct) { return memGetInt(struct + CLMotionEstimationDescINTEL.SAD_ADJUST_MODE); }
	/** Unsafe version of {@link #search_path_type}. */
	public static int nsearch_path_type(long struct) { return memGetInt(struct + CLMotionEstimationDescINTEL.SEARCH_PATH_TYPE); }

	/** Unsafe version of {@link #mb_block_type(int) mb_block_type}. */
	public static void nmb_block_type(long struct, int value) { memPutInt(struct + CLMotionEstimationDescINTEL.MB_BLOCK_TYPE, value); }
	/** Unsafe version of {@link #subpixel_mode(int) subpixel_mode}. */
	public static void nsubpixel_mode(long struct, int value) { memPutInt(struct + CLMotionEstimationDescINTEL.SUBPIXEL_MODE, value); }
	/** Unsafe version of {@link #sad_adjust_mode(int) sad_adjust_mode}. */
	public static void nsad_adjust_mode(long struct, int value) { memPutInt(struct + CLMotionEstimationDescINTEL.SAD_ADJUST_MODE, value); }
	/** Unsafe version of {@link #search_path_type(int) search_path_type}. */
	public static void nsearch_path_type(long struct, int value) { memPutInt(struct + CLMotionEstimationDescINTEL.SEARCH_PATH_TYPE, value); }

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

		/** Returns the value of the {@code mb_block_type} field. */
		public int mb_block_type() { return nmb_block_type(address()); }
		/** Returns the value of the {@code subpixel_mode} field. */
		public int subpixel_mode() { return nsubpixel_mode(address()); }
		/** Returns the value of the {@code sad_adjust_mode} field. */
		public int sad_adjust_mode() { return nsad_adjust_mode(address()); }
		/** Returns the value of the {@code search_path_type} field. */
		public int search_path_type() { return nsearch_path_type(address()); }

		/** Sets the specified value to the {@code mb_block_type} field. */
		public CLMotionEstimationDescINTEL.Buffer mb_block_type(int value) { nmb_block_type(address(), value); return this; }
		/** Sets the specified value to the {@code subpixel_mode} field. */
		public CLMotionEstimationDescINTEL.Buffer subpixel_mode(int value) { nsubpixel_mode(address(), value); return this; }
		/** Sets the specified value to the {@code sad_adjust_mode} field. */
		public CLMotionEstimationDescINTEL.Buffer sad_adjust_mode(int value) { nsad_adjust_mode(address(), value); return this; }
		/** Sets the specified value to the {@code search_path_type} field. */
		public CLMotionEstimationDescINTEL.Buffer search_path_type(int value) { nsearch_path_type(address(), value); return this; }

	}

}