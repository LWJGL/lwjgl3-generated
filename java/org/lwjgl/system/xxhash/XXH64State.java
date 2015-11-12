/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.xxhash;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** State used by the advanced 64-bit {@link XXHash} functions. */
public class XXH64State extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	static {
		SIZEOF = offsets();
	}

	private static native int offsets();

	XXH64State(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link XXH64State} instance at the specified memory address. */
	public XXH64State(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link XXH64State} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public XXH64State(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	// -----------------------------------

	/** Returns a new {@link XXH64State} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static XXH64State malloc() {
		return new XXH64State(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link XXH64State} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static XXH64State calloc() {
		return new XXH64State(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link XXH64State} instance allocated with {@link BufferUtils}. */
	public static XXH64State create() {
		return new XXH64State(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link XXH64State.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link XXH64State.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link XXH64State.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link XXH64State.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link XXH64State} structs. */
	public static final class Buffer extends StructBuffer<XXH64State, Buffer> {

		/**
		 * Creates a new {@link XXH64State.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link XXH64State#SIZEOF}, and its mark will be undefined.
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
		protected XXH64State newInstance(long address) {
			return new XXH64State(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}