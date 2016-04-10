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
import static org.lwjgl.system.MemoryStack.*;

/**
 * Defines the x- and y- coordinates of a point.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; the x-coordinate of the point</li>
 * <li>{@code y} &ndash; the y-coordinate of the point</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct POINT {
    LONG x;
    LONG y;
}</code></pre>
 */
public class POINT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
		ALIGNOF = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
	}

	POINT(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link POINT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public POINT(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public int x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public int y() { return ny(address()); }

	/** Sets the specified value to the {@code x} field. */
	public POINT x(int value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public POINT y(int value) { ny(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public POINT set(
		int x,
		int y
	) {
		x(x);
		y(y);

		return this;
	}

	/** Unsafe version of {@link #set(POINT) set}. */
	public POINT nset(long struct) {
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
	public POINT set(POINT src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link POINT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static POINT malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link POINT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static POINT calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link POINT} instance allocated with {@link BufferUtils}. */
	public static POINT create() {
		return new POINT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link POINT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static POINT create(long address) {
		return address == NULL ? null : new POINT(address, null);
	}

	/**
	 * Returns a new {@link POINT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link POINT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link POINT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link POINT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link POINT} instance allocated on the thread-local {@link MemoryStack}. */
	public static POINT mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link POINT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static POINT callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link POINT} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static POINT mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link POINT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static POINT callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link POINT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link POINT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link POINT.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link POINT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #x}. */
	public static int nx(long struct) { return memGetInt(struct + POINT.X); }
	/** Unsafe version of {@link #y}. */
	public static int ny(long struct) { return memGetInt(struct + POINT.Y); }

	/** Unsafe version of {@link #x(int) x}. */
	public static void nx(long struct, int value) { memPutInt(struct + POINT.X, value); }
	/** Unsafe version of {@link #y(int) y}. */
	public static void ny(long struct, int value) { memPutInt(struct + POINT.Y, value); }

	// -----------------------------------

	/** An array of {@link POINT} structs. */
	public static final class Buffer extends StructBuffer<POINT, Buffer> {

		/**
		 * Creates a new {@link POINT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link POINT#SIZEOF}, and its mark will be undefined.
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
		protected POINT newInstance(long address) {
			return new POINT(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public int x() { return POINT.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public int y() { return POINT.ny(address()); }

		/** Sets the specified value to the {@code x} field. */
		public POINT.Buffer x(int value) { POINT.nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public POINT.Buffer y(int value) { POINT.ny(address(), value); return this; }

	}

}