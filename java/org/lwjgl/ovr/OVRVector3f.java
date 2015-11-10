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

/** A 3D vector with float components. */
public class OVRVector3f extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		Z;

	static {
		IntBuffer offsets = memAllocInt(3);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);
		Z = offsets.get(2);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRVector3f(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRVector3f} instance at the specified memory address. */
	public OVRVector3f(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRVector3f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRVector3f(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public float getX() { return ngetX(address()); }
	public float getY() { return ngetY(address()); }
	public float getZ() { return ngetZ(address()); }

	public OVRVector3f setX(float x) { nsetX(address(), x); return this; }
	public OVRVector3f setY(float y) { nsetY(address(), y); return this; }
	public OVRVector3f setZ(float z) { nsetZ(address(), z); return this; }

	/** Initializes this struct with the specified values. */
	public OVRVector3f set(
		float x,
		float y,
		float z
	) {
		setX(x);
		setY(y);
		setZ(z);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRVector3f nset(long struct) {
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
	public OVRVector3f set(OVRVector3f src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRVector3f set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRVector3f} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRVector3f malloc() {
		return new OVRVector3f(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRVector3f} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRVector3f calloc() {
		return new OVRVector3f(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRVector3f} instance allocated with {@link BufferUtils}. */
	public static OVRVector3f create() {
		return new OVRVector3f(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRVector3f.Buffer} instance at the specified memory.
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

	public static void nsetX(long struct, float x) { memPutFloat(struct + X, x); }
	public static void setX(ByteBuffer struct, float x) { nsetX(memAddress(struct), x); }
	public static void nsetY(long struct, float y) { memPutFloat(struct + Y, y); }
	public static void setY(ByteBuffer struct, float y) { nsetY(memAddress(struct), y); }
	public static void nsetZ(long struct, float z) { memPutFloat(struct + Z, z); }
	public static void setZ(ByteBuffer struct, float z) { nsetZ(memAddress(struct), z); }

	// -----------------------------------

	/** An array of {@link OVRVector3f} structs. */
	public static final class Buffer extends StructBuffer<OVRVector3f, Buffer> {

		/**
		 * Creates a new {@link OVRVector3f.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRVector3f#SIZEOF}, and its mark will be undefined.
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
		protected OVRVector3f newInstance(long address) {
			return new OVRVector3f(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public float getX() { return ngetX(address()); }
		public float getY() { return ngetY(address()); }
		public float getZ() { return ngetZ(address()); }

		public OVRVector3f.Buffer setX(float x) { nsetX(address(), x); return this; }
		public OVRVector3f.Buffer setY(float y) { nsetY(address(), y); return this; }
		public OVRVector3f.Buffer setZ(float z) { nsetZ(address(), z); return this; }

	}

}