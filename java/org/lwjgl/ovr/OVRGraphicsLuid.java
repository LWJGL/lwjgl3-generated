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

/** A system specific graphics adapter identifier. */
public final class OVRGraphicsLuid extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		RESERVED;

	static {
		IntBuffer offsets = memAllocInt(1);

		SIZEOF = offsets(memAddress(offsets));

		RESERVED = offsets.get(0);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRGraphicsLuid(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRGraphicsLuid} instance at the specified memory address. */
	public OVRGraphicsLuid(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRGraphicsLuid} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRGraphicsLuid(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public void getReserved(ByteBuffer Reserved) { ngetReserved(address(), Reserved); }

	// -----------------------------------

	/** Returns a new {@link OVRGraphicsLuid} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRGraphicsLuid malloc() {
		return new OVRGraphicsLuid(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRGraphicsLuid} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRGraphicsLuid calloc() {
		return new OVRGraphicsLuid(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRGraphicsLuid} instance allocated with {@link BufferUtils}. */
	public static OVRGraphicsLuid create() {
		return new OVRGraphicsLuid(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static void ngetReserved(long struct, ByteBuffer Reserved) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Reserved, 8 * 1);
		memCopy(struct + RESERVED, memAddress(Reserved), Reserved.remaining());
	}
	public static void getReserved(ByteBuffer struct, ByteBuffer Reserved) { ngetReserved(memAddress(struct), Reserved); }
	public static byte ngetReserved(long struct, int index) { return memGetByte(struct + RESERVED + index * 1); }
	public static byte getReserved(ByteBuffer struct, int index) { return ngetReserved(memAddress(struct), index); }

	// -----------------------------------

	/** An array of {@link OVRGraphicsLuid} structs. */
	public static final class Buffer extends StructBuffer<OVRGraphicsLuid, Buffer> {

		/**
		 * Creates a new {@link OVRGraphicsLuid.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRGraphicsLuid#SIZEOF}, and its mark will be undefined.
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
		protected OVRGraphicsLuid newInstance(long address) {
			return new OVRGraphicsLuid(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}