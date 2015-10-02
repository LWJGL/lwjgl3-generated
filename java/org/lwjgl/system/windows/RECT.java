/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Defines the coordinates of the upper-left and lower-right corners of a rectangle. */
public class RECT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		LEFT,
		TOP,
		RIGHT,
		BOTTOM;

	static {
		IntBuffer offsets = memAllocInt(4);

		SIZEOF = offsets(memAddress(offsets));

		LEFT = offsets.get(0);
		TOP = offsets.get(1);
		RIGHT = offsets.get(2);
		BOTTOM = offsets.get(3);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	RECT(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link RECT} instance at the specified memory address. */
	public RECT(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link RECT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public RECT(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getLeft() { return ngetLeft(address()); }
	public int getTop() { return ngetTop(address()); }
	public int getRight() { return ngetRight(address()); }
	public int getBottom() { return ngetBottom(address()); }

	public RECT setLeft(int left) { nsetLeft(address(), left); return this; }
	public RECT setTop(int top) { nsetTop(address(), top); return this; }
	public RECT setRight(int right) { nsetRight(address(), right); return this; }
	public RECT setBottom(int bottom) { nsetBottom(address(), bottom); return this; }

	/** Initializes this struct with the specified values. */
	public RECT set(
		int left,
		int top,
		int right,
		int bottom
	) {
		setLeft(left);
		setTop(top);
		setRight(right);
		setBottom(bottom);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public RECT nset(long struct) {
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
	public RECT set(RECT src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public RECT set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link RECT} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static RECT malloc() {
		return new RECT(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link RECT} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static RECT calloc() {
		return new RECT(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link RECT} instance allocated with {@link BufferUtils}. */
	public static RECT create() {
		return new RECT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link RECT.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link RECT.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link RECT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetLeft(long struct) { return memGetInt(struct + LEFT); }
	public static int getLeft(ByteBuffer struct) { return ngetLeft(memAddress(struct)); }
	public static int ngetTop(long struct) { return memGetInt(struct + TOP); }
	public static int getTop(ByteBuffer struct) { return ngetTop(memAddress(struct)); }
	public static int ngetRight(long struct) { return memGetInt(struct + RIGHT); }
	public static int getRight(ByteBuffer struct) { return ngetRight(memAddress(struct)); }
	public static int ngetBottom(long struct) { return memGetInt(struct + BOTTOM); }
	public static int getBottom(ByteBuffer struct) { return ngetBottom(memAddress(struct)); }

	public static void nsetLeft(long struct, int left) { memPutInt(struct + LEFT, left); }
	public static void setLeft(ByteBuffer struct, int left) { nsetLeft(memAddress(struct), left); }
	public static void nsetTop(long struct, int top) { memPutInt(struct + TOP, top); }
	public static void setTop(ByteBuffer struct, int top) { nsetTop(memAddress(struct), top); }
	public static void nsetRight(long struct, int right) { memPutInt(struct + RIGHT, right); }
	public static void setRight(ByteBuffer struct, int right) { nsetRight(memAddress(struct), right); }
	public static void nsetBottom(long struct, int bottom) { memPutInt(struct + BOTTOM, bottom); }
	public static void setBottom(ByteBuffer struct, int bottom) { nsetBottom(memAddress(struct), bottom); }

	// -----------------------------------

	/** An array of {@link RECT} structs. */
	public static final class Buffer extends StructBuffer<RECT, Buffer> {

		/**
		 * Creates a new {@link RECT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link RECT#SIZEOF}, and its mark will be undefined.
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
		protected RECT newInstance(long address) {
			return new RECT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getLeft() { return ngetLeft(address()); }
		public int getTop() { return ngetTop(address()); }
		public int getRight() { return ngetRight(address()); }
		public int getBottom() { return ngetBottom(address()); }

		public RECT.Buffer setLeft(int left) { nsetLeft(address(), left); return this; }
		public RECT.Buffer setTop(int top) { nsetTop(address(), top); return this; }
		public RECT.Buffer setRight(int right) { nsetRight(address(), right); return this; }
		public RECT.Buffer setBottom(int bottom) { nsetBottom(address(), bottom); return this; }

	}

}