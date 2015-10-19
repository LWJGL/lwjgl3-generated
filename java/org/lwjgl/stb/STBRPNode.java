/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The opaque {@code stbrp_node} struct. */
public class STBRPNode extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	static {
		SIZEOF = offsets();
	}

	private static native int offsets();

	STBRPNode(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBRPNode} instance at the specified memory address. */
	public STBRPNode(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBRPNode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBRPNode(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	// -----------------------------------

	/** Returns a new {@link STBRPNode} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBRPNode malloc() {
		return new STBRPNode(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBRPNode} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBRPNode calloc() {
		return new STBRPNode(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBRPNode} instance allocated with {@link BufferUtils}. */
	public static STBRPNode create() {
		return new STBRPNode(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBRPNode.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBRPNode.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBRPNode.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link STBRPNode.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link STBRPNode} structs. */
	public static final class Buffer extends StructBuffer<STBRPNode, Buffer> {

		/**
		 * Creates a new {@link STBRPNode.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBRPNode#SIZEOF}, and its mark will be undefined.
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
		protected STBRPNode newInstance(long address) {
			return new STBRPNode(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}