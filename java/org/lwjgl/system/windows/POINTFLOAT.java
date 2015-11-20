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

/**
 * Contains the x and y coordinates of a point.
 * 
 * <h3>POINTFLOAT members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>x</td><td class="nw">FLOAT</td><td>specifies the horizontal (x) coordinate of a point</td></tr>
 * <tr><td>y</td><td class="nw">FLOAT</td><td>specifies the vertical (y) coordinate of a point</td></tr>
 * </table>
 */
public class POINTFLOAT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		X,
		Y;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
	}

	POINTFLOAT(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link POINTFLOAT} instance at the specified memory address. */
	public POINTFLOAT(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link POINTFLOAT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public POINTFLOAT(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public float x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public float y() { return ny(address()); }

	/** Sets the specified value to the {@code x} field. */
	public POINTFLOAT x(float value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public POINTFLOAT y(float value) { ny(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public POINTFLOAT set(
		float x,
		float y
	) {
		x(x);
		y(y);

		return this;
	}

	/** Unsafe version of {@link #set(POINTFLOAT) set}. */
	public POINTFLOAT nset(long struct) {
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
	public POINTFLOAT set(POINTFLOAT src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(POINTFLOAT) set}. */
	public POINTFLOAT set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link POINTFLOAT} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static POINTFLOAT malloc() {
		return new POINTFLOAT(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link POINTFLOAT} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static POINTFLOAT calloc() {
		return new POINTFLOAT(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link POINTFLOAT} instance allocated with {@link BufferUtils}. */
	public static POINTFLOAT create() {
		return new POINTFLOAT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link POINTFLOAT.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link POINTFLOAT.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link POINTFLOAT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link POINTFLOAT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #x}. */
	public static float nx(long struct) { return memGetFloat(struct + POINTFLOAT.X); }
	/** Unsafe version of {@link #y}. */
	public static float ny(long struct) { return memGetFloat(struct + POINTFLOAT.Y); }

	/** Unsafe version of {@link #x(float) x}. */
	public static void nx(long struct, float value) { memPutFloat(struct + POINTFLOAT.X, value); }
	/** Unsafe version of {@link #y(float) y}. */
	public static void ny(long struct, float value) { memPutFloat(struct + POINTFLOAT.Y, value); }

	// -----------------------------------

	/** An array of {@link POINTFLOAT} structs. */
	public static final class Buffer extends StructBuffer<POINTFLOAT, Buffer> {

		/**
		 * Creates a new {@link POINTFLOAT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link POINTFLOAT#SIZEOF}, and its mark will be undefined.
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
		protected POINTFLOAT newInstance(long address) {
			return new POINTFLOAT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public float x() { return nx(address()); }
		/** Returns the value of the {@code y} field. */
		public float y() { return ny(address()); }

		/** Sets the specified value to the {@code x} field. */
		public POINTFLOAT.Buffer x(float value) { nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public POINTFLOAT.Buffer y(float value) { ny(address(), value); return this; }

	}

}