/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct YGSize {
    float width;
    float height;
}</code></pre>
 */
public class YGSize extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		WIDTH,
		HEIGHT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		WIDTH = layout.offsetof(0);
		HEIGHT = layout.offsetof(1);
	}

	YGSize(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link YGSize} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public YGSize(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code width} field. */
	public float width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public float height() { return nheight(address()); }

	/** Sets the specified value to the {@code width} field. */
	public YGSize width(float value) { nwidth(address(), value); return this; }
	/** Sets the specified value to the {@code height} field. */
	public YGSize height(float value) { nheight(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public YGSize set(
		float width,
		float height
	) {
		width(width);
		height(height);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public YGSize set(YGSize src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link YGSize} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static YGSize malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link YGSize} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static YGSize calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link YGSize} instance allocated with {@link BufferUtils}. */
	public static YGSize create() {
		return new YGSize(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link YGSize} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static YGSize create(long address) {
		return address == NULL ? null : new YGSize(address, null);
	}

	/**
	 * Returns a new {@link YGSize.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link YGSize.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link YGSize.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link YGSize.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link YGSize} instance allocated on the thread-local {@link MemoryStack}. */
	public static YGSize mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link YGSize} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static YGSize callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link YGSize} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static YGSize mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link YGSize} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static YGSize callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link YGSize.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link YGSize.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link YGSize.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link YGSize.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #width}. */
	public static float nwidth(long struct) { return memGetFloat(struct + YGSize.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static float nheight(long struct) { return memGetFloat(struct + YGSize.HEIGHT); }

	/** Unsafe version of {@link #width(float) width}. */
	public static void nwidth(long struct, float value) { memPutFloat(struct + YGSize.WIDTH, value); }
	/** Unsafe version of {@link #height(float) height}. */
	public static void nheight(long struct, float value) { memPutFloat(struct + YGSize.HEIGHT, value); }

	// -----------------------------------

	/** An array of {@link YGSize} structs. */
	public static class Buffer extends StructBuffer<YGSize, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link YGSize.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link YGSize#SIZEOF}, and its mark will be undefined.
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
		protected YGSize newInstance(long address) {
			return new YGSize(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code width} field. */
		public float width() { return YGSize.nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public float height() { return YGSize.nheight(address()); }

		/** Sets the specified value to the {@code width} field. */
		public YGSize.Buffer width(float value) { YGSize.nwidth(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public YGSize.Buffer height(float value) { YGSize.nheight(address(), value); return this; }

	}

}