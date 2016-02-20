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
 * Contains the coordinates of a point.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct POINTL {
 *     LONG x;
 *     LONG y;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>x</td><td>the horizontal (x) coordinate of the point</td></tr>
 * <tr><td>y</td><td>the vertical (y) coordinate of the point.</td></tr>
 * </table>
 */
public class POINTL extends Struct {

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

	POINTL(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link POINTL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public POINTL(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public int x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public int y() { return ny(address()); }

	/** Sets the specified value to the {@code x} field. */
	public POINTL x(int value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public POINTL y(int value) { ny(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public POINTL set(
		int x,
		int y
	) {
		x(x);
		y(y);

		return this;
	}

	/** Unsafe version of {@link #set(POINTL) set}. */
	public POINTL nset(long struct) {
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
	public POINTL set(POINTL src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link POINTL} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static POINTL malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link POINTL} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static POINTL calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link POINTL} instance allocated with {@link BufferUtils}. */
	public static POINTL create() {
		return new POINTL(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link POINTL} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static POINTL create(long address) {
		return address == NULL ? null : new POINTL(address, null);
	}

	/**
	 * Returns a new {@link POINTL.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link POINTL.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link POINTL.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link POINTL.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #x}. */
	public static int nx(long struct) { return memGetInt(struct + POINTL.X); }
	/** Unsafe version of {@link #y}. */
	public static int ny(long struct) { return memGetInt(struct + POINTL.Y); }

	/** Unsafe version of {@link #x(int) x}. */
	public static void nx(long struct, int value) { memPutInt(struct + POINTL.X, value); }
	/** Unsafe version of {@link #y(int) y}. */
	public static void ny(long struct, int value) { memPutInt(struct + POINTL.Y, value); }

	// -----------------------------------

	/** An array of {@link POINTL} structs. */
	public static final class Buffer extends StructBuffer<POINTL, Buffer> {

		/**
		 * Creates a new {@link POINTL.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link POINTL#SIZEOF}, and its mark will be undefined.
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
		protected POINTL newInstance(long address) {
			return new POINTL(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public int x() { return POINTL.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public int y() { return POINTL.ny(address()); }

		/** Sets the specified value to the {@code x} field. */
		public POINTL.Buffer x(int value) { POINTL.nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public POINTL.Buffer y(int value) { POINTL.ny(address(), value); return this; }

	}

}