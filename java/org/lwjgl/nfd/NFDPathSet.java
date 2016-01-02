/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nfd;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** An opaque data structure to be used with {@link NativeFileDialog#NFD_OpenDialogMultiple}. */
public class NFDPathSet extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	static {
		SIZEOF = offsets();
	}

	private static native int offsets();

	NFDPathSet(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NFDPathSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NFDPathSet(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	// -----------------------------------

	/** Returns a new {@link NFDPathSet} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static NFDPathSet malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NFDPathSet} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static NFDPathSet calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NFDPathSet} instance allocated with {@link BufferUtils}. */
	public static NFDPathSet create() {
		return new NFDPathSet(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NFDPathSet} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NFDPathSet create(long address) {
		return address == NULL ? null : new NFDPathSet(address, null);
	}

	/**
	 * Returns a new {@link NFDPathSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NFDPathSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NFDPathSet.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NFDPathSet.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** An array of {@link NFDPathSet} structs. */
	public static final class Buffer extends StructBuffer<NFDPathSet, Buffer> {

		/**
		 * Creates a new {@link NFDPathSet.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NFDPathSet#SIZEOF}, and its mark will be undefined.
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
		protected NFDPathSet newInstance(long address) {
			return new NFDPathSet(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}