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

public final class POINTFLOAT extends Struct {

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

	POINTFLOAT(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link POINTFLOAT} instance at the specified memory address. */
	public POINTFLOAT(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link POINTFLOAT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public POINTFLOAT(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public float getX() { return ngetX(address()); }
	public float getY() { return ngetY(address()); }

	public POINTFLOAT setX(float x) { nsetX(address(), x); return this; }
	public POINTFLOAT setY(float y) { nsetY(address(), y); return this; }

	/** Initializes this struct with the specified values. */
	public POINTFLOAT set(
		float x,
		float y
	) {
		setX(x);
		setY(y);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public POINTFLOAT nset(long struct) {
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
	public POINTFLOAT set(POINTFLOAT src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public POINTFLOAT set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link POINTFLOAT} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static POINTFLOAT malloc() {
		return new POINTFLOAT(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link POINTFLOAT} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static POINTFLOAT calloc() {
		return new POINTFLOAT(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link POINTFLOAT} instance allocated with {@link BufferUtils}. */
	public static POINTFLOAT create() {
		return new POINTFLOAT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link POINTFLOAT.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link POINTFLOAT.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link POINTFLOAT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static float ngetX(long struct) { return memGetFloat(struct + X); }
	public static float getX(ByteBuffer struct) { return ngetX(memAddress(struct)); }
	public static float ngetY(long struct) { return memGetFloat(struct + Y); }
	public static float getY(ByteBuffer struct) { return ngetY(memAddress(struct)); }

	public static void nsetX(long struct, float x) { memPutFloat(struct + X, x); }
	public static void setX(ByteBuffer struct, float x) { nsetX(memAddress(struct), x); }
	public static void nsetY(long struct, float y) { memPutFloat(struct + Y, y); }
	public static void setY(ByteBuffer struct, float y) { nsetY(memAddress(struct), y); }

	// -----------------------------------

	/** An array of {@link POINTFLOAT} structs. */
	public static final class Buffer extends StructBuffer<POINTFLOAT, Buffer> {

		/**
		 * Creates a new {@link POINTFLOAT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link POINTFLOAT#SIZEOF}, and its mark will be undefined.
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
		protected POINTFLOAT newInstance(long address) {
			return new POINTFLOAT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public float getX() { return ngetX(address()); }
		public float getY() { return ngetY(address()); }

		public POINTFLOAT.Buffer setX(float x) { nsetX(address(), x); return this; }
		public POINTFLOAT.Buffer setY(float y) { nsetY(address(), y); return this; }

	}

}