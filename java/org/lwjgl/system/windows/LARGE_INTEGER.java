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

public final class LARGE_INTEGER extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		QUADPART;

	static {
		IntBuffer offsets = memAllocInt(1);

		SIZEOF = offsets(memAddress(offsets));

		QUADPART = offsets.get(0);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	LARGE_INTEGER(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link LARGE_INTEGER} instance at the specified memory address. */
	public LARGE_INTEGER(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link LARGE_INTEGER} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public LARGE_INTEGER(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public long getQuadPart() { return ngetQuadPart(address()); }

	public LARGE_INTEGER setQuadPart(long QuadPart) { nsetQuadPart(address(), QuadPart); return this; }

	// -----------------------------------

	/** Returns a new {@link LARGE_INTEGER} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static LARGE_INTEGER malloc() {
		return new LARGE_INTEGER(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link LARGE_INTEGER} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static LARGE_INTEGER calloc() {
		return new LARGE_INTEGER(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link LARGE_INTEGER} instance allocated with {@link BufferUtils}. */
	public static LARGE_INTEGER create() {
		return new LARGE_INTEGER(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link LARGE_INTEGER.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link LARGE_INTEGER.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link LARGE_INTEGER.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static long ngetQuadPart(long struct) { return memGetLong(struct + QUADPART); }
	public static long getQuadPart(ByteBuffer struct) { return ngetQuadPart(memAddress(struct)); }

	public static void nsetQuadPart(long struct, long QuadPart) { memPutLong(struct + QUADPART, QuadPart); }
	public static void setQuadPart(ByteBuffer struct, long QuadPart) { nsetQuadPart(memAddress(struct), QuadPart); }

	// -----------------------------------

	/** An array of {@link LARGE_INTEGER} structs. */
	public static final class Buffer extends StructBuffer<LARGE_INTEGER, Buffer> {

		/**
		 * Creates a new {@link LARGE_INTEGER.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link LARGE_INTEGER#SIZEOF}, and its mark will be undefined.
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
		protected LARGE_INTEGER newInstance(long address) {
			return new LARGE_INTEGER(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}