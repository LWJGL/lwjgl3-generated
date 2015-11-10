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

/** A 4x4 matrix with float components. */
public class OVRMatrix4f extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		M;

	static {
		IntBuffer offsets = memAllocInt(1);

		SIZEOF = offsets(memAddress(offsets));

		M = offsets.get(0);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRMatrix4f(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRMatrix4f} instance at the specified memory address. */
	public OVRMatrix4f(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRMatrix4f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRMatrix4f(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public void getM(ByteBuffer m) { ngetM(address(), m); }

	public OVRMatrix4f setM(ByteBuffer m) { nsetM(address(), m); return this; }
	public OVRMatrix4f setM(int index, float m) { nsetM(address(), index, m); return this; }

	/** Unsafe version of {@link #set}. */
	public OVRMatrix4f nset(long struct) {
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
	public OVRMatrix4f set(OVRMatrix4f src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRMatrix4f set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRMatrix4f} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRMatrix4f malloc() {
		return new OVRMatrix4f(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRMatrix4f} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRMatrix4f calloc() {
		return new OVRMatrix4f(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRMatrix4f} instance allocated with {@link BufferUtils}. */
	public static OVRMatrix4f create() {
		return new OVRMatrix4f(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRMatrix4f.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static void ngetM(long struct, ByteBuffer m) {
		if ( CHECKS ) checkBufferGT(m, 16 * 4);
		memCopy(struct + M, memAddress(m), m.remaining());
	}
	public static void getM(ByteBuffer struct, ByteBuffer m) { ngetM(memAddress(struct), m); }
	public static float ngetM(long struct, int index) { return memGetFloat(struct + M + index * 4); }
	public static float getM(ByteBuffer struct, int index) { return ngetM(memAddress(struct), index); }

	public static void nsetM(long struct, ByteBuffer m) {
		if ( CHECKS ) {
			checkBufferGT(m, 16 * 4);
		}
		memCopy(memAddress(m), struct + M, m.remaining());
	}
	public static void setM(ByteBuffer struct, ByteBuffer m) { nsetM(memAddress(struct), m); }
	public static void nsetM(long struct, int index, float m) { memPutFloat(struct + M + index * 4, m); }
	public static void setM(ByteBuffer struct, int index, float m) { nsetM(memAddress(struct), index, m); }

	// -----------------------------------

	/** An array of {@link OVRMatrix4f} structs. */
	public static final class Buffer extends StructBuffer<OVRMatrix4f, Buffer> {

		/**
		 * Creates a new {@link OVRMatrix4f.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRMatrix4f#SIZEOF}, and its mark will be undefined.
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
		protected OVRMatrix4f newInstance(long address) {
			return new OVRMatrix4f(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public void getM(ByteBuffer m) { ngetM(address(), m); }

		public OVRMatrix4f.Buffer setM(ByteBuffer m) { nsetM(address(), m); return this; }
		public OVRMatrix4f.Buffer setM(int index, float m) { nsetM(address(), index, m); return this; }

	}

}