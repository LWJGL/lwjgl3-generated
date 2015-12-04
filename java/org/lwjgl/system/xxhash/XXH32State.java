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

/** State used by the advanced 32-bit {@link XXHash} functions. */
public class XXH32State extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	static {
		SIZEOF = offsets();
	}

	private static native int offsets();

	XXH32State(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link XXH32State} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public XXH32State(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	// -----------------------------------

	/** Returns a new {@link XXH32State} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static XXH32State malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link XXH32State} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static XXH32State calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link XXH32State} instance allocated with {@link BufferUtils}. */
	public static XXH32State create() {
		return new XXH32State(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link XXH32State} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static XXH32State create(long address) {
		return address == NULL ? null : new XXH32State(address, null);
	}

	/**
	 * Returns a new {@link XXH32State.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link XXH32State.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link XXH32State.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link XXH32State.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** An array of {@link XXH32State} structs. */
	public static final class Buffer extends StructBuffer<XXH32State, Buffer> {

		/**
		 * Creates a new {@link XXH32State.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link XXH32State#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected XXH32State newInstance(long address) {
			return new XXH32State(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}