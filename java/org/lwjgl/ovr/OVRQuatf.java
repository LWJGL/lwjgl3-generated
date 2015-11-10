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

/** A quaternion rotation. */
public class OVRQuatf extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		Z,
		W;

	static {
		IntBuffer offsets = memAllocInt(4);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);
		Z = offsets.get(2);
		W = offsets.get(3);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRQuatf(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRQuatf} instance at the specified memory address. */
	public OVRQuatf(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRQuatf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRQuatf(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public float getX() { return ngetX(address()); }
	public float getY() { return ngetY(address()); }
	public float getZ() { return ngetZ(address()); }
	public float getW() { return ngetW(address()); }

	public OVRQuatf setX(float x) { nsetX(address(), x); return this; }
	public OVRQuatf setY(float y) { nsetY(address(), y); return this; }
	public OVRQuatf setZ(float z) { nsetZ(address(), z); return this; }
	public OVRQuatf setW(float w) { nsetW(address(), w); return this; }

	/** Initializes this struct with the specified values. */
	public OVRQuatf set(
		float x,
		float y,
		float z,
		float w
	) {
		setX(x);
		setY(y);
		setZ(z);
		setW(w);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRQuatf nset(long struct) {
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
	public OVRQuatf set(OVRQuatf src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRQuatf set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRQuatf} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRQuatf malloc() {
		return new OVRQuatf(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRQuatf} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRQuatf calloc() {
		return new OVRQuatf(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRQuatf} instance allocated with {@link BufferUtils}. */
	public static OVRQuatf create() {
		return new OVRQuatf(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRQuatf.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRQuatf.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRQuatf.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRQuatf.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static float ngetX(long struct) { return memGetFloat(struct + X); }
	public static float getX(ByteBuffer struct) { return ngetX(memAddress(struct)); }
	public static float ngetY(long struct) { return memGetFloat(struct + Y); }
	public static float getY(ByteBuffer struct) { return ngetY(memAddress(struct)); }
	public static float ngetZ(long struct) { return memGetFloat(struct + Z); }
	public static float getZ(ByteBuffer struct) { return ngetZ(memAddress(struct)); }
	public static float ngetW(long struct) { return memGetFloat(struct + W); }
	public static float getW(ByteBuffer struct) { return ngetW(memAddress(struct)); }

	public static void nsetX(long struct, float x) { memPutFloat(struct + X, x); }
	public static void setX(ByteBuffer struct, float x) { nsetX(memAddress(struct), x); }
	public static void nsetY(long struct, float y) { memPutFloat(struct + Y, y); }
	public static void setY(ByteBuffer struct, float y) { nsetY(memAddress(struct), y); }
	public static void nsetZ(long struct, float z) { memPutFloat(struct + Z, z); }
	public static void setZ(ByteBuffer struct, float z) { nsetZ(memAddress(struct), z); }
	public static void nsetW(long struct, float w) { memPutFloat(struct + W, w); }
	public static void setW(ByteBuffer struct, float w) { nsetW(memAddress(struct), w); }

	// -----------------------------------

	/** An array of {@link OVRQuatf} structs. */
	public static final class Buffer extends StructBuffer<OVRQuatf, Buffer> {

		/**
		 * Creates a new {@link OVRQuatf.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRQuatf#SIZEOF}, and its mark will be undefined.
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
		protected OVRQuatf newInstance(long address) {
			return new OVRQuatf(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public float getX() { return ngetX(address()); }
		public float getY() { return ngetY(address()); }
		public float getZ() { return ngetZ(address()); }
		public float getW() { return ngetW(address()); }

		public OVRQuatf.Buffer setX(float x) { nsetX(address(), x); return this; }
		public OVRQuatf.Buffer setY(float y) { nsetY(address(), y); return this; }
		public OVRQuatf.Buffer setZ(float z) { nsetZ(address(), z); return this; }
		public OVRQuatf.Buffer setW(float w) { nsetW(address(), w); return this; }

	}

}