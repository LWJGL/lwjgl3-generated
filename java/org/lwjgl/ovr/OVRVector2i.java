/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A 2D vector with integer components. */
public final class OVRVector2i extends Struct {

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

	OVRVector2i(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRVector2i} instance at the specified memory address. */
	public OVRVector2i(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRVector2i} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRVector2i(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getX() { return ngetX(address()); }
	public int getY() { return ngetY(address()); }

	public OVRVector2i setX(int x) { nsetX(address(), x); return this; }
	public OVRVector2i setY(int y) { nsetY(address(), y); return this; }

	/** Initializes this struct with the specified values. */
	public OVRVector2i set(
		int x,
		int y
	) {
		setX(x);
		setY(y);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRVector2i nset(long struct) {
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
	public OVRVector2i set(OVRVector2i src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRVector2i set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRVector2i} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRVector2i malloc() {
		return new OVRVector2i(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRVector2i} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRVector2i calloc() {
		return new OVRVector2i(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRVector2i} instance allocated with {@link BufferUtils}. */
	public static OVRVector2i create() {
		return new OVRVector2i(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector2i.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector2i.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector2i.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
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

	/** An array of {@link OVRVector2i} structs. */
	public static final class Buffer extends StructBuffer<OVRVector2i, Buffer> {

		/**
		 * Creates a new {@link OVRVector2i.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRVector2i#SIZEOF}, and its mark will be undefined.
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
		protected OVRVector2i newInstance(long address) {
			return new OVRVector2i(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getX() { return ngetX(address()); }
		public int getY() { return ngetY(address()); }

		public OVRVector2i.Buffer setX(int x) { nsetX(address(), x); return this; }
		public OVRVector2i.Buffer setY(int y) { nsetY(address(), y); return this; }

	}

}