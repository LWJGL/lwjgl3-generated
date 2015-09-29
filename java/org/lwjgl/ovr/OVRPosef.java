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

/** Position and orientation together. */
public final class OVRPosef extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ORIENTATION,
		POSITION;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		ORIENTATION = offsets.get(0);
		POSITION = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRPosef(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRPosef} instance at the specified memory address. */
	public OVRPosef(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRPosef} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRPosef(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRQuatf getOrientation() { return ngetOrientation(address()); }
	public float getOrientationX() { return ngetOrientationX(address()); }
	public float getOrientationY() { return ngetOrientationY(address()); }
	public float getOrientationZ() { return ngetOrientationZ(address()); }
	public float getOrientationW() { return ngetOrientationW(address()); }
	public OVRVector3f getPosition() { return ngetPosition(address()); }
	public float getPositionX() { return ngetPositionX(address()); }
	public float getPositionY() { return ngetPositionY(address()); }
	public float getPositionZ() { return ngetPositionZ(address()); }

	public OVRPosef setOrientation(OVRQuatf Orientation) { nsetOrientation(address(), Orientation); return this; }
	public OVRPosef setOrientationX(float x) { nsetOrientationX(address(), x); return this; }
	public OVRPosef setOrientationY(float y) { nsetOrientationY(address(), y); return this; }
	public OVRPosef setOrientationZ(float z) { nsetOrientationZ(address(), z); return this; }
	public OVRPosef setOrientationW(float w) { nsetOrientationW(address(), w); return this; }
	public OVRPosef setPosition(OVRVector3f Position) { nsetPosition(address(), Position); return this; }
	public OVRPosef setPositionX(float x) { nsetPositionX(address(), x); return this; }
	public OVRPosef setPositionY(float y) { nsetPositionY(address(), y); return this; }
	public OVRPosef setPositionZ(float z) { nsetPositionZ(address(), z); return this; }

	/** Initializes this struct with the specified values. */
	public OVRPosef set(
		OVRQuatf Orientation,
		OVRVector3f Position
	) {
		setOrientation(Orientation);
		setPosition(Position);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRPosef nset(long struct) {
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
	public OVRPosef set(OVRPosef src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRPosef set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRPosef} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRPosef malloc() {
		return new OVRPosef(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRPosef} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRPosef calloc() {
		return new OVRPosef(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRPosef} instance allocated with {@link BufferUtils}. */
	public static OVRPosef create() {
		return new OVRPosef(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static OVRQuatf ngetOrientation(long struct) { return OVRQuatf.malloc().nset(struct + ORIENTATION); }
	/** Returns a copy of the {@code Orientation} {@link OVRQuatf} struct. */
	public static OVRQuatf getOrientation(ByteBuffer struct) { return ngetOrientation(memAddress(struct)); }
	public static float ngetOrientationX(long struct) { return memGetFloat(struct + ORIENTATION + OVRQuatf.X); }
	public static float getOrientationX(ByteBuffer struct) { return ngetOrientationX(memAddress(struct)); }
	public static float ngetOrientationY(long struct) { return memGetFloat(struct + ORIENTATION + OVRQuatf.Y); }
	public static float getOrientationY(ByteBuffer struct) { return ngetOrientationY(memAddress(struct)); }
	public static float ngetOrientationZ(long struct) { return memGetFloat(struct + ORIENTATION + OVRQuatf.Z); }
	public static float getOrientationZ(ByteBuffer struct) { return ngetOrientationZ(memAddress(struct)); }
	public static float ngetOrientationW(long struct) { return memGetFloat(struct + ORIENTATION + OVRQuatf.W); }
	public static float getOrientationW(ByteBuffer struct) { return ngetOrientationW(memAddress(struct)); }
	public static OVRVector3f ngetPosition(long struct) { return OVRVector3f.malloc().nset(struct + POSITION); }
	/** Returns a copy of the {@code Position} {@link OVRVector3f} struct. */
	public static OVRVector3f getPosition(ByteBuffer struct) { return ngetPosition(memAddress(struct)); }
	public static float ngetPositionX(long struct) { return memGetFloat(struct + POSITION + OVRVector3f.X); }
	public static float getPositionX(ByteBuffer struct) { return ngetPositionX(memAddress(struct)); }
	public static float ngetPositionY(long struct) { return memGetFloat(struct + POSITION + OVRVector3f.Y); }
	public static float getPositionY(ByteBuffer struct) { return ngetPositionY(memAddress(struct)); }
	public static float ngetPositionZ(long struct) { return memGetFloat(struct + POSITION + OVRVector3f.Z); }
	public static float getPositionZ(ByteBuffer struct) { return ngetPositionZ(memAddress(struct)); }

	public static void nsetOrientation(long struct, OVRQuatf Orientation) { memCopy(Orientation.address(), struct + ORIENTATION, OVRQuatf.SIZEOF); }
	/** Copies the specified {@link OVRQuatf} struct to the nested {@code Orientation} struct. */
	public static void setOrientation(ByteBuffer struct, OVRQuatf Orientation) { nsetOrientation(memAddress(struct), Orientation); }
	public static void nsetOrientationX(long struct, float x) { memPutFloat(struct + ORIENTATION + OVRQuatf.X, x); }
	public static void setOrientationX(ByteBuffer struct, float x) { nsetOrientationX(memAddress(struct), x); }
	public static void nsetOrientationY(long struct, float y) { memPutFloat(struct + ORIENTATION + OVRQuatf.Y, y); }
	public static void setOrientationY(ByteBuffer struct, float y) { nsetOrientationY(memAddress(struct), y); }
	public static void nsetOrientationZ(long struct, float z) { memPutFloat(struct + ORIENTATION + OVRQuatf.Z, z); }
	public static void setOrientationZ(ByteBuffer struct, float z) { nsetOrientationZ(memAddress(struct), z); }
	public static void nsetOrientationW(long struct, float w) { memPutFloat(struct + ORIENTATION + OVRQuatf.W, w); }
	public static void setOrientationW(ByteBuffer struct, float w) { nsetOrientationW(memAddress(struct), w); }
	public static void nsetPosition(long struct, OVRVector3f Position) { memCopy(Position.address(), struct + POSITION, OVRVector3f.SIZEOF); }
	/** Copies the specified {@link OVRVector3f} struct to the nested {@code Position} struct. */
	public static void setPosition(ByteBuffer struct, OVRVector3f Position) { nsetPosition(memAddress(struct), Position); }
	public static void nsetPositionX(long struct, float x) { memPutFloat(struct + POSITION + OVRVector3f.X, x); }
	public static void setPositionX(ByteBuffer struct, float x) { nsetPositionX(memAddress(struct), x); }
	public static void nsetPositionY(long struct, float y) { memPutFloat(struct + POSITION + OVRVector3f.Y, y); }
	public static void setPositionY(ByteBuffer struct, float y) { nsetPositionY(memAddress(struct), y); }
	public static void nsetPositionZ(long struct, float z) { memPutFloat(struct + POSITION + OVRVector3f.Z, z); }
	public static void setPositionZ(ByteBuffer struct, float z) { nsetPositionZ(memAddress(struct), z); }

	// -----------------------------------

	/** An array of {@link OVRPosef} structs. */
	public static final class Buffer extends StructBuffer<OVRPosef, Buffer> {

		/**
		 * Creates a new {@link OVRPosef.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRPosef#SIZEOF}, and its mark will be undefined.
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
		protected OVRPosef newInstance(long address) {
			return new OVRPosef(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public OVRQuatf getOrientation() { return ngetOrientation(address()); }
		public float getOrientationX() { return ngetOrientationX(address()); }
		public float getOrientationY() { return ngetOrientationY(address()); }
		public float getOrientationZ() { return ngetOrientationZ(address()); }
		public float getOrientationW() { return ngetOrientationW(address()); }
		public OVRVector3f getPosition() { return ngetPosition(address()); }
		public float getPositionX() { return ngetPositionX(address()); }
		public float getPositionY() { return ngetPositionY(address()); }
		public float getPositionZ() { return ngetPositionZ(address()); }

		public OVRPosef.Buffer setOrientation(OVRQuatf Orientation) { nsetOrientation(address(), Orientation); return this; }
		public OVRPosef.Buffer setOrientationX(float x) { nsetOrientationX(address(), x); return this; }
		public OVRPosef.Buffer setOrientationY(float y) { nsetOrientationY(address(), y); return this; }
		public OVRPosef.Buffer setOrientationZ(float z) { nsetOrientationZ(address(), z); return this; }
		public OVRPosef.Buffer setOrientationW(float w) { nsetOrientationW(address(), w); return this; }
		public OVRPosef.Buffer setPosition(OVRVector3f Position) { nsetPosition(address(), Position); return this; }
		public OVRPosef.Buffer setPositionX(float x) { nsetPositionX(address(), x); return this; }
		public OVRPosef.Buffer setPositionY(float y) { nsetPositionY(address(), y); return this; }
		public OVRPosef.Buffer setPositionZ(float z) { nsetPositionZ(address(), z); return this; }

	}

}