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
 * Defines the coordinates of the upper-left and lower-right corners of a rectangle.
 * 
 * <h3>RECT members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>left</td><td class="nw">LONG</td><td>the x-coordinate of the upper-left corner of the rectangle</td></tr>
 * <tr><td>top</td><td class="nw">LONG</td><td>the y-coordinate of the upper-left corner of the rectangle</td></tr>
 * <tr><td>right</td><td class="nw">LONG</td><td>the x-coordinate of the lower-right corner of the rectangle</td></tr>
 * <tr><td>bottom</td><td class="nw">LONG</td><td>the y-coordinate of the lower-right corner of the rectangle</td></tr>
 * </table>
 */
public class RECT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		LEFT,
		TOP,
		RIGHT,
		BOTTOM;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		LEFT = layout.offsetof(0);
		TOP = layout.offsetof(1);
		RIGHT = layout.offsetof(2);
		BOTTOM = layout.offsetof(3);
	}

	RECT(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link RECT} instance at the specified memory address. */
	public RECT(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link RECT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public RECT(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code left} field. */
	public int left() { return nleft(address()); }
	/** Returns the value of the {@code top} field. */
	public int top() { return ntop(address()); }
	/** Returns the value of the {@code right} field. */
	public int right() { return nright(address()); }
	/** Returns the value of the {@code bottom} field. */
	public int bottom() { return nbottom(address()); }

	/** Sets the specified value to the {@code left} field. */
	public RECT left(int value) { nleft(address(), value); return this; }
	/** Sets the specified value to the {@code top} field. */
	public RECT top(int value) { ntop(address(), value); return this; }
	/** Sets the specified value to the {@code right} field. */
	public RECT right(int value) { nright(address(), value); return this; }
	/** Sets the specified value to the {@code bottom} field. */
	public RECT bottom(int value) { nbottom(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public RECT set(
		int left,
		int top,
		int right,
		int bottom
	) {
		left(left);
		top(top);
		right(right);
		bottom(bottom);

		return this;
	}

	/** Unsafe version of {@link #set(RECT) set}. */
	public RECT nset(long struct) {
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
	public RECT set(RECT src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(RECT) set}. */
	public RECT set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link RECT} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static RECT malloc() {
		return new RECT(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link RECT} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static RECT calloc() {
		return new RECT(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link RECT} instance allocated with {@link BufferUtils}. */
	public static RECT create() {
		return new RECT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link RECT.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link RECT.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link RECT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link RECT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #left}. */
	public static int nleft(long struct) { return memGetInt(struct + RECT.LEFT); }
	/** Unsafe version of {@link #top}. */
	public static int ntop(long struct) { return memGetInt(struct + RECT.TOP); }
	/** Unsafe version of {@link #right}. */
	public static int nright(long struct) { return memGetInt(struct + RECT.RIGHT); }
	/** Unsafe version of {@link #bottom}. */
	public static int nbottom(long struct) { return memGetInt(struct + RECT.BOTTOM); }

	/** Unsafe version of {@link #left(int) left}. */
	public static void nleft(long struct, int value) { memPutInt(struct + RECT.LEFT, value); }
	/** Unsafe version of {@link #top(int) top}. */
	public static void ntop(long struct, int value) { memPutInt(struct + RECT.TOP, value); }
	/** Unsafe version of {@link #right(int) right}. */
	public static void nright(long struct, int value) { memPutInt(struct + RECT.RIGHT, value); }
	/** Unsafe version of {@link #bottom(int) bottom}. */
	public static void nbottom(long struct, int value) { memPutInt(struct + RECT.BOTTOM, value); }

	// -----------------------------------

	/** An array of {@link RECT} structs. */
	public static final class Buffer extends StructBuffer<RECT, Buffer> {

		/**
		 * Creates a new {@link RECT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link RECT#SIZEOF}, and its mark will be undefined.
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
		protected RECT newInstance(long address) {
			return new RECT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code left} field. */
		public int left() { return nleft(address()); }
		/** Returns the value of the {@code top} field. */
		public int top() { return ntop(address()); }
		/** Returns the value of the {@code right} field. */
		public int right() { return nright(address()); }
		/** Returns the value of the {@code bottom} field. */
		public int bottom() { return nbottom(address()); }

		/** Sets the specified value to the {@code left} field. */
		public RECT.Buffer left(int value) { nleft(address(), value); return this; }
		/** Sets the specified value to the {@code top} field. */
		public RECT.Buffer top(int value) { ntop(address(), value); return this; }
		/** Sets the specified value to the {@code right} field. */
		public RECT.Buffer right(int value) { nright(address(), value); return this; }
		/** Sets the specified value to the {@code bottom} field. */
		public RECT.Buffer bottom(int value) { nbottom(address(), value); return this; }

	}

}