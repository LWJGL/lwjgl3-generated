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

/** Buffer region struct. */
public class CLBufferRegion extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ORIGIN,
		SIZE;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		ORIGIN = offsets.get(0);
		SIZE = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	CLBufferRegion(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link CLBufferRegion} instance at the specified memory address. */
	public CLBufferRegion(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link CLBufferRegion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLBufferRegion(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public long getOrigin() { return ngetOrigin(address()); }
	public long getSize() { return ngetSize(address()); }

	public CLBufferRegion setOrigin(long origin) { nsetOrigin(address(), origin); return this; }
	public CLBufferRegion setSize(long size) { nsetSize(address(), size); return this; }

	/** Initializes this struct with the specified values. */
	public CLBufferRegion set(
		long origin,
		long size
	) {
		setOrigin(origin);
		setSize(size);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public CLBufferRegion nset(long struct) {
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
	public CLBufferRegion set(CLBufferRegion src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public CLBufferRegion set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link CLBufferRegion} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static CLBufferRegion malloc() {
		return new CLBufferRegion(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLBufferRegion} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static CLBufferRegion calloc() {
		return new CLBufferRegion(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLBufferRegion} instance allocated with {@link BufferUtils}. */
	public static CLBufferRegion create() {
		return new CLBufferRegion(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link CLBufferRegion.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static long ngetOrigin(long struct) { return memGetAddress(struct + ORIGIN); }
	public static long getOrigin(ByteBuffer struct) { return ngetOrigin(memAddress(struct)); }
	public static long ngetSize(long struct) { return memGetAddress(struct + SIZE); }
	public static long getSize(ByteBuffer struct) { return ngetSize(memAddress(struct)); }

	public static void nsetOrigin(long struct, long origin) { memPutAddress(struct + ORIGIN, origin); }
	public static void setOrigin(ByteBuffer struct, long origin) { nsetOrigin(memAddress(struct), origin); }
	public static void nsetSize(long struct, long size) { memPutAddress(struct + SIZE, size); }
	public static void setSize(ByteBuffer struct, long size) { nsetSize(memAddress(struct), size); }

	// -----------------------------------

	/** An array of {@link CLBufferRegion} structs. */
	public static final class Buffer extends StructBuffer<CLBufferRegion, Buffer> {

		/**
		 * Creates a new {@link CLBufferRegion.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link CLBufferRegion#SIZEOF}, and its mark will be undefined.
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
		protected CLBufferRegion newInstance(long address) {
			return new CLBufferRegion(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public long getOrigin() { return ngetOrigin(address()); }
		public long getSize() { return ngetSize(address()); }

		public CLBufferRegion.Buffer setOrigin(long origin) { nsetOrigin(address(), origin); return this; }
		public CLBufferRegion.Buffer setSize(long size) { nsetSize(address(), size); return this; }

	}

}