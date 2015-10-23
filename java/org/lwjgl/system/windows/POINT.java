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

/** Defines the x- and y- coordinates of a point. */
public class POINT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	POINT(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link POINT} instance at the specified memory address. */
	public POINT(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link POINT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public POINT(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getX() { return ngetX(address()); }
	public int getY() { return ngetY(address()); }

	public POINT setX(int x) { nsetX(address(), x); return this; }
	public POINT setY(int y) { nsetY(address(), y); return this; }

	/** Initializes this struct with the specified values. */
	public POINT set(
		int x,
		int y
	) {
		setX(x);
		setY(y);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public POINT nset(long struct) {
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
	public POINT set(POINT src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public POINT set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link POINT} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static POINT malloc() {
		return new POINT(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link POINT} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static POINT calloc() {
		return new POINT(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link POINT} instance allocated with {@link BufferUtils}. */
	public static POINT create() {
		return new POINT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link POINT.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link POINT.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link POINT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link POINT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static int ngetX(long struct) { return memGetInt(struct + X); }
	public static int getX(ByteBuffer struct) { return ngetX(memAddress(struct)); }
	public static int ngetY(long struct) { return memGetInt(struct + Y); }
	public static int getY(ByteBuffer struct) { return ngetY(memAddress(struct)); }

	public static void nsetX(long struct, int x) { memPutInt(struct + X, x); }
	public static void setX(ByteBuffer struct, int x) { nsetX(memAddress(struct), x); }
	public static void nsetY(long struct, int y) { memPutInt(struct + Y, y); }
	public static void setY(ByteBuffer struct, int y) { nsetY(memAddress(struct), y); }

	// -----------------------------------

	/** An array of {@link POINT} structs. */
	public static final class Buffer extends StructBuffer<POINT, Buffer> {

		/**
		 * Creates a new {@link POINT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link POINT#SIZEOF}, and its mark will be undefined.
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
		protected POINT newInstance(long address) {
			return new POINT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getX() { return ngetX(address()); }
		public int getY() { return ngetY(address()); }

		public POINT.Buffer setX(int x) { nsetX(address(), x); return this; }
		public POINT.Buffer setY(int y) { nsetY(address(), y); return this; }

	}

}