/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure for a native rectangle.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; the rectangle X axis coordinate</li>
 * <li>{@code y} &ndash; the rectangle Y axis coordinate</li>
 * <li>{@code width} &ndash; the rectangle width</li>
 * <li>{@code height} &ndash; the rectangle height</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct JAWT_Rectangle {
    jint x;
    jint y;
    jint width;
    jint height;
}</code></pre>
 */
public class JAWTRectangle extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		WIDTH,
		HEIGHT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
		WIDTH = layout.offsetof(2);
		HEIGHT = layout.offsetof(3);
	}

	JAWTRectangle(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link JAWTRectangle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public JAWTRectangle(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public int x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public int y() { return ny(address()); }
	/** Returns the value of the {@code width} field. */
	public int width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public int height() { return nheight(address()); }

	/** Sets the specified value to the {@code x} field. */
	public JAWTRectangle x(int value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public JAWTRectangle y(int value) { ny(address(), value); return this; }
	/** Sets the specified value to the {@code width} field. */
	public JAWTRectangle width(int value) { nwidth(address(), value); return this; }
	/** Sets the specified value to the {@code height} field. */
	public JAWTRectangle height(int value) { nheight(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public JAWTRectangle set(
		int x,
		int y,
		int width,
		int height
	) {
		x(x);
		y(y);
		width(width);
		height(height);

		return this;
	}

	/** Unsafe version of {@link #set(JAWTRectangle) set}. */
	public JAWTRectangle nset(long struct) {
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
	public JAWTRectangle set(JAWTRectangle src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link JAWTRectangle} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static JAWTRectangle malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link JAWTRectangle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static JAWTRectangle calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link JAWTRectangle} instance allocated with {@link BufferUtils}. */
	public static JAWTRectangle create() {
		return new JAWTRectangle(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link JAWTRectangle} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static JAWTRectangle create(long address) {
		return address == NULL ? null : new JAWTRectangle(address, null);
	}

	/**
	 * Returns a new {@link JAWTRectangle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTRectangle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTRectangle.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link JAWTRectangle.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link JAWTRectangle} instance allocated on the thread-local {@link MemoryStack}. */
	public static JAWTRectangle mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link JAWTRectangle} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static JAWTRectangle callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link JAWTRectangle} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWTRectangle mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWTRectangle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static JAWTRectangle callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link JAWTRectangle.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWTRectangle.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link JAWTRectangle.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link JAWTRectangle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #x}. */
	public static int nx(long struct) { return memGetInt(struct + JAWTRectangle.X); }
	/** Unsafe version of {@link #y}. */
	public static int ny(long struct) { return memGetInt(struct + JAWTRectangle.Y); }
	/** Unsafe version of {@link #width}. */
	public static int nwidth(long struct) { return memGetInt(struct + JAWTRectangle.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static int nheight(long struct) { return memGetInt(struct + JAWTRectangle.HEIGHT); }

	/** Unsafe version of {@link #x(int) x}. */
	public static void nx(long struct, int value) { memPutInt(struct + JAWTRectangle.X, value); }
	/** Unsafe version of {@link #y(int) y}. */
	public static void ny(long struct, int value) { memPutInt(struct + JAWTRectangle.Y, value); }
	/** Unsafe version of {@link #width(int) width}. */
	public static void nwidth(long struct, int value) { memPutInt(struct + JAWTRectangle.WIDTH, value); }
	/** Unsafe version of {@link #height(int) height}. */
	public static void nheight(long struct, int value) { memPutInt(struct + JAWTRectangle.HEIGHT, value); }

	// -----------------------------------

	/** An array of {@link JAWTRectangle} structs. */
	public static class Buffer extends StructBuffer<JAWTRectangle, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link JAWTRectangle.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link JAWTRectangle#SIZEOF}, and its mark will be undefined.
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
		protected JAWTRectangle newInstance(long address) {
			return new JAWTRectangle(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public int x() { return JAWTRectangle.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public int y() { return JAWTRectangle.ny(address()); }
		/** Returns the value of the {@code width} field. */
		public int width() { return JAWTRectangle.nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public int height() { return JAWTRectangle.nheight(address()); }

		/** Sets the specified value to the {@code x} field. */
		public JAWTRectangle.Buffer x(int value) { JAWTRectangle.nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public JAWTRectangle.Buffer y(int value) { JAWTRectangle.ny(address(), value); return this; }
		/** Sets the specified value to the {@code width} field. */
		public JAWTRectangle.Buffer width(int value) { JAWTRectangle.nwidth(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public JAWTRectangle.Buffer height(int value) { JAWTRectangle.nheight(address(), value); return this; }

	}

}